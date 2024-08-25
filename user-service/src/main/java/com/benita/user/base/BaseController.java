package com.benita.user.base;

import com.benita.user.UserServiceApplication;
import com.benita.user.entity.User;
import com.benita.user.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class BaseController {

    @Autowired
    private UserRepository userRepository;

    public User getUserNameByHeader(HttpServletRequest request) {
        log.info("Executing getUserNameByHeader()");
        User user = null;
        try {
            String token = request.getHeader("Authorization");
            if (token == null) {
                return null;
            }
            user = UserServiceApplication.userTokenMap.get(token);
        } catch (Exception e) {
            log.error("Exception while executing getUserNameByHeader() : ", e);
        }
        return user;
    }
}
