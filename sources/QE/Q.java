package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class Q implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114429a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114430b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114431c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114432d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f114433e;

    private Q(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ImageView imageView, ProgressBar progressBar) {
        this.f114429a = constraintLayout;
        this.f114430b = floatingActionButton;
        this.f114431c = textView;
        this.f114432d = imageView;
        this.f114433e = progressBar;
    }

    public static Q a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113065q;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f113031j0;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f112963U1;
                    ProgressBar progressBar = (ProgressBar) b.a(view, i10);
                    if (progressBar != null) {
                        return new Q((ConstraintLayout) view, floatingActionButton, textView, imageView, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static Q c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113119O, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114429a;
    }
}
