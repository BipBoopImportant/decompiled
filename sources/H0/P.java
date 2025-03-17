package H0;

import B0.d0;
import N1.W;
import T1.C4832a;
import T1.C4840i;
import T1.H;
import T1.O;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001c¨\u0006#"}, d2 = {"LH0/P;", "LH0/b;", "LT1/P;", "currentValue", "LT1/H;", "offsetMapping", "LB0/d0;", "layoutResultProxy", "LH0/U;", "state", "<init>", "(LT1/P;LT1/H;LB0/d0;LH0/U;)V", "", "pagesAmount", "a0", "(LB0/d0;I)I", "Lkotlin/Function1;", "LT1/i;", "or", "", "Y", "(LnI/l;)Ljava/util/List;", "c0", "()LH0/P;", "b0", "j", "LT1/P;", "getCurrentValue", "()LT1/P;", "k", "LB0/d0;", "getLayoutResultProxy", "()LB0/d0;", "Z", "value", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class P extends C4524b<P> {

    /* renamed from: j  reason: collision with root package name */
    private final T1.P f6817j;

    /* renamed from: k  reason: collision with root package name */
    private final d0 f6818k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P(T1.P p10, H h10, d0 d0Var, U u10) {
        super(p10.f(), p10.h(), d0Var != null ? d0Var.f() : null, h10, u10, (DefaultConstructorMarker) null);
        this.f6817j = p10;
        this.f6818k = d0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a0(B0.d0 r6, int r7) {
        /*
            r5 = this;
            E1.v r0 = r6.c()
            if (r0 == 0) goto L_0x0015
            E1.v r1 = r6.b()
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r3 = 0
            r4 = 2
            o1.i r2 = E1.C4488v.T(r1, r0, r3, r4, r2)
        L_0x0013:
            if (r2 != 0) goto L_0x001b
        L_0x0015:
            o1.i$a r0 = o1.C5669i.f26706e
            o1.i r2 = r0.a()
        L_0x001b:
            T1.H r0 = r5.p()
            T1.P r1 = r5.f6817j
            long r3 = r1.h()
            int r1 = N1.W.i(r3)
            int r0 = r0.b(r1)
            N1.P r1 = r6.f()
            o1.i r0 = r1.e(r0)
            float r1 = r0.o()
            float r0 = r0.r()
            long r2 = r2.q()
            float r2 = o1.C5673m.i(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            T1.H r7 = r5.p()
            N1.P r6 = r6.f()
            long r0 = o1.C5668h.a(r1, r0)
            int r6 = r6.x(r0)
            int r6 = r7.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.P.a0(B0.d0, int):int");
    }

    public final List<C4840i> Y(C17642l<? super P, ? extends C4840i> lVar) {
        if (W.h(u())) {
            C4840i iVar = (C4840i) lVar.invoke(this);
            if (iVar != null) {
                return C16877v.e(iVar);
            }
            return null;
        }
        return C16877v.q(new C4832a("", 0), new O(W.l(u()), W.l(u())));
    }

    public final T1.P Z() {
        return T1.P.d(this.f6817j, e(), u(), (W) null, 4, (Object) null);
    }

    public final P b0() {
        d0 d0Var;
        if (w().length() > 0 && (d0Var = this.f6818k) != null) {
            T(a0(d0Var, 1));
        }
        C17542s.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final P c0() {
        d0 d0Var;
        if (w().length() > 0 && (d0Var = this.f6818k) != null) {
            T(a0(d0Var, -1));
        }
        C17542s.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
