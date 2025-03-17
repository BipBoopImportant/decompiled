package com.google.android.material.datepicker;

import Ea.C9068b;
import Ea.C9078l;
import Ra.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f66605a;

    /* renamed from: b  reason: collision with root package name */
    final b f66606b;

    /* renamed from: c  reason: collision with root package name */
    final b f66607c;

    /* renamed from: d  reason: collision with root package name */
    final b f66608d;

    /* renamed from: e  reason: collision with root package name */
    final b f66609e;

    /* renamed from: f  reason: collision with root package name */
    final b f66610f;

    /* renamed from: g  reason: collision with root package name */
    final b f66611g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f66612h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.d(context, C9068b.f59297C, MaterialCalendar.class.getCanonicalName()), C9078l.f59804R3);
        this.f66605a = b.a(context, obtainStyledAttributes.getResourceId(C9078l.f59844V3, 0));
        this.f66611g = b.a(context, obtainStyledAttributes.getResourceId(C9078l.f59824T3, 0));
        this.f66606b = b.a(context, obtainStyledAttributes.getResourceId(C9078l.f59834U3, 0));
        this.f66607c = b.a(context, obtainStyledAttributes.getResourceId(C9078l.f59854W3, 0));
        ColorStateList a10 = Ra.c.a(context, obtainStyledAttributes, C9078l.f59864X3);
        this.f66608d = b.a(context, obtainStyledAttributes.getResourceId(C9078l.f59884Z3, 0));
        this.f66609e = b.a(context, obtainStyledAttributes.getResourceId(C9078l.f59874Y3, 0));
        this.f66610f = b.a(context, obtainStyledAttributes.getResourceId(C9078l.f59895a4, 0));
        Paint paint = new Paint();
        this.f66612h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
