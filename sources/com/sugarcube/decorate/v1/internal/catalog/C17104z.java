package com.sugarcube.decorate.v1.internal.catalog;

import TF.C16480w;
import androidx.fragment.app.C5191t;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import nI.p;

/* renamed from: com.sugarcube.decorate.v1.internal.catalog.z  reason: case insensitive filesystem */
public final /* synthetic */ class C17104z implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalogFragmentV2 f141740a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f141741b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CachedCatalogItem f141742c;

    public /* synthetic */ C17104z(CatalogFragmentV2 catalogFragmentV2, Throwable th2, CachedCatalogItem cachedCatalogItem) {
        this.f141740a = catalogFragmentV2;
        this.f141741b = th2;
        this.f141742c = cachedCatalogItem;
    }

    public final Object invoke(Object obj, Object obj2) {
        return CatalogFragmentV2.w1(this.f141740a, this.f141741b, this.f141742c, (C5191t) obj, (C16480w) obj2);
    }
}
