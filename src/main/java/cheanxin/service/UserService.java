package cheanxin.service;

import cheanxin.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Service;
import cheanxin.data.UserRepository;
import cheanxin.global.Constants;

/**
 * Created by 273cn on 16/12/21.
 */
public interface UserService {
    User findUserByUsername(String username);

    User findUserByMobileNumber(String mobileNumber);

    User save(User user);

    Page<User> getUsers(int page, int size);

    boolean isUsernameExists(String username);

    boolean isMobileNoExists(String mobileNo);
}
