package com.example.ghome.projectdz.Classwork.classwork4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

import com.example.ghome.projectdz.R;

/**
 * Created by GHome on 31.07.2017.
 */

public class MyViewClasswork4 extends View {

    private Paint myPaint =new Paint();
    private RectF arcRectF = new RectF();

    int cx,cy,mWidth,mHeigth,radius,mcX,mcY,minCent;
    int xLine=0;
    int yLine=0;



    public MyViewClasswork4(Context context) {
        super(context);
        initialize();
    }

    public MyViewClasswork4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();

    }

    public MyViewClasswork4(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyViewClasswork4(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();

    }


    private void initialize(){
        myPaint.setAntiAlias(true); // cглаживание пикселей

        int color = (ContextCompat.getColor( getContext(), R.color.dz2Green ));
        myPaint.setColor(color);
        myPaint.setStyle(Paint.Style.STROKE);
        Resources r = getResources();

        float strokeWidthInPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                10, r.getDisplayMetrics());

        myPaint.setStrokeWidth(strokeWidthInPx);

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth=w;
        mHeigth=h;
        radius = (Math.min(getWidth(), getHeight()))/4;
        mcX =mWidth/2;
        mcY =mHeigth/2;
        minCent=(Math.min(mcX,mcY));


    }

    @Override
    protected void onDraw(Canvas canvas) { // Метод вызывается постоянно , не захламлять сложными объектами
        //super.onDraw(canvas);


        canvas.drawCircle(cx,cy, radius,myPaint);

        canvas.drawLine(mcX-radius,mcY-radius,mcX+radius,mcY+radius,myPaint);


        arcRectF.left=0;
        arcRectF.top =mcY;
        arcRectF.right =mWidth;
        arcRectF.bottom =mHeigth;
        canvas.drawArc(arcRectF,0,90,true,myPaint);



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) { //метод ловит клики на экран

        if (event.getAction()==MotionEvent.ACTION_MOVE) {

            int radius = (Math.min(mWidth, mHeigth))/4;
            cx = (int) event.getX()-radius;
            cy = (int) event.getY();
            invalidate();
        }
else
     if (event.getAction()==MotionEvent.ACTION_DOWN){

     }

        return true;




    }
}
