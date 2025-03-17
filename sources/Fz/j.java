package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110137a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f110138b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f110139c;

    private j(ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView) {
        this.f110137a = constraintLayout;
        this.f110138b = imageView;
        this.f110139c = recyclerView;
    }

    public static j a(View view) {
        int i10 = c.f109515H;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = c.f109564d1;
            RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
            if (recyclerView != null) {
                return new j((ConstraintLayout) view, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static j c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109642j, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110137a;
    }
}
