package apis.amapv2.com.canvas.activity;

import android.view.View;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class CanvasChangeActivity extends BaseListActivty {

    @Override
    protected void initData() {
        mTvTitle.setText("Canvas的平移，缩放等操作");
        mTvTitle.setVisibility(View.VISIBLE);

        ArrayList<ItemObject> data = new ArrayList<>();
        data.add(new ItemObject("画布的平移", CanvasTranslateActivity.class));
        data.add(new ItemObject("画布的缩放", CanvasScaleActivity.class));
        mMyListView.setData(data);
    }
}
