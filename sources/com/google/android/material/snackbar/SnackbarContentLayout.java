package com.google.android.material.snackbar;

import Ea.C9068b;
import Ea.C9070d;
import Ea.C9072f;
import Fa.C9081a;
import I2.C4600b0;
import La.C9138a;
import Qa.C9242i;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: a  reason: collision with root package name */
    private TextView f67216a;

    /* renamed from: b  reason: collision with root package name */
    private Button f67217b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeInterpolator f67218c;

    /* renamed from: d  reason: collision with root package name */
    private int f67219d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67218c = C9242i.g(context, C9068b.f59312R, C9081a.f60372b);
    }

    private static void d(View view, int i10, int i11) {
        if (C4600b0.U(view)) {
            C4600b0.F0(view, C4600b0.E(view), i10, C4600b0.D(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f67216a.getPaddingTop() == i11 && this.f67216a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f67216a, i11, i12);
        return true;
    }

    public void a(int i10, int i11) {
        this.f67216a.setAlpha(0.0f);
        long j10 = (long) i11;
        long j11 = (long) i10;
        this.f67216a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f67218c).setStartDelay(j11).start();
        if (this.f67217b.getVisibility() == 0) {
            this.f67217b.setAlpha(0.0f);
            this.f67217b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f67218c).setStartDelay(j11).start();
        }
    }

    public void b(int i10, int i11) {
        this.f67216a.setAlpha(1.0f);
        long j10 = (long) i11;
        long j11 = (long) i10;
        this.f67216a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f67218c).setStartDelay(j11).start();
        if (this.f67217b.getVisibility() == 0) {
            this.f67217b.setAlpha(1.0f);
            this.f67217b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f67218c).setStartDelay(j11).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(float f10) {
        if (f10 != 1.0f) {
            this.f67217b.setTextColor(C9138a.j(C9138a.d(this, C9068b.f59352q), this.f67217b.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f67217b;
    }

    public TextView getMessageView() {
        return this.f67216a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f67216a = (TextView) findViewById(C9072f.f59472O);
        this.f67217b = (Button) findViewById(C9072f.f59471N);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C9070d.f59412h);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C9070d.f59410g);
            Layout layout = this.f67216a.getLayout();
            boolean z10 = layout != null && layout.getLineCount() > 1;
            if (!z10 || this.f67219d <= 0 || this.f67217b.getMeasuredWidth() <= this.f67219d) {
                if (!z10) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i10, i11);
        }
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f67219d = i10;
    }
}
