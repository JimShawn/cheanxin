package cheanxin.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

/**
 * Created by 273cn on 16/12/30.
 * 担保人
 */
@Entity
public class LoanGuarantor {
    @Id
    @Null
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    // 自增id
    private Long id;

    @Size(max = 500)
    // 收入证明图片
    private String incomeFileIds;

    @Size(max = 200)
    // 房产图片
    private String estateFileIds;

    @Size(max = 500)
    // 其他图片
    private String otherFileIds;

    public LoanGuarantor() {}

    public LoanGuarantor(String incomeFileIds, String estateFileIds, String otherFileIds) {
        this.incomeFileIds = incomeFileIds;
        this.estateFileIds = estateFileIds;
        this.otherFileIds = otherFileIds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncomeFileIds() {
        return incomeFileIds;
    }

    public void setIncomeFileIds(String incomeFileIds) {
        this.incomeFileIds = incomeFileIds;
    }

    public String getEstateFileIds() {
        return estateFileIds;
    }

    public void setEstateFileIds(String estateFileIds) {
        this.estateFileIds = estateFileIds;
    }

    public String getOtherFileIds() {
        return otherFileIds;
    }

    public void setOtherFileIds(String otherFileIds) {
        this.otherFileIds = otherFileIds;
    }
}