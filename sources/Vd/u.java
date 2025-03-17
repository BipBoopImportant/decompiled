package vD;

import GD.C12932e;
import GD.C12934g;
import GD.C12935h;
import IC.C13023e;
import KJ.C15987c;
import O0.C4762x0;
import O0.F0;
import O0.H0;
import O0.J0;
import O0.L0;
import QJ.Q;
import SC.Y2;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import androidx.compose.foundation.o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import dI.C17164e;
import dI.C17168i;
import e2.C5295b;
import e5.C7785a;
import e5.C7786b;
import e5.C7787c;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import m0.C5546i;
import m0.C5548j;
import m0.C5559o0;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p0.v;
import s0.C5834E;
import s0.C5842M;
import s0.C5850V;
import s0.C5859e;
import tD.C15068e;
import tI.C17978n;
import uI.C18059h;
import wD.C15183n;
import x0.C6230C;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u001c\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a[\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010'\u001a\u00020\u0004*\u00020%2\u0006\u0010&\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(\u001a'\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0003¢\u0006\u0004\b/\u00100\u001a'\u00104\u001a\u00020\u00062\u0006\u00101\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001a2\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b4\u00105\u001a5\u00106\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0002H\u0003¢\u0006\u0004\b6\u00107\u001a5\u0010<\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010;\u001a\u00020:2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0002H\u0003¢\u0006\u0004\b<\u0010=\u001a-\u0010>\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b>\u0010?\u001a#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00040@2\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010C\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\bC\u0010D¨\u0006F²\u0006\f\u0010\n\u001a\u00020\t8\nX\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00048\n@\nX\u0002²\u0006\f\u0010E\u001a\u00020\u00048\nX\u0002"}, d2 = {"LtD/e;", "viewModel", "Lkotlin/Function1;", "LGD/g;", "", "consumeNavigationEvent", "LXH/N;", "A", "(LtD/e;LnI/l;LU0/m;I)V", "LGD/i;", "uiState", "LGD/h;", "onEvent", "Ls0/E;", "contentPadding", "Le5/b;", "windowSizeClass", "z", "(LGD/i;LnI/l;Ls0/E;Le5/b;LU0/m;II)V", "LKJ/c;", "LGD/k;", "cards", "Lp0/v;", "orientation", "Landroidx/compose/ui/d;", "modifier", "", "scrollToIndex", "n", "(LKJ/c;LnI/l;Lp0/v;Landroidx/compose/ui/d;Ljava/lang/Integer;LU0/m;II)V", "model", "showBackOfCard", "isCardInFocus", "Lkotlin/Function0;", "onClick", "l", "(LGD/k;Lp0/v;ZZLnI/a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "Lx0/C;", "index", "O", "(Lx0/C;I)Z", "", "aspectRatio", "Lc2/h;", "availableWidth", "availableHeight", "Lc2/k;", "L", "(FFFLU0/m;I)J", "pagerState", "Landroidx/compose/foundation/o;", "scrollState", "t", "(Lx0/C;ILandroidx/compose/foundation/o;LU0/m;I)V", "v", "(Ljava/lang/Integer;Lx0/C;LnI/l;LU0/m;I)V", "LIC/e;", "userMessage", "LO0/L0;", "snackbarHostState", "x", "(LIC/e;LO0/L0;LnI/l;LU0/m;I)V", "p", "(LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "LXH/v;", "N", "(Lp0/v;LU0/m;I)LXH/v;", "M", "(Le5/b;LU0/m;I)Lp0/v;", "isIndexFocused", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<GD.k> f131494a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f131495b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C12935h, C16807N> f131496c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c2.d f131497d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f131498e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f131499f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f131500g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f131501h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vD.u$a$a  reason: collision with other inner class name */
        static final class C3258a implements r<x0.v, Integer, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15987c<GD.k> f131502a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ float f131503b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f131504c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C6230C f131505d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f131506e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ float f131507f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ v f131508g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C17642l<C12935h, C16807N> f131509h;

            C3258a(C15987c<? extends GD.k> cVar, float f10, boolean z10, C6230C c10, float f11, float f12, v vVar, C17642l<? super C12935h, C16807N> lVar) {
                this.f131502a = cVar;
                this.f131503b = f10;
                this.f131504c = z10;
                this.f131505d = c10;
                this.f131506e = f11;
                this.f131507f = f12;
                this.f131508g = vVar;
                this.f131509h = lVar;
            }

            /* access modifiers changed from: private */
            public static final C4899r0 h() {
                return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
            }

            private static final boolean i(A1<Boolean> a12) {
                return a12.getValue().booleanValue();
            }

            private static final boolean j(C4899r0<Boolean> r0Var) {
                return r0Var.getValue().booleanValue();
            }

            private static final void k(C4899r0<Boolean> r0Var, boolean z10) {
                r0Var.setValue(Boolean.valueOf(z10));
            }

            /* access modifiers changed from: private */
            public static final C16807N m(C4899r0 r0Var) {
                k(r0Var, !j(r0Var));
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N n(C6230C c10, int i10, androidx.compose.ui.graphics.c cVar) {
                C17542s.j(cVar, "$this$graphicsLayer");
                float b10 = C5295b.b(0.95f, 1.0f, 1.0f - C17978n.l(Math.abs(((float) (c10.v() - i10)) + c10.w()), 0.0f, 1.0f));
                cVar.g(b10);
                cVar.m(b10);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final boolean p(C6230C c10, int i10) {
                return u.O(c10, i10);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void f(x0.v r31, int r32, U0.C4889m r33, int r34) {
                /*
                    r30 = this;
                    r0 = r30
                    r1 = r32
                    r11 = r33
                    r9 = r34
                    java.lang.String r2 = "$this$HorizontalPager"
                    r3 = r31
                    kotlin.jvm.internal.C17542s.j(r3, r2)
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x001e
                    r2 = -1
                    java.lang.String r3 = "com.ingka.ikea.wallet.impl.compose.CardPager.<anonymous>.<anonymous> (WalletScreen.kt:245)"
                    r4 = -826406047(0xffffffffcebe0b61, float:-1.59420838E9)
                    U0.C4895p.S(r4, r9, r2, r3)
                L_0x001e:
                    KJ.c<GD.k> r2 = r0.f131502a
                    java.lang.Object r2 = r2.get(r1)
                    r10 = r2
                    GD.k r10 = (GD.k) r10
                    r12 = 0
                    java.lang.Object[] r2 = new java.lang.Object[r12]
                    r3 = 1809715688(0x6bde11e8, float:5.369322E26)
                    r11.W(r3)
                    java.lang.Object r3 = r33.D()
                    U0.m$a r13 = U0.C4889m.f14007a
                    java.lang.Object r4 = r13.a()
                    if (r3 != r4) goto L_0x0044
                    vD.q r3 = new vD.q
                    r3.<init>()
                    r11.u(r3)
                L_0x0044:
                    r5 = r3
                    nI.a r5 = (nI.C17631a) r5
                    r33.P()
                    r7 = 3072(0xc00, float:4.305E-42)
                    r8 = 6
                    r3 = 0
                    r4 = 0
                    r6 = r33
                    java.lang.Object r2 = f1.C5301c.e(r2, r3, r4, r5, r6, r7, r8)
                    U0.r0 r2 = (U0.C4899r0) r2
                    r3 = 1809717363(0x6bde1873, float:5.3699398E26)
                    r11.W(r3)
                    boolean r3 = r11.V(r2)
                    java.lang.Object r4 = r33.D()
                    if (r3 != 0) goto L_0x006d
                    java.lang.Object r3 = r13.a()
                    if (r4 != r3) goto L_0x0075
                L_0x006d:
                    vD.r r4 = new vD.r
                    r4.<init>(r2)
                    r11.u(r4)
                L_0x0075:
                    r5 = r4
                    nI.a r5 = (nI.C17631a) r5
                    r33.P()
                    androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
                    float r4 = r0.f131503b
                    boolean r6 = r0.f131504c
                    androidx.compose.ui.d r4 = androidx.compose.foundation.layout.C5074e.a(r3, r4, r6)
                    r6 = 1809723246(0x6bde2f6e, float:5.3721102E26)
                    r11.W(r6)
                    x0.C r6 = r0.f131505d
                    boolean r6 = r11.V(r6)
                    r7 = r9 & 112(0x70, float:1.57E-43)
                    r8 = r7 ^ 48
                    r14 = 32
                    r15 = 1
                    if (r8 <= r14) goto L_0x00a0
                    boolean r8 = r11.d(r1)
                    if (r8 != 0) goto L_0x00a4
                L_0x00a0:
                    r8 = r9 & 48
                    if (r8 != r14) goto L_0x00a6
                L_0x00a4:
                    r8 = r15
                    goto L_0x00a7
                L_0x00a6:
                    r8 = r12
                L_0x00a7:
                    r6 = r6 | r8
                    x0.C r8 = r0.f131505d
                    java.lang.Object r9 = r33.D()
                    if (r6 != 0) goto L_0x00b6
                    java.lang.Object r6 = r13.a()
                    if (r9 != r6) goto L_0x00be
                L_0x00b6:
                    vD.s r9 = new vD.s
                    r9.<init>(r8, r1)
                    r11.u(r9)
                L_0x00be:
                    nI.l r9 = (nI.C17642l) r9
                    r33.P()
                    androidx.compose.ui.d r8 = androidx.compose.ui.graphics.b.a(r4, r9)
                    r4 = 1809740331(0x6bde722b, float:5.3784135E26)
                    r11.W(r4)
                    x0.C r4 = r0.f131505d
                    java.lang.Object r6 = r33.D()
                    java.lang.Object r9 = r13.a()
                    if (r6 != r9) goto L_0x00e5
                    vD.t r6 = new vD.t
                    r6.<init>(r4, r1)
                    U0.A1 r6 = U0.p1.e(r6)
                    r11.u(r6)
                L_0x00e5:
                    U0.A1 r6 = (U0.A1) r6
                    r33.P()
                    androidx.compose.foundation.o r4 = androidx.compose.foundation.m.c(r12, r11, r12, r15)
                    x0.C r9 = r0.f131505d
                    int r9 = r9.v()
                    if (r1 != r9) goto L_0x00f9
                    r18 = r15
                    goto L_0x00fb
                L_0x00f9:
                    r18 = r12
                L_0x00fb:
                    x0.C r9 = r0.f131505d
                    vD.u.t(r9, r1, r4, r11, r7)
                    r1 = 0
                    r7 = 0
                    androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r3, r1, r15, r7)
                    r21 = 12
                    r22 = 0
                    r19 = 0
                    r20 = 0
                    r17 = r4
                    androidx.compose.ui.d r23 = androidx.compose.foundation.m.f(r16, r17, r18, r19, r20, r21, r22)
                    float r1 = r0.f131506e
                    float r3 = r0.f131507f
                    r28 = 5
                    r29 = 0
                    r24 = 0
                    r26 = 0
                    r25 = r1
                    r27 = r3
                    androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r23, r24, r25, r26, r27, r28, r29)
                    p0.v r3 = r0.f131508g
                    nI.l<GD.h, XH.N> r7 = r0.f131509h
                    androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$m r4 = r4.g()
                    i1.c$a r9 = i1.C5437c.f24302a
                    i1.c$b r9 = r9.k()
                    E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r9, r11, r12)
                    int r9 = U0.C4883j.a(r11, r12)
                    U0.y r12 = r33.s()
                    androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r11, r1)
                    G1.g$a r13 = G1.C4504g.f6515W
                    nI.a r14 = r13.a()
                    U0.f r15 = r33.m()
                    if (r15 != 0) goto L_0x0157
                    U0.C4883j.c()
                L_0x0157:
                    r33.I()
                    boolean r15 = r33.i()
                    if (r15 == 0) goto L_0x0164
                    r11.p(r14)
                    goto L_0x0167
                L_0x0164:
                    r33.t()
                L_0x0167:
                    U0.m r14 = U0.F1.a(r33)
                    nI.p r15 = r13.c()
                    U0.F1.c(r14, r4, r15)
                    nI.p r4 = r13.e()
                    U0.F1.c(r14, r12, r4)
                    nI.p r4 = r13.b()
                    boolean r12 = r14.i()
                    if (r12 != 0) goto L_0x0191
                    java.lang.Object r12 = r14.D()
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
                    boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r15)
                    if (r12 != 0) goto L_0x019f
                L_0x0191:
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
                    r14.u(r12)
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                    r14.w(r9, r4)
                L_0x019f:
                    nI.p r4 = r13.d()
                    U0.F1.c(r14, r1, r4)
                    s0.h r1 = s0.C5862h.f28810a
                    boolean r4 = j(r2)
                    boolean r6 = i(r6)
                    r9 = 0
                    r12 = 0
                    r1 = r10
                    r2 = r3
                    r3 = r4
                    r4 = r6
                    r6 = r7
                    r7 = r8
                    r8 = r33
                    r10 = r12
                    vD.u.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    r33.x()
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x01ca
                    U0.C4895p.R()
                L_0x01ca:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: vD.u.a.C3258a.f(x0.v, int, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                f((x0.v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        a(C15987c<? extends GD.k> cVar, Integer num, C17642l<? super C12935h, C16807N> lVar, c2.d dVar, float f10, float f11, boolean z10, v vVar) {
            this.f131494a = cVar;
            this.f131495b = num;
            this.f131496c = lVar;
            this.f131497d = dVar;
            this.f131498e = f10;
            this.f131499f = f11;
            this.f131500g = z10;
            this.f131501h = vVar;
        }

        /* access modifiers changed from: private */
        public static final int e(C15987c cVar) {
            return cVar.size();
        }

        /* access modifiers changed from: private */
        public static final Object f(C15987c cVar, int i10) {
            return Long.valueOf(((GD.k) cVar.get(i10)).f());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5859e r28, U0.C4889m r29, int r30) {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                r15 = r29
                java.lang.String r2 = "$this$BoxWithConstraints"
                kotlin.jvm.internal.C17542s.j(r1, r2)
                r2 = r30 & 6
                r8 = 2
                r9 = 4
                if (r2 != 0) goto L_0x001d
                boolean r2 = r15.V(r1)
                if (r2 == 0) goto L_0x0019
                r2 = r9
                goto L_0x001a
            L_0x0019:
                r2 = r8
            L_0x001a:
                r2 = r30 | r2
                goto L_0x001f
            L_0x001d:
                r2 = r30
            L_0x001f:
                r3 = r2 & 19
                r4 = 18
                if (r3 != r4) goto L_0x0031
                boolean r3 = r29.l()
                if (r3 != 0) goto L_0x002c
                goto L_0x0031
            L_0x002c:
                r29.L()
                goto L_0x017e
            L_0x0031:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x0040
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.wallet.impl.compose.CardPager.<anonymous> (WalletScreen.kt:208)"
                r5 = 1886459711(0x7071173f, float:2.9845596E29)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x0040:
                r2 = -1830051138(0xffffffff92eba2be, float:-1.4870704E-27)
                r15.W(r2)
                KJ.c<GD.k> r2 = r0.f131494a
                boolean r2 = r15.V(r2)
                KJ.c<GD.k> r3 = r0.f131494a
                java.lang.Object r4 = r29.D()
                if (r2 != 0) goto L_0x005c
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r4 != r2) goto L_0x0064
            L_0x005c:
                vD.o r4 = new vD.o
                r4.<init>(r3)
                r15.u(r4)
            L_0x0064:
                nI.a r4 = (nI.C17631a) r4
                r29.P()
                r6 = 0
                r7 = 3
                r2 = 0
                r3 = 0
                r5 = r29
                x0.C r3 = x0.C6231D.k(r2, r3, r4, r5, r6, r7)
                java.lang.Integer r2 = r0.f131495b
                nI.l<GD.h, XH.N> r4 = r0.f131496c
                r5 = 0
                vD.u.v(r2, r3, r4, r15, r5)
                c2.d r2 = r0.f131497d
                long r6 = r28.b()
                int r4 = c2.C5267b.l(r6)
                float r2 = r2.H(r4)
                c2.d r4 = r0.f131497d
                long r6 = r28.b()
                int r1 = c2.C5267b.k(r6)
                float r1 = r4.H(r1)
                r4 = 32
                float r4 = (float) r4
                float r6 = c2.h.B(r4)
                float r22 = c2.h.B(r4)
                float r4 = (float) r8
                float r7 = r4 * r6
                float r7 = c2.h.B(r7)
                float r7 = r2 - r7
                float r7 = c2.h.B(r7)
                float r8 = r0.f131498e
                float r1 = r1 - r8
                float r1 = c2.h.B(r1)
                float r1 = r1 - r22
                float r1 = c2.h.B(r1)
                float r8 = r0.f131499f
                long r7 = vD.u.L(r8, r7, r1, r15, r5)
                float r5 = c2.k.h(r7)
                float r7 = c2.k.g(r7)
                float r8 = r0.f131498e
                float r1 = r1 - r7
                float r1 = c2.h.B(r1)
                float r7 = (float) r9
                float r1 = r1 / r7
                float r1 = c2.h.B(r1)
                float r8 = r8 + r1
                float r21 = c2.h.B(r8)
                float r2 = r2 - r5
                float r1 = c2.h.B(r2)
                float r1 = r1 / r4
                float r1 = c2.h.B(r1)
                float r1 = java.lang.Math.max(r1, r6)
                float r8 = c2.h.B(r1)
                r1 = 8
                float r1 = (float) r1
                float r25 = c2.h.B(r1)
                x0.g$b r4 = new x0.g$b
                r1 = 0
                r4.<init>(r5, r1)
                i1.c$a r1 = i1.C5437c.f24302a
                i1.c$c r26 = r1.l()
                r10 = 10
                r11 = 0
                r7 = 0
                r9 = 0
                r6 = r8
                s0.E r6 = androidx.compose.foundation.layout.D.e(r6, r7, r8, r9, r10, r11)
                r1 = -1830019438(0xffffffff92ec1e92, float:-1.490123E-27)
                r15.W(r1)
                KJ.c<GD.k> r1 = r0.f131494a
                boolean r1 = r15.V(r1)
                KJ.c<GD.k> r2 = r0.f131494a
                java.lang.Object r5 = r29.D()
                if (r1 != 0) goto L_0x0127
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r5 != r1) goto L_0x012f
            L_0x0127:
                vD.p r5 = new vD.p
                r5.<init>(r2)
                r15.u(r5)
            L_0x012f:
                r11 = r5
                nI.l r11 = (nI.C17642l) r11
                r29.P()
                vD.u$a$a r1 = new vD.u$a$a
                KJ.c<GD.k> r2 = r0.f131494a
                float r5 = r0.f131499f
                boolean r7 = r0.f131500g
                p0.v r8 = r0.f131501h
                nI.l<GD.h, XH.N> r9 = r0.f131496c
                r16 = r1
                r17 = r2
                r18 = r5
                r19 = r7
                r20 = r3
                r23 = r8
                r24 = r9
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
                r2 = 54
                r5 = -826406047(0xffffffffcebe0b61, float:-1.59420838E9)
                r7 = 1
                c1.a r14 = c1.c.e(r5, r7, r1, r15, r2)
                r17 = 3072(0xc00, float:4.305E-42)
                r18 = 7042(0x1b82, float:9.868E-42)
                r2 = 0
                r5 = 1
                r8 = 0
                r9 = 0
                r10 = 0
                r12 = 0
                r13 = 0
                r16 = 1794048(0x1b6000, float:2.513997E-39)
                r1 = r3
                r3 = r6
                r6 = r25
                r7 = r26
                r15 = r29
                x0.m.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x017e
                U0.C4895p.R()
            L_0x017e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vD.u.a.c(s0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.compose.WalletScreenKt$HandleResetScrollOnLeave$1$1", f = "WalletScreen.kt", l = {385}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131510c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f131511d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6230C f131512e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o f131513f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, C6230C c10, o oVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f131511d = i10;
            this.f131512e = c10;
            this.f131513f = oVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f131511d, this.f131512e, this.f131513f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f131510c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f131511d != this.f131512e.v()) {
                    o oVar = this.f131513f;
                    C5559o0 h10 = C5548j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
                    this.f131510c = 1;
                    if (oVar.k(0, h10, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.compose.WalletScreenKt$HandleScrollToIndex$1$1", f = "WalletScreen.kt", l = {401}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131514c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f131515d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6230C f131516e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C12935h, C16807N> f131517f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Integer num, C6230C c10, C17642l<? super C12935h, C16807N> lVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f131515d = num;
            this.f131516e = c10;
            this.f131517f = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f131515d, this.f131516e, this.f131517f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f131514c;
            if (i10 == 0) {
                y.b(obj);
                Integer num = this.f131515d;
                if (num != null && num.intValue() > -1) {
                    C6230C c10 = this.f131516e;
                    int intValue = this.f131515d.intValue();
                    this.f131514c = 1;
                    if (C6230C.n(c10, intValue, 0.0f, (C5546i) null, this, 6, (Object) null) == f10) {
                        return f10;
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f131517f.invoke(C12935h.a.f.f110376a);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.compose.WalletScreenKt$HandleUserMessage$1$1", f = "WalletScreen.kt", l = {416}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f131518c;

        /* renamed from: d  reason: collision with root package name */
        Object f131519d;

        /* renamed from: e  reason: collision with root package name */
        Object f131520e;

        /* renamed from: f  reason: collision with root package name */
        int f131521f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13023e f131522g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f131523h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ L0 f131524i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<C12935h, C16807N> f131525j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C13023e eVar, Context context, L0 l02, C17642l<? super C12935h, C16807N> lVar, C17164e<? super d> eVar2) {
            super(2, eVar2);
            this.f131522g = eVar;
            this.f131523h = context;
            this.f131524i = l02;
            this.f131525j = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f131522g, this.f131523h, this.f131524i, this.f131525j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String b10;
            Object f10 = C17187b.f();
            int i10 = this.f131521f;
            if (i10 == 0) {
                y.b(obj);
                C13023e eVar = this.f131522g;
                if (eVar == null || (b10 = eVar.b(this.f131523h)) == null) {
                    return C16807N.f139792a;
                }
                L0 l02 = this.f131524i;
                J0 j02 = J0.Short;
                this.f131518c = b10;
                this.f131519d = eVar;
                this.f131520e = b10;
                this.f131521f = 1;
                if (L0.f(l02, b10, (String) null, false, j02, this, 6, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str = (String) this.f131520e;
                C13023e eVar2 = (C13023e) this.f131519d;
                String str2 = (String) this.f131518c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f131525j.invoke(C12935h.f.UserMessageDismissed);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.compose.WalletScreenKt$WalletScreen$1$1", f = "WalletScreen.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131526c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C12934g, Boolean> f131527d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15068e f131528e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<GD.i> f131529f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17642l<? super C12934g, Boolean> lVar, C15068e eVar, A1<GD.i> a12, C17164e<? super e> eVar2) {
            super(2, eVar2);
            this.f131527d = lVar;
            this.f131528e = eVar;
            this.f131529f = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f131527d, this.f131528e, this.f131529f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f131526c == 0) {
                y.b(obj);
                if (this.f131527d.invoke(u.B(this.f131529f).c()).booleanValue()) {
                    this.f131528e.M(C12935h.f.NavigationCompleted);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17642l<C12935h, C16807N> {
        f(Object obj) {
            super(1, obj, C15068e.class, "onEvent", "onEvent(Lcom/ingka/ikea/wallet/impl/model/Wallet$Event;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C12935h) obj);
            return C16807N.f139792a;
        }

        public final void t(C12935h hVar) {
            C17542s.j(hVar, "p0");
            ((C15068e) this.receiver).M(hVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f131530a;

        g(L0 l02) {
            this.f131530a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(260786852, i10, -1, "com.ingka.ikea.wallet.impl.compose.WalletScreen.<anonymous> (WalletScreen.kt:108)");
                }
                Y2.c(this.f131530a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15068e f131531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1<GD.i> f131532b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17642l<C12935h, C16807N> {
            a(Object obj) {
                super(1, obj, C15068e.class, "onEvent", "onEvent(Lcom/ingka/ikea/wallet/impl/model/Wallet$Event;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((C12935h) obj);
                return C16807N.f139792a;
            }

            public final void t(C12935h hVar) {
                C17542s.j(hVar, "p0");
                ((C15068e) this.receiver).M(hVar);
            }
        }

        h(C15068e eVar, A1<GD.i> a12) {
            this.f131531a = eVar;
            this.f131532b = a12;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "contentPadding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(984795693, i10, -1, "com.ingka.ikea.wallet.impl.compose.WalletScreen.<anonymous> (WalletScreen.kt:114)");
                }
                GD.i I10 = u.B(this.f131532b);
                C15068e eVar = this.f131531a;
                mVar.W(-1862273064);
                boolean F10 = mVar.F(eVar);
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(eVar);
                    mVar.u(D10);
                }
                mVar.P();
                u.z(I10, (C17642l) ((C18059h) D10), e10, (C7786b) null, mVar, (i10 << 6) & 896, 8);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class i extends C17540p implements C17642l<C12935h, C16807N> {
        i(Object obj) {
            super(1, obj, C15068e.class, "onEvent", "onEvent(Lcom/ingka/ikea/wallet/impl/model/Wallet$Event;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C12935h) obj);
            return C16807N.f139792a;
        }

        public final void t(C12935h hVar) {
            C17542s.j(hVar, "p0");
            ((C15068e) this.receiver).M(hVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j extends C17540p implements C17642l<C12935h, C16807N> {
        j(Object obj) {
            super(1, obj, C15068e.class, "onEvent", "onEvent(Lcom/ingka/ikea/wallet/impl/model/Wallet$Event;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C12935h) obj);
            return C16807N.f139792a;
        }

        public final void t(C12935h hVar) {
            C17542s.j(hVar, "p0");
            ((C15068e) this.receiver).M(hVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GD.i f131533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C12935h, C16807N> f131534b;

        k(GD.i iVar, C17642l<? super C12935h, C16807N> lVar) {
            this.f131533a = iVar;
            this.f131534b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(new C12935h.a.c(C12935h.a.g.Toolbar));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5842M r13, U0.C4889m r14, int r15) {
            /*
                r12 = this;
                java.lang.String r0 = "$this$IkeaTopAppBar"
                kotlin.jvm.internal.C17542s.j(r13, r0)
                r13 = r15 & 17
                r0 = 16
                if (r13 != r0) goto L_0x0016
                boolean r13 = r14.l()
                if (r13 != 0) goto L_0x0012
                goto L_0x0016
            L_0x0012:
                r14.L()
                goto L_0x0080
            L_0x0016:
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x0025
                r13 = -1
                java.lang.String r0 = "com.ingka.ikea.wallet.impl.compose.WalletScreen.<anonymous>.<anonymous> (WalletScreen.kt:174)"
                r1 = -1190327871(0xffffffffb90d09c1, float:-1.3450441E-4)
                U0.C4895p.S(r1, r15, r13, r0)
            L_0x0025:
                GD.i r13 = r12.f131533a
                boolean r13 = r13.e()
                if (r13 == 0) goto L_0x0077
                int r0 = uK.C18146a.f148609q9
                int r13 = tD.C15064a.f131082b
                r15 = 0
                java.lang.String r1 = J1.j.b(r13, r14, r15)
                SC.G0 r5 = SC.G0.Small
                androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                java.lang.String r15 = "WalletTestTags-ToolbarAttachButton"
                androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r13, r15)
                r13 = -203416551(0xfffffffff3e01c19, float:-3.5511608E31)
                r14.W(r13)
                nI.l<GD.h, XH.N> r13 = r12.f131534b
                boolean r13 = r14.V(r13)
                nI.l<GD.h, XH.N> r15 = r12.f131534b
                java.lang.Object r3 = r14.D()
                if (r13 != 0) goto L_0x005c
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r3 != r13) goto L_0x0064
            L_0x005c:
                vD.v r3 = new vD.v
                r3.<init>(r15)
                r14.u(r3)
            L_0x0064:
                r8 = r3
                nI.a r8 = (nI.C17631a) r8
                r14.P()
                r10 = 196992(0x30180, float:2.76045E-40)
                r11 = 216(0xd8, float:3.03E-43)
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r9 = r14
                SC.F0.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            L_0x0077:
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x0080
                U0.C4895p.R()
            L_0x0080:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vD.u.k.b(s0.M, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class l {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f131535a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                p0.v[] r0 = p0.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.v r1 = p0.v.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p0.v r1 = p0.v.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f131535a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vD.u.l.<clinit>():void");
        }
    }

    public static final void A(C15068e eVar, C17642l<? super C12934g, Boolean> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15068e eVar2 = eVar;
        C17642l<? super C12934g, Boolean> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(eVar2, "viewModel");
        C17542s.j(lVar2, "consumeNavigationEvent");
        C4889m k10 = mVar.k(1211269470);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(eVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1211269470, i13, -1, "com.ingka.ikea.wallet.impl.compose.WalletScreen (WalletScreen.kt:90)");
            }
            A1<GD.i> c10 = j3.a.c(eVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            k10.W(-653638649);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = new L0();
                k10.u(D10);
            }
            L0 l02 = (L0) D10;
            k10.P();
            C12934g c11 = B(c10).c();
            k10.W(-653636206);
            boolean V10 = ((i13 & 112) == 32) | k10.V(c10) | k10.F(eVar2);
            Object D11 = k10.D();
            if (V10 || D11 == aVar.a()) {
                D11 = new e(lVar2, eVar2, c10, (C17164e<? super e>) null);
                k10.u(D11);
            }
            k10.P();
            P.g(c11, (p) D11, k10, 0);
            C13023e g10 = B(c10).g();
            k10.W(-653627623);
            boolean F10 = k10.F(eVar2);
            Object D12 = k10.D();
            if (F10 || D12 == aVar.a()) {
                D12 = new f(eVar2);
                k10.u(D12);
            }
            k10.P();
            x(g10, l02, (C17642l) ((C18059h) D12), k10, C13023e.f110931a | 48);
            C4889m mVar3 = k10;
            C4762x0.a((androidx.compose.ui.d) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, c1.c.e(260786852, true, new g(l02), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, C5850V.c(c2.h.B((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null), c1.c.e(984795693, true, new h(eVar2, c10), k10, 54), mVar3, 805309440, 247);
            C12932e a10 = B(c10).a();
            mVar2 = mVar3;
            mVar2.W(-653612573);
            if (a10 != null) {
                mVar2.W(-653608839);
                boolean F11 = mVar2.F(eVar2);
                Object D13 = mVar2.D();
                if (F11 || D13 == aVar.a()) {
                    D13 = new i(eVar2);
                    mVar2.u(D13);
                }
                mVar2.P();
                C15183n.n(a10, (C17642l) ((C18059h) D13), (androidx.compose.ui.d) null, (F0) null, mVar2, 0, 12);
            }
            mVar2.P();
            if (B(c10).f()) {
                mVar2.W(-653604455);
                boolean F12 = mVar2.F(eVar2);
                Object D14 = mVar2.D();
                if (F12 || D14 == aVar.a()) {
                    D14 = new j(eVar2);
                    mVar2.u(D14);
                }
                mVar2.P();
                p((C17642l) ((C18059h) D14), (androidx.compose.ui.d) null, mVar2, 0, 2);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C15137e(eVar2, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final GD.i B(A1<GD.i> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N C(GD.i iVar, C17642l lVar, C5834E e10, C7786b bVar, int i10, int i11, C4889m mVar, int i12) {
        z(iVar, lVar, e10, bVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C15068e eVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        A(eVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C17642l lVar) {
        lVar.invoke(C12935h.f.BackClicked);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final long L(float f10, float f11, float f12, C4889m mVar, int i10) {
        mVar.W(1379424397);
        if (C4895p.J()) {
            C4895p.S(1379424397, i10, -1, "com.ingka.ikea.wallet.impl.compose.calculateCardSize (WalletScreen.kt:358)");
        }
        float f13 = f12 * f10;
        if (c2.h.v(c2.h.B(f13), f11) <= 0) {
            f11 = c2.h.B(f13);
        } else {
            float f14 = f11 / f10;
            if (c2.h.v(c2.h.B(f14), f12) <= 0) {
                f12 = c2.h.B(f14);
            } else {
                throw new IllegalStateException("wth");
            }
        }
        long b10 = c2.i.b(f11, f12);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return b10;
    }

    private static final v M(C7786b bVar, C4889m mVar, int i10) {
        v vVar;
        mVar.W(729181458);
        if (C4895p.J()) {
            C4895p.S(729181458, i10, -1, "com.ingka.ikea.wallet.impl.compose.calculateOrientation (WalletScreen.kt:444)");
        }
        C7787c b10 = bVar.b();
        if (C17542s.e(b10, C7787c.f50843c)) {
            vVar = C17542s.e(bVar.a(), C7785a.f50835c) ? v.Horizontal : v.Vertical;
        } else if (C17542s.e(b10, C7787c.f50844d)) {
            C7785a a10 = bVar.a();
            vVar = (C17542s.e(a10, C7785a.f50835c) || C17542s.e(a10, C7785a.f50836d)) ? v.Horizontal : v.Vertical;
        } else {
            vVar = v.Horizontal;
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return vVar;
    }

    private static final XH.v<Float, Boolean> N(v vVar, C4889m mVar, int i10) {
        XH.v<Float, Boolean> vVar2;
        mVar.W(-154451574);
        if (C4895p.J()) {
            C4895p.S(-154451574, i10, -1, "com.ingka.ikea.wallet.impl.compose.getAspectRatioAndMatchingRule (WalletScreen.kt:437)");
        }
        int i11 = l.f131535a[vVar.ordinal()];
        if (i11 == 1) {
            vVar2 = C16796C.a(Float.valueOf(0.663113f), Boolean.FALSE);
        } else if (i11 == 2) {
            vVar2 = C16796C.a(Float.valueOf(1.6284722f), Boolean.TRUE);
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return vVar2;
    }

    /* access modifiers changed from: private */
    public static final boolean O(C6230C c10, int i10) {
        return c10.v() == i10 && Math.abs(c10.w()) < 0.1f;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(GD.k r21, p0.v r22, boolean r23, boolean r24, nI.C17631a<XH.C16807N> r25, nI.C17642l<? super GD.C12935h, XH.C16807N> r26, androidx.compose.ui.d r27, U0.C4889m r28, int r29, int r30) {
        /*
            r1 = r21
            r8 = r29
            r0 = 1172741705(0x45e69e49, float:7379.7856)
            r2 = r28
            U0.m r2 = r2.k(r0)
            r3 = r30 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r8 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.V(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r8
            goto L_0x0024
        L_0x0023:
            r3 = r8
        L_0x0024:
            r4 = r30 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r4 = r22
            goto L_0x003f
        L_0x002d:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x002a
            r4 = r22
            boolean r5 = r2.V(r4)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r3 = r3 | r5
        L_0x003f:
            r5 = r30 & 4
            if (r5 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r5 = r23
            goto L_0x005a
        L_0x0048:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r23
            boolean r6 = r2.b(r5)
            if (r6 == 0) goto L_0x0057
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r6
        L_0x005a:
            r6 = r30 & 8
            if (r6 == 0) goto L_0x0063
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r6 = r24
            goto L_0x0075
        L_0x0063:
            r6 = r8 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0060
            r6 = r24
            boolean r7 = r2.b(r6)
            if (r7 == 0) goto L_0x0072
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r7
        L_0x0075:
            r7 = r30 & 16
            if (r7 == 0) goto L_0x007e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r7 = r25
            goto L_0x0090
        L_0x007e:
            r7 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x007b
            r7 = r25
            boolean r9 = r2.F(r7)
            if (r9 == 0) goto L_0x008d
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r3 = r3 | r9
        L_0x0090:
            r9 = r30 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x009a
            r3 = r3 | r10
            r15 = r26
            goto L_0x00ac
        L_0x009a:
            r9 = r8 & r10
            r15 = r26
            if (r9 != 0) goto L_0x00ac
            boolean r9 = r2.F(r15)
            if (r9 == 0) goto L_0x00a9
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r3 = r3 | r9
        L_0x00ac:
            r9 = r30 & 64
            r10 = 1572864(0x180000, float:2.204052E-39)
            if (r9 == 0) goto L_0x00b6
            r3 = r3 | r10
        L_0x00b3:
            r10 = r27
            goto L_0x00c7
        L_0x00b6:
            r10 = r10 & r8
            if (r10 != 0) goto L_0x00b3
            r10 = r27
            boolean r11 = r2.V(r10)
            if (r11 == 0) goto L_0x00c4
            r11 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c6
        L_0x00c4:
            r11 = 524288(0x80000, float:7.34684E-40)
        L_0x00c6:
            r3 = r3 | r11
        L_0x00c7:
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r3
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r12) goto L_0x00dc
            boolean r11 = r2.l()
            if (r11 != 0) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            r2.L()
            goto L_0x01c1
        L_0x00dc:
            if (r9 == 0) goto L_0x00e3
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r20 = r9
            goto L_0x00e5
        L_0x00e3:
            r20 = r10
        L_0x00e5:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00f1
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.wallet.impl.compose.CardContent (WalletScreen.kt:303)"
            U0.C4895p.S(r0, r3, r9, r10)
        L_0x00f1:
            boolean r0 = r1 instanceof GD.k.c
            r9 = 458752(0x70000, float:6.42848E-40)
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r0 == 0) goto L_0x0133
            r0 = -961323474(0xffffffffc6b35e2e, float:-22959.09)
            r2.W(r0)
            r0 = r1
            GD.k$c r0 = (GD.k.c) r0
            int r11 = r3 >> 3
            r12 = r11 & 14
            r13 = r3 & 896(0x380, float:1.256E-42)
            r12 = r12 | r13
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            int r12 = r3 << 3
            r10 = r10 & r12
            r10 = r10 | r11
            r3 = r3 & r9
            r3 = r3 | r10
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r12
            r18 = r3 | r9
            r19 = 64
            r3 = 0
            r9 = r22
            r10 = r0
            r11 = r23
            r12 = r25
            r13 = r24
            r14 = r26
            r15 = r3
            r16 = r20
            r17 = r2
            DD.C12745n.g(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.P()
            goto L_0x01b6
        L_0x0133:
            boolean r0 = r1 instanceof GD.k.b
            if (r0 == 0) goto L_0x0161
            r0 = -960959813(0xffffffffc6b8eabb, float:-23669.365)
            r2.W(r0)
            r0 = r1
            GD.k$b r0 = (GD.k.b) r0
            r11 = r3 & 1008(0x3f0, float:1.413E-42)
            int r3 = r3 >> 3
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r10 = r10 & r3
            r10 = r10 | r11
            r3 = r3 & r9
            r16 = r10 | r3
            r17 = 0
            r9 = r0
            r10 = r22
            r11 = r23
            r12 = r25
            r13 = r26
            r14 = r20
            r15 = r2
            BD.O.d(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.P()
            goto L_0x01b6
        L_0x0161:
            boolean r0 = r1 instanceof GD.k.a
            if (r0 == 0) goto L_0x0190
            r0 = -960637537(0xffffffffc6bdd59f, float:-24298.81)
            r2.W(r0)
            r0 = r1
            GD.k$a r0 = (GD.k.a) r0
            int r9 = r3 >> 3
            r11 = r9 & 14
            r12 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | r12
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r11
            int r3 = r3 >> 6
            r3 = r3 & r10
            r15 = r9 | r3
            r16 = 0
            r9 = r22
            r10 = r0
            r11 = r23
            r12 = r25
            r13 = r20
            r14 = r2
            yD.C15297n.b(r9, r10, r11, r12, r13, r14, r15, r16)
            r2.P()
            goto L_0x01b6
        L_0x0190:
            boolean r0 = r1 instanceof GD.k.d
            if (r0 == 0) goto L_0x01e2
            r0 = -960350601(0xffffffffc6c23677, float:-24859.232)
            r2.W(r0)
            r9 = r1
            GD.k$d r9 = (GD.k.d) r9
            r0 = r3 & 112(0x70, float:1.57E-43)
            int r3 = r3 >> 9
            r10 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r10
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r14 = r0 | r3
            r15 = 0
            r10 = r22
            r11 = r26
            r12 = r20
            r13 = r2
            ED.C12845j.f(r9, r10, r11, r12, r13, r14, r15)
            r2.P()
        L_0x01b6:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01bf
            U0.C4895p.R()
        L_0x01bf:
            r10 = r20
        L_0x01c1:
            U0.Y0 r11 = r2.n()
            if (r11 == 0) goto L_0x01e1
            vD.m r12 = new vD.m
            r0 = r12
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r10
            r8 = r29
            r9 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r12)
        L_0x01e1:
            return
        L_0x01e2:
            r0 = -1416484359(0xffffffffab9229f9, float:-1.0385574E-12)
            r2.W(r0)
            r2.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vD.u.l(GD.k, p0.v, boolean, boolean, nI.a, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(GD.k kVar, v vVar, boolean z10, boolean z11, C17631a aVar, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        l(kVar, vVar, z10, z11, aVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void n(KJ.C15987c<? extends GD.k> r17, nI.C17642l<? super GD.C12935h, XH.C16807N> r18, p0.v r19, androidx.compose.ui.d r20, java.lang.Integer r21, U0.C4889m r22, int r23, int r24) {
        /*
            r9 = r19
            r10 = r23
            r0 = 66517097(0x3f6f869, float:1.4515613E-36)
            r1 = r22
            U0.m r11 = r1.k(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r10 | 6
            r12 = r17
            goto L_0x0028
        L_0x0016:
            r1 = r10 & 6
            r12 = r17
            if (r1 != 0) goto L_0x0027
            boolean r1 = r11.V(r12)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r10
            goto L_0x0028
        L_0x0027:
            r1 = r10
        L_0x0028:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
            r13 = r18
            goto L_0x0043
        L_0x0031:
            r2 = r10 & 48
            r13 = r18
            if (r2 != 0) goto L_0x0043
            boolean r2 = r11.F(r13)
            if (r2 == 0) goto L_0x0040
            r2 = 32
            goto L_0x0042
        L_0x0040:
            r2 = 16
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x004a:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x005a
            boolean r2 = r11.V(r9)
            if (r2 == 0) goto L_0x0057
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r2
        L_0x005a:
            r2 = r24 & 8
            if (r2 == 0) goto L_0x0063
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r3 = r20
            goto L_0x0075
        L_0x0063:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r20
            boolean r4 = r11.V(r3)
            if (r4 == 0) goto L_0x0072
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r4
        L_0x0075:
            r4 = r24 & 16
            if (r4 == 0) goto L_0x007f
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r5 = r21
        L_0x007d:
            r14 = r1
            goto L_0x0092
        L_0x007f:
            r5 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x007b
            r5 = r21
            boolean r6 = r11.V(r5)
            if (r6 == 0) goto L_0x008e
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r1 = r1 | r6
            goto L_0x007d
        L_0x0092:
            r1 = r14 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r6) goto L_0x00a5
            boolean r1 = r11.l()
            if (r1 != 0) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            r11.L()
            r4 = r3
            goto L_0x0135
        L_0x00a5:
            if (r2 == 0) goto L_0x00ab
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r15 = r1
            goto L_0x00ac
        L_0x00ab:
            r15 = r3
        L_0x00ac:
            if (r4 == 0) goto L_0x00b2
            r1 = 0
            r16 = r1
            goto L_0x00b4
        L_0x00b2:
            r16 = r5
        L_0x00b4:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00c0
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.wallet.impl.compose.CardPager (WalletScreen.kt:197)"
            U0.C4895p.S(r0, r14, r1, r2)
        L_0x00c0:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r11.Q(r0)
            r4 = r0
            c2.d r4 = (c2.d) r4
            int r0 = r14 >> 6
            r0 = r0 & 14
            XH.v r0 = N(r9, r11, r0)
            java.lang.Object r1 = r0.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r6 = r1.floatValue()
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            s0.T$a r0 = s0.C5848T.f28733a
            r1 = 6
            s0.T r0 = s0.a0.d(r0, r11, r1)
            r1 = 0
            s0.E r0 = s0.C5850V.f(r0, r11, r1)
            float r0 = r0.d()
            ol.m r1 = ol.m.f100559a
            float r1 = r1.a()
            float r1 = r1 + r0
            float r5 = c2.h.B(r1)
            vD.u$a r8 = new vD.u$a
            r0 = r8
            r1 = r17
            r2 = r16
            r3 = r18
            r9 = r8
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 54
            r1 = 1886459711(0x7071173f, float:2.9845596E29)
            r2 = 1
            c1.a r4 = c1.c.e(r1, r2, r9, r11, r0)
            int r0 = r14 >> 9
            r0 = r0 & 14
            r6 = r0 | 3072(0xc00, float:4.305E-42)
            r7 = 6
            r2 = 0
            r3 = 0
            r1 = r15
            r5 = r11
            s0.C5858d.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0132
            U0.C4895p.R()
        L_0x0132:
            r4 = r15
            r5 = r16
        L_0x0135:
            U0.Y0 r8 = r11.n()
            if (r8 == 0) goto L_0x014e
            vD.k r9 = new vD.k
            r0 = r9
            r1 = r17
            r2 = r18
            r3 = r19
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vD.u.n(KJ.c, nI.l, p0.v, androidx.compose.ui.d, java.lang.Integer, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C15987c cVar, C17642l lVar, v vVar, androidx.compose.ui.d dVar, Integer num, int i10, int i11, C4889m mVar, int i12) {
        n(cVar, lVar, vVar, dVar, num, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void p(nI.C17642l<? super GD.C12935h, XH.C16807N> r7, androidx.compose.ui.d r8, U0.C4889m r9, int r10, int r11) {
        /*
            r0 = 836118297(0x31d62719, float:6.2326646E-9)
            U0.m r9 = r9.k(r0)
            r1 = r11 & 1
            r2 = 4
            if (r1 == 0) goto L_0x000f
            r1 = r10 | 6
            goto L_0x001f
        L_0x000f:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x001e
            boolean r1 = r9.F(r7)
            if (r1 == 0) goto L_0x001b
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r1 = 2
        L_0x001c:
            r1 = r1 | r10
            goto L_0x001f
        L_0x001e:
            r1 = r10
        L_0x001f:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0026
            r1 = r1 | 48
            goto L_0x0036
        L_0x0026:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x0036
            boolean r4 = r9.V(r8)
            if (r4 == 0) goto L_0x0033
            r4 = 32
            goto L_0x0035
        L_0x0033:
            r4 = 16
        L_0x0035:
            r1 = r1 | r4
        L_0x0036:
            r4 = r1 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0048
            boolean r4 = r9.l()
            if (r4 != 0) goto L_0x0043
            goto L_0x0048
        L_0x0043:
            r9.L()
            goto L_0x00bd
        L_0x0048:
            if (r3 == 0) goto L_0x004c
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
        L_0x004c:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0058
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.wallet.impl.compose.DetachCardConfirmationPrompt (WalletScreen.kt:427)"
            U0.C4895p.S(r0, r1, r3, r4)
        L_0x0058:
            r0 = -1621886811(0xffffffff9f53f8a5, float:-4.4886662E-20)
            r9.W(r0)
            r0 = r1 & 14
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L_0x0066
            r5 = r4
            goto L_0x0067
        L_0x0066:
            r5 = r3
        L_0x0067:
            java.lang.Object r6 = r9.D()
            if (r5 != 0) goto L_0x0075
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x007d
        L_0x0075:
            vD.h r6 = new vD.h
            r6.<init>(r7)
            r9.u(r6)
        L_0x007d:
            r5 = r6
            nI.a r5 = (nI.C17631a) r5
            r9.P()
            r6 = -1621884795(0xffffffff9f540085, float:-4.4893176E-20)
            r9.W(r6)
            if (r0 != r2) goto L_0x008c
            r3 = r4
        L_0x008c:
            java.lang.Object r0 = r9.D()
            if (r3 != 0) goto L_0x009a
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x00a2
        L_0x009a:
            vD.i r0 = new vD.i
            r0.<init>(r7)
            r9.u(r0)
        L_0x00a2:
            r2 = r0
            nI.a r2 = (nI.C17631a) r2
            r9.P()
            int r0 = r1 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r6 = 0
            r1 = r5
            r3 = r8
            r4 = r9
            r5 = r0
            BD.C12645x.b(r1, r2, r3, r4, r5, r6)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00bd
            U0.C4895p.R()
        L_0x00bd:
            U0.Y0 r9 = r9.n()
            if (r9 == 0) goto L_0x00cb
            vD.j r0 = new vD.j
            r0.<init>(r7, r8, r10, r11)
            r9.a(r0)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vD.u.p(nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C17642l lVar) {
        lVar.invoke(C12935h.c.b.f110380a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C17642l lVar) {
        lVar.invoke(C12935h.c.a.f110379a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        p(lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void t(C6230C c10, int i10, o oVar, C4889m mVar, int i11) {
        int i12;
        C4889m k10 = mVar.k(-2065091870);
        if ((i11 & 6) == 0) {
            i12 = (k10.V(c10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= k10.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= k10.V(oVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2065091870, i12, -1, "com.ingka.ikea.wallet.impl.compose.HandleResetScrollOnLeave (WalletScreen.kt:380)");
            }
            Integer valueOf = Integer.valueOf(c10.v());
            k10.W(1794121340);
            boolean z10 = true;
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            if ((i12 & 896) != 256) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new b(i10, c10, oVar, (C17164e<? super b>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(valueOf, (p) D10, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new n(c10, i10, oVar, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C6230C c10, int i10, o oVar, int i11, C4889m mVar, int i12) {
        t(c10, i10, oVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void v(Integer num, C6230C c10, C17642l<? super C12935h, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1461847563);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(num) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(c10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1461847563, i11, -1, "com.ingka.ikea.wallet.impl.compose.HandleScrollToIndex (WalletScreen.kt:397)");
            }
            k10.W(1586102299);
            int i12 = i11 & 14;
            boolean z10 = false;
            boolean z11 = (i12 == 4) | ((i11 & 112) == 32);
            if ((i11 & 896) == 256) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new c(num, c10, lVar, (C17164e<? super c>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(num, (p) D10, k10, i12);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new l(num, c10, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(Integer num, C6230C c10, C17642l lVar, int i10, C4889m mVar, int i11) {
        v(num, c10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void x(C13023e eVar, L0 l02, C17642l<? super C12935h, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C13023e eVar2 = eVar;
        L0 l03 = l02;
        C17642l<? super C12935h, C16807N> lVar2 = lVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-783965863);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(eVar) : k10.F(eVar) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(l02) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-783965863, i11, -1, "com.ingka.ikea.wallet.impl.compose.HandleUserMessage (WalletScreen.kt:411)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            k10.W(1537662586);
            int i13 = i11 & 14;
            boolean z10 = true;
            boolean F10 = (i13 == 4 || ((i11 & 8) != 0 && k10.F(eVar))) | k10.F(context) | ((i11 & 112) == 32);
            if ((i11 & 896) != 256) {
                z10 = false;
            }
            boolean z11 = z10 | F10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                d dVar = new d(eVar, context, l02, lVar, (C17164e<? super d>) null);
                k10.u(dVar);
                D10 = dVar;
            }
            k10.P();
            P.g(eVar, (p) D10, k10, C13023e.f110931a | i13);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C15139g(eVar, l02, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C13023e eVar, L0 l02, C17642l lVar, int i10, C4889m mVar, int i11) {
        x(eVar, l02, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void z(GD.i r39, nI.C17642l<? super GD.C12935h, XH.C16807N> r40, s0.C5834E r41, e5.C7786b r42, U0.C4889m r43, int r44, int r45) {
        /*
            r1 = r39
            r10 = r40
            r11 = r44
            r0 = 4
            java.lang.String r2 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r10, r2)
            r2 = 1220365162(0x48bd4b6a, float:387675.3)
            r3 = r43
            U0.m r15 = r3.k(r2)
            r12 = 1
            r3 = r45 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0023
            r3 = r11 | 6
            goto L_0x0033
        L_0x0023:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x0032
            boolean r3 = r15.V(r1)
            if (r3 == 0) goto L_0x002f
            r3 = r0
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            r3 = r3 | r11
            goto L_0x0033
        L_0x0032:
            r3 = r11
        L_0x0033:
            r5 = r45 & 2
            if (r5 == 0) goto L_0x003a
            r3 = r3 | 48
            goto L_0x004a
        L_0x003a:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x004a
            boolean r5 = r15.F(r10)
            if (r5 == 0) goto L_0x0047
            r5 = 32
            goto L_0x0049
        L_0x0047:
            r5 = 16
        L_0x0049:
            r3 = r3 | r5
        L_0x004a:
            r0 = r45 & 4
            if (r0 == 0) goto L_0x0053
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r5 = r41
            goto L_0x0065
        L_0x0053:
            r5 = r11 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0050
            r5 = r41
            boolean r6 = r15.V(r5)
            if (r6 == 0) goto L_0x0062
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r6
        L_0x0065:
            r6 = r11 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x007e
            r6 = r45 & 8
            if (r6 != 0) goto L_0x0078
            r6 = r42
            boolean r7 = r15.F(r6)
            if (r7 == 0) goto L_0x007a
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x0078:
            r6 = r42
        L_0x007a:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r3 = r3 | r7
            goto L_0x0080
        L_0x007e:
            r6 = r42
        L_0x0080:
            r7 = r3 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0095
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            r15.L()
            r3 = r5
            r4 = r6
            r2 = r15
            goto L_0x0235
        L_0x0095:
            r15.G()
            r7 = r11 & 1
            r8 = 0
            r9 = 0
            r14 = 0
            if (r7 == 0) goto L_0x00b2
            boolean r7 = r15.O()
            if (r7 == 0) goto L_0x00a6
            goto L_0x00b2
        L_0x00a6:
            r15.L()
            r0 = r45 & 8
            if (r0 == 0) goto L_0x00af
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00af:
            r0 = r5
        L_0x00b0:
            r7 = r6
            goto L_0x00ca
        L_0x00b2:
            if (r0 == 0) goto L_0x00ba
            r0 = 3
            s0.E r0 = androidx.compose.foundation.layout.D.c(r9, r9, r0, r8)
            goto L_0x00bb
        L_0x00ba:
            r0 = r5
        L_0x00bb:
            r5 = r45 & 8
            if (r5 == 0) goto L_0x00b0
            P0.e r5 = P0.b.b(r15, r14)
            e5.b r5 = r5.a()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r7 = r5
        L_0x00ca:
            r15.y()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00d9
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.wallet.impl.compose.WalletScreen (WalletScreen.kt:142)"
            U0.C4895p.S(r2, r3, r5, r6)
        L_0x00d9:
            int r2 = r3 >> 9
            r2 = r2 & 14
            p0.v r5 = M(r7, r15, r2)
            tK.h r2 = SC.C13575d.a(r15, r14)
            long r24 = r2.l0()
            int[] r2 = vD.u.l.f131535a
            int r6 = r5.ordinal()
            r2 = r2[r6]
            if (r2 == r12) goto L_0x0104
            if (r2 != r4) goto L_0x00fe
            p1.v0$a r2 = p1.C5747v0.f27350b
            long r16 = r2.h()
        L_0x00fb:
            r29 = r16
            goto L_0x0118
        L_0x00fe:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0104:
            r22 = 14
            r23 = 0
            r18 = 1062836634(0x3f59999a, float:0.85)
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r24
            long r16 = p1.C5747v0.o(r16, r18, r19, r20, r21, r22, r23)
            goto L_0x00fb
        L_0x0118:
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r2, r9, r12, r8)
            r20 = 2
            r21 = 0
            r19 = 0
            r17 = r24
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r14)
            int r16 = U0.C4883j.a(r15, r14)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r13 = r17.a()
            U0.f r19 = r15.m()
            if (r19 != 0) goto L_0x014f
            U0.C4883j.c()
        L_0x014f:
            r15.I()
            boolean r19 = r15.i()
            if (r19 == 0) goto L_0x015c
            r15.p(r13)
            goto L_0x015f
        L_0x015c:
            r15.t()
        L_0x015f:
            U0.m r13 = U0.F1.a(r15)
            nI.p r8 = r17.c()
            U0.F1.c(r13, r6, r8)
            nI.p r6 = r17.e()
            U0.F1.c(r13, r14, r6)
            nI.p r6 = r17.b()
            boolean r8 = r13.i()
            if (r8 != 0) goto L_0x0189
            java.lang.Object r8 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r14)
            if (r8 != 0) goto L_0x0197
        L_0x0189:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r13.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r13.w(r8, r6)
        L_0x0197:
            nI.p r6 = r17.d()
            U0.F1.c(r13, r4, r6)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            KJ.f r4 = r39.b()
            java.lang.Integer r6 = r39.d()
            r8 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.f(r2, r9, r12, r8)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.h(r2, r0)
            r13 = r3 & 112(0x70, float:1.57E-43)
            r9 = 0
            r2 = r4
            r3 = r40
            r4 = r5
            r5 = r8
            r24 = r7
            r7 = r15
            r8 = r13
            n(r2, r3, r4, r5, r6, r7, r8, r9)
            ol.v r2 = ol.v.BACK
            O0.f1 r3 = O0.f1.f10774a
            int r4 = O0.f1.f10780g
            O0.e1 r26 = r3.a(r15, r4)
            r37 = 28
            r38 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r27 = r29
            O0.e1 r19 = O0.e1.c(r26, r27, r29, r31, r33, r35, r37, r38)
            r3 = -1862224533(0xffffffff9100b56b, float:-1.0153323E-28)
            r15.W(r3)
            r3 = 32
            if (r13 != r3) goto L_0x01e6
            r14 = r12
            goto L_0x01e7
        L_0x01e6:
            r14 = 0
        L_0x01e7:
            java.lang.Object r3 = r15.D()
            if (r14 != 0) goto L_0x01f5
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x01fd
        L_0x01f5:
            vD.d r3 = new vD.d
            r3.<init>(r10)
            r15.u(r3)
        L_0x01fd:
            r13 = r3
            nI.a r13 = (nI.C17631a) r13
            r15.P()
            vD.u$k r3 = new vD.u$k
            r3.<init>(r1, r10)
            r4 = 54
            r5 = -1190327871(0xffffffffb90d09c1, float:-1.3450441E-4)
            c1.a r17 = c1.c.e(r5, r12, r3, r15, r4)
            r22 = 196614(0x30006, float:2.75515E-40)
            r23 = 348(0x15c, float:4.88E-43)
            r14 = 0
            r3 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r12 = r2
            r2 = r15
            r15 = r3
            r21 = r2
            ol.p.c(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0232
            U0.C4895p.R()
        L_0x0232:
            r3 = r0
            r4 = r24
        L_0x0235:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x024c
            vD.f r8 = new vD.f
            r0 = r8
            r1 = r39
            r2 = r40
            r5 = r44
            r6 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x024c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vD.u.z(GD.i, nI.l, s0.E, e5.b, U0.m, int, int):void");
    }
}
