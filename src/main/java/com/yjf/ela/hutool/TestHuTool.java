package com.yjf.ela.hutool;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Title: TestHuTool
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/23 18:06
 */
public class TestHuTool {
    public static void main1(String[] args) {
        //当前时间
        Date date = DateUtil.date();
        System.out.println(date);
//当前时间
        Date date2 = DateUtil.date(Calendar.getInstance());
        System.out.println(date2);
//当前时间
        Date date3 = DateUtil.date(System.currentTimeMillis());
        System.out.println(date3);
//当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
        System.out.println(now);
//当前日期字符串，格式：yyyy-MM-dd
        String today= DateUtil.today();
        System.out.println(today);
    }

    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
// 设置前景色，既二维码颜色（青色）
        config.setForeColor(Color.CYAN.getRGB());
// 设置背景色（灰色）
        config.setBackColor(Color.GRAY.getRGB());

// 生成二维码到文件，也可以到流
        QrCodeUtil.generate("http://hutool.cn/", config, FileUtil.file("e:/qrcode.jpg"));
    }
}
