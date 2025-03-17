package com.sugarcube.app.base.data.source;

import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.CatalogRepository", f = "CatalogRepository.kt", l = {461}, m = "addItemToCart")
final class CatalogRepository$addItemToCart$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CatalogRepository$addItemToCart$1(CatalogRepository catalogRepository, C17164e<? super CatalogRepository$addItemToCart$1> eVar) {
        super(eVar);
        this.this$0 = catalogRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addItemToCart((CachedCatalogItem) null, this);
    }
}
