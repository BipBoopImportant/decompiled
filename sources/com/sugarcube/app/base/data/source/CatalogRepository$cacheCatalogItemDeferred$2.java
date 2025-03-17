package com.sugarcube.app.base.data.source;

import QJ.Q;
import QJ.T;
import QJ.Y;
import XH.C16807N;
import XH.y;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.CatalogItem;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "LQJ/Y;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "<anonymous>", "(LQJ/Q;)LQJ/Y;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2", f = "CatalogRepository.kt", l = {}, m = "invokeSuspend")
final class CatalogRepository$cacheCatalogItemDeferred$2 extends l implements p<Q, C17164e<? super Y<? extends CachedCatalogItem>>, Object> {
    final /* synthetic */ int $flags;
    final /* synthetic */ CatalogItem $item;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CatalogRepository this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/app/base/data/database/CachedCatalogItem;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2$1", f = "CatalogRepository.kt", l = {569, 573, 579}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p<Q, C17164e<? super CachedCatalogItem>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new AnonymousClass1(catalogItem, i10, catalogRepository, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super CachedCatalogItem> eVar) {
            return ((AnonymousClass1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0108  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.label
                java.lang.String r3 = ""
                r4 = 3
                r5 = 2
                r6 = 0
                r7 = 0
                r8 = 1
                if (r2 == 0) goto L_0x004a
                if (r2 == r8) goto L_0x0044
                if (r2 == r5) goto L_0x0035
                if (r2 != r4) goto L_0x002d
                int r1 = r0.I$0
                java.lang.Object r2 = r0.L$2
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r2 = r0.L$1
                java.io.File r2 = (java.io.File) r2
                java.lang.Object r3 = r0.L$0
                java.io.File r3 = (java.io.File) r3
                XH.y.b(r20)
                r9 = r3
                r3 = r20
                goto L_0x00fb
            L_0x002d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0035:
                java.lang.Object r2 = r0.L$1
                java.io.File r2 = (java.io.File) r2
                java.lang.Object r2 = r0.L$0
                java.io.File r2 = (java.io.File) r2
                XH.y.b(r20)
                r9 = r2
                r2 = r20
                goto L_0x0098
            L_0x0044:
                XH.y.b(r20)
                r2 = r20
                goto L_0x006b
            L_0x004a:
                XH.y.b(r20)
                com.sugarcube.core.network.models.CatalogItem r2 = r7
                java.lang.Integer r2 = r2.getId()
                com.sugarcube.core.network.models.CatalogItem r9 = r7
                android.net.Uri r9 = r9.getAssetUrl()
                com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2$1$1 r10 = new com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2$1$1
                int r11 = r1
                com.sugarcube.app.base.data.source.CatalogRepository r12 = r2
                r10.<init>(r11, r12, r7)
                r0.label = r8
                java.lang.Object r2 = NF.C13291e.d(r2, r9, r10, r0)
                if (r2 != r1) goto L_0x006b
                return r1
            L_0x006b:
                java.io.File r2 = (java.io.File) r2
                if (r2 != 0) goto L_0x0075
                java.io.File r9 = new java.io.File
                r9.<init>(r3)
                goto L_0x0076
            L_0x0075:
                r9 = r2
            L_0x0076:
                com.sugarcube.core.network.models.CatalogItem r10 = r7
                java.lang.Integer r10 = r10.getId()
                com.sugarcube.core.network.models.CatalogItem r11 = r7
                android.net.Uri r11 = r11.getThumbUrl()
                com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2$1$2 r12 = new com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2$1$2
                int r13 = r1
                com.sugarcube.app.base.data.source.CatalogRepository r14 = r2
                r12.<init>(r13, r14, r7)
                r0.L$0 = r9
                r0.L$1 = r2
                r0.label = r5
                java.lang.Object r2 = NF.C13291e.d(r10, r11, r12, r0)
                if (r2 != r1) goto L_0x0098
                return r1
            L_0x0098:
                java.io.File r2 = (java.io.File) r2
                if (r2 != 0) goto L_0x00a1
                java.io.File r2 = new java.io.File
                r2.<init>(r3)
            L_0x00a1:
                com.sugarcube.core.network.models.CatalogItem r3 = r7
                java.util.List r3 = r3.getFeatures()
                if (r3 == 0) goto L_0x00b3
                java.lang.String r5 = "draco"
                boolean r5 = r3.contains(r5)
                if (r5 != r8) goto L_0x00b3
                r5 = r8
                goto L_0x00b4
            L_0x00b3:
                r5 = r6
            L_0x00b4:
                com.sugarcube.core.network.models.CatalogItem r10 = r7
                java.lang.Boolean r10 = r10.getHidden()
                java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r8)
                boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r11)
                if (r10 != 0) goto L_0x00ff
                com.sugarcube.core.network.models.CatalogItem r10 = r7
                boolean r10 = r10.isCombinable()
                if (r10 == 0) goto L_0x00ff
                com.sugarcube.core.network.models.CatalogItem r10 = r7
                boolean r10 = r10.isCombinableParent()
                if (r10 == 0) goto L_0x00ff
                com.sugarcube.core.network.models.CatalogItem r10 = r7
                java.lang.String r10 = r10.getCombinableSize()
                com.sugarcube.core.network.models.CatalogItem r11 = r7
                java.lang.String r11 = r11.getCombinableVariant()
                com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2$1$3 r12 = new com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2$1$3
                int r13 = r1
                com.sugarcube.app.base.data.source.CatalogRepository r14 = r2
                r12.<init>(r13, r14, r7)
                r0.L$0 = r9
                r0.L$1 = r2
                r0.L$2 = r3
                r0.I$0 = r5
                r0.label = r4
                java.lang.Object r3 = NF.C13291e.d(r10, r11, r12, r0)
                if (r3 != r1) goto L_0x00fa
                return r1
            L_0x00fa:
                r1 = r5
            L_0x00fb:
                r7 = r3
                java.util.Map r7 = (java.util.Map) r7
                r5 = r1
            L_0x00ff:
                r12 = r2
                r15 = r7
                r11 = r9
                com.sugarcube.app.base.data.database.CachedCatalogItem r1 = new com.sugarcube.app.base.data.database.CachedCatalogItem
                if (r5 == 0) goto L_0x0108
                r13 = r8
                goto L_0x0109
            L_0x0108:
                r13 = r6
            L_0x0109:
                com.sugarcube.core.network.models.CatalogItem r2 = r7
                r17 = 8
                r18 = 0
                r14 = 0
                r10 = r1
                r16 = r2
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItemDeferred$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CatalogRepository$cacheCatalogItemDeferred$2(CatalogItem catalogItem, int i10, CatalogRepository catalogRepository, C17164e<? super CatalogRepository$cacheCatalogItemDeferred$2> eVar) {
        super(2, eVar);
        this.$item = catalogItem;
        this.$flags = i10;
        this.this$0 = catalogRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        CatalogRepository$cacheCatalogItemDeferred$2 catalogRepository$cacheCatalogItemDeferred$2 = new CatalogRepository$cacheCatalogItemDeferred$2(this.$item, this.$flags, this.this$0, eVar);
        catalogRepository$cacheCatalogItemDeferred$2.L$0 = obj;
        return catalogRepository$cacheCatalogItemDeferred$2;
    }

    public final Object invoke(Q q10, C17164e<? super Y<CachedCatalogItem>> eVar) {
        return ((CatalogRepository$cacheCatalogItemDeferred$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        if (this.label == 0) {
            y.b(obj);
            final CatalogItem catalogItem = this.$item;
            final int i10 = this.$flags;
            final CatalogRepository catalogRepository = this.this$0;
            return C16314k.b((Q) this.L$0, (C17168i) null, (T) null, new AnonymousClass1((C17164e<? super AnonymousClass1>) null), 3, (Object) null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
