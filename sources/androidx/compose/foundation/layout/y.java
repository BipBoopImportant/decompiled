package androidx.compose.foundation.layout;

import E1.C4484q;
import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import E1.r;
import G1.B;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.c;
import c2.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J#\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/y;", "LG1/B;", "Landroidx/compose/ui/d$c;", "<init>", "()V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "C2", "(LE1/K;LE1/H;J)J", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "LE1/r;", "LE1/q;", "", "height", "E", "(LE1/r;LE1/q;I)I", "width", "I", "P", "w", "", "D2", "()Z", "enforceIncoming", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class y extends d.c implements B {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f18243c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var) {
            super(1);
            this.f18243c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.o(aVar, this.f18243c, n.f23044b.a(), 0.0f, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public abstract long C2(K k10, H h10, long j10);

    public abstract boolean D2();

    public int E(r rVar, C4484q qVar, int i10) {
        return qVar.g0(i10);
    }

    public int I(r rVar, C4484q qVar, int i10) {
        return qVar.V(i10);
    }

    public int P(r rVar, C4484q qVar, int i10) {
        return qVar.h0(i10);
    }

    public final J h(K k10, H h10, long j10) {
        long C22 = C2(k10, h10, j10);
        if (D2()) {
            C22 = c.g(j10, C22);
        }
        a0 i02 = h10.i0(C22);
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(i02), 4, (Object) null);
    }

    public int w(r rVar, C4484q qVar, int i10) {
        return qVar.x(i10);
    }
}
