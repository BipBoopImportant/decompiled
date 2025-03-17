package com.sugarcube.app.base.data.source;

import QJ.Q;
import XH.C16807N;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.CatalogItem;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "<anonymous>", "(LQJ/Q;)Ljava/util/Map;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.CatalogRepository$getSDBAssets$4$1", f = "CatalogRepository.kt", l = {637}, m = "invokeSuspend")
final class CatalogRepository$getSDBAssets$4$1 extends l implements p<Q, C17164e<? super Map<String, CachedCatalogItem>>, Object> {
    final /* synthetic */ Map<String, CatalogItem> $sdbMap;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ CatalogRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CatalogRepository$getSDBAssets$4$1(Map<String, CatalogItem> map, CatalogRepository catalogRepository, C17164e<? super CatalogRepository$getSDBAssets$4$1> eVar) {
        super(2, eVar);
        this.$sdbMap = map;
        this.this$0 = catalogRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new CatalogRepository$getSDBAssets$4$1(this.$sdbMap, this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super Map<String, CachedCatalogItem>> eVar) {
        return ((CatalogRepository$getSDBAssets$4$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0053  */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            int r1 = r8.I$0
            java.lang.Object r3 = r8.L$6
            com.sugarcube.core.network.models.CatalogItem r3 = (com.sugarcube.core.network.models.CatalogItem) r3
            java.lang.Object r3 = r8.L$5
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            java.lang.Object r3 = r8.L$4
            com.sugarcube.core.network.models.CatalogItem r3 = (com.sugarcube.core.network.models.CatalogItem) r3
            java.lang.Object r3 = r8.L$3
            com.sugarcube.core.network.models.CatalogItem r3 = (com.sugarcube.core.network.models.CatalogItem) r3
            java.lang.Object r3 = r8.L$2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r8.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r8.L$0
            java.util.Map r5 = (java.util.Map) r5
            XH.y.b(r9)
            goto L_0x0080
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0035:
            XH.y.b(r9)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Map<java.lang.String, com.sugarcube.core.network.models.CatalogItem> r1 = r8.$sdbMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r3 = 1073741826(0x40000002, float:2.0000005)
            r5 = r9
            r4 = r1
            r1 = r3
        L_0x004d:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x008a
            java.lang.Object r9 = r4.next()
            r3 = r9
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r9 = r3.getValue()
            com.sugarcube.core.network.models.CatalogItem r9 = (com.sugarcube.core.network.models.CatalogItem) r9
            if (r9 == 0) goto L_0x004d
            com.sugarcube.app.base.data.source.CatalogRepository r6 = r8.this$0
            r8.L$0 = r5
            r8.L$1 = r4
            r8.L$2 = r3
            r8.L$3 = r9
            r8.L$4 = r9
            r8.L$5 = r6
            r8.L$6 = r9
            r8.I$0 = r1
            r7 = 0
            r8.I$1 = r7
            r8.label = r2
            java.lang.Object r9 = r6.cacheCatalogItem(r9, r1, r8)
            if (r9 != r0) goto L_0x0080
            return r0
        L_0x0080:
            com.sugarcube.app.base.data.database.CachedCatalogItem r9 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r9
            java.lang.Object r3 = r3.getKey()
            r5.put(r3, r9)
            goto L_0x004d
        L_0x008a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository$getSDBAssets$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
