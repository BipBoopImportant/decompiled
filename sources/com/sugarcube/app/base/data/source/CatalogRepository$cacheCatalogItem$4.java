package com.sugarcube.app.base.data.source;

import XH.C16807N;
import XH.y;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.SalesDressedBedDataKey;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.q;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "size", "variant"}, k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$4", f = "CatalogRepository.kt", l = {554}, m = "invokeSuspend")
final class CatalogRepository$cacheCatalogItem$4 extends l implements q<String, String, C17164e<? super Map<String, ? extends CachedCatalogItem>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CatalogRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CatalogRepository$cacheCatalogItem$4(CatalogRepository catalogRepository, C17164e<? super CatalogRepository$cacheCatalogItem$4> eVar) {
        super(3, eVar);
        this.this$0 = catalogRepository;
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            String str = (String) this.L$0;
            String str2 = (String) this.L$1;
            CatalogRepository catalogRepository = this.this$0;
            SalesDressedBedDataKey salesDressedBedDataKey = new SalesDressedBedDataKey(str, str2);
            this.L$0 = str;
            this.L$1 = str2;
            this.label = 1;
            obj = CatalogRepository.getSDBAssets$default(catalogRepository, salesDressedBedDataKey, false, this, 2, (Object) null);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            String str3 = (String) this.L$1;
            String str4 = (String) this.L$0;
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    public final Object invoke(String str, String str2, C17164e<? super Map<String, CachedCatalogItem>> eVar) {
        CatalogRepository$cacheCatalogItem$4 catalogRepository$cacheCatalogItem$4 = new CatalogRepository$cacheCatalogItem$4(this.this$0, eVar);
        catalogRepository$cacheCatalogItem$4.L$0 = str;
        catalogRepository$cacheCatalogItem$4.L$1 = str2;
        return catalogRepository$cacheCatalogItem$4.invokeSuspend(C16807N.f139792a);
    }
}
