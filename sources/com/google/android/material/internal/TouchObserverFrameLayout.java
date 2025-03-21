package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class TouchObserverFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View.OnTouchListener f66861a;

    public TouchObserverFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f66861a;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f66861a = onTouchListener;
    }
}
