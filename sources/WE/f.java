package we;

import E1.I;
import G1.C4504g;
import HJ.C15854t;
import N1.P;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import SC.C13607l;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import Y1.j;
import Y1.k;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.h;
import com.sugarcube.core.logger.DslKt;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qe.C10189b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import r0.m;
import s0.C5843N;
import s0.C5862h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\n\u001a!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqe/b;", "state", "Lkotlin/Function0;", "LXH/N;", "onDismissClicked", "f", "(Lqe/b;LnI/a;LU0/m;I)V", "Lqe/b$a;", "alert", "l", "(Lqe/b$a;LnI/a;LU0/m;I)V", "j", "", "url", "Landroidx/compose/ui/d;", "modifier", "h", "(Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "n", "(LnI/a;LU0/m;I)V", "alertmessaging-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final void f(C10189b bVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        boolean z10;
        C10189b bVar2 = bVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(bVar2, "state");
        C17542s.j(aVar2, "onDismissClicked");
        C4889m k10 = mVar.k(1640390849);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1640390849, i11, -1, "com.ingka.ikea.alertmessaging.impl.presentation.compose.AlertMessageDialogContent (AlertMessageDialogContent.kt:52)");
            }
            if (C17542s.e(bVar2, C10189b.c.f76050a)) {
                k10.W(13133093);
                k10.P();
                IllegalStateException illegalStateException = new IllegalStateException();
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                Iterator it = d.f102012a.a().iterator();
                while (true) {
                    z10 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar3 : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("AlertMessageDialog launched without alert message", illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = bVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str3 = str2;
                    bVar3.a(eVar, str3, z10, illegalStateException, str);
                    str2 = str3;
                    z10 = z10;
                }
                aVar.invoke();
            } else if (C17542s.e(bVar2, C10189b.C1398b.f76049a)) {
                k10.W(13349008);
                C13605k1.b(J.c(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), 0.5f), (C13597i1) null, C13593h1.Large, k10, 390, 2);
                k10.P();
            } else if (bVar2 instanceof C10189b.a) {
                k10.W(13631387);
                if (((Configuration) k10.Q(AndroidCompositionLocals_androidKt.f())).orientation == 2) {
                    k10.W(13759510);
                    j((C10189b.a) bVar2, aVar2, k10, i11 & 112);
                    k10.P();
                } else {
                    k10.W(13925143);
                    l((C10189b.a) bVar2, aVar2, k10, i11 & 112);
                    k10.P();
                }
                k10.P();
            } else {
                k10.W(970254251);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10362a(bVar2, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C10189b bVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        f(bVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void h(java.lang.String r20, androidx.compose.ui.d r21, U0.C4889m r22, int r23, int r24) {
        /*
            r15 = r20
            r0 = 1202309463(0x47a9c957, float:86930.68)
            r1 = r22
            U0.m r14 = r1.k(r0)
            r1 = r24 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0013
            r1 = r23 | 6
            goto L_0x0025
        L_0x0013:
            r1 = r23 & 6
            if (r1 != 0) goto L_0x0023
            boolean r1 = r14.V(r15)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = r2
        L_0x0020:
            r1 = r23 | r1
            goto L_0x0025
        L_0x0023:
            r1 = r23
        L_0x0025:
            r3 = r24 & 2
            if (r3 == 0) goto L_0x002e
            r1 = r1 | 48
        L_0x002b:
            r4 = r21
            goto L_0x0040
        L_0x002e:
            r4 = r23 & 48
            if (r4 != 0) goto L_0x002b
            r4 = r21
            boolean r5 = r14.V(r4)
            if (r5 == 0) goto L_0x003d
            r5 = 32
            goto L_0x003f
        L_0x003d:
            r5 = 16
        L_0x003f:
            r1 = r1 | r5
        L_0x0040:
            r5 = r1 & 19
            r6 = 18
            if (r5 != r6) goto L_0x0053
            boolean r5 = r14.l()
            if (r5 != 0) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            r14.L()
            r16 = r14
            goto L_0x00b8
        L_0x0053:
            if (r3 == 0) goto L_0x0059
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r13 = r3
            goto L_0x005a
        L_0x0059:
            r13 = r4
        L_0x005a:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0066
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.alertmessaging.impl.presentation.compose.AlertMessageImage (AlertMessageDialogContent.kt:140)"
            U0.C4895p.S(r0, r1, r3, r4)
        L_0x0066:
            LC.b$b r3 = new LC.b$b
            gs.h$a r0 = gs.h.a.XS
            r3.<init>(r0)
            E1.k$a r0 = E1.C4478k.f5915a
            E1.k r5 = r0.e()
            r0 = 0
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.C5074e.b(r13, r6, r0, r2, r4)
            r2 = 24
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r0, r2)
            r0 = r1 & 14
            r1 = 196656(0x30030, float:2.75574E-40)
            r0 = r0 | r1
            int r1 = LC.C13178b.C2734b.f111820b
            int r1 = r1 << 9
            r16 = r0 | r1
            r17 = 0
            r18 = 4048(0xfd0, float:5.672E-42)
            r1 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r20
            r12 = r14
            r19 = r13
            r13 = r16
            r16 = r14
            r14 = r17
            r15 = r18
            LC.h.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00b6
            U0.C4895p.R()
        L_0x00b6:
            r4 = r19
        L_0x00b8:
            U0.Y0 r0 = r16.n()
            if (r0 == 0) goto L_0x00cc
            we.e r1 = new we.e
            r2 = r20
            r3 = r23
            r5 = r24
            r1.<init>(r2, r4, r3, r5)
            r0.a(r1)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we.f.h(java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(String str, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(str, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void j(C10189b.a aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C10189b.a aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(-2040642129);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2040642129, i13, -1, "com.ingka.ikea.alertmessaging.impl.presentation.compose.ContentInLandscape (AlertMessageDialogContent.kt:114)");
            }
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d i14 = TC.e.i(aVar5);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar6 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar6.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, i14);
            C4504g.a aVar7 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar7.a();
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
            F1.c(a13, a10, aVar7.c());
            F1.c(a13, s10, aVar7.e());
            p<C4504g, Integer, C16807N> b10 = aVar7.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar7.d());
            C5862h hVar = C5862h.f28810a;
            I b11 = G.b(dVar.f(), aVar6.i(), k10, 48);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = c.e(k10, aVar5);
            C17631a<C4504g> a15 = aVar7.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, b11, aVar7.c());
            F1.c(a16, s11, aVar7.e());
            p<C4504g, Integer, C16807N> b12 = aVar7.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar7.d());
            C5843N n10 = C5843N.f28726a;
            String c10 = aVar.c();
            k10.W(-663149502);
            if (c10 != null) {
                h(c10, J.g(aVar5, 0.34f), k10, 48, 0);
            }
            k10.P();
            mVar2 = k10;
            C13607l.j(aVar.d(), C13679b.a.C2856b.f116680a, D.i(aVar5, h.B((float) 16)), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262136);
            mVar2.x();
            n(aVar4, mVar2, (i13 >> 3) & 14);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C10363b(aVar3, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C10189b.a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        j(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void l(C10189b.a aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C10189b.a aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(-873508369);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-873508369, i13, -1, "com.ingka.ikea.alertmessaging.impl.presentation.compose.ContentInPortrait (AlertMessageDialogContent.kt:89)");
            }
            C5437c.b g10 = C5437c.f24302a.g();
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d i14 = TC.e.i(aVar5);
            I a10 = C5080k.a(C5073d.f18068a.g(), g10, k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, i14);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar6.a();
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
            F1.c(a13, a10, aVar6.c());
            F1.c(a13, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b10 = aVar6.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar6.d());
            C5862h hVar = C5862h.f28810a;
            String c10 = aVar.c();
            k10.W(1532005918);
            if (c10 != null) {
                h(c10, J.c(J.b(aVar5, 0.0f, h.B((float) 200), 1, (Object) null), 0.4f), k10, 48, 0);
            }
            k10.P();
            mVar2 = k10;
            C13607l.j(aVar.d(), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
            n(aVar4, mVar2, (i13 >> 3) & 14);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10364c(aVar3, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C10189b.a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        l(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void n(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1883823103);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1883823103, i11, -1, "com.ingka.ikea.alertmessaging.impl.presentation.compose.DismissCTA (AlertMessageDialogContent.kt:153)");
            }
            L.b(J1.j.b(b.f84734o2, k10, 0), D.m(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), 0.0f, h.B((float) 24), 0.0f, h.B((float) 16), 5, (Object) null), false, (N) null, M.Medium, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i11 << 27) & 1879048192) | 24576, 492);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new d(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17631a aVar, int i10, C4889m mVar, int i11) {
        n(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
