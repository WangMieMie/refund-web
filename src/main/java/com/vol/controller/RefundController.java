package com.vol.controller;

import com.vol.beans.PltmRefund;
import com.vol.service.RefundService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Class RefundController
 * @Descriptions 退款操作
 * @Author vol
 * @Date 2017/9/7 14:45
 */
@Controller
@RequestMapping("refund")
public class RefundController {

    private static final Logger logger = LogManager.getLogger(RestController.class);

    @Autowired
    private RefundService refundService;

    @RequestMapping(value = "/allRefund", method = RequestMethod.GET)
    public String queryRefundList(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize, Model model) {
        model.addAttribute("refundlist", refundService.queryRefundList(page, pageSize));
        return "refund/list";
    }

    @RequestMapping(value = "/refundListByExample", method = RequestMethod.GET)
    public String queryRefundListByExample(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize, @RequestBody PltmRefund refund, Model model) {
        model.addAttribute("refundlist", refundService.queryRefundListByExample(refund, page, pageSize));
        return "refund/list";
    }

    @RequestMapping(value = "/updateRefundStatus", method = RequestMethod.POST)
    public String updateRefundStatus(@ModelAttribute("refund") PltmRefund refund, Model model) {
        boolean b = refundService.updateRefundById(refund);
        if (b) {
            model.addAttribute("info", "操作成功!");
        }
        model.addAttribute("info", "操作失败！");
        return "refund/list";
    }
}
