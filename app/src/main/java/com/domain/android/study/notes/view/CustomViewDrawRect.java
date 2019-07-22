package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class CustomViewDrawRect extends View {


    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    /**
     * 行数
     */
    private int row = 12;

    /**
     * 列数
     */
    private int col = 12;

    /**
     * 矩形大小
     */
    private int rectWidth = 50;

    public CustomViewDrawRect(Context context) {
        super(context);
    }

    public CustomViewDrawRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewDrawRect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //画行的 矩形
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {


//                Rect r =new Rect(0,0,100,100);
//                Rect r =new Rect(100,0,200,100);


//                Rect r =new Rect(0,100,100,200);
//                Rect r =new Rect(100,100,200,200);

//                Rect r =new Rect(0,200,100,300);
//                Rect r =new Rect(100,200,200,300);

//                i=2 j=0
                Rect r = new Rect(j * rectWidth, i * rectWidth, (j + 1) * rectWidth, (i + 1) * rectWidth);

                //偶数画黑色矩形，奇数话白色矩形
                if ((j+i) % 2 == 0) {
                    paint.setColor(Color.BLACK);
                } else {
                    paint.setColor(Color.WHITE);
                }

//                paint.setColor(Color.parseColor(getRandColorCode()));
                canvas.drawRect(r, paint);

            }
        }


    }

    /**
     * 获取十六进制的颜色代码.例如  "#6E36B4" , For HTML ,
     * @return String
     */
    public static String getRandColorCode(){
        String r,g,b;
        Random random = new Random();
        r = Integer.toHexString(random.nextInt(256)).toUpperCase();
        g = Integer.toHexString(random.nextInt(256)).toUpperCase();
        b = Integer.toHexString(random.nextInt(256)).toUpperCase();

        r = r.length()==1 ? "0" + r : r ;
        g = g.length()==1 ? "0" + g : g ;
        b = b.length()==1 ? "0" + b : b ;

        return "#"+r+g+b;
    }
}
