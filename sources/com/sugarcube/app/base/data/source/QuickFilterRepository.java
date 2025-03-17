package com.sugarcube.app.base.data.source;

import QJ.C16310i;
import android.util.Log;
import com.sugarcube.app.base.external.config.a;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.QuickFilter;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH@¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/data/source/QuickFilterRepository;", "Lcom/sugarcube/app/base/data/source/QuickFilterRepositorySource;", "Lcom/sugarcube/app/base/data/source/QuickFilterLocalDataSource;", "local", "Lcom/sugarcube/app/base/data/source/QuickFilterRemoteDataSource;", "remote", "Lcom/sugarcube/app/base/external/config/a;", "baseConfig", "<init>", "(Lcom/sugarcube/app/base/data/source/QuickFilterLocalDataSource;Lcom/sugarcube/app/base/data/source/QuickFilterRemoteDataSource;Lcom/sugarcube/app/base/external/config/a;)V", "", "Lcom/sugarcube/core/network/models/QuickFilter;", "fetch", "(LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "", "country", "language", "getQuickFilters", "(Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/external/config/a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuickFilterRepository extends QuickFilterRepositorySource {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final a baseConfig;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickFilterRepository(QuickFilterLocalDataSource quickFilterLocalDataSource, QuickFilterRemoteDataSource quickFilterRemoteDataSource, a aVar) {
        super(quickFilterLocalDataSource, quickFilterRemoteDataSource);
        C17542s.j(quickFilterLocalDataSource, "local");
        C17542s.j(quickFilterRemoteDataSource, "remote");
        C17542s.j(aVar, "baseConfig");
        this.baseConfig = aVar;
    }

    /* access modifiers changed from: protected */
    public Object fetch(C17164e<? super List<QuickFilter>> eVar) {
        String language = this.baseConfig.getLanguage();
        Log.d(AnyKt.SUGARCUBE_TAG, "QuickFilterRepository::fetch " + language);
        return C16310i.g(getCoroutineContext(), new QuickFilterRepository$fetch$2(this, (C17164e<? super QuickFilterRepository$fetch$2>) null), eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getQuickFilters(com.sugarcube.core.network.models.RoomType r6, java.lang.String r7, java.lang.String r8, dI.C17164e<? super java.util.List<com.sugarcube.core.network.models.QuickFilter>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.sugarcube.app.base.data.source.QuickFilterRepository$getQuickFilters$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sugarcube.app.base.data.source.QuickFilterRepository$getQuickFilters$1 r0 = (com.sugarcube.app.base.data.source.QuickFilterRepository$getQuickFilters$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.QuickFilterRepository$getQuickFilters$1 r0 = new com.sugarcube.app.base.data.source.QuickFilterRepository$getQuickFilters$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 != r4) goto L_0x003f
            java.lang.Object r6 = r0.L$4
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.L$3
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r0.L$2
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.L$1
            com.sugarcube.core.network.models.RoomType r6 = (com.sugarcube.core.network.models.RoomType) r6
            java.lang.Object r9 = r0.L$0
            com.sugarcube.app.base.data.source.QuickFilterRepository r9 = (com.sugarcube.app.base.data.source.QuickFilterRepository) r9
            XH.y.b(r1)
            goto L_0x005e
        L_0x003f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0047:
            XH.y.b(r1)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r8
            r0.L$4 = r9
            r0.label = r4
            java.lang.Object r9 = r5.refreshCache(r0)
            if (r9 != r2) goto L_0x005d
            return r2
        L_0x005d:
            r9 = r5
        L_0x005e:
            java.lang.String r0 = "Sugarcube"
            java.lang.String r1 = "QuickFilterRepository::getQuickFilters"
            android.util.Log.d(r0, r1)
            androidx.lifecycle.F r0 = r9.getAllQuickFilters()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00ad
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x007c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.sugarcube.core.network.models.QuickFilter r3 = (com.sugarcube.core.network.models.QuickFilter) r3
            com.sugarcube.core.network.models.RoomType r4 = r3.getRoomType()
            if (r4 != r6) goto L_0x007c
            if (r7 == 0) goto L_0x009c
            java.lang.String r4 = r3.getCountry()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x009c
            goto L_0x007c
        L_0x009c:
            if (r8 == 0) goto L_0x00a9
            java.lang.String r3 = r3.getLanguage()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r8)
            if (r3 != 0) goto L_0x00a9
            goto L_0x007c
        L_0x00a9:
            r1.add(r2)
            goto L_0x007c
        L_0x00ad:
            java.util.List r1 = YH.C16877v.n()
        L_0x00b1:
            androidx.lifecycle.K r6 = r9.get_roomFilters()
            r6.postValue(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.QuickFilterRepository.getQuickFilters(com.sugarcube.core.network.models.RoomType, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
