package apis.amapv2.com.canvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CanvasScaleView extends View {

    public CanvasScaleView(Context context) {
        super(context);
    }

    public CanvasScaleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasScaleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //1、构造画笔。
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);//抗锯齿
        paint.setColor(Color.RED);

        //2、构造矩形。
        RectF rectF = new RectF(0,0,200,200);

        //3、绘制矩形。
        canvas.drawRect(rectF,paint);

        //4、缩放:x轴的刻度变味原来的一半，y轴的刻度变味原来的一半。
        //注意：❤ ❤ ❤ ❤ ❤ 缩放并不会影响原来Canvas上的图形。
        canvas.scale(0.5f,0.5f);

        paint.setColor(Color.YELLOW);

        canvas.drawRect(rectF,paint);
    }
}
