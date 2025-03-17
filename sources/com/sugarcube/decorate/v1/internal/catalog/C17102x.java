package com.sugarcube.decorate.v1.internal.catalog;

import TF.C16465h;
import android.os.Handler;
import android.view.View;

/* renamed from: com.sugarcube.decorate.v1.internal.catalog.x  reason: case insensitive filesystem */
public final /* synthetic */ class C17102x implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C16465h f141737a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Handler f141738b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f141739c;

    public /* synthetic */ C17102x(C16465h hVar, Handler handler, Runnable runnable) {
        this.f141737a = hVar;
        this.f141738b = handler;
        this.f141739c = runnable;
    }

    public final void onClick(View view) {
        CatalogFragmentV2.B2(this.f141737a, this.f141738b, this.f141739c, view);
    }
}
