package dB;

import com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model.ShoppingListRecommendationsRemote;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H@¢\u0006\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"LdB/b;", "", "LdB/a;", "endpoint", "<init>", "(LdB/a;)V", "", "listId", "storeId", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote;", "c", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "a", "(LdI/e;)Ljava/lang/Object;", "itemNo", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "b", "LdB/a;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dB.b  reason: case insensitive filesystem */
public final class C14336b {

    /* renamed from: a  reason: collision with root package name */
    private final C14335a f126170a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.ShoppingListRecommendationsRemoteDataSource", f = "ShoppingListRecommendationsRemoteDataSource.kt", l = {22}, m = "getAccessoriesRecommendations")
    /* renamed from: dB.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f126171c;

        /* renamed from: d  reason: collision with root package name */
        Object f126172d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f126173e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14336b f126174f;

        /* renamed from: g  reason: collision with root package name */
        int f126175g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14336b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f126174f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126173e = obj;
            this.f126175g |= Integer.MIN_VALUE;
            return this.f126174f.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.ShoppingListRecommendationsRemoteDataSource", f = "ShoppingListRecommendationsRemoteDataSource.kt", l = {25}, m = "getListProductRecommendation")
    /* renamed from: dB.b$b  reason: collision with other inner class name */
    static final class C3081b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f126176c;

        /* renamed from: d  reason: collision with root package name */
        Object f126177d;

        /* renamed from: e  reason: collision with root package name */
        Object f126178e;

        /* renamed from: f  reason: collision with root package name */
        Object f126179f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f126180g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C14336b f126181h;

        /* renamed from: i  reason: collision with root package name */
        int f126182i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3081b(C14336b bVar, C17164e<? super C3081b> eVar) {
            super(eVar);
            this.f126181h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126180g = obj;
            this.f126182i |= Integer.MIN_VALUE;
            return this.f126181h.b((String) null, (String) null, this);
        }
    }

    public C14336b(C14335a aVar) {
        C17542s.j(aVar, "endpoint");
        this.f126170a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super com.ingka.ikea.core.model.product.ProductCarousel> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof dB.C14336b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            dB.b$a r0 = (dB.C14336b.a) r0
            int r1 = r0.f126175g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126175g = r1
            goto L_0x0018
        L_0x0013:
            dB.b$a r0 = new dB.b$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f126173e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126175g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f126172d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f126171c
            dB.b r6 = (dB.C14336b) r6
            XH.y.b(r1)
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            dB.a r1 = r5.f126170a
            r0.f126171c = r5
            r0.f126172d = r6
            r0.f126175g = r4
            java.lang.Object r1 = r1.c(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model.UserRecommendationsCarouselRemote r1 = (com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model.UserRecommendationsCarouselRemote) r1
            com.ingka.ikea.core.model.product.ProductCarousel r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dB.C14336b.a(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074 A[LOOP:0: B:16:0x006e->B:18:0x0074, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, dI.C17164e<? super java.util.List<com.ingka.ikea.core.model.product.ProductItem>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof dB.C14336b.C3081b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            dB.b$b r0 = (dB.C14336b.C3081b) r0
            int r1 = r0.f126182i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126182i = r1
            goto L_0x0018
        L_0x0013:
            dB.b$b r0 = new dB.b$b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f126180g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126182i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f126179f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f126178e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f126177d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f126176c
            dB.b r6 = (dB.C14336b) r6
            XH.y.b(r1)
            goto L_0x0057
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            dB.a r1 = r5.f126170a
            r0.f126176c = r5
            r0.f126177d = r6
            r0.f126178e = r7
            r0.f126179f = r8
            r0.f126182i = r4
            java.lang.Object r1 = r1.a(r6, r7, r0)
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model.ListProductRecommendationsRemote r1 = (com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model.ListProductRecommendationsRemote) r1
            java.util.List r6 = r1.b()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = YH.C16877v.y(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x006e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0082
            java.lang.Object r8 = r6.next()
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r8 = (com.ingka.ikea.core.remotemodel.product.ProductLiteRemote) r8
            com.ingka.ikea.core.model.product.ProductItem r8 = r8.s()
            r7.add(r8)
            goto L_0x006e
        L_0x0082:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dB.C14336b.b(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    public final Object c(String str, String str2, C17164e<? super ShoppingListRecommendationsRemote> eVar) {
        return this.f126170a.b(str, str2, eVar);
    }
}
