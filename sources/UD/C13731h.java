package UD;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import J1.e;
import QJ.Q;
import TD.C13682a;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import dI.C17164e;
import eI.C17187b;
import gs.e;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lg.C10027d;
import n0.C5583F;
import nI.C17631a;
import nI.p;
import p1.C5749w0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTD/a$c;", "promo", "Lkotlin/Function0;", "LXH/N;", "onLoaded", "i", "(LTD/a$c;LnI/a;LU0/m;I)V", "", "url", "Landroidx/compose/ui/d;", "modifier", "j", "(Ljava/lang/String;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "g", "(Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "welcome-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: UD.h  reason: case insensitive filesystem */
public final class C13731h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.welcome.impl.presentation.promo.compose.PromoImageKt$FallbackImage$1$1", f = "PromoImage.kt", l = {}, m = "invokeSuspend")
    /* renamed from: UD.h$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117028c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f117029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f117029d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f117029d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f117028c == 0) {
                y.b(obj);
                this.f117029d.invoke();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static final void g(d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-1374807886);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1374807886, i12, -1, "com.ingka.ikea.welcome.impl.presentation.promo.compose.FallbackImage (PromoImage.kt:66)");
            }
            C16807N n10 = C16807N.f139792a;
            k10.W(-1272501415);
            boolean z10 = (i12 & 112) == 32;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(aVar, (C17164e<? super a>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(n10, (p) D10, k10, 6);
            C5583F.a(e.c(C10027d.f75286q, k10, 0), (String) null, J.f(dVar, 0.0f, 1, (Object) null), (C5437c) null, C4478k.f5915a.a(), 0.0f, (C5749w0) null, k10, 24624, 104);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C13728e(dVar, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        g(dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void i(C13682a.c cVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C13682a.c cVar2 = cVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(cVar2, "promo");
        C17542s.j(aVar2, "onLoaded");
        C4889m k10 = mVar.k(-1561714011);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(cVar2) : k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1561714011, i11, -1, "com.ingka.ikea.welcome.impl.presentation.promo.compose.PromoImage (PromoImage.kt:24)");
            }
            d.a aVar3 = d.f18749a;
            boolean z10 = true;
            d f10 = J.f(aVar3, 0.0f, 1, (Object) null);
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar4.a();
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
            F1.c(a12, h10, aVar4.c());
            F1.c(a12, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar4.d());
            C5079j jVar = C5079j.f18125a;
            if (cVar2 instanceof C13682a.c.b) {
                k10.W(-1925302835);
                String a13 = ((C13682a.c.b) cVar2).a();
                d f11 = J.f(aVar3, 0.0f, 1, (Object) null);
                k10.W(-1925299053);
                if ((i11 & 112) != 32) {
                    z10 = false;
                }
                Object D10 = k10.D();
                if (z10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C13725b(aVar2);
                    k10.u(D10);
                }
                k10.P();
                j(a13, f11, (C17631a) D10, k10, 48, 0);
                k10.P();
            } else if (cVar2 instanceof C13682a.c.C2865c) {
                k10.W(-1925296863);
                k10.W(-1925296429);
                boolean z11 = (i11 & 112) == 32;
                Object D11 = k10.D();
                if (z11 || D11 == C4889m.f14007a.a()) {
                    D11 = new C13726c(aVar2);
                    k10.u(D11);
                }
                k10.P();
                g((d) null, (C17631a) D11, k10, 0, 1);
                k10.P();
            } else {
                k10.W(-1925295287);
                k10.P();
            }
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13727d(cVar2, aVar2, i12));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void j(java.lang.String r21, androidx.compose.ui.d r22, nI.C17631a<XH.C16807N> r23, U0.C4889m r24, int r25, int r26) {
        /*
            r3 = r23
            r4 = r25
            r0 = 2067641058(0x7b3db2e2, float:9.849723E35)
            r1 = r24
            U0.m r1 = r1.k(r0)
            r2 = r26 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r4 | 6
            r5 = r2
            r2 = r21
            goto L_0x002b
        L_0x0017:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r21
            boolean r5 = r1.V(r2)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r4
            goto L_0x002b
        L_0x0028:
            r2 = r21
            r5 = r4
        L_0x002b:
            r6 = r26 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r7 = r22
            goto L_0x0046
        L_0x0034:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0031
            r7 = r22
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r5 = r5 | r8
        L_0x0046:
            r8 = r26 & 4
            r9 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004f:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005e
            boolean r8 = r1.F(r3)
            if (r8 == 0) goto L_0x005b
            r8 = r9
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r5 = r5 | r8
        L_0x005e:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r8 != r10) goto L_0x0070
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r1.L()
            goto L_0x00ef
        L_0x0070:
            if (r6 == 0) goto L_0x0076
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r15 = r6
            goto L_0x0077
        L_0x0076:
            r15 = r7
        L_0x0077:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0083
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.welcome.impl.presentation.promo.compose.PromoImage (PromoImage.kt:46)"
            U0.C4895p.S(r0, r5, r6, r7)
        L_0x0083:
            LC.b$b r8 = new LC.b$b
            gs.h$a r0 = gs.h.a.XXL
            r8.<init>(r0)
            r0 = 0
            r6 = 0
            r7 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r15, r0, r7, r6)
            E1.k$a r6 = E1.C4478k.f5915a
            E1.k r10 = r6.a()
            r6 = 1955942196(0x74954f34, float:9.463607E31)
            r1.W(r6)
            r6 = r5 & 896(0x380, float:1.256E-42)
            if (r6 != r9) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            java.lang.Object r6 = r1.D()
            if (r7 != 0) goto L_0x00b1
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x00b9
        L_0x00b1:
            UD.f r6 = new UD.f
            r6.<init>(r3)
            r1.u(r6)
        L_0x00b9:
            r12 = r6
            nI.l r12 = (nI.C17642l) r12
            r1.P()
            r5 = r5 & 14
            r6 = 196656(0x30030, float:2.75574E-40)
            r5 = r5 | r6
            int r6 = LC.C13178b.C2734b.f111820b
            int r6 = r6 << 9
            r18 = r5 | r6
            r19 = 0
            r20 = 3920(0xf50, float:5.493E-42)
            r6 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r5 = r21
            r7 = r0
            r0 = r15
            r15 = r16
            r16 = r17
            r17 = r1
            LC.h.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00ee
            U0.C4895p.R()
        L_0x00ee:
            r7 = r0
        L_0x00ef:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x0107
            UD.g r8 = new UD.g
            r0 = r8
            r1 = r21
            r2 = r7
            r3 = r23
            r4 = r25
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r8)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: UD.C13731h.j(java.lang.String, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C13682a.c cVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        i(cVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17631a aVar, e.c cVar) {
        C17542s.j(cVar, "it");
        if (cVar instanceof e.c.d) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(String str, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        j(str, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
