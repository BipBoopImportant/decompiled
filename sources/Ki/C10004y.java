package ki;

import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.t;
import android.content.Context;
import ji.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import li.a;
import mi.l;
import oi.b;
import oi.f;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u0002"}, d2 = {"Lli/a;", "navigationContract", "Loi/b;", "viewModel", "LXH/N;", "c", "(Lli/a;Loi/b;LU0/m;II)V", "Lmi/l;", "state", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.y  reason: case insensitive filesystem */
public final class C10004y {
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(li.a r19, oi.b r20, U0.C4889m r21, int r22, int r23) {
        /*
            r0 = r19
            r1 = r22
            r2 = r23
            java.lang.String r3 = "navigationContract"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 587582625(0x2305cca1, float:7.253276E-18)
            r4 = r21
            U0.m r12 = r4.k(r3)
            r4 = r2 & 1
            r13 = 4
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x0035
        L_0x001c:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0034
            r4 = r1 & 8
            if (r4 != 0) goto L_0x0029
            boolean r4 = r12.V(r0)
            goto L_0x002d
        L_0x0029:
            boolean r4 = r12.F(r0)
        L_0x002d:
            if (r4 == 0) goto L_0x0031
            r4 = r13
            goto L_0x0032
        L_0x0031:
            r4 = 2
        L_0x0032:
            r4 = r4 | r1
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            r5 = r1 & 48
            if (r5 != 0) goto L_0x004f
            r5 = r2 & 2
            if (r5 != 0) goto L_0x0048
            r5 = r20
            boolean r6 = r12.F(r5)
            if (r6 == 0) goto L_0x004a
            r6 = 32
            goto L_0x004c
        L_0x0048:
            r5 = r20
        L_0x004a:
            r6 = 16
        L_0x004c:
            r4 = r4 | r6
        L_0x004d:
            r14 = r4
            goto L_0x0052
        L_0x004f:
            r5 = r20
            goto L_0x004d
        L_0x0052:
            r4 = r14 & 19
            r6 = 18
            if (r4 != r6) goto L_0x0065
            boolean r4 = r12.l()
            if (r4 != 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            r12.L()
            r11 = r5
            goto L_0x0174
        L_0x0065:
            r12.G()
            r4 = r1 & 1
            r15 = 0
            if (r4 == 0) goto L_0x007f
            boolean r4 = r12.O()
            if (r4 == 0) goto L_0x0074
            goto L_0x007f
        L_0x0074:
            r12.L()
            r4 = r2 & 2
            if (r4 == 0) goto L_0x007d
            r14 = r14 & -113(0xffffffffffffff8f, float:NaN)
        L_0x007d:
            r11 = r5
            goto L_0x00cd
        L_0x007f:
            r4 = r2 & 2
            if (r4 == 0) goto L_0x007d
            r4 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.C(r4)
            m3.a r4 = m3.a.f26247a
            int r5 = m3.a.f26249c
            androidx.lifecycle.k0 r5 = r4.a(r12, r5)
            if (r5 == 0) goto L_0x00c5
            androidx.lifecycle.i0$c r7 = f3.a.a(r5, r12, r15)
            r4 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.C(r4)
            boolean r4 = r5 instanceof androidx.lifecycle.C5212o
            if (r4 == 0) goto L_0x00aa
            r4 = r5
            androidx.lifecycle.o r4 = (androidx.lifecycle.C5212o) r4
            l3.a r4 = r4.getDefaultViewModelCreationExtras()
        L_0x00a8:
            r8 = r4
            goto L_0x00ad
        L_0x00aa:
            l3.a$a r4 = l3.a.C0407a.f25486b
            goto L_0x00a8
        L_0x00ad:
            r10 = 36936(0x9048, float:5.1758E-41)
            r11 = 0
            java.lang.Class<oi.b> r4 = oi.b.class
            r6 = 0
            r9 = r12
            androidx.lifecycle.f0 r4 = m3.c.b(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.U()
            r12.U()
            oi.b r4 = (oi.b) r4
            r14 = r14 & -113(0xffffffffffffff8f, float:NaN)
            r11 = r4
            goto L_0x00cd
        L_0x00c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00cd:
            r12.y()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00dc
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.app.productinformationpage.v3.compose.PipDestination (PipDestination.kt:26)"
            U0.C4895p.S(r3, r14, r4, r5)
        L_0x00dc:
            U0.I0 r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r3 = r12.Q(r3)
            android.content.Context r3 = (android.content.Context) r3
            U0.I0 r4 = Vo.b.c()
            java.lang.Object r4 = r12.Q(r4)
            androidx.fragment.app.o r4 = (androidx.fragment.app.C5187o) r4
            x4.o r10 = androidx.navigation.fragment.a.a(r4)
            U0.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r4 = r12.Q(r4)
            android.content.Context r4 = (android.content.Context) r4
            android.app.Activity r4 = Xo.c.a(r4)
            if (r4 == 0) goto L_0x0183
            T0.c r9 = T0.a.a(r4, r12, r15)
            TJ.P r4 = r11.m()
            r16 = 0
            r17 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r12
            r18 = r9
            r9 = r16
            r15 = r10
            r10 = r17
            U0.A1 r4 = j3.a.c(r4, r5, r6, r7, r8, r9, r10)
            mi.l r4 = d(r4)
            r5 = -823194982(0xffffffffceef0a9a, float:-2.0052247E9)
            r12.W(r5)
            boolean r5 = r12.F(r15)
            r6 = r14 & 14
            if (r6 == r13) goto L_0x013e
            r6 = r14 & 8
            if (r6 == 0) goto L_0x013c
            boolean r6 = r12.F(r0)
            if (r6 == 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r6 = 0
            goto L_0x013f
        L_0x013e:
            r6 = 1
        L_0x013f:
            r5 = r5 | r6
            boolean r6 = r12.F(r11)
            r5 = r5 | r6
            boolean r6 = r12.F(r3)
            r5 = r5 | r6
            java.lang.Object r6 = r12.D()
            if (r5 != 0) goto L_0x0158
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0160
        L_0x0158:
            ki.w r6 = new ki.w
            r6.<init>(r15, r0, r11, r3)
            r12.u(r6)
        L_0x0160:
            nI.l r6 = (nI.C17642l) r6
            r12.P()
            r5 = r18
            r3 = 0
            ki.Z.b(r4, r5, r6, r12, r3)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0174
            U0.C4895p.R()
        L_0x0174:
            U0.Y0 r3 = r12.n()
            if (r3 == 0) goto L_0x0182
            ki.x r4 = new ki.x
            r4.<init>(r0, r11, r1, r2)
            r3.a(r4)
        L_0x0182:
            return
        L_0x0183:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.C10004y.c(li.a, oi.b, U0.m, int, int):void");
    }

    private static final l d(A1<l> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C8951o oVar, a aVar, b bVar, Context context, c cVar) {
        C17542s.j(cVar, "event");
        if (C17542s.e(cVar, c.b.f74846a)) {
            oVar.k0();
        } else if (cVar instanceof c.C1353c) {
            aVar.a(oVar, ((c.C1353c) cVar).a());
        } else if (C17542s.e(cVar, c.f.f74851a)) {
            bVar.K(f.b.f75808a);
        } else if (cVar instanceof c.g) {
            c.g gVar = (c.g) cVar;
            bVar.K(new f.c(gVar.a(), gVar.b(), gVar.d(), gVar.c()));
        } else if (cVar instanceof c.h) {
            bVar.K(new f.d(((c.h) cVar).a()));
        } else if (cVar instanceof c.a) {
            bVar.K(f.a.f75807a);
        } else if (cVar instanceof c.d) {
            aVar.b(oVar, ((c.d) cVar).a(), context);
        } else if (cVar instanceof c.e) {
            c.e eVar = (c.e) cVar;
            aVar.c(oVar, eVar.b(), eVar.a());
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(a aVar, b bVar, int i10, int i11, C4889m mVar, int i12) {
        c(aVar, bVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
