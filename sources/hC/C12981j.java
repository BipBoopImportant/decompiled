package HC;

import E1.I;
import G1.C4504g;
import KJ.C15987c;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.draw.b;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.KeyBenefit;
import gs.e;
import i1.C5437c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.i;
import nI.C17631a;
import nI.p;
import nI.q;
import o1.C5668h;
import o1.C5673m;
import p1.C5749w0;
import p1.V0;
import r1.C5817c;
import r1.f;
import s0.C5842M;
import s0.C5843N;
import s0.C5859e;
import s0.C5862h;
import tI.C17978n;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a1\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aK\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "title", "LKJ/c;", "Lcom/ingka/ikea/core/model/KeyBenefit;", "keyBenefitsList", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "i", "(Ljava/lang/String;LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "keyBenefit", "", "drawTopBorder", "drawLeftBorder", "f", "(Lcom/ingka/ikea/core/model/KeyBenefit;Landroidx/compose/ui/d;ZZLU0/m;II)V", "Lc2/h;", "borderWidth", "Lp1/v0;", "color", "drawTop", "drawBottom", "drawLeft", "drawRight", "k", "(Landroidx/compose/ui/d;FJZZZZ)Landroidx/compose/ui/d;", "commercial_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: HC.j  reason: case insensitive filesystem */
public final class C12981j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HC.j$a */
    static final class a implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<KeyBenefit> f110627a;

        a(C15987c<KeyBenefit> cVar) {
            this.f110627a = cVar;
        }

        public final void a(C5859e eVar, C4889m mVar, int i10) {
            int i11;
            C5859e eVar2 = eVar;
            C4889m mVar2 = mVar;
            C17542s.j(eVar2, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(eVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1005955551, i11, -1, "com.ingka.ikea.ui.commercial.KeyBenefitsGrid.<anonymous>.<anonymous> (KeyBenefitsGridComposables.kt:95)");
                }
                int e10 = C17978n.e((int) (eVar.c() / h.B((float) 156)), 1);
                C15987c<KeyBenefit> cVar = this.f110627a;
                ArrayList arrayList = new ArrayList(e10);
                for (int i12 = 0; i12 < e10; i12++) {
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    for (T next : cVar) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C16877v.x();
                        }
                        KeyBenefit keyBenefit = (KeyBenefit) next;
                        if (i13 % e10 == i12) {
                            arrayList2.add(next);
                        }
                        i13 = i14;
                    }
                    arrayList.add(arrayList2);
                }
                d h10 = J.h(d.f18749a, 0.0f, 1, (Object) null);
                I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), mVar2, 0);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e11 = c.e(mVar2, h10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, b10, aVar.c());
                F1.c(a12, s10, aVar.e());
                p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e11, aVar.d());
                C5843N n10 = C5843N.f28726a;
                mVar2.W(473721438);
                int i15 = 0;
                for (Object next2 : arrayList) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C16877v.x();
                    }
                    List list = (List) next2;
                    d a13 = C5116k1.a(J.d(C5842M.e(n10, d.f18749a, 1.0f, false, 2, (Object) null), 0.0f, 1, (Object) null), "KeyBenefitsColumn");
                    I a14 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                    int a15 = C4883j.a(mVar2, 0);
                    C4912y s11 = mVar.s();
                    d e12 = c.e(mVar2, a13);
                    C4504g.a aVar2 = C4504g.f6515W;
                    C17631a<C4504g> a16 = aVar2.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar2.p(a16);
                    } else {
                        mVar.t();
                    }
                    C4889m a17 = F1.a(mVar);
                    F1.c(a17, a14, aVar2.c());
                    F1.c(a17, s11, aVar2.e());
                    p<C4504g, Integer, C16807N> b12 = aVar2.b();
                    if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                        a17.u(Integer.valueOf(a15));
                        a17.w(Integer.valueOf(a15), b12);
                    }
                    F1.c(a17, e12, aVar2.d());
                    C5862h hVar = C5862h.f28810a;
                    mVar2.W(177285802);
                    int i17 = 0;
                    for (Object next3 : list) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            C16877v.x();
                        }
                        C12981j.f((KeyBenefit) next3, J.h(d.f18749a, 0.0f, 1, (Object) null), i17 == 0, i15 == 0, mVar, 48, 0);
                        i17 = i18;
                    }
                    mVar.P();
                    mVar.x();
                    i15 = i16;
                }
                mVar.P();
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(com.ingka.ikea.core.model.KeyBenefit r33, androidx.compose.ui.d r34, boolean r35, boolean r36, U0.C4889m r37, int r38, int r39) {
        /*
            r1 = r33
            r5 = r38
            r0 = 8
            r2 = 4
            r3 = 48
            r4 = 6
            java.lang.String r6 = "keyBenefit"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            r6 = -144632446(0xfffffffff7611582, float:-4.5652462E33)
            r7 = r37
            U0.m r15 = r7.k(r6)
            r7 = 1
            r8 = r39 & 1
            r9 = 2
            if (r8 == 0) goto L_0x0021
            r8 = r5 | 6
            goto L_0x0031
        L_0x0021:
            r8 = r5 & 6
            if (r8 != 0) goto L_0x0030
            boolean r8 = r15.F(r1)
            if (r8 == 0) goto L_0x002d
            r8 = r2
            goto L_0x002e
        L_0x002d:
            r8 = r9
        L_0x002e:
            r8 = r8 | r5
            goto L_0x0031
        L_0x0030:
            r8 = r5
        L_0x0031:
            r10 = r39 & 2
            r11 = 16
            if (r10 == 0) goto L_0x003b
            r8 = r8 | r3
        L_0x0038:
            r12 = r34
            goto L_0x004c
        L_0x003b:
            r12 = r5 & 48
            if (r12 != 0) goto L_0x0038
            r12 = r34
            boolean r13 = r15.V(r12)
            if (r13 == 0) goto L_0x004a
            r13 = 32
            goto L_0x004b
        L_0x004a:
            r13 = r11
        L_0x004b:
            r8 = r8 | r13
        L_0x004c:
            r2 = r39 & 4
            if (r2 == 0) goto L_0x0055
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r13 = r35
            goto L_0x0067
        L_0x0055:
            r13 = r5 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x0052
            r13 = r35
            boolean r14 = r15.b(r13)
            if (r14 == 0) goto L_0x0064
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r14 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r8 = r8 | r14
        L_0x0067:
            r14 = r39 & 8
            if (r14 == 0) goto L_0x0070
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r4 = r36
            goto L_0x0083
        L_0x0070:
            r4 = r5 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x006d
            r4 = r36
            boolean r16 = r15.b(r4)
            if (r16 == 0) goto L_0x007f
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r8 = r8 | r16
        L_0x0083:
            r0 = r8 & 1171(0x493, float:1.641E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r0 != r3) goto L_0x0098
            boolean r0 = r15.l()
            if (r0 != 0) goto L_0x0090
            goto L_0x0098
        L_0x0090:
            r15.L()
            r2 = r12
            r3 = r13
            r6 = r15
            goto L_0x0254
        L_0x0098:
            if (r10 == 0) goto L_0x009d
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x009e
        L_0x009d:
            r0 = r12
        L_0x009e:
            r3 = 0
            if (r2 == 0) goto L_0x00a3
            r2 = r3
            goto L_0x00a4
        L_0x00a3:
            r2 = r13
        L_0x00a4:
            if (r14 == 0) goto L_0x00a7
            r4 = r3
        L_0x00a7:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00b3
            r10 = -1
            java.lang.String r12 = "com.ingka.ikea.ui.commercial.KeyBenefitItem (KeyBenefitsGridComposables.kt:130)"
            U0.C4895p.S(r6, r8, r10, r12)
        L_0x00b3:
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$c r6 = r6.i()
            r8 = 156(0x9c, float:2.19E-43)
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            r10 = 80
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.a(r0, r8, r10)
            r10 = 0
            r12 = 0
            androidx.compose.ui.d r24 = androidx.compose.foundation.layout.J.h(r8, r10, r7, r12)
            float r7 = (float) r7
            float r25 = c2.h.B(r7)
            int r7 = tK.C18010a.f147421e
            long r26 = J1.b.a(r7, r15, r3)
            r29 = 1
            r31 = 1
            r28 = r2
            r30 = r4
            androidx.compose.ui.d r7 = k(r24, r25, r26, r28, r29, r30, r31)
            float r8 = (float) r11
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.k(r7, r8, r10, r9, r12)
            java.lang.String r8 = "KeyBenefitItem"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r7, r8)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r8 = r8.f()
            r9 = 48
            E1.I r6 = androidx.compose.foundation.layout.G.b(r8, r6, r15, r9)
            int r8 = U0.C4883j.a(r15, r3)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r7)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x011e
            U0.C4883j.c()
        L_0x011e:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x012b
            r15.p(r11)
            goto L_0x012e
        L_0x012b:
            r15.t()
        L_0x012e:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r6, r12)
            nI.p r6 = r10.e()
            U0.F1.c(r11, r9, r6)
            nI.p r6 = r10.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x0158
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x0166
        L_0x0158:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.w(r8, r6)
        L_0x0166:
            nI.p r6 = r10.d()
            U0.F1.c(r11, r7, r6)
            s0.N r6 = s0.C5843N.f28726a
            com.ingka.ikea.core.model.Image r6 = r33.a()
            r7 = -1924238815(0xffffffff8d4e7221, float:-6.361603E-31)
            r15.W(r7)
            if (r6 != 0) goto L_0x017e
            r6 = r15
            goto L_0x0205
        L_0x017e:
            r7 = 1796961111(0x6b1b7357, float:1.8792818E26)
            r15.W(r7)
            boolean r7 = r15.F(r6)
            java.lang.Object r8 = r15.D()
            if (r7 != 0) goto L_0x0196
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x019e
        L_0x0196:
            HC.f r8 = new HC.f
            r8.<init>(r6)
            r15.u(r8)
        L_0x019e:
            nI.l r8 = (nI.C17642l) r8
            r15.P()
            gs.e r7 = gs.f.a(r8, r15, r3)
            java.lang.String r8 = r6.A0()
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r6 = 24
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.t(r3, r6)
            java.lang.String r9 = "KeyBenefitIcon"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r6, r9)
            p1.w0$a r16 = p1.C5749w0.f27365b
            tK.v r6 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r15, r10)
            long r17 = r6.G0()
            r20 = 2
            r21 = 0
            r19 = 0
            p1.w0 r16 = p1.C5749w0.a.b(r16, r17, r19, r20, r21)
            int r6 = gs.e.f97946h
            r6 = r6 | 384(0x180, float:5.38E-43)
            r20 = 0
            r21 = 1528(0x5f8, float:2.141E-42)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r34 = r15
            r15 = r17
            r17 = r18
            r18 = r34
            r19 = r6
            gs.C11352b.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r6 = 8
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.y(r3, r6)
            r6 = r34
            r7 = 6
            s0.C5844O.a(r3, r6, r7)
        L_0x0205:
            r6.P()
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            java.lang.String r7 = "KeyBenefitText"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r3, r7)
            java.lang.String r7 = r33.b()
            TC.b$a$c r8 = TC.C13679b.a.c.f116681a
            Y1.j$a r3 = Y1.j.f14783b
            int r3 = r3.f()
            Y1.j r20 = Y1.j.h(r3)
            r31 = 0
            r32 = 261112(0x3fbf8, float:3.65896E-40)
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 432(0x1b0, float:6.05E-43)
            r29 = r6
            SC.C13607l.j(r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r6.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0252
            U0.C4895p.R()
        L_0x0252:
            r3 = r2
            r2 = r0
        L_0x0254:
            U0.Y0 r7 = r6.n()
            if (r7 == 0) goto L_0x0269
            HC.g r8 = new HC.g
            r0 = r8
            r1 = r33
            r5 = r38
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: HC.C12981j.f(com.ingka.ikea.core.model.KeyBenefit, androidx.compose.ui.d, boolean, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Image image, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(image.getUrl());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(KeyBenefit keyBenefit, d dVar, boolean z10, boolean z11, int i10, int i11, C4889m mVar, int i12) {
        f(keyBenefit, dVar, z10, z11, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(java.lang.String r28, KJ.C15987c<com.ingka.ikea.core.model.KeyBenefit> r29, androidx.compose.ui.d r30, U0.C4889m r31, int r32, int r33) {
        /*
            r0 = r28
            r15 = r29
            r14 = r32
            r1 = 2
            r2 = 4
            java.lang.String r3 = "keyBenefitsList"
            kotlin.jvm.internal.C17542s.j(r15, r3)
            r3 = 1176299117(0x461ce66d, float:10041.606)
            r4 = r31
            U0.m r13 = r4.k(r3)
            r12 = 1
            r4 = r33 & 1
            if (r4 == 0) goto L_0x001e
            r4 = r14 | 6
            goto L_0x002e
        L_0x001e:
            r4 = r14 & 6
            if (r4 != 0) goto L_0x002d
            boolean r4 = r13.V(r0)
            if (r4 == 0) goto L_0x002a
            r4 = r2
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r4 = r4 | r14
            goto L_0x002e
        L_0x002d:
            r4 = r14
        L_0x002e:
            r1 = r33 & 2
            r5 = 16
            if (r1 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x0046
        L_0x0037:
            r1 = r14 & 48
            if (r1 != 0) goto L_0x0046
            boolean r1 = r13.F(r15)
            if (r1 == 0) goto L_0x0044
            r1 = 32
            goto L_0x0045
        L_0x0044:
            r1 = r5
        L_0x0045:
            r4 = r4 | r1
        L_0x0046:
            r1 = r33 & 4
            if (r1 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r2 = r30
            goto L_0x0061
        L_0x004f:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r30
            boolean r6 = r13.V(r2)
            if (r6 == 0) goto L_0x005e
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r6
        L_0x0061:
            r6 = r4 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0076
            boolean r6 = r13.l()
            if (r6 != 0) goto L_0x006e
            goto L_0x0076
        L_0x006e:
            r13.L()
            r3 = r2
            r11 = r13
            r2 = r15
            goto L_0x01dd
        L_0x0076:
            if (r1 == 0) goto L_0x007c
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r10 = r1
            goto L_0x007d
        L_0x007c:
            r10 = r2
        L_0x007d:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0089
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.ui.commercial.KeyBenefitsGrid (KeyBenefitsGridComposables.kt:57)"
            U0.C4895p.S(r3, r4, r1, r2)
        L_0x0089:
            r1 = 8
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            float r11 = (float) r5
            float r2 = c2.h.B(r11)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.j(r10, r1, r2)
            r9 = 0
            r8 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r9, r12, r8)
            java.lang.String r2 = "KeyBenefitsGrid"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r1, r2)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.k()
            r7 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r13, r7)
            int r3 = U0.C4883j.a(r13, r7)
            U0.y r5 = r13.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
            G1.g$a r6 = G1.C4504g.f6515W
            nI.a r8 = r6.a()
            U0.f r16 = r13.m()
            if (r16 != 0) goto L_0x00d1
            U0.C4883j.c()
        L_0x00d1:
            r13.I()
            boolean r16 = r13.i()
            if (r16 == 0) goto L_0x00de
            r13.p(r8)
            goto L_0x00e1
        L_0x00de:
            r13.t()
        L_0x00e1:
            U0.m r8 = U0.F1.a(r13)
            nI.p r9 = r6.c()
            U0.F1.c(r8, r2, r9)
            nI.p r2 = r6.e()
            U0.F1.c(r8, r5, r2)
            nI.p r2 = r6.b()
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x010b
            java.lang.Object r5 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x0119
        L_0x010b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r8.u(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.w(r3, r2)
        L_0x0119:
            nI.p r2 = r6.d()
            U0.F1.c(r8, r1, r2)
            s0.h r1 = s0.C5862h.f28810a
            r1 = 121056056(0x7372b38, float:1.3780091E-34)
            r13.W(r1)
            if (r0 != 0) goto L_0x0131
            r26 = r10
            r27 = r11
            r30 = r13
            goto L_0x0192
        L_0x0131:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            float r2 = c2.h.B(r11)
            float r3 = c2.h.B(r11)
            float r5 = c2.h.B(r11)
            float r6 = (float) r7
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.l(r1, r2, r5, r3, r6)
            r8 = 0
            r9 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r9, r12, r8)
            java.lang.String r2 = "KeyBenefitsTitle"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r1, r2)
            TC.b$b$f r1 = TC.C13679b.C2857b.f.f116688a
            r3 = r4 & 14
            r23 = r3 | 48
            r24 = 0
            r25 = 262136(0x3fff8, float:3.67331E-40)
            r3 = 0
            r5 = 0
            r16 = 0
            r7 = r16
            r8 = r16
            r9 = r16
            r16 = 0
            r26 = r10
            r27 = r11
            r10 = r16
            r16 = 0
            r12 = r16
            r30 = r13
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r28
            r22 = r30
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0192:
            r30.P()
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            float r1 = c2.h.B(r27)
            float r2 = c2.h.B(r27)
            float r3 = c2.h.B(r27)
            r4 = 0
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.l(r0, r1, r3, r2, r4)
            r1 = 1
            r2 = 0
            r3 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r0, r2, r1, r3)
            HC.j$a r0 = new HC.j$a
            r2 = r29
            r0.<init>(r2)
            r3 = 54
            r5 = -1005955551(0xffffffffc40a5621, float:-553.34576)
            r11 = r30
            c1.a r7 = c1.c.e(r5, r1, r0, r11, r3)
            r9 = 3072(0xc00, float:4.305E-42)
            r10 = 6
            r5 = 0
            r6 = 0
            r8 = r11
            s0.C5858d.a(r4, r5, r6, r7, r8, r9, r10)
            r11.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01db
            U0.C4895p.R()
        L_0x01db:
            r3 = r26
        L_0x01dd:
            U0.Y0 r6 = r11.n()
            if (r6 == 0) goto L_0x01f4
            HC.e r7 = new HC.e
            r0 = r7
            r1 = r28
            r2 = r29
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: HC.C12981j.i(java.lang.String, KJ.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(String str, C15987c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        i(str, cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final d k(d dVar, float f10, long j10, boolean z10, boolean z11, boolean z12, boolean z13) {
        d dVar2 = dVar;
        return dVar.s(b.c(d.f18749a, new C12979h(f10, z10, j10, z11, z12, z13)));
    }

    /* access modifiers changed from: private */
    public static final i l(float f10, boolean z10, long j10, boolean z11, boolean z12, boolean z13, m1.d dVar) {
        m1.d dVar2 = dVar;
        C17542s.j(dVar2, "$this$drawWithCache");
        float f11 = f10;
        float H12 = dVar2.H1(f10);
        return dVar2.p(new C12980i(z10, H12 / ((float) 2), j10, H12, z11, z12, z13));
    }

    /* access modifiers changed from: private */
    public static final C16807N m(boolean z10, float f10, long j10, float f11, boolean z11, boolean z12, boolean z13, C5817c cVar) {
        float f12 = f10;
        C17542s.j(cVar, "$this$onDrawWithContent");
        cVar.V1();
        if (z10) {
            f.u0(cVar, j10, C5668h.a(0.0f, f12), C5668h.a(C5673m.l(cVar.b()), f12), f11, 0, (V0) null, 0.0f, (C5749w0) null, 0, 496, (Object) null);
        }
        if (z11) {
            f.u0(cVar, j10, C5668h.a(0.0f, C5673m.i(cVar.b()) - f12), C5668h.a(C5673m.l(cVar.b()), C5673m.i(cVar.b()) - f12), f11, 0, (V0) null, 0.0f, (C5749w0) null, 0, 496, (Object) null);
        }
        if (z12) {
            f.u0(cVar, j10, C5668h.a(f12, 0.0f), C5668h.a(f12, C5673m.i(cVar.b())), f11, 0, (V0) null, 0.0f, (C5749w0) null, 0, 496, (Object) null);
        }
        if (z13) {
            f.u0(cVar, j10, C5668h.a(C5673m.l(cVar.b()) - f12, 0.0f), C5668h.a(C5673m.l(cVar.b()) - f12, C5673m.i(cVar.b())), f11, 0, (V0) null, 0.0f, (C5749w0) null, 0, 496, (Object) null);
        }
        return C16807N.f139792a;
    }
}
