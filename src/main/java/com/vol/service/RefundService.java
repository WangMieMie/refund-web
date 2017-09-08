package com.vol.service;

import com.github.pagehelper.PageInfo;
import com.vol.beans.PltmRefund;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

/**
 * @Class RefundService
 * @Descriptions
 * @Author vol
 * @Date 2017/9/7 14:07
 */
public interface RefundService {

    /**
     * 分页查询退款列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<PltmRefund> queryRefundList(int pageNum, int pageSize);

    /**
     * 根据条件查询退款单列表
     *
     * @param refund
     * @return
     */
    PageInfo<PltmRefund> queryRefundListByExample(PltmRefund refund, int pageNum, int pageSize);

    /**
     * 根据条件查询退款单
     *
     * @param refund
     * @return
     */
    PltmRefund queryRefundByExample(PltmRefund refund);

    /**
     * 修改退款单信息
     *
     * @param id
     * @return
     */
    boolean updateRefundById(PltmRefund refund);
}
