package sF;

import A1.B;
import A1.C4336c;
import A1.C4349p;
import A1.K;
import XH.C16807N;
import android.view.MotionEvent;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.s;
import o1.C5667g;
import p0.t;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032*\u0010\t\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005H@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\u0007*\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LA1/K;", "", "panZoomLock", "", "minimumTouchPoints", "Lkotlin/Function5;", "Lo1/g;", "", "LXH/N;", "onGesture", "b", "(LA1/K;ZILnI/s;LdI/e;)Ljava/lang/Object;", "LA1/p;", "a", "(LA1/p;)F", "Landroid/view/MotionEvent$PointerCoords;", "d", "(J)Landroid/view/MotionEvent$PointerCoords;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.compose.util.MultiTouchTransformGestureKt$detectMultiTouchTransformGestures$2", f = "MultiTouchTransformGesture.kt", l = {49, 51}, m = "invokeSuspend")
    static final class a extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        float f130985d;

        /* renamed from: e  reason: collision with root package name */
        float f130986e;

        /* renamed from: f  reason: collision with root package name */
        float f130987f;

        /* renamed from: g  reason: collision with root package name */
        long f130988g;

        /* renamed from: h  reason: collision with root package name */
        int f130989h;

        /* renamed from: i  reason: collision with root package name */
        int f130990i;

        /* renamed from: j  reason: collision with root package name */
        int f130991j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f130992k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f130993l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f130994m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ s<C5667g, C5667g, Float, Float, Float, C16807N> f130995n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, boolean z10, s<? super C5667g, ? super C5667g, ? super Float, ? super Float, ? super Float, C16807N> sVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f130993l = i10;
            this.f130994m = z10;
            this.f130995n = sVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f130993l, this.f130994m, this.f130995n, eVar);
            aVar.f130992k = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: A1.c} */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0150, code lost:
            if (o1.C5667g.j(r10, o1.C5667g.f26701b.c()) == false) goto L_0x015a;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0130  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0196  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x00be A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                r31 = this;
                r6 = r31
                java.lang.Object r7 = eI.C17187b.f()
                int r0 = r6.f130991j
                r8 = 1065353216(0x3f800000, float:1.0)
                r9 = 0
                r10 = 2
                r11 = 0
                r12 = 1
                if (r0 == 0) goto L_0x0047
                if (r0 == r12) goto L_0x0033
                if (r0 != r10) goto L_0x002b
                int r0 = r6.f130990i
                float r1 = r6.f130987f
                int r2 = r6.f130989h
                long r3 = r6.f130988g
                float r5 = r6.f130986e
                float r13 = r6.f130985d
                java.lang.Object r14 = r6.f130992k
                A1.c r14 = (A1.C4336c) r14
                XH.y.b(r32)
                r15 = r32
                goto L_0x00a0
            L_0x002b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0033:
                int r0 = r6.f130990i
                float r1 = r6.f130987f
                int r2 = r6.f130989h
                long r3 = r6.f130988g
                float r5 = r6.f130986e
                float r13 = r6.f130985d
                java.lang.Object r14 = r6.f130992k
                A1.c r14 = (A1.C4336c) r14
                XH.y.b(r32)
                goto L_0x0088
            L_0x0047:
                XH.y.b(r32)
                java.lang.Object r0 = r6.f130992k
                r14 = r0
                A1.c r14 = (A1.C4336c) r14
                o1.g$a r0 = o1.C5667g.f26701b
                long r4 = r0.c()
                androidx.compose.ui.platform.w1 r0 = r14.getViewConfiguration()
                float r13 = r0.g()
                r6.f130992k = r14
                r6.f130985d = r9
                r6.f130986e = r8
                r6.f130988g = r4
                r6.f130989h = r11
                r6.f130987f = r13
                r6.f130990i = r11
                r6.f130991j = r12
                r1 = 0
                r2 = 0
                r15 = 2
                r16 = 0
                r0 = r14
                r3 = r31
                r17 = r4
                r4 = r15
                r5 = r16
                java.lang.Object r0 = p0.G.e(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x0081
                return r7
            L_0x0081:
                r5 = r8
                r0 = r11
                r2 = r0
                r1 = r13
                r3 = r17
                r13 = r9
            L_0x0088:
                r6.f130992k = r14
                r6.f130985d = r13
                r6.f130986e = r5
                r6.f130988g = r3
                r6.f130989h = r2
                r6.f130987f = r1
                r6.f130990i = r0
                r6.f130991j = r10
                r15 = 0
                java.lang.Object r15 = A1.C4336c.J1(r14, r15, r6, r12, r15)
                if (r15 != r7) goto L_0x00a0
                return r7
            L_0x00a0:
                A1.p r15 = (A1.C4349p) r15
                java.util.List r8 = r15.c()
                int r9 = r8.size()
                r12 = r11
            L_0x00ab:
                if (r12 >= r9) goto L_0x00be
                java.lang.Object r19 = r8.get(r12)
                A1.B r19 = (A1.B) r19
                boolean r19 = r19.p()
                if (r19 == 0) goto L_0x00bb
                r8 = 1
                goto L_0x00bf
            L_0x00bb:
                int r12 = r12 + 1
                goto L_0x00ab
            L_0x00be:
                r8 = r11
            L_0x00bf:
                java.util.List r9 = r15.c()
                int r9 = r9.size()
                int r12 = r6.f130993l
                int r12 = java.lang.Math.max(r12, r10)
                if (r9 < r12) goto L_0x01a0
                if (r8 != 0) goto L_0x01a0
                float r9 = p0.K.f(r15)
                float r12 = p0.K.e(r15)
                long r10 = p0.K.d(r15)
                if (r2 != 0) goto L_0x0128
                float r5 = r5 * r9
                float r13 = r13 + r12
                long r3 = o1.C5667g.r(r3, r10)
                r32 = r0
                r0 = 0
                float r21 = p0.K.c(r15, r0)
                r18 = r2
                r0 = 1
                float r2 = (float) r0
                float r2 = r2 - r5
                float r2 = java.lang.Math.abs(r2)
                float r2 = r2 * r21
                r22 = 1078530011(0x40490fdb, float:3.1415927)
                float r22 = r22 * r13
                float r22 = r22 * r21
                r21 = 1127481344(0x43340000, float:180.0)
                float r22 = r22 / r21
                float r21 = java.lang.Math.abs(r22)
                float r22 = o1.C5667g.k(r3)
                int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r2 > 0) goto L_0x011a
                int r2 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
                if (r2 > 0) goto L_0x011a
                int r2 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x0117
                goto L_0x011a
            L_0x0117:
                r2 = r32
                goto L_0x012e
            L_0x011a:
                boolean r2 = r6.f130994m
                if (r2 == 0) goto L_0x0124
                int r2 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x0124
                r2 = r0
                goto L_0x0125
            L_0x0124:
                r2 = 0
            L_0x0125:
                r18 = r0
                goto L_0x012e
            L_0x0128:
                r32 = r0
                r18 = r2
                r0 = 1
                goto L_0x0117
            L_0x012e:
                if (r18 == 0) goto L_0x0196
                r0 = 0
                long r22 = p0.K.b(r15, r0)
                if (r2 == 0) goto L_0x0138
                r12 = 0
            L_0x0138:
                r17 = 0
                int r20 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
                if (r20 != 0) goto L_0x0156
                r16 = 1065353216(0x3f800000, float:1.0)
                int r20 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
                if (r20 != 0) goto L_0x0153
                o1.g$a r20 = o1.C5667g.f26701b
                r24 = r1
                long r0 = r20.c()
                boolean r0 = o1.C5667g.j(r10, r0)
                if (r0 != 0) goto L_0x0179
                goto L_0x015a
            L_0x0153:
                r24 = r1
                goto L_0x015a
            L_0x0156:
                r24 = r1
                r16 = 1065353216(0x3f800000, float:1.0)
            L_0x015a:
                nI.s<o1.g, o1.g, java.lang.Float, java.lang.Float, java.lang.Float, XH.N> r0 = r6.f130995n
                o1.g r26 = o1.C5667g.d(r22)
                o1.g r27 = o1.C5667g.d(r10)
                java.lang.Float r28 = kotlin.coroutines.jvm.internal.b.d(r9)
                java.lang.Float r29 = kotlin.coroutines.jvm.internal.b.d(r12)
                float r1 = sF.g.a(r15)
                java.lang.Float r30 = kotlin.coroutines.jvm.internal.b.d(r1)
                r25 = r0
                r25.z(r26, r27, r28, r29, r30)
            L_0x0179:
                java.util.List r0 = r15.c()
                int r1 = r0.size()
                r9 = 0
            L_0x0182:
                if (r9 >= r1) goto L_0x019c
                java.lang.Object r10 = r0.get(r9)
                A1.B r10 = (A1.B) r10
                boolean r11 = A1.C4350q.j(r10)
                if (r11 == 0) goto L_0x0193
                r10.a()
            L_0x0193:
                int r9 = r9 + 1
                goto L_0x0182
            L_0x0196:
                r24 = r1
                r16 = 1065353216(0x3f800000, float:1.0)
                r17 = 0
            L_0x019c:
                r0 = r2
            L_0x019d:
                r2 = r18
                goto L_0x01ad
            L_0x01a0:
                r32 = r0
                r24 = r1
                r18 = r2
                r16 = 1065353216(0x3f800000, float:1.0)
                r17 = 0
                r0 = r32
                goto L_0x019d
            L_0x01ad:
                if (r8 != 0) goto L_0x01d4
                java.util.List r1 = r15.c()
                int r8 = r1.size()
                r9 = 0
            L_0x01b8:
                if (r9 >= r8) goto L_0x01d4
                java.lang.Object r10 = r1.get(r9)
                A1.B r10 = (A1.B) r10
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x01d1
                r8 = r16
                r9 = r17
                r1 = r24
                r10 = 2
                r11 = 0
                r12 = 1
                goto L_0x0088
            L_0x01d1:
                int r9 = r9 + 1
                goto L_0x01b8
            L_0x01d4:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sF.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final float a(C4349p pVar) {
        C17542s.j(pVar, "<this>");
        List<B> c10 = pVar.c();
        int size = c10.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= size) {
                break;
            }
            B b10 = c10.get(i10);
            if (!b10.l() || !b10.i()) {
                i12 = 0;
            }
            i11 += i12;
            i10++;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        long h10 = pVar.c().get(0).h();
        long h11 = pVar.c().get(1).h();
        long k10 = pVar.c().get(0).k();
        long k11 = pVar.c().get(1).k();
        return (float) ((Math.atan2((double) (C5667g.n(k11) - C5667g.n(k10)), (double) (C5667g.m(k11) - C5667g.m(k10))) - Math.atan2((double) (C5667g.n(h11) - C5667g.n(h10)), (double) (C5667g.m(h11) - C5667g.m(h10)))) * ((double) 2.0f));
    }

    public static final Object b(K k10, boolean z10, int i10, s<? super C5667g, ? super C5667g, ? super Float, ? super Float, ? super Float, C16807N> sVar, C17164e<? super C16807N> eVar) {
        Object c10 = t.c(k10, new a(i10, z10, sVar, (C17164e<? super a>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public static /* synthetic */ Object c(K k10, boolean z10, int i10, s sVar, C17164e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return b(k10, z10, i10, sVar, eVar);
    }

    public static final MotionEvent.PointerCoords d(long j10) {
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.x = C5667g.m(j10);
        pointerCoords.y = C5667g.n(j10);
        return pointerCoords;
    }
}
