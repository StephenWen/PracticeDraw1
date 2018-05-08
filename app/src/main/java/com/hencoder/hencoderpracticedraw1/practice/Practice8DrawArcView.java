package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint;
    private Paint mPaint1;
    private RectF mRectF;
    {
        mPaint = new Paint();
        mRectF = new RectF(200,200,500,400);

        mPaint1 = new Paint();
        mPaint1.setStyle(Paint.Style.STROKE);
    }

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        canvas.drawArc(mRectF,250,100,true,mPaint);
        canvas.drawArc(mRectF,20,140,false,mPaint);
        canvas.drawArc(mRectF,180 ,60,false,mPaint1);
    }
}
