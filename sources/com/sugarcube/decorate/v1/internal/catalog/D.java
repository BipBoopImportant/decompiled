package com.sugarcube.decorate.v1.internal.catalog;

import TF.C16480w;
import androidx.fragment.app.C5191t;

public final /* synthetic */ class D implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalogFragmentV2 f141484a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C5191t f141485b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C16480w f141486c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Throwable f141487d;

    public /* synthetic */ D(CatalogFragmentV2 catalogFragmentV2, C5191t tVar, C16480w wVar, Throwable th2) {
        this.f141484a = catalogFragmentV2;
        this.f141485b = tVar;
        this.f141486c = wVar;
        this.f141487d = th2;
    }

    public final void run() {
        CatalogFragmentV2.t1(this.f141484a, this.f141485b, this.f141486c, this.f141487d);
    }
}
