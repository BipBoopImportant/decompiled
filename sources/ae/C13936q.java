package aE;

import A0.g;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import KJ.C15987c;
import L1.x;
import QJ.F0;
import QJ.Q;
import QJ.T;
import T0.c;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import c2.i;
import cE.C14034b;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gs.e;
import gs.h;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import m0.C5525D;
import m0.C5530a;
import m0.C5546i;
import m0.C5548j;
import m0.C5554m;
import m0.y0;
import m1.e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import p1.i1;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import s0.C5842M;
import s0.C5843N;
import s0.C5857c;
import s0.C5862h;
import tK.C18030v;
import x0.C6230C;
import x0.v;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\f\u001a7\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b!\u0010\"¨\u0006&²\u0006\f\u0010#\u001a\u00020\u001b8\nX\u0002²\u0006\u000e\u0010%\u001a\u00020$8\n@\nX\u0002"}, d2 = {"LKJ/c;", "LcE/b;", "whatsNewMessages", "Lkotlin/Function0;", "LXH/N;", "dismissWhatsNew", "G", "(LKJ/c;LnI/a;LU0/m;I)V", "message", "LY1/j;", "textAlignment", "A", "(LcE/b;ILU0/m;I)V", "y", "", "singleMessage", "Lx0/C;", "pagerState", "onCtaClicked", "Landroidx/compose/ui/d;", "modifier", "o", "(ZLx0/C;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "C", "(LcE/b;ILandroidx/compose/ui/d;LU0/m;II)V", "q", "(LcE/b;Landroidx/compose/ui/d;LU0/m;II)V", "", "pageCount", "currentPage", "E", "(IILandroidx/compose/ui/d;LU0/m;II)V", "LT0/b;", "P", "(LU0/m;I)I", "currentPageIndex", "LaE/a;", "mediaState", "whatsnew-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: aE.q  reason: case insensitive filesystem */
public final class C13936q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.whatsnew.impl.presentation.compose.WhatsNewScreenKt$MediaFrame$1$1", f = "WhatsNewScreen.kt", l = {304, 306}, m = "invokeSuspend")
    /* renamed from: aE.q$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f118779c;

        /* renamed from: d  reason: collision with root package name */
        int f118780d;

        /* renamed from: e  reason: collision with root package name */
        int f118781e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5530a<Float, C5554m> f118782f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4899r0<C13920a> f118783g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: aE.q$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2959a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f118784a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    aE.a[] r0 = aE.C13920a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    aE.a r1 = aE.C13920a.Preparing     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    aE.a r1 = aE.C13920a.Error     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    aE.a r1 = aE.C13920a.Ready     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f118784a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: aE.C13936q.a.C2959a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5530a<Float, C5554m> aVar, C4899r0<C13920a> r0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f118782f = aVar;
            this.f118783g = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f118782f, this.f118783g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118781e;
            if (i10 == 0) {
                y.b(obj);
                C13920a M10 = C13936q.r(this.f118783g);
                int i11 = C2959a.f118784a[M10.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    C5530a<Float, C5554m> aVar = this.f118782f;
                    Float d10 = kotlin.coroutines.jvm.internal.b.d(0.0f);
                    this.f118779c = M10;
                    this.f118780d = i11;
                    this.f118781e = 1;
                    if (aVar.t(d10, this) == f10) {
                        return f10;
                    }
                } else if (i11 == 3) {
                    C5530a<Float, C5554m> aVar2 = this.f118782f;
                    Float d11 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                    y0 j10 = C5548j.j(300, 0, (C5525D) null, 6, (Object) null);
                    this.f118779c = M10;
                    this.f118780d = i11;
                    this.f118781e = 2;
                    if (C5530a.f(aVar2, d11, j10, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
                        return f10;
                    }
                    return C16807N.f139792a;
                } else {
                    throw new t();
                }
            } else if (i10 == 1) {
                C13920a aVar3 = (C13920a) this.f118779c;
                y.b(obj);
            } else if (i10 == 2) {
                C13920a aVar4 = (C13920a) this.f118779c;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16807N n10 = C16807N.f139792a;
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aE.q$b */
    static final class b implements r<v, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C14034b> f118785a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f118786b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f118787c;

        b(C15987c<C14034b> cVar, boolean z10, int i10) {
            this.f118785a = cVar;
            this.f118786b = z10;
            this.f118787c = i10;
        }

        public final void a(v vVar, int i10, C4889m mVar, int i11) {
            C17542s.j(vVar, "$this$HorizontalPager");
            if (C4895p.J()) {
                C4895p.S(1355994486, i11, -1, "com.ingka.ikea.whatsnew.impl.presentation.compose.WhatsNewScreen.<anonymous>.<anonymous> (WhatsNewScreen.kt:112)");
            }
            C14034b bVar = this.f118785a.get(i10);
            boolean z10 = this.f118786b;
            int i12 = this.f118787c;
            C14034b bVar2 = bVar;
            if (z10) {
                mVar.W(-1765574977);
                C13936q.A(bVar2, i12, mVar, 0);
                mVar.P();
            } else {
                mVar.W(-1765387458);
                C13936q.y(bVar2, i12, mVar, 0);
                mVar.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.whatsnew.impl.presentation.compose.WhatsNewScreenKt$WhatsNewScreen$1$onCtaClicked$1$1$1", f = "WhatsNewScreen.kt", l = {133}, m = "invokeSuspend")
    /* renamed from: aE.q$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118788c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f118789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6230C c10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f118789d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f118789d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118788c;
            if (i10 == 0) {
                y.b(obj);
                C6230C c10 = this.f118789d;
                this.f118788c = 1;
                if (C6230C.n(c10, c10.v() + 1, 0.0f, (C5546i) null, this, 6, (Object) null) == f10) {
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

    /* access modifiers changed from: private */
    public static final void A(C14034b bVar, int i10, C4889m mVar, int i11) {
        int i12;
        C14034b bVar2 = bVar;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-2087460681);
        if ((i14 & 6) == 0) {
            i12 = (k10.V(bVar2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.d(i13) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2087460681, i12, -1, "com.ingka.ikea.whatsnew.impl.presentation.compose.MessageContentPortrait (WhatsNewScreen.kt:159)");
            }
            C5437c.b g10 = C5437c.f24302a.g();
            d.a aVar = d.f18749a;
            d h10 = J.h(C5116k1.a(aVar, C13937r.f118790a.a(bVar.d())), 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), g10, k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, h10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(-981999076);
            if (!(bVar.b() == null && bVar.f() == null)) {
                q(bVar2, D.j(C5074e.b(e.b(aVar), 1.0f, false, 2, (Object) null), h.B((float) 8), h.B((float) 16)), k10, i12 & 14, 0);
            }
            k10.P();
            C(bVar, i10, (d) null, k10, i12 & 126, 4);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13930k(bVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C14034b bVar, int i10, int i11, C4889m mVar, int i12) {
        A(bVar, i10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: androidx.compose.foundation.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void C(cE.C14034b r59, int r60, androidx.compose.ui.d r61, U0.C4889m r62, int r63, int r64) {
        /*
            r4 = r63
            r0 = 2
            r1 = -442073124(0xffffffffe5a67fdc, float:-9.828393E22)
            r2 = r62
            U0.m r2 = r2.k(r1)
            r3 = 1
            r5 = r64 & 1
            r6 = 4
            if (r5 == 0) goto L_0x0017
            r5 = r4 | 6
            r15 = r59
            goto L_0x0029
        L_0x0017:
            r5 = r4 & 6
            r15 = r59
            if (r5 != 0) goto L_0x0028
            boolean r5 = r2.V(r15)
            if (r5 == 0) goto L_0x0025
            r5 = r6
            goto L_0x0026
        L_0x0025:
            r5 = r0
        L_0x0026:
            r5 = r5 | r4
            goto L_0x0029
        L_0x0028:
            r5 = r4
        L_0x0029:
            r0 = r64 & 2
            r7 = 32
            if (r0 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r0 = r60
            goto L_0x0045
        L_0x0034:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0031
            r0 = r60
            boolean r8 = r2.d(r0)
            if (r8 == 0) goto L_0x0042
            r8 = r7
            goto L_0x0044
        L_0x0042:
            r8 = 16
        L_0x0044:
            r5 = r5 | r8
        L_0x0045:
            r8 = r64 & 4
            if (r8 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r9 = r61
        L_0x004d:
            r10 = r5
            goto L_0x0062
        L_0x004f:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004b
            r9 = r61
            boolean r10 = r2.V(r9)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r10
            goto L_0x004d
        L_0x0062:
            r5 = r10 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r5 != r11) goto L_0x0075
            boolean r5 = r2.l()
            if (r5 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r2.L()
            r3 = r9
            goto L_0x020f
        L_0x0075:
            if (r8 == 0) goto L_0x007c
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r57 = r5
            goto L_0x007e
        L_0x007c:
            r57 = r9
        L_0x007e:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x008a
            r5 = -1
            java.lang.String r8 = "com.ingka.ikea.whatsnew.impl.presentation.compose.MessageTexts (WhatsNewScreen.kt:262)"
            U0.C4895p.S(r1, r10, r5, r8)
        L_0x008a:
            r1 = -1337689663(0xffffffffb04479c1, float:-7.147741E-10)
            r2.W(r1)
            r1 = r10 & 14
            r5 = 0
            if (r1 != r6) goto L_0x0097
            r1 = r3
            goto L_0x0098
        L_0x0097:
            r1 = r5
        L_0x0098:
            java.lang.Object r6 = r2.D()
            if (r1 != 0) goto L_0x00a6
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r6 != r1) goto L_0x00ae
        L_0x00a6:
            androidx.compose.foundation.o r6 = new androidx.compose.foundation.o
            r6.<init>(r5)
            r2.u(r6)
        L_0x00ae:
            r17 = r6
            androidx.compose.foundation.o r17 = (androidx.compose.foundation.o) r17
            r2.P()
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r57
            androidx.compose.ui.d r1 = androidx.compose.foundation.m.f(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r8 = r8.k()
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r8, r2, r5)
            int r5 = U0.C4883j.a(r2, r5)
            U0.y r8 = r2.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r2, r1)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r11 = r9.a()
            U0.f r12 = r2.m()
            if (r12 != 0) goto L_0x00f0
            U0.C4883j.c()
        L_0x00f0:
            r2.I()
            boolean r12 = r2.i()
            if (r12 == 0) goto L_0x00fd
            r2.p(r11)
            goto L_0x0100
        L_0x00fd:
            r2.t()
        L_0x0100:
            U0.m r11 = U0.F1.a(r2)
            nI.p r12 = r9.c()
            U0.F1.c(r11, r6, r12)
            nI.p r6 = r9.e()
            U0.F1.c(r11, r8, r6)
            nI.p r6 = r9.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x012a
            java.lang.Object r8 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x0138
        L_0x012a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r11.u(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.w(r5, r6)
        L_0x0138:
            nI.p r5 = r9.d()
            U0.F1.c(r11, r1, r5)
            s0.h r1 = s0.C5862h.f28810a
            java.lang.String r1 = r59.e()
            IC.e r5 = IC.C13026h.c(r1)
            TC.b$b$a r6 = TC.C13679b.C2857b.a.f116683a
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            java.lang.String r8 = "title"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r1, r8)
            r14 = 0
            r13 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r8, r14, r3, r13)
            float r12 = (float) r7
            float r18 = c2.h.B(r12)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            Y1.j r18 = Y1.j.h(r60)
            int r11 = IC.C13023e.f110931a
            r8 = r11 | 432(0x1b0, float:6.05E-43)
            r28 = r8
            int r8 = r10 >> 3
            r29 = r8 & 14
            r55 = r29
            r30 = 261112(0x3fbf8, float:3.65896E-40)
            r8 = 0
            r16 = 0
            r58 = r11
            r10 = r16
            r16 = 0
            r33 = r12
            r12 = r16
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = r2
            SC.C13607l.i(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r5 = r59.a()
            IC.e r31 = IC.C13026h.c(r5)
            TC.b$a$b r32 = TC.C13679b.a.C2856b.f116680a
            java.lang.String r5 = "body"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r1, r5)
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r1, r5, r3, r6)
            r1 = 24
            float r1 = (float) r1
            float r9 = c2.h.B(r1)
            float r11 = c2.h.B(r33)
            r12 = 5
            r13 = 0
            r8 = 0
            r10 = 0
            androidx.compose.ui.d r33 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
            Y1.j r44 = Y1.j.h(r60)
            r1 = r58
            r1 = r1 | 432(0x1b0, float:6.05E-43)
            r54 = r1
            r56 = 261112(0x3fbf8, float:3.65896E-40)
            r34 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r46 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = r2
            SC.C13607l.i(r31, r32, r33, r34, r36, r38, r39, r40, r41, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r2.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x020d
            U0.C4895p.R()
        L_0x020d:
            r3 = r57
        L_0x020f:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x0226
            aE.n r7 = new aE.n
            r0 = r7
            r1 = r59
            r2 = r60
            r4 = r63
            r5 = r64
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aE.C13936q.C(cE.b, int, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C14034b bVar, int i10, d dVar, int i11, int i12, C4889m mVar, int i13) {
        C(bVar, i10, dVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    private static final void E(int i10, int i11, d dVar, C4889m mVar, int i12, int i13) {
        int i14;
        long K10;
        C4889m k10 = mVar.k(-1045943770);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (k10.d(i10) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((2 & i13) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= k10.d(i11) ? 32 : 16;
        }
        int i15 = i13 & 4;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            i14 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i14 & 147) != 146 || !k10.l()) {
            if (i15 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1045943770, i14, -1, "com.ingka.ikea.whatsnew.impl.presentation.compose.PageIndicator (WhatsNewScreen.kt:378)");
            }
            d E10 = J.E(dVar, (C5437c) null, false, 3, (Object) null);
            I b10 = G.b(C5073d.f18068a.n(C13921b.f118737a.b()), C5437c.f24302a.l(), k10, 6);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, E10);
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
            F1.c(a12, b10, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b11 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar.d());
            C5843N n10 = C5843N.f28726a;
            k10.W(515237088);
            for (int i16 = 0; i16 < i10; i16++) {
                if (i11 == i16) {
                    k10.W(611927160);
                    K10 = C18030v.f147664a.a(k10, C18030v.f147665b).G0();
                    k10.P();
                } else {
                    k10.W(611994864);
                    K10 = C18030v.f147664a.a(k10, C18030v.f147665b).K();
                    k10.P();
                }
                C5077h.a(J.t(androidx.compose.foundation.b.d(e.a(d.f18749a, g.h()), K10, (i1) null, 2, (Object) null), C13921b.f118737a.a()), k10, 0);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C13926g(i10, i11, dVar2, i12, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N F(int i10, int i11, d dVar, int i12, int i13, C4889m mVar, int i14) {
        E(i10, i11, dVar, mVar, M0.a(i12 | 1), i13);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void G(KJ.C15987c<cE.C14034b> r31, nI.C17631a<XH.C16807N> r32, U0.C4889m r33, int r34) {
        /*
            r0 = r31
            r1 = r32
            r2 = r34
            java.lang.String r3 = "whatsNewMessages"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "dismissWhatsNew"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = -2033927794(0xffffffff86c4b98e, float:-7.3999654E-35)
            r4 = r33
            U0.m r10 = r4.k(r3)
            r4 = r2 & 6
            r5 = 4
            if (r4 != 0) goto L_0x0029
            boolean r4 = r10.V(r0)
            if (r4 == 0) goto L_0x0026
            r4 = r5
            goto L_0x0027
        L_0x0026:
            r4 = 2
        L_0x0027:
            r4 = r4 | r2
            goto L_0x002a
        L_0x0029:
            r4 = r2
        L_0x002a:
            r6 = r2 & 48
            if (r6 != 0) goto L_0x003a
            boolean r6 = r10.F(r1)
            if (r6 == 0) goto L_0x0037
            r6 = 32
            goto L_0x0039
        L_0x0037:
            r6 = 16
        L_0x0039:
            r4 = r4 | r6
        L_0x003a:
            r13 = r4
            r4 = r13 & 19
            r6 = 18
            if (r4 != r6) goto L_0x004e
            boolean r4 = r10.l()
            if (r4 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            r10.L()
            r11 = r10
            goto L_0x0258
        L_0x004e:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x005a
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.whatsnew.impl.presentation.compose.WhatsNewScreen (WhatsNewScreen.kt:85)"
            U0.C4895p.S(r3, r13, r4, r6)
        L_0x005a:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r4 = TC.e.i(r3)
            r12 = 0
            r11 = 1
            r14 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r4, r12, r11, r14)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c$b r7 = r16.k()
            r9 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r10, r9)
            int r7 = U0.C4883j.a(r10, r9)
            U0.y r8 = r10.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r10, r4)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r12 = r17.a()
            U0.f r18 = r10.m()
            if (r18 != 0) goto L_0x0093
            U0.C4883j.c()
        L_0x0093:
            r10.I()
            boolean r18 = r10.i()
            if (r18 == 0) goto L_0x00a0
            r10.p(r12)
            goto L_0x00a3
        L_0x00a0:
            r10.t()
        L_0x00a3:
            U0.m r12 = U0.F1.a(r10)
            nI.p r14 = r17.c()
            U0.F1.c(r12, r6, r14)
            nI.p r6 = r17.e()
            U0.F1.c(r12, r8, r6)
            nI.p r6 = r17.b()
            boolean r8 = r12.i()
            if (r8 != 0) goto L_0x00cd
            java.lang.Object r8 = r12.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r14)
            if (r8 != 0) goto L_0x00db
        L_0x00cd:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.w(r7, r6)
        L_0x00db:
            nI.p r6 = r17.d()
            U0.F1.c(r12, r4, r6)
            s0.h r12 = s0.C5862h.f28810a
            r4 = -2099880177(0xffffffff82d65f0f, float:-3.1499035E-37)
            r10.W(r4)
            java.lang.Object r4 = r10.D()
            U0.m$a r22 = U0.C4889m.f14007a
            java.lang.Object r6 = r22.a()
            if (r4 != r6) goto L_0x00fd
            U0.o0 r4 = U0.C4877g1.a(r9)
            r10.u(r4)
        L_0x00fd:
            U0.o0 r4 = (U0.C4894o0) r4
            r10.P()
            int r4 = H(r4)
            r6 = -2099876642(0xffffffff82d66cde, float:-3.150696E-37)
            r10.W(r6)
            r6 = r13 & 14
            if (r6 != r5) goto L_0x0112
            r5 = r11
            goto L_0x0113
        L_0x0112:
            r5 = r9
        L_0x0113:
            java.lang.Object r6 = r10.D()
            if (r5 != 0) goto L_0x011f
            java.lang.Object r5 = r22.a()
            if (r6 != r5) goto L_0x0127
        L_0x011f:
            aE.c r6 = new aE.c
            r6.<init>(r0)
            r10.u(r6)
        L_0x0127:
            nI.a r6 = (nI.C17631a) r6
            r10.P()
            r8 = 0
            r14 = 2
            r5 = 0
            r7 = r10
            r15 = r9
            r9 = r14
            x0.C r5 = x0.C6231D.k(r4, r5, r6, r7, r8, r9)
            int r4 = P(r10, r15)
            boolean r4 = Xo.g.c(r4)
            if (r4 == 0) goto L_0x0147
            Y1.j$a r6 = Y1.j.f14783b
            int r6 = r6.a()
            goto L_0x014d
        L_0x0147:
            Y1.j$a r6 = Y1.j.f14783b
            int r6 = r6.f()
        L_0x014d:
            r7 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r23 = r12.a(r3, r7, r15)
            r7 = 8
            float r7 = (float) r7
            float r27 = c2.h.B(r7)
            r28 = 7
            r29 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            androidx.compose.ui.d r23 = androidx.compose.foundation.layout.D.m(r23, r24, r25, r26, r27, r28, r29)
            i1.c$c r24 = r16.a()
            r7 = -2099857056(0xffffffff82d6b960, float:-3.1550874E-37)
            r10.W(r7)
            java.lang.Object r7 = r10.D()
            java.lang.Object r8 = r22.a()
            if (r7 != r8) goto L_0x0184
            aE.h r7 = new aE.h
            r7.<init>()
            r10.u(r7)
        L_0x0184:
            r14 = r7
            nI.l r14 = (nI.C17642l) r14
            r12 = 0
            r10.P()
            aE.q$b r7 = new aE.q$b
            r7.<init>(r0, r4, r6)
            r6 = 54
            r8 = 1355994486(0x50d2d576, float:2.82976379E10)
            c1.a r17 = c1.c.e(r8, r11, r7, r10, r6)
            r20 = 3078(0xc06, float:4.313E-42)
            r21 = 6828(0x1aac, float:9.568E-42)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r11 = r16
            r16 = 1
            r12 = r16
            r16 = 0
            r25 = r13
            r13 = r16
            r16 = 0
            r15 = r16
            r19 = 102260736(0x6186000, float:2.8658552E-35)
            r26 = r4
            r4 = r5
            r30 = r5
            r5 = r23
            r33 = r10
            r10 = r24
            r18 = r33
            x0.m.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r33.D()
            java.lang.Object r5 = r22.a()
            if (r4 != r5) goto L_0x01e2
            dI.j r4 = dI.C17169j.f142968a
            r11 = r33
            QJ.Q r4 = U0.P.k(r4, r11)
            U0.B r5 = new U0.B
            r5.<init>(r4)
            r11.u(r5)
            r4 = r5
            goto L_0x01e4
        L_0x01e2:
            r11 = r33
        L_0x01e4:
            U0.B r4 = (U0.B) r4
            QJ.Q r4 = r4.a()
            r5 = -2099836940(0xffffffff82d707f4, float:-3.1595976E-37)
            r11.W(r5)
            r5 = r30
            boolean r6 = r11.V(r5)
            r7 = r25 & 112(0x70, float:1.57E-43)
            r8 = 32
            if (r7 != r8) goto L_0x01fe
            r7 = 1
            goto L_0x01ff
        L_0x01fe:
            r7 = 0
        L_0x01ff:
            r6 = r6 | r7
            boolean r7 = r11.F(r4)
            r6 = r6 | r7
            java.lang.Object r7 = r11.D()
            if (r6 != 0) goto L_0x0211
            java.lang.Object r6 = r22.a()
            if (r7 != r6) goto L_0x0219
        L_0x0211:
            aE.i r7 = new aE.i
            r7.<init>(r5, r1, r4)
            r11.u(r7)
        L_0x0219:
            r6 = r7
            nI.a r6 = (nI.C17631a) r6
            r11.P()
            int r4 = r31.size()
            r7 = 1
            if (r4 != r7) goto L_0x0228
            r4 = r7
            goto L_0x0229
        L_0x0228:
            r4 = 0
        L_0x0229:
            r8 = 3
            if (r26 == 0) goto L_0x0239
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.C(r3, r9, r10, r8, r9)
            r8 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r8, r7, r9)
        L_0x0237:
            r7 = r3
            goto L_0x0246
        L_0x0239:
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.C(r3, r9, r10, r8, r9)
            r7 = 1056964608(0x3f000000, float:0.5)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.g(r3, r7)
            goto L_0x0237
        L_0x0246:
            r9 = 0
            r10 = 0
            r8 = r11
            o(r4, r5, r6, r7, r8, r9, r10)
            r11.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0258
            U0.C4895p.R()
        L_0x0258:
            U0.Y0 r3 = r11.n()
            if (r3 == 0) goto L_0x0266
            aE.j r4 = new aE.j
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aE.C13936q.G(KJ.c, nI.a, U0.m, int):void");
    }

    private static final int H(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final int I(C15987c cVar) {
        return cVar.size();
    }

    /* access modifiers changed from: private */
    public static final Object J(int i10) {
        return Integer.valueOf(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C6230C c10, C17631a aVar, Q q10) {
        if (c10.v() == c10.G() - 1) {
            aVar.invoke();
        } else {
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new c(c10, (C17164e<? super c>) null), 3, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C15987c cVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        G(cVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final int P(C4889m mVar, int i10) {
        mVar.W(-874129211);
        if (C4895p.J()) {
            C4895p.S(-874129211, i10, -1, "com.ingka.ikea.whatsnew.impl.presentation.compose.getWindowHeightSizeClass (WhatsNewScreen.kt:401)");
        }
        Configuration configuration = (Configuration) mVar.Q(AndroidCompositionLocals_androidKt.f());
        long b10 = i.b(h.B((float) configuration.screenWidthDp), h.B((float) configuration.screenHeightDp));
        mVar.W(695926950);
        boolean e10 = mVar.e(b10);
        Object D10 = mVar.D();
        if (e10 || D10 == C4889m.f14007a.a()) {
            D10 = T0.b.v(c.a.b(T0.c.f13501c, b10, (Set) null, (Set) null, 6, (Object) null).a());
            mVar.u(D10);
        }
        int I10 = ((T0.b) D10).I();
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return I10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void o(boolean r23, x0.C6230C r24, nI.C17631a<XH.C16807N> r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r1 = r23
            r5 = r28
            r0 = 2
            r2 = 4
            r3 = -969596428(0xffffffffc63521f4, float:-11592.488)
            r4 = r27
            U0.m r4 = r4.k(r3)
            r12 = 1
            r6 = r29 & 1
            if (r6 == 0) goto L_0x0017
            r6 = r5 | 6
            goto L_0x0027
        L_0x0017:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0026
            boolean r6 = r4.b(r1)
            if (r6 == 0) goto L_0x0023
            r6 = r2
            goto L_0x0024
        L_0x0023:
            r6 = r0
        L_0x0024:
            r6 = r6 | r5
            goto L_0x0027
        L_0x0026:
            r6 = r5
        L_0x0027:
            r0 = r29 & 2
            r7 = 32
            if (r0 == 0) goto L_0x0032
            r6 = r6 | 48
        L_0x002f:
            r0 = r24
            goto L_0x0043
        L_0x0032:
            r0 = r5 & 48
            if (r0 != 0) goto L_0x002f
            r0 = r24
            boolean r8 = r4.V(r0)
            if (r8 == 0) goto L_0x0040
            r8 = r7
            goto L_0x0042
        L_0x0040:
            r8 = 16
        L_0x0042:
            r6 = r6 | r8
        L_0x0043:
            r2 = r29 & 4
            if (r2 == 0) goto L_0x004c
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r2 = r25
            goto L_0x005e
        L_0x004c:
            r2 = r5 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0049
            r2 = r25
            boolean r8 = r4.F(r2)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r6 = r6 | r8
        L_0x005e:
            r8 = r29 & 8
            if (r8 == 0) goto L_0x0068
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r9 = r26
        L_0x0066:
            r13 = r6
            goto L_0x007b
        L_0x0068:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0064
            r9 = r26
            boolean r10 = r4.V(r9)
            if (r10 == 0) goto L_0x0077
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r6 = r6 | r10
            goto L_0x0066
        L_0x007b:
            r6 = r13 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r6 != r10) goto L_0x008d
            boolean r6 = r4.l()
            if (r6 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r4.L()
            goto L_0x01d4
        L_0x008d:
            if (r8 == 0) goto L_0x0093
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r15 = r6
            goto L_0x0094
        L_0x0093:
            r15 = r9
        L_0x0094:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00a0
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.whatsnew.impl.presentation.compose.CtaField (WhatsNewScreen.kt:219)"
            U0.C4895p.S(r3, r13, r6, r8)
        L_0x00a0:
            if (r1 == 0) goto L_0x00be
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            float r3 = (float) r7
            float r20 = c2.h.B(r3)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r6 = 0
            r8 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r6, r12, r8)
            goto L_0x00d3
        L_0x00be:
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            float r3 = (float) r7
            float r20 = c2.h.B(r3)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
        L_0x00d3:
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r6 = r6.d()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$c r8 = r8.i()
            r9 = 54
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r8, r4, r9)
            r8 = 0
            int r8 = U0.C4883j.a(r4, r8)
            U0.y r9 = r4.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r4, r15)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r14 = r11.a()
            U0.f r16 = r4.m()
            if (r16 != 0) goto L_0x0101
            U0.C4883j.c()
        L_0x0101:
            r4.I()
            boolean r16 = r4.i()
            if (r16 == 0) goto L_0x010e
            r4.p(r14)
            goto L_0x0111
        L_0x010e:
            r4.t()
        L_0x0111:
            U0.m r14 = U0.F1.a(r4)
            nI.p r12 = r11.c()
            U0.F1.c(r14, r6, r12)
            nI.p r6 = r11.e()
            U0.F1.c(r14, r9, r6)
            nI.p r6 = r11.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x013b
            java.lang.Object r9 = r14.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x0149
        L_0x013b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r14.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14.w(r8, r6)
        L_0x0149:
            nI.p r6 = r11.d()
            U0.F1.c(r14, r10, r6)
            s0.N r6 = s0.C5843N.f28726a
            r6 = -640741049(0xffffffffd9cf1147, float:-7.2855396E15)
            r4.W(r6)
            if (r1 != 0) goto L_0x0186
            int r6 = r24.G()
            int r8 = r24.v()
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            java.lang.String r10 = "page_indicator"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r9, r10)
            float r7 = (float) r7
            float r20 = c2.h.B(r7)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r10 = 384(0x180, float:5.38E-43)
            r11 = 0
            r7 = r8
            r8 = r9
            r9 = r4
            E(r6, r7, r8, r9, r10, r11)
        L_0x0186:
            r4.P()
            int r6 = r24.v()
            int r7 = r24.G()
            r8 = 1
            int r7 = r7 - r8
            if (r6 == r7) goto L_0x0198
            int r6 = Oo.b.f84785s9
            goto L_0x019a
        L_0x0198:
            int r6 = Oo.b.f84774r9
        L_0x019a:
            IC.e r6 = IC.C13026h.a(r6)
            int r7 = IC.C13023e.f110931a
            java.lang.String r6 = r6.a(r4, r7)
            SC.M r10 = SC.M.Medium
            java.lang.String r7 = "cta"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r3, r7)
            int r3 = r13 << 21
            r8 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r8
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r18 = 492(0x1ec, float:6.9E-43)
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r19 = r15
            r15 = r25
            r16 = r4
            r17 = r3
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01d2
            U0.C4895p.R()
        L_0x01d2:
            r9 = r19
        L_0x01d4:
            U0.Y0 r7 = r4.n()
            if (r7 == 0) goto L_0x01ee
            aE.m r8 = new aE.m
            r0 = r8
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r9
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aE.C13936q.o(boolean, x0.C, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(boolean z10, C6230C c10, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        o(z10, c10, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void q(cE.C14034b r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r0 = r25
            r1 = r28
            r2 = r29
            r3 = -1587413582(0xffffffffa161fdb2, float:-7.656873E-19)
            r4 = r27
            U0.m r15 = r4.k(r3)
            r4 = r2 & 1
            r5 = 2
            r6 = 4
            if (r4 == 0) goto L_0x0018
            r4 = r1 | 6
            goto L_0x0028
        L_0x0018:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0027
            boolean r4 = r15.V(r0)
            if (r4 == 0) goto L_0x0024
            r4 = r6
            goto L_0x0025
        L_0x0024:
            r4 = r5
        L_0x0025:
            r4 = r4 | r1
            goto L_0x0028
        L_0x0027:
            r4 = r1
        L_0x0028:
            r7 = r2 & 2
            if (r7 == 0) goto L_0x0031
            r4 = r4 | 48
        L_0x002e:
            r8 = r26
            goto L_0x0043
        L_0x0031:
            r8 = r1 & 48
            if (r8 != 0) goto L_0x002e
            r8 = r26
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x0040
            r9 = 32
            goto L_0x0042
        L_0x0040:
            r9 = 16
        L_0x0042:
            r4 = r4 | r9
        L_0x0043:
            r9 = r4 & 19
            r10 = 18
            if (r9 != r10) goto L_0x0056
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r15.L()
            r12 = r15
            goto L_0x02ca
        L_0x0056:
            if (r7 == 0) goto L_0x005c
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r14 = r7
            goto L_0x005d
        L_0x005c:
            r14 = r8
        L_0x005d:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0069
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.whatsnew.impl.presentation.compose.MediaFrame (WhatsNewScreen.kt:293)"
            U0.C4895p.S(r3, r4, r7, r8)
        L_0x0069:
            r3 = -306623986(0xffffffffedb94a0e, float:-7.1680317E27)
            r15.W(r3)
            r3 = r4 & 14
            r4 = 0
            if (r3 != r6) goto L_0x0076
            r8 = 1
            goto L_0x0077
        L_0x0076:
            r8 = r4
        L_0x0077:
            java.lang.Object r9 = r15.D()
            r10 = 0
            if (r8 != 0) goto L_0x0086
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x008e
        L_0x0086:
            r8 = 0
            m0.a r9 = m0.C5532b.b(r8, r8, r5, r10)
            r15.u(r9)
        L_0x008e:
            m0.a r9 = (m0.C5530a) r9
            r15.P()
            r8 = -306621611(0xffffffffedb95355, float:-7.1694336E27)
            r15.W(r8)
            if (r3 != r6) goto L_0x009d
            r8 = 1
            goto L_0x009e
        L_0x009d:
            r8 = r4
        L_0x009e:
            java.lang.Object r11 = r15.D()
            if (r8 != 0) goto L_0x00ac
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x00b5
        L_0x00ac:
            aE.a r8 = aE.C13920a.Preparing
            U0.r0 r11 = U0.u1.e(r8, r10, r5, r10)
            r15.u(r11)
        L_0x00b5:
            U0.r0 r11 = (U0.C4899r0) r11
            r15.P()
            java.lang.String r5 = r25.b()
            java.lang.String r8 = r25.f()
            aE.a r12 = r(r11)
            r13 = -306616439(0xffffffffedb96789, float:-7.1724866E27)
            r15.W(r13)
            boolean r13 = r15.V(r11)
            boolean r16 = r15.F(r9)
            r13 = r13 | r16
            java.lang.Object r7 = r15.D()
            if (r13 != 0) goto L_0x00e4
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r7 != r13) goto L_0x00ec
        L_0x00e4:
            aE.q$a r7 = new aE.q$a
            r7.<init>(r9, r11, r10)
            r15.u(r7)
        L_0x00ec:
            nI.p r7 = (nI.p) r7
            r15.P()
            U0.P.g(r12, r7, r15, r4)
            java.lang.String r7 = "media_frame"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r14, r7)
            r12 = 8
            float r12 = (float) r12
            float r12 = c2.h.B(r12)
            A0.f r12 = A0.g.e(r12)
            androidx.compose.ui.d r7 = m1.e.a(r7, r12)
            i1.c$a r12 = i1.C5437c.f24302a
            i1.c r12 = r12.o()
            E1.I r12 = androidx.compose.foundation.layout.C5077h.h(r12, r4)
            int r13 = U0.C4883j.a(r15, r4)
            U0.y r10 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r7)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r6 = r16.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x012e
            U0.C4883j.c()
        L_0x012e:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x013b
            r15.p(r6)
            goto L_0x013e
        L_0x013b:
            r15.t()
        L_0x013e:
            U0.m r6 = U0.F1.a(r15)
            nI.p r4 = r16.c()
            U0.F1.c(r6, r12, r4)
            nI.p r4 = r16.e()
            U0.F1.c(r6, r10, r4)
            nI.p r4 = r16.b()
            boolean r10 = r6.i()
            if (r10 != 0) goto L_0x0168
            java.lang.Object r10 = r6.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r10 != 0) goto L_0x0176
        L_0x0168:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r6.u(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r6.w(r10, r4)
        L_0x0176:
            nI.p r4 = r16.d()
            U0.F1.c(r6, r7, r4)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r19 = r4.e(r6)
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r15, r7)
            long r20 = r6.l0()
            r23 = 2
            r24 = 0
            r22 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.d(r19, r20, r22, r23, r24)
            if (r5 == 0) goto L_0x01a8
            if (r8 == 0) goto L_0x01ac
            aE.a r7 = r(r11)
            aE.a r10 = aE.C13920a.Error
            if (r7 != r10) goto L_0x01a8
            goto L_0x01ac
        L_0x01a8:
            r19 = r14
            r12 = r15
            goto L_0x020f
        L_0x01ac:
            r3 = -1387315157(0xffffffffad4f402b, float:-1.1780836E-11)
            r15.W(r3)
            java.lang.String r3 = "image"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r6, r3)
            r3 = 925084026(0x3723a97a, float:9.755016E-6)
            r15.W(r3)
            boolean r3 = r15.V(r5)
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x01d0
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x01d8
        L_0x01d0:
            aE.o r4 = new aE.o
            r4.<init>(r5)
            r15.u(r4)
        L_0x01d8:
            nI.l r4 = (nI.C17642l) r4
            r15.P()
            r3 = 0
            gs.e r4 = gs.f.a(r4, r15, r3)
            java.lang.String r5 = r25.c()
            int r7 = uK.C18146a.f148160N5
            t1.c r8 = J1.e.c(r7, r15, r3)
            E1.k$a r3 = E1.C4478k.f5915a
            E1.k r11 = r3.a()
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            int r7 = gs.e.f97946h
            r16 = r7 | r3
            r17 = 0
            r18 = 1896(0x768, float:2.657E-42)
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r3 = 0
            r19 = r14
            r14 = r3
            r3 = r15
            gs.C11352b.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.P()
            r12 = r3
            goto L_0x02bc
        L_0x020f:
            if (r8 == 0) goto L_0x02b3
            r5 = -1386738371(0xffffffffad580d3d, float:-1.2281118E-11)
            r12.W(r5)
            r5 = 925100531(0x3723e9f3, float:9.770028E-6)
            r12.W(r5)
            r5 = 4
            if (r3 != r5) goto L_0x0222
            r3 = 1
            goto L_0x0223
        L_0x0222:
            r3 = 0
        L_0x0223:
            java.lang.Object r5 = r12.D()
            if (r3 != 0) goto L_0x0231
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0239
        L_0x0231:
            aE.p r5 = new aE.p
            r5.<init>(r0)
            r12.u(r5)
        L_0x0239:
            nI.l r5 = (nI.C17642l) r5
            r12.P()
            r3 = 0
            r7 = 1
            r10 = 0
            androidx.compose.ui.d r3 = L1.o.d(r6, r3, r5, r7, r10)
            java.lang.String r5 = "video"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r3, r5)
            java.lang.Object r5 = r9.m()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.ui.d r5 = m1.C5571a.a(r3, r5)
            r3 = 925113410(0x37241c42, float:9.781741E-6)
            r12.W(r3)
            boolean r3 = r12.V(r11)
            java.lang.Object r6 = r12.D()
            if (r3 != 0) goto L_0x0271
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0279
        L_0x0271:
            aE.d r6 = new aE.d
            r6.<init>(r4, r11)
            r12.u(r6)
        L_0x0279:
            r7 = r6
            nI.a r7 = (nI.C17631a) r7
            r12.P()
            r3 = 925118783(0x3724313f, float:9.786628E-6)
            r12.W(r3)
            boolean r3 = r12.V(r11)
            java.lang.Object r6 = r12.D()
            if (r3 != 0) goto L_0x0297
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x029f
        L_0x0297:
            aE.e r6 = new aE.e
            r6.<init>(r4, r11)
            r12.u(r6)
        L_0x029f:
            r3 = r6
            nI.a r3 = (nI.C17631a) r3
            r12.P()
            r10 = 384(0x180, float:5.38E-43)
            r11 = 0
            r6 = 1
            r4 = r8
            r8 = r3
            r9 = r12
            ZC.C13892o.o(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.P()
            goto L_0x02bc
        L_0x02b3:
            r3 = -1385918328(0xffffffffad649088, float:-1.2992392E-11)
            r12.W(r3)
            r12.P()
        L_0x02bc:
            r12.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x02c8
            U0.C4895p.R()
        L_0x02c8:
            r8 = r19
        L_0x02ca:
            U0.Y0 r3 = r12.n()
            if (r3 == 0) goto L_0x02d8
            aE.f r4 = new aE.f
            r4.<init>(r0, r8, r1, r2)
            r3.a(r4)
        L_0x02d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aE.C13936q.q(cE.b, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C13920a r(C4899r0<C13920a> r0Var) {
        return r0Var.getValue();
    }

    private static final void s(C4899r0<C13920a> r0Var, C13920a aVar) {
        r0Var.setValue(aVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N t(String str, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(str);
        aVar.l(h.a.XS);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C14034b bVar, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        String c10 = bVar.c();
        if (c10 != null) {
            L1.v.d0(xVar, c10);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C5857c cVar, C4899r0 r0Var) {
        s(r0Var, C13920a.Ready);
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("MediaState is Ready", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = cVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C5857c cVar, C4899r0 r0Var) {
        s(r0Var, C13920a.Error);
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("MediaState Error", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = cVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C14034b bVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        q(bVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void y(C14034b bVar, int i10, C4889m mVar, int i11) {
        int i12;
        C14034b bVar2 = bVar;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-309248233);
        if ((i14 & 6) == 0) {
            i12 = (k10.V(bVar2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.d(i13) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-309248233, i12, -1, "com.ingka.ikea.whatsnew.impl.presentation.compose.MessageContentLandscape (WhatsNewScreen.kt:186)");
            }
            C5437c.C0386c i15 = C5437c.f24302a.i();
            d.a aVar = d.f18749a;
            d a10 = C5116k1.a(aVar, C13937r.f118790a.a(bVar.d()));
            I b10 = G.b(C5073d.f18068a.f(), i15, k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, b10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b11);
            }
            F1.c(a13, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            float f10 = (float) 16;
            int i16 = i12 & 14;
            C(bVar, i10, D.m(J.g(aVar, 0.5f), 0.0f, 0.0f, c2.h.B(f10), 0.0f, 11, (Object) null), k10, i16 | 384 | (i12 & 112), 0);
            k10.W(-2046867500);
            if (!(bVar.b() == null && bVar.f() == null)) {
                q(bVar2, D.j(C5074e.b(m1.e.b(C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null)), 1.0f, false, 2, (Object) null), c2.h.B((float) 8), c2.h.B(f10)), k10, i16, 0);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C13931l(bVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C14034b bVar, int i10, int i11, C4889m mVar, int i12) {
        y(bVar, i10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }
}
