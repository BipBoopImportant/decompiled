package bl;

import X4.a;
import X4.b;
import al.C11067a;
import al.C11068b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: bl.a  reason: case insensitive filesystem */
public final class C11101a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f90463a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f90464b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f90465c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f90466d;

    private C11101a(ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.f90463a = constraintLayout;
        this.f90464b = imageView;
        this.f90465c = recyclerView;
        this.f90466d = textView;
    }

    public static C11101a a(View view) {
        int i10 = C11067a.f90288b;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = C11067a.f90304r;
            RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
            if (recyclerView != null) {
                i10 = C11067a.f90312z;
                TextView textView = (TextView) b.a(view, i10);
                if (textView != null) {
                    return new C11101a((ConstraintLayout) view, imageView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C11101a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C11068b.f90317e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90463a;
    }
}
