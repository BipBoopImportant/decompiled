package E1;

import G1.W;
import XH.C16807N;
import androidx.compose.ui.graphics.c;
import c2.C5267b;
import c2.n;
import c2.o;
import c2.r;
import c2.s;
import c2.t;
import kotlin.Metadata;
import nI.C17642l;
import s1.C5905c;
import tI.C17978n;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH$ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R0\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0004@DX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010*\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020&8\u0004@DX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R*\u0010-\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0004@BX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R\u0014\u0010/\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0014\u00101\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0018\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"LE1/a0;", "LE1/L;", "<init>", "()V", "LXH/N;", "H0", "Lc2/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "N0", "(JFLnI/l;)V", "Ls1/c;", "layer", "T0", "(JFLs1/c;)V", "", "<set-?>", "a", "I", "E0", "()I", "width", "b", "z0", "height", "Lc2/r;", "value", "c", "J", "B0", "()J", "W0", "(J)V", "measuredSize", "Lc2/b;", "d", "D0", "X0", "measurementConstraints", "e", "y0", "apparentToRealOffset", "C0", "measuredWidth", "z", "measuredHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a0 implements L {

    /* renamed from: a  reason: collision with root package name */
    private int f5863a;

    /* renamed from: b  reason: collision with root package name */
    private int f5864b;

    /* renamed from: c  reason: collision with root package name */
    private long f5865c = s.a(0, 0);

    /* renamed from: d  reason: collision with root package name */
    private long f5866d = b0.f5874b;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f5867e = n.f23044b.a();

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0014\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\rJ<\u0010\u0018\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001c\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ<\u0010\u000f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0019J.\u0010\u0010\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u001fJ.\u0010 \u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b \u0010\u001fJ!\u0010\"\u001a\u00020\u00052\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8$X¤\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"LE1/a0$a;", "", "<init>", "()V", "LE1/a0;", "LXH/N;", "g", "(LE1/a0;)V", "Lc2/n;", "position", "", "zIndex", "n", "(LE1/a0;JF)V", "", "x", "y", "l", "(LE1/a0;IIF)V", "h", "j", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "r", "(LE1/a0;JFLnI/l;)V", "p", "(LE1/a0;IIFLnI/l;)V", "v", "Ls1/c;", "layer", "(LE1/a0;JLs1/c;F)V", "s", "block", "B", "(LnI/l;)V", "", "a", "Z", "motionFrameOfReferencePlacement", "f", "()I", "parentWidth", "Lc2/t;", "e", "()Lc2/t;", "parentLayoutDirection", "LE1/v;", "d", "()LE1/v;", "coordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5868a;

        public static /* synthetic */ void A(a aVar, a0 a0Var, long j10, C5905c cVar, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.y(a0Var, j10, cVar, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        /* access modifiers changed from: private */
        public final void g(a0 a0Var) {
            if (a0Var instanceof W) {
                ((W) a0Var).o0(this.f5868a);
            }
        }

        public static /* synthetic */ void i(a aVar, a0 a0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.h(a0Var, i10, i11, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        public static /* synthetic */ void k(a aVar, a0 a0Var, long j10, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f10 = 0.0f;
                }
                aVar.j(a0Var, j10, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void m(a aVar, a0 a0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.l(a0Var, i10, i11, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        public static /* synthetic */ void o(a aVar, a0 a0Var, long j10, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f10 = 0.0f;
                }
                aVar.n(a0Var, j10, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        public static /* synthetic */ void q(a aVar, a0 a0Var, int i10, int i11, float f10, C17642l lVar, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                float f11 = f10;
                if ((i12 & 8) != 0) {
                    lVar = b0.f5873a;
                }
                aVar.p(a0Var, i10, i11, f11, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        public static /* synthetic */ void t(a aVar, a0 a0Var, long j10, float f10, C17642l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f10 = 0.0f;
                }
                float f11 = f10;
                if ((i10 & 4) != 0) {
                    lVar = b0.f5873a;
                }
                aVar.r(a0Var, j10, f11, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void u(a aVar, a0 a0Var, long j10, C5905c cVar, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.s(a0Var, j10, cVar, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void w(a aVar, a0 a0Var, int i10, int i11, float f10, C17642l lVar, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                float f11 = f10;
                if ((i12 & 8) != 0) {
                    lVar = b0.f5873a;
                }
                aVar.v(a0Var, i10, i11, f11, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        public static /* synthetic */ void z(a aVar, a0 a0Var, long j10, float f10, C17642l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f10 = 0.0f;
                }
                float f11 = f10;
                if ((i10 & 4) != 0) {
                    lVar = b0.f5873a;
                }
                aVar.x(a0Var, j10, f11, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        public final void B(C17642l<? super a, C16807N> lVar) {
            this.f5868a = true;
            lVar.invoke(this);
            this.f5868a = false;
        }

        public C4488v d() {
            return null;
        }

        /* access modifiers changed from: protected */
        public abstract t e();

        /* access modifiers changed from: protected */
        public abstract int f();

        public final void h(a0 a0Var, int i10, int i11, float f10) {
            long a10 = o.a(i10, i11);
            g(a0Var);
            a0Var.N0(n.l(a10, a0Var.f5867e), f10, (C17642l<? super c, C16807N>) null);
        }

        public final void j(a0 a0Var, long j10, float f10) {
            g(a0Var);
            a0Var.N0(n.l(j10, a0Var.f5867e), f10, (C17642l<? super c, C16807N>) null);
        }

        public final void l(a0 a0Var, int i10, int i11, float f10) {
            long a10 = o.a(i10, i11);
            if (e() == t.Ltr || f() == 0) {
                g(a0Var);
                a0Var.N0(n.l(a10, a0Var.f5867e), f10, (C17642l<? super c, C16807N>) null);
                return;
            }
            long a11 = o.a((f() - a0Var.E0()) - n.h(a10), n.i(a10));
            g(a0Var);
            a0Var.N0(n.l(a11, a0Var.f5867e), f10, (C17642l<? super c, C16807N>) null);
        }

        public final void n(a0 a0Var, long j10, float f10) {
            if (e() == t.Ltr || f() == 0) {
                g(a0Var);
                a0Var.N0(n.l(j10, a0Var.f5867e), f10, (C17642l<? super c, C16807N>) null);
                return;
            }
            long a10 = o.a((f() - a0Var.E0()) - n.h(j10), n.i(j10));
            g(a0Var);
            a0Var.N0(n.l(a10, a0Var.f5867e), f10, (C17642l<? super c, C16807N>) null);
        }

        public final void p(a0 a0Var, int i10, int i11, float f10, C17642l<? super c, C16807N> lVar) {
            long a10 = o.a(i10, i11);
            if (e() == t.Ltr || f() == 0) {
                g(a0Var);
                a0Var.N0(n.l(a10, a0Var.f5867e), f10, lVar);
                return;
            }
            long a11 = o.a((f() - a0Var.E0()) - n.h(a10), n.i(a10));
            g(a0Var);
            a0Var.N0(n.l(a11, a0Var.f5867e), f10, lVar);
        }

        public final void r(a0 a0Var, long j10, float f10, C17642l<? super c, C16807N> lVar) {
            if (e() == t.Ltr || f() == 0) {
                g(a0Var);
                a0Var.N0(n.l(j10, a0Var.f5867e), f10, lVar);
                return;
            }
            long a10 = o.a((f() - a0Var.E0()) - n.h(j10), n.i(j10));
            g(a0Var);
            a0Var.N0(n.l(a10, a0Var.f5867e), f10, lVar);
        }

        public final void s(a0 a0Var, long j10, C5905c cVar, float f10) {
            if (e() == t.Ltr || f() == 0) {
                g(a0Var);
                a0Var.T0(n.l(j10, a0Var.f5867e), f10, cVar);
                return;
            }
            long a10 = o.a((f() - a0Var.E0()) - n.h(j10), n.i(j10));
            g(a0Var);
            a0Var.T0(n.l(a10, a0Var.f5867e), f10, cVar);
        }

        public final void v(a0 a0Var, int i10, int i11, float f10, C17642l<? super c, C16807N> lVar) {
            long a10 = o.a(i10, i11);
            g(a0Var);
            a0Var.N0(n.l(a10, a0Var.f5867e), f10, lVar);
        }

        public final void x(a0 a0Var, long j10, float f10, C17642l<? super c, C16807N> lVar) {
            g(a0Var);
            a0Var.N0(n.l(j10, a0Var.f5867e), f10, lVar);
        }

        public final void y(a0 a0Var, long j10, C5905c cVar, float f10) {
            g(a0Var);
            a0Var.T0(n.l(j10, a0Var.f5867e), f10, cVar);
        }
    }

    private final void H0() {
        this.f5863a = C17978n.m(r.h(this.f5865c), C5267b.n(this.f5866d), C5267b.l(this.f5866d));
        this.f5864b = C17978n.m(r.g(this.f5865c), C5267b.m(this.f5866d), C5267b.k(this.f5866d));
        this.f5867e = o.a((this.f5863a - r.h(this.f5865c)) / 2, (this.f5864b - r.g(this.f5865c)) / 2);
    }

    /* access modifiers changed from: protected */
    public final long B0() {
        return this.f5865c;
    }

    public int C0() {
        return r.h(this.f5865c);
    }

    /* access modifiers changed from: protected */
    public final long D0() {
        return this.f5866d;
    }

    public final int E0() {
        return this.f5863a;
    }

    /* access modifiers changed from: protected */
    public abstract void N0(long j10, float f10, C17642l<? super c, C16807N> lVar);

    /* access modifiers changed from: protected */
    public void T0(long j10, float f10, C5905c cVar) {
        N0(j10, f10, (C17642l<? super c, C16807N>) null);
    }

    /* access modifiers changed from: protected */
    public final void W0(long j10) {
        if (!r.f(this.f5865c, j10)) {
            this.f5865c = j10;
            H0();
        }
    }

    /* access modifiers changed from: protected */
    public final void X0(long j10) {
        if (!C5267b.f(this.f5866d, j10)) {
            this.f5866d = j10;
            H0();
        }
    }

    /* access modifiers changed from: protected */
    public final long y0() {
        return this.f5867e;
    }

    public int z() {
        return r.g(this.f5865c);
    }

    public final int z0() {
        return this.f5864b;
    }
}
