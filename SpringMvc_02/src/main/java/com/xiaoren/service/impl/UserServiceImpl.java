package com.xiaoren.service.impl;

import com.xiaoren.dao.UserDao;
import com.xiaoren.domain.User;
import com.xiaoren.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void save(User user) {
        System.out.println("user service do ....");
    }
}
