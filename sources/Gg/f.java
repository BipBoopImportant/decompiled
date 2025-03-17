package GG;

import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aw\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0001\u0010\u0011\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "itemId", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LXH/N;", "onItemSelected", "Lkotlin/Function0;", "onCollapse", "onClose", "onFavorite", "onBedDisclaimerClicked", "e", "(ILnI/l;LnI/a;LnI/a;LnI/l;LnI/l;LU0/m;II)V", "LU0/A1;", "LzG/e;", "uiState", "onLoadMore", "h", "(LU0/A1;LnI/l;LnI/a;LnI/a;LnI/a;LnI/l;LnI/l;LU0/m;II)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.swap.SwapDrawerKt$SwapDrawer$1$1", f = "SwapDrawer.kt", l = {63}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f134429c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f134430d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f134431e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, int i10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f134430d = iVar;
            this.f134431e = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f134430d, this.f134431e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f134429c;
            if (i10 == 0) {
                y.b(obj);
                i iVar = this.f134430d;
                int i11 = this.f134431e;
                this.f134429c = 1;
                if (iVar.h(i11, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.swap.SwapDrawerKt$SwapDrawer$2$1$1", f = "SwapDrawer.kt", l = {73}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f134432c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f134433d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f134434e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, int i10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f134433d = iVar;
            this.f134434e = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f134433d, this.f134434e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f134432c;
            if (i10 == 0) {
                y.b(obj);
                i iVar = this.f134433d;
                int i11 = this.f134434e;
                this.f134432c = 1;
                if (iVar.i(i11, this) == f10) {
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

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(int r20, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, nI.C17631a<XH.C16807N> r23, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r24, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r1 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r15 = r27
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onCollapse"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onClose"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -134621730(0xfffffffff7f9d5de, float:-1.01345286E34)
            r2 = r26
            U0.m r11 = r2.k(r0)
            r2 = r28 & 1
            if (r2 == 0) goto L_0x0029
            r2 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x0038
            boolean r2 = r11.d(r1)
            if (r2 == 0) goto L_0x0035
            r2 = 4
            goto L_0x0036
        L_0x0035:
            r2 = 2
        L_0x0036:
            r2 = r2 | r15
            goto L_0x0039
        L_0x0038:
            r2 = r15
        L_0x0039:
            r3 = r28 & 2
            if (r3 == 0) goto L_0x0040
            r2 = r2 | 48
            goto L_0x0050
        L_0x0040:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x0050
            boolean r3 = r11.F(r12)
            if (r3 == 0) goto L_0x004d
            r3 = 32
            goto L_0x004f
        L_0x004d:
            r3 = 16
        L_0x004f:
            r2 = r2 | r3
        L_0x0050:
            r3 = r28 & 4
            if (r3 == 0) goto L_0x0057
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0067
            boolean r3 = r11.F(r13)
            if (r3 == 0) goto L_0x0064
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r2 = r2 | r3
        L_0x0067:
            r3 = r28 & 8
            if (r3 == 0) goto L_0x006e
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x007e
            boolean r3 = r11.F(r14)
            if (r3 == 0) goto L_0x007b
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r2 = r2 | r3
        L_0x007e:
            r3 = r28 & 16
            if (r3 == 0) goto L_0x0087
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r4 = r24
            goto L_0x0099
        L_0x0087:
            r4 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0084
            r4 = r24
            boolean r5 = r11.F(r4)
            if (r5 == 0) goto L_0x0096
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r2 = r2 | r5
        L_0x0099:
            r5 = r28 & 32
            r6 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00a4
            r2 = r2 | r6
        L_0x00a0:
            r6 = r25
        L_0x00a2:
            r9 = r2
            goto L_0x00b6
        L_0x00a4:
            r6 = r6 & r15
            if (r6 != 0) goto L_0x00a0
            r6 = r25
            boolean r7 = r11.F(r6)
            if (r7 == 0) goto L_0x00b2
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r2 = r2 | r7
            goto L_0x00a2
        L_0x00b6:
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r2 & r9
            r7 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r7) goto L_0x00ce
            boolean r2 = r11.l()
            if (r2 != 0) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            r11.L()
            r5 = r4
            r18 = r11
            goto L_0x01f0
        L_0x00ce:
            r8 = 0
            if (r3 == 0) goto L_0x00d4
            r16 = r8
            goto L_0x00d6
        L_0x00d4:
            r16 = r4
        L_0x00d6:
            if (r5 == 0) goto L_0x00db
            r17 = r8
            goto L_0x00dd
        L_0x00db:
            r17 = r6
        L_0x00dd:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00e9
            r2 = -1
            java.lang.String r3 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.swap.SwapDrawer (SwapDrawer.kt:56)"
            U0.C4895p.S(r0, r9, r2, r3)
        L_0x00e9:
            r0 = 1890788296(0x70b323c8, float:4.435286E29)
            r11.C(r0)
            m3.a r0 = m3.a.f26247a
            int r2 = m3.a.f26249c
            androidx.lifecycle.k0 r3 = r0.a(r11, r2)
            if (r3 == 0) goto L_0x020c
            r0 = 0
            androidx.lifecycle.i0$c r5 = f3.a.a(r3, r11, r0)
            r2 = 1729797275(0x671a9c9b, float:7.301333E23)
            r11.C(r2)
            boolean r2 = r3 instanceof androidx.lifecycle.C5212o
            if (r2 == 0) goto L_0x0111
            r2 = r3
            androidx.lifecycle.o r2 = (androidx.lifecycle.C5212o) r2
            l3.a r2 = r2.getDefaultViewModelCreationExtras()
        L_0x010f:
            r6 = r2
            goto L_0x0114
        L_0x0111:
            l3.a$a r2 = l3.a.C0407a.f25486b
            goto L_0x010f
        L_0x0114:
            r18 = 36936(0x9048, float:5.1758E-41)
            r19 = 0
            java.lang.Class<GG.i> r2 = GG.i.class
            r4 = 0
            r7 = r11
            r10 = r8
            r8 = r18
            r18 = r9
            r9 = r19
            androidx.lifecycle.f0 r2 = m3.c.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r11.U()
            r11.U()
            GG.i r2 = (GG.i) r2
            TJ.P r3 = r2.m()
            r4 = 1
            U0.A1 r3 = U0.p1.b(r3, r10, r11, r0, r4)
            java.lang.Object r5 = r11.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r7 = r6.a()
            if (r5 != r7) goto L_0x0154
            dI.j r5 = dI.C17169j.f142968a
            QJ.Q r5 = U0.P.k(r5, r11)
            U0.B r7 = new U0.B
            r7.<init>(r5)
            r11.u(r7)
            r5 = r7
        L_0x0154:
            U0.B r5 = (U0.B) r5
            QJ.Q r5 = r5.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            r8 = -1661382384(0xffffffff9cf95110, float:-1.6498392E-21)
            r11.W(r8)
            boolean r8 = r11.F(r2)
            r9 = r18 & 14
            r0 = 4
            if (r9 != r0) goto L_0x016f
            r0 = r4
            goto L_0x0170
        L_0x016f:
            r0 = 0
        L_0x0170:
            r0 = r0 | r8
            java.lang.Object r8 = r11.D()
            if (r0 != 0) goto L_0x017d
            java.lang.Object r0 = r6.a()
            if (r8 != r0) goto L_0x0185
        L_0x017d:
            GG.f$a r8 = new GG.f$a
            r8.<init>(r2, r1, r10)
            r11.u(r8)
        L_0x0185:
            nI.p r8 = (nI.p) r8
            r11.P()
            U0.P.g(r7, r8, r11, r9)
            r0 = -1661374388(0xffffffff9cf9704c, float:-1.6506466E-21)
            r11.W(r0)
            boolean r0 = r11.F(r5)
            boolean r7 = r11.F(r2)
            r0 = r0 | r7
            r7 = 4
            if (r9 != r7) goto L_0x01a0
            goto L_0x01a1
        L_0x01a0:
            r4 = 0
        L_0x01a1:
            r0 = r0 | r4
            java.lang.Object r4 = r11.D()
            if (r0 != 0) goto L_0x01ae
            java.lang.Object r0 = r6.a()
            if (r4 != r0) goto L_0x01b6
        L_0x01ae:
            GG.b r4 = new GG.b
            r4.<init>(r5, r2, r1)
            r11.u(r4)
        L_0x01b6:
            nI.a r4 = (nI.C17631a) r4
            r11.P()
            r0 = r18 & 112(0x70, float:1.57E-43)
            int r2 = r18 << 3
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r2
            r0 = r0 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r2
            r0 = r0 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r5
            r10 = r0 | r2
            r0 = 0
            r2 = r3
            r3 = r21
            r5 = r22
            r6 = r23
            r7 = r16
            r8 = r17
            r9 = r11
            r18 = r11
            r11 = r0
            h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ec
            U0.C4895p.R()
        L_0x01ec:
            r5 = r16
            r6 = r17
        L_0x01f0:
            U0.Y0 r9 = r18.n()
            if (r9 == 0) goto L_0x020b
            GG.c r10 = new GG.c
            r0 = r10
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x020b:
            return
        L_0x020c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: GG.f.e(int, nI.l, nI.a, nI.a, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Q q10, i iVar, int i10) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new b(iVar, i10, (C17164e<? super b>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(int i10, C17642l lVar, C17631a aVar, C17631a aVar2, C17642l lVar2, C17642l lVar3, int i11, int i12, C4889m mVar, int i13) {
        e(i10, lVar, aVar, aVar2, lVar2, lVar3, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void h(U0.A1<? extends zG.e> r25, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r26, nI.C17631a<XH.C16807N> r27, nI.C17631a<XH.C16807N> r28, nI.C17631a<XH.C16807N> r29, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r30, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r31, U0.C4889m r32, int r33, int r34) {
        /*
            r8 = r33
            r0 = 16
            r1 = 32
            r2 = 4
            r3 = -993977599(0xffffffffc4c11b01, float:-1544.8439)
            r4 = r32
            U0.m r4 = r4.k(r3)
            r5 = 1
            r6 = r34 & 1
            r7 = 2
            if (r6 == 0) goto L_0x001c
            r6 = r8 | 6
            r9 = r6
            r6 = r25
            goto L_0x0030
        L_0x001c:
            r6 = r8 & 6
            if (r6 != 0) goto L_0x002d
            r6 = r25
            boolean r9 = r4.V(r6)
            if (r9 == 0) goto L_0x002a
            r9 = r2
            goto L_0x002b
        L_0x002a:
            r9 = r7
        L_0x002b:
            r9 = r9 | r8
            goto L_0x0030
        L_0x002d:
            r6 = r25
            r9 = r8
        L_0x0030:
            r10 = r34 & 2
            if (r10 == 0) goto L_0x0039
            r9 = r9 | 48
            r15 = r26
            goto L_0x0049
        L_0x0039:
            r10 = r8 & 48
            r15 = r26
            if (r10 != 0) goto L_0x0049
            boolean r10 = r4.F(r15)
            if (r10 == 0) goto L_0x0047
            r10 = r1
            goto L_0x0048
        L_0x0047:
            r10 = r0
        L_0x0048:
            r9 = r9 | r10
        L_0x0049:
            r2 = r34 & 4
            if (r2 == 0) goto L_0x0052
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r2 = r27
            goto L_0x0064
        L_0x0052:
            r2 = r8 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004f
            r2 = r27
            boolean r10 = r4.F(r2)
            if (r10 == 0) goto L_0x0061
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r9 = r9 | r10
        L_0x0064:
            r10 = r34 & 8
            if (r10 == 0) goto L_0x006d
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r14 = r28
            goto L_0x007f
        L_0x006d:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            r14 = r28
            if (r10 != 0) goto L_0x007f
            boolean r10 = r4.F(r14)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r9 = r9 | r10
        L_0x007f:
            r0 = r34 & 16
            if (r0 == 0) goto L_0x0088
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r0 = r29
            goto L_0x009a
        L_0x0088:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0085
            r0 = r29
            boolean r10 = r4.F(r0)
            if (r10 == 0) goto L_0x0097
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r9 = r9 | r10
        L_0x009a:
            r1 = r34 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00a4
            r9 = r9 | r10
        L_0x00a1:
            r10 = r30
            goto L_0x00b5
        L_0x00a4:
            r10 = r10 & r8
            if (r10 != 0) goto L_0x00a1
            r10 = r30
            boolean r11 = r4.F(r10)
            if (r11 == 0) goto L_0x00b2
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r9 = r9 | r11
        L_0x00b5:
            r11 = r34 & 64
            r12 = 1572864(0x180000, float:2.204052E-39)
            if (r11 == 0) goto L_0x00c0
            r9 = r9 | r12
        L_0x00bc:
            r12 = r31
        L_0x00be:
            r13 = r9
            goto L_0x00d2
        L_0x00c0:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x00bc
            r12 = r31
            boolean r13 = r4.F(r12)
            if (r13 == 0) goto L_0x00ce
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r9 = r9 | r13
            goto L_0x00be
        L_0x00d2:
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r13
            r7 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r7) goto L_0x00e8
            boolean r7 = r4.l()
            if (r7 != 0) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            r4.L()
            r7 = r12
            goto L_0x02d4
        L_0x00e8:
            r7 = 0
            if (r1 == 0) goto L_0x00ed
            r1 = r7
            goto L_0x00ee
        L_0x00ed:
            r1 = r10
        L_0x00ee:
            if (r11 == 0) goto L_0x00f3
            r24 = r7
            goto L_0x00f5
        L_0x00f3:
            r24 = r12
        L_0x00f5:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0101
            r9 = -1
            java.lang.String r10 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.swap.SwapDrawerContent (SwapDrawer.kt:89)"
            U0.C4895p.S(r3, r13, r9, r10)
        L_0x0101:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r9 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r3, r9, r5, r7)
            r5 = 0
            rF.b r10 = rF.C15002a.a(r4, r5)
            long r17 = r10.p()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            androidx.compose.foundation.layout.d r11 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r11 = r11.g()
            i1.c$a r12 = i1.C5437c.f24302a
            i1.c$b r12 = r12.k()
            E1.I r11 = androidx.compose.foundation.layout.C5080k.a(r11, r12, r4, r5)
            int r12 = U0.C4883j.a(r4, r5)
            U0.y r5 = r4.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r4, r10)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r7 = r16.a()
            U0.f r18 = r4.m()
            if (r18 != 0) goto L_0x0146
            U0.C4883j.c()
        L_0x0146:
            r4.I()
            boolean r18 = r4.i()
            if (r18 == 0) goto L_0x0153
            r4.p(r7)
            goto L_0x0156
        L_0x0153:
            r4.t()
        L_0x0156:
            U0.m r7 = U0.F1.a(r4)
            nI.p r9 = r16.c()
            U0.F1.c(r7, r11, r9)
            nI.p r9 = r16.e()
            U0.F1.c(r7, r5, r9)
            nI.p r5 = r16.b()
            boolean r9 = r7.i()
            if (r9 != 0) goto L_0x0180
            java.lang.Object r9 = r7.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x018e
        L_0x0180:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r7.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r7.w(r9, r5)
        L_0x018e:
            nI.p r5 = r16.d()
            U0.F1.c(r7, r10, r5)
            s0.h r5 = s0.C5862h.f28810a
            r5 = 20
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r7 = 2
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.k(r3, r5, r10, r7, r9)
            GG.a r3 = GG.C15698a.f134406a
            nI.p r10 = r3.a()
            int r3 = r13 >> 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 24630(0x6036, float:3.4514E-41)
            int r5 = r13 << 9
            r7 = 3670016(0x380000, float:5.142788E-39)
            r11 = r5 & r7
            r18 = r3 | r11
            r19 = 164(0xa4, float:2.3E-43)
            r11 = 0
            r3 = 1
            r16 = 0
            r17 = 0
            r12 = r29
            r20 = r13
            r13 = r3
            r14 = r16
            r15 = r28
            r16 = r17
            r17 = r4
            AG.C15408p.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r3 = r25.getValue()
            zG.e r3 = (zG.e) r3
            boolean r9 = r3 instanceof zG.e.b
            if (r9 == 0) goto L_0x01f2
            r3 = -184524704(0xfffffffff5006060, float:-1.627365E32)
            r4.W(r3)
            r3 = 0
            rF.b r5 = rF.C15002a.a(r4, r3)
            long r9 = r5.p()
            zG.l.b(r9, r4, r3)
            r4.P()
            goto L_0x02c5
        L_0x01f2:
            boolean r9 = r3 instanceof zG.e.c
            if (r9 == 0) goto L_0x0297
            r3 = -184281137(0xfffffffff50417cf, float:-1.6744777E32)
            r4.W(r3)
            java.lang.Object r3 = r25.getValue()
            java.lang.String r9 = "null cannot be cast to non-null type com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.CatalogUiState.Success"
            kotlin.jvm.internal.C17542s.h(r3, r9)
            zG.e$c r3 = (zG.e.c) r3
            java.util.List r9 = r3.b()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x022f
            r3 = -184190772(0xfffffffff50578cc, float:-1.6919569E32)
            r4.W(r3)
            int r9 = OE.n.f113193E1
            tK.v r3 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r4, r5)
            long r10 = r3.F0()
            r13 = 0
            r14 = 0
            r12 = r4
            zG.h.c(r9, r10, r12, r13, r14)
            r4.P()
            goto L_0x0293
        L_0x022f:
            r9 = -183885639(0xfffffffff50a20b9, float:-1.7509782E32)
            r4.W(r9)
            java.util.List r9 = r3.b()
            boolean r10 = r3.d()
            java.lang.String r11 = r3.a()
            java.lang.String r12 = r3.c()
            r3 = -144462087(0xfffffffff763aef9, float:-4.6179697E33)
            r4.W(r3)
            java.lang.Object r3 = r4.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r3 != r13) goto L_0x025f
            GG.d r3 = new GG.d
            r3.<init>()
            r4.u(r3)
        L_0x025f:
            r18 = r3
            nI.l r18 = (nI.C17642l) r18
            r4.P()
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r5
            r5 = 805330944(0x30006000, float:4.6702553E-10)
            r3 = r3 | r5
            int r5 = r20 << 15
            r5 = r5 & r7
            r3 = r3 | r5
            int r5 = r20 << 6
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r5
            r3 = r3 | r7
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r7
            r21 = r3 | r5
            r22 = 0
            r23 = 1024(0x400, float:1.435E-42)
            r13 = 3
            r19 = 0
            r14 = r27
            r15 = r26
            r16 = r1
            r17 = r24
            r20 = r4
            AG.C15394b.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.P()
        L_0x0293:
            r4.P()
            goto L_0x02c5
        L_0x0297:
            boolean r3 = r3 instanceof zG.e.a
            if (r3 == 0) goto L_0x02f3
            r3 = -183189813(0xfffffffff514becb, float:-1.8855705E32)
            r4.W(r3)
            java.lang.Object r3 = r25.getValue()
            java.lang.String r5 = "null cannot be cast to non-null type com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.CatalogUiState.Error"
            kotlin.jvm.internal.C17542s.h(r3, r5)
            zG.e$a r3 = (zG.e.a) r3
            int r9 = r3.a()
            tK.v r3 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r4, r5)
            long r10 = r3.F0()
            r13 = 0
            r14 = 0
            r12 = r4
            zG.h.c(r9, r10, r12, r13, r14)
            r4.P()
        L_0x02c5:
            r4.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x02d1
            U0.C4895p.R()
        L_0x02d1:
            r10 = r1
            r7 = r24
        L_0x02d4:
            U0.Y0 r11 = r4.n()
            if (r11 == 0) goto L_0x02f2
            GG.e r12 = new GG.e
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r10
            r8 = r33
            r9 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r12)
        L_0x02f2:
            return
        L_0x02f3:
            r0 = -144500350(0xfffffffff7631982, float:-4.606128E33)
            r4.W(r0)
            r4.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: GG.f.h(U0.A1, nI.l, nI.a, nI.a, nI.a, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(int i10) {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(A1 a12, C17642l lVar, C17631a aVar, C17631a aVar2, C17631a aVar3, C17642l lVar2, C17642l lVar3, int i10, int i11, C4889m mVar, int i12) {
        h(a12, lVar, aVar, aVar2, aVar3, lVar2, lVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
