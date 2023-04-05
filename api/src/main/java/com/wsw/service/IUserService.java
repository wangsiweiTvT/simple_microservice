package com.wsw.service;

import com.wsw.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wsw
 * @since 2023-04-05
 */
public interface IUserService extends IService<User> {
    User getOne(String name);
}
