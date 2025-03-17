package O0;

import E1.C4469b;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import L1.x;
import N1.Y;
import Q0.s;
import QJ.Q;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.C4912y;
import U0.F1;
import U0.J0;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.ui.d;
import c2.C5267b;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.L;
import m0.C5544h;
import m0.C5546i;
import m0.C5554m;
import m0.C5568x;
import m0.C5570z;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import p1.d1;
import p1.i1;
import pI.C17752b;
import s0.C5842M;
import s0.C5843N;
import s0.C5848T;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\u001az\u0010\u0011\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a~\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0001\u0010.\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u001c2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a@\u00107\u001a\u0002062\u0006\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00132\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001022\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u000104H@¢\u0006\u0004\b7\u00108\"\u0014\u0010:\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109\"\u001a\u0010=\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u00109\u001a\u0004\b;\u0010<\"\u0014\u0010?\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u00109\"\u0014\u0010A\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u00109\"\u001a\u0010F\u001a\u00020B8\u0000X\u0004¢\u0006\f\n\u0004\b.\u0010C\u001a\u0004\bD\u0010E\"\u0014\u0010H\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u00109\"\u0014\u0010J\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u00109\"\u0014\u0010L\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u00109\"\u0014\u0010N\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u00109\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q²\u0006\f\u0010O\u001a\u00020\u00138\nX\u0002²\u0006\f\u0010P\u001a\u00020\"8\nX\u0002"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "title", "Landroidx/compose/ui/d;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Ls0/M;", "actions", "Lc2/h;", "expandedHeight", "Ls0/T;", "windowInsets", "LO0/e1;", "colors", "LO0/g1;", "scrollBehavior", "a", "(LnI/p;Landroidx/compose/ui/d;LnI/p;LnI/q;FLs0/T;LO0/e1;LO0/g1;LU0/m;II)V", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "LO0/h1;", "j", "(FFFLU0/m;II)LO0/h1;", "LN1/Y;", "titleTextStyle", "", "centeredTitle", "b", "(Landroidx/compose/ui/d;LnI/p;LN1/Y;ZLnI/p;LnI/q;FLs0/T;LO0/e1;LO0/g1;LU0/m;II)V", "LO0/A0;", "scrolledOffset", "Lp1/v0;", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "Landroidx/compose/foundation/layout/d$m;", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/d$e;", "titleHorizontalArrangement", "", "titleBottomPadding", "hideTitleSemantics", "e", "(Landroidx/compose/ui/d;LO0/A0;JJJLnI/p;LN1/Y;FLandroidx/compose/foundation/layout/d$m;Landroidx/compose/foundation/layout/d$e;IZLnI/p;LnI/p;LU0/m;II)V", "state", "velocity", "Lm0/z;", "flingAnimationSpec", "Lm0/i;", "snapAnimationSpec", "Lc2/y;", "k", "(LO0/h1;FLm0/z;Lm0/i;LdI/e;)Ljava/lang/Object;", "F", "BottomAppBarHorizontalPadding", "getBottomAppBarVerticalPadding", "()F", "BottomAppBarVerticalPadding", "c", "FABHorizontalPadding", "d", "FABVerticalPadding", "Lm0/x;", "Lm0/x;", "getTopTitleAlphaEasing", "()Lm0/x;", "TopTitleAlphaEasing", "f", "MediumTitleBottomPadding", "g", "LargeTitleBottomPadding", "h", "TopAppBarHorizontalPadding", "i", "TopAppBarTitleInset", "colorTransitionFraction", "appBarContainerColor", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.e  reason: case insensitive filesystem */
public final class C4724e {

    /* renamed from: a  reason: collision with root package name */
    private static final float f10543a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f10544b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f10545c;

    /* renamed from: d  reason: collision with root package name */
    private static final float f10546d;

    /* renamed from: e  reason: collision with root package name */
    private static final C5568x f10547e = new C5568x(0.8f, 0.0f, 0.8f, 0.15f);

    /* renamed from: f  reason: collision with root package name */
    private static final float f10548f = c2.h.B((float) 24);

    /* renamed from: g  reason: collision with root package name */
    private static final float f10549g = c2.h.B((float) 28);

    /* renamed from: h  reason: collision with root package name */
    private static final float f10550h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final float f10551i;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.e$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10552c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10553d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10554e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q<C5842M, C4889m, Integer, C16807N> f10555f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f10556g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5848T f10557h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e1 f10558i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g1 f10559j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f10560k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f10561l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super C4889m, ? super Integer, C16807N> pVar, androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super C5842M, ? super C4889m, ? super Integer, C16807N> qVar, float f10, C5848T t10, e1 e1Var, g1 g1Var, int i10, int i11) {
            super(2);
            this.f10552c = pVar;
            this.f10553d = dVar;
            this.f10554e = pVar2;
            this.f10555f = qVar;
            this.f10556g = f10;
            this.f10557h = t10;
            this.f10558i = e1Var;
            this.f10559j = g1Var;
            this.f10560k = i10;
            this.f10561l = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4724e.a(this.f10552c, this.f10553d, this.f10554e, this.f10555f, this.f10556g, this.f10557h, this.f10558i, this.f10559j, mVar, M0.a(this.f10560k | 1), this.f10561l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$b */
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g1 f10562c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g1 g1Var, float f10) {
            super(0);
            this.f10562c = g1Var;
            this.f10563d = f10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.getState();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke() {
            /*
                r3 = this;
                O0.g1 r0 = r3.f10562c
                r1 = 0
                if (r0 == 0) goto L_0x0014
                O0.h1 r0 = r0.getState()
                if (r0 == 0) goto L_0x0014
                float r0 = r0.e()
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                goto L_0x0015
            L_0x0014:
                r0 = r1
            L_0x0015:
                float r2 = r3.f10563d
                float r2 = -r2
                boolean r0 = kotlin.jvm.internal.C17542s.c(r0, r2)
                if (r0 != 0) goto L_0x002f
                O0.g1 r0 = r3.f10562c
                if (r0 == 0) goto L_0x0026
                O0.h1 r1 = r0.getState()
            L_0x0026:
                if (r1 != 0) goto L_0x0029
                goto L_0x002f
            L_0x0029:
                float r0 = r3.f10563d
                float r0 = -r0
                r1.i(r0)
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.C4724e.b.invoke():void");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "b", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5848T f10564c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10565d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g1 f10566e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1 f10567f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10568g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Y f10569h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f10570i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10571j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10572k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5848T t10, float f10, g1 g1Var, e1 e1Var, p<? super C4889m, ? super Integer, C16807N> pVar, Y y10, boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3) {
            super(2);
            this.f10564c = t10;
            this.f10565d = f10;
            this.f10566e = g1Var;
            this.f10567f = e1Var;
            this.f10568g = pVar;
            this.f10569h = y10;
            this.f10570i = z10;
            this.f10571j = pVar2;
            this.f10572k = pVar3;
        }

        /* access modifiers changed from: private */
        public static final float c(g1 g1Var) {
            h1 state;
            if (g1Var == null || (state = g1Var.getState()) == null) {
                return 0.0f;
            }
            return state.d();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: O0.A0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r22, int r23) {
            /*
                r21 = this;
                r0 = r21
                r13 = r22
                r1 = r23
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0017
                boolean r2 = r22.l()
                if (r2 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r22.L()
                goto L_0x00a8
            L_0x0017:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0026
                r2 = -1
                java.lang.String r3 = "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)"
                r4 = -1943739546(0xffffffff8c24e366, float:-1.2702531E-31)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0026:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                s0.T r2 = r0.f10564c
                androidx.compose.ui.d r1 = s0.C5851W.d(r1, r2)
                androidx.compose.ui.d r1 = m1.e.b(r1)
                float r2 = r0.f10565d
                r3 = 1
                r4 = 0
                r5 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.k(r1, r5, r2, r3, r4)
                O0.g1 r2 = r0.f10566e
                boolean r2 = r13.V(r2)
                O0.g1 r3 = r0.f10566e
                java.lang.Object r4 = r22.D()
                if (r2 != 0) goto L_0x0051
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r4 != r2) goto L_0x0059
            L_0x0051:
                O0.f r4 = new O0.f
                r4.<init>(r3)
                r13.u(r4)
            L_0x0059:
                r2 = r4
                O0.A0 r2 = (O0.A0) r2
                O0.e1 r3 = r0.f10567f
                long r3 = r3.e()
                O0.e1 r5 = r0.f10567f
                long r5 = r5.f()
                O0.e1 r7 = r0.f10567f
                long r7 = r7.d()
                nI.p<U0.m, java.lang.Integer, XH.N> r9 = r0.f10568g
                N1.Y r10 = r0.f10569h
                androidx.compose.foundation.layout.d r11 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$f r12 = r11.b()
                boolean r14 = r0.f10570i
                if (r14 == 0) goto L_0x0083
                androidx.compose.foundation.layout.d$f r11 = r11.b()
            L_0x0080:
                r18 = r11
                goto L_0x0088
            L_0x0083:
                androidx.compose.foundation.layout.d$e r11 = r11.f()
                goto L_0x0080
            L_0x0088:
                nI.p<U0.m, java.lang.Integer, XH.N> r11 = r0.f10571j
                r16 = r11
                nI.p<U0.m, java.lang.Integer, XH.N> r11 = r0.f10572k
                r17 = r11
                r19 = 113246208(0x6c00000, float:7.2222373E-35)
                r20 = 3126(0xc36, float:4.38E-42)
                r11 = 1065353216(0x3f800000, float:1.0)
                r14 = 0
                r15 = 0
                r13 = r18
                r18 = r22
                O0.C4724e.e(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00a8
                U0.C4895p.R()
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.C4724e.c.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.e$d */
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10573c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10574d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y f10575e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f10576f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10577g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q<C5842M, C4889m, Integer, C16807N> f10578h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f10579i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C5848T f10580j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ e1 f10581k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ g1 f10582l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f10583m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f10584n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, Y y10, boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super C5842M, ? super C4889m, ? super Integer, C16807N> qVar, float f10, C5848T t10, e1 e1Var, g1 g1Var, int i10, int i11) {
            super(2);
            this.f10573c = dVar;
            this.f10574d = pVar;
            this.f10575e = y10;
            this.f10576f = z10;
            this.f10577g = pVar2;
            this.f10578h = qVar;
            this.f10579i = f10;
            this.f10580j = t10;
            this.f10581k = e1Var;
            this.f10582l = g1Var;
            this.f10583m = i10;
            this.f10584n = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4724e.b(this.f10573c, this.f10574d, this.f10575e, this.f10576f, this.f10577g, this.f10578h, this.f10579i, this.f10580j, this.f10581k, this.f10582l, mVar, M0.a(this.f10583m | 1), this.f10584n);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$e  reason: collision with other inner class name */
    static final class C0158e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<C5842M, C4889m, Integer, C16807N> f10585c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0158e(q<? super C5842M, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f10585c = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1370231018, i10, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
                }
                C5073d.e c10 = C5073d.f18068a.c();
                C5437c.C0386c i11 = C5437c.f24302a.i();
                q<C5842M, C4889m, Integer, C16807N> qVar = this.f10585c;
                d.a aVar = androidx.compose.ui.d.f18749a;
                I b10 = G.b(c10, i11, mVar, 54);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, b10, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b11 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar2.d());
                qVar.invoke(C5843N.f28726a, mVar, 6);
                mVar.x();
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "LXH/N;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$f */
    static final class f extends C17544u implements C17642l<Float, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g1 f10586c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g1 g1Var) {
            super(1);
            this.f10586c = g1Var;
        }

        public final void a(float f10) {
            h1 state = this.f10586c.getState();
            state.h(state.d() + f10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "velocity", "LXH/N;", "<anonymous>", "(LQJ/Q;F)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", l = {1911}, m = "invokeSuspend")
    /* renamed from: O0.e$g */
    static final class g extends kotlin.coroutines.jvm.internal.l implements q<Q, Float, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f10587c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ float f10588d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g1 f10589e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(g1 g1Var, C17164e<? super g> eVar) {
            super(3, eVar);
            this.f10589e = g1Var;
        }

        public final Object i(Q q10, float f10, C17164e<? super C16807N> eVar) {
            g gVar = new g(this.f10589e, eVar);
            gVar.f10588d = f10;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Q) obj, ((Number) obj2).floatValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f10587c;
            if (i10 == 0) {
                y.b(obj);
                float f11 = this.f10588d;
                h1 state = this.f10589e.getState();
                C5570z<Float> c10 = this.f10589e.c();
                C5546i<Float> d10 = this.f10589e.d();
                this.f10587c = 1;
                if (C4724e.k(state, f11, c10, d10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$h */
    static final class h extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g1 f10590c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g1 g1Var) {
            super(0);
            this.f10590c = g1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.getState();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Float invoke() {
            /*
                r3 = this;
                O0.g1 r0 = r3.f10590c
                r1 = 0
                if (r0 == 0) goto L_0x0010
                O0.h1 r0 = r0.getState()
                if (r0 == 0) goto L_0x0010
                float r0 = r0.f()
                goto L_0x0011
            L_0x0010:
                r0 = r1
            L_0x0011:
                r2 = 1008981770(0x3c23d70a, float:0.01)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x001a
                r1 = 1065353216(0x3f800000, float:1.0)
            L_0x001a:
                java.lang.Float r0 = java.lang.Float.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.C4724e.h.invoke():java.lang.Float");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$i */
    static final class i extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f10591c = new i();

        i() {
            super(1);
        }

        public final void a(x xVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$j */
    static final class j implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A0 f10592a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5073d.e f10593b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5073d.m f10594c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f10595d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.e$j$a */
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a0 f10596c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f10597d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a0 f10598e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C5073d.e f10599f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ long f10600g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a0 f10601h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ K f10602i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C5073d.m f10603j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ int f10604k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ int f10605l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, int i10, a0 a0Var2, C5073d.e eVar, long j10, a0 a0Var3, K k10, C5073d.m mVar, int i11, int i12) {
                super(1);
                this.f10596c = a0Var;
                this.f10597d = i10;
                this.f10598e = a0Var2;
                this.f10599f = eVar;
                this.f10600g = j10;
                this.f10601h = a0Var3;
                this.f10602i = k10;
                this.f10603j = mVar;
                this.f10604k = i11;
                this.f10605l = i12;
            }

            public final void a(a0.a aVar) {
                int l10;
                int i10;
                int z02;
                int l11;
                a0 a0Var = this.f10596c;
                a0.a.m(aVar, a0Var, 0, (this.f10597d - a0Var.z0()) / 2, 0.0f, 4, (Object) null);
                a0 a0Var2 = this.f10598e;
                C5073d.e eVar = this.f10599f;
                C5073d dVar = C5073d.f18068a;
                if (C17542s.e(eVar, dVar.b())) {
                    l10 = (C5267b.l(this.f10600g) - this.f10598e.E0()) / 2;
                    if (l10 < this.f10596c.E0()) {
                        l11 = this.f10596c.E0() - l10;
                    } else if (this.f10598e.E0() + l10 > C5267b.l(this.f10600g) - this.f10601h.E0()) {
                        l11 = (C5267b.l(this.f10600g) - this.f10601h.E0()) - (this.f10598e.E0() + l10);
                    }
                    l10 += l11;
                } else {
                    l10 = C17542s.e(eVar, dVar.c()) ? (C5267b.l(this.f10600g) - this.f10598e.E0()) - this.f10601h.E0() : Math.max(this.f10602i.K0(C4724e.f10551i), this.f10596c.E0());
                }
                int i11 = l10;
                C5073d.m mVar = this.f10603j;
                if (C17542s.e(mVar, dVar.b())) {
                    z02 = (this.f10597d - this.f10598e.z0()) / 2;
                } else {
                    if (C17542s.e(mVar, dVar.a())) {
                        int i12 = this.f10604k;
                        if (i12 == 0) {
                            z02 = this.f10597d - this.f10598e.z0();
                        } else {
                            int z03 = i12 - (this.f10598e.z0() - this.f10605l);
                            int z04 = this.f10598e.z0() + z03;
                            if (z04 > C5267b.k(this.f10600g)) {
                                z03 -= z04 - C5267b.k(this.f10600g);
                            }
                            i10 = (this.f10597d - this.f10598e.z0()) - Math.max(0, z03);
                        }
                    } else {
                        i10 = 0;
                    }
                    a0.a.m(aVar, a0Var2, i11, i10, 0.0f, 4, (Object) null);
                    a0.a.m(aVar, this.f10601h, C5267b.l(this.f10600g) - this.f10601h.E0(), (this.f10597d - this.f10601h.z0()) / 2, 0.0f, 4, (Object) null);
                }
                i10 = z02;
                a0.a.m(aVar, a0Var2, i11, i10, 0.0f, 4, (Object) null);
                a0.a.m(aVar, this.f10601h, C5267b.l(this.f10600g) - this.f10601h.E0(), (this.f10597d - this.f10601h.z0()) / 2, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        j(A0 a02, C5073d.e eVar, C5073d.m mVar, int i10) {
            this.f10592a = a02;
            this.f10593b = eVar;
            this.f10594c = mVar;
            this.f10595d = i10;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            List<? extends H> list2 = list;
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                H h10 = (H) list2.get(i11);
                if (C17542s.e(androidx.compose.ui.layout.a.a(h10), "navigationIcon")) {
                    a0 i02 = h10.i0(C5267b.d(j10, 0, 0, 0, 0, 14, (Object) null));
                    int size2 = list.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        H h11 = (H) list2.get(i12);
                        if (C17542s.e(androidx.compose.ui.layout.a.a(h11), "actionIcons")) {
                            a0 i03 = h11.i0(C5267b.d(j10, 0, 0, 0, 0, 14, (Object) null));
                            int l10 = C5267b.l(j10) == Integer.MAX_VALUE ? C5267b.l(j10) : C17978n.e((C5267b.l(j10) - i02.E0()) - i03.E0(), 0);
                            int size3 = list.size();
                            for (int i13 = 0; i13 < size3; i13++) {
                                H h12 = (H) list2.get(i13);
                                if (C17542s.e(androidx.compose.ui.layout.a.a(h12), "title")) {
                                    a0 i04 = h12.i0(C5267b.d(j10, 0, l10, 0, 0, 12, (Object) null));
                                    int n02 = i04.n0(C4469b.b()) != Integer.MIN_VALUE ? i04.n0(C4469b.b()) : 0;
                                    float a10 = this.f10592a.a();
                                    if (!Float.isNaN(a10)) {
                                        i10 = C17752b.e(a10);
                                    }
                                    int k11 = C5267b.k(j10) == Integer.MAX_VALUE ? C5267b.k(j10) : C5267b.k(j10) + i10;
                                    return K.v0(k10, C5267b.l(j10), k11, (Map) null, new a(i02, k11, i04, this.f10593b, j10, i03, k10, this.f10594c, this.f10595d, n02), 4, (Object) null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.e$k */
    static final class k extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10606c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A0 f10607d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f10608e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f10609f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f10610g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10611h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Y f10612i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f10613j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C5073d.m f10614k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C5073d.e f10615l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f10616m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f10617n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10618o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10619p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f10620q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f10621r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(androidx.compose.ui.d dVar, A0 a02, long j10, long j11, long j12, p<? super C4889m, ? super Integer, C16807N> pVar, Y y10, float f10, C5073d.m mVar, C5073d.e eVar, int i10, boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, int i11, int i12) {
            super(2);
            this.f10606c = dVar;
            this.f10607d = a02;
            this.f10608e = j10;
            this.f10609f = j11;
            this.f10610g = j12;
            this.f10611h = pVar;
            this.f10612i = y10;
            this.f10613j = f10;
            this.f10614k = mVar;
            this.f10615l = eVar;
            this.f10616m = i10;
            this.f10617n = z10;
            this.f10618o = pVar2;
            this.f10619p = pVar3;
            this.f10620q = i11;
            this.f10621r = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            androidx.compose.ui.d dVar = this.f10606c;
            androidx.compose.ui.d dVar2 = dVar;
            C4724e.e(dVar2, this.f10607d, this.f10608e, this.f10609f, this.f10610g, this.f10611h, this.f10612i, this.f10613j, this.f10614k, this.f10615l, this.f10616m, this.f10617n, this.f10618o, this.f10619p, mVar2, M0.a(this.f10620q | 1), M0.a(this.f10621r));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO0/h1;", "b", "()LO0/h1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$l */
    static final class l extends C17544u implements C17631a<h1> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f10622c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10623d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f10624e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(float f10, float f11, float f12) {
            super(0);
            this.f10622c = f10;
            this.f10623d = f11;
            this.f10624e = f12;
        }

        /* renamed from: b */
        public final h1 invoke() {
            return new h1(this.f10622c, this.f10623d, this.f10624e);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", l = {2501, 2515}, m = "settleAppBar")
    /* renamed from: O0.e$m */
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f10625c;

        /* renamed from: d  reason: collision with root package name */
        Object f10626d;

        /* renamed from: e  reason: collision with root package name */
        Object f10627e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f10628f;

        /* renamed from: g  reason: collision with root package name */
        int f10629g;

        m(C17164e<? super m> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f10628f = obj;
            this.f10629g |= Integer.MIN_VALUE;
            return C4724e.k((h1) null, 0.0f, (C5570z<Float>) null, (C5546i<Float>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$n */
    static final class n extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ L f10630c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h1 f10631d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ L f10632e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(L l10, h1 h1Var, L l11) {
            super(1);
            this.f10630c = l10;
            this.f10631d = h1Var;
            this.f10632e = l11;
        }

        public final void a(C5544h<Float, C5554m> hVar) {
            float floatValue = hVar.e().floatValue() - this.f10630c.f144345a;
            float d10 = this.f10631d.d();
            this.f10631d.h(d10 + floatValue);
            float abs = Math.abs(d10 - this.f10631d.d());
            this.f10630c.f144345a = hVar.e().floatValue();
            this.f10632e.f144345a = hVar.f().floatValue();
            if (Math.abs(floatValue - abs) > 0.5f) {
                hVar.a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5544h) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e$o */
    static final class o extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h1 f10633c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(h1 h1Var) {
            super(1);
            this.f10633c = h1Var;
        }

        public final void a(C5544h<Float, C5554m> hVar) {
            this.f10633c.h(hVar.e().floatValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5544h) obj);
            return C16807N.f139792a;
        }
    }

    static {
        float f10 = (float) 16;
        float f11 = (float) 12;
        float B10 = c2.h.B(c2.h.B(f10) - c2.h.B(f11));
        f10543a = B10;
        float B11 = c2.h.B(c2.h.B(f10) - c2.h.B(f11));
        f10544b = B11;
        f10545c = c2.h.B(c2.h.B(f10) - B10);
        f10546d = c2.h.B(c2.h.B(f11) - B11);
        float B12 = c2.h.B((float) 4);
        f10550h = B12;
        f10551i = c2.h.B(c2.h.B(f10) - B12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r24, androidx.compose.ui.d r25, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r26, nI.q<? super s0.C5842M, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, float r28, s0.C5848T r29, O0.e1 r30, O0.g1 r31, U0.C4889m r32, int r33, int r34) {
        /*
            r9 = r33
            r10 = r34
            r0 = 1952988048(0x74683b90, float:7.359747E31)
            r1 = r32
            U0.m r1 = r1.k(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r9 | 6
            r3 = r2
            r2 = r24
            goto L_0x002b
        L_0x0017:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r24
            boolean r3 = r1.F(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r9
            goto L_0x002b
        L_0x0028:
            r2 = r24
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r25
            goto L_0x0046
        L_0x0034:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r25
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r26
            goto L_0x0061
        L_0x004f:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r26
            boolean r8 = r1.F(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r27
            goto L_0x007c
        L_0x006a:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r27
            boolean r12 = r1.F(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r10 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r28
            goto L_0x0097
        L_0x0085:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r28
            boolean r14 = r1.c(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b1
            r14 = r10 & 32
            if (r14 != 0) goto L_0x00ab
            r14 = r29
            boolean r15 = r1.V(r14)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r14 = r29
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r15
            goto L_0x00b3
        L_0x00b1:
            r14 = r29
        L_0x00b3:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00ce
            r15 = r10 & 64
            if (r15 != 0) goto L_0x00c7
            r15 = r30
            boolean r16 = r1.V(r15)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c7:
            r15 = r30
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r16
            goto L_0x00d0
        L_0x00ce:
            r15 = r30
        L_0x00d0:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00db
            r3 = r3 | r17
            r2 = r31
            goto L_0x00ee
        L_0x00db:
            r17 = r9 & r17
            r2 = r31
            if (r17 != 0) goto L_0x00ee
            boolean r17 = r1.V(r2)
            if (r17 == 0) goto L_0x00ea
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r3 = r3 | r17
        L_0x00ee:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r2 = r3 & r17
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r5) goto L_0x010d
            boolean r2 = r1.l()
            if (r2 != 0) goto L_0x00ff
            goto L_0x010d
        L_0x00ff:
            r1.L()
            r2 = r25
            r8 = r31
            r3 = r7
            r4 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            goto L_0x0200
        L_0x010d:
            r1.G()
            r2 = r9 & 1
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = 6
            if (r2 == 0) goto L_0x013a
            boolean r2 = r1.O()
            if (r2 == 0) goto L_0x011f
            goto L_0x013a
        L_0x011f:
            r1.L()
            r0 = r10 & 32
            if (r0 == 0) goto L_0x0128
            r3 = r3 & r17
        L_0x0128:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0130
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0130:
            r2 = r25
        L_0x0132:
            r8 = r31
        L_0x0134:
            r0 = r11
            r4 = r14
            r6 = r15
            r11 = r3
            r3 = r13
            goto L_0x017d
        L_0x013a:
            if (r4 == 0) goto L_0x013f
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x0141
        L_0x013f:
            r2 = r25
        L_0x0141:
            if (r6 == 0) goto L_0x014a
            O0.w r4 = O0.C4759w.f11553a
            nI.p r4 = r4.a()
            r7 = r4
        L_0x014a:
            if (r8 == 0) goto L_0x0153
            O0.w r4 = O0.C4759w.f11553a
            nI.q r4 = r4.b()
            r11 = r4
        L_0x0153:
            if (r12 == 0) goto L_0x015c
            O0.f1 r4 = O0.f1.f10774a
            float r4 = r4.d()
            r13 = r4
        L_0x015c:
            r4 = r10 & 32
            if (r4 == 0) goto L_0x0169
            O0.f1 r4 = O0.f1.f10774a
            s0.T r4 = r4.e(r1, r5)
            r3 = r3 & r17
            r14 = r4
        L_0x0169:
            r4 = r10 & 64
            if (r4 == 0) goto L_0x0178
            O0.f1 r4 = O0.f1.f10774a
            O0.e1 r4 = r4.a(r1, r5)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r6
            r15 = r4
        L_0x0178:
            if (r0 == 0) goto L_0x0132
            r0 = 0
            r8 = r0
            goto L_0x0134
        L_0x017d:
            r1.y()
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x018f
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)"
            r14 = 1952988048(0x74683b90, float:7.359747E31)
            U0.C4895p.S(r14, r11, r12, r13)
        L_0x018f:
            S0.D r12 = S0.D.f12611a
            S0.G r12 = r12.b()
            N1.Y r13 = O0.j1.c(r12, r1, r5)
            c2.h$a r12 = c2.h.f23031b
            float r14 = r12.c()
            boolean r14 = c2.h.D(r3, r14)
            if (r14 != 0) goto L_0x01b3
            float r12 = r12.b()
            boolean r12 = c2.h.D(r3, r12)
            if (r12 == 0) goto L_0x01b0
            goto L_0x01b3
        L_0x01b0:
            r17 = r3
            goto L_0x01bb
        L_0x01b3:
            O0.f1 r12 = O0.f1.f10774a
            float r12 = r12.d()
            r17 = r12
        L_0x01bb:
            int r12 = r11 >> 3
            r12 = r12 & 14
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            int r14 = r11 << 3
            r14 = r14 & 112(0x70, float:1.57E-43)
            r12 = r12 | r14
            int r5 = r11 << 6
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r5
            r11 = r11 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r5
            r11 = r11 | r12
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r5
            r11 = r11 | r12
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r5
            r11 = r11 | r12
            r12 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r12
            r22 = r11 | r5
            r23 = 0
            r14 = 1
            r11 = r2
            r12 = r24
            r15 = r7
            r16 = r0
            r18 = r4
            r19 = r6
            r20 = r8
            r21 = r1
            b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x01fb
            U0.C4895p.R()
        L_0x01fb:
            r5 = r3
            r3 = r7
            r7 = r6
            r6 = r4
            r4 = r0
        L_0x0200:
            U0.Y0 r11 = r1.n()
            if (r11 == 0) goto L_0x0215
            O0.e$a r12 = new O0.e$a
            r0 = r12
            r1 = r24
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0215:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4724e.a(nI.p, androidx.compose.ui.d, nI.p, nI.q, float, s0.T, O0.e1, O0.g1, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: nI.q} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.d r33, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r34, N1.Y r35, boolean r36, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r37, nI.q<? super s0.C5842M, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r38, float r39, s0.C5848T r40, O0.e1 r41, O0.g1 r42, U0.C4889m r43, int r44, int r45) {
        /*
            r6 = r38
            r5 = r39
            r4 = r41
            r3 = r42
            r2 = r44
            r1 = r45
            r0 = -342194911(0xffffffffeb9a8521, float:-3.7360652E26)
            r7 = r43
            U0.m r15 = r7.k(r0)
            r7 = r1 & 1
            if (r7 == 0) goto L_0x001f
            r8 = r2 | 6
            r9 = r8
            r8 = r33
            goto L_0x0033
        L_0x001f:
            r8 = r2 & 6
            if (r8 != 0) goto L_0x0030
            r8 = r33
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x002d
            r9 = 4
            goto L_0x002e
        L_0x002d:
            r9 = 2
        L_0x002e:
            r9 = r9 | r2
            goto L_0x0033
        L_0x0030:
            r8 = r33
            r9 = r2
        L_0x0033:
            r10 = r1 & 2
            if (r10 == 0) goto L_0x003c
            r9 = r9 | 48
            r14 = r34
            goto L_0x004e
        L_0x003c:
            r10 = r2 & 48
            r14 = r34
            if (r10 != 0) goto L_0x004e
            boolean r10 = r15.F(r14)
            if (r10 == 0) goto L_0x004b
            r10 = 32
            goto L_0x004d
        L_0x004b:
            r10 = 16
        L_0x004d:
            r9 = r9 | r10
        L_0x004e:
            r10 = r1 & 4
            if (r10 == 0) goto L_0x0057
            r9 = r9 | 384(0x180, float:5.38E-43)
            r13 = r35
            goto L_0x0069
        L_0x0057:
            r10 = r2 & 384(0x180, float:5.38E-43)
            r13 = r35
            if (r10 != 0) goto L_0x0069
            boolean r10 = r15.V(r13)
            if (r10 == 0) goto L_0x0066
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r9 = r9 | r10
        L_0x0069:
            r10 = r1 & 8
            if (r10 == 0) goto L_0x0072
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r12 = r36
            goto L_0x0084
        L_0x0072:
            r10 = r2 & 3072(0xc00, float:4.305E-42)
            r12 = r36
            if (r10 != 0) goto L_0x0084
            boolean r10 = r15.b(r12)
            if (r10 == 0) goto L_0x0081
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r9 = r9 | r10
        L_0x0084:
            r10 = r1 & 16
            if (r10 == 0) goto L_0x008d
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            r11 = r37
            goto L_0x009f
        L_0x008d:
            r10 = r2 & 24576(0x6000, float:3.4438E-41)
            r11 = r37
            if (r10 != 0) goto L_0x009f
            boolean r10 = r15.F(r11)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r9 = r9 | r10
        L_0x009f:
            r10 = r1 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00a8
            r9 = r9 | r16
            goto L_0x00b8
        L_0x00a8:
            r10 = r2 & r16
            if (r10 != 0) goto L_0x00b8
            boolean r10 = r15.F(r6)
            if (r10 == 0) goto L_0x00b5
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r9 = r9 | r10
        L_0x00b8:
            r10 = r1 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r10 == 0) goto L_0x00c1
            r9 = r9 | r16
            goto L_0x00d1
        L_0x00c1:
            r10 = r2 & r16
            if (r10 != 0) goto L_0x00d1
            boolean r10 = r15.c(r5)
            if (r10 == 0) goto L_0x00ce
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r9 = r9 | r10
        L_0x00d1:
            r10 = r1 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00dc
            r9 = r9 | r16
        L_0x00d9:
            r10 = r40
            goto L_0x00ef
        L_0x00dc:
            r10 = r2 & r16
            if (r10 != 0) goto L_0x00d9
            r10 = r40
            boolean r16 = r15.V(r10)
            if (r16 == 0) goto L_0x00eb
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r9 = r9 | r16
        L_0x00ef:
            r0 = r1 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f8
            r9 = r9 | r17
            goto L_0x0108
        L_0x00f8:
            r0 = r2 & r17
            if (r0 != 0) goto L_0x0108
            boolean r0 = r15.V(r4)
            if (r0 == 0) goto L_0x0105
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0107
        L_0x0105:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0107:
            r9 = r9 | r0
        L_0x0108:
            r0 = r1 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0111
            r9 = r9 | r17
            goto L_0x0121
        L_0x0111:
            r0 = r2 & r17
            if (r0 != 0) goto L_0x0121
            boolean r0 = r15.V(r3)
            if (r0 == 0) goto L_0x011e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0120
        L_0x011e:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0120:
            r9 = r9 | r0
        L_0x0121:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r9
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r14) goto L_0x0138
            boolean r0 = r15.l()
            if (r0 != 0) goto L_0x0131
            goto L_0x0138
        L_0x0131:
            r15.L()
            r1 = r8
            r3 = r15
            goto L_0x02b6
        L_0x0138:
            if (r7 == 0) goto L_0x013d
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x013e
        L_0x013d:
            r0 = r8
        L_0x013e:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x014d
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)"
            r14 = -342194911(0xffffffffeb9a8521, float:-3.7360652E26)
            U0.C4895p.S(r14, r9, r7, r8)
        L_0x014d:
            boolean r7 = java.lang.Float.isNaN(r39)
            if (r7 != 0) goto L_0x02dc
            r7 = 2139095040(0x7f800000, float:Infinity)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x015b
            r7 = 1
            goto L_0x015c
        L_0x015b:
            r7 = 0
        L_0x015c:
            if (r7 != 0) goto L_0x02dc
            U0.I0 r7 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r7 = r15.Q(r7)
            c2.d r7 = (c2.d) r7
            float r7 = r7.H1(r5)
            r8 = 0
            float r7 = tI.C17978n.d(r7, r8)
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r9 = r9 & r16
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 != r8) goto L_0x017b
            r8 = 1
            goto L_0x017c
        L_0x017b:
            r8 = 0
        L_0x017c:
            boolean r17 = r15.c(r7)
            r8 = r8 | r17
            java.lang.Object r14 = r15.D()
            if (r8 != 0) goto L_0x0190
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r14 != r8) goto L_0x0198
        L_0x0190:
            O0.e$b r14 = new O0.e$b
            r14.<init>(r3, r7)
            r15.u(r14)
        L_0x0198:
            nI.a r14 = (nI.C17631a) r14
            r7 = 0
            U0.P.i(r14, r15, r7)
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 != r14) goto L_0x01a4
            r8 = 1
            goto L_0x01a5
        L_0x01a4:
            r8 = r7
        L_0x01a5:
            java.lang.Object r7 = r15.D()
            if (r8 != 0) goto L_0x01b3
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x01bf
        L_0x01b3:
            O0.e$h r7 = new O0.e$h
            r7.<init>(r3)
            U0.A1 r7 = U0.p1.e(r7)
            r15.u(r7)
        L_0x01bf:
            U0.A1 r7 = (U0.A1) r7
            float r7 = d(r7)
            long r7 = r4.a(r7)
            r14 = 1137180672(0x43c80000, float:400.0)
            r1 = 5
            r13 = 0
            r2 = 0
            m0.o0 r1 = m0.C5548j.h(r2, r14, r13, r1, r13)
            r2 = 48
            r14 = 12
            r16 = 0
            r18 = 0
            r17 = 0
            r21 = r9
            r9 = r1
            r10 = r16
            r11 = r18
            r12 = r15
            r1 = r13
            r13 = r2
            r2 = r17
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            U0.A1 r7 = l0.u.a(r7, r9, r10, r11, r12, r13, r14)
            O0.e$e r8 = new O0.e$e
            r8.<init>(r6)
            r9 = 54
            r10 = 1370231018(0x51ac10ea, float:9.2377268E10)
            r14 = 1
            c1.a r17 = c1.c.e(r10, r14, r8, r15, r9)
            r8 = -1193605157(0xffffffffb8db07db, float:-1.0444197E-4)
            r15.W(r8)
            if (r3 == 0) goto L_0x0263
            boolean r8 = r42.b()
            if (r8 != 0) goto L_0x0263
            androidx.compose.ui.d$a r22 = androidx.compose.ui.d.f18749a
            p0.v r24 = p0.v.Vertical
            r8 = r21
            if (r8 != r1) goto L_0x0215
            r9 = r14
            goto L_0x0216
        L_0x0215:
            r9 = r2
        L_0x0216:
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x0224
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x022c
        L_0x0224:
            O0.e$f r10 = new O0.e$f
            r10.<init>(r3)
            r15.u(r10)
        L_0x022c:
            nI.l r10 = (nI.C17642l) r10
            p0.r r23 = p0.q.i(r10, r15, r2)
            if (r8 != r1) goto L_0x0235
            r2 = r14
        L_0x0235:
            java.lang.Object r1 = r15.D()
            if (r2 != 0) goto L_0x0243
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x024c
        L_0x0243:
            O0.e$g r1 = new O0.e$g
            r2 = 0
            r1.<init>(r3, r2)
            r15.u(r1)
        L_0x024c:
            r29 = r1
            nI.q r29 = (nI.q) r29
            r31 = 188(0xbc, float:2.63E-43)
            r32 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            androidx.compose.ui.d r1 = p0.q.h(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0265
        L_0x0263:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
        L_0x0265:
            r15.P()
            androidx.compose.ui.d r1 = r0.s(r1)
            long r18 = c(r7)
            O0.e$c r2 = new O0.e$c
            r7 = r2
            r8 = r40
            r9 = r39
            r10 = r42
            r11 = r41
            r12 = r34
            r13 = r35
            r20 = r0
            r0 = r14
            r14 = r36
            r3 = r15
            r15 = r37
            r16 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = 54
            r8 = -1943739546(0xffffffff8c24e366, float:-1.2702531E-31)
            c1.a r16 = c1.c.e(r8, r0, r2, r3, r7)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = 122(0x7a, float:1.71E-43)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r7 = r1
            r9 = r18
            r17 = r3
            r18 = r0
            r19 = r2
            O0.P0.a(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02b4
            U0.C4895p.R()
        L_0x02b4:
            r1 = r20
        L_0x02b6:
            U0.Y0 r13 = r3.n()
            if (r13 == 0) goto L_0x02db
            O0.e$d r14 = new O0.e$d
            r0 = r14
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r8 = r40
            r9 = r41
            r10 = r42
            r11 = r44
            r12 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x02db:
            return
        L_0x02dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The expandedHeight is expected to be specified and finite"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4724e.b(androidx.compose.ui.d, nI.p, N1.Y, boolean, nI.p, nI.q, float, s0.T, O0.e1, O0.g1, U0.m, int, int):void");
    }

    private static final long c(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final float d(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final void e(androidx.compose.ui.d dVar, A0 a02, long j10, long j11, long j12, p<? super C4889m, ? super Integer, C16807N> pVar, Y y10, float f10, C5073d.m mVar, C5073d.e eVar, int i10, boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, C4889m mVar2, int i11, int i12) {
        int i13;
        int i14;
        androidx.compose.ui.d dVar2 = dVar;
        A0 a03 = a02;
        C5073d.m mVar3 = mVar;
        C5073d.e eVar2 = eVar;
        int i15 = i10;
        boolean z11 = z10;
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar2;
        p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar3;
        int i16 = i11;
        int i17 = i12;
        C4889m k10 = mVar2.k(-742442296);
        if ((i16 & 6) == 0) {
            i13 = (k10.V(dVar2) ? 4 : 2) | i16;
        } else {
            i13 = i16;
        }
        int i18 = 16;
        if ((i16 & 48) == 0) {
            i13 |= (i16 & 64) == 0 ? k10.V(a03) : k10.F(a03) ? 32 : 16;
        }
        int i19 = 128;
        long j13 = j10;
        if ((i16 & 384) == 0) {
            i13 |= k10.e(j13) ? 256 : 128;
        }
        int i20 = 1024;
        long j14 = j11;
        if ((i16 & 3072) == 0) {
            i13 |= k10.e(j14) ? 2048 : 1024;
        }
        long j15 = j12;
        if ((i16 & 24576) == 0) {
            i13 |= k10.e(j15) ? 16384 : 8192;
        }
        if ((196608 & i16) == 0) {
            i13 |= k10.F(pVar) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        } else {
            p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar;
        }
        Y y11 = y10;
        if ((i16 & 1572864) == 0) {
            i13 |= k10.V(y11) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        float f11 = f10;
        if ((i16 & 12582912) == 0) {
            i13 |= k10.c(f11) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i13 |= k10.V(mVar3) ? 67108864 : 33554432;
        }
        if ((805306368 & i16) == 0) {
            i13 |= k10.V(eVar2) ? 536870912 : 268435456;
        }
        if ((i17 & 6) == 0) {
            i14 = (k10.d(i15) ? 4 : 2) | i17;
        } else {
            i14 = i17;
        }
        if ((i17 & 48) == 0) {
            if (k10.b(z11)) {
                i18 = 32;
            }
            i14 |= i18;
        }
        if ((i17 & 384) == 0) {
            if (k10.F(pVar4)) {
                i19 = 256;
            }
            i14 |= i19;
        }
        if ((i17 & 3072) == 0) {
            if (k10.F(pVar5)) {
                i20 = 2048;
            }
            i14 |= i20;
        }
        if ((306783379 & i13) == 306783378 && (i14 & 1171) == 1170 && k10.l()) {
            k10.L();
        } else {
            if (C4895p.J()) {
                C4895p.S(-742442296, i13, i14, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            boolean z12 = ((i13 & 112) == 32 || ((i13 & 64) != 0 && k10.F(a03))) | ((1879048192 & i13) == 536870912) | ((234881024 & i13) == 67108864) | ((i14 & 14) == 4);
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new j(a03, eVar2, mVar3, i15);
                k10.u(D10);
            }
            I i21 = (I) D10;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, dVar);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, i21, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d b11 = androidx.compose.ui.layout.a.b(aVar2, "navigationIcon");
            float f12 = f10550h;
            androidx.compose.ui.d m10 = D.m(b11, f12, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            C5437c.a aVar3 = C5437c.f24302a;
            I h10 = C5077h.h(aVar3.o(), false);
            int a13 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, m10);
            C17631a<C4504g> a14 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a14);
            } else {
                k10.t();
            }
            C4889m a15 = F1.a(k10);
            F1.c(a15, h10, aVar.c());
            F1.c(a15, s11, aVar.e());
            p<C4504g, Integer, C16807N> b12 = aVar.b();
            if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.w(Integer.valueOf(a13), b12);
            }
            F1.c(a15, e11, aVar.d());
            C5079j jVar = C5079j.f18125a;
            J0<C5747v0> d10 = E.a().d(C5747v0.k(j10));
            int i22 = J0.f13770i;
            C4910x.a(d10, pVar4, k10, ((i14 >> 3) & 112) | i22);
            k10.x();
            androidx.compose.ui.d c10 = androidx.compose.ui.graphics.b.c(D.k(androidx.compose.ui.layout.a.b(aVar2, "title"), f12, 0.0f, 2, (Object) null).s(z11 ? L1.o.a(aVar2, i.f10591c) : aVar2), 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (i1) null, false, (d1) null, 0, 0, 0, 131067, (Object) null);
            I h11 = C5077h.h(aVar3.o(), false);
            int a16 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, c10);
            C17631a<C4504g> a17 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a17);
            } else {
                k10.t();
            }
            C4889m a18 = F1.a(k10);
            F1.c(a18, h11, aVar.c());
            F1.c(a18, s12, aVar.e());
            p<C4504g, Integer, C16807N> b13 = aVar.b();
            if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.w(Integer.valueOf(a16), b13);
            }
            F1.c(a18, e12, aVar.d());
            int i23 = i13 >> 9;
            s.a(j11, y10, pVar, k10, ((i13 >> 15) & 112) | (i23 & 14) | (i23 & 896));
            k10.x();
            androidx.compose.ui.d m11 = D.m(androidx.compose.ui.layout.a.b(aVar2, "actionIcons"), 0.0f, 0.0f, f12, 0.0f, 11, (Object) null);
            I h12 = C5077h.h(aVar3.o(), false);
            int a19 = C4883j.a(k10, 0);
            C4912y s13 = k10.s();
            androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, m11);
            C17631a<C4504g> a20 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a20);
            } else {
                k10.t();
            }
            C4889m a21 = F1.a(k10);
            F1.c(a21, h12, aVar.c());
            F1.c(a21, s13, aVar.e());
            p<C4504g, Integer, C16807N> b14 = aVar.b();
            if (a21.i() || !C17542s.e(a21.D(), Integer.valueOf(a19))) {
                a21.u(Integer.valueOf(a19));
                a21.w(Integer.valueOf(a19), b14);
            }
            F1.c(a21, e13, aVar.d());
            C4910x.a(E.a().d(C5747v0.k(j12)), pVar5, k10, ((i14 >> 6) & 112) | i22);
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            k kVar = r0;
            k kVar2 = new k(dVar, a02, j10, j11, j12, pVar, y10, f10, mVar, eVar, i10, z10, pVar2, pVar3, i11, i12);
            n10.a(kVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final O0.h1 j(float r8, float r9, float r10, U0.C4889m r11, int r12, int r13) {
        /*
            r0 = r13 & 1
            if (r0 == 0) goto L_0x0007
            r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0007:
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r9 = r1
        L_0x000d:
            r0 = 4
            r13 = r13 & r0
            if (r13 == 0) goto L_0x0012
            r10 = r1
        L_0x0012:
            boolean r13 = U0.C4895p.J()
            if (r13 == 0) goto L_0x0021
            r13 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)"
            r2 = 1801969826(0x6b67e0a2, float:2.8032266E26)
            U0.C4895p.S(r2, r12, r13, r1)
        L_0x0021:
            r13 = 0
            java.lang.Object[] r1 = new java.lang.Object[r13]
            O0.h1$c r2 = O0.h1.f10824d
            f1.k r2 = r2.a()
            r3 = r12 & 14
            r3 = r3 ^ 6
            r4 = 1
            if (r3 <= r0) goto L_0x0037
            boolean r3 = r11.c(r8)
            if (r3 != 0) goto L_0x003b
        L_0x0037:
            r3 = r12 & 6
            if (r3 != r0) goto L_0x003d
        L_0x003b:
            r0 = r4
            goto L_0x003e
        L_0x003d:
            r0 = r13
        L_0x003e:
            r3 = r12 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r5 = 32
            if (r3 <= r5) goto L_0x004c
            boolean r3 = r11.c(r9)
            if (r3 != 0) goto L_0x0050
        L_0x004c:
            r3 = r12 & 48
            if (r3 != r5) goto L_0x0052
        L_0x0050:
            r3 = r4
            goto L_0x0053
        L_0x0052:
            r3 = r13
        L_0x0053:
            r0 = r0 | r3
            r3 = r12 & 896(0x380, float:1.256E-42)
            r3 = r3 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r3 <= r5) goto L_0x0062
            boolean r3 = r11.c(r10)
            if (r3 != 0) goto L_0x0066
        L_0x0062:
            r12 = r12 & 384(0x180, float:5.38E-43)
            if (r12 != r5) goto L_0x0067
        L_0x0066:
            r13 = r4
        L_0x0067:
            r12 = r0 | r13
            java.lang.Object r13 = r11.D()
            if (r12 != 0) goto L_0x0077
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r13 != r12) goto L_0x007f
        L_0x0077:
            O0.e$l r13 = new O0.e$l
            r13.<init>(r8, r9, r10)
            r11.u(r13)
        L_0x007f:
            r4 = r13
            nI.a r4 = (nI.C17631a) r4
            r6 = 0
            r7 = 4
            r3 = 0
            r5 = r11
            java.lang.Object r8 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            O0.h1 r8 = (O0.h1) r8
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0095
            U0.C4895p.R()
        L_0x0095:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4724e.j(float, float, float, U0.m, int, int):O0.h1");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(O0.h1 r22, float r23, m0.C5570z<java.lang.Float> r24, m0.C5546i<java.lang.Float> r25, dI.C17164e<? super c2.y> r26) {
        /*
            r0 = r22
            r1 = r26
            boolean r2 = r1 instanceof O0.C4724e.m
            if (r2 == 0) goto L_0x0017
            r2 = r1
            O0.e$m r2 = (O0.C4724e.m) r2
            int r3 = r2.f10629g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f10629g = r3
            goto L_0x001c
        L_0x0017:
            O0.e$m r2 = new O0.e$m
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.f10628f
            java.lang.Object r11 = eI.C17187b.f()
            int r3 = r2.f10629g
            r10 = 2
            r4 = 1
            r12 = 0
            if (r3 == 0) goto L_0x0051
            if (r3 == r4) goto L_0x003e
            if (r3 != r10) goto L_0x0036
            java.lang.Object r0 = r2.f10625c
            kotlin.jvm.internal.L r0 = (kotlin.jvm.internal.L) r0
            XH.y.b(r1)
            goto L_0x010e
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.Object r0 = r2.f10627e
            kotlin.jvm.internal.L r0 = (kotlin.jvm.internal.L) r0
            java.lang.Object r3 = r2.f10626d
            m0.i r3 = (m0.C5546i) r3
            java.lang.Object r4 = r2.f10625c
            O0.h1 r4 = (O0.h1) r4
            XH.y.b(r1)
            r1 = r0
            r13 = r3
            r0 = r4
            goto L_0x00b2
        L_0x0051:
            XH.y.b(r1)
            float r1 = r22.b()
            r3 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x011a
            float r1 = r22.b()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x006b
            goto L_0x011a
        L_0x006b:
            kotlin.jvm.internal.L r1 = new kotlin.jvm.internal.L
            r1.<init>()
            r5 = r23
            r1.f144345a = r5
            if (r24 == 0) goto L_0x00b4
            float r6 = java.lang.Math.abs(r23)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b4
            kotlin.jvm.internal.L r3 = new kotlin.jvm.internal.L
            r3.<init>()
            r20 = 28
            r21 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r14 = r23
            m0.k r5 = m0.C5552l.c(r13, r14, r15, r17, r19, r20, r21)
            O0.e$n r6 = new O0.e$n
            r6.<init>(r3, r0, r1)
            r2.f10625c = r0
            r13 = r25
            r2.f10626d = r13
            r2.f10627e = r1
            r2.f10629g = r4
            r7 = 0
            r8 = 2
            r9 = 0
            r3 = r5
            r4 = r24
            r5 = r7
            r7 = r2
            java.lang.Object r3 = m0.t0.h(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r11) goto L_0x00b2
            return r11
        L_0x00b2:
            r5 = r13
            goto L_0x00b7
        L_0x00b4:
            r13 = r25
            goto L_0x00b2
        L_0x00b7:
            if (r5 == 0) goto L_0x010f
            float r3 = r0.d()
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x010f
            float r3 = r0.d()
            float r4 = r0.e()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x010f
            float r13 = r0.d()
            r20 = 30
            r21 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            m0.k r3 = m0.C5552l.c(r13, r14, r15, r17, r19, r20, r21)
            float r4 = r0.b()
            r6 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ec
            r4 = r12
            goto L_0x00f0
        L_0x00ec:
            float r4 = r0.e()
        L_0x00f0:
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.d(r4)
            O0.e$o r7 = new O0.e$o
            r7.<init>(r0)
            r2.f10625c = r1
            r0 = 0
            r2.f10626d = r0
            r2.f10627e = r0
            r2.f10629g = r10
            r6 = 0
            r9 = 4
            r10 = 0
            r8 = r2
            java.lang.Object r0 = m0.t0.j(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto L_0x010d
            return r11
        L_0x010d:
            r0 = r1
        L_0x010e:
            r1 = r0
        L_0x010f:
            float r0 = r1.f144345a
            long r0 = c2.z.a(r12, r0)
            c2.y r0 = c2.y.b(r0)
            return r0
        L_0x011a:
            c2.y$a r0 = c2.y.f23066b
            long r0 = r0.a()
            c2.y r0 = c2.y.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4724e.k(O0.h1, float, m0.z, m0.i, dI.e):java.lang.Object");
    }
}
