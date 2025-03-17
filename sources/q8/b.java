package q8;

import L1.j;
import QJ.Q;
import QJ.m1;
import XH.C16807N;
import android.graphics.Rect;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import tI.C17978n;
import w8.c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0016\u001a\u00020\u000f2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\bH@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u001a\u0010&\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\"\u0010%R\u0014\u0010*\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lq8/b;", "Lw8/c;", "", "containerId", "Landroid/graphics/Rect;", "scrollabeRect", "LL1/j;", "range", "Lkotlin/Function2;", "", "", "scrollByAction", "<init>", "(Ljava/lang/String;Landroid/graphics/Rect;LL1/j;LnI/p;)V", "scrollToPos", "LXH/N;", "k", "(FLdI/e;)Ljava/lang/Object;", "", "LdI/e;", "", "scrollListener", "a", "(LnI/p;LdI/e;)Ljava/lang/Object;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Landroid/graphics/Rect;", "d", "()Landroid/graphics/Rect;", "c", "LL1/j;", "LnI/p;", "e", "I", "g", "()I", "numberOfPages", "initialOffset", "i", "()F", "currentPos", "j", "maxPos", "compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f55628a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f55629b;

    /* renamed from: c  reason: collision with root package name */
    private final j f55630c;

    /* renamed from: d  reason: collision with root package name */
    private final p<Float, Float, Boolean> f55631d;

    /* renamed from: e  reason: collision with root package name */
    private final int f55632e = ((int) ((float) Math.ceil((double) ((i() + ((float) d().height())) / ((float) d().height())))));

    /* renamed from: f  reason: collision with root package name */
    private final int f55633f = ((int) i());

    @f(c = "com.contentsquare.android.compose.analytics.scroller.verticalscroller.VerticalScroller", f = "VerticalScroller.kt", l = {46, 50, 51}, m = "scrollForCapture")
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public b f55634c;

        /* renamed from: d  reason: collision with root package name */
        public p f55635d;

        /* renamed from: e  reason: collision with root package name */
        public float f55636e;

        /* renamed from: f  reason: collision with root package name */
        public float f55637f;

        /* renamed from: g  reason: collision with root package name */
        public float f55638g;

        /* renamed from: h  reason: collision with root package name */
        public int f55639h;

        /* renamed from: i  reason: collision with root package name */
        public /* synthetic */ Object f55640i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ b f55641j;

        /* renamed from: k  reason: collision with root package name */
        public int f55642k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f55641j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55640i = obj;
            this.f55642k |= Integer.MIN_VALUE;
            return this.f55641j.a((p<? super Integer, ? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    @f(c = "com.contentsquare.android.compose.analytics.scroller.verticalscroller.VerticalScroller$scrollToAndWait$2", f = "VerticalScroller.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: q8.b$b  reason: collision with other inner class name */
    public static final class C0897b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f55643c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f55644d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f55645e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0897b(b bVar, float f10, C17164e<? super C0897b> eVar) {
            super(2, eVar);
            this.f55644d = bVar;
            this.f55645e = f10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0897b(this.f55644d, this.f55645e, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new C0897b(this.f55644d, this.f55645e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f55643c
                r2 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r2) goto L_0x000f
                XH.y.b(r6)
                goto L_0x0025
            L_0x000f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0017:
                XH.y.b(r6)
            L_0x001a:
                r5.f55643c = r2
                r3 = 60
                java.lang.Object r6 = QJ.C16297b0.b(r3, r5)
                if (r6 != r0) goto L_0x0025
                return r0
            L_0x0025:
                q8.b r6 = r5.f55644d
                float r6 = r6.i()
                float r1 = r5.f55645e
                float r6 = r6 - r1
                float r6 = java.lang.Math.abs(r6)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L_0x001a
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q8.b.C0897b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(String str, Rect rect, j jVar, p<? super Float, ? super Float, Boolean> pVar) {
        C17542s.j(str, "containerId");
        C17542s.j(rect, "scrollabeRect");
        C17542s.j(jVar, "range");
        C17542s.j(pVar, "scrollByAction");
        this.f55628a = str;
        this.f55629b = rect;
        this.f55630c = jVar;
        this.f55631d = pVar;
    }

    /* access modifiers changed from: private */
    public final float i() {
        return this.f55630c.c().invoke().floatValue();
    }

    private final float j() {
        return this.f55630c.a().invoke().floatValue();
    }

    private final Object k(float f10, C17164e<? super C16807N> eVar) {
        float l10 = C17978n.l(f10, 0.0f, j());
        float i10 = l10 - i();
        if (i10 == 0.0f) {
            return C16807N.f139792a;
        }
        this.f55631d.invoke(kotlin.coroutines.jvm.internal.b.d(0.0f), kotlin.coroutines.jvm.internal.b.d(i10));
        Object c10 = m1.c(1000, new C0897b(this, l10, (C17164e<? super C0897b>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(nI.p<? super java.lang.Integer, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof q8.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            q8.b$a r0 = (q8.b.a) r0
            int r1 = r0.f55642k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55642k = r1
            goto L_0x0018
        L_0x0013:
            q8.b$a r0 = new q8.b$a
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f55640i
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f55642k
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x006c
            if (r2 == r6) goto L_0x0059
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            int r13 = r0.f55639h
            float r2 = r0.f55638g
            float r7 = r0.f55637f
            float r8 = r0.f55636e
            nI.p r9 = r0.f55635d
            q8.b r10 = r0.f55634c
            XH.y.b(r14)     // Catch:{ all -> 0x00f3 }
        L_0x003b:
            r14 = r13
            r13 = r9
            r9 = r10
            goto L_0x00d7
        L_0x0040:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0048:
            int r13 = r0.f55639h
            float r2 = r0.f55638g
            float r7 = r0.f55637f
            float r8 = r0.f55636e
            nI.p r9 = r0.f55635d
            q8.b r10 = r0.f55634c
            XH.y.b(r14)     // Catch:{ all -> 0x00f3 }
            goto L_0x00be
        L_0x0059:
            int r13 = r0.f55639h
            float r2 = r0.f55637f
            float r7 = r0.f55636e
            nI.p r8 = r0.f55635d
            q8.b r9 = r0.f55634c
            XH.y.b(r14)     // Catch:{ all -> 0x0069 }
            r14 = r13
            r13 = r8
            goto L_0x0095
        L_0x0069:
            r13 = move-exception
            goto L_0x00f9
        L_0x006c:
            XH.y.b(r14)
            float r7 = r12.i()
            android.graphics.Rect r14 = r12.d()     // Catch:{ all -> 0x00f7 }
            int r14 = r14.height()     // Catch:{ all -> 0x00f7 }
            float r2 = (float) r14     // Catch:{ all -> 0x00f7 }
            r14 = 0
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.e(r14)     // Catch:{ all -> 0x00f7 }
            r0.f55634c = r12     // Catch:{ all -> 0x00f7 }
            r0.f55635d = r13     // Catch:{ all -> 0x00f7 }
            r0.f55636e = r7     // Catch:{ all -> 0x00f7 }
            r0.f55637f = r2     // Catch:{ all -> 0x00f7 }
            r0.f55639h = r14     // Catch:{ all -> 0x00f7 }
            r0.f55642k = r6     // Catch:{ all -> 0x00f7 }
            java.lang.Object r8 = r13.invoke(r8, r0)     // Catch:{ all -> 0x00f7 }
            if (r8 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r9 = r12
        L_0x0095:
            int r14 = r14 + r6
            int r8 = r9.g()     // Catch:{ all -> 0x0069 }
            int r8 = r8 - r6
            int r8 = r8 - r14
            float r8 = (float) r8     // Catch:{ all -> 0x0069 }
            float r8 = r8 * r2
            float r8 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x0069 }
            r0.f55634c = r9     // Catch:{ all -> 0x0069 }
            r0.f55635d = r13     // Catch:{ all -> 0x0069 }
            r0.f55636e = r7     // Catch:{ all -> 0x0069 }
            r0.f55637f = r2     // Catch:{ all -> 0x0069 }
            r0.f55638g = r8     // Catch:{ all -> 0x0069 }
            r0.f55639h = r14     // Catch:{ all -> 0x0069 }
            r0.f55642k = r4     // Catch:{ all -> 0x0069 }
            java.lang.Object r10 = r9.k(r8, r0)     // Catch:{ all -> 0x0069 }
            if (r10 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            r10 = r9
            r9 = r13
            r13 = r14
            r11 = r7
            r7 = r2
            r2 = r8
            r8 = r11
        L_0x00be:
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.b.e(r13)     // Catch:{ all -> 0x00f3 }
            r0.f55634c = r10     // Catch:{ all -> 0x00f3 }
            r0.f55635d = r9     // Catch:{ all -> 0x00f3 }
            r0.f55636e = r8     // Catch:{ all -> 0x00f3 }
            r0.f55637f = r7     // Catch:{ all -> 0x00f3 }
            r0.f55638g = r2     // Catch:{ all -> 0x00f3 }
            r0.f55639h = r13     // Catch:{ all -> 0x00f3 }
            r0.f55642k = r3     // Catch:{ all -> 0x00f3 }
            java.lang.Object r14 = r9.invoke(r14, r0)     // Catch:{ all -> 0x00f3 }
            if (r14 != r1) goto L_0x003b
            return r1
        L_0x00d7:
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x00f0
            nI.p<java.lang.Float, java.lang.Float, java.lang.Boolean> r13 = r9.f55631d
            java.lang.Float r14 = kotlin.coroutines.jvm.internal.b.d(r5)
            float r0 = r9.i()
            float r8 = r8 - r0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.b.d(r8)
            r13.invoke(r14, r0)
            XH.N r13 = XH.C16807N.f139792a
            return r13
        L_0x00f0:
            r2 = r7
            r7 = r8
            goto L_0x0095
        L_0x00f3:
            r13 = move-exception
            r7 = r8
            r9 = r10
            goto L_0x00f9
        L_0x00f7:
            r13 = move-exception
            r9 = r12
        L_0x00f9:
            nI.p<java.lang.Float, java.lang.Float, java.lang.Boolean> r14 = r9.f55631d
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.b.d(r5)
            float r1 = r9.i()
            float r7 = r7 - r1
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.d(r7)
            r14.invoke(r0, r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.b.a(nI.p, dI.e):java.lang.Object");
    }

    public Rect d() {
        return this.f55629b;
    }

    public int e() {
        return this.f55633f;
    }

    public String f() {
        return this.f55628a;
    }

    public int g() {
        return this.f55632e;
    }
}
