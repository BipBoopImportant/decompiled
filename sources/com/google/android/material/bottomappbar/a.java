package com.google.android.material.bottomappbar;

import android.view.View;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f66069a;

    public /* synthetic */ a(View view) {
        this.f66069a = view;
    }

    public final void run() {
        this.f66069a.requestLayout();
    }
}
