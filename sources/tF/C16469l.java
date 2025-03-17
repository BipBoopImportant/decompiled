package TF;

import SF.C16402c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: TF.l  reason: case insensitive filesystem */
public final class C16469l implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f138443a;

    private C16469l(TextView textView) {
        this.f138443a = textView;
    }

    public static C16469l a(View view) {
        if (view != null) {
            return new C16469l((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static C16469l c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C16402c.f138195d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public TextView getRoot() {
        return this.f138443a;
    }
}
