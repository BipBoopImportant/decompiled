package Iu;

import Au.c;
import Dh.C9064b;
import Dh.C9065c;
import Dh.D;
import Dh.m;
import Hu.a;
import IC.C13023e;
import IC.C13026h;
import Oo.b;
import SC.N;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LHu/a$a;", "state", "Lkotlin/Function0;", "LXH/N;", "onCloseClick", "onFinishedClick", "e", "(LHu/a$a;LnI/a;LnI/a;LU0/m;I)V", "g", "", "imageUrl", "", "LDh/D;", "j", "(Ljava/lang/String;LnI/a;)Ljava/util/List;", "wayfinding-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f82487a;

        a(String str) {
            this.f82487a = str;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1475909742, i10, -1, "com.ingka.ikea.instore.wayfinding.impl.onboarding.ui.buildStaticOnboardingPages.<anonymous>.<anonymous> (OnboardingContent.kt:83)");
                }
                C13023e a10 = C13026h.a(c.f79155a);
                C13023e a11 = C13026h.a(c.f79157c);
                C13023e a12 = C13026h.a(c.f79156b);
                String str = this.f82487a;
                q<String, C4889m, Integer, C16807N> a13 = a.f82472a.a();
                int i11 = C13023e.f110931a;
                m.l(a10, a11, a12, str, (d) null, a13, mVar, 196608 | i11 | (i11 << 3) | (i11 << 6), 16);
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

    public static final void e(a.C1600a aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "state");
        C17542s.j(aVar2, "onCloseClick");
        C17542s.j(aVar3, "onFinishedClick");
        C4889m k10 = mVar.k(391063429);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar3) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(391063429, i11, -1, "com.ingka.ikea.instore.wayfinding.impl.onboarding.ui.OnboardingContent (OnboardingContent.kt:36)");
            }
            g(aVar, aVar2, aVar3, k10, i11 & 1022);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new d(aVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(a.C1600a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        e(aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void g(Hu.a.C1600a r20, nI.C17631a<XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, U0.C4889m r23, int r24) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            r4 = -1390025671(0xffffffffad25e439, float:-9.42984E-12)
            r5 = r23
            U0.m r15 = r5.k(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.F(r0)
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
            r7 = 32
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x002f
            r6 = r7
            goto L_0x0031
        L_0x002f:
            r6 = 16
        L_0x0031:
            r5 = r5 | r6
        L_0x0032:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r15.F(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0041
        L_0x003f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x0054
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x004f
            goto L_0x0054
        L_0x004f:
            r15.L()
            goto L_0x00d9
        L_0x0054:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0060
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.instore.wayfinding.impl.onboarding.ui.OnboardingContentUi (OnboardingContent.kt:49)"
            U0.C4895p.S(r4, r5, r6, r8)
        L_0x0060:
            com.ingka.ikea.core.model.Media$Image r4 = r20.a()
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = r4.getUrl()
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            java.util.List r4 = j(r4, r2)
            r14 = 0
            float r6 = (float) r14
            float r8 = c2.h.B(r6)
            r12 = 14
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            s0.T r8 = s0.C5850V.c(r8, r9, r10, r11, r12, r13)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            KJ.c r4 = KJ.C15985a.h(r4)
            r6 = -29848183(0xfffffffffe388d89, float:-6.132821E37)
            r15.W(r6)
            r13 = r5 & 112(0x70, float:1.57E-43)
            r12 = 1
            if (r13 != r7) goto L_0x0093
            r5 = r12
            goto L_0x0094
        L_0x0093:
            r5 = r14
        L_0x0094:
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x00a2
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00aa
        L_0x00a2:
            Iu.e r6 = new Iu.e
            r6.<init>(r1)
            r15.u(r6)
        L_0x00aa:
            r11 = r6
            nI.l r11 = (nI.C17642l) r11
            r15.P()
            int r16 = Dh.D.f59167e
            r17 = 58
            r6 = 0
            r9 = 0
            r10 = 0
            r18 = 0
            r5 = r4
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r18
            r4 = r12
            r12 = r15
            r19 = r13
            r13 = r16
            r0 = r14
            r14 = r17
            Dh.x.q(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5 = r19
            e.C5281d.a(r0, r1, r15, r5, r4)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00d9
            U0.C4895p.R()
        L_0x00d9:
            U0.Y0 r0 = r15.n()
            if (r0 == 0) goto L_0x00e9
            Iu.f r4 = new Iu.f
            r5 = r20
            r4.<init>(r5, r1, r2, r3)
            r0.a(r4)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Iu.h.g(Hu.a$a, nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17631a aVar, C9065c cVar) {
        C17542s.j(cVar, "action");
        if (C17542s.e(cVar, C9065c.a.f59177a)) {
            aVar.invoke();
        } else if (!C17542s.e(cVar, C9065c.b.f59178a)) {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(a.C1600a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        g(aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final List<D> j(String str, C17631a<C16807N> aVar) {
        List c10 = C16877v.c();
        c10.add(new D(0, C16877v.e(new C9064b(N.Secondary, C13026h.a(b.f84703l4), false, new g(aVar), 4, (DefaultConstructorMarker) null)), (C17631a) null, c1.c.c(1475909742, true, new a(str)), 5, (DefaultConstructorMarker) null));
        return C16877v.a(c10);
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17631a aVar, int i10) {
        aVar.invoke();
        return C16807N.f139792a;
    }
}
