package cheanxin.enums;

import cheanxin.domain.Product;
import cheanxin.domain.User;
import cheanxin.exceptions.UnauthorizedException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;


/**
 * Created by 273cn on 17/1/3.
 */
public enum ProductStatusTransfer {
    PENDING_REVIEW_TO_ACCEPTED(1, ProductStatus.PENDING_REVIEW, ProductStatus.ACCEPTED, new SimpleGrantedAuthority(Authority.ROLE_PENDING_REVIEW_TO_ACCEPTED.name())),
    PENDING_REVIEW_TO_REJECTED(2, ProductStatus.PENDING_REVIEW, ProductStatus.REJECTED, new SimpleGrantedAuthority(Authority.ROLE_PENDING_REVIEW_TO_REJECTED.name()));

    private final int value;
    private final ProductStatus fromStatus;
    private final ProductStatus toStatus;
    private final GrantedAuthority authority;

    ProductStatusTransfer(int value, ProductStatus fromStatus, ProductStatus toStatus, GrantedAuthority authority) {
        this.value = value;
        this.fromStatus = fromStatus;
        this.toStatus = toStatus;
        this.authority = authority;
    }

    public int getValue() {
        return value;
    }

    public static ProductStatusTransfer valueOf(int fromStatus, int toStatus) {
        for (ProductStatusTransfer productStatusTransfer : ProductStatusTransfer.values()) {
            if (productStatusTransfer.fromStatus.value() == fromStatus && productStatusTransfer.toStatus.value() == toStatus)
                return productStatusTransfer;
        }
        return null;
    }

    public static void checkAuthority(User user, int fromStatus, int toStatus) throws UnauthorizedException {
        ProductStatusTransfer productStatusTransfer = ProductStatusTransfer.valueOf(fromStatus, toStatus);
        if (productStatusTransfer == null)
            throw new UnauthorizedException("Unauthorized.");
        GrantedAuthority neededAuthority = productStatusTransfer.authority;
        Collection<? extends GrantedAuthority> userAuthorities = user.getAuthorities();
        if (userAuthorities == null || !userAuthorities.contains(neededAuthority))
            throw new UnauthorizedException("Unauthorized.");

    }
}
