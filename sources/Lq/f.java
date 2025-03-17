package lq;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import jq.n;
import jq.o;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f99479a;

    /* renamed from: b  reason: collision with root package name */
    public final Guideline f99480b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f99481c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f99482d;

    private f(ConstraintLayout constraintLayout, Guideline guideline, TextView textView, TextView textView2) {
        this.f99479a = constraintLayout;
        this.f99480b = guideline;
        this.f99481c = textView;
        this.f99482d = textView2;
    }

    public static f a(View view) {
        int i10 = n.f98663h;
        Guideline guideline = (Guideline) b.a(view, i10);
        if (guideline != null) {
            i10 = n.f98668m;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = n.f98670o;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    return new f((ConstraintLayout) view, guideline, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o.f98676f, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f99479a;
    }
}
