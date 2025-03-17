package TF;

import SF.C16402c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: TF.c  reason: case insensitive filesystem */
public final class C16460c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f138397a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f138398b;

    private C16460c(TextView textView, TextView textView2) {
        this.f138397a = textView;
        this.f138398b = textView2;
    }

    public static C16460c a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C16460c(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static C16460c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C16402c.f138192a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public TextView getRoot() {
        return this.f138397a;
    }
}
