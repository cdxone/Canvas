package apis.amapv2.com.canvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CanvasStoreRestoreView extends View {
    public CanvasStoreRestoreView(Context context) {
        super(context);
    }

    public CanvasStoreRestoreView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasStoreRestoreView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //1、构造画笔。
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);//抗锯齿
        paint.setColor(Color.RED);

        //介绍一下save和restore方法。
        //1、save和restore方法必须是配对使用的。
        //2、restore方法前必须有save方法，不然会报Underflow in restore错误
        //3、但是也可以只有save方法，不过只有save方法我觉得其实是无意义的。

        //save方法用于临时保存画布坐标系统的状态。
        //restore方法可以用来恢复save之后设置的状态。

        canvas.save();//保存画布状态,后续绘制的都是在新画布坐标
        canvas.rotate(45);
        canvas.drawCircle(100,100,100,paint);
        //注意：这句话是关键，运行的时候，可以注释掉这句话，看看效果。
        canvas.restore();//恢复画布状态,此时画布没有旋转。

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(200, 200, 100, paint);
    }
}
