package cheanxin.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * Created by 273cn on 16/12/30.
 * 贷款操作日志
 */
@Entity
@Table(indexes = {@Index(name = "idx_loan_id", columnList = "loanId"), @Index(name = "idx_operator_uid", columnList = "operatorUid")})
public class LoanLog {
    @Id
    @Null
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    // 自增id
    private Long id;

    @NotNull
    // 贷款id
    private Long loanId;

    @NotNull
    // 操作人uid
    private Long operatorUid;

    @NotNull
    @Min(0)
    @Max(16)
    // 操作类型
    private Integer operatorType;

    @Size(max = 200)
    // 备注
    private String remark;

    // 创建时间
    private Long createdTime;

    public LoanLog() {}

    public LoanLog(Long loanId, Long operatorUid, Integer operatorType, String remark, Long createdTime) {
        this.loanId = loanId;
        this.operatorUid = operatorUid;
        this.operatorType = operatorType;
        this.remark = remark;
        this.createdTime = createdTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Long getOperatorUid() {
        return operatorUid;
    }

    public void setOperatorUid(Long operatorUid) {
        this.operatorUid = operatorUid;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }
}