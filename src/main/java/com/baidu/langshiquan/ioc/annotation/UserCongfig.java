package com.baidu.langshiquan.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/27.
 */
@Component
@Configuration
public class UserCongfig {

    @Bean
    public User oneXUser() {
        User user = new User();
        user.setId(3l);
        user.setName("one");
        return user;
    }

    @Bean
    public User twoXUser() {
        User user = new User();
        user.setId(4l);
        user.setName("two");
        return user;
    }

}
