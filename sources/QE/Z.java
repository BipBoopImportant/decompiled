package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class Z implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f114493a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114494b;

    private Z(LinearLayout linearLayout, TextView textView) {
        this.f114493a = linearLayout;
        this.f114494b = textView;
    }

    public static Z a(View view) {
        int i10 = C13317i.f113095x1;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            return new Z((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static Z c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113127W, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f114493a;
    }
}
