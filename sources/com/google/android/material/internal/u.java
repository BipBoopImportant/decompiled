package com.google.android.material.internal;

import android.view.View;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f67024a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f67025b;

    public /* synthetic */ u(View view, boolean z10) {
        this.f67024a = view;
        this.f67025b = z10;
    }

    public final void run() {
        v.p(this.f67024a, this.f67025b);
    }
}
