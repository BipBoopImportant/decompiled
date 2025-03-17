package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class v implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f110211a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f110212b;

    private v(ImageView imageView, ImageView imageView2) {
        this.f110211a = imageView;
        this.f110212b = imageView2;
    }

    public static v a(View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new v(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    public static v c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109655w, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ImageView getRoot() {
        return this.f110211a;
    }
}
