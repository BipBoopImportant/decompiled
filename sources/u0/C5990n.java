package u0;

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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu0/I;", "state", "Lkotlin/Function1;", "Lu0/C;", "LXH/N;", "content", "Lkotlin/Function0;", "Lu0/l;", "a", "(Lu0/I;LnI/l;LU0/m;I)LnI/a;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.n  reason: case insensitive filesystem */
public final class C5990n {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.n$a */
    /* synthetic */ class a extends E {
        a(Object obj) {
            super(obj, A1.class, "value", "getValue()Ljava/lang/Object;", 0);
        }

        public Object get() {
            return ((A1) this.receiver).getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu0/j;", "b", "()Lu0/j;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.n$b */
    static final class b extends C17544u implements C17631a<C5986j> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<C5968C, C16807N>> f29693c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(A1<? extends C17642l<? super C5968C, C16807N>> a12) {
            super(0);
            this.f29693c = a12;
        }

        /* renamed from: b */
        public final C5986j invoke() {
            return new C5986j(this.f29693c.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu0/m;", "b", "()Lu0/m;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.n$c */
    static final class c extends C17544u implements C17631a<C5989m> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C5986j> f29694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5974I f29695d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A1<C5986j> a12, C5974I i10) {
            super(0);
            this.f29694c = a12;
            this.f29695d = i10;
        }

        /* renamed from: b */
        public final C5989m invoke() {
            C5986j value = this.f29694c.getValue();
            return new C5989m(this.f29695d, value, new J(this.f29695d.x(), value));
        }
    }

    public static final C17631a<C5988l> a(C5974I i10, C17642l<? super C5968C, C16807N> lVar, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(-1898306282, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        A1<T> q10 = p1.q(lVar, mVar, (i11 >> 3) & 14);
        boolean z10 = (((i11 & 14) ^ 6) > 4 && mVar.V(i10)) || (i11 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(p1.d(p1.p(), new c(p1.d(p1.p(), new b(q10)), i10)));
            mVar.u(D10);
        }
        C18065n nVar = (C18065n) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return nVar;
    }
}
