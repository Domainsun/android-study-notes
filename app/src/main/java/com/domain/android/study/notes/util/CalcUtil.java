package com.domain.android.study.notes.util;


import java.math.BigDecimal;

/**
 * Description:
 * Data：2018/11/7-15:08
 * Author: domain
 */

public class CalcUtil {

    /**
     * BigDecimal 进行加法计算
     *
     * @param value1 第一个值
     * @param value2 第二个值
     * @return
     */
    public static double add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1)); //String 构造方法是完全可预知的,double不可预知，解决失真。
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.add(b2).doubleValue();
    }


    /**
     * BigDecimal 进行减法法计算
     *
     * @param value1 第一个值
     * @param value2 第二个值
     * @return 结果保留两位小数
     */
    public static double sub(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1)); //String 构造方法是完全可预知的,double不可预知，解决失真。
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.subtract(b2).setScale(2,BigDecimal.ROUND_DOWN).doubleValue();
    }

    /**
     * BigDecimal 进行乘法计算
     *
     * @param d1 第一个值
     * @param d2 第二个值
     * @return
     */
    public static double mul(double d1, double d2) {
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.multiply(bd2).doubleValue();
    }
}
