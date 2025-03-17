package com.sugarcube.decorate.v1.internal.catalog;

import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.decorate.v1.internal.catalog.adapters.CatalogCategoryAdapter;

/* renamed from: com.sugarcube.decorate.v1.internal.catalog.l  reason: case insensitive filesystem */
public final /* synthetic */ class C17091l implements CatalogCategoryAdapter.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalogFragmentV2 f141725a;

    public /* synthetic */ C17091l(CatalogFragmentV2 catalogFragmentV2) {
        this.f141725a = catalogFragmentV2;
    }

    public final void onItemSelected(CatalogCategory catalogCategory) {
        CatalogFragmentV2.R1(this.f141725a, catalogCategory);
    }
}
