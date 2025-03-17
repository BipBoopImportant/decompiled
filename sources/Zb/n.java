package ZB;

import U0.C4889m;
import U0.M0;
import WB.C13775g;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import YH.X;
import android.content.Context;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import c1.C5264a;
import com.ingka.ikea.storedetails.impl.navigation.StoreDetailRoutes$AllOpeningHours;
import com.ingka.ikea.storedetails.impl.navigation.StoreDetailRoutes$MapScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l0.C5507b;
import l0.v;
import nI.C17642l;
import nI.r;
import x4.C;
import x4.C8935A;
import x4.C8948l;
import x4.C8951o;
import x4.I;
import x4.q;
import x4.s;
import x4.y;
import z4.e;
import z4.f;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "storeId", "Lx4/o;", "outerNavController", "LZB/e;", "navigationContract", "Lx4/A;", "composeNavController", "LXH/N;", "c", "(Ljava/lang/String;Lx4/o;LZB/e;Lx4/A;LU0/m;II)V", "storedetails-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8951o f118303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13877e f118304b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f118305c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8935A f118306d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f118307e;

        a(C8951o oVar, C13877e eVar, Context context, C8935A a10, String str) {
            this.f118303a = oVar;
            this.f118304b = eVar;
            this.f118305c = context;
            this.f118306d = a10;
            this.f118307e = str;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C8951o oVar) {
            oVar.i0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C13877e eVar, Context context, C13775g.a aVar) {
            C17542s.j(aVar, "directionData");
            if (aVar instanceof C13775g.a.C2901a) {
                eVar.a(context, ((C13775g.a.C2901a) aVar).a());
            } else if (aVar instanceof C13775g.a.b) {
                eVar.b(context, ((C13775g.a.b) aVar).a());
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C8935A a10, String str) {
            C8951o.f0(a10, new StoreDetailRoutes$AllOpeningHours(str), (C) null, (I.a) null, 6, (Object) null);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(C13877e eVar, C8951o oVar, String str) {
            eVar.j(oVar, str);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C13877e eVar, Context context) {
            eVar.c(context);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(l0.C5507b r10, x4.C8948l r11, U0.C4889m r12, int r13) {
            /*
                r9 = this;
                java.lang.String r0 = "$this$composable"
                kotlin.jvm.internal.C17542s.j(r10, r0)
                java.lang.String r10 = "$unused$var$"
                kotlin.jvm.internal.C17542s.j(r11, r10)
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x0019
                r10 = -1
                java.lang.String r11 = "com.ingka.ikea.storedetails.impl.navigation.StoreDetailsNavHost.<anonymous>.<anonymous>.<anonymous> (StoreDetailsNavHost.kt:36)"
                r0 = -493904828(0xffffffffe28f9c44, float:-1.3245723E21)
                U0.C4895p.S(r0, r13, r10, r11)
            L_0x0019:
                r10 = 802175970(0x2fd03be2, float:3.787753E-10)
                r12.W(r10)
                x4.o r10 = r9.f118303a
                boolean r10 = r12.F(r10)
                x4.o r11 = r9.f118303a
                java.lang.Object r13 = r12.D()
                if (r10 != 0) goto L_0x0035
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r13 != r10) goto L_0x003d
            L_0x0035:
                ZB.i r13 = new ZB.i
                r13.<init>(r11)
                r12.u(r13)
            L_0x003d:
                r0 = r13
                nI.a r0 = (nI.C17631a) r0
                r12.P()
                r10 = 802180118(0x2fd04c16, float:3.7889042E-10)
                r12.W(r10)
                ZB.e r10 = r9.f118304b
                boolean r10 = r12.F(r10)
                android.content.Context r11 = r9.f118305c
                boolean r11 = r12.F(r11)
                r10 = r10 | r11
                ZB.e r11 = r9.f118304b
                android.content.Context r13 = r9.f118305c
                java.lang.Object r1 = r12.D()
                if (r10 != 0) goto L_0x0068
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r1 != r10) goto L_0x0070
            L_0x0068:
                ZB.j r1 = new ZB.j
                r1.<init>(r11, r13)
                r12.u(r1)
            L_0x0070:
                nI.l r1 = (nI.C17642l) r1
                r12.P()
                r10 = 802199437(0x2fd0978d, float:3.7942663E-10)
                r12.W(r10)
                x4.A r10 = r9.f118306d
                boolean r10 = r12.F(r10)
                java.lang.String r11 = r9.f118307e
                boolean r11 = r12.V(r11)
                r10 = r10 | r11
                x4.A r11 = r9.f118306d
                java.lang.String r13 = r9.f118307e
                java.lang.Object r2 = r12.D()
                if (r10 != 0) goto L_0x009a
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r2 != r10) goto L_0x00a2
            L_0x009a:
                ZB.k r2 = new ZB.k
                r2.<init>(r11, r13)
                r12.u(r2)
            L_0x00a2:
                nI.a r2 = (nI.C17631a) r2
                r12.P()
                r10 = 802206500(0x2fd0b324, float:3.7962267E-10)
                r12.W(r10)
                ZB.e r10 = r9.f118304b
                boolean r10 = r12.F(r10)
                x4.o r11 = r9.f118303a
                boolean r11 = r12.F(r11)
                r10 = r10 | r11
                java.lang.String r11 = r9.f118307e
                boolean r11 = r12.V(r11)
                r10 = r10 | r11
                ZB.e r11 = r9.f118304b
                x4.o r13 = r9.f118303a
                java.lang.String r3 = r9.f118307e
                java.lang.Object r4 = r12.D()
                if (r10 != 0) goto L_0x00d5
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r4 != r10) goto L_0x00dd
            L_0x00d5:
                ZB.l r4 = new ZB.l
                r4.<init>(r11, r13, r3)
                r12.u(r4)
            L_0x00dd:
                r3 = r4
                nI.a r3 = (nI.C17631a) r3
                r12.P()
                r10 = 802214122(0x2fd0d0ea, float:3.7983422E-10)
                r12.W(r10)
                ZB.e r10 = r9.f118304b
                boolean r10 = r12.F(r10)
                android.content.Context r11 = r9.f118305c
                boolean r11 = r12.F(r11)
                r10 = r10 | r11
                ZB.e r11 = r9.f118304b
                android.content.Context r13 = r9.f118305c
                java.lang.Object r4 = r12.D()
                if (r10 != 0) goto L_0x0108
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r4 != r10) goto L_0x0110
            L_0x0108:
                ZB.m r4 = new ZB.m
                r4.<init>(r11, r13)
                r12.u(r4)
            L_0x0110:
                nI.a r4 = (nI.C17631a) r4
                r12.P()
                r7 = 0
                r8 = 32
                r5 = 0
                r6 = r12
                VB.C13753b.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x0126
                U0.C4895p.R()
            L_0x0126:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ZB.n.a.h(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            h((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8935A f118308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13877e f118309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8951o f118310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f118311d;

        b(C8935A a10, C13877e eVar, C8951o oVar, String str) {
            this.f118308a = a10;
            this.f118309b = eVar;
            this.f118310c = oVar;
            this.f118311d = str;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C8935A a10) {
            a10.i0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C13877e eVar, C8951o oVar, String str) {
            eVar.j(oVar, str);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(l0.C5507b r7, x4.C8948l r8, U0.C4889m r9, int r10) {
            /*
                r6 = this;
                java.lang.String r0 = "$this$composable"
                kotlin.jvm.internal.C17542s.j(r7, r0)
                java.lang.String r7 = "it"
                kotlin.jvm.internal.C17542s.j(r8, r7)
                boolean r7 = U0.C4895p.J()
                if (r7 == 0) goto L_0x0019
                r7 = -1
                java.lang.String r8 = "com.ingka.ikea.storedetails.impl.navigation.StoreDetailsNavHost.<anonymous>.<anonymous>.<anonymous> (StoreDetailsNavHost.kt:76)"
                r0 = 2083235693(0x7c2ba76d, float:3.5651142E36)
                U0.C4895p.S(r0, r10, r7, r8)
            L_0x0019:
                r7 = 802227460(0x2fd10504, float:3.8020442E-10)
                r9.W(r7)
                x4.A r7 = r6.f118308a
                boolean r7 = r9.F(r7)
                x4.A r8 = r6.f118308a
                java.lang.Object r10 = r9.D()
                if (r7 != 0) goto L_0x0035
                U0.m$a r7 = U0.C4889m.f14007a
                java.lang.Object r7 = r7.a()
                if (r10 != r7) goto L_0x003d
            L_0x0035:
                ZB.o r10 = new ZB.o
                r10.<init>(r8)
                r9.u(r10)
            L_0x003d:
                r0 = r10
                nI.a r0 = (nI.C17631a) r0
                r9.P()
                r7 = 802231268(0x2fd113e4, float:3.8031012E-10)
                r9.W(r7)
                ZB.e r7 = r6.f118309b
                boolean r7 = r9.F(r7)
                x4.o r8 = r6.f118310c
                boolean r8 = r9.F(r8)
                r7 = r7 | r8
                java.lang.String r8 = r6.f118311d
                boolean r8 = r9.V(r8)
                r7 = r7 | r8
                ZB.e r8 = r6.f118309b
                x4.o r10 = r6.f118310c
                java.lang.String r1 = r6.f118311d
                java.lang.Object r2 = r9.D()
                if (r7 != 0) goto L_0x0071
                U0.m$a r7 = U0.C4889m.f14007a
                java.lang.Object r7 = r7.a()
                if (r2 != r7) goto L_0x0079
            L_0x0071:
                ZB.p r2 = new ZB.p
                r2.<init>(r8, r10, r1)
                r9.u(r2)
            L_0x0079:
                r1 = r2
                nI.a r1 = (nI.C17631a) r1
                r9.P()
                r4 = 0
                r5 = 4
                r2 = 0
                r3 = r9
                aC.C13917b.b(r0, r1, r2, r3, r4, r5)
                boolean r7 = U0.C4895p.J()
                if (r7 == 0) goto L_0x008f
                U0.C4895p.R()
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ZB.n.b.c(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            c((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lx4/s;", "LXH/N;", "a", "(Lx4/s;)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l<s, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f118312c = new c();

        public c() {
            super(1);
        }

        public final void a(s sVar) {
            C17542s.j(sVar, "$this$null");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lx4/s;", "LXH/N;", "a", "(Lx4/s;)V"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<s, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f118313c = new d();

        public d() {
            super(1);
        }

        public final void a(s sVar) {
            C17542s.j(sVar, "$this$null");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s) obj);
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        if ((r32 & 8) != 0) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r26, x4.C8951o r27, ZB.C13877e r28, x4.C8935A r29, U0.C4889m r30, int r31, int r32) {
        /*
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r31
            java.lang.String r0 = "storeId"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "outerNavController"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "navigationContract"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            r0 = 1401344421(0x5386d1a5, float:1.15808574E12)
            r1 = r30
            U0.m r15 = r1.k(r0)
            r1 = r32 & 1
            r2 = 4
            if (r1 == 0) goto L_0x0028
            r1 = r9 | 6
            goto L_0x0038
        L_0x0028:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0037
            boolean r1 = r15.V(r6)
            if (r1 == 0) goto L_0x0034
            r1 = r2
            goto L_0x0035
        L_0x0034:
            r1 = 2
        L_0x0035:
            r1 = r1 | r9
            goto L_0x0038
        L_0x0037:
            r1 = r9
        L_0x0038:
            r3 = r32 & 2
            if (r3 == 0) goto L_0x003f
            r1 = r1 | 48
            goto L_0x004f
        L_0x003f:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x004f
            boolean r3 = r15.F(r7)
            if (r3 == 0) goto L_0x004c
            r3 = 32
            goto L_0x004e
        L_0x004c:
            r3 = 16
        L_0x004e:
            r1 = r1 | r3
        L_0x004f:
            r3 = r32 & 4
            r4 = 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x0058:
            r3 = r9 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0070
            r3 = r9 & 512(0x200, float:7.175E-43)
            if (r3 != 0) goto L_0x0065
            boolean r3 = r15.V(r8)
            goto L_0x0069
        L_0x0065:
            boolean r3 = r15.F(r8)
        L_0x0069:
            if (r3 == 0) goto L_0x006d
            r3 = r4
            goto L_0x006f
        L_0x006d:
            r3 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r1 = r1 | r3
        L_0x0070:
            r3 = r9 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0089
            r3 = r32 & 8
            if (r3 != 0) goto L_0x0083
            r3 = r29
            boolean r5 = r15.F(r3)
            if (r5 == 0) goto L_0x0085
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0083:
            r3 = r29
        L_0x0085:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r1 = r1 | r5
            goto L_0x008b
        L_0x0089:
            r3 = r29
        L_0x008b:
            r5 = r1 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r5 != r10) goto L_0x009f
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            r15.L()
            r4 = r3
            r0 = r15
            goto L_0x0164
        L_0x009f:
            r15.G()
            r5 = r9 & 1
            r10 = 0
            if (r5 == 0) goto L_0x00ba
            boolean r5 = r15.O()
            if (r5 == 0) goto L_0x00ae
            goto L_0x00ba
        L_0x00ae:
            r15.L()
            r5 = r32 & 8
            if (r5 == 0) goto L_0x00b7
        L_0x00b5:
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00b7:
            r11 = r1
            r14 = r3
            goto L_0x00c5
        L_0x00ba:
            r5 = r32 & 8
            if (r5 == 0) goto L_0x00b7
            x4.I[] r3 = new x4.I[r10]
            x4.A r3 = z4.m.e(r3, r15, r10)
            goto L_0x00b5
        L_0x00c5:
            r15.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00d4
            r1 = -1
            java.lang.String r3 = "com.ingka.ikea.storedetails.impl.navigation.StoreDetailsNavHost (StoreDetailsNavHost.kt:25)"
            U0.C4895p.S(r0, r11, r1, r3)
        L_0x00d4:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r15.Q(r0)
            r3 = r0
            android.content.Context r3 = (android.content.Context) r3
            com.ingka.ikea.storedetails.impl.navigation.StoreDetailRoutes$MapScreen r12 = new com.ingka.ikea.storedetails.impl.navigation.StoreDetailRoutes$MapScreen
            r12.<init>(r6)
            r0 = -141240994(0xfffffffff794d55e, float:-6.0374026E33)
            r15.W(r0)
            boolean r0 = r15.F(r7)
            r1 = r11 & 896(0x380, float:1.256E-42)
            r5 = 1
            if (r1 == r4) goto L_0x0100
            r1 = r11 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x00fe
            boolean r1 = r15.F(r8)
            if (r1 == 0) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            r1 = r10
            goto L_0x0101
        L_0x0100:
            r1 = r5
        L_0x0101:
            r0 = r0 | r1
            boolean r1 = r15.F(r3)
            r0 = r0 | r1
            boolean r1 = r15.F(r14)
            r0 = r0 | r1
            r1 = r11 & 14
            if (r1 != r2) goto L_0x0111
            r10 = r5
        L_0x0111:
            r0 = r0 | r10
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x0120
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0131
        L_0x0120:
            ZB.g r10 = new ZB.g
            r0 = r10
            r1 = r27
            r2 = r28
            r4 = r14
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r15.u(r10)
            r1 = r10
        L_0x0131:
            r21 = r1
            nI.l r21 = (nI.C17642l) r21
            r15.P()
            int r0 = r11 >> 9
            r23 = r0 & 14
            r24 = 0
            r25 = 2044(0x7fc, float:2.864E-42)
            r0 = 0
            r13 = 0
            r1 = 0
            r2 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r10 = r14
            r11 = r12
            r12 = r0
            r3 = r14
            r14 = r1
            r0 = r15
            r15 = r2
            r22 = r0
            z4.n.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0163
            U0.C4895p.R()
        L_0x0163:
            r4 = r3
        L_0x0164:
            U0.Y0 r10 = r0.n()
            if (r10 == 0) goto L_0x017d
            ZB.h r11 = new ZB.h
            r0 = r11
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r31
            r6 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.a(r11)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZB.n.c(java.lang.String, x4.o, ZB.e, x4.A, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C8951o oVar, C13877e eVar, Context context, C8935A a10, String str, y yVar) {
        y yVar2 = yVar;
        C17542s.j(yVar2, "$this$NavHost");
        Class<StoreDetailRoutes$MapScreen> cls = StoreDetailRoutes$MapScreen.class;
        List<q> e10 = C16877v.e(x4.t.a("ikea://navigation/store", P.b(cls), X.j(), c.f118312c));
        C5264a c10 = c1.c.c(-493904828, true, new a(oVar, eVar, context, a10, str));
        Class cls2 = e.class;
        f fVar = new f((e) yVar.l().d(cls2), P.b(cls), X.j(), c10);
        for (q g10 : e10) {
            fVar.g(g10);
        }
        fVar.l((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar.m((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar.n((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar.o((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar.p((C17642l<androidx.compose.animation.d<C8948l>, v>) null);
        yVar2.k(fVar);
        Class<StoreDetailRoutes$AllOpeningHours> cls3 = StoreDetailRoutes$AllOpeningHours.class;
        List<q> e11 = C16877v.e(x4.t.a("ikea://navigation/store", P.b(cls3), X.j(), d.f118313c));
        C8951o oVar2 = oVar;
        C13877e eVar2 = eVar;
        C8935A a11 = a10;
        C5264a c11 = c1.c.c(2083235693, true, new b(a10, eVar, oVar, str));
        f fVar2 = new f((e) yVar.l().d(cls2), P.b(cls3), X.j(), c11);
        for (q g11 : e11) {
            fVar2.g(g11);
        }
        fVar2.l((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar2.m((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar2.n((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar2.o((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar2.p((C17642l<androidx.compose.animation.d<C8948l>, v>) null);
        yVar2.k(fVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, C8951o oVar, C13877e eVar, C8935A a10, int i10, int i11, C4889m mVar, int i12) {
        c(str, oVar, eVar, a10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
