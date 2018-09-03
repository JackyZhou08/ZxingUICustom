package com.google.zxing.client.android.jacky;

import com.google.zxing.client.android.camera.FrontLightMode;

public class Setting {

    //支持的条码类型
    public static final boolean IS_SUPPORT_DECODE_1D_PRODUCT = true;//一维码：商品
    public static final boolean IS_SUPPORT_DECODE_1D_INDUSTRIAL = true;//一维码：工业
    public static final boolean IS_SUPPORT_DECODE_QR = true;//二维码
    public static final boolean IS_SUPPORT_DECODE_DATA_MATRIX = true;//Data Matrix
    public static final boolean IS_SUPPORT_DECODE_AZTEC = true;//Aztec
    public static final boolean IS_SUPPORT_DECODE_PDF417 = true;//PDF417 (测试)


    public static final boolean IS_PLAY_BEEP = true;//是否播放声音
    public static final boolean IS_VIBRATE = true;//是否震动
    public static final boolean IS_AUTO_FOCUS = true;//是否自动对焦


    public static String FRONT_LIGHT_MODE = FrontLightMode.OFF.toString();//闪光灯模式

    public static final boolean IS_DISABLE_CONTINUOUS_FOCUS = true;//是否开启持续对焦，这个模式部分机型不支持



}
