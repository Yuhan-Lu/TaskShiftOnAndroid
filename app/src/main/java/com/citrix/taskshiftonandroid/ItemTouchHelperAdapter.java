package com.citrix.taskshiftonandroid;

import java.io.IOException;

public interface ItemTouchHelperAdapter {
    //数据交换
    void onItemMove(int fromPosition,int toPosition);
    //数据删除
    void onItemDismiss(int position) throws IOException, InterruptedException;
}