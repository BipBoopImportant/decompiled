package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class n0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114664a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f114665b;

    private n0(ConstraintLayout constraintLayout, ImageView imageView) {
        this.f114664a = constraintLayout;
        this.f114665b = imageView;
    }

    public static n0 a(View view) {
        int i10 = C13317i.f112940O2;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            return new n0((ConstraintLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114664a;
    }
}
