package com.sugarcube.decorate.v1.internal.catalog;

import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.decorate.v1.internal.catalog.CatalogFragmentV2;
import nI.C17642l;

public final /* synthetic */ class O implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalogFragmentV2 f141504a;

    public /* synthetic */ O(CatalogFragmentV2 catalogFragmentV2) {
        this.f141504a = catalogFragmentV2;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(CatalogFragmentV2.v.a.c(this.f141504a, (CachedCatalogItem) obj));
    }
}
