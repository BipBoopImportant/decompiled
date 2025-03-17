package com.google.android.material.tabs;

import Fa.C9081a;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

class b extends c {
    b() {
    }

    /* access modifiers changed from: package-private */
    public void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        int i10 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        if (i10 >= 0) {
            view = view2;
        }
        RectF a10 = c.a(tabLayout, view);
        float b10 = i10 < 0 ? C9081a.b(1.0f, 0.0f, 0.0f, 0.5f, f10) : C9081a.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
        drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b10 * 255.0f));
    }
}
