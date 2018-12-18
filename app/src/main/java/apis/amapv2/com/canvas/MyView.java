package apis.amapv2.com.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //绘制圆
        drawCircle(canvas);

        //绘制扇形
        drawArg(canvas);

        //绘制扇形
        drawArg2(canvas);
    }

    /**
     * 绘制圆形
     * @param canvas
     */
    private void drawCircle(Canvas canvas) {
        //1、构造画笔
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        //2、构造矩形
        RectF rectF = new RectF(0, 0, 200, 200);

        //3、绘制圆弧，不含圆心
        canvas.drawArc(rectF, 0, 360, false, paint);//绘制圆
    }

    /**
     * 绘制扇形
     * @param canvas
     */
    private void drawArg(Canvas canvas) {
        //1、构造画笔
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        //2、构造矩形
        RectF rectF = new RectF(0, 0, 200, 200);
        rectF.offset(200,0);//向右偏移200个像素，向下偏移0个像素

        //3、绘制圆弧，不含圆心
        //第一个参数:矩形
        //第二个参数：开始的角度，表示的是-50
        //第三个参数：-90度，表示的是逆时针旋转90度
        //第四个参数：是否显示中心，❤❤❤❤❤❤ 非常关键
        canvas.drawArc(rectF, -50, -90, true, paint);//绘制圆
    }

    /**
     * 绘制扇形
     * @param canvas
     */
    private void drawArg2(Canvas canvas) {
        //1、构造画笔
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        //2、构造矩形
        RectF rectF = new RectF(0, 0, 200, 200);
        rectF.offset(400,0);//向右偏移400个像素，向下偏移0个像素

        //3、绘制圆弧，不含圆心
        //第一个参数:矩形
        //第二个参数：开始的角度，表示的是-50
        //第三个参数：-90度，表示的是逆时针旋转90度
        //第四个参数：是否显示中心，❤❤❤❤❤❤ 非常关键
        canvas.drawArc(rectF, -50, -90, false, paint);//绘制圆
    }
}
