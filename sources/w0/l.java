package w0;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.E;
import nI.C17631a;
import nI.C17642l;
import uI.C18065n;
import v0.J;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw0/E;", "state", "Lkotlin/Function1;", "Lw0/y;", "LXH/N;", "content", "Lkotlin/Function0;", "Lw0/j;", "a", "(Lw0/E;LnI/l;LU0/m;I)LnI/a;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends E {
        a(Object obj) {
            super(obj, A1.class, "value", "getValue()Ljava/lang/Object;", 0);
        }

        public Object get() {
            return ((A1) this.receiver).getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw0/h;", "b", "()Lw0/h;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C6201h> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<y, C16807N>> f31209c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(A1<? extends C17642l<? super y, C16807N>> a12) {
            super(0);
            this.f31209c = a12;
        }

        /* renamed from: b */
        public final C6201h invoke() {
            return new C6201h(this.f31209c.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw0/k;", "b", "()Lw0/k;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<k> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C6201h> f31210c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6192E f31211d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A1<C6201h> a12, C6192E e10) {
            super(0);
            this.f31210c = a12;
            this.f31211d = e10;
        }

        /* renamed from: b */
        public final k invoke() {
            C6201h value = this.f31210c.getValue();
            return new k(this.f31211d, value, new J(this.f31211d.z(), value));
        }
    }

    public static final C17631a<j> a(C6192E e10, C17642l<? super y, C16807N> lVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(690901732, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:40)");
        }
        A1<T> q10 = p1.q(lVar, mVar, (i10 >> 3) & 14);
        boolean V10 = mVar.V(e10);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(p1.d(p1.p(), new c(p1.d(p1.p(), new b(q10)), e10)));
            mVar.u(D10);
        }
        C18065n nVar = (C18065n) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return nVar;
    }
}
