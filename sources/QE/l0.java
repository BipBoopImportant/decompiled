package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class l0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114639a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f114640b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114641c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114642d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114643e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f114644f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f114645g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f114646h;

    private l0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, TextView textView3, ImageView imageView3, TextView textView4) {
        this.f114639a = constraintLayout;
        this.f114640b = imageView;
        this.f114641c = textView;
        this.f114642d = imageView2;
        this.f114643e = textView2;
        this.f114644f = textView3;
        this.f114645g = imageView3;
        this.f114646h = textView4;
    }

    public static l0 a(View view) {
        int i10 = C13317i.f113104z2;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = C13317i.f112884A2;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112888B2;
                ImageView imageView2 = (ImageView) b.a(view, i10);
                if (imageView2 != null) {
                    i10 = C13317i.f112892C2;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        i10 = C13317i.f112896D2;
                        TextView textView3 = (TextView) b.a(view, i10);
                        if (textView3 != null) {
                            i10 = C13317i.f112900E2;
                            ImageView imageView3 = (ImageView) b.a(view, i10);
                            if (imageView3 != null) {
                                i10 = C13317i.f112904F2;
                                TextView textView4 = (TextView) b.a(view, i10);
                                if (textView4 != null) {
                                    return new l0((ConstraintLayout) view, imageView, textView, imageView2, textView2, textView3, imageView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114639a;
    }
}
