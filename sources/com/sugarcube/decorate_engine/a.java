package com.sugarcube.decorate_engine;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DecorateEngine f142957a;

    public /* synthetic */ a(DecorateEngine decorateEngine) {
        this.f142957a = decorateEngine;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return DecorateEngine._get_onDevTouchListener_$lambda$41(this.f142957a, view, motionEvent);
    }
}
