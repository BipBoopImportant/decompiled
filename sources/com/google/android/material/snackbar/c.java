package com.google.android.material.snackbar;

import android.view.View;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Snackbar f67220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f67221b;

    public /* synthetic */ c(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f67220a = snackbar;
        this.f67221b = onClickListener;
    }

    public final void onClick(View view) {
        this.f67220a.p0(this.f67221b, view);
    }
}
