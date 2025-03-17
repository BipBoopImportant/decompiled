package com.sugarcube.app.base.data.source;

import QJ.Q;
import XH.C16807N;
import com.sugarcube.core.network.models.QuickFilter;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "Lcom/sugarcube/core/network/models/QuickFilter;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.QuickFilterRepository$fetch$2", f = "QuickFilterRepository.kt", l = {27, 29}, m = "invokeSuspend")
final class QuickFilterRepository$fetch$2 extends l implements p<Q, C17164e<? super List<? extends QuickFilter>>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ QuickFilterRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QuickFilterRepository$fetch$2(QuickFilterRepository quickFilterRepository, C17164e<? super QuickFilterRepository$fetch$2> eVar) {
        super(2, eVar);
        this.this$0 = quickFilterRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new QuickFilterRepository$fetch$2(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super List<QuickFilter>> eVar) {
        return ((QuickFilterRepository$fetch$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r0 = r6.L$2
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r0 = r6.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r6.L$0
            java.util.Locale r0 = (java.util.Locale) r0
            XH.y.b(r7)
            goto L_0x0072
        L_0x001e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0026:
            java.lang.Object r1 = r6.L$0
            java.util.Locale r1 = (java.util.Locale) r1
            XH.y.b(r7)
            goto L_0x004f
        L_0x002e:
            XH.y.b(r7)
            com.sugarcube.app.base.data.source.QuickFilterRepository r7 = r6.this$0
            com.sugarcube.app.base.external.config.a r7 = r7.baseConfig
            java.util.Locale r7 = r7.getLocale()
            com.sugarcube.app.base.data.source.QuickFilterRepository r1 = r6.this$0
            com.sugarcube.app.base.data.source.QuickFilterLocalDataSource r1 = r1.getLocalSource()
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r1 = r1.getAllQuickFilters(r7, r6)
            if (r1 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x004f:
            java.util.List r7 = (java.util.List) r7
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x005c
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x008a
        L_0x005c:
            com.sugarcube.app.base.data.source.QuickFilterRepository r4 = r6.this$0
            com.sugarcube.app.base.data.source.QuickFilterRemoteDataSource r4 = r4.getRemoteSource()
            r6.L$0 = r1
            r6.L$1 = r7
            r6.L$2 = r3
            r6.label = r2
            java.lang.Object r7 = r4.getAllQuickFilters(r6)
            if (r7 != r0) goto L_0x0071
            return r0
        L_0x0071:
            r0 = r1
        L_0x0072:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0089
            com.sugarcube.app.base.data.source.QuickFilterRepository r1 = r6.this$0
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x008a
            com.sugarcube.app.base.data.source.QuickFilterLocalDataSource r1 = r1.getLocalSource()
            r1.cacheQuickFilters(r7, r0)
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.QuickFilterRepository$fetch$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
