package com.wsw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wsw
 * @since 2023-04-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("User")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {


    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String name;

    private String username;

    private String password;

    private String email;

    @TableField("is_online")
    private Boolean isOnline;

    @TableField("addr_phone")
    private String addrPhone;

    @TableField("addr_name")
    private String addrName;

    @TableField("addr_address1")
    private String addrAddress1;

    @TableField("addr_address2")
    private String addrAddress2;

    @TableField("addr_city")
    private String addrCity;

    @TableField("addr_country")
    private String addrCountry;

    @TableField("addr_postal_code")
    private String addrPostalCode;

    @TableField("addr_note")
    private String addrNote;


}
