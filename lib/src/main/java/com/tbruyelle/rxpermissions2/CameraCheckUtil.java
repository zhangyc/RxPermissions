package com.tbruyelle.rxpermissions2;

import android.hardware.Camera;

/**
 * Created by zhangyc on 2018/6/5.
 * 针对6.0以下某些定制rom需要动态授权引发的异常处理
 */

public class CameraCheckUtil {

    public static boolean isHas(){
        try {
                Camera camera = Camera.open(0);
                camera.getParameters();
                camera.release();
                camera=null;
                return true;
        }catch (Exception e){
                return false;
        }

    }
}



