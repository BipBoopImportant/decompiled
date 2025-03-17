package androidx.compose.foundation;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import n0.a0;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import p0.C5689g;
import p0.s;
import p0.v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\r\u001a=\u0010\u0011\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "initial", "Landroidx/compose/foundation/o;", "c", "(ILU0/m;II)Landroidx/compose/foundation/o;", "Landroidx/compose/ui/d;", "state", "", "enabled", "Lp0/s;", "flingBehavior", "reverseScrolling", "e", "(Landroidx/compose/ui/d;Landroidx/compose/foundation/o;ZLp0/s;Z)Landroidx/compose/ui/d;", "a", "isScrollable", "isVertical", "d", "(Landroidx/compose/ui/d;Landroidx/compose/foundation/o;ZLp0/s;ZZ)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/o;", "b", "()Landroidx/compose/foundation/o;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f18389c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(0);
            this.f18389c = i10;
        }

        /* renamed from: b */
        public final o invoke() {
            return new o(this.f18389c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f18390c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f18391d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s f18392e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f18393f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f18394g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(o oVar, boolean z10, s sVar, boolean z11, boolean z12) {
            super(1);
            this.f18390c = oVar;
            this.f18391d = z10;
            this.f18392e = sVar;
            this.f18393f = z11;
            this.f18394g = z12;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("scroll");
            v0Var.a().c("state", this.f18390c);
            v0Var.a().c("reverseScrolling", Boolean.valueOf(this.f18391d));
            v0Var.a().c("flingBehavior", this.f18392e);
            v0Var.a().c("isScrollable", Boolean.valueOf(this.f18393f));
            v0Var.a().c("isVertical", Boolean.valueOf(this.f18394g));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f18395c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f18396d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s f18397e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f18398f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f18399g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(o oVar, boolean z10, s sVar, boolean z11, boolean z12) {
            super(3);
            this.f18395c = oVar;
            this.f18396d = z10;
            this.f18397e = sVar;
            this.f18398f = z11;
            this.f18399g = z12;
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            mVar.W(1478351300);
            if (C4895p.J()) {
                C4895p.S(1478351300, i10, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
            }
            d s10 = d.f18749a.s(new ScrollSemanticsElement(this.f18395c, this.f18396d, this.f18397e, this.f18398f, this.f18399g));
            o oVar = this.f18395c;
            d s11 = a0.a(s10, oVar, this.f18399g ? v.Vertical : v.Horizontal, this.f18398f, this.f18396d, this.f18397e, oVar.l(), (C5689g) null, mVar, 0, 64).s(new ScrollingLayoutElement(this.f18395c, this.f18396d, this.f18399g));
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return s11;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final d a(d dVar, o oVar, boolean z10, s sVar, boolean z11) {
        return d(dVar, oVar, z11, sVar, z10, false);
    }

    public static /* synthetic */ d b(d dVar, o oVar, boolean z10, s sVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            sVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return a(dVar, oVar, z10, sVar, z11);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.o c(int r11, U0.C4889m r12, int r13, int r14) {
        /*
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 == 0) goto L_0x0006
            r11 = r1
        L_0x0006:
            boolean r14 = U0.C4895p.J()
            if (r14 == 0) goto L_0x0015
            r14 = -1
            java.lang.String r2 = "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)"
            r3 = -1464256199(0xffffffffa8b93939, float:-2.0563942E-14)
            U0.C4895p.S(r3, r13, r14, r2)
        L_0x0015:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            androidx.compose.foundation.o$c r14 = androidx.compose.foundation.o.f18407i
            f1.k r5 = r14.a()
            r14 = r13 & 14
            r14 = r14 ^ 6
            r2 = 4
            if (r14 <= r2) goto L_0x002a
            boolean r14 = r12.d(r11)
            if (r14 != 0) goto L_0x0030
        L_0x002a:
            r13 = r13 & 6
            if (r13 != r2) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            java.lang.Object r13 = r12.D()
            if (r0 != 0) goto L_0x003e
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r14 = r14.a()
            if (r13 != r14) goto L_0x0046
        L_0x003e:
            androidx.compose.foundation.m$a r13 = new androidx.compose.foundation.m$a
            r13.<init>(r11)
            r12.u(r13)
        L_0x0046:
            r7 = r13
            nI.a r7 = (nI.C17631a) r7
            r9 = 0
            r10 = 4
            r6 = 0
            r8 = r12
            java.lang.Object r11 = f1.C5301c.e(r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.foundation.o r11 = (androidx.compose.foundation.o) r11
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x005c
            U0.C4895p.R()
        L_0x005c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.m.c(int, U0.m, int, int):androidx.compose.foundation.o");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: nI.l<androidx.compose.ui.platform.v0, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: androidx.compose.foundation.m$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.m$b} */
    /* JADX WARNING: type inference failed for: r0v1, types: [nI.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.ui.d d(androidx.compose.ui.d r8, androidx.compose.foundation.o r9, boolean r10, p0.s r11, boolean r12, boolean r13) {
        /*
            boolean r0 = androidx.compose.ui.platform.C5133t0.b()
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.m$b r0 = new androidx.compose.foundation.m$b
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0016
        L_0x0012:
            nI.l r0 = androidx.compose.ui.platform.C5133t0.a()
        L_0x0016:
            androidx.compose.foundation.m$c r7 = new androidx.compose.foundation.m$c
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.compose.ui.d r8 = androidx.compose.ui.c.b(r8, r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.m.d(androidx.compose.ui.d, androidx.compose.foundation.o, boolean, p0.s, boolean, boolean):androidx.compose.ui.d");
    }

    public static final d e(d dVar, o oVar, boolean z10, s sVar, boolean z11) {
        return d(dVar, oVar, z11, sVar, z10, true);
    }

    public static /* synthetic */ d f(d dVar, o oVar, boolean z10, s sVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            sVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return e(dVar, oVar, z10, sVar, z11);
    }
}
