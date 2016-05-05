package com.mcablylx.mckiera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.mcablylx.mckiera.Log;

/**
 * Created by Mckiera on 2016-05-05.
 * 查看view重写的方法.
 */
public class LookViewOverwrite extends View {

    public LookViewOverwrite(Context context) {
        super(context);
    }

    public LookViewOverwrite(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LookViewOverwrite(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /*
    public class View implements Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource {
    ......

    int mPrivateFlags;
    ......

    int mOldWidthMeasureSpec = Integer.MIN_VALUE;
    ......

    int mOldHeightMeasureSpec = Integer.MIN_VALUE;
    ......

    widthMeasureSpec和heightMeasureSpec用来描述当前正在处理的视图可以获得的最大宽度和高度。
    对于应用程序窗口的顶层视图来说，我们也可以认为这两个参数是用来描述应用程序窗口的宽度和高度。

    public final void measure(int widthMeasureSpec, int heightMeasureSpec) {
        if ((mPrivateFlags & FORCE_LAYOUT) == FORCE_LAYOUT ||
                widthMeasureSpec != mOldWidthMeasureSpec ||
                heightMeasureSpec != mOldHeightMeasureSpec) {

            // first clears the measured dimension flag
            mPrivateFlags &= ~MEASURED_DIMENSION_SET;

            ......

            // measure ourselves, this should set the measured dimension flag back
            onMeasure(widthMeasureSpec, heightMeasureSpec);

            // flag not set, setMeasuredDimension() was not invoked, we raise
            // an exception to warn the developer
            if ((mPrivateFlags & MEASURED_DIMENSION_SET) != MEASURED_DIMENSION_SET) {
                throw new IllegalStateException("onMeasure() did not set the"
                        + " measured dimension by calling"
                        + " setMeasuredDimension()");
            }

            mPrivateFlags |= LAYOUT_REQUIRED;
        }

        mOldWidthMeasureSpec = widthMeasureSpec;
        mOldHeightMeasureSpec = heightMeasureSpec;
    }
    ......
}
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.i("onMeasure");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
