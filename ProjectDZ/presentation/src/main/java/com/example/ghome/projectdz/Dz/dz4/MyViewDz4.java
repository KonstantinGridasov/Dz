package com.example.ghome.projectdz.Dz.dz4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import com.example.ghome.projectdz.R;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by GHome on 31.07.2017.
 */

public class MyViewDz4 extends View {

    private Paint myPaint=new Paint();
    private Paint myPaint2=new Paint();
    private Paint myPaint3=new Paint();
    private Paint shadowPaint =new Paint();
    private RectF arcRectF = new RectF();

    float cos=(float)Math.cos(Math.toDegrees(60));
    float sin=(float)Math.sin(Math.toDegrees(60));

    private int mWidth;
    private int mHeight;
    private    int cx,cy,radius,strelkaStopY,startYline,stopYline;
    private float mClockTextSize =20.0f;




    public MyViewDz4(Context context) {
        super(context);
        initialize();
    }

    public MyViewDz4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public MyViewDz4(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyViewDz4(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();
    }
    public void initialize (){

        myPaint.setAntiAlias(true);
        int color = (ContextCompat.getColor( getContext(), R.color.dz4Black ));
        myPaint.setColor(color);
        myPaint.setStyle(Paint.Style.STROKE);
        Resources r = getResources();
        float strokeWidthInPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                2, r.getDisplayMetrics());
        myPaint.setStrokeWidth(strokeWidthInPx);

        myPaint2.setAntiAlias(true);
        int color2= (ContextCompat.getColor( getContext(), R.color.dz4Red ));
        myPaint2.setColor(color2);
        myPaint2.setStyle(Paint.Style.STROKE);
        Resources r1 = getResources();
        float strokeWidthInPxHour = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                6, r1.getDisplayMetrics());
        myPaint2.setStrokeWidth(strokeWidthInPxHour);

        myPaint3.setAntiAlias(true);
        int color3= (ContextCompat.getColor( getContext(), R.color.dz4Red ));
        myPaint3.setColor(color3);
        myPaint3.setStyle(Paint.Style.STROKE);
        Resources r3 = getResources();
        float strokeWidthInPxMinutes = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                3, r3.getDisplayMetrics());
        myPaint3.setStrokeWidth(strokeWidthInPxMinutes);


        shadowPaint.setAntiAlias(true);
        shadowPaint.setTextSize(mClockTextSize);
//        shadowPaint.setShadowLayer(5.0f, 10.0f, 10.0f, R.color.dz2Red)

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth =w; //Ширина
        mHeight = h; //Высота
        cx=mWidth/2; //Центр круга
        cy=mHeight/2; //Центр круга
        radius =Math.min(mHeight,mWidth)/4; //Радиус
        mClockTextSize= radius/8;
        strelkaStopY =  cy-radius/2; // конец стрелки
        startYline = cy - radius + radius/8;  // начало черточки
        stopYline = cy - radius;                 //Конец черточки





    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onDraw(Canvas canvas) {
        Calendar c= Calendar.getInstance();
        int mHour =c.get(Calendar.HOUR);
        int mMinutes=c.get(Calendar.MINUTE);
        int Cekonds =c.get(Calendar.SECOND);

      for (int h=0;h<100;h++){
        super.onDraw(canvas);
        canvas.save();
        canvas.drawCircle(cx,cy,radius,myPaint);

          for (int i=1; i<=12;i++) {
            canvas.rotate(30,cx,cy);
            canvas.drawLine(cx, startYline, cx, stopYline, myPaint); //черточки
            canvas.drawText(String.valueOf(i), cx, startYline+mClockTextSize , shadowPaint); //цифры

          }
        canvas.restore();

        canvas.save();
        canvas.rotate(30*mHour,cx,cy);
        canvas.drawLine(cx,cy,cx,cy-radius/2,myPaint2); //Hour
        canvas.restore();

        canvas.save();
        canvas.rotate(6*mMinutes,cx,cy);
        canvas.drawLine(cx,cy,cx,cy-radius/2,myPaint3);;  //Minutes
        canvas.restore();

        canvas.save();
        canvas.rotate(6*Cekonds,cx,cy);
        canvas.drawLine(cx,cy,cx,cy-radius/2,myPaint);;  //Seconds
        canvas.restore();

       invalidate();
    }

    }


}

