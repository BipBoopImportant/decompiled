package com.contentsquare.android.sdk;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import dI.C17164e;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.i  reason: case insensitive filesystem */
public final class C7129i {

    /* renamed from: com.contentsquare.android.sdk.i$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<RecyclerView> f47425a;

        /* renamed from: b  reason: collision with root package name */
        public final Parcelable f47426b;

        public a(WeakReference<RecyclerView> weakReference, Parcelable parcelable) {
            C17542s.j(weakReference, "recyclerViewRef");
            this.f47425a = weakReference;
            this.f47426b = parcelable;
        }
    }

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.RecyclerViewScroller", f = "RecyclerViewScroller.kt", l = {36, 38}, m = "scrollByAndWait")
    /* renamed from: com.contentsquare.android.sdk.i$b */
    public static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        public int f47427c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f47428d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C7129i f47429e;

        /* renamed from: f  reason: collision with root package name */
        public int f47430f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C7129i iVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f47429e = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f47428d = obj;
            this.f47430f |= Integer.MIN_VALUE;
            return this.f47429e.a((RecyclerView) null, 0, 0, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.contentsquare.android.sdk.C7129i.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.contentsquare.android.sdk.i$b r0 = (com.contentsquare.android.sdk.C7129i.b) r0
            int r1 = r0.f47430f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f47430f = r1
            goto L_0x0018
        L_0x0013:
            com.contentsquare.android.sdk.i$b r0 = new com.contentsquare.android.sdk.i$b
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f47428d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f47430f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r9)
            goto L_0x0062
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            int r8 = r0.f47427c
            XH.y.b(r9)
            goto L_0x004f
        L_0x003a:
            XH.y.b(r9)
            r9 = 0
            r6.scrollBy(r9, r7)
            r6.requestLayout()
            r0.f47427c = r8
            r0.f47430f = r4
            java.lang.Object r6 = a9.C6867k5.b(r6, r0)
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            if (r8 <= 0) goto L_0x0065
            IJ.b$a r6 = IJ.C15906b.f135496b
            IJ.e r6 = IJ.C15909e.MILLISECONDS
            long r6 = IJ.C15908d.s(r8, r6)
            r0.f47430f = r3
            java.lang.Object r6 = QJ.C16297b0.c(r6, r0)
            if (r6 != r1) goto L_0x0062
            return r1
        L_0x0062:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0065:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7129i.a(androidx.recyclerview.widget.RecyclerView, int, int, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(androidx.recyclerview.widget.RecyclerView r6, int r7, dI.C17164e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof a9.D
            if (r0 == 0) goto L_0x0013
            r0 = r8
            a9.D r0 = (a9.D) r0
            int r1 = r0.f41948f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f41948f = r1
            goto L_0x0018
        L_0x0013:
            a9.D r0 = new a9.D
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f41946d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f41948f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r8)
            goto L_0x005f
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            int r7 = r0.f41945c
            XH.y.b(r8)
            goto L_0x004c
        L_0x003a:
            XH.y.b(r8)
            r8 = 0
            r6.w1(r8)
            r0.f41945c = r7
            r0.f41948f = r4
            java.lang.Object r6 = a9.C6867k5.b(r6, r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            if (r7 <= 0) goto L_0x0062
            IJ.b$a r6 = IJ.C15906b.f135496b
            IJ.e r6 = IJ.C15909e.MILLISECONDS
            long r6 = IJ.C15908d.s(r7, r6)
            r0.f41948f = r3
            java.lang.Object r6 = QJ.C16297b0.c(r6, r0)
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0062:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7129i.b(androidx.recyclerview.widget.RecyclerView, int, dI.e):java.lang.Object");
    }
}
