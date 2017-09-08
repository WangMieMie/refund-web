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
    private String refundid;
    private String tid;
    private String oid;
    @Column(name = "refund_status")
    private String refundStatus;
    @Column(name = "refund_reason")
    private String refundreason;
    private float refundFee;
    @Column(name = "is_returngoods")
    private int isReturnGoods;
    @Column(name = "refund_date")
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

    public String getRefundid() {
        return refundid;
    }

    public void setRefundid(String refundid) {
        this.refundid = refundid;
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

    public String getRefundreason() {
        return refundreason;
    }

    public void setRefundreason(String refundreason) {
        this.refundreason = refundreason;
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
