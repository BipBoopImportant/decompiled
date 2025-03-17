package TF;

import SF.C16401b;
import SF.C16402c;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: TF.n  reason: case insensitive filesystem */
public final class C16471n implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138445a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f138446b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f138447c;

    private C16471n(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f138445a = constraintLayout;
        this.f138446b = imageView;
        this.f138447c = textView;
    }

    public static C16471n a(View view) {
        int i10 = C16401b.f138133g0;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = C16401b.f138136h0;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                return new C16471n((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C16471n c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C16402c.f138197f, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138445a;
    }
}
