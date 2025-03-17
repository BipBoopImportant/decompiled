package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public final class A implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110035a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f110036b;

    /* renamed from: c  reason: collision with root package name */
    public final View f110037c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f110038d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f110039e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageButton f110040f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f110041g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageButton f110042h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f110043i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f110044j;

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView f110045k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f110046l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f110047m;

    private A(ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, MaterialButton materialButton, ConstraintLayout constraintLayout2, ImageButton imageButton, TextView textView, ImageButton imageButton2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RecyclerView recyclerView, TextView textView2, TextView textView3) {
        this.f110035a = constraintLayout;
        this.f110036b = frameLayout;
        this.f110037c = view;
        this.f110038d = materialButton;
        this.f110039e = constraintLayout2;
        this.f110040f = imageButton;
        this.f110041g = textView;
        this.f110042h = imageButton2;
        this.f110043i = appCompatTextView;
        this.f110044j = appCompatTextView2;
        this.f110045k = recyclerView;
        this.f110046l = textView2;
        this.f110047m = textView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = Ez.c.f109537S;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Fz.A a(android.view.View r17) {
        /*
            r0 = r17
            int r1 = Ez.c.f109519J
            android.view.View r2 = X4.b.a(r0, r1)
            r5 = r2
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x008e
            int r1 = Ez.c.f109537S
            android.view.View r6 = X4.b.a(r0, r1)
            if (r6 == 0) goto L_0x008e
            int r1 = Ez.c.f109541U
            android.view.View r2 = X4.b.a(r0, r1)
            r7 = r2
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            if (r7 == 0) goto L_0x008e
            int r1 = Ez.c.f109543V
            android.view.View r2 = X4.b.a(r0, r1)
            r8 = r2
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            if (r8 == 0) goto L_0x008e
            int r1 = Ez.c.f109551Z
            android.view.View r2 = X4.b.a(r0, r1)
            r9 = r2
            android.widget.ImageButton r9 = (android.widget.ImageButton) r9
            if (r9 == 0) goto L_0x008e
            int r1 = Ez.c.f109596o0
            android.view.View r2 = X4.b.a(r0, r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x008e
            int r1 = Ez.c.f109608s0
            android.view.View r2 = X4.b.a(r0, r1)
            r11 = r2
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            if (r11 == 0) goto L_0x008e
            int r1 = Ez.c.f109504B0
            android.view.View r2 = X4.b.a(r0, r1)
            r12 = r2
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            if (r12 == 0) goto L_0x008e
            int r1 = Ez.c.f109506C0
            android.view.View r2 = X4.b.a(r0, r1)
            r13 = r2
            androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
            if (r13 == 0) goto L_0x008e
            int r1 = Ez.c.f109567e1
            android.view.View r2 = X4.b.a(r0, r1)
            r14 = r2
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14
            if (r14 == 0) goto L_0x008e
            int r1 = Ez.c.f109606r1
            android.view.View r2 = X4.b.a(r0, r1)
            r15 = r2
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L_0x008e
            int r1 = Ez.c.f109609s1
            android.view.View r2 = X4.b.a(r0, r1)
            r16 = r2
            android.widget.TextView r16 = (android.widget.TextView) r16
            if (r16 == 0) goto L_0x008e
            Fz.A r1 = new Fz.A
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x008e:
            android.content.res.Resources r0 = r17.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Fz.A.a(android.view.View):Fz.A");
    }

    public static A c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static A d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109630B, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110035a;
    }
}
