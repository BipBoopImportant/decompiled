package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class e<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private f f65980a;

    /* renamed from: b  reason: collision with root package name */
    private int f65981b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f65982c = 0;

    public e() {
    }

    public int I() {
        f fVar = this.f65980a;
        if (fVar != null) {
            return fVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void J(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.I(v10, i10);
    }

    public boolean K(int i10) {
        f fVar = this.f65980a;
        if (fVar != null) {
            return fVar.e(i10);
        }
        this.f65981b = i10;
        return false;
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        J(coordinatorLayout, v10, i10);
        if (this.f65980a == null) {
            this.f65980a = new f(v10);
        }
        this.f65980a.c();
        this.f65980a.a();
        int i11 = this.f65981b;
        if (i11 != 0) {
            this.f65980a.e(i11);
            this.f65981b = 0;
        }
        int i12 = this.f65982c;
        if (i12 == 0) {
            return true;
        }
        this.f65980a.d(i12);
        this.f65982c = 0;
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
