package com.sugarcube.app.base.data.source.remote;

import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl", f = "CatalogRepositoryRemoteDataSourceImpl.kt", l = {115, 117, 118}, m = "fetchCatalogSwapSuggestionsPage")
final class CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSwapSuggestionsPage$1 extends d {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogRepositoryRemoteDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSwapSuggestionsPage$1(CatalogRepositoryRemoteDataSourceImpl catalogRepositoryRemoteDataSourceImpl, C17164e<? super CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSwapSuggestionsPage$1> eVar) {
        super(eVar);
        this.this$0 = catalogRepositoryRemoteDataSourceImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchCatalogSwapSuggestionsPage(0, (Uri) null, this);
    }
}
