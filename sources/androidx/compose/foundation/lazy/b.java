package androidx.compose.foundation.lazy;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import U0.A1;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/b;", "LG1/B;", "Landroidx/compose/ui/d$c;", "", "fraction", "LU0/A1;", "", "widthState", "heightState", "<init>", "(FLU0/A1;LU0/A1;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "n", "F", "getFraction", "()F", "C2", "(F)V", "o", "LU0/A1;", "getWidthState", "()LU0/A1;", "E2", "(LU0/A1;)V", "p", "getHeightState", "D2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private float f18252n;

    /* renamed from: o  reason: collision with root package name */
    private A1<Integer> f18253o;

    /* renamed from: p  reason: collision with root package name */
    private A1<Integer> f18254p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f18255c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var) {
            super(1);
            this.f18255c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.i(aVar, this.f18255c, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public b(float f10, A1<Integer> a12, A1<Integer> a13) {
        this.f18252n = f10;
        this.f18253o = a12;
        this.f18254p = a13;
    }

    public final void C2(float f10) {
        this.f18252n = f10;
    }

    public final void D2(A1<Integer> a12) {
        this.f18254p = a12;
    }

    public final void E2(A1<Integer> a12) {
        this.f18253o = a12;
    }

    public J h(K k10, H h10, long j10) {
        A1<Integer> a12 = this.f18253o;
        int round = (a12 == null || a12.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(a12.getValue().floatValue() * this.f18252n);
        A1<Integer> a13 = this.f18254p;
        int round2 = (a13 == null || a13.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(a13.getValue().floatValue() * this.f18252n);
        int n10 = round != Integer.MAX_VALUE ? round : C5267b.n(j10);
        int m10 = round2 != Integer.MAX_VALUE ? round2 : C5267b.m(j10);
        if (round == Integer.MAX_VALUE) {
            round = C5267b.l(j10);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = C5267b.k(j10);
        }
        a0 i02 = h10.i0(c.a(n10, round, m10, round2));
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(i02), 4, (Object) null);
    }
}
