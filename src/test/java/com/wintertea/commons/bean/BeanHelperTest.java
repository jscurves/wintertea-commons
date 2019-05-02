package com.wintertea.commons.bean;

import com.wintertea.commons.domain.User;
import com.wintertea.commons.domain.UserPO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class BeanHelperTest {

    @Test
    public void copyProperties() throws InstantiationException, IllegalAccessException {
        User user = new User();
        user.setName("li");
        user.setPass("pass");

        UserPO userPO = BeanHelper.copyProperties(user, UserPO.class);
        System.out.println(userPO);

    }

    @Test
    public void toPageInfo() throws IllegalAccessException, InstantiationException {
        List<User> users = new ArrayList<>(3);
        for (int index=0; index < 3; index++) {
            User user = new User();
            user.setName("li_" + index);
            user.setPass("pass_" + index);
            users.add(user);
        }

        List<UserPO> userPOS = BeanHelper.copyProperties(users, UserPO.class);
        System.out.println(userPOS);


        System.out.println(BeanHelper.toPageInfo(users, UserPO.class));
    }
}
