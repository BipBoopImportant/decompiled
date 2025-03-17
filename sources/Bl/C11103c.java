package bl;

import X4.a;
import X4.b;
import al.C11067a;
import al.C11068b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: bl.c  reason: case insensitive filesystem */
public final class C11103c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f90472a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f90473b;

    private C11103c(ConstraintLayout constraintLayout, ImageView imageView) {
        this.f90472a = constraintLayout;
        this.f90473b = imageView;
    }

    public static C11103c a(View view) {
        int i10 = C11067a.f90302p;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            return new C11103c((ConstraintLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C11103c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C11068b.f90321i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90472a;
    }
}
