package com.contentsquare.android.sdk;

import E8.b;
import G8.t;
import a9.C6785a3;
import a9.C6854j0;
import a9.C6949v0;
import a9.D6;
import a9.K6;
import android.view.View;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;
import w8.C8933a;
import z8.C9036b;

public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public final t f47500a;

    /* renamed from: b  reason: collision with root package name */
    public final C6785a3 f47501b;

    /* renamed from: c  reason: collision with root package name */
    public final C8933a f47502c;

    /* renamed from: d  reason: collision with root package name */
    public final K6 f47503d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f47504e = new int[2];

    /* renamed from: f  reason: collision with root package name */
    public final a1 f47505f = new a1();

    /* renamed from: g  reason: collision with root package name */
    public final C6854j0 f47506g = new C6854j0(new C6949v0());

    /* renamed from: h  reason: collision with root package name */
    public boolean f47507h;

    public m1(t tVar, C6785a3 a3Var, C8933a aVar, K6 k62) {
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(a3Var, "maskingParameter");
        this.f47500a = tVar;
        this.f47501b = a3Var;
        this.f47502c = aVar;
        this.f47503d = k62;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final z8.C9036b a(int r20, int r21, int r22, int r23, android.view.View r24, int r25, int r26, boolean r27) {
        /*
            r19 = this;
            r7 = r19
            r0 = r24
            z8.b$a r1 = z8.C9036b.f58523D
            z8.b r8 = r1.c()
            G8.t r1 = r7.f47500a
            int r1 = r1.b(r0)
            long r1 = (long) r1
            r8.b0(r1)
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            boolean r1 = r1.s(r0)
            r8.i0(r1)
            boolean r1 = r7.f47507h
            java.lang.String r2 = "view"
            r3 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.Class r1 = r24.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r8.L(r1)
            a9.j0 r1 = r7.f47506g
            r1.getClass()
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r1.c(r0, r4, r3)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "data.toString()"
            kotlin.jvm.internal.C17542s.i(r1, r4)
            r8.V(r1)
        L_0x004f:
            boolean r1 = r24.isClickable()
            r9 = 1
            if (r1 != 0) goto L_0x005f
            boolean r1 = r24.isLongClickable()
            if (r1 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r1 = r3
            goto L_0x0060
        L_0x005f:
            r1 = r9
        L_0x0060:
            r8.M(r1)
            com.contentsquare.android.sdk.a1 r10 = r7.f47505f
            int r13 = r24.getWidth()
            int r14 = r24.getHeight()
            r11 = r25
            r12 = r26
            r15 = r20
            r16 = r21
            r17 = r22
            r18 = r23
            com.contentsquare.android.sdk.a1$a r1 = r10.a(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r4 = "rectangleMaths.clip(\n   … clippingHeight\n        )"
            kotlin.jvm.internal.C17542s.i(r1, r4)
            android.graphics.Rect r4 = r1.f47284a
            int r4 = r4.left
            r8.Z(r4)
            android.graphics.Rect r4 = r1.f47284a
            int r4 = r4.top
            r8.a0(r4)
            android.graphics.Rect r4 = r1.f47284a
            int r4 = r4.width()
            r8.j0(r4)
            android.graphics.Rect r4 = r1.f47284a
            int r4 = r4.height()
            r8.T(r4)
            float r1 = r1.f47285b
            r8.O(r1)
            a9.K6 r1 = r7.f47503d
            if (r1 == 0) goto L_0x00dd
            kotlin.jvm.internal.C17542s.j(r0, r2)
            a9.C6 r4 = r1.f42107b
            r4.getClass()
            boolean r4 = a9.C6.a(r24)
            if (r4 != 0) goto L_0x00ba
            goto L_0x00dd
        L_0x00ba:
            G8.t r4 = r1.f42106a
            int r4 = r4.b(r0)
            long r4 = (long) r4
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            java.util.LinkedHashMap r10 = r1.f42109d
            boolean r6 = r10.containsKey(r6)
            if (r6 != 0) goto L_0x00db
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.util.LinkedHashMap r1 = r1.f42109d
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r0)
            r1.put(r4, r5)
        L_0x00db:
            r1 = r9
            goto L_0x00de
        L_0x00dd:
            r1 = r3
        L_0x00de:
            int r4 = r24.getVisibility()
            if (r4 != 0) goto L_0x00e6
            r4 = r9
            goto L_0x00e7
        L_0x00e6:
            r4 = r3
        L_0x00e7:
            r8.h0(r4)
            android.graphics.drawable.Drawable r4 = r24.getBackground()
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00fb
            boolean r4 = r4 instanceof android.graphics.drawable.ColorDrawable
            if (r4 == 0) goto L_0x00fb
            float r4 = r24.getAlpha()
            goto L_0x00fd
        L_0x00fb:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00fd:
            r8.e0(r4)
            r8.I(r1)
            if (r5 == 0) goto L_0x010f
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r1 = r1.getClipChildren()
            r8.N(r1)
        L_0x010f:
            a9.a3 r1 = r7.f47501b
            r1.getClass()
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.util.WeakHashMap r2 = r1.f42448b
            java.lang.Object r2 = r2.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0126
            boolean r1 = r2.booleanValue()
            goto L_0x0171
        L_0x0126:
            java.util.List<a9.a3$a> r1 = r1.f42449c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0131:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x014a
            java.lang.Object r4 = r1.next()
            r6 = r4
            a9.a3$a r6 = (a9.C6785a3.a) r6
            java.lang.Class<?> r6 = r6.f42450a
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0131
            r2.add(r4)
            goto L_0x0131
        L_0x014a:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0153
            r1 = r27
            goto L_0x0171
        L_0x0153:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x015a
            goto L_0x0170
        L_0x015a:
            java.util.Iterator r1 = r2.iterator()
        L_0x015e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0170
            java.lang.Object r2 = r1.next()
            a9.a3$a r2 = (a9.C6785a3.a) r2
            boolean r2 = r2.f42451b
            if (r2 == 0) goto L_0x015e
            r1 = r9
            goto L_0x0171
        L_0x0170:
            r1 = r3
        L_0x0171:
            r8.X(r1)
            w8.a r1 = r7.f47502c
            r2 = 0
            if (r1 == 0) goto L_0x01dc
            boolean r1 = r1.a(r0)
            if (r1 != r9) goto L_0x01dc
            if (r5 == 0) goto L_0x01dc
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            w8.a r1 = r7.f47502c
            if (r1 == 0) goto L_0x024a
            boolean r3 = r7.f47507h
            r1.e(r0, r8, r3)
            GJ.h r0 = I2.C4610g0.b(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0194:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01a8
            java.lang.Object r3 = r0.next()
            r4 = r3
            android.view.View r4 = (android.view.View) r4
            boolean r4 = r1.d(r4)
            if (r4 == 0) goto L_0x0194
            goto L_0x01a9
        L_0x01a8:
            r3 = r2
        L_0x01a9:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x01b1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = r3
            goto L_0x01b2
        L_0x01b1:
            r1 = r2
        L_0x01b2:
            if (r1 == 0) goto L_0x024a
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r8
            r0.c(r1, r2, r3, r4, r5, r6)
            java.util.List r0 = r8.h()
            int r0 = r0.size()
            r1 = 2
            if (r0 != r1) goto L_0x024a
            java.util.List r0 = r8.h()
            java.lang.Object r0 = r0.get(r9)
            z8.b r0 = (z8.C9036b) r0
            r0.d0(r9)
            goto L_0x024a
        L_0x01dc:
            if (r5 == 0) goto L_0x0222
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = r0.getClipChildren()
            if (r1 == 0) goto L_0x01f7
            int r1 = r8.p()
            int r2 = r8.q()
            int r4 = r8.w()
            int r5 = r8.l()
            goto L_0x01ff
        L_0x01f7:
            r1 = r20
            r2 = r21
            r4 = r22
            r5 = r23
        L_0x01ff:
            int r6 = r0.getChildCount()
        L_0x0203:
            if (r3 >= r6) goto L_0x024a
            android.view.View r9 = r0.getChildAt(r3)
            java.lang.String r10 = "child"
            kotlin.jvm.internal.C17542s.i(r9, r10)
            r20 = r19
            r21 = r9
            r22 = r1
            r23 = r2
            r24 = r4
            r25 = r5
            r26 = r8
            r20.c(r21, r22, r23, r24, r25, r26)
            int r3 = r3 + 1
            goto L_0x0203
        L_0x0222:
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x024a
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r1 = r0.getText()
            r8.c0(r1)
            java.lang.CharSequence r1 = r0.getError()
            r8.R(r1)
            java.lang.CharSequence r1 = r0.getHint()
            r8.U(r1)
            android.text.Editable r0 = r0.getEditableText()
            if (r0 == 0) goto L_0x0247
            java.lang.String r2 = r0.toString()
        L_0x0247:
            r8.P(r2)
        L_0x024a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.m1.a(int, int, int, int, android.view.View, int, int, boolean):z8.b");
    }

    public final C9036b b(View view) {
        C17542s.j(view, "view");
        this.f47507h = D6.a(C8886a.f56874d.a(), "snapshot_capture_SR");
        view.getLocationInWindow(this.f47504e);
        int[] iArr = this.f47504e;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int width = view.getWidth() + i10;
        int height = view.getHeight() + this.f47504e[1];
        int[] iArr2 = this.f47504e;
        return a(i10, i11, width, height, view, iArr2[0], iArr2[1], this.f47501b.f42447a.b(b.SESSION_REPLAY_DEFAULT_MASKING, true));
    }

    public final void c(View view, int i10, int i11, int i12, int i13, C9036b bVar) {
        int i14 = i10;
        int i15 = i11;
        View view2 = view;
        view.getLocationInWindow(this.f47504e);
        if (view.getVisibility() == 0) {
            a1 a1Var = this.f47505f;
            int[] iArr = this.f47504e;
            int i16 = iArr[0];
            int i17 = iArr[1];
            int width = view.getWidth();
            int height = view.getHeight();
            a1Var.getClass();
            if (width + i16 > i14 && height + i17 > i15 && i16 < i14 + i12 && i17 < i15 + i13) {
                int[] iArr2 = this.f47504e;
                C9036b a10 = a(i10, i11, i12, i13, view, iArr2[0], iArr2[1], bVar.C());
                a10.Y(bVar.r());
                a10.W(bVar.h().size());
                bVar.h().add(a10);
            }
        }
    }
}
