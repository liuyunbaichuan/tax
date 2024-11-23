package org.example.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("btax")
public class Btax {      ///经营税收

    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField(value = "create_time")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;   //
    @TableField(value = "enterprise_num")
    private String enterpriseNum;                    //用户账号
    @TableField(value = "enterprise_name")
    private String enterpriseName;
    @TableField(value = "tax_type")
    private String taxType;       //税种
    @TableField(value = "tax_amount")
    private double taxAmount;    //税收金额
    @TableField(value = "nottax_amount")
    private double nottaxAmount;       //非税收金额
    @TableField(value = "reg_time")
    private LocalDateTime regTime;    //支付说明
    private Integer sfsh;            //审核
    private String shhf;        //审核回复
       //审核人
    private Integer userid;
     //审核人
    private String username;
}
