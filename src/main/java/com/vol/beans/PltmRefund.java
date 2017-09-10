package com.vol.beans;

import javax.persistence.*;

/**
 * @Class PltmRefund
 * @Descriptions 退款实体类
 * @Author vol
 * @Date 2017/9/7 10:50
 */
@Table(name = "pltm_refund")
public class PltmRefund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pltmcode;
    private String shopcode;
    private String refundId;
    private String tid;
    private String oid;
    private String refundStatus;
    private String refundReason;
    private float refundFee;
    private int isReturnGoods;
    private String refundDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPltmcode() {
        return pltmcode;
    }

    public void setPltmcode(String pltmcode) {
        this.pltmcode = pltmcode;
    }

    public String getShopcode() {
        return shopcode;
    }

    public void setShopcode(String shopcode) {
        this.shopcode = shopcode;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public float getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(float refundFee) {
        this.refundFee = refundFee;
    }

    public int getIsReturnGoods() {
        return isReturnGoods;
    }

    public void setIsReturnGoods(int isReturnGoods) {
        this.isReturnGoods = isReturnGoods;
    }

    public String getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(String refundDate) {
        this.refundDate = refundDate;
    }
}
