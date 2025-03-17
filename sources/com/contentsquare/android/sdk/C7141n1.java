package com.contentsquare.android.sdk;

import XH.C16807N;
import YH.X;
import a9.O3;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.contentsquare.android.sdk.C7129i;
import com.contentsquare.android.sdk.C7134k0;
import com.contentsquare.android.sdk.C7158w0;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

/* renamed from: com.contentsquare.android.sdk.n1  reason: case insensitive filesystem */
public final class C7141n1 {

    /* renamed from: i  reason: collision with root package name */
    public static final D8.c f47536i = new D8.c("RecyclerViewCaptureUseCase");

    /* renamed from: a  reason: collision with root package name */
    public final C7143o0 f47537a;

    /* renamed from: b  reason: collision with root package name */
    public final C7129i f47538b;

    /* renamed from: c  reason: collision with root package name */
    public final O3 f47539c;

    /* renamed from: d  reason: collision with root package name */
    public final E8.c f47540d;

    /* renamed from: e  reason: collision with root package name */
    public C7129i.a f47541e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f47542f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public Map<Integer, Integer> f47543g = X.j();

    /* renamed from: h  reason: collision with root package name */
    public final int[] f47544h = new int[2];

    /* renamed from: com.contentsquare.android.sdk.n1$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final View f47545a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47546b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f47547c;

        public a(View view, int i10, Rect rect) {
            C17542s.j(view, "view");
            C17542s.j(rect, "bounds");
            this.f47545a = view;
            this.f47546b = i10;
            this.f47547c = rect;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f47545a, aVar.f47545a) && this.f47546b == aVar.f47546b && C17542s.e(this.f47547c, aVar.f47547c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f47546b);
            return this.f47547c.hashCode() + ((hashCode + (this.f47545a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ItemView(view=" + this.f47545a + ", indexInParent=" + this.f47546b + ", bounds=" + this.f47547c + ')';
        }
    }

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.RecyclerViewCaptureUseCase", f = "RecyclerViewCaptureUseCase.kt", l = {202, 210}, m = "onScrollCalculated")
    /* renamed from: com.contentsquare.android.sdk.n1$b */
    public static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        public Object f47548c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList f47549d;

        /* renamed from: e  reason: collision with root package name */
        public C7158w0.d f47550e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f47551f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C7141n1 f47552g;

        /* renamed from: h  reason: collision with root package name */
        public int f47553h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C7141n1 n1Var, C17164e<? super b> eVar) {
            super(eVar);
            this.f47552g = n1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f47551f = obj;
            this.f47553h |= Integer.MIN_VALUE;
            return this.f47552g.c((r1) null, (RecyclerView) null, (String) null, (Rect) null, 0, this);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.n1$c */
    public static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C7141n1 f47554c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C7141n1 n1Var) {
            super(0);
            this.f47554c = n1Var;
        }

        public final Object invoke() {
            this.f47554c.f47537a.f47532a.a(C7134k0.d.f47477a);
            return C16807N.f139792a;
        }
    }

    public C7141n1(C7143o0 o0Var, C7129i iVar, O3 o32, E8.c cVar) {
        C17542s.j(o0Var, "verticalRecyclerViewScreenRecorder");
        C17542s.j(iVar, "recyclerViewScroller");
        C17542s.j(o32, "snapshotPausingController");
        C17542s.j(cVar, "preferencesStore");
        this.f47537a = o0Var;
        this.f47538b = iVar;
        this.f47539c = o32;
        this.f47540d = cVar;
    }

    public static int a(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "scrollContainer");
        RecyclerView.q layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new IllegalStateException("RecyclerView should have a LayoutManager");
        } else if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).B2();
        } else {
            float right = (float) recyclerView.getRight();
            float bottom = right / ((float) recyclerView.getBottom());
            int bottom2 = recyclerView.getBottom();
            Integer num = null;
            View view = null;
            while (-1 < bottom2 && (view = recyclerView.X(right, (float) bottom2)) == null) {
                right -= bottom;
                bottom2--;
            }
            if (view != null) {
                RecyclerView.G Z10 = recyclerView.Z(view);
                if (Z10 != null) {
                    num = Integer.valueOf(Z10.getLayoutPosition());
                }
                if (num != null) {
                    return num.intValue();
                }
            }
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(com.contentsquare.android.sdk.C7141n1 r13, com.contentsquare.android.sdk.r1 r14, java.lang.String r15, androidx.recyclerview.widget.RecyclerView r16, android.graphics.Rect r17, int r18, int r19, dI.C17164e r20) {
        /*
            r0 = r20
            r13.getClass()
            boolean r1 = r0 instanceof a9.C6805d
            if (r1 == 0) goto L_0x0019
            r1 = r0
            a9.d r1 = (a9.C6805d) r1
            int r2 = r1.f42496l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0019
            int r2 = r2 - r3
            r1.f42496l = r2
            r2 = r13
            goto L_0x001f
        L_0x0019:
            a9.d r1 = new a9.d
            r2 = r13
            r1.<init>(r13, r0)
        L_0x001f:
            java.lang.Object r0 = r1.f42494j
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r1.f42496l
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x005b
            if (r4 == r6) goto L_0x0049
            if (r4 != r5) goto L_0x0041
            int r2 = r1.f42493i
            int r4 = r1.f42492h
            android.graphics.Rect r7 = r1.f42491g
            androidx.recyclerview.widget.RecyclerView r8 = r1.f42490f
            java.lang.String r9 = r1.f42489e
            com.contentsquare.android.sdk.r1 r10 = r1.f42488d
            com.contentsquare.android.sdk.n1 r11 = r1.f42487c
            XH.y.b(r0)
            goto L_0x0069
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            int r2 = r1.f42493i
            int r4 = r1.f42492h
            android.graphics.Rect r7 = r1.f42491g
            androidx.recyclerview.widget.RecyclerView r8 = r1.f42490f
            java.lang.String r9 = r1.f42489e
            com.contentsquare.android.sdk.r1 r10 = r1.f42488d
            com.contentsquare.android.sdk.n1 r11 = r1.f42487c
            XH.y.b(r0)
            goto L_0x0093
        L_0x005b:
            XH.y.b(r0)
            r10 = r14
            r9 = r15
            r8 = r16
            r7 = r17
            r4 = r18
            r11 = r2
            r2 = r19
        L_0x0069:
            java.util.ArrayList r0 = r11.f47542f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00bf
            r1.f42487c = r11
            r1.f42488d = r10
            r1.f42489e = r9
            r1.f42490f = r8
            r1.f42491g = r7
            r1.f42492h = r4
            r1.f42493i = r2
            r1.f42496l = r6
            r13 = r11
            r14 = r10
            r15 = r8
            r16 = r9
            r17 = r7
            r18 = r4
            r19 = r1
            java.lang.Object r0 = r13.c(r14, r15, r16, r17, r18, r19)
            if (r0 != r3) goto L_0x0093
            goto L_0x00c1
        L_0x0093:
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r12 = r11.f47542f
            r12.removeAll(r0)
            java.util.ArrayList r0 = r11.f47542f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0069
            com.contentsquare.android.sdk.i r0 = r11.f47538b
            int r12 = r7.height()
            r1.f42487c = r11
            r1.f42488d = r10
            r1.f42489e = r9
            r1.f42490f = r8
            r1.f42491g = r7
            r1.f42492h = r4
            r1.f42493i = r2
            r1.f42496l = r5
            java.lang.Object r0 = r0.a(r8, r12, r2, r1)
            if (r0 != r3) goto L_0x0069
            goto L_0x00c1
        L_0x00bf:
            XH.N r3 = XH.C16807N.f139792a
        L_0x00c1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7141n1.b(com.contentsquare.android.sdk.n1, com.contentsquare.android.sdk.r1, java.lang.String, androidx.recyclerview.widget.RecyclerView, android.graphics.Rect, int, int, dI.e):java.lang.Object");
    }

    public static final void d(C7141n1 n1Var) {
        RecyclerView recyclerView;
        RecyclerView.q layoutManager;
        n1Var.getClass();
        f47536i.f("restoring initial position");
        C7129i iVar = n1Var.f47538b;
        C7129i.a aVar = n1Var.f47541e;
        iVar.getClass();
        if (!((aVar != null ? aVar.f47426b : null) == null || (recyclerView = aVar.f47425a.get()) == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            layoutManager.B1(aVar.f47426b);
        }
        n1Var.f47541e = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0278 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(com.contentsquare.android.sdk.r1 r18, androidx.recyclerview.widget.RecyclerView r19, java.lang.String r20, android.graphics.Rect r21, int r22, dI.C17164e<? super java.util.List<java.lang.Integer>> r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r5 = r21
            r7 = r22
            r2 = r23
            boolean r3 = r2 instanceof com.contentsquare.android.sdk.C7141n1.b
            if (r3 == 0) goto L_0x001e
            r3 = r2
            com.contentsquare.android.sdk.n1$b r3 = (com.contentsquare.android.sdk.C7141n1.b) r3
            int r4 = r3.f47553h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r4 & r6
            if (r8 == 0) goto L_0x001e
            int r4 = r4 - r6
            r3.f47553h = r4
        L_0x001c:
            r11 = r3
            goto L_0x0024
        L_0x001e:
            com.contentsquare.android.sdk.n1$b r3 = new com.contentsquare.android.sdk.n1$b
            r3.<init>(r0, r2)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r2 = r11.f47551f
            java.lang.Object r12 = eI.C17187b.f()
            int r3 = r11.f47553h
            r13 = 2
            r15 = 1
            if (r3 == 0) goto L_0x0053
            if (r3 == r15) goto L_0x0045
            if (r3 != r13) goto L_0x003d
            java.lang.Object r1 = r11.f47548c
            java.util.List r1 = (java.util.List) r1
            XH.y.b(r2)
            goto L_0x027a
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            com.contentsquare.android.sdk.w0$d r1 = r11.f47550e
            java.util.ArrayList r3 = r11.f47549d
            java.lang.Object r4 = r11.f47548c
            com.contentsquare.android.sdk.n1 r4 = (com.contentsquare.android.sdk.C7141n1) r4
            XH.y.b(r2)
            r15 = r3
            goto L_0x0256
        L_0x0053:
            XH.y.b(r2)
            java.lang.String r2 = "recyclerView"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "scrollContainerVisibleRect"
            kotlin.jvm.internal.C17542s.j(r5, r2)
            GJ.h r2 = I2.C4610g0.b(r19)
            com.contentsquare.android.sdk.s1 r3 = new com.contentsquare.android.sdk.s1
            r3.<init>(r0, r1)
            GJ.h r2 = GJ.C15768k.S(r2, r3)
            com.contentsquare.android.sdk.u1 r3 = new com.contentsquare.android.sdk.u1
            r3.<init>(r0)
            GJ.h r2 = GJ.C15768k.H(r2, r3)
            com.contentsquare.android.sdk.w1 r3 = new com.contentsquare.android.sdk.w1
            r3.<init>(r5)
            GJ.h r2 = GJ.C15768k.H(r2, r3)
            java.util.List r2 = GJ.C15768k.a0(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r3 = 10
            int r6 = YH.C16877v.y(r2, r3)
            r4.<init>(r6)
            java.util.Iterator r6 = r2.iterator()
        L_0x0092:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00a4
            java.lang.Object r8 = r6.next()
            com.contentsquare.android.sdk.n1$a r8 = (com.contentsquare.android.sdk.C7141n1.a) r8
            android.view.View r8 = r8.f47545a
            r4.add(r8)
            goto L_0x0092
        L_0x00a4:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r6 = YH.C16877v.y(r2, r3)
            r10.<init>(r6)
            java.util.Iterator r6 = r2.iterator()
        L_0x00b1:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00c7
            java.lang.Object r8 = r6.next()
            com.contentsquare.android.sdk.n1$a r8 = (com.contentsquare.android.sdk.C7141n1.a) r8
            int r8 = r8.f47546b
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.e(r8)
            r10.add(r8)
            goto L_0x00b1
        L_0x00c7:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r3 = YH.C16877v.y(r2, r3)
            r6.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x00d4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00e6
            java.lang.Object r3 = r2.next()
            com.contentsquare.android.sdk.n1$a r3 = (com.contentsquare.android.sdk.C7141n1.a) r3
            android.graphics.Rect r3 = r3.f47547c
            r6.add(r3)
            goto L_0x00d4
        L_0x00e6:
            java.util.ArrayList r2 = r0.f47542f
            int r2 = r2.size()
            int r8 = r7 - r2
            D8.c r2 = f47536i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r9 = "processed items: "
            r3.<init>(r9)
            r3.append(r8)
            java.lang.String r9 = " of "
            r3.append(r9)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r2.f(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r9 = "items on this page: "
            r3.<init>(r9)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.f(r3)
            int r2 = r7 + -1
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.e(r2)
            boolean r2 = r10.contains(r2)
            java.lang.String r3 = "scrollContainer"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "scrollRect"
            kotlin.jvm.internal.C17542s.j(r5, r3)
            java.lang.String r3 = "itemRectangles"
            kotlin.jvm.internal.C17542s.j(r6, r3)
            GJ.h r3 = I2.C4610g0.b(r19)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0140:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L_0x0174
            java.lang.Object r16 = r3.next()
            r13 = r16
            android.view.View r13 = (android.view.View) r13
            int r16 = r1.m0(r13)
            int[] r14 = r0.f47544h
            r13.getLocationOnScreen(r14)
            int[] r13 = r0.f47544h
            r13 = r13[r15]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            XH.v r13 = XH.C16796C.a(r14, r13)
            java.lang.Object r14 = r13.c()
            java.lang.Object r13 = r13.d()
            r9.put(r14, r13)
            r13 = 2
            goto L_0x0140
        L_0x0174:
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r0.f47543g
            int r3 = r21.height()
            java.util.Set r13 = r9.keySet()
            java.util.Set r14 = r1.keySet()
            java.util.Set r13 = YH.C16877v.C0(r13, r14)
            java.lang.Object r13 = YH.C16877v.x0(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 == 0) goto L_0x01a9
            java.lang.Object r1 = r1.get(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x019a
            int r3 = r1.intValue()
        L_0x019a:
            java.lang.Object r1 = r9.get(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x01a7
            int r1 = r1.intValue()
            goto L_0x01a8
        L_0x01a7:
            r1 = 0
        L_0x01a8:
            int r3 = r3 - r1
        L_0x01a9:
            D8.c r1 = f47536i
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "scrolledBy: "
            r13.<init>(r14)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            r1.f(r13)
            r0.f47543g = r9
            if (r2 == 0) goto L_0x0217
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r5)
            int r2 = r1.bottom
            int r2 = r2 - r3
            r1.top = r2
            java.util.Iterator r2 = r6.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L_0x01d6
            r3 = 0
            goto L_0x01fc
        L_0x01d6:
            java.lang.Object r3 = r2.next()
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            int r3 = r3.bottom
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x01e2:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x01fc
            java.lang.Object r9 = r2.next()
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            int r9 = r9.bottom
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r13 = r3.compareTo(r9)
            if (r13 >= 0) goto L_0x01e2
            r3 = r9
            goto L_0x01e2
        L_0x01fc:
            if (r3 == 0) goto L_0x0203
            int r2 = r3.intValue()
            goto L_0x0205
        L_0x0203:
            int r2 = r1.bottom
        L_0x0205:
            int r3 = r1.bottom
            int r2 = java.lang.Math.min(r3, r2)
            r1.bottom = r2
            int r3 = r1.top
            int r2 = java.lang.Math.min(r3, r2)
            r1.top = r2
            r13 = r1
            goto L_0x0218
        L_0x0217:
            r13 = r5
        L_0x0218:
            D8.c r1 = f47536i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "pageRect: "
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.f(r2)
            com.contentsquare.android.sdk.w0$d r14 = new com.contentsquare.android.sdk.w0$d
            r1 = r14
            r2 = r20
            r3 = r6
            r5 = r21
            r6 = r10
            r7 = r22
            r9 = r18
            r15 = r10
            r10 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            a9.O3 r1 = r0.f47539c
            com.contentsquare.android.sdk.n1$c r2 = new com.contentsquare.android.sdk.n1$c
            r2.<init>(r0)
            r11.f47548c = r0
            r11.f47549d = r15
            r11.f47550e = r14
            r3 = 1
            r11.f47553h = r3
            java.lang.Object r1 = r1.a(r2, r11)
            if (r1 != r12) goto L_0x0254
            return r12
        L_0x0254:
            r4 = r0
            r1 = r14
        L_0x0256:
            com.contentsquare.android.sdk.o0 r2 = r4.f47537a
            int r3 = r1.f47692g
            int r5 = r1.f47691f
            TJ.B<com.contentsquare.android.sdk.k0> r2 = r2.f47532a
            com.contentsquare.android.sdk.k0$e r6 = new com.contentsquare.android.sdk.k0$e
            r6.<init>(r3, r5)
            r2.a(r6)
            com.contentsquare.android.sdk.o0 r2 = r4.f47537a
            r11.f47548c = r15
            r3 = 0
            r11.f47549d = r3
            r11.f47550e = r3
            r3 = 2
            r11.f47553h = r3
            java.lang.Object r1 = r2.b(r1, r11)
            if (r1 != r12) goto L_0x0279
            return r12
        L_0x0279:
            r1 = r15
        L_0x027a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7141n1.c(com.contentsquare.android.sdk.r1, androidx.recyclerview.widget.RecyclerView, java.lang.String, android.graphics.Rect, int, dI.e):java.lang.Object");
    }
}
