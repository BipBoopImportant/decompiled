package com.contentsquare.android.sdk;

import QJ.C16311i0;
import QJ.M;
import QJ.Q;
import TJ.C16505B;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import a9.C6808d2;
import a9.C6822f0;
import a9.C6839h1;
import a9.C6892n6;
import a9.C6897o3;
import a9.C6905p3;
import a9.C6908p6;
import a9.C6912q2;
import a9.M3;
import a9.Q3;
import a9.W3;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.C7134k0;
import com.contentsquare.android.sdk.C7153u;
import com.contentsquare.android.sdk.C7158w0;
import com.contentsquare.android.sdk.K0;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import eI.C17187b;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.p;
import w8.C8933a;
import w8.e;

public final class P extends C7140n0<C7158w0.a> {

    /* renamed from: e  reason: collision with root package name */
    public final E f47084e;

    /* renamed from: f  reason: collision with root package name */
    public final C6822f0 f47085f;

    /* renamed from: g  reason: collision with root package name */
    public final Q3 f47086g;

    /* renamed from: h  reason: collision with root package name */
    public final C6839h1 f47087h;

    /* renamed from: i  reason: collision with root package name */
    public final C6905p3 f47088i;

    /* renamed from: j  reason: collision with root package name */
    public final C6897o3 f47089j;

    /* renamed from: k  reason: collision with root package name */
    public final M3<C8933a> f47090k;

    /* renamed from: l  reason: collision with root package name */
    public final M f47091l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f47092m;

    /* renamed from: n  reason: collision with root package name */
    public final D8.c f47093n;

    public static final class a extends C6892n6 {

        /* renamed from: b  reason: collision with root package name */
        public final List<w8.e> f47094b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(M3<C8933a> m32, List<w8.e> list) {
            super(m32);
            C17542s.j(m32, "composeInterfaceProvider");
            C17542s.j(list, "lazyListItems");
            this.f47094b = list;
        }

        public final void a(w8.e eVar) {
            C17542s.j(eVar, "rootNode");
            b(eVar);
        }

        public final void b(w8.e eVar) {
            if (eVar.k() instanceof e.a.c) {
                eVar.g().clear();
                List<w8.e> g10 = eVar.g();
                List<w8.e> list = this.f47094b;
                ArrayList arrayList = new ArrayList(C16877v.y(list, 10));
                for (w8.e b10 : list) {
                    arrayList.add(w8.e.b(b10, (String) null, (String) null, eVar, (Rect) null, 0.0f, false, 0, 0.0f, (String) null, (String) null, (List) null, (e.a) null, false, false, false, 32763, (Object) null));
                }
                g10.addAll(arrayList);
                return;
            }
            for (w8.e b11 : eVar.g()) {
                b(b11);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.analytics.internal.features.clientmode.screencapture.screenrecorder.VerticalComposeLazyScreenRecorder", f = "VerticalComposeLazyScreenRecorder.kt", l = {140, 148}, m = "handleLastSnapshot")
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public P f47095c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap f47096d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f47097e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ P f47098f;

        /* renamed from: g  reason: collision with root package name */
        public int f47099g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(P p10, C17164e<? super b> eVar) {
            super(eVar);
            this.f47098f = p10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f47097e = obj;
            this.f47099g |= Integer.MIN_VALUE;
            return this.f47098f.l((String) null, (W3) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.analytics.internal.features.clientmode.screencapture.screenrecorder.VerticalComposeLazyScreenRecorder$handleLastSnapshot$2", f = "VerticalComposeLazyScreenRecorder.kt", l = {}, m = "invokeSuspend")
    public static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ P f47100c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ C6912q2 f47101d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Bitmap f47102e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(P p10, C6912q2 q2Var, Bitmap bitmap, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f47100c = p10;
            this.f47101d = q2Var;
            this.f47102e = bitmap;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f47100c, this.f47101d, this.f47102e, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            y.b(obj);
            P.o(this.f47100c, this.f47101d, this.f47102e);
            return C16807N.f139792a;
        }
    }

    public static final class d extends C17544u implements p<View, C7153u, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List<C7153u> f47103c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ArrayList arrayList) {
            super(2);
            this.f47103c = arrayList;
        }

        public final Object invoke(Object obj, Object obj2) {
            C7153u uVar = (C7153u) obj2;
            C17542s.j((View) obj, "<anonymous parameter 0>");
            C17542s.j(uVar, FeatureVariable.JSON_TYPE);
            if (uVar.f47646h == C7153u.a.ANDROID_COMPOSE_VIEW) {
                this.f47103c.add(uVar);
            }
            return C16807N.f139792a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.analytics.internal.features.clientmode.screencapture.screenrecorder.VerticalComposeLazyScreenRecorder", f = "VerticalComposeLazyScreenRecorder.kt", l = {80, 82}, m = "runRecorder")
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public Object f47104c;

        /* renamed from: d  reason: collision with root package name */
        public Object f47105d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f47106e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f47107f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ P f47108g;

        /* renamed from: h  reason: collision with root package name */
        public int f47109h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(P p10, C17164e<? super e> eVar) {
            super(eVar);
            this.f47108g = p10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f47107f = obj;
            this.f47109h |= Integer.MIN_VALUE;
            return this.f47108g.f((C7158w0.a) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.analytics.internal.features.clientmode.screencapture.screenrecorder.VerticalComposeLazyScreenRecorder$runRecorder$2$1", f = "VerticalComposeLazyScreenRecorder.kt", l = {83}, m = "invokeSuspend")
    public static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f47110c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ P f47111d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f47112e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ C7158w0.a f47113f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ W3 f47114g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(P p10, ViewGroup viewGroup, C7158w0.a aVar, W3 w32, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f47111d = p10;
            this.f47112e = viewGroup;
            this.f47113f = aVar;
            this.f47114g = w32;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f47111d, this.f47112e, this.f47113f, this.f47114g, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((f) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0189, code lost:
            if (r15 == eI.C17187b.f()) goto L_0x018e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f47110c
                r2 = 1
                if (r1 == 0) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                XH.y.b(r15)
                goto L_0x0191
            L_0x0010:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0018:
                XH.y.b(r15)
                com.contentsquare.android.sdk.P r15 = r14.f47111d
                android.view.ViewGroup r1 = r14.f47112e
                java.lang.String r3 = r15.i()
                com.contentsquare.android.sdk.w0$a r4 = r14.f47113f
                a9.W3 r5 = r14.f47114g
                r14.f47110c = r2
                android.graphics.Bitmap r1 = r5.a(r1)
                int r2 = r4.f47677d
                java.lang.String r6 = "scrollContainerRect"
                java.lang.String r7 = "screenshot"
                r8 = 0
                if (r2 != 0) goto L_0x0075
                a9.p3 r2 = r15.f47088i
                android.graphics.Rect r9 = r4.f47678e
                r2.getClass()
                kotlin.jvm.internal.C17542s.j(r1, r7)
                kotlin.jvm.internal.C17542s.j(r9, r6)
                android.graphics.Rect r10 = new android.graphics.Rect
                int r11 = r1.getWidth()
                int r9 = r9.top
                r10.<init>(r8, r8, r11, r9)
                r2.a(r1, r10)
                a9.o3 r2 = r15.f47089j
                android.graphics.Rect r9 = r4.f47678e
                r2.getClass()
                kotlin.jvm.internal.C17542s.j(r1, r7)
                kotlin.jvm.internal.C17542s.j(r9, r6)
                android.graphics.Rect r10 = new android.graphics.Rect
                int r11 = r1.getWidth()
                int r9 = r9.top
                r10.<init>(r8, r8, r11, r9)
                r2.b(r1, r10)
                int r9 = r2.f42780b
                int r10 = r10.height()
                int r10 = r10 + r9
                r2.f42780b = r10
            L_0x0075:
                a9.p3 r2 = r15.f47088i
                android.graphics.Rect r9 = r4.f47680g
                r2.getClass()
                kotlin.jvm.internal.C17542s.j(r1, r7)
                java.lang.String r10 = "pageRect"
                kotlin.jvm.internal.C17542s.j(r9, r10)
                android.graphics.Rect r10 = new android.graphics.Rect
                int r11 = r9.top
                int r12 = r1.getWidth()
                int r9 = r9.bottom
                r10.<init>(r8, r11, r12, r9)
                r2.a(r1, r10)
                a9.o3 r2 = r15.f47089j
                android.graphics.Rect r9 = r4.f47680g
                r2.c(r1, r9)
                a9.o3 r2 = r15.f47089j
                r2.getClass()
                com.contentsquare.android.sdk.R0 r9 = new com.contentsquare.android.sdk.R0
                android.graphics.Bitmap r10 = r2.f42779a
                kotlin.jvm.internal.C17542s.g(r10)
                int r2 = r2.f42781c
                r9.<init>(r10, r2)
                a9.o3 r2 = r15.f47089j
                int r2 = r2.f42782d
                java.util.List<w8.e> r10 = r4.f47679f
                java.util.ArrayList r11 = new java.util.ArrayList
                r12 = 10
                int r13 = YH.C16877v.y(r10, r12)
                r11.<init>(r13)
                java.util.Iterator r10 = r10.iterator()
            L_0x00c1:
                boolean r13 = r10.hasNext()
                if (r13 == 0) goto L_0x00d9
                java.lang.Object r13 = r10.next()
                w8.e r13 = (w8.e) r13
                w8.e r13 = com.contentsquare.android.sdk.P.n(r13, r9)
                w8.e r13 = com.contentsquare.android.sdk.P.m(r13, r8, r2)
                r11.add(r13)
                goto L_0x00c1
            L_0x00d9:
                D8.c r2 = r15.f47093n
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r10 = "processed items: "
                r9.<init>(r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                int r12 = YH.C16877v.y(r11, r12)
                r10.<init>(r12)
                java.util.Iterator r12 = r11.iterator()
            L_0x00ef:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x0107
                java.lang.Object r13 = r12.next()
                w8.e r13 = (w8.e) r13
                int r13 = r13.f()
                java.lang.Integer r13 = kotlin.coroutines.jvm.internal.b.e(r13)
                r10.add(r13)
                goto L_0x00ef
            L_0x0107:
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r2.f(r9)
                java.util.ArrayList r2 = r15.f47092m
                r2.addAll(r11)
                java.util.List<w8.e> r2 = r4.f47679f
                java.util.Iterator r2 = r2.iterator()
                boolean r9 = r2.hasNext()
                if (r9 != 0) goto L_0x0124
                r2 = 0
                goto L_0x0153
            L_0x0124:
                java.lang.Object r9 = r2.next()
                w8.e r9 = (w8.e) r9
                android.graphics.Rect r9 = r9.e()
                int r9 = r9.bottom
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.e(r9)
            L_0x0134:
                boolean r10 = r2.hasNext()
                if (r10 == 0) goto L_0x0152
                java.lang.Object r10 = r2.next()
                w8.e r10 = (w8.e) r10
                android.graphics.Rect r10 = r10.e()
                int r10 = r10.bottom
                java.lang.Integer r10 = kotlin.coroutines.jvm.internal.b.e(r10)
                int r11 = r9.compareTo(r10)
                if (r11 >= 0) goto L_0x0134
                r9 = r10
                goto L_0x0134
            L_0x0152:
                r2 = r9
            L_0x0153:
                if (r2 == 0) goto L_0x015e
                int r2 = r2.intValue()
                a9.o3 r9 = r15.f47089j
                r9.a(r2)
            L_0x015e:
                boolean r2 = r4.f47681h
                if (r2 == 0) goto L_0x018c
                a9.p3 r2 = r15.f47088i
                android.graphics.Rect r4 = r4.f47678e
                r2.getClass()
                kotlin.jvm.internal.C17542s.j(r1, r7)
                kotlin.jvm.internal.C17542s.j(r4, r6)
                android.graphics.Rect r6 = new android.graphics.Rect
                int r4 = r4.bottom
                int r7 = r1.getWidth()
                int r9 = r1.getHeight()
                r6.<init>(r8, r4, r7, r9)
                r2.a(r1, r6)
                java.lang.Object r15 = r15.l(r3, r5, r14)
                java.lang.Object r1 = eI.C17187b.f()
                if (r15 != r1) goto L_0x018c
                goto L_0x018e
            L_0x018c:
                XH.N r15 = XH.C16807N.f139792a
            L_0x018e:
                if (r15 != r0) goto L_0x0191
                return r0
            L_0x0191:
                XH.N r15 = XH.C16807N.f139792a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.P.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public P() {
        throw null;
    }

    public static w8.e m(w8.e eVar, int i10, int i11) {
        int i12 = i10;
        int i13 = i11;
        Rect rect = new Rect(eVar.e());
        rect.offset(i12, i13);
        List<w8.e> g10 = eVar.g();
        ArrayList arrayList = new ArrayList(C16877v.y(g10, 10));
        for (w8.e m10 : g10) {
            arrayList.add(m(m10, i12, i13));
        }
        return w8.e.b(eVar, (String) null, (String) null, (w8.e) null, rect, 0.0f, false, 0, 0.0f, (String) null, (String) null, C16877v.w1(arrayList), (e.a) null, false, false, false, 31735, (Object) null);
    }

    public static w8.e n(w8.e eVar, R0 r02) {
        R0 r03 = r02;
        Rect e10 = eVar.e();
        String d10 = r03.d(e10.left, e10.top, e10.width(), e10.height());
        List<w8.e> g10 = eVar.g();
        ArrayList arrayList = new ArrayList(C16877v.y(g10, 10));
        String str = d10;
        for (w8.e eVar2 : g10) {
            if (C17542s.e(eVar2.e(), eVar.e())) {
                str = null;
            }
            arrayList.add(n(eVar2, r03));
        }
        return w8.e.b(eVar, (String) null, (String) null, (w8.e) null, (Rect) null, 0.0f, false, 0, 0.0f, (String) null, str, C16877v.w1(arrayList), (e.a) null, false, false, false, 31231, (Object) null);
    }

    public static final void o(P p10, C6912q2 q2Var, Bitmap bitmap) {
        P p11 = p10;
        Bitmap bitmap2 = bitmap;
        String str = "";
        if (p11.f47084e.d()) {
            p11.f47093n.f("sending to external processor");
            K0.a aVar = new K0.a(bitmap2, false);
            E e10 = p11.f47084e;
            C17542s.j(bitmap2, "bitmap");
            if (bitmap.getHeight() > 0 && bitmap.getWidth() > 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C17542s.i(byteArray, "stream.toByteArray()");
                C17542s.j(byteArray, "imageByteArray");
                str = Base64.encodeToString(byteArray, 2);
                C17542s.i(str, "encodeToString(imageByteArray, Base64.NO_WRAP)");
            }
            C6912q2 q2Var2 = q2Var;
            e10.c(q2Var2, str, aVar, p11.f47087h, p11.f47532a);
            return;
        }
        p11.f47532a.a(C7134k0.g.f47482a);
        C6839h1 h1Var = p11.f47087h;
        C17542s.j(bitmap2, "bitmap");
        if (bitmap.getHeight() > 0 && bitmap.getWidth() > 0) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            C17542s.i(byteArray2, "stream.toByteArray()");
            C17542s.j(byteArray2, "imageByteArray");
            str = Base64.encodeToString(byteArray2, 2);
            C17542s.i(str, "encodeToString(imageByteArray, Base64.NO_WRAP)");
        }
        h1Var.a(q2Var, str, false);
    }

    public final D8.c a() {
        return this.f47093n;
    }

    public final void c(C7158w0 w0Var) {
        C7158w0.a aVar = (C7158w0.a) w0Var;
        C17542s.j(aVar, "context");
        if (!C17542s.e(this.f47534c, aVar.f47674a)) {
            this.f47535d = null;
            this.f47534c = aVar.f47674a;
        }
    }

    public final boolean g(C7158w0 w0Var) {
        C7158w0.a aVar = (C7158w0.a) w0Var;
        C17542s.j(aVar, "context");
        return aVar.f47677d == 0;
    }

    public final void j() {
        this.f47092m.clear();
        C6905p3 p3Var = this.f47088i;
        p3Var.f42794c = null;
        p3Var.f42795d = 0;
        p3Var.f42792a = 0;
        p3Var.f42793b = 0;
        C6897o3 o3Var = this.f47089j;
        o3Var.f42779a = null;
        o3Var.f42780b = 0;
        o3Var.f42781c = 0;
        o3Var.f42782d = 0;
        ViewGroup e10 = e();
        if (e10 != null) {
            C6905p3 p3Var2 = this.f47088i;
            int width = e10.getWidth();
            int height = e10.getHeight();
            p3Var2.f42792a = width;
            p3Var2.f42793b = height;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(com.contentsquare.android.sdk.C7158w0.a r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.contentsquare.android.sdk.P.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.contentsquare.android.sdk.P$e r0 = (com.contentsquare.android.sdk.P.e) r0
            int r1 = r0.f47109h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f47109h = r1
            goto L_0x0018
        L_0x0013:
            com.contentsquare.android.sdk.P$e r0 = new com.contentsquare.android.sdk.P$e
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f47107f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f47109h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r13 = r0.f47105d
            a9.W3 r13 = (a9.W3) r13
            java.lang.Object r0 = r0.f47104c
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            XH.y.b(r14)     // Catch:{ all -> 0x0035 }
            goto L_0x0099
        L_0x0035:
            r14 = move-exception
            goto L_0x00a6
        L_0x0038:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0040:
            android.view.ViewGroup r13 = r0.f47106e
            java.lang.Object r2 = r0.f47105d
            com.contentsquare.android.sdk.w0$a r2 = (com.contentsquare.android.sdk.C7158w0.a) r2
            java.lang.Object r4 = r0.f47104c
            com.contentsquare.android.sdk.P r4 = (com.contentsquare.android.sdk.P) r4
            XH.y.b(r14)
            r7 = r2
            r5 = r4
            goto L_0x007a
        L_0x0050:
            XH.y.b(r14)
            android.view.ViewGroup r14 = r12.e()
            if (r14 == 0) goto L_0x00ae
            a9.Q3 r2 = r12.f47086g
            com.contentsquare.android.sdk.K0 r5 = new com.contentsquare.android.sdk.K0
            a9.W1 r6 = new a9.W1
            r6.<init>()
            a9.a1 r2 = r2.f42228a
            r5.<init>(r6, r2)
            r0.f47104c = r12
            r0.f47105d = r13
            r0.f47106e = r14
            r0.f47109h = r4
            java.lang.Object r2 = r5.a(r0)
            if (r2 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r5 = r12
            r7 = r13
            r13 = r14
            r14 = r2
        L_0x007a:
            a9.W3 r14 = (a9.W3) r14
            QJ.M r2 = r5.f47091l     // Catch:{ all -> 0x00a1 }
            com.contentsquare.android.sdk.P$f r10 = new com.contentsquare.android.sdk.P$f     // Catch:{ all -> 0x00a1 }
            r9 = 0
            r4 = r10
            r6 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00a1 }
            r0.f47104c = r13     // Catch:{ all -> 0x00a1 }
            r0.f47105d = r14     // Catch:{ all -> 0x00a1 }
            r4 = 0
            r0.f47106e = r4     // Catch:{ all -> 0x00a1 }
            r0.f47109h = r3     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = QJ.C16310i.g(r2, r10, r0)     // Catch:{ all -> 0x00a1 }
            if (r0 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r0 = r13
            r13 = r14
        L_0x0099:
            android.graphics.Bitmap r13 = r13.a(r0)
            r13.recycle()
            goto L_0x00ae
        L_0x00a1:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r14
            r14 = r11
        L_0x00a6:
            android.graphics.Bitmap r13 = r13.a(r0)
            r13.recycle()
            throw r14
        L_0x00ae:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.P.f(com.contentsquare.android.sdk.w0$a, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.String r13, a9.W3 r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.contentsquare.android.sdk.P.b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.contentsquare.android.sdk.P$b r0 = (com.contentsquare.android.sdk.P.b) r0
            int r1 = r0.f47099g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f47099g = r1
            goto L_0x0018
        L_0x0013:
            com.contentsquare.android.sdk.P$b r0 = new com.contentsquare.android.sdk.P$b
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f47097e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f47099g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            XH.y.b(r15)
            goto L_0x00b6
        L_0x002d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0035:
            android.graphics.Bitmap r13 = r0.f47096d
            com.contentsquare.android.sdk.P r14 = r0.f47095c
            XH.y.b(r15)
            goto L_0x007a
        L_0x003d:
            XH.y.b(r15)
            D8.c r15 = r12.f47093n
            java.lang.String r2 = "creating screen graph"
            r15.f(r2)
            a9.p3 r15 = r12.f47088i
            android.graphics.Bitmap r15 = r15.f42794c
            if (r15 == 0) goto L_0x00c1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r13 != 0) goto L_0x0056
            java.lang.String r13 = ""
        L_0x0056:
            r9 = r13
            com.contentsquare.android.sdk.P$d r8 = new com.contentsquare.android.sdk.P$d
            r8.<init>(r2)
            r0.f47095c = r12
            r0.f47096d = r15
            r0.f47099g = r4
            QJ.P0 r13 = QJ.C16311i0.c()
            com.contentsquare.android.sdk.S r2 = new com.contentsquare.android.sdk.S
            r10 = 0
            r5 = r2
            r6 = r12
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = QJ.C16310i.g(r13, r2, r0)
            if (r13 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r14 = r12
            r11 = r15
            r15 = r13
            r13 = r11
        L_0x007a:
            a9.q2 r15 = (a9.C6912q2) r15
            if (r15 == 0) goto L_0x00b9
            java.util.ArrayList r2 = r14.f47092m
            r2.clear()
            a9.p3 r2 = r14.f47088i
            r4 = 0
            r2.f42794c = r4
            r5 = 0
            r2.f42795d = r5
            r2.f42792a = r5
            r2.f42793b = r5
            a9.o3 r2 = r14.f47089j
            r2.f42779a = r4
            r2.f42780b = r5
            r2.f42781c = r5
            r2.f42782d = r5
            D8.c r2 = r14.f47093n
            java.lang.String r5 = "sending screen graph"
            r2.f(r5)
            QJ.P0 r2 = QJ.C16311i0.c()
            com.contentsquare.android.sdk.P$c r5 = new com.contentsquare.android.sdk.P$c
            r5.<init>(r14, r15, r13, r4)
            r0.f47095c = r4
            r0.f47096d = r4
            r0.f47099g = r3
            java.lang.Object r13 = QJ.C16310i.g(r2, r5, r0)
            if (r13 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        L_0x00b9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Can not generate screen graph!"
            r13.<init>(r14)
            throw r13
        L_0x00c1:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Can not generate screen preview!"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.P.l(java.lang.String, a9.W3, dI.e):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P(C16505B b10, E e10, C6822f0 f0Var, Q3 q32, C7132j0 j0Var, C6908p6 p6Var, C6905p3 p3Var, C6897o3 o3Var, C6808d2 d2Var) {
        super(b10, p6Var);
        M a10 = C16311i0.a();
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(e10, "externalViewsProcessor");
        C17542s.j(f0Var, "treeTraverser");
        C17542s.j(q32, "viewBitmapProviderFactory");
        C17542s.j(j0Var, "callback");
        C17542s.j(p6Var, "glassPane");
        C17542s.j(p3Var, "previewBitmapBuilder");
        C17542s.j(o3Var, "mergedScreenshotsBitmapBuilder");
        C17542s.j(d2Var, "composeInterfaceProvider");
        C17542s.j(a10, "recorderDispatcher");
        this.f47084e = e10;
        this.f47085f = f0Var;
        this.f47086g = q32;
        this.f47087h = j0Var;
        this.f47088i = p3Var;
        this.f47089j = o3Var;
        this.f47090k = d2Var;
        this.f47091l = a10;
        this.f47092m = new ArrayList();
        this.f47093n = new D8.c("VerticalComposeLazyRecorder");
    }
}
