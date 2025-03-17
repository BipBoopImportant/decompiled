package com.sugarcube.app.base.data.source;

import android.net.Uri;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.CatalogRepository", f = "CatalogRepository.kt", l = {65, 71}, m = "fetchCatalogItemsForRoomType")
final class CatalogRepository$fetchCatalogItemsForRoomType$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CatalogRepository$fetchCatalogItemsForRoomType$1(CatalogRepository catalogRepository, C17164e<? super CatalogRepository$fetchCatalogItemsForRoomType$1> eVar) {
        super(eVar);
        this.this$0 = catalogRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchCatalogItemsForRoomType((RoomType) null, (Uri) null, this);
    }
}
