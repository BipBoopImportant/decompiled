package com.google.firebase.perf.util;

import android.view.View;
import android.view.ViewTreeObserver;

public final /* synthetic */ class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f68655a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f68656b;

    public /* synthetic */ d(e eVar, View view) {
        this.f68655a = eVar;
        this.f68656b = view;
    }

    public final void onGlobalLayout() {
        this.f68655a.b(this.f68656b);
    }
}
