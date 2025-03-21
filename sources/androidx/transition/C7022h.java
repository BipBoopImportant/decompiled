package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: androidx.transition.h  reason: case insensitive filesystem */
class C7022h implements TypeEvaluator<Rect> {

    /* renamed from: a  reason: collision with root package name */
    private Rect f44675a;

    C7022h() {
    }

    /* renamed from: a */
    public Rect evaluate(float f10, Rect rect, Rect rect2) {
        int i10 = rect.left;
        int i11 = i10 + ((int) (((float) (rect2.left - i10)) * f10));
        int i12 = rect.top;
        int i13 = i12 + ((int) (((float) (rect2.top - i12)) * f10));
        int i14 = rect.right;
        int i15 = i14 + ((int) (((float) (rect2.right - i14)) * f10));
        int i16 = rect.bottom;
        int i17 = i16 + ((int) (((float) (rect2.bottom - i16)) * f10));
        Rect rect3 = this.f44675a;
        if (rect3 == null) {
            return new Rect(i11, i13, i15, i17);
        }
        rect3.set(i11, i13, i15, i17);
        return this.f44675a;
    }
}
