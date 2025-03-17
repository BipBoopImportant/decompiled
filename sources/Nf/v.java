package nf;

import B0.C4380y;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import N1.P;
import O0.e1;
import O0.g1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import mf.C10040b;
import n1.C5626f;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import ol.u;
import p0.s;
import pf.C10138a;
import rf.b;
import s0.C5842M;
import s0.C5848T;
import s0.C5861g;
import s0.C5862h;
import tK.C18029u;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0001\u0010!\u001a\u00020\n*\u00020\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0003¢\u0006\u0004\b!\u0010\"\u001a5\u0010&\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020\u001b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0010H\u0003¢\u0006\u0004\b&\u0010'\u001a%\u0010(\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0003¢\u0006\u0004\b(\u0010)\u001a\u001d\u0010+\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0003¢\u0006\u0004\b+\u0010,\u001a\u001d\u0010-\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0003¢\u0006\u0004\b-\u0010,\u001a%\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0003¢\u0006\u0004\b/\u00100\u001a\u001d\u00102\u001a\u00020\n2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0003¢\u0006\u0004\b2\u0010,¨\u00065²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u0002²\u0006\u000e\u00104\u001a\u0004\u0018\u0001038\nX\u0002²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u00048\n@\nX\u0002²\u0006\u000e\u0010$\u001a\u00020\u001b8\n@\nX\u0002"}, d2 = {"Lrf/b;", "viewModel", "Llm/a$c;", "fulfilmentOption", "", "productTitle", "itemNo", "itemType", "Lpf/a;", "actions", "LXH/N;", "v", "(Lrf/b;Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpf/a;LU0/m;I)V", "Lrf/b$a;", "state", "email", "Lkotlin/Function1;", "Llm/a$a;", "onSignup", "Lkotlin/Function0;", "onErrorDismissed", "B", "(Lrf/b$a;Ljava/lang/String;Llm/a$c;Lpf/a;LnI/l;LnI/a;LU0/m;I)V", "errorBody", "R", "(Lrf/b$a;LnI/a;Ljava/lang/String;LU0/m;I)V", "Ls0/g;", "", "buttonLoading", "invalidInputErrorReceived", "onPrivacyPolicyClicked", "onChangeStoreClicked", "onNotNowClicked", "F", "(Ls0/g;Ljava/lang/String;ZZLlm/a$c;LnI/a;LnI/a;LnI/a;LnI/l;LnI/a;LU0/m;I)V", "inputText", "showInputError", "onInputChanged", "V", "(Ljava/lang/String;ZLnI/l;LU0/m;I)V", "d0", "(Llm/a$c;LnI/a;LU0/m;I)V", "onClick", "D", "(LnI/a;LU0/m;I)V", "Z", "loading", "b0", "(ZLnI/a;LU0/m;I)V", "onClosedClicked", "P", "LkD/h;", "profile", "backinstock-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f75621a;

        a(String str) {
            this.f75621a = str;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(31552428, i11, -1, "com.ingka.ikea.app.backinstocknotifications.compose.ErrorAlertDialogContainer.<anonymous> (BackInStockNotificationsSections.kt:195)");
                }
                C13607l.j(this.f75621a, C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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

    /* access modifiers changed from: private */
    public static final C16807N A(b bVar, C11550a.c cVar, String str, String str2, String str3, C10138a aVar, int i10, C4889m mVar, int i11) {
        v(bVar, cVar, str, str2, str3, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void B(b.a aVar, String str, C11550a.c cVar, C10138a aVar2, C17642l<? super C11550a.C2253a, C16807N> lVar, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z10;
        boolean z11;
        b.a aVar4 = aVar;
        C11550a.c cVar2 = cVar;
        C10138a aVar5 = aVar2;
        C17642l<? super C11550a.C2253a, C16807N> lVar2 = lVar;
        C17631a<C16807N> aVar6 = aVar3;
        int i12 = i10;
        C17542s.j(aVar4, "state");
        C17542s.j(cVar2, "fulfilmentOption");
        C17542s.j(aVar5, "actions");
        C17542s.j(lVar2, "onSignup");
        C17542s.j(aVar6, "onErrorDismissed");
        C4889m k10 = mVar.k(2011791001);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(aVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        String str2 = str;
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(cVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(aVar5) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(aVar6) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i13 = i11;
        if ((74899 & i13) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2011791001, i13, -1, "com.ingka.ikea.app.backinstocknotifications.compose.BackInStockNotificationsSections (BackInStockNotificationsSections.kt:112)");
            }
            d.a aVar7 = d.f18749a;
            d f10 = J.f(aVar7, 0.0f, 1, (Object) null);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar8 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar8.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
            C4504g.a aVar9 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar9.a();
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
            F1.c(a13, a10, aVar9.c());
            F1.c(a13, s10, aVar9.e());
            p<C4504g, Integer, C16807N> b10 = aVar9.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar9.d());
            C5862h hVar = C5862h.f28810a;
            P(aVar2.c(), k10, 0);
            d f11 = m.f(aVar7, m.c(0, k10, 0, 1), false, (s) null, false, 14, (Object) null);
            I a14 = C5080k.a(dVar.g(), aVar8.k(), k10, 0);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, f11);
            C17631a<C4504g> a16 = aVar9.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, a14, aVar9.c());
            F1.c(a17, s11, aVar9.e());
            p<C4504g, Integer, C16807N> b11 = aVar9.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e11, aVar9.d());
            b.a.C1406b bVar = b.a.C1406b.f76435a;
            if (C17542s.e(aVar4, bVar) || (aVar4 instanceof b.a.C1403a.C1404a) || C17542s.e(aVar4, b.a.C1403a.C1405b.f76433a) || C17542s.e(aVar4, b.a.C1403a.c.f76434a)) {
                z10 = false;
            } else if (C17542s.e(aVar4, b.a.c.f76436a)) {
                z10 = true;
            } else {
                throw new t();
            }
            if (C17542s.e(aVar4, bVar) || C17542s.e(aVar4, b.a.c.f76436a) || (aVar4 instanceof b.a.C1403a.C1404a) || C17542s.e(aVar4, b.a.C1403a.C1405b.f76433a)) {
                z11 = false;
            } else if (C17542s.e(aVar4, b.a.C1403a.c.f76434a)) {
                z11 = true;
            } else {
                throw new t();
            }
            int i14 = i13 << 12;
            int i15 = i13;
            C4889m mVar3 = k10;
            C17631a<C16807N> aVar10 = aVar6;
            F(hVar, str, z10, z11, cVar, aVar2.d(), aVar2.b(), aVar2.c(), lVar, aVar3, mVar3, (i13 & 112) | 6 | ((i13 << 6) & 57344) | (234881024 & i14) | (i14 & 1879048192));
            mVar3.x();
            b.a.C1403a.C1404a aVar11 = aVar4 instanceof b.a.C1403a.C1404a ? (b.a.C1403a.C1404a) aVar4 : null;
            mVar2 = mVar3;
            R(aVar4, aVar10, aVar11 != null ? aVar2.a().invoke(aVar11.a(), aVar11.b()) : null, mVar2, (i15 & 14) | ((i15 >> 12) & 112));
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            C17631a<C16807N> aVar12 = aVar6;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new o(aVar, str, cVar, aVar2, lVar, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N C(b.a aVar, String str, C11550a.c cVar, C10138a aVar2, C17642l lVar, C17631a aVar3, int i10, C4889m mVar, int i11) {
        B(aVar, str, cVar, aVar2, lVar, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void D(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(75016309);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(75016309, i11, -1, "com.ingka.ikea.app.backinstocknotifications.compose.ChangeStoreButton (BackInStockNotificationsSections.kt:418)");
            }
            d h10 = J.h(d.f18749a, 0.0f, 1, (Object) null);
            C18029u uVar = C18029u.f147649a;
            L.b(J1.j.b(C10040b.f75369l, k10, 0), D.h(h10, D.e(uVar.a(), 0.0f, uVar.a(), h.B((float) 8), 2, (Object) null)), false, N.Secondary, M.Medium, false, (Integer) null, (K0) null, (r0.m) null, aVar, k10, ((i11 << 27) & 1879048192) | 27648, 484);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new e(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C17631a aVar, int i10, C4889m mVar, int i11) {
        D(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void F(s0.C5861g r45, java.lang.String r46, boolean r47, boolean r48, lm.C11550a.c r49, nI.C17631a<XH.C16807N> r50, nI.C17631a<XH.C16807N> r51, nI.C17631a<XH.C16807N> r52, nI.C17642l<? super lm.C11550a.C2253a, XH.C16807N> r53, nI.C17631a<XH.C16807N> r54, U0.C4889m r55, int r56) {
        /*
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r50
            r7 = r51
            r8 = r52
            r9 = r53
            r10 = r54
            r11 = r56
            r1 = 839620674(0x320b9842, float:8.125484E-9)
            r2 = r55
            U0.m r2 = r2.k(r1)
            r15 = 48
            r12 = r11 & 48
            if (r12 != 0) goto L_0x0031
            r12 = r46
            boolean r16 = r2.V(r12)
            if (r16 == 0) goto L_0x002c
            r16 = 32
            goto L_0x002e
        L_0x002c:
            r16 = 16
        L_0x002e:
            r16 = r11 | r16
            goto L_0x0035
        L_0x0031:
            r12 = r46
            r16 = r11
        L_0x0035:
            r13 = r11 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x0046
            boolean r13 = r2.b(r3)
            if (r13 == 0) goto L_0x0042
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r16 = r16 | r13
        L_0x0046:
            r13 = r11 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0057
            boolean r13 = r2.b(r4)
            if (r13 == 0) goto L_0x0053
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r16 = r16 | r13
        L_0x0057:
            r13 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0068
            boolean r13 = r2.F(r5)
            if (r13 == 0) goto L_0x0064
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0066
        L_0x0064:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0066:
            r16 = r16 | r13
        L_0x0068:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x007a
            boolean r13 = r2.F(r6)
            if (r13 == 0) goto L_0x0076
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0078
        L_0x0076:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x0078:
            r16 = r16 | r13
        L_0x007a:
            r13 = 1572864(0x180000, float:2.204052E-39)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x008c
            boolean r13 = r2.F(r7)
            if (r13 == 0) goto L_0x0088
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x008a
        L_0x0088:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x008a:
            r16 = r16 | r13
        L_0x008c:
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x009e
            boolean r13 = r2.F(r8)
            if (r13 == 0) goto L_0x009a
            r13 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x009c
        L_0x009a:
            r13 = 4194304(0x400000, float:5.877472E-39)
        L_0x009c:
            r16 = r16 | r13
        L_0x009e:
            r13 = 100663296(0x6000000, float:2.4074124E-35)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00b0
            boolean r13 = r2.F(r9)
            if (r13 == 0) goto L_0x00ac
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00ae
        L_0x00ac:
            r13 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00ae:
            r16 = r16 | r13
        L_0x00b0:
            r13 = 805306368(0x30000000, float:4.656613E-10)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00c2
            boolean r13 = r2.F(r10)
            if (r13 == 0) goto L_0x00be
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00c0
        L_0x00be:
            r13 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00c0:
            r16 = r16 | r13
        L_0x00c2:
            r13 = r16
            r16 = 306783377(0x12492491, float:6.346949E-28)
            r14 = r13 & r16
            r15 = 306783376(0x12492490, float:6.3469484E-28)
            if (r14 != r15) goto L_0x00da
            boolean r14 = r2.l()
            if (r14 != 0) goto L_0x00d5
            goto L_0x00da
        L_0x00d5:
            r2.L()
            goto L_0x04f2
        L_0x00da:
            boolean r14 = U0.C4895p.J()
            if (r14 == 0) goto L_0x00e6
            r14 = -1
            java.lang.String r15 = "com.ingka.ikea.app.backinstocknotifications.compose.Content (BackInStockNotificationsSections.kt:219)"
            U0.C4895p.S(r1, r13, r14, r15)
        L_0x00e6:
            r1 = 0
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r15 = -720042049(0xffffffffd51507bf, float:-1.02412814E13)
            r2.W(r15)
            java.lang.Object r15 = r2.D()
            U0.m$a r39 = U0.C4889m.f14007a
            java.lang.Object r0 = r39.a()
            if (r15 != r0) goto L_0x0103
            nf.q r15 = new nf.q
            r15.<init>()
            r2.u(r15)
        L_0x0103:
            nI.a r15 = (nI.C17631a) r15
            r2.P()
            r0 = 3072(0xc00, float:4.305E-42)
            r18 = 6
            r19 = 0
            r20 = 0
            r12 = r14
            r40 = r13
            r14 = 32
            r13 = r19
            r14 = r20
            r16 = r2
            r17 = r0
            java.lang.Object r0 = f1.C5301c.e(r12, r13, r14, r15, r16, r17, r18)
            U0.r0 r0 = (U0.C4899r0) r0
            r12 = -720040407(0xffffffffd5150e29, float:-1.02430031E13)
            r2.W(r12)
            java.lang.Object r12 = r2.D()
            java.lang.Object r13 = r39.a()
            r14 = 2
            r15 = 0
            if (r12 != r13) goto L_0x013e
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            U0.r0 r12 = U0.u1.e(r12, r15, r14, r15)
            r2.u(r12)
        L_0x013e:
            U0.r0 r12 = (U0.C4899r0) r12
            r2.P()
            java.lang.String r13 = H(r0)
            if (r13 != 0) goto L_0x014b
            r13 = r46
        L_0x014b:
            I(r0, r13)
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            tK.u r16 = tK.C18029u.f147649a
            float r1 = r16.d()
            r11 = 0
            s0.E r1 = androidx.compose.foundation.layout.D.c(r1, r11, r14, r15)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.h(r13, r1)
            androidx.compose.foundation.layout.d r11 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r14 = r11.g()
            i1.c$a r42 = i1.C5437c.f24302a
            i1.c$b r15 = r42.k()
            r34 = r12
            r12 = 0
            E1.I r14 = androidx.compose.foundation.layout.C5080k.a(r14, r15, r2, r12)
            int r15 = U0.C4883j.a(r2, r12)
            U0.y r12 = r2.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r2, r1)
            G1.g$a r43 = G1.C4504g.f6515W
            nI.a r8 = r43.a()
            U0.f r17 = r2.m()
            if (r17 != 0) goto L_0x018d
            U0.C4883j.c()
        L_0x018d:
            r2.I()
            boolean r17 = r2.i()
            if (r17 == 0) goto L_0x019a
            r2.p(r8)
            goto L_0x019d
        L_0x019a:
            r2.t()
        L_0x019d:
            U0.m r8 = U0.F1.a(r2)
            nI.p r3 = r43.c()
            U0.F1.c(r8, r14, r3)
            nI.p r3 = r43.e()
            U0.F1.c(r8, r12, r3)
            nI.p r3 = r43.b()
            boolean r12 = r8.i()
            if (r12 != 0) goto L_0x01c7
            java.lang.Object r12 = r8.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r14)
            if (r12 != 0) goto L_0x01d5
        L_0x01c7:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r8.u(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r8.w(r12, r3)
        L_0x01d5:
            nI.p r3 = r43.d()
            U0.F1.c(r8, r1, r3)
            s0.h r1 = s0.C5862h.f28810a
            r1 = 32
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r13, r1)
            r3 = 6
            s0.C5844O.a(r1, r2, r3)
            int r1 = r40 >> 12
            r1 = r1 & 14
            int r3 = r40 >> 15
            r3 = r3 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            d0(r5, r7, r2, r1)
            r1 = 20
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r13, r1)
            r3 = 6
            s0.C5844O.a(r1, r2, r3)
            boolean r1 = r5 instanceof lm.C11550a.c.b
            if (r1 != 0) goto L_0x0236
            boolean r3 = r5 instanceof lm.C11550a.c.C2255a
            if (r3 == 0) goto L_0x0211
            goto L_0x0236
        L_0x0211:
            boolean r3 = r5 instanceof lm.C11550a.c.C2258c
            if (r3 == 0) goto L_0x0227
            r3 = 1385510216(0x52953548, float:3.20422019E11)
            r2.W(r3)
            int r3 = mf.C10040b.f75374q
            r8 = 0
            java.lang.String r3 = J1.j.b(r3, r2, r8)
            r2.P()
        L_0x0225:
            r12 = r3
            goto L_0x0247
        L_0x0227:
            r0 = 183231831(0xaebe557, float:2.2715945E-32)
            r2.W(r0)
            r2.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0236:
            r3 = 1385356022(0x5292daf6, float:3.1536939E11)
            r2.W(r3)
            int r3 = mf.C10040b.f75373p
            r8 = 0
            java.lang.String r3 = J1.j.b(r3, r2, r8)
            r2.P()
            goto L_0x0225
        L_0x0247:
            TC.b$a$b r3 = TC.C13679b.a.C2856b.f116680a
            r8 = r13
            r13 = r3
            r36 = 0
            r37 = 262140(0x3fffc, float:3.67336E-40)
            r14 = 0
            r17 = 0
            r3 = 0
            r15 = r17
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 48
            r41 = r34
            r34 = r2
            SC.C13607l.j(r12, r13, r14, r15, r17, r19, r20, r21, r22, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r12 = 24
            float r15 = (float) r12
            float r12 = c2.h.B(r15)
            androidx.compose.ui.d r12 = androidx.compose.foundation.layout.J.i(r8, r12)
            r13 = 6
            s0.C5844O.a(r12, r2, r13)
            java.lang.String r12 = H(r0)
            boolean r13 = J(r41)
            r44 = 1
            if (r13 != 0) goto L_0x0299
            if (r4 == 0) goto L_0x0297
            goto L_0x0299
        L_0x0297:
            r13 = 0
            goto L_0x029b
        L_0x0299:
            r13 = r44
        L_0x029b:
            r14 = 183253576(0xaec3a48, float:2.2747896E-32)
            r2.W(r14)
            boolean r14 = r2.V(r0)
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r40 & r16
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 != r4) goto L_0x02b0
            r3 = r44
            goto L_0x02b1
        L_0x02b0:
            r3 = 0
        L_0x02b1:
            r3 = r3 | r14
            java.lang.Object r4 = r2.D()
            if (r3 != 0) goto L_0x02c2
            java.lang.Object r3 = r39.a()
            if (r4 != r3) goto L_0x02bf
            goto L_0x02c2
        L_0x02bf:
            r3 = r41
            goto L_0x02cc
        L_0x02c2:
            nf.r r4 = new nf.r
            r3 = r41
            r4.<init>(r10, r0, r3)
            r2.u(r4)
        L_0x02cc:
            nI.l r4 = (nI.C17642l) r4
            r2.P()
            r14 = 0
            V(r12, r13, r4, r2, r14)
            r4 = 16
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r8, r4)
            r12 = 6
            s0.C5844O.a(r4, r2, r12)
            i1.c$c r4 = r42.i()
            androidx.compose.foundation.layout.d$e r11 = r11.f()
            r12 = 48
            E1.I r4 = androidx.compose.foundation.layout.G.b(r11, r4, r2, r12)
            int r11 = U0.C4883j.a(r2, r14)
            U0.y r13 = r2.s()
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r2, r8)
            nI.a r12 = r43.a()
            U0.f r16 = r2.m()
            if (r16 != 0) goto L_0x030b
            U0.C4883j.c()
        L_0x030b:
            r2.I()
            boolean r16 = r2.i()
            if (r16 == 0) goto L_0x0318
            r2.p(r12)
            goto L_0x031b
        L_0x0318:
            r2.t()
        L_0x031b:
            U0.m r12 = U0.F1.a(r2)
            nI.p r10 = r43.c()
            U0.F1.c(r12, r4, r10)
            nI.p r4 = r43.e()
            U0.F1.c(r12, r13, r4)
            nI.p r4 = r43.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x0345
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x0353
        L_0x0345:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r12.u(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r12.w(r10, r4)
        L_0x0353:
            nI.p r4 = r43.d()
            U0.F1.c(r12, r14, r4)
            s0.N r4 = s0.C5843N.f28726a
            r4 = 3
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.E(r8, r11, r10, r4, r11)
            r10 = 48
            float r10 = (float) r10
            float r11 = c2.h.B(r10)
            float r10 = c2.h.B(r10)
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.a(r4, r11, r10)
            r4 = -473118623(0xffffffffe3ccc861, float:-7.555149E21)
            r2.W(r4)
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r40 & r4
            r10 = 131072(0x20000, float:1.83671E-40)
            if (r4 != r10) goto L_0x0383
            r4 = r44
            goto L_0x0384
        L_0x0383:
            r4 = 0
        L_0x0384:
            java.lang.Object r10 = r2.D()
            if (r4 != 0) goto L_0x0390
            java.lang.Object r4 = r39.a()
            if (r10 != r4) goto L_0x0398
        L_0x0390:
            nf.s r10 = new nf.s
            r10.<init>(r6)
            r2.u(r10)
        L_0x0398:
            r20 = r10
            nI.a r20 = (nI.C17631a) r20
            r2.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            i1.c r10 = r42.o()
            r11 = 0
            E1.I r10 = androidx.compose.foundation.layout.C5077h.h(r10, r11)
            int r12 = U0.C4883j.a(r2, r11)
            U0.y r11 = r2.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r2, r4)
            nI.a r13 = r43.a()
            U0.f r14 = r2.m()
            if (r14 != 0) goto L_0x03cf
            U0.C4883j.c()
        L_0x03cf:
            r2.I()
            boolean r14 = r2.i()
            if (r14 == 0) goto L_0x03dc
            r2.p(r13)
            goto L_0x03df
        L_0x03dc:
            r2.t()
        L_0x03df:
            U0.m r13 = U0.F1.a(r2)
            nI.p r14 = r43.c()
            U0.F1.c(r13, r10, r14)
            nI.p r10 = r43.e()
            U0.F1.c(r13, r11, r10)
            nI.p r10 = r43.b()
            boolean r11 = r13.i()
            if (r11 != 0) goto L_0x0409
            java.lang.Object r11 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x0417
        L_0x0409:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r13.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r13.w(r11, r10)
        L_0x0417:
            nI.p r10 = r43.d()
            U0.F1.c(r13, r4, r10)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            i1.c r10 = r42.h()
            androidx.compose.ui.d r14 = r4.a(r8, r10)
            int r4 = mf.C10040b.f75375r
            r10 = 0
            N1.d r12 = IC.C13021c.a(r4, r2, r10)
            TC.b$a$c r13 = TC.C13679b.a.c.f116681a
            tK.v r4 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.h r4 = r4.a(r2, r11)
            long r16 = r4.I0()
            r4 = r15
            r15 = r16
            r37 = 0
            r38 = 524272(0x7fff0, float:7.34662E-40)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r36 = 48
            r35 = r2
            SC.C13607l.h(r12, r13, r14, r15, r17, r19, r20, r21, r22, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r2.x()
            r2.x()
            r2.x()
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r8, r4)
            r8 = 6
            s0.C5844O.a(r4, r2, r8)
            r4 = -719974613(0xffffffffd5160f2b, float:-1.03119931E13)
            r2.W(r4)
            boolean r4 = r5 instanceof lm.C11550a.c.C2255a
            if (r4 != 0) goto L_0x0497
            if (r1 == 0) goto L_0x048c
            goto L_0x0497
        L_0x048c:
            boolean r1 = r5 instanceof lm.C11550a.c.C2258c
            if (r1 == 0) goto L_0x0491
            goto L_0x049e
        L_0x0491:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0497:
            int r1 = r40 >> 18
            r1 = r1 & 14
            D(r7, r2, r1)
        L_0x049e:
            r2.P()
            r1 = -719965005(0xffffffffd51634b3, float:-1.03220678E13)
            r2.W(r1)
            boolean r1 = r2.V(r0)
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r40 & r4
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            if (r4 != r8) goto L_0x04b5
            r10 = r44
        L_0x04b5:
            r1 = r1 | r10
            java.lang.Object r4 = r2.D()
            if (r1 != 0) goto L_0x04c2
            java.lang.Object r1 = r39.a()
            if (r4 != r1) goto L_0x04ca
        L_0x04c2:
            nf.t r4 = new nf.t
            r4.<init>(r9, r0, r3)
            r2.u(r4)
        L_0x04ca:
            nI.a r4 = (nI.C17631a) r4
            r2.P()
            r0 = 6
            int r0 = r40 >> 6
            r0 = r0 & 14
            r3 = r47
            b0(r3, r4, r2, r0)
            boolean r0 = r5 instanceof lm.C11550a.c.C2258c
            if (r0 == 0) goto L_0x04e7
            int r0 = r40 >> 21
            r0 = r0 & 14
            r8 = r52
            Z(r8, r2, r0)
            goto L_0x04e9
        L_0x04e7:
            r8 = r52
        L_0x04e9:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x04f2
            U0.C4895p.R()
        L_0x04f2:
            U0.Y0 r12 = r2.n()
            if (r12 == 0) goto L_0x0517
            nf.u r13 = new nf.u
            r0 = r13
            r1 = r45
            r2 = r46
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r50
            r7 = r51
            r8 = r52
            r9 = r53
            r10 = r54
            r11 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0517:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.v.F(s0.g, java.lang.String, boolean, boolean, lm.a$c, nI.a, nI.a, nI.a, nI.l, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C4899r0 G() {
        return u1.e((Object) null, (o1) null, 2, (Object) null);
    }

    private static final String H(C4899r0<String> r0Var) {
        return r0Var.getValue();
    }

    private static final void I(C4899r0<String> r0Var, String str) {
        r0Var.setValue(str);
    }

    private static final boolean J(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void K(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C17631a aVar, C4899r0 r0Var, C4899r0 r0Var2, String str) {
        C17542s.j(str, "text");
        I(r0Var, str);
        K(r0Var2, false);
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17642l lVar, C4899r0 r0Var, C4899r0 r0Var2) {
        String H10 = H(r0Var);
        if (H10 == null) {
            H10 = "";
        }
        boolean z10 = true;
        if (!C15854t.v0(H10)) {
            z10 = false;
        }
        K(r0Var2, z10);
        if (!J(r0Var2)) {
            lVar.invoke(new C11550a.C2253a.C2254a(H10));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C5861g gVar, String str, boolean z10, boolean z11, C11550a.c cVar, C17631a aVar, C17631a aVar2, C17631a aVar3, C17642l lVar, C17631a aVar4, int i10, C4889m mVar, int i11) {
        F(gVar, str, z10, z11, cVar, aVar, aVar2, aVar3, lVar, aVar4, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void P(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-40194351);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-40194351, i11, -1, "com.ingka.ikea.app.backinstocknotifications.compose.DialogTopAppBar (BackInStockNotificationsSections.kt:483)");
            }
            ol.p.c(ol.v.CLOSE, aVar, (d) null, "", (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, ((i11 << 3) & 112) | 3078, 500);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new p(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(C17631a aVar, int i10, C4889m mVar, int i11) {
        P(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void R(rf.b.a r11, nI.C17631a<XH.C16807N> r12, java.lang.String r13, U0.C4889m r14, int r15) {
        /*
            r0 = 117801045(0x7058055, float:1.0043521E-34)
            U0.m r14 = r14.k(r0)
            r1 = r15 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r14.V(r11)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r15
            goto L_0x0018
        L_0x0017:
            r1 = r15
        L_0x0018:
            r3 = r15 & 48
            r4 = 32
            if (r3 != 0) goto L_0x0029
            boolean r3 = r14.F(r12)
            if (r3 == 0) goto L_0x0026
            r3 = r4
            goto L_0x0028
        L_0x0026:
            r3 = 16
        L_0x0028:
            r1 = r1 | r3
        L_0x0029:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0039
            boolean r3 = r14.V(r13)
            if (r3 == 0) goto L_0x0036
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0038
        L_0x0036:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0038:
            r1 = r1 | r3
        L_0x0039:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r3 != r5) goto L_0x004b
            boolean r3 = r14.l()
            if (r3 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r14.L()
            goto L_0x0153
        L_0x004b:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0057
            r3 = -1
            java.lang.String r5 = "com.ingka.ikea.app.backinstocknotifications.compose.ErrorAlertDialogContainer (BackInStockNotificationsSections.kt:168)"
            U0.C4895p.S(r0, r1, r3, r5)
        L_0x0057:
            r0 = 52891829(0x32710b5, float:4.909607E-37)
            r14.W(r0)
            java.lang.Object r0 = r14.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r5 = r3.a()
            if (r0 != r5) goto L_0x0073
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5 = 0
            U0.r0 r0 = U0.u1.e(r0, r5, r2, r5)
            r14.u(r0)
        L_0x0073:
            U0.r0 r0 = (U0.C4899r0) r0
            r14.P()
            rf.b$a$b r2 = rf.b.a.C1406b.f76435a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r11, r2)
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x00a8
            rf.b$a$c r2 = rf.b.a.c.f76436a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r11, r2)
            if (r2 != 0) goto L_0x00a8
            rf.b$a$a$c r2 = rf.b.a.C1403a.c.f76434a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r11, r2)
            if (r2 == 0) goto L_0x0093
            goto L_0x00a8
        L_0x0093:
            boolean r2 = r11 instanceof rf.b.a.C1403a.C1404a
            if (r2 != 0) goto L_0x00a6
            rf.b$a$a$b r2 = rf.b.a.C1403a.C1405b.f76433a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r11, r2)
            if (r2 == 0) goto L_0x00a0
            goto L_0x00a6
        L_0x00a0:
            XH.t r11 = new XH.t
            r11.<init>()
            throw r11
        L_0x00a6:
            r2 = r5
            goto L_0x00a9
        L_0x00a8:
            r2 = r6
        L_0x00a9:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r2)
            int r2 = Oo.b.f84536V8
            java.lang.String r2 = J1.j.b(r2, r14, r6)
            r7 = 52909226(0x32754aa, float:4.917408E-37)
            r14.W(r7)
            if (r13 != 0) goto L_0x00c5
            int r7 = Oo.b.f84526U8
            java.lang.String r7 = J1.j.b(r7, r14, r6)
            goto L_0x00c6
        L_0x00c5:
            r7 = r13
        L_0x00c6:
            r14.P()
            java.lang.Object r8 = r0.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x014a
            int r8 = Oo.b.f84616d5
            java.lang.String r8 = J1.j.b(r8, r14, r6)
            r9 = 52917626(0x327757a, float:4.9211746E-37)
            r14.W(r9)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r4) goto L_0x00e7
            r9 = r5
            goto L_0x00e8
        L_0x00e7:
            r9 = r6
        L_0x00e8:
            java.lang.Object r10 = r14.D()
            if (r9 != 0) goto L_0x00f4
            java.lang.Object r9 = r3.a()
            if (r10 != r9) goto L_0x00fc
        L_0x00f4:
            nf.b r10 = new nf.b
            r10.<init>(r0, r12)
            r14.u(r10)
        L_0x00fc:
            nI.a r10 = (nI.C17631a) r10
            r14.P()
            SC.W1 r9 = new SC.W1
            r9.<init>(r8, r10)
            r8 = 52927886(0x3279d8e, float:4.9257753E-37)
            r14.W(r8)
            if (r1 != r4) goto L_0x010f
            r6 = r5
        L_0x010f:
            java.lang.Object r1 = r14.D()
            if (r6 != 0) goto L_0x011b
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x0123
        L_0x011b:
            nf.c r1 = new nf.c
            r1.<init>(r0, r12)
            r14.u(r1)
        L_0x0123:
            r3 = r1
            nI.a r3 = (nI.C17631a) r3
            r14.P()
            nf.v$a r0 = new nf.v$a
            r0.<init>(r7)
            r1 = 54
            r4 = 31552428(0x1e173ac, float:8.281793E-38)
            c1.a r6 = c1.c.e(r4, r5, r0, r14, r1)
            int r0 = SC.W1.f116045c
            int r0 = r0 << 3
            r1 = 196608(0x30000, float:2.75506E-40)
            r8 = r0 | r1
            r0 = 24
            r4 = 0
            r5 = 0
            r1 = r2
            r2 = r9
            r7 = r14
            r9 = r0
            SC.Z1.d(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x014a:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0153
            U0.C4895p.R()
        L_0x0153:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x0161
            nf.d r0 = new nf.d
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.v.R(rf.b$a, nI.a, java.lang.String, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N S(C4899r0 r0Var, C17631a aVar) {
        r0Var.setValue(Boolean.FALSE);
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T(C4899r0 r0Var, C17631a aVar) {
        r0Var.setValue(Boolean.FALSE);
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(b.a aVar, C17631a aVar2, String str, int i10, C4889m mVar, int i11) {
        R(aVar, aVar2, str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void V(java.lang.String r43, boolean r44, nI.C17642l<? super java.lang.String, XH.C16807N> r45, U0.C4889m r46, int r47) {
        /*
            r0 = r43
            r1 = r44
            r2 = r45
            r3 = r47
            r4 = -78991157(0xfffffffffb4ab0cb, float:-1.05242975E36)
            r5 = r46
            U0.m r12 = r5.k(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x0020
            boolean r5 = r12.V(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 48
            if (r6 != 0) goto L_0x0031
            boolean r6 = r12.b(r1)
            if (r6 == 0) goto L_0x002e
            r6 = 32
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r5 = r5 | r6
        L_0x0031:
            r6 = r3 & 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r12.F(r2)
            if (r6 == 0) goto L_0x003f
            r6 = r7
            goto L_0x0041
        L_0x003f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x0056
            boolean r6 = r12.l()
            if (r6 != 0) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            r12.L()
            r23 = r12
            goto L_0x0158
        L_0x0056:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0062
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.app.backinstocknotifications.compose.InputFieldSection (BackInStockNotificationsSections.kt:308)"
            U0.C4895p.S(r4, r5, r6, r8)
        L_0x0062:
            U0.I0 r4 = androidx.compose.ui.platform.C5100f0.f()
            java.lang.Object r4 = r12.Q(r4)
            n1.f r4 = (n1.C5626f) r4
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r8 = 0
            r9 = 1
            r10 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r6, r8, r9, r10)
            java.lang.String r8 = "InputField"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r6, r8)
            if (r0 != 0) goto L_0x0082
            java.lang.String r6 = ""
            r17 = r6
            goto L_0x0084
        L_0x0082:
            r17 = r0
        L_0x0084:
            if (r1 == 0) goto L_0x008b
            SC.G r6 = SC.G.ERROR
        L_0x0088:
            r18 = r6
            goto L_0x008e
        L_0x008b:
            SC.G r6 = SC.G.DEFAULT
            goto L_0x0088
        L_0x008e:
            r6 = 1069840694(0x3fc47936, float:1.5349491)
            r12.W(r6)
            r6 = 0
            if (r1 == 0) goto L_0x00a0
            int r8 = mf.C10040b.f75371n
            java.lang.String r8 = J1.j.b(r8, r12, r6)
            r19 = r8
            goto L_0x00a2
        L_0x00a0:
            r19 = r10
        L_0x00a2:
            r12.P()
            int r8 = mf.C10040b.f75370m
            java.lang.String r23 = J1.j.b(r8, r12, r6)
            r8 = 1069853825(0x3fc4ac81, float:1.5365144)
            r12.W(r8)
            boolean r8 = r12.F(r4)
            java.lang.Object r10 = r12.D()
            if (r8 != 0) goto L_0x00c3
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x00cb
        L_0x00c3:
            nf.f r10 = new nf.f
            r10.<init>(r4)
            r12.u(r10)
        L_0x00cb:
            r25 = r10
            nI.l r25 = (nI.C17642l) r25
            r12.P()
            B0.z r4 = new B0.z
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 62
            r32 = 0
            r24 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)
            B0.A r24 = new B0.A
            T1.y$a r8 = T1.C4855y.f13650b
            int r36 = r8.c()
            T1.r$a r8 = T1.r.f13620b
            int r37 = r8.b()
            r41 = 115(0x73, float:1.61E-43)
            r42 = 0
            r34 = 0
            r35 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r33 = r24
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r8 = 1069833805(0x3fc45e4d, float:1.5341278)
            r12.W(r8)
            r5 = r5 & 896(0x380, float:1.256E-42)
            if (r5 != r7) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r9 = r6
        L_0x0114:
            java.lang.Object r5 = r12.D()
            if (r9 != 0) goto L_0x0122
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x012a
        L_0x0122:
            nf.g r5 = new nf.g
            r5.<init>(r2)
            r12.u(r5)
        L_0x012a:
            r6 = r5
            nI.l r6 = (nI.C17642l) r6
            r12.P()
            r21 = 48
            r22 = 1888(0x760, float:2.646E-42)
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r20 = 27648(0x6c00, float:3.8743E-41)
            r5 = r17
            r7 = r23
            r9 = r16
            r23 = r12
            r12 = r19
            r16 = r24
            r17 = r4
            r19 = r23
            SC.V0.f(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0158
            U0.C4895p.R()
        L_0x0158:
            U0.Y0 r4 = r23.n()
            if (r4 == 0) goto L_0x0166
            nf.h r5 = new nf.h
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.v.V(java.lang.String, boolean, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N W(C5626f fVar, C4380y yVar) {
        C17542s.j(yVar, "$this$KeyboardActions");
        C5626f.q(fVar, false, 1, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X(C17642l lVar, String str) {
        C17542s.j(str, "it");
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(String str, boolean z10, C17642l lVar, int i10, C4889m mVar, int i11) {
        V(str, z10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void Z(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(393878915);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(393878915, i11, -1, "com.ingka.ikea.app.backinstocknotifications.compose.NotNowButton (BackInStockNotificationsSections.kt:439)");
            }
            d h10 = J.h(d.f18749a, 0.0f, 1, (Object) null);
            C18029u uVar = C18029u.f147649a;
            L.b(J1.j.b(Oo.b.f84522U4, k10, 0), D.h(h10, D.e(uVar.a(), 0.0f, uVar.a(), h.B((float) 8), 2, (Object) null)), false, N.Tertiary, M.Medium, false, (Integer) null, (K0) null, (r0.m) null, aVar, k10, ((i11 << 27) & 1879048192) | 27648, 484);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new m(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(C17631a aVar, int i10, C4889m mVar, int i11) {
        Z(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void b0(boolean z10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z11 = z10;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1487364963);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1487364963, i11, -1, "com.ingka.ikea.app.backinstocknotifications.compose.NotifyMeButton (BackInStockNotificationsSections.kt:458)");
            }
            d h10 = J.h(d.f18749a, 0.0f, 1, (Object) null);
            C18029u uVar = C18029u.f147649a;
            mVar2 = k10;
            L.b(J1.j.b(Oo.b.f84388H0, k10, 0), D.h(h10, D.e(uVar.a(), 0.0f, uVar.a(), h.B((float) 16), 2, (Object) null)), false, N.Primary, M.Medium, z10, (Integer) null, (K0) null, (r0.m) null, aVar, k10, ((i11 << 15) & ImageMetadata.JPEG_GPS_COORDINATES) | 27648 | ((i11 << 24) & 1879048192), 452);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new i(z11, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(boolean z10, C17631a aVar, int i10, C4889m mVar, int i11) {
        b0(z10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void d0(lm.C11550a.c r33, nI.C17631a<XH.C16807N> r34, U0.C4889m r35, int r36) {
        /*
            r0 = r33
            r1 = r34
            r2 = r36
            r3 = 1833057704(0x6d423da8, float:3.7571644E27)
            r4 = r35
            U0.m r14 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x001e
            boolean r4 = r14.F(r0)
            if (r4 == 0) goto L_0x001b
            r4 = 4
            goto L_0x001c
        L_0x001b:
            r4 = 2
        L_0x001c:
            r4 = r4 | r2
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            r5 = r2 & 48
            r6 = 32
            if (r5 != 0) goto L_0x0030
            boolean r5 = r14.F(r1)
            if (r5 == 0) goto L_0x002d
            r5 = r6
            goto L_0x002f
        L_0x002d:
            r5 = 16
        L_0x002f:
            r4 = r4 | r5
        L_0x0030:
            r5 = r4 & 19
            r7 = 18
            if (r5 != r7) goto L_0x0043
            boolean r5 = r14.l()
            if (r5 != 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            r14.L()
            r3 = r14
            goto L_0x0246
        L_0x0043:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x004f
            r5 = -1
            java.lang.String r7 = "com.ingka.ikea.app.backinstocknotifications.compose.TitleSection (BackInStockNotificationsSections.kt:350)"
            U0.C4895p.S(r3, r4, r5, r7)
        L_0x004f:
            boolean r3 = r0 instanceof lm.C11550a.c.C2255a
            r5 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0066
            boolean r8 = r0 instanceof lm.C11550a.c.b
            if (r8 == 0) goto L_0x005a
            goto L_0x0066
        L_0x005a:
            boolean r8 = r0 instanceof lm.C11550a.c.C2258c
            if (r8 == 0) goto L_0x0060
            r8 = r7
            goto L_0x0067
        L_0x0060:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0066:
            r8 = r5
        L_0x0067:
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r10 = 3
            r11 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.E(r9, r11, r7, r10, r11)
            r11 = 48
            float r11 = (float) r11
            float r12 = c2.h.B(r11)
            float r11 = c2.h.B(r11)
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.J.a(r10, r12, r11)
            r10 = -2031432011(0xffffffff86eaceb5, float:-8.8324746E-35)
            r14.W(r10)
            boolean r10 = r14.b(r8)
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r6) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r5 = r7
        L_0x008e:
            r4 = r10 | r5
            java.lang.Object r5 = r14.D()
            if (r4 != 0) goto L_0x009e
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00a6
        L_0x009e:
            nf.j r5 = new nf.j
            r5.<init>(r8, r1)
            r14.u(r5)
        L_0x00a6:
            r19 = r5
            nI.a r19 = (nI.C17631a) r19
            r14.P()
            r20 = 7
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r15, r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r5 = r5.f()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$c r8 = r6.l()
            E1.I r5 = androidx.compose.foundation.layout.G.b(r5, r8, r14, r7)
            int r8 = U0.C4883j.a(r14, r7)
            U0.y r10 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r14.m()
            if (r13 != 0) goto L_0x00e6
            U0.C4883j.c()
        L_0x00e6:
            r14.I()
            boolean r13 = r14.i()
            if (r13 == 0) goto L_0x00f3
            r14.p(r12)
            goto L_0x00f6
        L_0x00f3:
            r14.t()
        L_0x00f6:
            U0.m r12 = U0.F1.a(r14)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r5, r13)
            nI.p r5 = r11.e()
            U0.F1.c(r12, r10, r5)
            nI.p r5 = r11.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x0120
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x012e
        L_0x0120:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r12.u(r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.w(r8, r5)
        L_0x012e:
            nI.p r5 = r11.d()
            U0.F1.c(r12, r4, r5)
            s0.N r5 = s0.C5843N.f28726a
            if (r3 == 0) goto L_0x0141
            r4 = r0
            lm.a$c$a r4 = (lm.C11550a.c.C2255a) r4
            java.lang.String r4 = r4.c()
            goto L_0x0158
        L_0x0141:
            boolean r4 = r0 instanceof lm.C11550a.c.b
            if (r4 == 0) goto L_0x014d
            r4 = r0
            lm.a$c$b r4 = (lm.C11550a.c.b) r4
            java.lang.String r4 = r4.c()
            goto L_0x0158
        L_0x014d:
            boolean r4 = r0 instanceof lm.C11550a.c.C2258c
            if (r4 == 0) goto L_0x0255
            r4 = r0
            lm.a$c$c r4 = (lm.C11550a.c.C2258c) r4
            java.lang.String r4 = r4.c()
        L_0x0158:
            if (r3 != 0) goto L_0x015e
            boolean r3 = r0 instanceof lm.C11550a.c.b
            if (r3 == 0) goto L_0x0160
        L_0x015e:
            r3 = r14
            goto L_0x01c2
        L_0x0160:
            boolean r3 = r0 instanceof lm.C11550a.c.C2258c
            if (r3 == 0) goto L_0x01b2
            r3 = 416505718(0x18d35f76, float:5.4638613E-24)
            r14.W(r3)
            i1.c$c r3 = r6.i()
            androidx.compose.ui.d r6 = r5.c(r9, r3)
            int r3 = mf.C10040b.f75380w
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = J1.j.c(r3, r4, r14, r7)
            TC.b$b$a r5 = TC.C13679b.C2857b.a.f116683a
            S1.C$a r3 = S1.C.f13316b
            S1.C r12 = r3.a()
            r28 = 0
            r29 = 262072(0x3ffb8, float:3.67241E-40)
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r3 = r14
            r14 = r15
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 1572912(0x180030, float:2.204119E-39)
            r26 = r3
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.P()
            goto L_0x023a
        L_0x01b2:
            r3 = r14
            r0 = -263688188(0xfffffffff0487004, float:-2.4812968E29)
            r3.W(r0)
            r3.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x01c2:
            r8 = 415716303(0x18c753cf, float:5.152492E-24)
            r3.W(r8)
            int r8 = mf.C10040b.f75379v
            java.lang.Object[] r10 = new java.lang.Object[]{r4}
            java.lang.String r7 = J1.j.c(r8, r10, r3, r7)
            N1.G r8 = new N1.G
            r10 = r8
            Y1.k$a r11 = Y1.k.f14792b
            Y1.k r27 = r11.d()
            r31 = 61439(0xefff, float:8.6094E-41)
            r32 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r10.<init>(r11, r13, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32)
            N1.d r4 = IC.C13021c.e(r7, r4, r8)
            i1.c$c r6 = r6.i()
            androidx.compose.ui.d r6 = r5.c(r9, r6)
            TC.b$b$a r5 = TC.C13679b.C2857b.a.f116683a
            S1.C$a r7 = S1.C.f13316b
            S1.C r12 = r7.a()
            r29 = 0
            r30 = 524216(0x7ffb8, float:7.34583E-40)
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 1572912(0x180030, float:2.204119E-39)
            r27 = r3
            SC.C13607l.h(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3.P()
        L_0x023a:
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0246
            U0.C4895p.R()
        L_0x0246:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x0254
            nf.k r4 = new nf.k
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0254:
            return
        L_0x0255:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.v.d0(lm.a$c, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(boolean z10, C17631a aVar) {
        if (z10) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(C11550a.c cVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        d0(cVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(rf.b r23, lm.C11550a.c r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, pf.C10138a r28, U0.C4889m r29, int r30) {
        /*
            r6 = r23
            r15 = r24
            r14 = r25
            r13 = r26
            r12 = r27
            r11 = r28
            r10 = r30
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "fulfilmentOption"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "productTitle"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "itemNo"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "itemType"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "actions"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -350133440(0xffffffffeb216340, float:-1.9510575E26)
            r1 = r29
            U0.m r9 = r1.k(r0)
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0044
            boolean r1 = r9.F(r6)
            if (r1 == 0) goto L_0x0041
            r1 = 4
            goto L_0x0042
        L_0x0041:
            r1 = 2
        L_0x0042:
            r1 = r1 | r10
            goto L_0x0045
        L_0x0044:
            r1 = r10
        L_0x0045:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x0055
            boolean r2 = r9.F(r15)
            if (r2 == 0) goto L_0x0052
            r2 = 32
            goto L_0x0054
        L_0x0052:
            r2 = 16
        L_0x0054:
            r1 = r1 | r2
        L_0x0055:
            r2 = r10 & 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0066
            boolean r2 = r9.V(r14)
            if (r2 == 0) goto L_0x0063
            r2 = r3
            goto L_0x0065
        L_0x0063:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            r4 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x0077
            boolean r2 = r9.V(r13)
            if (r2 == 0) goto L_0x0074
            r2 = r4
            goto L_0x0076
        L_0x0074:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r1 = r1 | r2
        L_0x0077:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x0088
            boolean r2 = r9.V(r12)
            if (r2 == 0) goto L_0x0085
            r2 = r5
            goto L_0x0087
        L_0x0085:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0087:
            r1 = r1 | r2
        L_0x0088:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r10
            if (r2 != 0) goto L_0x0099
            boolean r2 = r9.V(r11)
            if (r2 == 0) goto L_0x0096
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0098
        L_0x0096:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x0098:
            r1 = r1 | r2
        L_0x0099:
            r7 = r1
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r7
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x00b0
            boolean r1 = r9.l()
            if (r1 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            r9.L()
            r3 = r9
            goto L_0x0188
        L_0x00b0:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00bc
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.backinstocknotifications.compose.BackInStockNotificationsContent (BackInStockNotificationsSections.kt:80)"
            U0.C4895p.S(r0, r7, r1, r2)
        L_0x00bc:
            TJ.P r16 = r23.m()
            r21 = 0
            r22 = 7
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = r9
            U0.A1 r0 = j3.a.c(r16, r17, r18, r19, r20, r21, r22)
            androidx.lifecycle.F r1 = r23.E()
            r2 = 0
            U0.A1 r1 = d1.b.a(r1, r9, r2)
            rf.b$a r8 = w(r0)
            kD.h r0 = x(r1)
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = r0.b()
        L_0x00e7:
            r16 = r0
            goto L_0x00ec
        L_0x00ea:
            r0 = 0
            goto L_0x00e7
        L_0x00ec:
            r0 = -1180386287(0xffffffffb9a4bc11, float:-3.1420638E-4)
            r9.W(r0)
            boolean r0 = r9.F(r6)
            boolean r1 = r9.F(r15)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r17 = 1
            if (r1 != r4) goto L_0x0104
            r1 = r17
            goto L_0x0105
        L_0x0104:
            r1 = r2
        L_0x0105:
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r7
            if (r1 != r5) goto L_0x010f
            r1 = r17
            goto L_0x0110
        L_0x010f:
            r1 = r2
        L_0x0110:
            r0 = r0 | r1
            r1 = r7 & 896(0x380, float:1.256E-42)
            if (r1 != r3) goto L_0x0117
            r2 = r17
        L_0x0117:
            r0 = r0 | r2
            java.lang.Object r1 = r9.D()
            if (r0 != 0) goto L_0x0126
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x013b
        L_0x0126:
            nf.a r5 = new nf.a
            r0 = r5
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r27
            r10 = r5
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r9.u(r10)
            r1 = r10
        L_0x013b:
            r0 = r1
            nI.l r0 = (nI.C17642l) r0
            r9.P()
            r1 = -1180376131(0xffffffffb9a4e3bd, float:-3.1450196E-4)
            r9.W(r1)
            boolean r1 = r9.F(r6)
            java.lang.Object r2 = r9.D()
            if (r1 != 0) goto L_0x0159
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0161
        L_0x0159:
            nf.l r2 = new nf.l
            r2.<init>(r6)
            r9.u(r2)
        L_0x0161:
            r1 = r2
            nI.a r1 = (nI.C17631a) r1
            r9.P()
            int r2 = r7 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            int r3 = r7 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r7 = r8
            r8 = r16
            r3 = r9
            r9 = r24
            r10 = r28
            r11 = r0
            r12 = r1
            r13 = r3
            r14 = r2
            B(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0188
            U0.C4895p.R()
        L_0x0188:
            U0.Y0 r8 = r3.n()
            if (r8 == 0) goto L_0x01a5
            nf.n r9 = new nf.n
            r0 = r9
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.v.v(rf.b, lm.a$c, java.lang.String, java.lang.String, java.lang.String, pf.a, U0.m, int):void");
    }

    private static final b.a w(A1<? extends b.a> a12) {
        return (b.a) a12.getValue();
    }

    private static final kD.h x(A1<kD.h> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N y(b bVar, C11550a.c cVar, String str, String str2, String str3, C11550a.C2253a aVar) {
        C17542s.j(aVar, "contactType");
        bVar.H(cVar, aVar, str, str2, str3);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(b bVar) {
        bVar.G();
        return C16807N.f139792a;
    }
}
