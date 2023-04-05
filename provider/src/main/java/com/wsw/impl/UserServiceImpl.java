package com.wsw.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wsw.entity.User;
import com.wsw.mapper.UserMapper;
import com.wsw.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wsw
 * @since 2023-04-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User getOne(String name) {
        return baseMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getName,name));
    }
}
