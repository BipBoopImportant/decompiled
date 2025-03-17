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

/* renamed from: QE.o  reason: case insensitive filesystem */
public final class C13438o implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114666a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f114667b;

    private C13438o(ConstraintLayout constraintLayout, ProgressBar progressBar) {
        this.f114666a = constraintLayout;
        this.f114667b = progressBar;
    }

    public static C13438o a(View view) {
        int i10 = C13317i.f113032j1;
        ProgressBar progressBar = (ProgressBar) b.a(view, i10);
        if (progressBar != null) {
            return new C13438o((ConstraintLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13438o c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113143j, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114666a;
    }
}
