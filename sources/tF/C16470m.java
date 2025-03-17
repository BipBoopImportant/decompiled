package TF;

import SF.C16402c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: TF.m  reason: case insensitive filesystem */
public final class C16470m implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f138444a;

    private C16470m(ImageView imageView) {
        this.f138444a = imageView;
    }

    public static C16470m a(View view) {
        if (view != null) {
            return new C16470m((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static C16470m c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C16402c.f138196e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ImageView getRoot() {
        return this.f138444a;
    }
}
