package apis.amapv2.com.canvas;

import android.view.View;

import java.util.ArrayList;

import apis.amapv2.com.canvas.activity.CanvasDrawXXXActivity;
import apis.amapv2.com.canvas.activity.CanvasSaveRestoreActivity;
import apis.amapv2.com.canvas.activity.CanvasChangeActivity;
import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class MainActivity extends BaseListActivty {

    @Override
    protected void initData() {
        mTvTitle.setText("Canvas相关操作");
        mTvTitle.setVisibility(View.VISIBLE);

        ArrayList<ItemObject> data = new ArrayList<>();
        data.add(new ItemObject("给Canvas绘制图形", CanvasDrawXXXActivity.class));
        data.add(new ItemObject("Canvas的平移缩放的研究",CanvasChangeActivity.class));
        data.add(new ItemObject("Canvas的层的保存和回滚操作",CanvasSaveRestoreActivity.class));
        mMyListView.setData(data);
    }
}
