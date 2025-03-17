package androidx.recyclerview.widget;

import I2.C4600b0;
import M4.c;
import android.graphics.Canvas;
import android.view.View;

class n implements m {

    /* renamed from: a  reason: collision with root package name */
    static final m f44159a = new n();

    n() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float u10 = C4600b0.u(childAt);
                if (u10 > f10) {
                    f10 = u10;
                }
            }
        }
        return f10;
    }

    public void a(View view) {
        Object tag = view.getTag(c.f38485a);
        if (tag instanceof Float) {
            C4600b0.x0(view, ((Float) tag).floatValue());
        }
        view.setTag(c.f38485a, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void b(View view) {
    }

    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10 && view.getTag(c.f38485a) == null) {
            Float valueOf = Float.valueOf(C4600b0.u(view));
            C4600b0.x0(view, e(recyclerView, view) + 1.0f);
            view.setTag(c.f38485a, valueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }
}
