package com.qiniu.pili.droid.streaming.demo.plain;

import com.qiniu.pili.droid.streaming.AVCodecType;
import com.qiniu.pili.droid.streaming.StreamingProfile;
import com.qiniu.pili.droid.streaming.WatermarkSetting;

import java.io.Serializable;

public class EncodingConfig implements Serializable {
    /**
     * 视频编码
     * 音频软解码
     * AVCodecType.SW_AUDIO_CODEC
     * 音频硬解码
     * AVCodecType.HW_AUDIO_CODEC
     * 视频软解码
     * AVCodecType.SW_VIDEO_WITH_SW_AUDIO_CODEC
     * 硬解码
     * AVCodecType.HW_VIDEO_SURFACE_AS_INPUT_WITH_HW_AUDIO_CODEC
     * 硬解HW-YUV
     * AVCodecType.HW_VIDEO_YUV_AS_INPUT_WITH_HW_AUDIO_CODEC
     */
    public AVCodecType mCodecType;
    /**
     * 是否只有音频流
     */
    public boolean mIsAudioOnly;
    /**
     * 视频质量配置预设
     * fps：30 Bitrate:1000KB
     */
    public boolean mIsVideoQualityPreset;
    /**
     * 视频质量预设
     * VIDEO_QUALITY_LOW1,//低
     * VIDEO_QUALITY_LOW2,
     * VIDEO_QUALITY_LOW3,
     * VIDEO_QUALITY_MEDIUM1,//中
     * VIDEO_QUALITY_MEDIUM2,
     * VIDEO_QUALITY_MEDIUM3,
     * VIDEO_QUALITY_HIGH1,//高
     * VIDEO_QUALITY_HIGH2,
     * VIDEO_QUALITY_HIGH3
     */
    public int mVideoQualityPreset;
    /**
     * 视频质量配置-自定义输入FPS值
     */
    public int mVideoQualityCustomFPS;
    /**
     * 视频质量配置-自定义输入Bitrate值
     */
    public int mVideoQualityCustomBitrate;
    /**
     * 视频质量自定义最大键帧间隔值
     */
    public int mVideoQualityCustomMaxKeyFrameInterval;
    /**
     * 视频尺寸大小是否预设
     */
    public boolean mIsVideoSizePreset;
    /**
     * 视频尺寸大小：640*480值域
     * 0.320*240 4:3  424*240 16:9
     * 1.640*480      848*480
     * 2.720*544      960*544
     * 3.960*720      1280*720
     * 4.1440*1080    1920*1080
     */
    public int mVideoSizePreset;
    /**
     * 自定义尺寸宽度
     */
    public int mVideoSizeCustomWidth;
    /**
     * 自定义尺寸高度
     */
    public int mVideoSizeCustomHeight;
    /**
     * true竖屏 false横屏
     */
    public boolean mVideoOrientationPortrait;
    /**
     * true质量优先 false比特率优先
     */
    public boolean mVideoRateControlQuality;
    /**
     * 视频码率
     * StreamingProfile.BitrateAdjustMode.Auto 超清
     * StreamingProfile.BitrateAdjustMode.Manual 高清
     * StreamingProfile.BitrateAdjustMode.Disable 标清
     */
    public StreamingProfile.BitrateAdjustMode mBitrateAdjustMode;
    /**
     * 自适应比特率最小值
     */
    public int mAdaptiveBitrateMin = -1;
    /**
     * 自适应比特率最大值
     */
    public int mAdaptiveBitrateMax = -1;
    /**
     * 是否开启fps控制器
     */
    public boolean mVideoFPSControl;
    /**
     * 是否显示LOGO
     */
    public boolean mIsWatermarkEnabled;
    /**
     * LOGO透明度 0 -100
     */
    public int mWatermarkAlpha;
    /**
     * LOGO大小
     * WatermarkSetting.WATERMARK_SIZE.SMALL,小
     * WatermarkSetting.WATERMARK_SIZE.MEDIUM,中
     * WatermarkSetting.WATERMARK_SIZE.LARGE,大
     */
    public WatermarkSetting.WATERMARK_SIZE mWatermarkSize;
    /**
     * 是否预设LOGO位置
     * WatermarkSetting.WATERMARK_LOCATION.NORTH_WEST,
     * WatermarkSetting.WATERMARK_LOCATION.NORTH_EAST,
     * WatermarkSetting.WATERMARK_LOCATION.SOUTH_EAST,
     * WatermarkSetting.WATERMARK_LOCATION.SOUTH_WEST
     */
    public boolean mIsWatermarkLocationPreset;
    /**
     * 是否自定义LOGO位置
     */
    public WatermarkSetting.WATERMARK_LOCATION mWatermarkLocationPreset;
    /**
     * 自定义LOGO 横坐标 0.0f - 1.0f
     */
    public float mWatermarkLocationCustomX;
    /**
     * 自定义LOGO 纵坐标 0.0f - 1.0f
     */
    public float mWatermarkLocationCustomY;
    /**
     * 是否开启照片流
     */
    public boolean mIsPictureStreamingEnabled;
    /**
     * 插入流照片路径
     */
    public String mPictureStreamingFilePath;
    /**
     * 音频质量配置true预设
     */
    public boolean mIsAudioQualityPreset;
    /**
     * 音频质量配置预设值
     * AUDIO_QUALITY_LOW1,
     * AUDIO_QUALITY_LOW2,
     * AUDIO_QUALITY_MEDIUM1,
     * AUDIO_QUALITY_MEDIUM2,
     * AUDIO_QUALITY_HIGH1,
     * AUDIO_QUALITY_HIGH2
     */
    public int mAudioQualityPreset;
    /**
     * 音频质量配置自定义 44100 Hz
     */
    public int mAudioQualityCustomSampleRate;
    /**
     * 音频质量配置自定义 Bitrate 100Kbs
     */
    public int mAudioQualityCustomBitrate;
}
