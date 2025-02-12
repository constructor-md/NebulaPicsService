package com.anastasia.nebulapicsservice.service;

import com.anastasia.nebulapicsservice.model.dto.picture.PictureQueryRequest;
import com.anastasia.nebulapicsservice.model.dto.picture.PictureReviewRequest;
import com.anastasia.nebulapicsservice.model.dto.picture.PictureUploadByBatchRequest;
import com.anastasia.nebulapicsservice.model.dto.picture.PictureUploadRequest;
import com.anastasia.nebulapicsservice.model.entity.Picture;
import com.anastasia.nebulapicsservice.model.entity.User;
import com.anastasia.nebulapicsservice.model.vo.PictureVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 82611
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2025-01-10 15:58:54
 */
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param inputSource          图片文件或URL
     * @param pictureUploadRequest 上传请求信息
     * @param loginUser            当前登录用户
     * @return 图片信息
     */
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    /**
     * 分页查询SQL构造
     *
     * @param pictureQueryRequest 用户传参
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 获取单个Picture封装对象
     *
     * @param picture
     * @return
     */
    PictureVO getPictureVo(Picture picture);

    /**
     * 分页获取Picture封装对象
     *
     * @param picturePage
     * @param request
     * @return
     */
    Page<PictureVO> getPictureVoPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 图片数据校验
     *
     * @param picture 图片数据
     */
    void validPicture(Picture picture);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 填充审核参数
     *
     * @param picture
     * @param loginUser
     */
    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return
     */
    Integer uploadPictureByBatch(PictureUploadByBatchRequest pictureUploadByBatchRequest, User loginUser);

    void clearPictureFile(Picture oldPicture);
}
