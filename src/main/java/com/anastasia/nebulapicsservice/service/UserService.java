package com.anastasia.nebulapicsservice.service;

import com.anastasia.nebulapicsservice.model.dto.user.UserQueryRequest;
import com.anastasia.nebulapicsservice.model.entity.User;
import com.anastasia.nebulapicsservice.model.vo.LoginUserVO;
import com.anastasia.nebulapicsservice.model.vo.UserVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 82611
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-01-06 17:32:26
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 确认密码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request 请求对象
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取脱敏的已登陆用户信息
     *
     * @param user 脱敏前用户信息
     * @return 脱敏后用户信息
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取已登陆用户信息
     *
     * @param request 请求对象
     * @return 未脱敏的用户信息
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取单个脱敏用户信息
     */
    UserVO getUserVO(User user);

    /**
     * 获取脱敏用户信息列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 将查询请求转为QueryWrapper对象
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 获取加秘密码
     *
     * @param userPassword 明文密码
     * @return
     */
    String getEncryptPassword(String userPassword);

    /**
     * 是否是管理员
     */
    boolean isAdmin(User user);
}
