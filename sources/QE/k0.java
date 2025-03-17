package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class k0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114625a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114626b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f114627c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114628d;

    private k0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f114625a = constraintLayout;
        this.f114626b = textView;
        this.f114627c = imageView;
        this.f114628d = textView2;
    }

    public static k0 a(View view) {
        int i10 = C13317i.f113058o2;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f113063p2;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                i10 = C13317i.f113068q2;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    return new k0((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114625a;
    }
}
