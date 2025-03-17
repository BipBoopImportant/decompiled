package com.sugarcube.app.base.data.source.remote;

import android.net.Uri;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.core.network.models.CatalogPage;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl", f = "CatalogRepositoryRemoteDataSourceImpl.kt", l = {61, 63, 64}, m = "fetchCatalogPage")
final class CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$2 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogRepositoryRemoteDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$2(CatalogRepositoryRemoteDataSourceImpl catalogRepositoryRemoteDataSourceImpl, C17164e<? super CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$2> eVar) {
        super(eVar);
        this.this$0 = catalogRepositoryRemoteDataSourceImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchCatalogPage((String) null, (Uri) null, (C17164e<? super Result<CatalogPage>>) this);
    }
}
