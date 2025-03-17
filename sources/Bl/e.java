package bl;

import X4.a;
import al.C11068b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f90476a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f90477b;

    private e(TextView textView, TextView textView2) {
        this.f90476a = textView;
        this.f90477b = textView2;
    }

    public static e a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new e(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static e c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C11068b.f90328p, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public TextView getRoot() {
        return this.f90476a;
    }
}
