package com.sugarcube.decorate.v1.internal.catalog;

import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.decorate.v1.internal.catalog.adapters.CatalogCategoryAdapter;

/* renamed from: com.sugarcube.decorate.v1.internal.catalog.w  reason: case insensitive filesystem */
public final /* synthetic */ class C17101w implements CatalogCategoryAdapter.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalogFragmentV2 f141736a;

    public /* synthetic */ C17101w(CatalogFragmentV2 catalogFragmentV2) {
        this.f141736a = catalogFragmentV2;
    }

    public final void onItemSelected(CatalogCategory catalogCategory) {
        CatalogFragmentV2.S1(this.f141736a, catalogCategory);
    }
}
