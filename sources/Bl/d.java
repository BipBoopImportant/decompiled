package bl;

import X4.a;
import al.C11068b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final View f90474a;

    /* renamed from: b  reason: collision with root package name */
    public final View f90475b;

    private d(View view, View view2) {
        this.f90474a = view;
        this.f90475b = view2;
    }

    public static d a(View view) {
        if (view != null) {
            return new d(view, view);
        }
        throw new NullPointerException("rootView");
    }

    public static d b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C11068b.f90322j, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public View getRoot() {
        return this.f90474a;
    }
}
