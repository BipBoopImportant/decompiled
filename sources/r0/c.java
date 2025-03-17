package R0;

import L1.o;
import L1.v;
import L1.x;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.material3.pulltorefresh.PullToRefreshElement;
import androidx.compose.ui.d;
import f1.C5301c;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5534c;
import m0.C5548j;
import m0.M;
import m0.y0;
import n0.C5603i;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5670j;
import o1.C5673m;
import o1.C5674n;
import p1.C5745u0;
import p1.C5747v0;
import p1.C5749w0;
import p1.U0;
import p1.V0;
import p1.W0;
import p1.Y;
import p1.i1;
import p1.k1;
import r1.C5817c;
import r1.k;
import s0.C5857c;
import tI.C17978n;

@Metadata(d1 = {"\u0000n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u001am\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aN\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aH\u0010\u001b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a(\u0010\"\u001a\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00022\u0006\u0010!\u001a\u00020\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a>\u0010+\u001a\u00020\u0003*\u00020$2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010-\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b-\u0010.\u001aF\u00102\u001a\u00020\u0003*\u00020$2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020(2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\"\u0014\u00105\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u00104\"\u0014\u00106\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u00104\"\u001a\u0010:\u001a\u00020\u00118\u0000X\u0004¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00109\"\u001a\u0010<\u001a\u00020\u00118\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b;\u00109\"\u0014\u0010>\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u00104\"\u0014\u0010@\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u00104\"\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010C\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F²\u0006\f\u0010E\u001a\u00020\u001f8\nX\u0002"}, d2 = {"", "isRefreshing", "Lkotlin/Function0;", "LXH/N;", "onRefresh", "Landroidx/compose/ui/d;", "modifier", "LR0/e;", "state", "Li1/c;", "contentAlignment", "Lkotlin/Function1;", "Ls0/c;", "indicator", "content", "d", "(ZLnI/a;Landroidx/compose/ui/d;LR0/e;Li1/c;LnI/q;LnI/q;LU0/m;II)V", "Lc2/h;", "threshold", "Lp1/i1;", "shape", "Lp1/v0;", "containerColor", "elevation", "p", "(Landroidx/compose/ui/d;LR0/e;ZFLp1/i1;JF)Landroidx/compose/ui/d;", "enabled", "n", "(Landroidx/compose/ui/d;ZLR0/e;ZFLnI/a;)Landroidx/compose/ui/d;", "r", "(LU0/m;I)LR0/e;", "", "progress", "color", "b", "(LnI/a;JLU0/m;I)V", "Lr1/f;", "alpha", "LR0/a;", "values", "Lo1/i;", "arcBounds", "strokeWidth", "l", "(Lr1/f;JFLR0/a;Lo1/i;F)V", "a", "(F)LR0/a;", "Lp1/U0;", "arrow", "bounds", "k", "(Lr1/f;Lp1/U0;Lo1/i;JFLR0/a;F)V", "F", "StrokeWidth", "ArcRadius", "c", "m", "()F", "SpinnerSize", "getSpinnerContainerSize", "SpinnerContainerSize", "e", "ArrowWidth", "f", "ArrowHeight", "Lm0/y0;", "g", "Lm0/y0;", "AlphaTween", "targetAlpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f12205a = c2.h.B((float) 2.5d);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f12206b = c2.h.B((float) 5.5d);

    /* renamed from: c  reason: collision with root package name */
    private static final float f12207c = c2.h.B((float) 16);

    /* renamed from: d  reason: collision with root package name */
    private static final float f12208d = c2.h.B((float) 40);

    /* renamed from: e  reason: collision with root package name */
    private static final float f12209e = c2.h.B((float) 10);

    /* renamed from: f  reason: collision with root package name */
    private static final float f12210f = c2.h.B((float) 5);

    /* renamed from: g  reason: collision with root package name */
    private static final y0<Float> f12211g = C5548j.j(300, 0, M.e(), 2, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f12212c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<Float> aVar) {
            super(1);
            this.f12212c = aVar;
        }

        public final void a(x xVar) {
            v.k0(xVar, new L1.h(this.f12212c.invoke().floatValue(), C17978n.c(0.0f, 1.0f), 0));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f12213c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<Float> f12214d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f12215e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ U0 f12216f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17631a<Float> aVar, A1<Float> a12, long j10, U0 u02) {
            super(1);
            this.f12213c = aVar;
            this.f12214d = a12;
            this.f12215e = j10;
            this.f12216f = u02;
        }

        public final void a(r1.f fVar) {
            long j10;
            r1.f fVar2 = fVar;
            a e10 = c.a(this.f12213c.invoke().floatValue());
            float floatValue = this.f12214d.getValue().floatValue();
            float b10 = e10.b();
            long j11 = this.f12215e;
            U0 u02 = this.f12216f;
            long N12 = fVar.N1();
            r1.d I12 = fVar.I1();
            long b11 = I12.b();
            I12.e().t();
            try {
                I12.c().g(b10, N12);
                C5669i b12 = C5670j.b(C5674n.b(fVar.b()), fVar2.H1(c.f12206b) + (fVar2.H1(c.f12205a) / 2.0f));
                long j12 = b11;
                try {
                    c.l(fVar, j11, floatValue, e10, b12, c.f12205a);
                    c.k(fVar, u02, b12, j11, floatValue, e10, c.f12205a);
                    I12.e().n();
                    I12.g(j12);
                } catch (Throwable th2) {
                    th = th2;
                    j10 = j12;
                    I12.e().n();
                    I12.g(j10);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j10 = b11;
                I12.e().n();
                I12.g(j10);
                throw th;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: R0.c$c  reason: collision with other inner class name */
    static final class C0187c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f12217c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f12218d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f12219e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0187c(C17631a<Float> aVar, long j10, int i10) {
            super(2);
            this.f12217c = aVar;
            this.f12218d = j10;
            this.f12219e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            c.b(this.f12217c, this.f12218d, mVar, M0.a(this.f12219e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f12220c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17631a<Float> aVar) {
            super(0);
            this.f12220c = aVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            float f10 = 1.0f;
            if (this.f12220c.invoke().floatValue() < 1.0f) {
                f10 = 0.3f;
            }
            return Float.valueOf(f10);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f12221c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f12222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(e eVar, boolean z10) {
            super(3);
            this.f12221c = eVar;
            this.f12222d = z10;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            int i11;
            C5857c cVar2 = cVar;
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar.V(cVar2) ? 4 : 2);
            } else {
                C4889m mVar2 = mVar;
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1989171225, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:127)");
                }
                b.f12188a.a(this.f12221c, this.f12222d, cVar2.a(androidx.compose.ui.d.f18749a, C5437c.f24302a.m()), 0, 0, 0.0f, mVar, 1572864, 56);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f12223c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f12224d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f12225e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f12226f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5437c f12227g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q<C5857c, C4889m, Integer, C16807N> f12228h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q<C5857c, C4889m, Integer, C16807N> f12229i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f12230j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f12231k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(boolean z10, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, e eVar, C5437c cVar, q<? super C5857c, ? super C4889m, ? super Integer, C16807N> qVar, q<? super C5857c, ? super C4889m, ? super Integer, C16807N> qVar2, int i10, int i11) {
            super(2);
            this.f12223c = z10;
            this.f12224d = aVar;
            this.f12225e = dVar;
            this.f12226f = eVar;
            this.f12227g = cVar;
            this.f12228h = qVar;
            this.f12229i = qVar2;
            this.f12230j = i10;
            this.f12231k = i11;
        }

        public final void a(C4889m mVar, int i10) {
            c.d(this.f12223c, this.f12224d, this.f12225e, this.f12226f, this.f12227g, this.f12228h, this.f12229i, mVar, M0.a(this.f12230j | 1), this.f12231k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/c;", "LXH/N;", "a", "(Lr1/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<C5817c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f12232c = new g();

        g() {
            super(1);
        }

        public final void a(C5817c cVar) {
            int b10 = C5745u0.f27347a.b();
            r1.d I12 = cVar.I1();
            long b11 = I12.b();
            I12.e().t();
            try {
                I12.c().c(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, b10);
                cVar.V1();
            } finally {
                I12.e().n();
                I12.g(b11);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5817c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<androidx.compose.ui.graphics.c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f12233c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f12234d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f12235e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f12236f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i1 f12237g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, boolean z10, float f10, float f11, i1 i1Var) {
            super(1);
            this.f12233c = eVar;
            this.f12234d = z10;
            this.f12235e = f10;
            this.f12236f = f11;
            this.f12237g = i1Var;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            float f10 = 0.0f;
            boolean z10 = this.f12233c.a() > 0.0f || this.f12234d;
            cVar.e((this.f12233c.a() * ((float) cVar.K0(this.f12235e))) - C5673m.i(cVar.b()));
            if (z10) {
                f10 = cVar.H1(this.f12236f);
            }
            cVar.G(f10);
            cVar.Z(this.f12237g);
            cVar.A(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LR0/f;", "b", "()LR0/f;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17631a<f> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f12238c = new i();

        i() {
            super(0);
        }

        /* renamed from: b */
        public final f invoke() {
            return new f();
        }
    }

    /* access modifiers changed from: private */
    public static final a a(float f10) {
        float max = (Math.max(Math.min(1.0f, f10) - 0.4f, 0.0f) * ((float) 5)) / ((float) 3);
        float l10 = C17978n.l(Math.abs(f10) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 16.0f) + (l10 - (((float) Math.pow((double) l10, (double) 2)) / ((float) 4)))) * 0.5f;
        float f11 = (float) 360;
        return new a(pow, pow * f11, ((0.8f * max) + pow) * f11, Math.min(1.0f, max));
    }

    /* access modifiers changed from: private */
    public static final void b(C17631a<Float> aVar, long j10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C17631a<Float> aVar2 = aVar;
        long j11 = j10;
        int i12 = i10;
        C4889m k10 = mVar.k(-569718810);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.e(j11) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-569718810, i11, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:561)");
            }
            Object D10 = k10.D();
            C4889m.a aVar3 = C4889m.f14007a;
            U0 u02 = D10;
            if (D10 == aVar3.a()) {
                U0 a10 = Y.a();
                a10.k(W0.f27257b.a());
                k10.u(a10);
                u02 = a10;
            }
            U0 u03 = (U0) u02;
            Object D11 = k10.D();
            if (D11 == aVar3.a()) {
                D11 = p1.e(new d(aVar2));
                k10.u(D11);
            }
            A1<Float> d10 = C5534c.d(c((A1) D11), f12211g, 0.0f, (String) null, (C17642l<? super Float, C16807N>) null, k10, 48, 28);
            d.a aVar4 = androidx.compose.ui.d.f18749a;
            int i13 = i11 & 14;
            boolean z10 = true;
            boolean z11 = i13 == 4;
            Object D12 = k10.D();
            if (z11 || D12 == aVar3.a()) {
                D12 = new a(aVar2);
                k10.u(D12);
            }
            androidx.compose.ui.d t10 = J.t(o.c(aVar4, true, (C17642l) D12), f12207c);
            boolean V10 = (i13 == 4) | k10.V(d10);
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean F10 = V10 | z10 | k10.F(u03);
            Object D13 = k10.D();
            if (F10 || D13 == aVar3.a()) {
                mVar2 = k10;
                b bVar = new b(aVar, d10, j10, u03);
                mVar2.u(bVar);
                D13 = bVar;
            } else {
                mVar2 = k10;
            }
            C5603i.a(t10, (C17642l) D13, mVar2, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C0187c(aVar2, j11, i12));
        }
    }

    private static final float c(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(boolean r20, nI.C17631a<XH.C16807N> r21, androidx.compose.ui.d r22, R0.e r23, i1.C5437c r24, nI.q<? super s0.C5857c, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r25, nI.q<? super s0.C5857c, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r26, U0.C4889m r27, int r28, int r29) {
        /*
            r8 = r20
            r9 = r26
            r10 = r28
            r0 = 1902956467(0x716ccfb3, float:1.1726329E30)
            r1 = r27
            U0.m r11 = r1.k(r0)
            r1 = r29 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r11.b(r8)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r10
            goto L_0x0026
        L_0x0025:
            r1 = r10
        L_0x0026:
            r2 = r29 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            r12 = r21
            goto L_0x0041
        L_0x002f:
            r2 = r10 & 48
            r12 = r21
            if (r2 != 0) goto L_0x0041
            boolean r2 = r11.F(r12)
            if (r2 == 0) goto L_0x003e
            r2 = 32
            goto L_0x0040
        L_0x003e:
            r2 = 16
        L_0x0040:
            r1 = r1 | r2
        L_0x0041:
            r2 = r29 & 4
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r3 = r22
            goto L_0x005c
        L_0x004a:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0047
            r3 = r22
            boolean r4 = r11.V(r3)
            if (r4 == 0) goto L_0x0059
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r4
        L_0x005c:
            r4 = r10 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0075
            r4 = r29 & 8
            if (r4 != 0) goto L_0x006f
            r4 = r23
            boolean r5 = r11.V(r4)
            if (r5 == 0) goto L_0x0071
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x006f:
            r4 = r23
        L_0x0071:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r1 = r1 | r5
            goto L_0x0077
        L_0x0075:
            r4 = r23
        L_0x0077:
            r5 = r29 & 16
            if (r5 == 0) goto L_0x0080
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r6 = r24
            goto L_0x0092
        L_0x0080:
            r6 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x007d
            r6 = r24
            boolean r7 = r11.V(r6)
            if (r7 == 0) goto L_0x008f
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r7
        L_0x0092:
            r7 = r29 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r7 == 0) goto L_0x009c
            r1 = r1 | r13
        L_0x0099:
            r13 = r25
            goto L_0x00ad
        L_0x009c:
            r13 = r13 & r10
            if (r13 != 0) goto L_0x0099
            r13 = r25
            boolean r14 = r11.F(r13)
            if (r14 == 0) goto L_0x00aa
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r14
        L_0x00ad:
            r14 = r29 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00b5
            r1 = r1 | r15
            goto L_0x00c5
        L_0x00b5:
            r14 = r10 & r15
            if (r14 != 0) goto L_0x00c5
            boolean r14 = r11.F(r9)
            if (r14 == 0) goto L_0x00c2
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c2:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r1 = r1 | r14
        L_0x00c5:
            r14 = 599187(0x92493, float:8.3964E-40)
            r14 = r14 & r1
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r15) goto L_0x00dc
            boolean r14 = r11.l()
            if (r14 != 0) goto L_0x00d5
            goto L_0x00dc
        L_0x00d5:
            r11.L()
            r5 = r6
            r6 = r13
            goto L_0x01f4
        L_0x00dc:
            r11.G()
            r14 = r10 & 1
            r15 = 0
            if (r14 == 0) goto L_0x00fa
            boolean r14 = r11.O()
            if (r14 == 0) goto L_0x00eb
            goto L_0x00fa
        L_0x00eb:
            r11.L()
            r2 = r29 & 8
            if (r2 == 0) goto L_0x00f4
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f4:
            r5 = r1
            r14 = r4
            r7 = r6
            r6 = r13
            r13 = r3
            goto L_0x0131
        L_0x00fa:
            if (r2 == 0) goto L_0x00ff
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x0100
        L_0x00ff:
            r2 = r3
        L_0x0100:
            r3 = r29 & 8
            if (r3 == 0) goto L_0x010b
            R0.e r3 = r(r11, r15)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x010c
        L_0x010b:
            r3 = r4
        L_0x010c:
            if (r5 == 0) goto L_0x0115
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.o()
            r6 = r4
        L_0x0115:
            if (r7 == 0) goto L_0x012c
            R0.c$e r4 = new R0.c$e
            r4.<init>(r3, r8)
            r5 = 54
            r7 = 1989171225(0x76905819, float:1.4638234E33)
            r13 = 1
            c1.a r4 = c1.c.e(r7, r13, r4, r11, r5)
            r5 = r1
            r13 = r2
            r14 = r3
            r7 = r6
            r6 = r4
            goto L_0x0131
        L_0x012c:
            r5 = r1
            r14 = r3
            r7 = r6
            r6 = r13
            r13 = r2
        L_0x0131:
            r11.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0140
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:134)"
            U0.C4895p.S(r0, r5, r1, r2)
        L_0x0140:
            r16 = 12
            r17 = 0
            r3 = 0
            r4 = 0
            r0 = r13
            r1 = r20
            r2 = r14
            r18 = r5
            r5 = r21
            r19 = r6
            r6 = r16
            r8 = r7
            r7 = r17
            androidx.compose.ui.d r0 = o(r0, r1, r2, r3, r4, r5, r6, r7)
            E1.I r1 = androidx.compose.foundation.layout.C5077h.h(r8, r15)
            int r2 = U0.C4883j.a(r11, r15)
            U0.y r3 = r11.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r11, r0)
            G1.g$a r4 = G1.C4504g.f6515W
            nI.a r5 = r4.a()
            U0.f r6 = r11.m()
            if (r6 != 0) goto L_0x0178
            U0.C4883j.c()
        L_0x0178:
            r11.I()
            boolean r6 = r11.i()
            if (r6 == 0) goto L_0x0185
            r11.p(r5)
            goto L_0x0188
        L_0x0185:
            r11.t()
        L_0x0188:
            U0.m r5 = U0.F1.a(r11)
            nI.p r6 = r4.c()
            U0.F1.c(r5, r1, r6)
            nI.p r1 = r4.e()
            U0.F1.c(r5, r3, r1)
            nI.p r1 = r4.b()
            boolean r3 = r5.i()
            if (r3 != 0) goto L_0x01b2
            java.lang.Object r3 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 != 0) goto L_0x01c0
        L_0x01b2:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.w(r2, r1)
        L_0x01c0:
            nI.p r1 = r4.d()
            U0.F1.c(r5, r0, r1)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            int r1 = r18 >> 15
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 6
            r1 = r1 | r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r0, r11, r1)
            int r1 = r18 >> 12
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = r19
            r4.invoke(r0, r11, r1)
            r11.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f0
            U0.C4895p.R()
        L_0x01f0:
            r6 = r4
            r5 = r8
            r3 = r13
            r4 = r14
        L_0x01f4:
            U0.Y0 r11 = r11.n()
            if (r11 == 0) goto L_0x020d
            R0.c$f r13 = new R0.c$f
            r0 = r13
            r1 = r20
            r2 = r21
            r7 = r26
            r8 = r28
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r13)
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.c.d(boolean, nI.a, androidx.compose.ui.d, R0.e, i1.c, nI.q, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void k(r1.f fVar, U0 u02, C5669i iVar, long j10, float f10, a aVar, float f11) {
        r1.f fVar2 = fVar;
        U0 u03 = u02;
        float f12 = f11;
        u02.a();
        u03.b(0.0f, 0.0f);
        float f13 = f12209e;
        u03.d((fVar2.H1(f13) * aVar.c()) / ((float) 2), fVar2.H1(f12210f) * aVar.c());
        u03.d(fVar2.H1(f13) * aVar.c(), 0.0f);
        u03.p(C5668h.a(((Math.min(iVar.t(), iVar.n()) / 2.0f) + C5667g.m(iVar.m())) - ((fVar2.H1(f13) * aVar.c()) / 2.0f), C5667g.n(iVar.m()) - fVar2.H1(f12)));
        float a10 = aVar.a() - fVar2.H1(f12);
        long N12 = fVar.N1();
        r1.d I12 = fVar.I1();
        long b10 = I12.b();
        I12.e().t();
        try {
            I12.c().g(a10, N12);
            r1.f.j1(fVar, u02, j10, f10, new k(fVar2.H1(f12), 0.0f, 0, 0, (V0) null, 30, (DefaultConstructorMarker) null), (C5749w0) null, 0, 48, (Object) null);
        } finally {
            I12.e().n();
            I12.g(b10);
        }
    }

    /* access modifiers changed from: private */
    public static final void l(r1.f fVar, long j10, float f10, a aVar, C5669i iVar, float f11) {
        r1.f fVar2 = fVar;
        r1.f.V0(fVar2, j10, aVar.d(), aVar.a() - aVar.d(), false, iVar.s(), iVar.q(), f10, new k(fVar2.H1(f11), 0.0f, k1.f27320b.a(), 0, (V0) null, 26, (DefaultConstructorMarker) null), (C5749w0) null, 0, 768, (Object) null);
    }

    public static final float m() {
        return f12207c;
    }

    public static final androidx.compose.ui.d n(androidx.compose.ui.d dVar, boolean z10, e eVar, boolean z11, float f10, C17631a<C16807N> aVar) {
        return dVar.s(new PullToRefreshElement(z10, aVar, z11, eVar, f10, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ androidx.compose.ui.d o(androidx.compose.ui.d dVar, boolean z10, e eVar, boolean z11, float f10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 8) != 0) {
            f10 = b.f12188a.e();
        }
        return n(dVar, z10, eVar, z12, f10, aVar);
    }

    public static final androidx.compose.ui.d p(androidx.compose.ui.d dVar, e eVar, boolean z10, float f10, i1 i1Var, long j10, float f11) {
        return androidx.compose.foundation.b.c(androidx.compose.ui.graphics.b.a(androidx.compose.ui.draw.b.d(J.t(dVar, f12208d), g.f12232c), new h(eVar, z10, f10, f11, i1Var)), j10, i1Var);
    }

    public static /* synthetic */ androidx.compose.ui.d q(androidx.compose.ui.d dVar, e eVar, boolean z10, float f10, i1 i1Var, long j10, float f11, int i10, Object obj) {
        return p(dVar, eVar, z10, (i10 & 4) != 0 ? b.f12188a.e() : f10, (i10 & 8) != 0 ? b.f12188a.f() : i1Var, (i10 & 16) != 0 ? C5747v0.f27350b.i() : j10, (i10 & 32) != 0 ? b.f12188a.c() : f11);
    }

    public static final e r(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(318623070, i10, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
        }
        f fVar = (f) C5301c.e(new Object[0], f.f12270b.a(), (String) null, i.f12238c, mVar, 3072, 4);
        if (C4895p.J()) {
            C4895p.R();
        }
        return fVar;
    }
}
