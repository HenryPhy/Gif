package com.example.bjdh;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.tween_iv);
    }
    public void onClick(View view) {
        switch (view.getId()){
            //透明度
            case R.id.btn_alpha:
//                //实例化透明度动画的对象
//                AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
//                alphaAnimation.setDuration(5000);
//                //设置保存改变后的状态
//                alphaAnimation.setFillAfter(true);
//                //设置重复的次数
//                alphaAnimation.setRepeatCount(1);
//                //设置重复的模式   RESTART=重新启动；重新开始
//                alphaAnimation.setRepeatMode(Animation.RESTART);
//                imageView.startAnimation(alphaAnimation);
                //ndfrri
                //astr
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
                alphaAnimation.setDuration(5000);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setRepeatCount(1);
                alphaAnimation.setRepeatMode(Animation.RESTART);
                imageView.startAnimation(alphaAnimation);
                break;
                //缩放
            case R.id.btn_scale:
                //实例化缩放动画的对象
                ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 2f, 1f, 2f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                scaleAnimation.setDuration(3000);
                //设置保存改变后的状态
                scaleAnimation.setFillAfter(true);
                //设置重复次数
                scaleAnimation.setRepeatCount(1);
                //设置重复的模式   RESTART=重新启动；重新开始
                scaleAnimation.setRepeatMode(Animation.RESTART);
                imageView.startAnimation(scaleAnimation);
                break;
                //位移
            case R.id.btn_translate:
                //实例化位移动画的对象
                TranslateAnimation translateAnimation = new TranslateAnimation(0, 200, 0, 200);
                translateAnimation.setDuration(3000);
                //设置保存改变后的状态
                translateAnimation.setFillAfter(true);
                //设置重复次数
                translateAnimation.setRepeatCount(1);
                //设置重复的模式   RESTART=重新启动；重新开始
                translateAnimation.setRepeatMode(Animation.RESTART);
                imageView.startAnimation(translateAnimation);
                break;
                //旋转
            case R.id.btn_rotate:
                //实例化旋转动画的对象
                RotateAnimation rotateAnimation = new RotateAnimation(0, 720, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotateAnimation.setDuration(3000);
                //设置保存改变后的状态
                rotateAnimation.setFillAfter(true);
                //设置重复次数
                rotateAnimation.setRepeatCount(1);
                //设置重复的模式   RESTART=重新启动；重新开始
                rotateAnimation.setRepeatMode(Animation.RESTART);
                imageView.startAnimation(rotateAnimation);
                break;
                //集合
            case R.id.btn_set:
                AnimationSet set = new AnimationSet(true);
                AlphaAnimation alphaAnimation1 = new AlphaAnimation(0.2f, 1.0f);
                RotateAnimation rotateAnimation1 = new RotateAnimation(0, 900, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                //补间动画：可以同时播放两个或者两个以上的动画，所以要把动画添加到集合中
                set.addAnimation(alphaAnimation1);
                set.addAnimation(rotateAnimation1);
                set.setDuration(3000);
                set.setFillAfter(true);
                imageView.startAnimation(set);
                break;}}}
