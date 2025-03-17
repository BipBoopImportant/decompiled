package Ep;

import Dp.j;
import Dp.k;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f80746a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f80747b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f80748c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f80749d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f80750e;

    private b(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, ConstraintLayout constraintLayout2) {
        this.f80746a = constraintLayout;
        this.f80747b = imageView;
        this.f80748c = textView;
        this.f80749d = imageView2;
        this.f80750e = constraintLayout2;
    }

    public static b a(View view) {
        int i10 = j.f80129a;
        ImageView imageView = (ImageView) X4.b.a(view, i10);
        if (imageView != null) {
            i10 = j.f80134f;
            TextView textView = (TextView) X4.b.a(view, i10);
            if (textView != null) {
                i10 = j.f80135g;
                ImageView imageView2 = (ImageView) X4.b.a(view, i10);
                if (imageView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new b(constraintLayout, imageView, textView, imageView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(k.f80139c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f80746a;
    }
}
