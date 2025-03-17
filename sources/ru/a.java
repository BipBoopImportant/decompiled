package Ru;

import Dw.c;
import Dw.e;
import XH.x;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LRu/a;", "", "LDw/b;", "ongoingInStoreOrderOrderRepository", "<init>", "(LDw/b;)V", "", "orderId", "LXH/x;", "LRu/a$a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LDw/b;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Dw.b f87050a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"LRu/a$a;", "", "", "orderId", "LDw/c;", "orderStatus", "LDw/e$a;", "timeWindow", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "products", "", "totalPrice", "<init>", "(Ljava/lang/String;LDw/c;LDw/e$a;Ljava/util/List;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LDw/c;", "()LDw/c;", "c", "LDw/e$a;", "d", "()LDw/e$a;", "Ljava/util/List;", "()Ljava/util/List;", "e", "Ljava/lang/Double;", "()Ljava/lang/Double;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ru.a$a  reason: collision with other inner class name */
    public static final class C1805a {

        /* renamed from: a  reason: collision with root package name */
        private final String f87051a;

        /* renamed from: b  reason: collision with root package name */
        private final c f87052b;

        /* renamed from: c  reason: collision with root package name */
        private final e.a f87053c;

        /* renamed from: d  reason: collision with root package name */
        private final List<ProductItem> f87054d;

        /* renamed from: e  reason: collision with root package name */
        private final Double f87055e;

        public C1805a(String str, c cVar, e.a aVar, List<ProductItem> list, Double d10) {
            C17542s.j(str, "orderId");
            C17542s.j(cVar, "orderStatus");
            C17542s.j(aVar, "timeWindow");
            C17542s.j(list, "products");
            this.f87051a = str;
            this.f87052b = cVar;
            this.f87053c = aVar;
            this.f87054d = list;
            this.f87055e = d10;
        }

        public final String a() {
            return this.f87051a;
        }

        public final c b() {
            return this.f87052b;
        }

        public final List<ProductItem> c() {
            return this.f87054d;
        }

        public final e.a d() {
            return this.f87053c;
        }

        public final Double e() {
            return this.f87055e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1805a)) {
                return false;
            }
            C1805a aVar = (C1805a) obj;
            return C17542s.e(this.f87051a, aVar.f87051a) && this.f87052b == aVar.f87052b && C17542s.e(this.f87053c, aVar.f87053c) && C17542s.e(this.f87054d, aVar.f87054d) && C17542s.e(this.f87055e, aVar.f87055e);
        }

        public int hashCode() {
            int hashCode = ((((((this.f87051a.hashCode() * 31) + this.f87052b.hashCode()) * 31) + this.f87053c.hashCode()) * 31) + this.f87054d.hashCode()) * 31;
            Double d10 = this.f87055e;
            return hashCode + (d10 == null ? 0 : d10.hashCode());
        }

        public String toString() {
            String str = this.f87051a;
            c cVar = this.f87052b;
            e.a aVar = this.f87053c;
            List<ProductItem> list = this.f87054d;
            Double d10 = this.f87055e;
            return "OrderInfo(orderId=" + str + ", orderStatus=" + cVar + ", timeWindow=" + aVar + ", products=" + list + ", totalPrice=" + d10 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instorepurchasestatus.impl.presentation.usecase.LoadOngoingInStoreOrderUseCase", f = "LoadOngoingInStoreOrderUseCase.kt", l = {21}, m = "invoke-gIAlu-s")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87056c;

        /* renamed from: d  reason: collision with root package name */
        Object f87057d;

        /* renamed from: e  reason: collision with root package name */
        Object f87058e;

        /* renamed from: f  reason: collision with root package name */
        Object f87059f;

        /* renamed from: g  reason: collision with root package name */
        Object f87060g;

        /* renamed from: h  reason: collision with root package name */
        int f87061h;

        /* renamed from: i  reason: collision with root package name */
        int f87062i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f87063j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a f87064k;

        /* renamed from: l  reason: collision with root package name */
        int f87065l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f87064k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f87063j = obj;
            this.f87065l |= Integer.MIN_VALUE;
            Object a10 = this.f87064k.a((String) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public a(Dw.b bVar) {
        C17542s.j(bVar, "ongoingInStoreOrderOrderRepository");
        this.f87050a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A[Catch:{ CancellationException -> 0x0040, all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[Catch:{ CancellationException -> 0x0040, all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r10, dI.C17164e<? super XH.x<Ru.a.C1805a>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof Ru.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Ru.a$b r0 = (Ru.a.b) r0
            int r1 = r0.f87065l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87065l = r1
            goto L_0x0018
        L_0x0013:
            Ru.a$b r0 = new Ru.a$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f87063j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f87065l
            r4 = 1
            if (r3 == 0) goto L_0x004a
            if (r3 != r4) goto L_0x0042
            java.lang.Object r10 = r0.f87060g
            Ru.a r10 = (Ru.a) r10
            java.lang.Object r10 = r0.f87059f
            Ru.a r10 = (Ru.a) r10
            java.lang.Object r10 = r0.f87058e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f87057d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.f87056c
            Ru.a r11 = (Ru.a) r11
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
        L_0x003c:
            r4 = r10
            goto L_0x006d
        L_0x003e:
            r10 = move-exception
            goto L_0x00a0
        L_0x0040:
            r10 = move-exception
            goto L_0x00ab
        L_0x0042:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            Dw.b r1 = r9.f87050a     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            TJ.g r1 = r1.a(r10)     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r0.f87056c = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r0.f87057d = r10     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r0.f87058e = r11     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r0.f87059f = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r0.f87060g = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r11 = 0
            r0.f87061h = r11     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r0.f87062i = r11     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r0.f87065l = r4     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            java.lang.Object r1 = TJ.C16534i.D(r1, r0)     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            if (r1 != r2) goto L_0x003c
            return r2
        L_0x006d:
            if (r1 == 0) goto L_0x0098
            Dw.a r1 = (Dw.C12792a) r1     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            Ru.a$a r10 = new Ru.a$a     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            Dw.e r11 = r1.d()     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            Dw.c r5 = r11.c()     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            Dw.e r11 = r1.d()     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            Dw.e$a r6 = r11.f()     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            Dw.e r11 = r1.d()     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            java.util.List r7 = r11.d()     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            java.lang.Double r8 = r1.e()     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            java.lang.Object r10 = XH.x.b(r10)     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            goto L_0x00aa
        L_0x0098:
            java.lang.String r10 = "Required value was null."
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            r11.<init>(r10)     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
            throw r11     // Catch:{ CancellationException -> 0x0040, all -> 0x003e }
        L_0x00a0:
            XH.x$a r11 = XH.x.f139812b
            java.lang.Object r10 = XH.y.a(r10)
            java.lang.Object r10 = XH.x.b(r10)
        L_0x00aa:
            return r10
        L_0x00ab:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Ru.a.a(java.lang.String, dI.e):java.lang.Object");
    }
}
