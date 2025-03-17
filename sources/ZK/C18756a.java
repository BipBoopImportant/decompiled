package zK;

import A0.a;
import A0.g;
import A1.C4355w;
import A1.C4356x;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import YH.C16877v;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.m;
import androidx.compose.ui.focus.n;
import c2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m1.i;
import n0.C5599e;
import n0.C5602h;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import o1.C5668h;
import p1.C5749w0;
import p1.V0;
import r1.C5817c;
import r1.f;
import r1.k;
import s0.C5834E;
import y1.C6254b;
import y1.C6255c;
import y1.C6256d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aS\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/ui/d;", "LU0/A1;", "", "focused", "enabled", "Lc2/h;", "cornerSize", "LzK/g;", "borderType", "insideBorder", "doubleBorders", "c", "(Landroidx/compose/ui/d;LU0/A1;ZFLzK/g;ZZ)Landroidx/compose/ui/d;", "LA0/a;", "shape", "Ls0/E;", "paddingValues", "a", "(Landroidx/compose/ui/d;LU0/A1;ZLA0/a;LzK/g;ZZLs0/E;)Landroidx/compose/ui/d;", "e", "(Landroidx/compose/ui/d;LA0/a;Z)Landroidx/compose/ui/d;", "isDoubleBorders", "h", "(Landroidx/compose/ui/d;LA0/a;LzK/g;ZLs0/E;)Landroidx/compose/ui/d;", "Lkotlin/Function0;", "LXH/N;", "action", "modifier", "f", "(Landroidx/compose/ui/d;LnI/a;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "hover", "i", "(Landroidx/compose/ui/d;ZZ)Landroidx/compose/ui/d;", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zK.a  reason: case insensitive filesystem */
public final class C18756a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zK.a$a  reason: collision with other inner class name */
    static final class C4333a implements q<d, C4889m, Integer, d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f152807a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f152808b;

        C4333a(a aVar, boolean z10) {
            this.f152807a = aVar;
            this.f152808b = z10;
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$composed");
            mVar.W(1905414742);
            if (C4895p.J()) {
                C4895p.S(1905414742, i10, -1, "net.ikea.skapa.ui.util.insideFocusBorder.<anonymous> (AccessibilityHelper.kt:99)");
            }
            C18763h hVar = C18763h.f152836a;
            C18761f c10 = hVar.c(mVar, 6);
            d e10 = C5599e.e(dVar, C5602h.a(c10.d(), c10.c()), this.f152807a);
            if (this.f152808b) {
                C18761f b10 = hVar.b(mVar, 6);
                e10 = C5599e.e(e10, C5602h.a(b10.d(), b10.c()), this.f152807a);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return e10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zK.a$b */
    static final class b implements C17642l<C6254b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<Integer> f152809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f152810b;

        b(List<Integer> list, C17631a<C16807N> aVar) {
            this.f152809a = list;
            this.f152810b = aVar;
        }

        public final Boolean a(KeyEvent keyEvent) {
            C17542s.j(keyEvent, "it");
            if (C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.b()) && this.f152809a.contains(Integer.valueOf(keyEvent.getKeyCode()))) {
                this.f152810b.invoke();
            }
            return Boolean.FALSE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6254b) obj).f());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zK.a$c */
    static final class c implements q<d, C4889m, Integer, d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5834E f152811a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f152812b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f152813c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18762g f152814d;

        c(C5834E e10, boolean z10, a aVar, C18762g gVar) {
            this.f152811a = e10;
            this.f152812b = z10;
            this.f152813c = aVar;
            this.f152814d = gVar;
        }

        /* access modifiers changed from: private */
        public static final i e(C5834E e10, boolean z10, a aVar, C18761f fVar, C18762g gVar, C18761f fVar2, m1.d dVar) {
            C17542s.j(dVar, "$this$drawWithCache");
            return dVar.p(new C18758c(e10, z10, aVar, fVar, gVar, fVar2));
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C5834E e10, boolean z10, a aVar, C18761f fVar, C18762g gVar, C18761f fVar2, C5817c cVar) {
            long j10;
            a aVar2 = aVar;
            C18761f fVar3 = fVar2;
            C5817c cVar2 = cVar;
            C17542s.j(cVar2, "$this$onDrawWithContent");
            long a10 = C5668h.a(cVar2.H1(D.g(e10, cVar.getLayoutDirection())), cVar2.H1(e10.d()));
            if (z10) {
                C18761f fVar4 = fVar;
                C5817c cVar3 = cVar;
                j10 = a10;
                f.j1(cVar3, fVar4.e(aVar2.a(fVar.a(cVar.b(), fVar.f(), cVar, e10), cVar.getLayoutDirection(), cVar2), cVar2, a10), fVar.b(gVar), 0.0f, new k(cVar2.H1(fVar.d()), 0.0f, 0, 0, (V0) null, 30, (DefaultConstructorMarker) null), (C5749w0) null, 0, 52, (Object) null);
            } else {
                j10 = a10;
            }
            C5817c cVar4 = cVar;
            long j11 = j10;
            C5817c cVar5 = cVar;
            f.j1(cVar5, fVar3.e(aVar2.a(fVar2.a(cVar.b(), fVar2.f(), cVar, e10), cVar.getLayoutDirection(), cVar4), cVar4, j11), fVar3.b(gVar), 0.0f, new k(cVar4.H1(fVar2.d()), 0.0f, 0, 0, (V0) null, 30, (DefaultConstructorMarker) null), (C5749w0) null, 0, 52, (Object) null);
            cVar.V1();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: zK.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: zK.b} */
        /* JADX WARNING: type inference failed for: r0v12 */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0061, code lost:
            if (r0 == U0.C4889m.f14007a.a()) goto L_0x0063;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.compose.ui.d c(androidx.compose.ui.d r9, U0.C4889m r10, int r11) {
            /*
                r8 = this;
                java.lang.String r0 = "$this$composed"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                r0 = -1932618794(0xffffffff8cce93d6, float:-3.18283E-31)
                r10.W(r0)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0017
                r1 = -1
                java.lang.String r2 = "net.ikea.skapa.ui.util.outsideFocusBorder.<anonymous> (AccessibilityHelper.kt:118)"
                U0.C4895p.S(r0, r11, r1, r2)
            L_0x0017:
                zK.h r11 = zK.C18763h.f152836a
                r0 = 6
                zK.f r5 = r11.b(r10, r0)
                zK.f r7 = r11.c(r10, r0)
                r11 = -273020228(0xffffffffefba0abc, float:-1.1515438E29)
                r10.W(r11)
                s0.E r11 = r8.f152811a
                boolean r11 = r10.V(r11)
                boolean r0 = r8.f152812b
                boolean r0 = r10.b(r0)
                r11 = r11 | r0
                A0.a r0 = r8.f152813c
                boolean r0 = r10.V(r0)
                r11 = r11 | r0
                boolean r0 = r10.V(r5)
                r11 = r11 | r0
                zK.g r0 = r8.f152814d
                boolean r0 = r10.V(r0)
                r11 = r11 | r0
                boolean r0 = r10.V(r7)
                r11 = r11 | r0
                s0.E r2 = r8.f152811a
                boolean r3 = r8.f152812b
                A0.a r4 = r8.f152813c
                zK.g r6 = r8.f152814d
                java.lang.Object r0 = r10.D()
                if (r11 != 0) goto L_0x0063
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r0 != r11) goto L_0x006c
            L_0x0063:
                zK.b r0 = new zK.b
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r10.u(r0)
            L_0x006c:
                nI.l r0 = (nI.C17642l) r0
                r10.P()
                androidx.compose.ui.d r9 = androidx.compose.ui.draw.b.c(r9, r0)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x007e
                U0.C4895p.R()
            L_0x007e:
                r10.P()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: zK.C18756a.c.c(androidx.compose.ui.d, U0.m, int):androidx.compose.ui.d");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final d a(d dVar, A1<Boolean> a12, boolean z10, a aVar, C18762g gVar, boolean z11, boolean z12, C5834E e10) {
        C17542s.j(dVar, "<this>");
        C17542s.j(a12, "focused");
        C17542s.j(aVar, "shape");
        C17542s.j(gVar, "borderType");
        C17542s.j(e10, "paddingValues");
        if (!z10) {
            return dVar;
        }
        return dVar.s((!a12.getValue().booleanValue() || !z11) ? a12.getValue().booleanValue() ? h(d.f18749a, aVar, gVar, z12, e10) : d.f18749a : e(d.f18749a, aVar, z12));
    }

    public static /* synthetic */ d b(d dVar, A1 a12, boolean z10, a aVar, C18762g gVar, boolean z11, boolean z12, C5834E e10, int i10, Object obj) {
        return a(dVar, a12, (i10 & 2) != 0 ? true : z10, aVar, (i10 & 8) != 0 ? C18762g.Default : gVar, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? true : z12, (i10 & 64) != 0 ? D.c(0.0f, 0.0f, 3, (Object) null) : e10);
    }

    public static final d c(d dVar, A1<Boolean> a12, boolean z10, float f10, C18762g gVar, boolean z11, boolean z12) {
        C17542s.j(dVar, "$this$focusableWithBorder");
        C17542s.j(a12, "focused");
        C17542s.j(gVar, "borderType");
        return b(dVar, a12, z10, g.e(f10), gVar, z11, z12, (C5834E) null, 64, (Object) null);
    }

    public static /* synthetic */ d d(d dVar, A1 a12, boolean z10, float f10, C18762g gVar, boolean z11, boolean z12, int i10, Object obj) {
        boolean z13 = true;
        boolean z14 = (i10 & 2) != 0 ? true : z10;
        boolean z15 = false;
        float B10 = (i10 & 4) != 0 ? h.B((float) 0) : f10;
        C18762g gVar2 = (i10 & 8) != 0 ? C18762g.Default : gVar;
        if ((i10 & 16) == 0) {
            z15 = z11;
        }
        if ((i10 & 32) == 0) {
            z13 = z12;
        }
        return c(dVar, a12, z14, B10, gVar2, z15, z13);
    }

    private static final d e(d dVar, a aVar, boolean z10) {
        return androidx.compose.ui.c.c(dVar, (C17642l) null, new C4333a(aVar, z10), 1, (Object) null);
    }

    public static final d f(d dVar, C17631a<C16807N> aVar, d dVar2) {
        C17542s.j(dVar, "<this>");
        C17542s.j(aVar, "action");
        C17542s.j(dVar2, "modifier");
        return androidx.compose.ui.input.key.a.a(n.a(dVar, new m()), new b(C16877v.q(66, 23, 62), aVar)).s(dVar2);
    }

    public static /* synthetic */ d g(d dVar, C17631a aVar, d dVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar2 = d.f18749a;
        }
        return f(dVar, aVar, dVar2);
    }

    private static final d h(d dVar, a aVar, C18762g gVar, boolean z10, C5834E e10) {
        return androidx.compose.ui.c.c(dVar, (C17642l) null, new c(e10, z10, aVar, gVar), 1, (Object) null);
    }

    public static final d i(d dVar, boolean z10, boolean z11) {
        C17542s.j(dVar, "<this>");
        return C4356x.b(dVar, (!z10 || !z11) ? C4355w.f4447a.a() : C4355w.f4447a.b(), false, 2, (Object) null);
    }

    public static /* synthetic */ d j(d dVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return i(dVar, z10, z11);
    }
}
