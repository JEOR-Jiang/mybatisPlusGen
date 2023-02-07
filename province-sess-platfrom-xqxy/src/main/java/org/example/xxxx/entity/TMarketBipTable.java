package org.example.xxxx.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 市场bip流程表格信息表
 * </p>
 *
 * @author 
 * @since 2023-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_market_bip_table")
public class TMarketBipTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * bip节点唯一id
     */
    @TableField("node_id")
    private String nodeId;

    /**
     * bip审核信息表主键ID
     */
    @TableField("bip_id")
    private Long bipId;

    /**
     * 节点编号
     */
    @TableField("node_code")
    private String nodeCode;

    /**
     * 节点名称
     */
    @TableField("node_name")
    private String nodeName;

    /**
     * 实际处理人
     */
    @TableField("real_deal_user")
    private String realDealUser;

    /**
     * 默认处理人
     */
    @TableField("deal_user")
    private String dealUser;

    /**
     * 流转方式
     */
    @TableField("transfer_mode")
    private String transferMode;

    /**
     * 流向
     */
    @TableField("flow_direction")
    private String flowDirection;

    /**
     * 节点状态
     */
    @TableField("status")
    private String status;

    /**
     * 创建者
     */
    @TableField("create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新者
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 是否删除（0：未删除 1：已删除）
     */
    @TableField("is_delete")
    private Boolean isDelete;


}
