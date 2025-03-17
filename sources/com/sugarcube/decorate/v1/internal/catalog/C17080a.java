package com.sugarcube.decorate.v1.internal.catalog;

import com.sugarcube.decorate.v1.internal.catalog.adapters.FilterPillAdapter;

/* renamed from: com.sugarcube.decorate.v1.internal.catalog.a  reason: case insensitive filesystem */
public final /* synthetic */ class C17080a implements FilterPillAdapter.OnFilterClickedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalogFragmentV2 f141698a;

    public /* synthetic */ C17080a(CatalogFragmentV2 catalogFragmentV2) {
        this.f141698a = catalogFragmentV2;
    }

    public final void onFilterClicked(String str) {
        CatalogFragmentV2.Q1(this.f141698a, str);
    }
}
