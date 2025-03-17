package Oa;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: Oa.b  reason: case insensitive filesystem */
public final class C9154b {

    /* renamed from: a  reason: collision with root package name */
    private final View f62047a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f62048b = false;

    /* renamed from: c  reason: collision with root package name */
    private int f62049c = 0;

    public C9154b(C9153a aVar) {
        this.f62047a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f62047a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f62047a);
        }
    }

    public int b() {
        return this.f62049c;
    }

    public boolean c() {
        return this.f62048b;
    }

    public void d(Bundle bundle) {
        this.f62048b = bundle.getBoolean("expanded", false);
        this.f62049c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f62048b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f62048b);
        bundle.putInt("expandedComponentIdHint", this.f62049c);
        return bundle;
    }

    public void f(int i10) {
        this.f62049c = i10;
    }
}
