package rK;

import A1.C4336c;
import A1.P;
import SJ.C16434j;
import androidx.compose.ui.platform.w1;
import c2.h;
import c2.y;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.C17642l;
import o1.C5667g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0016\u001a\u00020\u0014*\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LA1/c;", "", "panZoomLock", "LSJ/j;", "LrK/z;", "channel", "Lkotlin/Function1;", "Lo1/g;", "canPan", "LB1/d;", "velocityTracker", "LXH/N;", "d", "(LA1/c;ZLSJ/j;LnI/l;LB1/d;LdI/e;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/w1;", "LA1/P;", "pointerType", "", "e", "(Landroidx/compose/ui/platform/w1;I)F", "Lc2/y;", "maximumVelocity", "c", "(LB1/d;J)J", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.B  reason: case insensitive filesystem */
public final class C17861B {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "me.saket.telephoto.zoomable.internal.TransformableKt", f = "transformable.kt", l = {199, 201, 254}, m = "detectZoom")
    /* renamed from: rK.B$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146683c;

        /* renamed from: d  reason: collision with root package name */
        Object f146684d;

        /* renamed from: e  reason: collision with root package name */
        Object f146685e;

        /* renamed from: f  reason: collision with root package name */
        Object f146686f;

        /* renamed from: g  reason: collision with root package name */
        Object f146687g;

        /* renamed from: h  reason: collision with root package name */
        boolean f146688h;

        /* renamed from: i  reason: collision with root package name */
        float f146689i;

        /* renamed from: j  reason: collision with root package name */
        float f146690j;

        /* renamed from: k  reason: collision with root package name */
        long f146691k;

        /* renamed from: l  reason: collision with root package name */
        long f146692l;

        /* renamed from: m  reason: collision with root package name */
        int f146693m;

        /* renamed from: n  reason: collision with root package name */
        int f146694n;

        /* renamed from: o  reason: collision with root package name */
        int f146695o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f146696p;

        /* renamed from: q  reason: collision with root package name */
        int f146697q;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f146696p = obj;
            this.f146697q |= Integer.MIN_VALUE;
            return C17861B.d((C4336c) null, false, (C16434j<z>) null, (C17642l<? super C5667g, Boolean>) null, (B1.d) null, this);
        }
    }

    /* access modifiers changed from: private */
    public static final long c(B1.d dVar, long j10) {
        long c10 = dVar.c(j10);
        return (Float.isNaN(y.h(c10)) || Float.isNaN(y.i(c10))) ? j10 : c10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x029d, code lost:
        if (r11.invoke(o1.C5667g.d(r0)).booleanValue() != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0367, code lost:
        if (r18 != 0) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0369, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0183 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x036e A[EDGE_INSN: B:116:0x036e->B:96:0x036e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03a2 A[EDGE_INSN: B:118:0x03a2->B:105:0x03a2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x035b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(A1.C4336c r37, boolean r38, SJ.C16434j<rK.z> r39, nI.C17642l<? super o1.C5667g, java.lang.Boolean> r40, B1.d r41, dI.C17164e<? super XH.C16807N> r42) {
        /*
            r0 = r42
            boolean r1 = r0 instanceof rK.C17861B.a
            if (r1 == 0) goto L_0x0015
            r1 = r0
            rK.B$a r1 = (rK.C17861B.a) r1
            int r2 = r1.f146697q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f146697q = r2
            goto L_0x001a
        L_0x0015:
            rK.B$a r1 = new rK.B$a
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.f146696p
            java.lang.Object r8 = eI.C17187b.f()
            int r2 = r1.f146697q
            r10 = 3
            r11 = 2
            r15 = 1
            if (r2 == 0) goto L_0x00d5
            if (r2 == r15) goto L_0x00af
            if (r2 == r11) goto L_0x0078
            if (r2 != r10) goto L_0x0070
            int r2 = r1.f146695o
            long r3 = r1.f146692l
            int r5 = r1.f146694n
            int r6 = r1.f146693m
            long r10 = r1.f146691k
            float r7 = r1.f146690j
            float r13 = r1.f146689i
            boolean r15 = r1.f146688h
            java.lang.Object r14 = r1.f146687g
            A1.p r14 = (A1.C4349p) r14
            java.lang.Object r9 = r1.f146686f
            B1.d r9 = (B1.d) r9
            java.lang.Object r12 = r1.f146685e
            nI.l r12 = (nI.C17642l) r12
            r37 = r2
            java.lang.Object r2 = r1.f146684d
            SJ.j r2 = (SJ.C16434j) r2
            r38 = r2
            java.lang.Object r2 = r1.f146683c
            A1.c r2 = (A1.C4336c) r2
            XH.y.b(r0)
            r19 = r5
            r18 = r6
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r5 = r3
            r3 = r38
            r4 = r0
            r0 = r8
            r8 = r2
            r2 = r37
            r32 = r9
            r9 = r7
            r7 = r12
            r12 = r32
            goto L_0x034a
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0078:
            long r2 = r1.f146692l
            int r4 = r1.f146694n
            int r5 = r1.f146693m
            long r6 = r1.f146691k
            float r9 = r1.f146690j
            float r10 = r1.f146689i
            boolean r11 = r1.f146688h
            java.lang.Object r12 = r1.f146686f
            B1.d r12 = (B1.d) r12
            java.lang.Object r13 = r1.f146685e
            nI.l r13 = (nI.C17642l) r13
            java.lang.Object r14 = r1.f146684d
            SJ.j r14 = (SJ.C16434j) r14
            java.lang.Object r15 = r1.f146683c
            A1.c r15 = (A1.C4336c) r15
            XH.y.b(r0)
            r19 = r10
            r32 = r5
            r5 = r4
            r3 = r2
            r2 = r14
            r33 = r6
            r6 = r32
            r7 = r9
            r9 = r33
            r35 = r15
            r15 = r11
            r11 = r13
            r13 = r35
            goto L_0x0160
        L_0x00af:
            int r2 = r1.f146694n
            int r3 = r1.f146693m
            long r4 = r1.f146691k
            float r6 = r1.f146690j
            float r7 = r1.f146689i
            boolean r9 = r1.f146688h
            java.lang.Object r10 = r1.f146686f
            B1.d r10 = (B1.d) r10
            java.lang.Object r11 = r1.f146685e
            nI.l r11 = (nI.C17642l) r11
            java.lang.Object r12 = r1.f146684d
            SJ.j r12 = (SJ.C16434j) r12
            java.lang.Object r13 = r1.f146683c
            A1.c r13 = (A1.C4336c) r13
            XH.y.b(r0)
            r14 = r9
            r32 = r12
            r12 = r11
            r11 = r32
            goto L_0x011a
        L_0x00d5:
            XH.y.b(r0)
            o1.g$a r0 = o1.C5667g.f26701b
            long r9 = r0.c()
            r0 = r37
            r1.f146683c = r0
            r11 = r39
            r1.f146684d = r11
            r12 = r40
            r1.f146685e = r12
            r13 = r41
            r1.f146686f = r13
            r14 = r38
            r1.f146688h = r14
            r2 = 0
            r1.f146689i = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f146690j = r2
            r1.f146691k = r9
            r2 = 0
            r1.f146693m = r2
            r1.f146694n = r2
            r2 = 1
            r1.f146697q = r2
            r3 = 0
            r4 = 0
            r6 = 2
            r7 = 0
            r2 = r37
            r5 = r1
            java.lang.Object r2 = p0.G.e(r2, r3, r4, r5, r6, r7)
            if (r2 != r8) goto L_0x0111
            return r8
        L_0x0111:
            r4 = r9
            r10 = r13
            r3 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r13 = r0
            r0 = r2
            r2 = 0
        L_0x011a:
            A1.B r0 = (A1.B) r0
            long r19 = r0.f()
            r9 = r6
            r0 = r7
            r6 = r4
            r4 = r2
            r5 = r3
            r2 = r19
        L_0x0127:
            r1.f146683c = r13
            r1.f146684d = r11
            r1.f146685e = r12
            r1.f146686f = r10
            r15 = 0
            r1.f146687g = r15
            r1.f146688h = r14
            r1.f146689i = r0
            r1.f146690j = r9
            r1.f146691k = r6
            r1.f146693m = r5
            r1.f146694n = r4
            r1.f146692l = r2
            r19 = r0
            r0 = 2
            r1.f146697q = r0
            r37 = r2
            r0 = 1
            java.lang.Object r2 = A1.C4336c.J1(r13, r15, r1, r0, r15)
            if (r2 != r8) goto L_0x014f
            return r8
        L_0x014f:
            r0 = r2
            r2 = r11
            r11 = r12
            r15 = r14
            r12 = r10
            r32 = r5
            r5 = r4
            r3 = r37
            r33 = r6
            r6 = r32
            r7 = r9
            r9 = r33
        L_0x0160:
            r14 = r0
            A1.p r14 = (A1.C4349p) r14
            java.util.List r0 = r14.c()
            r37 = r5
            int r5 = r0.size()
            r20 = r8
            r8 = 0
        L_0x0170:
            if (r8 >= r5) goto L_0x0183
            java.lang.Object r21 = r0.get(r8)
            A1.B r21 = (A1.B) r21
            boolean r21 = r21.p()
            if (r21 == 0) goto L_0x0180
            r0 = 1
            goto L_0x0184
        L_0x0180:
            int r8 = r8 + 1
            goto L_0x0170
        L_0x0183:
            r0 = 0
        L_0x0184:
            if (r0 != 0) goto L_0x02e3
            java.util.List r5 = r14.c()
            int r8 = r5.size()
            r38 = r0
            r0 = 0
        L_0x0191:
            if (r0 >= r8) goto L_0x01b7
            java.lang.Object r21 = r5.get(r0)
            r39 = r5
            r5 = r21
            A1.B r5 = (A1.B) r5
            r21 = r1
            r40 = r2
            long r1 = r5.f()
            boolean r1 = A1.A.d(r1, r3)
            if (r1 == 0) goto L_0x01ae
            B1.e.c(r12, r5)
        L_0x01ae:
            int r0 = r0 + 1
            r5 = r39
            r2 = r40
            r1 = r21
            goto L_0x0191
        L_0x01b7:
            r21 = r1
            r40 = r2
            float r23 = p0.K.f(r14)
            float r2 = p0.K.e(r14)
            long r0 = p0.K.d(r14)
            if (r6 != 0) goto L_0x0259
            float r7 = r7 * r23
            float r19 = r19 + r2
            long r9 = o1.C5667g.r(r9, r0)
            r5 = 0
            float r8 = p0.K.c(r14, r5)
            r39 = r2
            r5 = 1
            float r2 = (float) r5
            float r2 = r2 - r7
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 * r8
            r5 = 1078530011(0x40490fdb, float:3.1415927)
            float r5 = r5 * r19
            float r5 = r5 * r8
            r8 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 / r8
            float r5 = java.lang.Math.abs(r5)
            float r8 = o1.C5667g.k(r9)
            r41 = r6
            androidx.compose.ui.platform.w1 r6 = r13.getViewConfiguration()
            r22 = r7
            java.util.List r7 = r14.c()
            r24 = r9
            r9 = 0
            java.lang.Object r7 = r7.get(r9)
            A1.B r7 = (A1.B) r7
            int r7 = r7.n()
            float r6 = e(r6, r7)
            java.util.List r7 = r14.c()
            int r7 = r7.size()
            r9 = 1
            if (r7 > r9) goto L_0x0242
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0242
            int r2 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0242
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0236
            o1.g r2 = o1.C5667g.d(r0)
            java.lang.Object r2 = r11.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0236
            goto L_0x0242
        L_0x0236:
            r5 = r37
            r6 = r40
            r2 = r9
            r7 = r22
            r30 = r24
        L_0x023f:
            r9 = r41
            goto L_0x0265
        L_0x0242:
            if (r15 == 0) goto L_0x024a
            int r2 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x024a
            r2 = r9
            goto L_0x024b
        L_0x024a:
            r2 = 0
        L_0x024b:
            rK.z$b r5 = rK.z.b.f146873a
            r6 = r40
            r6.k(r5)
            r5 = r2
            r2 = r9
            r7 = r22
            r30 = r24
            goto L_0x0265
        L_0x0259:
            r39 = r2
            r41 = r6
            r2 = 1
            r6 = r40
            r5 = r37
            r30 = r9
            goto L_0x023f
        L_0x0265:
            if (r9 == 0) goto L_0x02d2
            r8 = 0
            long r27 = p0.K.b(r14, r8)
            if (r5 == 0) goto L_0x0273
            r16 = 0
            r26 = 0
            goto L_0x0277
        L_0x0273:
            r26 = r39
            r16 = 0
        L_0x0277:
            int r10 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r10 != 0) goto L_0x02a3
            r17 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r10 != 0) goto L_0x02a0
            o1.g$a r10 = o1.C5667g.f26701b
            r37 = r9
            long r8 = r10.c()
            boolean r8 = o1.C5667g.j(r0, r8)
            if (r8 != 0) goto L_0x02b5
            o1.g r8 = o1.C5667g.d(r0)
            java.lang.Object r8 = r11.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x02b5
            goto L_0x02a7
        L_0x02a0:
            r37 = r9
            goto L_0x02a7
        L_0x02a3:
            r37 = r9
            r17 = 1065353216(0x3f800000, float:1.0)
        L_0x02a7:
            rK.z$a r8 = new rK.z$a
            r29 = 0
            r22 = r8
            r24 = r0
            r22.<init>(r23, r24, r26, r27, r29)
            r6.k(r8)
        L_0x02b5:
            java.util.List r0 = r14.c()
            int r1 = r0.size()
            r8 = 0
        L_0x02be:
            if (r8 >= r1) goto L_0x02d8
            java.lang.Object r9 = r0.get(r8)
            A1.B r9 = (A1.B) r9
            boolean r10 = A1.C4350q.j(r9)
            if (r10 == 0) goto L_0x02cf
            r9.a()
        L_0x02cf:
            int r8 = r8 + 1
            goto L_0x02be
        L_0x02d2:
            r37 = r9
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
        L_0x02d8:
            r2 = r37
            r22 = r3
            r0 = r5
            r3 = r19
            r9 = r30
            r1 = 0
            goto L_0x0306
        L_0x02e3:
            r38 = r0
            r21 = r1
            r41 = r6
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r6 = r2
            r2 = 1
            rK.z$c r0 = new rK.z$c
            c2.y$a r1 = c2.y.f23066b
            r22 = r3
            long r2 = r1.a()
            r1 = 0
            r0.<init>(r2, r1)
            r6.k(r0)
            r0 = r37
            r2 = r41
            r3 = r19
        L_0x0306:
            A1.r r4 = A1.r.Final
            r8 = r21
            r8.f146683c = r13
            r8.f146684d = r6
            r8.f146685e = r11
            r8.f146686f = r12
            r8.f146687g = r14
            r8.f146688h = r15
            r8.f146689i = r3
            r8.f146690j = r7
            r8.f146691k = r9
            r8.f146693m = r2
            r8.f146694n = r0
            r18 = r2
            r1 = r22
            r8.f146692l = r1
            r5 = r38
            r8.f146695o = r5
            r19 = r0
            r0 = 3
            r8.f146697q = r0
            java.lang.Object r4 = r13.B1(r4, r8)
            r0 = r20
            if (r4 != r0) goto L_0x0338
            return r0
        L_0x0338:
            r32 = r13
            r13 = r3
            r3 = r6
            r33 = r1
            r2 = r5
            r5 = r33
            r1 = r8
            r8 = r32
            r35 = r9
            r9 = r7
            r7 = r11
            r10 = r35
        L_0x034a:
            A1.p r4 = (A1.C4349p) r4
            java.util.List r4 = r4.c()
            r20 = r0
            int r0 = r4.size()
            r38 = r1
            r1 = 0
        L_0x0359:
            if (r1 >= r0) goto L_0x036e
            java.lang.Object r21 = r4.get(r1)
            A1.B r21 = (A1.B) r21
            boolean r21 = r21.p()
            if (r21 == 0) goto L_0x036b
            if (r18 != 0) goto L_0x036e
            r0 = 1
            goto L_0x036f
        L_0x036b:
            int r1 = r1 + 1
            goto L_0x0359
        L_0x036e:
            r0 = 0
        L_0x036f:
            if (r2 != 0) goto L_0x03a2
            if (r0 != 0) goto L_0x03a2
            java.util.List r0 = r14.c()
            int r1 = r0.size()
            r2 = 0
        L_0x037c:
            if (r2 >= r1) goto L_0x03a2
            java.lang.Object r4 = r0.get(r2)
            A1.B r4 = (A1.B) r4
            boolean r4 = r4.i()
            if (r4 == 0) goto L_0x039f
            r1 = r38
            r0 = r13
            r14 = r15
            r4 = r19
            r13 = r8
            r8 = r20
            r32 = r10
            r11 = r3
            r2 = r5
            r10 = r12
            r5 = r18
            r12 = r7
            r6 = r32
            goto L_0x0127
        L_0x039f:
            int r2 = r2 + 1
            goto L_0x037c
        L_0x03a2:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rK.C17861B.d(A1.c, boolean, SJ.j, nI.l, B1.d, dI.e):java.lang.Object");
    }

    private static final float e(w1 w1Var, int i10) {
        if (!P.g(i10, P.f4356a.b())) {
            return w1Var.g();
        }
        return w1Var.g() * (h.B((float) 0.125d) / h.B((float) 18));
    }
}
