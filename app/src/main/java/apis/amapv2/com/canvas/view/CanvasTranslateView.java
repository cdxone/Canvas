package apis.amapv2.com.canvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CanvasTranslateView extends View {
    public CanvasTranslateView(Context context) {
        super(context);
    }

    public CanvasTranslateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasTranslateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //1、让画布平移:向右平移100，向下平移100。
        canvas.translate(100,100);

        //2、构造画笔
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);//抗锯齿
        paint.setColor(Color.RED);

        //3、构造矩形：显示的范围
        RectF rectF = new RectF(0,0,200,200);

        //4、画布上绘制矩形
        canvas.drawRect(rectF,paint);

        //5、继续平移100:向右平移100，向下平移100
        //关键：❤ ❤ ❤ ❤ ❤  这个平移不会影响原来的图形。
        canvas.translate(100,100);

        //绘制矩形
        canvas.drawRect(rectF,paint);
    }
}
