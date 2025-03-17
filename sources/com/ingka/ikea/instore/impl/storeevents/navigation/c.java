package com.ingka.ikea.instore.impl.storeevents.navigation;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import android.app.Activity;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import c1.C5264a;
import com.ingka.ikea.instore.impl.storeevents.ui.StoreEventsFragment;
import dH.C17158b;
import e.C5283f;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l0.C5507b;
import l0.v;
import nI.C17631a;
import nI.C17642l;
import nI.r;
import uI.C18055d;
import uI.C18068q;
import x4.C;
import x4.C8935A;
import x4.C8948l;
import x4.C8951o;
import x4.F;
import x4.I;
import x4.q;
import x4.s;
import x4.t;
import x4.y;
import z4.m;
import z4.n;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "storeId", "eventId", "Lcom/ingka/ikea/instore/impl/storeevents/ui/StoreEventsFragment;", "fragment", "Lkotlin/Function0;", "LXH/N;", "onCloseFeature", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/instore/impl/storeevents/ui/StoreEventsFragment;LnI/a;LU0/m;I)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8935A f96282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f96283b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f96284c;

        a(C8935A a10, String str, C17631a<C16807N> aVar) {
            this.f96282a = a10;
            this.f96283b = str;
            this.f96284c = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C8935A a10, String str, String str2) {
            C17542s.j(str2, "eventId");
            C8951o.f0(a10, new StoreEventsRoutes$EventDetails(str, str2), (C) null, (I.a) null, 6, (Object) null);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C8935A a10, C17631a aVar) {
            if (!a10.i0()) {
                aVar.invoke();
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(l0.C5507b r8, x4.C8948l r9, U0.C4889m r10, int r11) {
            /*
                r7 = this;
                java.lang.String r0 = "$this$composable"
                kotlin.jvm.internal.C17542s.j(r8, r0)
                java.lang.String r8 = "it"
                kotlin.jvm.internal.C17542s.j(r9, r8)
                boolean r8 = U0.C4895p.J()
                if (r8 == 0) goto L_0x0019
                r8 = -1
                java.lang.String r9 = "com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsNavHost.<anonymous>.<anonymous>.<anonymous> (StoreEventsNavHost.kt:50)"
                r0 = -1792484834(0xffffffff9528da1e, float:-3.4099394E-26)
                U0.C4895p.S(r0, r11, r8, r9)
            L_0x0019:
                r8 = 821669632(0x30f9af00, float:1.8166872E-9)
                r10.W(r8)
                x4.A r8 = r7.f96282a
                boolean r8 = r10.F(r8)
                java.lang.String r9 = r7.f96283b
                boolean r9 = r10.V(r9)
                r8 = r8 | r9
                x4.A r9 = r7.f96282a
                java.lang.String r11 = r7.f96283b
                java.lang.Object r0 = r10.D()
                if (r8 != 0) goto L_0x003e
                U0.m$a r8 = U0.C4889m.f14007a
                java.lang.Object r8 = r8.a()
                if (r0 != r8) goto L_0x0046
            L_0x003e:
                com.ingka.ikea.instore.impl.storeevents.navigation.a r0 = new com.ingka.ikea.instore.impl.storeevents.navigation.a
                r0.<init>(r9, r11)
                r10.u(r0)
            L_0x0046:
                r1 = r0
                nI.l r1 = (nI.C17642l) r1
                r10.P()
                r8 = 821674670(0x30f9c2ae, float:1.8172466E-9)
                r10.W(r8)
                x4.A r8 = r7.f96282a
                boolean r8 = r10.F(r8)
                nI.a<XH.N> r9 = r7.f96284c
                boolean r9 = r10.V(r9)
                r8 = r8 | r9
                x4.A r9 = r7.f96282a
                nI.a<XH.N> r11 = r7.f96284c
                java.lang.Object r0 = r10.D()
                if (r8 != 0) goto L_0x0071
                U0.m$a r8 = U0.C4889m.f14007a
                java.lang.Object r8 = r8.a()
                if (r0 != r8) goto L_0x0079
            L_0x0071:
                com.ingka.ikea.instore.impl.storeevents.navigation.b r0 = new com.ingka.ikea.instore.impl.storeevents.navigation.b
                r0.<init>(r9, r11)
                r10.u(r0)
            L_0x0079:
                r2 = r0
                nI.a r2 = (nI.C17631a) r2
                r10.P()
                r5 = 0
                r6 = 4
                r3 = 0
                r4 = r10
                Vt.l.c(r1, r2, r3, r4, r5, r6)
                boolean r8 = U0.C4895p.J()
                if (r8 == 0) goto L_0x008f
                U0.C4895p.R()
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.impl.storeevents.navigation.c.a.c(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            c((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8935A f96285a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f96286b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f96287c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f96288d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f96289e;

        b(C8935A a10, C17631a<C16807N> aVar, String str, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
            this.f96285a = a10;
            this.f96286b = aVar;
            this.f96287c = str;
            this.f96288d = aVar2;
            this.f96289e = aVar3;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C8935A a10, C17631a aVar) {
            if (!a10.i0()) {
                aVar.invoke();
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C8935A a10, String str, String str2, String str3) {
            C17542s.j(str2, "eventId");
            C17542s.j(str3, "timeSlotId");
            C8951o.f0(a10, new StoreEventsRoutes$EventSchedule(str, str2, str3), (C) null, (I.a) null, 6, (Object) null);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C8935A a10, String str, String str2, String str3) {
            C17542s.j(str2, "eventId");
            C17542s.j(str3, "timeSlotId");
            C8951o.f0(a10, new StoreEventsRoutes$EventSchedule(str, str2, str3), (C) null, (I.a) null, 6, (Object) null);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: nI.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: nI.p} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(l0.C5507b r13, x4.C8948l r14, U0.C4889m r15, int r16) {
            /*
                r12 = this;
                r0 = r12
                r8 = r15
                r1 = r16
                java.lang.String r2 = "$this$composable"
                r3 = r13
                kotlin.jvm.internal.C17542s.j(r13, r2)
                java.lang.String r2 = "navBackStackEntry"
                r3 = r14
                kotlin.jvm.internal.C17542s.j(r14, r2)
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x001f
                r2 = -1
                java.lang.String r4 = "com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsNavHost.<anonymous>.<anonymous>.<anonymous> (StoreEventsNavHost.kt:78)"
                r5 = 1813392981(0x6c162e55, float:7.262307E26)
                U0.C4895p.S(r5, r1, r2, r4)
            L_0x001f:
                r2 = 821705774(0x30fa3c2e, float:1.8206998E-9)
                r15.W(r2)
                x4.A r2 = r0.f96285a
                boolean r2 = r15.F(r2)
                nI.a<XH.N> r4 = r0.f96286b
                boolean r4 = r15.V(r4)
                r2 = r2 | r4
                x4.A r4 = r0.f96285a
                nI.a<XH.N> r5 = r0.f96286b
                java.lang.Object r6 = r15.D()
                if (r2 != 0) goto L_0x0044
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r6 != r2) goto L_0x004c
            L_0x0044:
                com.ingka.ikea.instore.impl.storeevents.navigation.d r6 = new com.ingka.ikea.instore.impl.storeevents.navigation.d
                r6.<init>(r4, r5)
                r15.u(r6)
            L_0x004c:
                r2 = r6
                nI.a r2 = (nI.C17631a) r2
                r15.P()
                r4 = 821711608(0x30fa52f8, float:1.8213475E-9)
                r15.W(r4)
                x4.A r4 = r0.f96285a
                boolean r4 = r15.F(r4)
                java.lang.String r5 = r0.f96287c
                boolean r5 = r15.V(r5)
                r4 = r4 | r5
                x4.A r5 = r0.f96285a
                java.lang.String r6 = r0.f96287c
                java.lang.Object r7 = r15.D()
                if (r4 != 0) goto L_0x0077
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r4 = r4.a()
                if (r7 != r4) goto L_0x007f
            L_0x0077:
                com.ingka.ikea.instore.impl.storeevents.navigation.e r7 = new com.ingka.ikea.instore.impl.storeevents.navigation.e
                r7.<init>(r5, r6)
                r15.u(r7)
            L_0x007f:
                r4 = r7
                nI.p r4 = (nI.p) r4
                r15.P()
                nI.a<XH.N> r5 = r0.f96288d
                nI.a<XH.N> r6 = r0.f96289e
                r7 = 821726936(0x30fa8ed8, float:1.8230493E-9)
                r15.W(r7)
                x4.A r7 = r0.f96285a
                boolean r7 = r15.F(r7)
                java.lang.String r9 = r0.f96287c
                boolean r9 = r15.V(r9)
                r7 = r7 | r9
                x4.A r9 = r0.f96285a
                java.lang.String r10 = r0.f96287c
                java.lang.Object r11 = r15.D()
                if (r7 != 0) goto L_0x00ae
                U0.m$a r7 = U0.C4889m.f14007a
                java.lang.Object r7 = r7.a()
                if (r11 != r7) goto L_0x00b6
            L_0x00ae:
                com.ingka.ikea.instore.impl.storeevents.navigation.f r11 = new com.ingka.ikea.instore.impl.storeevents.navigation.f
                r11.<init>(r9, r10)
                r15.u(r11)
            L_0x00b6:
                r7 = r11
                nI.p r7 = (nI.p) r7
                r15.P()
                int r1 = r1 >> 3
                r9 = r1 & 14
                r10 = 64
                r11 = 0
                r1 = r14
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r11
                r8 = r15
                Tt.e.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00d6
                U0.C4895p.R()
            L_0x00d6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.impl.storeevents.navigation.c.b.e(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            e((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.instore.impl.storeevents.navigation.c$c  reason: collision with other inner class name */
    static final class C2136c implements r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8935A f96290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f96291b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f96292c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f96293d;

        C2136c(C8935A a10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, String str) {
            this.f96290a = a10;
            this.f96291b = aVar;
            this.f96292c = aVar2;
            this.f96293d = str;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C8935A a10, String str) {
            rw.d.b(a10, "StoreEventScheduleTimeSlotRequestKey", str);
            a10.i0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C8935A a10, String str, String str2, String str3) {
            C17542s.j(str2, "eventId");
            C17542s.j(str3, "timeSlotId");
            C8951o.f0(a10, new StoreEventsRoutes$EventRegistration(str, str2, str3), (C) null, (I.a) null, 6, (Object) null);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(l0.C5507b r9, x4.C8948l r10, U0.C4889m r11, int r12) {
            /*
                r8 = this;
                java.lang.String r0 = "$this$composable"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                java.lang.String r9 = "it"
                kotlin.jvm.internal.C17542s.j(r10, r9)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0019
                r9 = -1
                java.lang.String r10 = "com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsNavHost.<anonymous>.<anonymous>.<anonymous> (StoreEventsNavHost.kt:109)"
                r0 = 1936296918(0x73698bd6, float:1.8503439E31)
                U0.C4895p.S(r0, r12, r9, r10)
            L_0x0019:
                r9 = 821742615(0x30facc17, float:1.82479E-9)
                r11.W(r9)
                x4.A r9 = r8.f96290a
                boolean r9 = r11.F(r9)
                x4.A r10 = r8.f96290a
                java.lang.Object r12 = r11.D()
                if (r9 != 0) goto L_0x0035
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r12 != r9) goto L_0x003d
            L_0x0035:
                com.ingka.ikea.instore.impl.storeevents.navigation.g r12 = new com.ingka.ikea.instore.impl.storeevents.navigation.g
                r12.<init>(r10)
                r11.u(r12)
            L_0x003d:
                r0 = r12
                nI.l r0 = (nI.C17642l) r0
                r11.P()
                nI.a<XH.N> r1 = r8.f96291b
                nI.a<XH.N> r2 = r8.f96292c
                r9 = 821752956(0x30faf47c, float:1.8259381E-9)
                r11.W(r9)
                x4.A r9 = r8.f96290a
                boolean r9 = r11.F(r9)
                java.lang.String r10 = r8.f96293d
                boolean r10 = r11.V(r10)
                r9 = r9 | r10
                x4.A r10 = r8.f96290a
                java.lang.String r12 = r8.f96293d
                java.lang.Object r3 = r11.D()
                if (r9 != 0) goto L_0x006c
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r3 != r9) goto L_0x0074
            L_0x006c:
                com.ingka.ikea.instore.impl.storeevents.navigation.h r3 = new com.ingka.ikea.instore.impl.storeevents.navigation.h
                r3.<init>(r10, r12)
                r11.u(r3)
            L_0x0074:
                nI.p r3 = (nI.p) r3
                r11.P()
                r6 = 0
                r7 = 16
                r4 = 0
                r5 = r11
                eu.c.c(r0, r1, r2, r3, r4, r5, r6, r7)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x008a
                U0.C4895p.R()
            L_0x008a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.impl.storeevents.navigation.c.C2136c.c(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            c((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8935A f96294a;

        d(C8935A a10) {
            this.f96294a = a10;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C8935A a10) {
            a10.i0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C8935A a10) {
            a10.i0();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: nI.a} */
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
                java.lang.String r8 = "com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsNavHost.<anonymous>.<anonymous>.<anonymous> (StoreEventsNavHost.kt:129)"
                r0 = 2059200855(0x7abce957, float:4.9044225E35)
                U0.C4895p.S(r0, r10, r7, r8)
            L_0x0019:
                r7 = 821768867(0x30fb32a3, float:1.8277045E-9)
                r9.W(r7)
                x4.A r7 = r6.f96294a
                boolean r7 = r9.F(r7)
                x4.A r8 = r6.f96294a
                java.lang.Object r10 = r9.D()
                if (r7 != 0) goto L_0x0035
                U0.m$a r7 = U0.C4889m.f14007a
                java.lang.Object r7 = r7.a()
                if (r10 != r7) goto L_0x003d
            L_0x0035:
                com.ingka.ikea.instore.impl.storeevents.navigation.i r10 = new com.ingka.ikea.instore.impl.storeevents.navigation.i
                r10.<init>(r8)
                r9.u(r10)
            L_0x003d:
                r0 = r10
                nI.a r0 = (nI.C17631a) r0
                r9.P()
                r7 = 821771267(0x30fb3c03, float:1.827971E-9)
                r9.W(r7)
                x4.A r7 = r6.f96294a
                boolean r7 = r9.F(r7)
                x4.A r8 = r6.f96294a
                java.lang.Object r10 = r9.D()
                if (r7 != 0) goto L_0x005f
                U0.m$a r7 = U0.C4889m.f14007a
                java.lang.Object r7 = r7.a()
                if (r10 != r7) goto L_0x0067
            L_0x005f:
                com.ingka.ikea.instore.impl.storeevents.navigation.j r10 = new com.ingka.ikea.instore.impl.storeevents.navigation.j
                r10.<init>(r8)
                r9.u(r10)
            L_0x0067:
                r1 = r10
                nI.a r1 = (nI.C17631a) r1
                r9.P()
                r4 = 0
                r5 = 4
                r2 = 0
                r3 = r9
                bu.n.p(r0, r1, r2, r3, r4, r5)
                boolean r7 = U0.C4895p.J()
                if (r7 == 0) goto L_0x007d
                U0.C4895p.R()
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.impl.storeevents.navigation.c.d.c(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            c((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lx4/s;", "LXH/N;", "a", "(Lx4/s;)V"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17642l<s, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f96295c = new e();

        public e() {
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
    public static final class f extends C17544u implements C17642l<s, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f96296c = new f();

        public f() {
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

    public static final void e(String str, String str2, StoreEventsFragment storeEventsFragment, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str3 = str;
        String str4 = str2;
        StoreEventsFragment storeEventsFragment2 = storeEventsFragment;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(str3, "storeId");
        C17542s.j(storeEventsFragment2, "fragment");
        C17542s.j(aVar2, "onCloseFeature");
        C4889m k10 = mVar.k(-56010467);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(storeEventsFragment2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? 2048 : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-56010467, i11, -1, "com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsNavHost (StoreEventsNavHost.kt:33)");
            }
            k10.W(-229244932);
            Object D10 = k10.D();
            C4889m.a aVar3 = C4889m.f14007a;
            if (D10 == aVar3.a()) {
                D10 = ((Yt.a) C17158b.c(storeEventsFragment2, Yt.a.class)).Q();
                k10.u(D10);
            }
            Ht.c cVar = (Ht.c) D10;
            k10.P();
            C8935A e10 = m.e(new I[0], k10, 0);
            Object storeEventsRoutes$EventDetails = str4 != null ? new StoreEventsRoutes$EventDetails(str3, str4) : new StoreEventsRoutes$AllEvents(str3);
            Activity activity = (Activity) k10.Q(C5283f.a());
            k10.W(-229227768);
            boolean z10 = true;
            boolean F10 = k10.F(e10) | ((i11 & 14) == 4) | ((i11 & 7168) == 2048) | k10.F(cVar) | k10.F(activity);
            if ((i11 & 896) != 256) {
                z10 = false;
            }
            boolean z11 = F10 | z10;
            Object D11 = k10.D();
            if (z11 || D11 == aVar3.a()) {
                Activity activity2 = activity;
                Yt.b bVar = r0;
                Yt.b bVar2 = new Yt.b(e10, str, aVar, cVar, activity2, storeEventsFragment);
                k10.u(bVar);
                D11 = bVar;
            }
            k10.P();
            mVar2 = k10;
            n.a(e10, storeEventsRoutes$EventDetails, (androidx.compose.ui.d) null, (C5437c) null, (C18055d<?>) null, (Map<C18068q, F<?>>) null, (C17642l<androidx.compose.animation.d<C8948l>, i>) null, (C17642l<androidx.compose.animation.d<C8948l>, k>) null, (C17642l<androidx.compose.animation.d<C8948l>, i>) null, (C17642l<androidx.compose.animation.d<C8948l>, k>) null, (C17642l<androidx.compose.animation.d<C8948l>, v>) null, (C17642l) D11, mVar2, 0, 0, 2044);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new Yt.c(str, str2, storeEventsFragment, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C8935A a10, String str, C17631a aVar, Ht.c cVar, Activity activity, StoreEventsFragment storeEventsFragment, y yVar) {
        C8935A a11 = a10;
        String str2 = str;
        Ht.c cVar2 = cVar;
        y yVar2 = yVar;
        C17542s.j(yVar2, "$this$NavHost");
        Class<StoreEventsRoutes$AllEvents> cls = StoreEventsRoutes$AllEvents.class;
        List<q> e10 = C16877v.e(t.a("ikea://navigation/store_events/all_events", P.b(cls), X.j(), e.f96295c));
        C5264a c10 = c1.c.c(-1792484834, true, new a(a11, str2, aVar));
        Class cls2 = z4.e.class;
        z4.f fVar = new z4.f((z4.e) yVar.l().d(cls2), P.b(cls), X.j(), c10);
        for (q g10 : e10) {
            fVar.g(g10);
        }
        fVar.l((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar.m((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar.n((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar.o((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar.p((C17642l<androidx.compose.animation.d<C8948l>, v>) null);
        yVar2.k(fVar);
        Yt.d dVar = new Yt.d(cVar2, activity);
        Yt.e eVar = new Yt.e(cVar2, storeEventsFragment);
        Class<StoreEventsRoutes$EventDetails> cls3 = StoreEventsRoutes$EventDetails.class;
        List<q> e11 = C16877v.e(t.a(StoreEventsRoutes$EventDetails.Companion.a(), P.b(cls3), X.j(), f.f96296c));
        b bVar = r0;
        b bVar2 = new b(a10, aVar, str, dVar, eVar);
        C5264a c11 = c1.c.c(1813392981, true, bVar);
        z4.f fVar2 = new z4.f((z4.e) yVar.l().d(cls2), P.b(cls3), X.j(), c11);
        for (q g11 : e11) {
            fVar2.g(g11);
        }
        fVar2.l((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar2.m((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar2.n((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar2.o((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar2.p((C17642l<androidx.compose.animation.d<C8948l>, v>) null);
        yVar2.k(fVar2);
        C5264a c12 = c1.c.c(1936296918, true, new C2136c(a11, dVar, eVar, str2));
        Map j10 = X.j();
        List<q> n10 = C16877v.n();
        z4.f fVar3 = new z4.f((z4.e) yVar.l().d(cls2), P.b(StoreEventsRoutes$EventSchedule.class), j10, c12);
        for (q g12 : n10) {
            fVar3.g(g12);
        }
        fVar3.l((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar3.m((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar3.n((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar3.o((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar3.p((C17642l<androidx.compose.animation.d<C8948l>, v>) null);
        yVar2.k(fVar3);
        C5264a c13 = c1.c.c(2059200855, true, new d(a11));
        Map j11 = X.j();
        List<q> n11 = C16877v.n();
        z4.f fVar4 = new z4.f((z4.e) yVar.l().d(cls2), P.b(StoreEventsRoutes$EventRegistration.class), j11, c13);
        for (q g13 : n11) {
            fVar4.g(g13);
        }
        fVar4.l((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar4.m((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar4.n((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar4.o((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar4.p((C17642l<androidx.compose.animation.d<C8948l>, v>) null);
        yVar2.k(fVar4);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Ht.c cVar, Activity activity) {
        C17542s.g(activity);
        cVar.d(activity);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(Ht.c cVar, StoreEventsFragment storeEventsFragment) {
        cVar.f(androidx.navigation.fragment.a.a(storeEventsFragment));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(String str, String str2, StoreEventsFragment storeEventsFragment, C17631a aVar, int i10, C4889m mVar, int i11) {
        e(str, str2, storeEventsFragment, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
