package com.domain.android.study.notes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.domain.android.study.notes.customview.CustomViewPartHomeActivity;
import com.domain.android.study.notes.customview.CustomViewPartOneActivity;
import com.domain.android.study.notes.customview.CustomViewPartTwoActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv)
    public void onViewClicked() {

        CustomViewPartHomeActivity.start(this);

    }
}
