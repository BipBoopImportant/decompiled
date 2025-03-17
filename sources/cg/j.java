package CG;

import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.A1;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import l3.a;
import m3.c;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import zG.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ao\u0010\u0010\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "itemId", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LXH/N;", "onItemSelected", "onBedDisclaimerClicked", "Lkotlin/Function0;", "onCollapse", "onClose", "e", "(ILnI/l;LnI/l;LnI/a;LnI/a;LU0/m;I)V", "LU0/A1;", "LzG/e;", "uiState", "onLoadMore", "h", "(LU0/A1;LnI/l;LnI/l;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.goeswith.GoesWellWithDrawerKt$GoesWellWithDrawer$1$1", f = "GoesWellWithDrawer.kt", l = {61}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f133456c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15487b f133457d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f133458e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15487b bVar, int i10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f133457d = bVar;
            this.f133458e = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f133457d, this.f133458e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f133456c;
            if (i10 == 0) {
                y.b(obj);
                C15487b bVar = this.f133457d;
                int i11 = this.f133458e;
                this.f133456c = 1;
                if (bVar.h(i11, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.goeswith.GoesWellWithDrawerKt$GoesWellWithDrawer$2$1$1", f = "GoesWellWithDrawer.kt", l = {70}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f133459c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15487b f133460d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f133461e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15487b bVar, int i10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f133460d = bVar;
            this.f133461e = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f133460d, this.f133461e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f133459c;
            if (i10 == 0) {
                y.b(obj);
                C15487b bVar = this.f133460d;
                int i11 = this.f133461e;
                this.f133459c = 1;
                if (bVar.i(i11, this) == f10) {
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

    public static final void e(int i10, C17642l<? super CachedCatalogItem, C16807N> lVar, C17642l<? super CachedCatalogItem, C16807N> lVar2, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i11) {
        int i12;
        int i13 = i10;
        C17642l<? super CachedCatalogItem, C16807N> lVar3 = lVar;
        C17642l<? super CachedCatalogItem, C16807N> lVar4 = lVar2;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i14 = i11;
        C17542s.j(lVar3, "onItemSelected");
        C17542s.j(lVar4, "onBedDisclaimerClicked");
        C17542s.j(aVar3, "onCollapse");
        C17542s.j(aVar4, "onClose");
        C4889m k10 = mVar.k(-1908249912);
        if ((i14 & 6) == 0) {
            i12 = (k10.d(i13) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.F(lVar3) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i12 |= k10.F(lVar4) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.F(aVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i14 & 24576) == 0) {
            i12 |= k10.F(aVar4) ? 16384 : 8192;
        }
        int i15 = i12;
        if ((i15 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1908249912, i15, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.goeswith.GoesWellWithDrawer (GoesWellWithDrawer.kt:54)");
            }
            k10.C(1890788296);
            k0 a10 = m3.a.f26247a.a(k10, m3.a.f26249c);
            if (a10 != null) {
                i0.c a11 = f3.a.a(a10, k10, 0);
                k10.C(1729797275);
                int i16 = i15;
                f0 b10 = c.b(C15487b.class, a10, (String) null, a11, a10 instanceof C5212o ? ((C5212o) a10).getDefaultViewModelCreationExtras() : a.C0407a.f25486b, k10, 36936, 0);
                k10.U();
                k10.U();
                C15487b bVar = (C15487b) b10;
                A1<e> b11 = p1.b(bVar.m(), (C17168i) null, k10, 0, 1);
                Object D10 = k10.D();
                C4889m.a aVar5 = C4889m.f14007a;
                if (D10 == aVar5.a()) {
                    B b12 = new B(P.k(C17169j.f142968a, k10));
                    k10.u(b12);
                    D10 = b12;
                }
                Q a12 = ((B) D10).a();
                Integer valueOf = Integer.valueOf(i10);
                k10.W(-1579844418);
                int i17 = i16;
                int i18 = i17 & 14;
                boolean F10 = k10.F(bVar) | (i18 == 4);
                Object D11 = k10.D();
                if (F10 || D11 == aVar5.a()) {
                    D11 = new a(bVar, i13, (C17164e<? super a>) null);
                    k10.u(D11);
                }
                k10.P();
                P.g(valueOf, (p) D11, k10, i18);
                k10.W(-1579837222);
                boolean F11 = k10.F(a12) | k10.F(bVar) | (i18 == 4);
                Object D12 = k10.D();
                if (F11 || D12 == aVar5.a()) {
                    D12 = new f(a12, bVar, i13);
                    k10.u(D12);
                }
                k10.P();
                int i19 = i17 & 1008;
                int i20 = i17 << 3;
                h(b11, lVar, lVar2, (C17631a) D12, aVar, aVar2, k10, i19 | (57344 & i20) | (i20 & ImageMetadata.JPEG_GPS_COORDINATES));
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new g(i10, lVar, lVar2, aVar, aVar2, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Q q10, C15487b bVar, int i10) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new b(bVar, i10, (C17164e<? super b>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(int i10, C17642l lVar, C17642l lVar2, C17631a aVar, C17631a aVar2, int i11, C4889m mVar, int i12) {
        e(i10, lVar, lVar2, aVar, aVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void h(U0.A1<? extends zG.e> r23, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r24, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r25, nI.C17631a<XH.C16807N> r26, nI.C17631a<XH.C16807N> r27, nI.C17631a<XH.C16807N> r28, U0.C4889m r29, int r30) {
        /*
            r7 = r30
            r0 = -1544568099(0xffffffffa3efc2dd, float:-2.599496E-17)
            r1 = r29
            U0.m r6 = r1.k(r0)
            r1 = r7 & 6
            r5 = r23
            if (r1 != 0) goto L_0x001c
            boolean r1 = r6.V(r5)
            if (r1 == 0) goto L_0x0019
            r1 = 4
            goto L_0x001a
        L_0x0019:
            r1 = 2
        L_0x001a:
            r1 = r1 | r7
            goto L_0x001d
        L_0x001c:
            r1 = r7
        L_0x001d:
            r3 = r7 & 48
            r4 = r24
            if (r3 != 0) goto L_0x002f
            boolean r3 = r6.F(r4)
            if (r3 == 0) goto L_0x002c
            r3 = 32
            goto L_0x002e
        L_0x002c:
            r3 = 16
        L_0x002e:
            r1 = r1 | r3
        L_0x002f:
            r3 = r7 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0042
            r3 = r25
            boolean r8 = r6.F(r3)
            if (r8 == 0) goto L_0x003e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r1 = r1 | r8
            goto L_0x0044
        L_0x0042:
            r3 = r25
        L_0x0044:
            r8 = r7 & 3072(0xc00, float:4.305E-42)
            r15 = r26
            if (r8 != 0) goto L_0x0056
            boolean r8 = r6.F(r15)
            if (r8 == 0) goto L_0x0053
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r1 = r1 | r8
        L_0x0056:
            r8 = r7 & 24576(0x6000, float:3.4438E-41)
            r14 = r27
            if (r8 != 0) goto L_0x0068
            boolean r8 = r6.F(r14)
            if (r8 == 0) goto L_0x0065
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r1 = r1 | r8
        L_0x0068:
            r8 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 & r7
            r13 = r28
            if (r8 != 0) goto L_0x007b
            boolean r8 = r6.F(r13)
            if (r8 == 0) goto L_0x0078
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007a
        L_0x0078:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x007a:
            r1 = r1 | r8
        L_0x007b:
            r8 = 74899(0x12493, float:1.04956E-40)
            r8 = r8 & r1
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r9) goto L_0x0091
            boolean r8 = r6.l()
            if (r8 != 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            r6.L()
            r8 = r6
            goto L_0x0272
        L_0x0091:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x009d
            r8 = -1
            java.lang.String r9 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.goeswith.GoesWellWithDrawerContent (GoesWellWithDrawer.kt:85)"
            U0.C4895p.S(r0, r1, r8, r9)
        L_0x009d:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r8 = 1
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r0, r9, r8, r10)
            r12 = 0
            rF.b r8 = rF.C15002a.a(r6, r12)
            long r17 = r8.p()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            androidx.compose.foundation.layout.d r11 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r11 = r11.g()
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c$b r2 = r16.k()
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r11, r2, r6, r12)
            int r11 = U0.C4883j.a(r6, r12)
            U0.y r12 = r6.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r6, r8)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r9 = r17.a()
            U0.f r19 = r6.m()
            if (r19 != 0) goto L_0x00e4
            U0.C4883j.c()
        L_0x00e4:
            r6.I()
            boolean r19 = r6.i()
            if (r19 == 0) goto L_0x00f1
            r6.p(r9)
            goto L_0x00f4
        L_0x00f1:
            r6.t()
        L_0x00f4:
            U0.m r9 = U0.F1.a(r6)
            nI.p r10 = r17.c()
            U0.F1.c(r9, r2, r10)
            nI.p r2 = r17.e()
            U0.F1.c(r9, r12, r2)
            nI.p r2 = r17.b()
            boolean r10 = r9.i()
            if (r10 != 0) goto L_0x011e
            java.lang.Object r10 = r9.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r10 != 0) goto L_0x012c
        L_0x011e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r9.u(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r9.w(r10, r2)
        L_0x012c:
            nI.p r2 = r17.d()
            U0.F1.c(r9, r8, r2)
            s0.h r2 = s0.C5862h.f28810a
            r2 = 20
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            r8 = 2
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.k(r0, r2, r9, r8, r10)
            CG.a r0 = CG.C15486a.f133427a
            nI.p r9 = r0.a()
            int r0 = r1 >> 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | 24630(0x6036, float:3.4514E-41)
            int r2 = r1 << 6
            r19 = 3670016(0x380000, float:5.142788E-39)
            r10 = r2 & r19
            r17 = r0 | r10
            r18 = 164(0xa4, float:2.3E-43)
            r10 = 0
            r12 = 1
            r0 = 0
            r20 = 0
            r11 = r28
            r13 = r0
            r14 = r27
            r15 = r20
            r16 = r6
            AG.C15408p.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r23.getValue()
            zG.e r0 = (zG.e) r0
            boolean r8 = r0 instanceof zG.e.b
            if (r8 == 0) goto L_0x018c
            r0 = -1445670226(0xffffffffa9d4d2ae, float:-9.4512383E-14)
            r6.W(r0)
            r0 = 0
            rF.b r1 = rF.C15002a.a(r6, r0)
            long r1 = r1.p()
            zG.l.b(r1, r6, r0)
            r6.P()
        L_0x0189:
            r8 = r6
            goto L_0x0266
        L_0x018c:
            boolean r8 = r0 instanceof zG.e.c
            if (r8 == 0) goto L_0x0236
            r0 = -1445428178(0xffffffffa9d8842e, float:-9.6152565E-14)
            r6.W(r0)
            java.lang.Object r0 = r23.getValue()
            java.lang.String r8 = "null cannot be cast to non-null type com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.CatalogUiState.Success"
            kotlin.jvm.internal.C17542s.h(r0, r8)
            zG.e$c r0 = (zG.e.c) r0
            java.util.List r8 = r0.b()
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x01ce
            r0 = -1445336294(0xffffffffa9d9eb1a, float:-9.6775195E-14)
            r6.W(r0)
            int r1 = OE.n.f113193E1
            tK.v r0 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r6, r2)
            long r8 = r0.F0()
            r0 = 0
            r10 = 0
            r2 = r8
            r4 = r6
            r5 = r0
            r15 = r6
            r6 = r10
            zG.h.c(r1, r2, r4, r5, r6)
            r15.P()
            r6 = r15
            goto L_0x0231
        L_0x01ce:
            r15 = r6
            r3 = -1445032680(0xffffffffa9de8d18, float:-9.883256E-14)
            r15.W(r3)
            java.util.List r8 = r0.b()
            boolean r9 = r0.d()
            java.lang.String r10 = r0.a()
            java.lang.String r11 = r0.c()
            r0 = -600787765(0xffffffffdc30b4cb, float:-1.98953519E17)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r0 != r3) goto L_0x01ff
            CG.h r0 = new CG.h
            r0.<init>()
            r15.u(r0)
        L_0x01ff:
            r17 = r0
            nI.l r17 = (nI.C17642l) r17
            r15.P()
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r2 = 805330944(0x30006000, float:4.6702553E-10)
            r0 = r0 | r2
            int r2 = r1 << 15
            r2 = r2 & r19
            r0 = r0 | r2
            int r1 = r1 << 18
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r20 = r0 | r1
            r21 = 0
            r22 = 1152(0x480, float:1.614E-42)
            r12 = 3
            r0 = 0
            r18 = 0
            r13 = r26
            r14 = r24
            r6 = r15
            r15 = r0
            r16 = r25
            r19 = r6
            AG.C15394b.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6.P()
        L_0x0231:
            r6.P()
            goto L_0x0189
        L_0x0236:
            boolean r0 = r0 instanceof zG.e.a
            if (r0 == 0) goto L_0x0290
            r0 = -1444383943(0xffffffffa9e87339, float:-1.03228576E-13)
            r6.W(r0)
            java.lang.Object r0 = r23.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.CatalogUiState.Error"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            zG.e$a r0 = (zG.e.a) r0
            int r1 = r0.a()
            tK.v r0 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r6, r2)
            long r2 = r0.F0()
            r5 = 0
            r0 = 0
            r4 = r6
            r8 = r6
            r6 = r0
            zG.h.c(r1, r2, r4, r5, r6)
            r8.P()
        L_0x0266:
            r8.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0272
            U0.C4895p.R()
        L_0x0272:
            U0.Y0 r8 = r8.n()
            if (r8 == 0) goto L_0x028f
            CG.i r9 = new CG.i
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
        L_0x028f:
            return
        L_0x0290:
            r8 = r6
            r0 = -600824509(0xffffffffdc302543, float:-1.98322262E17)
            r8.W(r0)
            r8.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: CG.j.h(U0.A1, nI.l, nI.l, nI.a, nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(int i10) {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(A1 a12, C17642l lVar, C17642l lVar2, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        h(a12, lVar, lVar2, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
