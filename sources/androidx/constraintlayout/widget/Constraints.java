package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Constraints extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    c f20266a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public c getConstraintSet() {
        if (this.f20266a == null) {
            this.f20266a = new c();
        }
        this.f20266a.h(this);
        return this.f20266a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public static class a extends ConstraintLayout.b {

        /* renamed from: A0  reason: collision with root package name */
        public float f20267A0;

        /* renamed from: B0  reason: collision with root package name */
        public float f20268B0;

        /* renamed from: C0  reason: collision with root package name */
        public float f20269C0;

        /* renamed from: D0  reason: collision with root package name */
        public float f20270D0;

        /* renamed from: E0  reason: collision with root package name */
        public float f20271E0;

        /* renamed from: F0  reason: collision with root package name */
        public float f20272F0;

        /* renamed from: G0  reason: collision with root package name */
        public float f20273G0;

        /* renamed from: H0  reason: collision with root package name */
        public float f20274H0;

        /* renamed from: I0  reason: collision with root package name */
        public float f20275I0;

        /* renamed from: J0  reason: collision with root package name */
        public float f20276J0;

        /* renamed from: x0  reason: collision with root package name */
        public float f20277x0;

        /* renamed from: y0  reason: collision with root package name */
        public boolean f20278y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f20279z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f20277x0 = 1.0f;
            this.f20278y0 = false;
            this.f20279z0 = 0.0f;
            this.f20267A0 = 0.0f;
            this.f20268B0 = 0.0f;
            this.f20269C0 = 0.0f;
            this.f20270D0 = 1.0f;
            this.f20271E0 = 1.0f;
            this.f20272F0 = 0.0f;
            this.f20273G0 = 0.0f;
            this.f20274H0 = 0.0f;
            this.f20275I0 = 0.0f;
            this.f20276J0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20277x0 = 1.0f;
            this.f20278y0 = false;
            this.f20279z0 = 0.0f;
            this.f20267A0 = 0.0f;
            this.f20268B0 = 0.0f;
            this.f20269C0 = 0.0f;
            this.f20270D0 = 1.0f;
            this.f20271E0 = 1.0f;
            this.f20272F0 = 0.0f;
            this.f20273G0 = 0.0f;
            this.f20274H0 = 0.0f;
            this.f20275I0 = 0.0f;
            this.f20276J0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f20822s4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20831t4) {
                    this.f20277x0 = obtainStyledAttributes.getFloat(index, this.f20277x0);
                } else if (index == f.f20484E4) {
                    this.f20279z0 = obtainStyledAttributes.getFloat(index, this.f20279z0);
                    this.f20278y0 = true;
                } else if (index == f.f20458B4) {
                    this.f20268B0 = obtainStyledAttributes.getFloat(index, this.f20268B0);
                } else if (index == f.f20467C4) {
                    this.f20269C0 = obtainStyledAttributes.getFloat(index, this.f20269C0);
                } else if (index == f.f20449A4) {
                    this.f20267A0 = obtainStyledAttributes.getFloat(index, this.f20267A0);
                } else if (index == f.f20876y4) {
                    this.f20270D0 = obtainStyledAttributes.getFloat(index, this.f20270D0);
                } else if (index == f.f20885z4) {
                    this.f20271E0 = obtainStyledAttributes.getFloat(index, this.f20271E0);
                } else if (index == f.f20840u4) {
                    this.f20272F0 = obtainStyledAttributes.getFloat(index, this.f20272F0);
                } else if (index == f.f20849v4) {
                    this.f20273G0 = obtainStyledAttributes.getFloat(index, this.f20273G0);
                } else if (index == f.f20858w4) {
                    this.f20274H0 = obtainStyledAttributes.getFloat(index, this.f20274H0);
                } else if (index == f.f20867x4) {
                    this.f20275I0 = obtainStyledAttributes.getFloat(index, this.f20275I0);
                } else if (index == f.f20476D4) {
                    this.f20276J0 = obtainStyledAttributes.getFloat(index, this.f20276J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
