package cheanxin.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by 273cn on 16/12/21.
 * 岗位权限表
 */
@Entity
@Table(indexes = { @Index(name = "idx_post_id_authority", columnList = "postId, authority", unique = true)})
public class PostAuthority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10) UNSIGNED COMMENT '自增id'")
    // 自增id
    private Long id;

    @NotNull
    @Column(columnDefinition = "INT(10) UNSIGNED COMMENT '岗位id'")
    // 岗位id
    private Long postId;

    @NotNull
    @NotEmpty
    @Size(max = 32)
    @Column(columnDefinition = "VARCHAR(32) COMMENT '权限(等同于角色)'")
    // 权限(等同于角色)
    private String authority;

    public PostAuthority() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}