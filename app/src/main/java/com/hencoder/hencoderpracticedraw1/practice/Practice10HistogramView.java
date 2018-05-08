package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Practice10HistogramView extends View {

    private static final String TAG = Practice10HistogramView.class.getSimpleName();
    private Paint mPaint = new Paint();
    private Paint mLinePaint = new Paint();
    private Paint mTextPaint = new Paint();
    private static final int COLOUM_WIDTH = 60;
    private static final int COLOUM_GAP = 15;
    private static final float MAX = 33;
    private int zeroY = 420;
    private List<Map.Entry<String,Float>> dataList = new ArrayList();

    {
        dataList.add(new AbstractMap.SimpleEntry<>("Froyo",0.4f));
        dataList.add(new AbstractMap.SimpleEntry<>("GB",2f));
        dataList.add(new AbstractMap.SimpleEntry<>("ICS",2f));
        dataList.add(new AbstractMap.SimpleEntry<>("JB",6f));
        dataList.add(new AbstractMap.SimpleEntry<>("KitKat",13.4f));
        dataList.add(new AbstractMap.SimpleEntry<>("L",26f));
        dataList.add(new AbstractMap.SimpleEntry<>("M",30f));
        dataList.add(new AbstractMap.SimpleEntry<>("N",25f));


        mPaint.setStrokeWidth(COLOUM_WIDTH);
        mPaint.setColor(0xFF72B916);

        mLinePaint.setStrokeWidth(2);
        mLinePaint.setColor(Color.WHITE);

        mTextPaint.setStrokeWidth(2);
        mTextPaint.setColor(Color.WHITE);
        mTextPaint.setTextAlign(Paint.Align.CENTER);
        mTextPaint.setTextSize(20);

    }

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawLine(70,40,70,zeroY,mLinePaint);
        canvas.drawLine(70,zeroY,700,zeroY,mLinePaint);

        int x = 70 + COLOUM_GAP + COLOUM_WIDTH/2;
        float y;
        for (Map.Entry<String, Float> entry : dataList) {
            y = zeroY - zeroY * (entry.getValue()/MAX);
            Log.e(TAG, "onDraw: " + y);
            canvas.drawLine(x,zeroY,x,y,mPaint);
            canvas.drawText(entry.getKey(),x,zeroY + 10,mTextPaint);
            x += (COLOUM_GAP + COLOUM_WIDTH);
        }
    }
}
