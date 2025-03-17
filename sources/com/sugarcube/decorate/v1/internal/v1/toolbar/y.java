package com.sugarcube.decorate.v1.internal.v1.toolbar;

import android.view.View;
import android.widget.PopupWindow;

public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PopupWindow f142250a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f142251b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f142252c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f142253d;

    public /* synthetic */ y(PopupWindow popupWindow, View view, int i10, int i11) {
        this.f142250a = popupWindow;
        this.f142251b = view;
        this.f142252c = i10;
        this.f142253d = i11;
    }

    public final void run() {
        z.d(this.f142250a, this.f142251b, this.f142252c, this.f142253d);
    }
}
