package androidx.compose.foundation.layout;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import s0.C5866l;
import tI.C17978n;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/n;", "LG1/B;", "Landroidx/compose/ui/d$c;", "Ls0/l;", "direction", "", "fraction", "<init>", "(Ls0/l;F)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "n", "Ls0/l;", "getDirection", "()Ls0/l;", "C2", "(Ls0/l;)V", "o", "F", "getFraction", "()F", "D2", "(F)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.n  reason: case insensitive filesystem */
final class C5083n extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C5866l f18146n;

    /* renamed from: o  reason: collision with root package name */
    private float f18147o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.n$a */
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f18148c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var) {
            super(1);
            this.f18148c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.m(aVar, this.f18148c, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public C5083n(C5866l lVar, float f10) {
        this.f18146n = lVar;
        this.f18147o = f10;
    }

    public final void C2(C5866l lVar) {
        this.f18146n = lVar;
    }

    public final void D2(float f10) {
        this.f18147o = f10;
    }

    public J h(K k10, H h10, long j10) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!C5267b.h(j10) || this.f18146n == C5866l.Vertical) {
            i11 = C5267b.n(j10);
            i10 = C5267b.l(j10);
        } else {
            i11 = C17978n.m(Math.round(((float) C5267b.l(j10)) * this.f18147o), C5267b.n(j10), C5267b.l(j10));
            i10 = i11;
        }
        if (!C5267b.g(j10) || this.f18146n == C5866l.Horizontal) {
            int m10 = C5267b.m(j10);
            i12 = C5267b.k(j10);
            i13 = m10;
        } else {
            i13 = C17978n.m(Math.round(((float) C5267b.k(j10)) * this.f18147o), C5267b.m(j10), C5267b.k(j10));
            i12 = i13;
        }
        a0 i02 = h10.i0(c.a(i11, i10, i13, i12));
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(i02), 4, (Object) null);
    }
}
