package com.nsoftware.ipworks3ds.sdk.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import nts.C3727;

public class SDKScrollView extends ScrollView {
    public SDKScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        if ((motionEvent.getFlags() & 1) != 1) {
            return super.onFilterTouchEventForSecurity(motionEvent);
        }
        C3727.m1038();
        return false;
    }
}
