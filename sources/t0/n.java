package t0;

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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt0/A;", "state", "Lkotlin/Function1;", "Lt0/x;", "LXH/N;", "content", "Lkotlin/Function0;", "Lt0/l;", "a", "(Lt0/A;LnI/l;LU0/m;I)LnI/a;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends E {
        a(Object obj) {
            super(obj, A1.class, "value", "getValue()Ljava/lang/Object;", 0);
        }

        public Object get() {
            return ((A1) this.receiver).getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt0/j;", "b", "()Lt0/j;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<j> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<x, C16807N>> f29209c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(A1<? extends C17642l<? super x, C16807N>> a12) {
            super(0);
            this.f29209c = a12;
        }

        /* renamed from: b */
        public final j invoke() {
            return new j(this.f29209c.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt0/m;", "b", "()Lt0/m;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<m> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<j> f29210c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f29211d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.a f29212e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A1<j> a12, C5934A a10, androidx.compose.foundation.lazy.a aVar) {
            super(0);
            this.f29210c = a12;
            this.f29211d = a10;
            this.f29212e = aVar;
        }

        /* renamed from: b */
        public final m invoke() {
            j value = this.f29210c.getValue();
            return new m(this.f29211d, value, this.f29212e, new J(this.f29211d.z(), value));
        }
    }

    public static final C17631a<l> a(C5934A a10, C17642l<? super x, C16807N> lVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-343736148, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        A1<T> q10 = p1.q(lVar, mVar, (i10 >> 3) & 14);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && mVar.V(a10)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(p1.d(p1.p(), new c(p1.d(p1.p(), new b(q10)), a10, new androidx.compose.foundation.lazy.a())));
            mVar.u(D10);
        }
        C18065n nVar = (C18065n) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return nVar;
    }
}
