package Fu;

import Du.a;
import Du.d;
import Du.f;
import HJ.C15854t;
import Iu.m;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.O;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import x4.C8948l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u0002"}, d2 = {"Lx4/l;", "navBackStackEntry", "Lkotlin/Function0;", "LXH/N;", "onCloseWayfinding", "onShowOnboarding", "LDu/f;", "viewModel", "k", "(Lx4/l;LnI/a;LnI/a;LDu/f;LU0/m;II)V", "h", "(LDu/f;Lx4/l;LU0/m;I)V", "LDu/d;", "state", "wayfinding-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0002\u0000\b\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Fu/j$a", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "c", "(Landroidx/lifecycle/y;)V", "onDestroy", "Fu/j$a$a", "a", "LFu/j$a$a;", "appLifecycleObserver", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        private final C1577a f81083a;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Fu/j$a$a", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onStop", "(Landroidx/lifecycle/y;)V", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fu.j$a$a  reason: collision with other inner class name */
        public static final class C1577a implements C5205h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f81084a;

            C1577a(f fVar) {
                this.f81084a = fVar;
            }

            public void onStop(C5221y yVar) {
                C17542s.j(yVar, "owner");
                this.f81084a.H(a.b.f80321a);
            }
        }

        a(f fVar) {
            this.f81083a = new C1577a(fVar);
        }

        public void c(C5221y yVar) {
            C17542s.j(yVar, "owner");
            O.f22160i.a().getLifecycle().c(this.f81083a);
        }

        public void onDestroy(C5221y yVar) {
            C17542s.j(yVar, "owner");
            O.f22160i.a().getLifecycle().g(this.f81083a);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Fu/j$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8948l f81085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f81086b;

        public b(C8948l lVar, a aVar) {
            this.f81085a = lVar;
            this.f81086b = aVar;
        }

        public void b() {
            this.f81085a.getLifecycle().g(this.f81086b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f81087a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Iu.m[] r0 = Iu.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Iu.m r1 = Iu.m.FINISHED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Iu.m r1 = Iu.m.DISMISSED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f81087a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Fu.j.c.<clinit>():void");
        }
    }

    private static final void h(f fVar, C8948l lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1600596189);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1600596189, i11, -1, "com.ingka.ikea.instore.wayfinding.impl.map.ui.LifecycleTracker (WayfindingMapDestination.kt:92)");
            }
            k10.W(-2067422562);
            boolean F10 = k10.F(fVar) | k10.F(lVar);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new h(lVar, fVar);
                k10.u(D10);
            }
            k10.P();
            P.c(lVar, (C17642l) D10, k10, (i11 >> 3) & 14);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new i(fVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final L i(C8948l lVar, f fVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        a aVar = new a(fVar);
        lVar.getLifecycle().c(aVar);
        return new b(lVar, aVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N j(f fVar, C8948l lVar, int i10, C4889m mVar, int i11) {
        h(fVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(x4.C8948l r17, nI.C17631a<XH.C16807N> r18, nI.C17631a<XH.C16807N> r19, Du.f r20, U0.C4889m r21, int r22, int r23) {
        /*
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = r22
            java.lang.String r0 = "navBackStackEntry"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onCloseWayfinding"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onShowOnboarding"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r0 = -331743555(0xffffffffec39febd, float:-8.99417E26)
            r4 = r21
            U0.m r4 = r4.k(r0)
            r6 = r23 & 1
            if (r6 == 0) goto L_0x0027
            r6 = r5 | 6
            goto L_0x0037
        L_0x0027:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0036
            boolean r6 = r4.F(r1)
            if (r6 == 0) goto L_0x0033
            r6 = 4
            goto L_0x0034
        L_0x0033:
            r6 = 2
        L_0x0034:
            r6 = r6 | r5
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            r7 = r23 & 2
            r14 = 32
            if (r7 == 0) goto L_0x0040
            r6 = r6 | 48
            goto L_0x004f
        L_0x0040:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x004f
            boolean r7 = r4.F(r2)
            if (r7 == 0) goto L_0x004c
            r7 = r14
            goto L_0x004e
        L_0x004c:
            r7 = 16
        L_0x004e:
            r6 = r6 | r7
        L_0x004f:
            r7 = r23 & 4
            if (r7 == 0) goto L_0x0056
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0066
            boolean r7 = r4.F(r3)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r6 = r6 | r7
        L_0x0066:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0080
            r7 = r23 & 8
            if (r7 != 0) goto L_0x0079
            r7 = r20
            boolean r8 = r4.F(r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x0079:
            r7 = r20
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r6 = r6 | r8
        L_0x007e:
            r15 = r6
            goto L_0x0083
        L_0x0080:
            r7 = r20
            goto L_0x007e
        L_0x0083:
            r6 = r15 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r6 != r8) goto L_0x0096
            boolean r6 = r4.l()
            if (r6 != 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            r4.L()
            r13 = r7
            goto L_0x0231
        L_0x0096:
            r4.G()
            r6 = r5 & 1
            r13 = 0
            if (r6 == 0) goto L_0x00b0
            boolean r6 = r4.O()
            if (r6 == 0) goto L_0x00a5
            goto L_0x00b0
        L_0x00a5:
            r4.L()
            r6 = r23 & 8
            if (r6 == 0) goto L_0x00ae
            r15 = r15 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ae:
            r13 = r7
            goto L_0x0101
        L_0x00b0:
            r6 = r23 & 8
            if (r6 == 0) goto L_0x00ae
            r6 = 1890788296(0x70b323c8, float:4.435286E29)
            r4.C(r6)
            m3.a r6 = m3.a.f26247a
            int r7 = m3.a.f26249c
            androidx.lifecycle.k0 r7 = r6.a(r4, r7)
            if (r7 == 0) goto L_0x00f9
            androidx.lifecycle.i0$c r9 = f3.a.a(r7, r4, r13)
            r6 = 1729797275(0x671a9c9b, float:7.301333E23)
            r4.C(r6)
            boolean r6 = r7 instanceof androidx.lifecycle.C5212o
            if (r6 == 0) goto L_0x00db
            r6 = r7
            androidx.lifecycle.o r6 = (androidx.lifecycle.C5212o) r6
            l3.a r6 = r6.getDefaultViewModelCreationExtras()
        L_0x00d9:
            r10 = r6
            goto L_0x00de
        L_0x00db:
            l3.a$a r6 = l3.a.C0407a.f25486b
            goto L_0x00d9
        L_0x00de:
            r12 = 36936(0x9048, float:5.1758E-41)
            r16 = 0
            java.lang.Class<Du.f> r6 = Du.f.class
            r8 = 0
            r11 = r4
            r13 = r16
            androidx.lifecycle.f0 r6 = m3.c.b(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.U()
            r4.U()
            Du.f r6 = (Du.f) r6
            r15 = r15 & -7169(0xffffffffffffe3ff, float:NaN)
            r13 = r6
            goto L_0x0101
        L_0x00f9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x0101:
            r4.y()
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0110
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.instore.wayfinding.impl.map.ui.WayfindingMapDestination (WayfindingMapDestination.kt:29)"
            U0.C4895p.S(r0, r15, r6, r7)
        L_0x0110:
            TJ.P r6 = r13.getState()
            r11 = 0
            r12 = 7
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = r4
            U0.A1 r0 = j3.a.c(r6, r7, r8, r9, r10, r11, r12)
            int r6 = r15 >> 9
            r6 = r6 & 14
            int r7 = r15 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            h(r13, r1, r4, r6)
            r6 = -747819628(0xffffffffd36d2d94, float:-1.01867192E12)
            r4.W(r6)
            boolean r6 = r4.F(r13)
            r7 = r15 & 112(0x70, float:1.57E-43)
            r8 = 1
            if (r7 != r14) goto L_0x013b
            r9 = r8
            goto L_0x013c
        L_0x013b:
            r9 = 0
        L_0x013c:
            r6 = r6 | r9
            java.lang.Object r9 = r4.D()
            if (r6 != 0) goto L_0x014b
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x0153
        L_0x014b:
            Fu.c r9 = new Fu.c
            r9.<init>(r13, r2)
            r4.u(r9)
        L_0x0153:
            nI.l r9 = (nI.C17642l) r9
            r4.P()
            r6 = r15 & 14
            r6 = r6 | 48
            java.lang.String r10 = "WayfindingOnboardingCallbackRequestKey"
            qw.l.c(r1, r10, r9, r4, r6)
            r6 = -747801439(0xffffffffd36d74a1, float:-1.01986396E12)
            r4.W(r6)
            boolean r6 = r4.F(r13)
            if (r7 != r14) goto L_0x016f
            r7 = r8
            goto L_0x0170
        L_0x016f:
            r7 = 0
        L_0x0170:
            r6 = r6 | r7
            java.lang.Object r7 = r4.D()
            if (r6 != 0) goto L_0x017f
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0187
        L_0x017f:
            Fu.d r7 = new Fu.d
            r7.<init>(r13, r2)
            r4.u(r7)
        L_0x0187:
            nI.a r7 = (nI.C17631a) r7
            r4.P()
            r6 = -747797658(0xffffffffd36d8366, float:-1.02011175E12)
            r4.W(r6)
            boolean r6 = r4.V(r7)
            java.lang.Object r9 = r4.D()
            if (r6 != 0) goto L_0x01a4
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x01ac
        L_0x01a4:
            Fu.e r9 = new Fu.e
            r9.<init>(r7)
            r4.u(r9)
        L_0x01ac:
            nI.a r9 = (nI.C17631a) r9
            r4.P()
            r6 = 0
            e.C5281d.a(r6, r9, r4, r6, r8)
            Du.d r0 = l(r0)
            boolean r8 = r0 instanceof Du.d.c
            if (r8 == 0) goto L_0x01c7
            r0 = -747794369(0xffffffffd36d903f, float:-1.0203273E12)
            r4.W(r0)
            r4.P()
            goto L_0x0228
        L_0x01c7:
            boolean r8 = r0 instanceof Du.d.C1517d
            if (r8 == 0) goto L_0x01d8
            r0 = -747793203(0xffffffffd36d94cd, float:-1.02040371E12)
            r4.W(r0)
            r4.P()
            r19.invoke()
            goto L_0x0228
        L_0x01d8:
            boolean r8 = r0 instanceof Du.d.a
            if (r8 == 0) goto L_0x0212
            r6 = -1706699305(0xffffffff9a45d5d7, float:-4.0911384E-23)
            r4.W(r6)
            Du.d$a r0 = (Du.d.a) r0
            r6 = -747788775(0xffffffffd36da619, float:-1.02069391E12)
            r4.W(r6)
            boolean r6 = r4.F(r13)
            java.lang.Object r8 = r4.D()
            if (r6 != 0) goto L_0x01fc
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x0204
        L_0x01fc:
            Fu.f r8 = new Fu.f
            r8.<init>(r13)
            r4.u(r8)
        L_0x0204:
            nI.l r8 = (nI.C17642l) r8
            r4.P()
            int r6 = IC.C13023e.f110931a
            Fu.p.f(r0, r8, r7, r4, r6)
            r4.P()
            goto L_0x0228
        L_0x0212:
            boolean r8 = r0 instanceof Du.d.b
            if (r8 == 0) goto L_0x024c
            r8 = -1706436115(0xffffffff9a49d9ed, float:-4.1741865E-23)
            r4.W(r8)
            Du.d$b r0 = (Du.d.b) r0
            Du.b r0 = r0.a()
            Fu.b.b(r0, r7, r4, r6)
            r4.P()
        L_0x0228:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0231
            U0.C4895p.R()
        L_0x0231:
            U0.Y0 r7 = r4.n()
            if (r7 == 0) goto L_0x024b
            Fu.g r8 = new Fu.g
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r13
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x024b:
            return
        L_0x024c:
            r0 = -747795567(0xffffffffd36d8b91, float:-1.02024878E12)
            r4.W(r0)
            r4.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fu.j.k(x4.l, nI.a, nI.a, Du.f, U0.m, int, int):void");
    }

    private static final d l(A1<? extends d> a12) {
        return (d) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(f fVar, Du.a aVar) {
        C17542s.j(aVar, "it");
        fVar.H(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C8948l lVar, C17631a aVar, C17631a aVar2, f fVar, int i10, int i11, C4889m mVar, int i12) {
        k(lVar, aVar, aVar2, fVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(f fVar, C17631a aVar, String str) {
        String str2;
        T t10;
        C17542s.j(str, "onboardingResult");
        Iterator<T> it = m.b().iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((m) t10).name(), str)) {
                break;
            }
        }
        m mVar = (m) t10;
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Result from OnboardingDialogFragment: " + mVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            if (str3 == null) {
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Wayfinding";
            }
            String str4 = str3;
            bVar.a(eVar, str4, false, (Throwable) null, str2);
            str3 = str4;
        }
        int i10 = mVar == null ? -1 : c.f81087a[mVar.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                fVar.H(a.f.f80326a);
                return C16807N.f139792a;
            } else if (i10 != 2) {
                throw new t();
            }
        }
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(f fVar, C17631a aVar) {
        fVar.H(a.e.f80325a);
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }
}
