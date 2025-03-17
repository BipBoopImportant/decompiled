package com.google.android.material.datepicker;

import Ea.C9078l;
import H2.i;
import I2.C4600b0;
import Ra.c;
import Ua.C9286g;
import Ua.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f66599a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f66600b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f66601c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f66602d;

    /* renamed from: e  reason: collision with root package name */
    private final int f66603e;

    /* renamed from: f  reason: collision with root package name */
    private final k f66604f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, k kVar, Rect rect) {
        i.d(rect.left);
        i.d(rect.top);
        i.d(rect.right);
        i.d(rect.bottom);
        this.f66599a = rect;
        this.f66600b = colorStateList2;
        this.f66601c = colorStateList;
        this.f66602d = colorStateList3;
        this.f66603e = i10;
        this.f66604f = kVar;
    }

    static b a(Context context, int i10) {
        i.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, C9078l.f59906b4);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C9078l.f59917c4, 0), obtainStyledAttributes.getDimensionPixelOffset(C9078l.f59939e4, 0), obtainStyledAttributes.getDimensionPixelOffset(C9078l.f59928d4, 0), obtainStyledAttributes.getDimensionPixelOffset(C9078l.f59950f4, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, C9078l.f59961g4);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, C9078l.f60016l4);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, C9078l.f59994j4);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C9078l.f60005k4, 0);
        k m10 = k.b(context, obtainStyledAttributes.getResourceId(C9078l.f59972h4, 0), obtainStyledAttributes.getResourceId(C9078l.f59983i4, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f66599a.bottom;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f66599a.top;
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView) {
        e(textView, (ColorStateList) null, (ColorStateList) null);
    }

    /* access modifiers changed from: package-private */
    public void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        C9286g gVar = new C9286g();
        C9286g gVar2 = new C9286g();
        gVar.setShapeAppearanceModel(this.f66604f);
        gVar2.setShapeAppearanceModel(this.f66604f);
        if (colorStateList == null) {
            colorStateList = this.f66601c;
        }
        gVar.b0(colorStateList);
        gVar.i0((float) this.f66603e, this.f66602d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f66600b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f66600b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f66599a;
        C4600b0.t0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
