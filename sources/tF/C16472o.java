package TF;

import SF.C16402c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: TF.o  reason: case insensitive filesystem */
public final class C16472o implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f138448a;

    private C16472o(ImageView imageView) {
        this.f138448a = imageView;
    }

    public static C16472o a(View view) {
        if (view != null) {
            return new C16472o((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static C16472o c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C16402c.f138198g, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ImageView getRoot() {
        return this.f138448a;
    }
}
