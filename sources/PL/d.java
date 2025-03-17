package pl;

import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.r;
import dI.C17164e;
import eI.C17187b;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import u0.C5974I;
import u0.C5987k;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u0002"}, d2 = {"Landroidx/lifecycle/r;", "lifecycle", "Lkotlin/Function0;", "LXH/N;", "onComponentSeen", "d", "(Landroidx/lifecycle/r;LnI/a;LU0/m;II)V", "", "key", "Lu0/I;", "lazyGridState", "e", "(Ljava/lang/Object;Lu0/I;LnI/a;Landroidx/lifecycle/r;LU0/m;II)V", "Landroidx/lifecycle/r$b;", "lifecycleState", "", "isItemWithKeyInView", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.uicomposables.analytics.TrackComponentImpressionKt$TrackComponentImpression$1$1", f = "TrackComponentImpression.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101348c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f101349d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<r.b> f101350e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<C16807N> aVar, A1<? extends r.b> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f101349d = aVar;
            this.f101350e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f101349d, this.f101350e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101348c == 0) {
                y.b(obj);
                if (d.f(this.f101350e) == r.b.RESUMED) {
                    this.f101349d.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.uicomposables.analytics.TrackComponentImpressionKt$TrackComponentImpression$6$1", f = "TrackComponentImpression.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101351c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f101352d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<r.b> f101353e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f101354f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17631a<C16807N> aVar, A1<? extends r.b> a12, A1<Boolean> a13, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f101352d = aVar;
            this.f101353e = a12;
            this.f101354f = a13;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f101352d, this.f101353e, this.f101354f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101351c == 0) {
                y.b(obj);
                if (d.i(this.f101353e) == r.b.RESUMED && d.h(this.f101354f)) {
                    this.f101352d.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.uicomposables.analytics.TrackComponentImpressionKt$TrackComponentImpression$7$1", f = "TrackComponentImpression.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101355c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f101356d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f101357e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17631a<C16807N> aVar, A1<Boolean> a12, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f101356d = aVar;
            this.f101357e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f101356d, this.f101357e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101355c == 0) {
                y.b(obj);
                if (d.h(this.f101357e)) {
                    this.f101356d.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        if ((r12 & 1) != 0) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.lifecycle.r r8, nI.C17631a<XH.C16807N> r9, U0.C4889m r10, int r11, int r12) {
        /*
            java.lang.String r0 = "onComponentSeen"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = -1657676176(0xffffffff9d31de70, float:-2.3540752E-21)
            U0.m r10 = r10.k(r0)
            r1 = r11 & 6
            if (r1 != 0) goto L_0x001f
            r1 = r12 & 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r10.F(r8)
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r11
            goto L_0x0020
        L_0x001f:
            r1 = r11
        L_0x0020:
            r2 = r12 & 2
            r3 = 32
            if (r2 == 0) goto L_0x0029
            r1 = r1 | 48
            goto L_0x0038
        L_0x0029:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0038
            boolean r2 = r10.F(r9)
            if (r2 == 0) goto L_0x0035
            r2 = r3
            goto L_0x0037
        L_0x0035:
            r2 = 16
        L_0x0037:
            r1 = r1 | r2
        L_0x0038:
            r2 = r1 & 19
            r4 = 18
            if (r2 != r4) goto L_0x004a
            boolean r2 = r10.l()
            if (r2 != 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            r10.L()
            goto L_0x00cc
        L_0x004a:
            r10.G()
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0062
            boolean r2 = r10.O()
            if (r2 == 0) goto L_0x0058
            goto L_0x0062
        L_0x0058:
            r10.L()
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0075
        L_0x005f:
            r1 = r1 & -15
            goto L_0x0075
        L_0x0062:
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0075
            U0.I0 r8 = j3.g.a()
            java.lang.Object r8 = r10.Q(r8)
            androidx.lifecycle.y r8 = (androidx.lifecycle.C5221y) r8
            androidx.lifecycle.r r8 = r8.getLifecycle()
            goto L_0x005f
        L_0x0075:
            r10.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0084
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.uicomposables.analytics.TrackComponentImpression (TrackComponentImpression.kt:32)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0084:
            TJ.P r0 = r8.e()
            r2 = 0
            r4 = 0
            r5 = 1
            U0.A1 r0 = U0.p1.b(r0, r2, r10, r4, r5)
            androidx.lifecycle.r$b r6 = f(r0)
            r7 = 1608202593(0x5fdb3961, float:3.1593528E19)
            r10.W(r7)
            boolean r7 = r10.V(r0)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r5 = r4
        L_0x00a3:
            r1 = r7 | r5
            java.lang.Object r3 = r10.D()
            if (r1 != 0) goto L_0x00b3
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x00bb
        L_0x00b3:
            pl.d$a r3 = new pl.d$a
            r3.<init>(r9, r0, r2)
            r10.u(r3)
        L_0x00bb:
            nI.p r3 = (nI.p) r3
            r10.P()
            U0.P.g(r6, r3, r10, r4)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00cc
            U0.C4895p.R()
        L_0x00cc:
            U0.Y0 r10 = r10.n()
            if (r10 == 0) goto L_0x00da
            pl.a r0 = new pl.a
            r0.<init>(r8, r9, r11, r12)
            r10.a(r0)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.d.d(androidx.lifecycle.r, nI.a, U0.m, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a6, code lost:
        if ((r22 & 8) != 0) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.Object r16, u0.C5974I r17, nI.C17631a<XH.C16807N> r18, androidx.lifecycle.r r19, U0.C4889m r20, int r21, int r22) {
        /*
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "lazyGridState"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onComponentSeen"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r0 = -1103167387(0xffffffffbe3f0065, float:-0.18652494)
            r4 = r20
            U0.m r4 = r4.k(r0)
            r6 = r22 & 1
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
            r7 = r22 & 2
            if (r7 == 0) goto L_0x003e
            r6 = r6 | 48
            goto L_0x004e
        L_0x003e:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x004e
            boolean r7 = r4.V(r2)
            if (r7 == 0) goto L_0x004b
            r7 = 32
            goto L_0x004d
        L_0x004b:
            r7 = 16
        L_0x004d:
            r6 = r6 | r7
        L_0x004e:
            r7 = r22 & 4
            r8 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0057
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0057:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0066
            boolean r7 = r4.F(r3)
            if (r7 == 0) goto L_0x0063
            r7 = r8
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r6 = r6 | r7
        L_0x0066:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x007f
            r7 = r22 & 8
            if (r7 != 0) goto L_0x0079
            r7 = r19
            boolean r9 = r4.F(r7)
            if (r9 == 0) goto L_0x007b
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x0079:
            r7 = r19
        L_0x007b:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r6 = r6 | r9
            goto L_0x0081
        L_0x007f:
            r7 = r19
        L_0x0081:
            r9 = r6 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0093
            boolean r9 = r4.l()
            if (r9 != 0) goto L_0x008e
            goto L_0x0093
        L_0x008e:
            r4.L()
            goto L_0x0184
        L_0x0093:
            r4.G()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x00ab
            boolean r9 = r4.O()
            if (r9 == 0) goto L_0x00a1
            goto L_0x00ab
        L_0x00a1:
            r4.L()
            r9 = r22 & 8
            if (r9 == 0) goto L_0x00be
        L_0x00a8:
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x00be
        L_0x00ab:
            r9 = r22 & 8
            if (r9 == 0) goto L_0x00be
            U0.I0 r7 = j3.g.a()
            java.lang.Object r7 = r4.Q(r7)
            androidx.lifecycle.y r7 = (androidx.lifecycle.C5221y) r7
            androidx.lifecycle.r r7 = r7.getLifecycle()
            goto L_0x00a8
        L_0x00be:
            r4.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00cd
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.app.uicomposables.analytics.TrackComponentImpression (TrackComponentImpression.kt:101)"
            U0.C4895p.S(r0, r6, r9, r10)
        L_0x00cd:
            r0 = 1608281178(0x5fdc6c5a, float:3.1766338E19)
            r4.W(r0)
            java.lang.Object r0 = r4.D()
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r10 = r9.a()
            if (r0 != r10) goto L_0x00eb
            pl.b r0 = new pl.b
            r0.<init>(r2, r1)
            U0.A1 r0 = U0.p1.e(r0)
            r4.u(r0)
        L_0x00eb:
            U0.A1 r0 = (U0.A1) r0
            r4.P()
            r10 = 0
            r11 = 0
            r12 = 1
            if (r7 == 0) goto L_0x0141
            r13 = -1682699700(0xffffffff9bb40a4c, float:-2.9785156E-22)
            r4.W(r13)
            TJ.P r13 = r7.e()
            U0.A1 r13 = U0.p1.b(r13, r10, r4, r11, r12)
            androidx.lifecycle.r$b r14 = i(r13)
            boolean r15 = h(r0)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r12 = 1608291560(0x5fdc94e8, float:3.1789168E19)
            r4.W(r12)
            boolean r12 = r4.V(r13)
            r6 = r6 & 896(0x380, float:1.256E-42)
            if (r6 != r8) goto L_0x011f
            r6 = 1
            goto L_0x0120
        L_0x011f:
            r6 = r11
        L_0x0120:
            r6 = r6 | r12
            java.lang.Object r8 = r4.D()
            if (r6 != 0) goto L_0x012d
            java.lang.Object r6 = r9.a()
            if (r8 != r6) goto L_0x0135
        L_0x012d:
            pl.d$b r8 = new pl.d$b
            r8.<init>(r3, r13, r0, r10)
            r4.u(r8)
        L_0x0135:
            nI.p r8 = (nI.p) r8
            r4.P()
            U0.P.f(r14, r15, r8, r4, r11)
            r4.P()
            goto L_0x017b
        L_0x0141:
            r12 = -1682415213(0xffffffff9bb86193, float:-3.0503302E-22)
            r4.W(r12)
            boolean r12 = h(r0)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r13 = 1608297947(0x5fdcaddb, float:3.1803213E19)
            r4.W(r13)
            r6 = r6 & 896(0x380, float:1.256E-42)
            if (r6 != r8) goto L_0x015b
            r6 = 1
            goto L_0x015c
        L_0x015b:
            r6 = r11
        L_0x015c:
            java.lang.Object r8 = r4.D()
            if (r6 != 0) goto L_0x0168
            java.lang.Object r6 = r9.a()
            if (r8 != r6) goto L_0x0170
        L_0x0168:
            pl.d$c r8 = new pl.d$c
            r8.<init>(r3, r0, r10)
            r4.u(r8)
        L_0x0170:
            nI.p r8 = (nI.p) r8
            r4.P()
            U0.P.g(r12, r8, r4, r11)
            r4.P()
        L_0x017b:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0184
            U0.C4895p.R()
        L_0x0184:
            U0.Y0 r8 = r4.n()
            if (r8 == 0) goto L_0x019e
            pl.c r9 = new pl.c
            r0 = r9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r7
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.a(r9)
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.d.e(java.lang.Object, u0.I, nI.a, androidx.lifecycle.r, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final r.b f(A1<? extends r.b> a12) {
        return (r.b) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final boolean g(C5974I i10, Object obj) {
        Iterable<C5987k> i11 = i10.v().i();
        if ((i11 instanceof Collection) && ((Collection) i11).isEmpty()) {
            return false;
        }
        for (C5987k key : i11) {
            if (C17542s.e(key.getKey(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean h(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final r.b i(A1<? extends r.b> a12) {
        return (r.b) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N j(Object obj, C5974I i10, C17631a aVar, r rVar, int i11, int i12, C4889m mVar, int i13) {
        e(obj, i10, aVar, rVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(r rVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        d(rVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
