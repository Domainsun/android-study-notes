package com.domain.android.study.notes.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.domain.android.study.notes.R;
import com.domain.android.study.notes.entity.ItemVo;

import java.util.List;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/23
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class MyAdapter extends BaseQuickAdapter<ItemVo, BaseViewHolder> {

    public MyAdapter(int layoutResId, @Nullable List<ItemVo> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ItemVo item) {
        helper.setImageResource(R.id.iv,item.getIcon());
        helper.setText(R.id.tv,item.getText());

    }
}
