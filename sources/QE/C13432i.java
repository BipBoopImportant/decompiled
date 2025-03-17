package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: QE.i  reason: case insensitive filesystem */
public final class C13432i implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114596a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f114597b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f114598c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114599d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f114600e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f114601f;

    private C13432i(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        this.f114596a = constraintLayout;
        this.f114597b = imageView;
        this.f114598c = imageView2;
        this.f114599d = imageView3;
        this.f114600e = imageView4;
        this.f114601f = imageView5;
    }

    public static C13432i a(View view) {
        int i10 = C13317i.f112968V2;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = C13317i.f112972W2;
            ImageView imageView2 = (ImageView) b.a(view, i10);
            if (imageView2 != null) {
                i10 = C13317i.f112976X2;
                ImageView imageView3 = (ImageView) b.a(view, i10);
                if (imageView3 != null) {
                    i10 = C13317i.f112980Y2;
                    ImageView imageView4 = (ImageView) b.a(view, i10);
                    if (imageView4 != null) {
                        i10 = C13317i.f112984Z2;
                        ImageView imageView5 = (ImageView) b.a(view, i10);
                        if (imageView5 != null) {
                            return new C13432i((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, imageView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13432i c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113142i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114596a;
    }
}
