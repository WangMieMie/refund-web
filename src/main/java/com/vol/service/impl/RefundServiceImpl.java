package com.vol.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vol.beans.PltmRefund;
import com.vol.mapper.RefundMapper;
import com.vol.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Class RefundServiceImpl
 * @Descriptions
 * @Author vol
 * @Date 2017/9/7 14:12
 */
@Service
public class RefundServiceImpl implements RefundService {

    @Autowired
    private RefundMapper refundMapper;

    @Override
    public PageInfo<PltmRefund> queryRefundList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PltmRefund> refunds = refundMapper.selectAll();
        return new PageInfo<PltmRefund>(refunds);
    }

    @Override
    public PageInfo<PltmRefund> queryRefundListByExample(PltmRefund refund, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PltmRefund> refunds = refundMapper.selectByExample(refund);
        return new PageInfo<PltmRefund>(refunds);
    }

    @Override
    public PltmRefund queryRefundByExample(PltmRefund refund) {
        return refundMapper.selectOne(refund);
    }

    @Transactional
    @Override
    public boolean updateRefundById(PltmRefund refund) {
        return refundMapper.updateByPrimaryKey(refund) == 1;
    }
}
