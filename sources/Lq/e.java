package lq;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import jq.n;
import jq.o;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f99477a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f99478b;

    private e(ConstraintLayout constraintLayout, TextView textView) {
        this.f99477a = constraintLayout;
        this.f99478b = textView;
    }

    public static e a(View view) {
        int i10 = n.f98665j;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            return new e((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static e c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o.f98675e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f99477a;
    }
}
