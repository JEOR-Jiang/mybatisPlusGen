package org.example.xxxx.entity;

import java.math.BigDecimal;
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
 * 市场管理项目信息表
 * </p>
 *
 * @author 
 * @since 2023-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_market_project")
public class TMarketProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 项目编号
     */
    @TableField("project_code")
    private String projectCode;

    /**
     * 项目名称
     */
    @TableField("project_name")
    private String projectName;

    /**
     * 主要业态[住宅、商业、产业园区、城市文化、城市基础设施、学校、医疗、其他类型物业]
     */
    @TableField("business_type")
    private String businessType;

    /**
     * 服务模式(服务类型)[全委、酬金全委、酬金、专项、顾问]
     */
    @TableField("service_mode")
    private String serviceMode;

    /**
     * 公开招投标:0:否; 1:是;
     */
    @TableField("open_bidding")
    private Integer openBidding;

    /**
     * 新签/续签:0:新签; 1:续签;
     */
    @TableField("new_renewed")
    private Boolean newRenewed;

    /**
     * 项目类型(1:增量; 2:存量;) 
     */
    @TableField("increment_stock")
    private Integer incrementStock;

    /**
     * 所属战区
     */
    @TableField("big_area_code")
    private Long bigAreaCode;

    /**
     * 主跟进单位
     */
    @TableField("region_area_code")
    private Long regionAreaCode;

    /**
     * 状态(1:正常,2:搁置,3:废弃)
     */
    @TableField("status")
    private String status;

    /**
     * 项目阶段(1信息收集；2项目评审；3合同终审；4签约；5完成)
     */
    @TableField("project_phase")
    private Boolean projectPhase;

    /**
     * 修改项目状态原因
     */
    @TableField("reason")
    private String reason;

    /**
     * 是否为案场项目
     */
    @TableField("case_pro")
    private Boolean casePro;

    /**
     * 是否业委会项目(1-是，0-否)
     */
    @TableField("industry_committee")
    private Boolean industryCommittee;

    @TableField("create_by")
    private String createBy;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_by")
    private String updateBy;

    @TableField("update_time")
    private Date updateTime;

    /**
     * 是否删除（0：未删除 1：已删除）
     */
    @TableField("is_delete")
    private Boolean isDelete;

    /**
     * 流程引擎实例id
     */
    @TableField("process_instance_id")
    private String processInstanceId;

    /**
     * 流程引擎任务id
     */
    @TableField("process_task_id")
    private String processTaskId;

    /**
     * 流程引擎节点id
     */
    @TableField("process_node_id")
    private String processNodeId;

    /**
     * 属性分类(1公建，2商写)
     */
    @TableField("dwelling_sub_attribute")
    private Boolean dwellingSubAttribute;

    /**
     * 续签的原项目
     */
    @TableField("original_project_id")
    private Long originalProjectId;

    /**
     * 项目组ID
     */
    @TableField("group_id")
    private Long groupId;

    /**
     * 项目得分
     */
    @TableField("score")
    private BigDecimal score;

    /**
     * 评分结果(0-未获得资格,1-获得资格)
     */
    @TableField("scoring")
    private Boolean scoring;

    /**
     * 递减分值
     */
    @TableField("reduce")
    private BigDecimal reduce;

    /**
     * 逾期未处理扣分值
     */
    @TableField("be_overdue")
    private BigDecimal beOverdue;

    /**
     * 逾期待办提醒(1-30天、2-90天)
     */
    @TableField("be_overdue_todo")
    private Boolean beOverdueTodo;

    /**
     * 处理时间
     */
    @TableField("handle_date")
    private Date handleDate;

    /**
     * 收费模式（1包干，2酬金）
     */
    @TableField("charge_type")
    private Integer chargeType;

    /**
     * 是否有资格在待办中显示(0：否 1：是)
     */
    @TableField("has_quas_show")
    private Integer hasQuasShow;


}
