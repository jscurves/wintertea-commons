package com.wintertea.commons.bean;

import com.wintertea.commons.domain.User;
import com.wintertea.commons.domain.UserPO;
import org.junit.Test;


public class BeanHelperTest {

    @Test
    public void copyProperties() throws InstantiationException, IllegalAccessException {
        User user = new User();
        user.setName("li");
        user.setPass("pass");

        UserPO userPO = BeanHelper.copyProperties(user, UserPO.class);
        System.out.println(userPO);

    }
}
