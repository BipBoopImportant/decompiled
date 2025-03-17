package com.sugarcube.decorate.v1.internal.catalog;

import TF.C16480w;
import androidx.fragment.app.C5191t;
import com.sugarcube.app.base.data.database.CachedCatalogItem;

public final /* synthetic */ class C implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalogFragmentV2 f141391a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C5191t f141392b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C16480w f141393c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Throwable f141394d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ CachedCatalogItem f141395e;

    public /* synthetic */ C(CatalogFragmentV2 catalogFragmentV2, C5191t tVar, C16480w wVar, Throwable th2, CachedCatalogItem cachedCatalogItem) {
        this.f141391a = catalogFragmentV2;
        this.f141392b = tVar;
        this.f141393c = wVar;
        this.f141394d = th2;
        this.f141395e = cachedCatalogItem;
    }

    public final void run() {
        CatalogFragmentV2.x1(this.f141391a, this.f141392b, this.f141393c, this.f141394d, this.f141395e);
    }
}
