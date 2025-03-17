package com.sugarcube.decorate.v1.internal.v1.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import jH.C17413j;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_DraggableToolbar extends ConstraintLayout implements C17600c {

    /* renamed from: A  reason: collision with root package name */
    private boolean f142218A;

    /* renamed from: z  reason: collision with root package name */
    private C17413j f142219z;

    Hilt_DraggableToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            F();
        }
    }

    public final C17413j D() {
        if (this.f142219z == null) {
            this.f142219z = E();
        }
        return this.f142219z;
    }

    /* access modifiers changed from: protected */
    public C17413j E() {
        return new C17413j(this, false);
    }

    /* access modifiers changed from: protected */
    public void F() {
        if (!this.f142218A) {
            this.f142218A = true;
            ((DraggableToolbar_GeneratedInjector) g0()).injectDraggableToolbar((DraggableToolbar) C17602e.a(this));
        }
    }

    public final Object g0() {
        return D().g0();
    }
}
