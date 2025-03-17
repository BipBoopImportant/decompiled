package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: Fz.a  reason: case insensitive filesystem */
public final class C12911a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f110065a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f110066b;

    private C12911a(TextView textView, TextView textView2) {
        this.f110065a = textView;
        this.f110066b = textView2;
    }

    public static C12911a a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C12911a(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static C12911a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109633a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public TextView getRoot() {
        return this.f110065a;
    }
}
