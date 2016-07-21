package com.example.ytf.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.bt_scale)
    Button btScale;
    @Bind(R.id.bt_alpha)
    Button btAlpha;
    @Bind(R.id.bt_translate)
    Button btTranslate;
    @Bind(R.id.bt_rotate)
    Button btRotate;
    @Bind(R.id.text)
    TextView textView;

    Animation animation_scale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // TODO: 16/7/21 初始化动画 
        init();

        // TODO: 16/7/21 点击按钮后使textview加载动画
        onclick();
        

    }

    public void init(){
        animation_scale= AnimationUtils.loadAnimation(this,R.anim.scaleanim);
    }

    public void onclick(){

        btScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.startAnimation(animation_scale);
            }
        });

    }

}
