package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint mPaint1 = new Paint();
    private Paint mPaint2 = new Paint();
    private Paint mPaint3 = new Paint();
    private Paint mPaint4 = new Paint();
    {
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint1.setAntiAlias(true);

        mPaint2.setStyle(Paint.Style.STROKE);
        mPaint1.setAntiAlias(true);

        mPaint3.setStyle(Paint.Style.FILL);
        mPaint3.setColor(Color.BLUE);
        mPaint1.setAntiAlias(true);

        mPaint4.setStyle(Paint.Style.STROKE);
        mPaint4.setStrokeWidth(20);
        mPaint1.setAntiAlias(true);
    }

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        canvas.drawCircle(200,110,100,mPaint1);
        canvas.drawCircle(500,110,100,mPaint2);
        canvas.drawCircle(200,330,100,mPaint3);
        canvas.drawCircle(500,330,100,mPaint4);
    }
}
