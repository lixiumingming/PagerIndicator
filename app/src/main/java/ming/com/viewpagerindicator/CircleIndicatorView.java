package ming.com.viewpagerindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2017/4/27.
 */

public class CircleIndicatorView extends View {


    private Paint mPaint;
    private float mRadius = 20;
    private float mGap;
    private int mCount;
    private int mIndex;

    public CircleIndicatorView(Context context) {
        super(context);
        init();
    }

    public CircleIndicatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

        //attrs-radius〉- > setRadius(radius);
    }

    public CircleIndicatorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();

       /* mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(3);*/
        mPaint.setAntiAlias(true);

//        mPaintSelected = new Paint();
    }

    public void setRadius(float radius) {
        this.mRadius = radius;
        Log.i("@@@","setRadius");
        invalidate();
        //postInvalidate();
    }

    public void setGap(float gap) {
        this.mGap = gap;
        Log.i("@@@","setRadius");
        invalidate();
        //postInvalidate();
    }

    public void setCount(int count) {
        this.mCount = count;
        Log.i("@@@","setRadius");
        invalidate();
        //postInvalidate();
    }

    public void setSelectedIndex(int index) {
        this.mIndex = index;
        Log.i("@@@","setRadius");
        invalidate();
        //postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i("@@@","onDraw");
        if(mCount <1) {
            return;
        }
        int width = getWidth();
        int height = getHeight();

        float w = mCount * mRadius * 2 + mGap * (mCount - 1);
        float x = (width - w)/2 +mRadius;
        float y = (height - mRadius * 2)/2 + mRadius;
        float startX = x;

        for (int i = 0; i < mCount; i++){
            if ( mIndex == i){
                mPaint.setColor(0xFF00FF00);
            }else{
                mPaint.setColor(0xFFFF0000);
            }
            canvas.drawCircle(startX,y,mRadius,mPaint);
            startX +=  mRadius * 2 + mGap;
        }



    }
}
