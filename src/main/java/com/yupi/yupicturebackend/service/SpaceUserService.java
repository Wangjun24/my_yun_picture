package com.yupi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.yupicturebackend.model.dot.spaceuser.SpaceUserAddRequest;
import com.yupi.yupicturebackend.model.dot.spaceuser.SpaceUserQueryRequest;
import com.yupi.yupicturebackend.model.entity.SpaceUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicturebackend.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author wj
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-09-16 19:30:08
*/
public interface SpaceUserService extends IService<SpaceUser> {

    /** 添加空间成员
     * @param spaceUserAddRequest
     * @return
     * */
    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    void validSpaceUser(SpaceUser spaceUser, boolean add);

    /**
     * 将查询请求对象转化为mybatis-plus的查询封装对象
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

    /**
     * 查询单个封装类
     * @param spaceUser
     * @param request
     * @return
     */
    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    /**
     * 查询封装类列表
     * @param spaceUserList
     * @return
     */
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
}
