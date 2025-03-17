package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114692a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114693b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114694c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114695d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f114696e;

    private r(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ImageView imageView, ConstraintLayout constraintLayout2) {
        this.f114692a = constraintLayout;
        this.f114693b = floatingActionButton;
        this.f114694c = textView;
        this.f114695d = imageView;
        this.f114696e = constraintLayout2;
    }

    public static r a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113069r;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112962U0;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new r(constraintLayout, floatingActionButton, textView, imageView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114692a;
    }
}
