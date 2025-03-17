package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class H implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114363a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114364b;

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f114365c;

    private H(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, ProgressBar progressBar) {
        this.f114363a = constraintLayout;
        this.f114364b = floatingActionButton;
        this.f114365c = progressBar;
    }

    public static H a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f112959T1;
            ProgressBar progressBar = (ProgressBar) b.a(view, i10);
            if (progressBar != null) {
                return new H((ConstraintLayout) view, floatingActionButton, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static H c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113110F, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114363a;
    }
}
