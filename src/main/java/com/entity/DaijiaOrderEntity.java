package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 代驾司机订单
 *
 * @author 
 * @email
 */
@TableName("daijia_order")
public class DaijiaOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DaijiaOrderEntity() {

	}

	public DaijiaOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 订单号
     */
    @TableField(value = "daijia_order_uuid_number")

    private String daijiaOrderUuidNumber;


    /**
     * 代驾司机
     */
    @TableField(value = "daijia_id")

    private Integer daijiaId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 所需里程
     */
    @TableField(value = "buy_licheng")

    private Double buyLicheng;


    /**
     * 实付价格
     */
    @TableField(value = "daijia_order_true_price")

    private Double daijiaOrderTruePrice;


    /**
     * 订单类型
     */
    @TableField(value = "daijia_order_types")

    private Integer daijiaOrderTypes;


    /**
     * 支付类型
     */
    @TableField(value = "daijia_order_payment_types")

    private Integer daijiaOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getDaijiaOrderUuidNumber() {
        return daijiaOrderUuidNumber;
    }
    /**
	 * 获取：订单号
	 */

    public void setDaijiaOrderUuidNumber(String daijiaOrderUuidNumber) {
        this.daijiaOrderUuidNumber = daijiaOrderUuidNumber;
    }
    /**
	 * 设置：代驾司机
	 */
    public Integer getDaijiaId() {
        return daijiaId;
    }
    /**
	 * 获取：代驾司机
	 */

    public void setDaijiaId(Integer daijiaId) {
        this.daijiaId = daijiaId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：所需里程
	 */
    public Double getBuyLicheng() {
        return buyLicheng;
    }
    /**
	 * 获取：所需里程
	 */

    public void setBuyLicheng(Double buyLicheng) {
        this.buyLicheng = buyLicheng;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getDaijiaOrderTruePrice() {
        return daijiaOrderTruePrice;
    }
    /**
	 * 获取：实付价格
	 */

    public void setDaijiaOrderTruePrice(Double daijiaOrderTruePrice) {
        this.daijiaOrderTruePrice = daijiaOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getDaijiaOrderTypes() {
        return daijiaOrderTypes;
    }
    /**
	 * 获取：订单类型
	 */

    public void setDaijiaOrderTypes(Integer daijiaOrderTypes) {
        this.daijiaOrderTypes = daijiaOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getDaijiaOrderPaymentTypes() {
        return daijiaOrderPaymentTypes;
    }
    /**
	 * 获取：支付类型
	 */

    public void setDaijiaOrderPaymentTypes(Integer daijiaOrderPaymentTypes) {
        this.daijiaOrderPaymentTypes = daijiaOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DaijiaOrder{" +
            "id=" + id +
            ", daijiaOrderUuidNumber=" + daijiaOrderUuidNumber +
            ", daijiaId=" + daijiaId +
            ", yonghuId=" + yonghuId +
            ", buyLicheng=" + buyLicheng +
            ", daijiaOrderTruePrice=" + daijiaOrderTruePrice +
            ", daijiaOrderTypes=" + daijiaOrderTypes +
            ", daijiaOrderPaymentTypes=" + daijiaOrderPaymentTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
