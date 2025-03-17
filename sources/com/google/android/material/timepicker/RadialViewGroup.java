package com.google.android.material.timepicker;

import Ea.C9072f;
import Ea.C9074h;
import Ea.C9078l;
import I2.C4600b0;
import Ua.C9286g;
import Ua.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RadialViewGroup extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private int f67602A;

    /* renamed from: B  reason: collision with root package name */
    private C9286g f67603B;

    /* renamed from: z  reason: collision with root package name */
    private final Runnable f67604z;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void D(List<View> list, c cVar, int i10) {
        float f10 = 0.0f;
        for (View id2 : list) {
            cVar.j(id2.getId(), C9072f.f59485c, i10, f10);
            f10 += 360.0f / ((float) list.size());
        }
    }

    private Drawable E() {
        C9286g gVar = new C9286g();
        this.f67603B = gVar;
        gVar.Z(new i(0.5f));
        this.f67603B.b0(ColorStateList.valueOf(-1));
        return this.f67603B;
    }

    private static boolean I(View view) {
        return "skip".equals(view.getTag());
    }

    private void K() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f67604z);
            handler.post(this.f67604z);
        }
    }

    /* access modifiers changed from: package-private */
    public int F(int i10) {
        return i10 == 2 ? Math.round(((float) this.f67602A) * 0.66f) : this.f67602A;
    }

    public int G() {
        return this.f67602A;
    }

    public void H(int i10) {
        this.f67602A = i10;
        J();
    }

    /* access modifiers changed from: protected */
    public void J() {
        c cVar = new c();
        cVar.g(this);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != C9072f.f59485c && !I(childAt)) {
                int i11 = (Integer) childAt.getTag(C9072f.f59495m);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, new ArrayList());
                }
                ((List) hashMap.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            D((List) entry.getValue(), cVar, F(((Integer) entry.getKey()).intValue()));
        }
        cVar.c(this);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(C4600b0.k());
        }
        K();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        J();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        K();
    }

    public void setBackgroundColor(int i10) {
        this.f67603B.b0(ColorStateList.valueOf(i10));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(C9074h.f59532p, this);
        C4600b0.t0(this, E());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f59952f6, i10, 0);
        this.f67602A = obtainStyledAttributes.getDimensionPixelSize(C9078l.f59963g6, 0);
        this.f67604z = new c(this);
        obtainStyledAttributes.recycle();
    }
}
