package cheanxin.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * Created by 273cn on 16/12/30.
 */
@Entity
@Table(indexes = {@Index(name = "idx_product_id", columnList = "productId")})
public class Loan {
    @Id
    @Null
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    // 自增id
    private Long id;

    // 产品id，如果为空表示为该贷款为意向贷款
    private Long productId;

    @Size(max = 50)
    // 产品名称
    private String productName;

    @Min(1)
    @Max(16)
    // 产品类型
    private Integer productType;

    @Min(1)
    @Max(10)
    // 贷款比率
    private Integer loanRate;

    @Min(1)
    @Max(360)
    // 贷款期数
    private Integer loadTerms;

    @Digits(integer = 2, fraction = 4)
    // 贷款月利率
    private Float loanMonthlyInterestRate;

    @Size(max = 1000)
    // 申请图片列表
    private String applicationPicUrl;

    @Size(max = 200)
    // 备注
    private String remark;

    // 贷款来源id
    private Long extSourceId;

    // 贷款申请人id
    private Long extApplicantId;

    // 贷款共同申请人id
    private Long extCoApplicantId;

    // 贷款担保人id
    private Long extGuarantorId;

    // 贷款车辆id
    private Long extVehicleId;

    @NotNull
    @Min(0)
    @Max(32)
    // 贷款状态
    private Integer status;

    // 贷款创建时间
    private Long createdTime;

    public Loan() {}

    public Loan(Long productId, String productName, Integer productType, Integer loanRate, Integer loadTerms, Float loanMonthlyInterestRate, String applicationPicUrl, String remark, Long extSourceId, Long extApplicantId, Long extCoApplicantId, Long extGuarantorId, Long extVehicleId, Integer status, Long createdTime) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.loanRate = loanRate;
        this.loadTerms = loadTerms;
        this.loanMonthlyInterestRate = loanMonthlyInterestRate;
        this.applicationPicUrl = applicationPicUrl;
        this.remark = remark;
        this.extSourceId = extSourceId;
        this.extApplicantId = extApplicantId;
        this.extCoApplicantId = extCoApplicantId;
        this.extGuarantorId = extGuarantorId;
        this.extVehicleId = extVehicleId;
        this.status = status;
        this.createdTime = createdTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(Integer loanRate) {
        this.loanRate = loanRate;
    }

    public Integer getLoadTerms() {
        return loadTerms;
    }

    public void setLoadTerms(Integer loadTerms) {
        this.loadTerms = loadTerms;
    }

    public Float getLoanMonthlyInterestRate() {
        return loanMonthlyInterestRate;
    }

    public void setLoanMonthlyInterestRate(Float loanMonthlyInterestRate) {
        this.loanMonthlyInterestRate = loanMonthlyInterestRate;
    }

    public String getApplicationPicUrl() {
        return applicationPicUrl;
    }

    public void setApplicationPicUrl(String applicationPicUrl) {
        this.applicationPicUrl = applicationPicUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getExtSourceId() {
        return extSourceId;
    }

    public void setExtSourceId(Long extSourceId) {
        this.extSourceId = extSourceId;
    }

    public Long getExtApplicantId() {
        return extApplicantId;
    }

    public void setExtApplicantId(Long extApplicantId) {
        this.extApplicantId = extApplicantId;
    }

    public Long getExtCoApplicantId() {
        return extCoApplicantId;
    }

    public void setExtCoApplicantId(Long extCoApplicantId) {
        this.extCoApplicantId = extCoApplicantId;
    }

    public Long getExtGuarantorId() {
        return extGuarantorId;
    }

    public void setExtGuarantorId(Long extGuarantorId) {
        this.extGuarantorId = extGuarantorId;
    }

    public Long getExtVehicleId() {
        return extVehicleId;
    }

    public void setExtVehicleId(Long extVehicleId) {
        this.extVehicleId = extVehicleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }
}