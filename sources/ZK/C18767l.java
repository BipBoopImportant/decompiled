package zK;

import U0.C4889m;
import XH.C16807N;
import android.graphics.Paint;
import android.view.KeyEvent;
import androidx.compose.ui.c;
import androidx.compose.ui.focus.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5530a;
import m0.C5554m;
import n1.C5626f;
import nI.C17642l;
import nI.q;
import o1.C5662b;
import o1.C5667g;
import o1.C5673m;
import p1.C5732n0;
import p1.C5747v0;
import p1.C5749w0;
import p1.C5751x0;
import p1.S;
import p1.S0;
import r1.f;
import r1.j;
import y1.C6253a;
import y1.C6254b;
import y1.C6255c;
import y1.C6256d;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aC\u0010\u0019\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"", "resizeFactor", "Lm0/i;", "animationSpec", "Lp1/v0;", "color", "Lc2/h;", "cornersRadius", "Lm0/a;", "Lm0/m;", "scale", "Ln0/G;", "c", "(FLm0/i;Lp1/v0;FLm0/a;LU0/m;II)Ln0/G;", "Lr1/f;", "animatedScale", "backgroundColor", "cornerRadius", "LXH/N;", "a", "(Lr1/f;Lm0/a;JF)V", "Landroidx/compose/ui/d;", "shadowBlurRadius", "offsetY", "offsetX", "d", "(Landroidx/compose/ui/d;FJFFF)Landroidx/compose/ui/d;", "Ln1/f;", "focusManager", "b", "(Landroidx/compose/ui/d;Ln1/f;)Landroidx/compose/ui/d;", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zK.l  reason: case insensitive filesystem */
public final class C18767l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zK.l$a */
    static final class a implements C17642l<C6254b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5626f f152843a;

        a(C5626f fVar) {
            this.f152843a = fVar;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            C17542s.j(keyEvent, "it");
            if (!C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.a()) || !C6253a.t(C6256d.a(keyEvent), C6253a.f32108b.n())) {
                z10 = false;
            } else {
                this.f152843a.d(C6256d.g(keyEvent) ? d.f18832b.f() : d.f18832b.e());
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6254b) obj).f());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zK.l$b */
    static final class b implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f152844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f152845b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f152846c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f152847d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f152848e;

        b(long j10, float f10, float f11, float f12, float f13) {
            this.f152844a = j10;
            this.f152845b = f10;
            this.f152846c = f11;
            this.f152847d = f12;
            this.f152848e = f13;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(long j10, float f10, float f11, float f12, float f13, f fVar) {
            float f14 = f13;
            f fVar2 = fVar;
            C17542s.j(fVar2, "$this$drawBehind");
            int k10 = C5751x0.k(C5747v0.o(j10, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
            C5732n0 e10 = fVar.I1().e();
            S0 a10 = S.a();
            Paint o10 = a10.o();
            o10.setColor(k10);
            float f15 = f10;
            float f16 = f11;
            o10.setShadowLayer(fVar2.H1(f10), fVar2.H1(f11), fVar2.H1(f12), C5751x0.k(j10));
            e10.l(0.0f, 0.0f, C5673m.l(fVar.b()), C5673m.i(fVar.b()), fVar2.H1(f14), fVar2.H1(f14), a10);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: zK.m} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: zK.m} */
        /* JADX WARNING: type inference failed for: r0v14 */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0086, code lost:
            if (r0 == U0.C4889m.f14007a.a()) goto L_0x0088;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.compose.ui.d b(androidx.compose.ui.d r10, U0.C4889m r11, int r12) {
            /*
                r9 = this;
                java.lang.String r0 = "$this$composed"
                kotlin.jvm.internal.C17542s.j(r10, r0)
                r0 = -1543533810(0xffffffffa3ff8b0e, float:-2.7706047E-17)
                r11.W(r0)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0017
                r1 = -1
                java.lang.String r2 = "net.ikea.skapa.ui.util.skapaShadow.<anonymous> (ModifierExt.kt:195)"
                U0.C4895p.S(r0, r12, r1, r2)
            L_0x0017:
                r12 = 1595284623(0x5f161c8f, float:1.0816678E19)
                r11.W(r12)
                long r0 = r9.f152844a
                p1.v0$a r12 = p1.C5747v0.f27350b
                long r2 = r12.i()
                boolean r12 = p1.C5747v0.q(r0, r2)
                if (r12 == 0) goto L_0x0046
                tK.v r12 = tK.C18030v.f147664a
                int r0 = tK.C18030v.f147665b
                tK.h r12 = r12.a(r11, r0)
                long r0 = r12.x0()
                r6 = 14
                r7 = 0
                r2 = 1036831949(0x3dcccccd, float:0.1)
                r3 = 0
                r4 = 0
                r5 = 0
                long r0 = p1.C5747v0.o(r0, r2, r3, r4, r5, r6, r7)
            L_0x0044:
                r3 = r0
                goto L_0x0049
            L_0x0046:
                long r0 = r9.f152844a
                goto L_0x0044
            L_0x0049:
                r11.P()
                r12 = 1595289719(0x5f163077, float:1.0822281E19)
                r11.W(r12)
                boolean r12 = r11.e(r3)
                float r0 = r9.f152845b
                boolean r0 = r11.c(r0)
                r12 = r12 | r0
                float r0 = r9.f152846c
                boolean r0 = r11.c(r0)
                r12 = r12 | r0
                float r0 = r9.f152847d
                boolean r0 = r11.c(r0)
                r12 = r12 | r0
                float r0 = r9.f152848e
                boolean r0 = r11.c(r0)
                r12 = r12 | r0
                float r5 = r9.f152845b
                float r6 = r9.f152846c
                float r7 = r9.f152847d
                float r8 = r9.f152848e
                java.lang.Object r0 = r11.D()
                if (r12 != 0) goto L_0x0088
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r0 != r12) goto L_0x0091
            L_0x0088:
                zK.m r0 = new zK.m
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r8)
                r11.u(r0)
            L_0x0091:
                nI.l r0 = (nI.C17642l) r0
                r11.P()
                androidx.compose.ui.d r10 = androidx.compose.ui.draw.b.b(r10, r0)
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x00a3
                U0.C4895p.R()
            L_0x00a3:
                r11.P()
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: zK.C18767l.b.b(androidx.compose.ui.d, U0.m, int):androidx.compose.ui.d");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final void a(f fVar, C5530a<Float, C5554m> aVar, long j10, float f10) {
        long j11;
        r1.d dVar;
        f fVar2 = fVar;
        C17542s.j(fVar2, "$this$animatedRoundedBackground");
        C17542s.j(aVar, "animatedScale");
        if (aVar.m().floatValue() == 1.0f) {
            float floatValue = aVar.m().floatValue();
            long N12 = fVar.N1();
            r1.d I12 = fVar.I1();
            long b10 = I12.b();
            I12.e().t();
            try {
                I12.c().f(floatValue, floatValue, N12);
                long c10 = C5667g.f26701b.c();
                long b11 = fVar.b();
                f fVar3 = fVar;
                long j12 = b10;
                r1.d dVar2 = I12;
                try {
                    f.L1(fVar3, j10, c10, b11, C5662b.b(fVar2.H1(f10), 0.0f, 2, (Object) null), j.f28627a, 0.0f, (C5749w0) null, 0, 224, (Object) null);
                    dVar2.e().n();
                    dVar2.g(j12);
                } catch (Throwable th2) {
                    th = th2;
                    dVar = dVar2;
                    j11 = j12;
                    dVar.e().n();
                    dVar.g(j11);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j11 = b10;
                dVar = I12;
                dVar.e().n();
                dVar.g(j11);
                throw th;
            }
        }
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, C5626f fVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(fVar, "focusManager");
        return androidx.compose.ui.input.key.a.b(dVar, new a(fVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: zK.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: zK.n} */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final n0.C5584G c(float r7, m0.C5546i<java.lang.Float> r8, p1.C5747v0 r9, float r10, m0.C5530a<java.lang.Float, m0.C5554m> r11, U0.C4889m r12, int r13, int r14) {
        /*
            java.lang.String r0 = "scale"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 1619559168(0x60888300, float:7.869365E19)
            r12.W(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0012
            r7 = 1064849900(0x3f7851ec, float:0.97)
        L_0x0012:
            r2 = r7
            r7 = r14 & 2
            if (r7 == 0) goto L_0x001d
            xK.e r7 = xK.C18679e.f152514a
            m0.y0 r8 = r7.a()
        L_0x001d:
            r3 = r8
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0023
            r9 = 0
        L_0x0023:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x002d
            c2.h$a r7 = c2.h.f23031b
            float r10 = r7.c()
        L_0x002d:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0039
            r7 = -1
            java.lang.String r8 = "net.ikea.skapa.ui.util.rememberSkapaButtonIndication (ModifierExt.kt:51)"
            U0.C4895p.S(r0, r13, r7, r8)
        L_0x0039:
            int r7 = r13 >> 6
            r7 = r7 & 14
            U0.A1 r4 = U0.p1.q(r9, r12, r7)
            int r7 = m0.C5530a.f25673m
            int r8 = r13 >> 12
            r8 = r8 & 14
            r7 = r7 | r8
            U0.A1 r5 = U0.p1.q(r11, r12, r7)
            c2.h r7 = c2.h.m(r10)
            int r8 = r13 >> 9
            r8 = r8 & 14
            U0.A1 r6 = U0.p1.q(r7, r12, r8)
            r7 = 1553214081(0x5c942a81, float:3.33640241E17)
            r12.W(r7)
            java.lang.Object r7 = r12.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x0073
            zK.n r7 = new zK.n
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r12.u(r7)
        L_0x0073:
            zK.n r7 = (zK.C18769n) r7
            r12.P()
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0081
            U0.C4895p.R()
        L_0x0081:
            r12.P()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zK.C18767l.c(float, m0.i, p1.v0, float, m0.a, U0.m, int, int):n0.G");
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, float f10, long j10, float f11, float f12, float f13) {
        C17542s.j(dVar, "$this$skapaShadow");
        return c.c(dVar, (C17642l) null, new b(j10, f11, f13, f12, f10), 1, (Object) null);
    }

    public static /* synthetic */ androidx.compose.ui.d e(androidx.compose.ui.d dVar, float f10, long j10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = C5747v0.f27350b.i();
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            f11 = h.B((float) 16);
        }
        float f14 = f11;
        if ((i10 & 8) != 0) {
            f12 = h.B((float) 4);
        }
        float f15 = f12;
        if ((i10 & 16) != 0) {
            f13 = h.B((float) 0);
        }
        return d(dVar, f10, j11, f14, f15, f13);
    }
}
