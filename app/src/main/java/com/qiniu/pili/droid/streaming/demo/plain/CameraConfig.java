package com.qiniu.pili.droid.streaming.demo.plain;

import com.qiniu.pili.droid.streaming.CameraStreamingSetting;

import java.io.Serializable;

public class CameraConfig implements Serializable {
    /**
     * 摄像头初始化true 前置 false 后置
     */
    public boolean mFrontFacing;
    /**
     * 预览初始化大小
     * CameraStreamingSetting.PREVIEW_SIZE_LEVEL.SMALL,
     * CameraStreamingSetting.PREVIEW_SIZE_LEVEL.MEDIUM,
     * CameraStreamingSetting.PREVIEW_SIZE_LEVEL.LARGE
     */
    public CameraStreamingSetting.PREVIEW_SIZE_LEVEL mSizeLevel;
    /**
     * 预览比例
     * CameraStreamingSetting.PREVIEW_SIZE_RATIO.RATIO_4_3,
     * CameraStreamingSetting.PREVIEW_SIZE_RATIO.RATIO_16_9
     */
    public CameraStreamingSetting.PREVIEW_SIZE_RATIO mSizeRatio;
    /**
     * 对焦模式
     * Camera.Parameters.FOCUS_MODE_AUTO,
     * Camera.Parameters.FOCUS_MODE_CONTINUOUS_PICTURE,
     * Camera.Parameters.FOCUS_MODE_CONTINUOUS_VIDEO
     */
    public String mFocusMode;
    /**
     * 是否美颜
     */
    public boolean mIsFaceBeautyEnabled;
    /**
     * 是否常规高亮美颜
     */
    public boolean mIsCustomFaceBeauty = false;
    /**
     * 自动对焦
     */
    public boolean mContinuousAutoFocus;
    /**
     * 预览镜像
     */
    public boolean mPreviewMirror;
    /**
     * 推流镜像
     */
    public boolean mEncodingMirror;
}
