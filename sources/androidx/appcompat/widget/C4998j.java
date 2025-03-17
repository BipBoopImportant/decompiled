package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import i.C5430j;

/* renamed from: androidx.appcompat.widget.j  reason: case insensitive filesystem */
class C4998j extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f16527b = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f16528a;

    public C4998j(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        M v10 = M.v(context, attributeSet, C5430j.f24139Y1, i10, i11);
        if (v10.s(C5430j.f24148a2)) {
            b(v10.a(C5430j.f24148a2, false));
        }
        setBackgroundDrawable(v10.g(C5430j.f24143Z1));
        v10.x();
    }

    private void b(boolean z10) {
        if (f16527b) {
            this.f16528a = z10;
        } else {
            h.a(this, z10);
        }
    }

    public void showAsDropDown(View view, int i10, int i11) {
        if (f16527b && this.f16528a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f16527b && this.f16528a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f16527b && this.f16528a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
