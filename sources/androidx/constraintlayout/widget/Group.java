package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f20151e = false;
    }

    public void o(ConstraintLayout constraintLayout) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f20251v0.o1(0);
        bVar.f20251v0.P0(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        g();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        g();
    }
}
