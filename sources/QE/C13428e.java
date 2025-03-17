package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import w4.x;

/* renamed from: QE.e  reason: case insensitive filesystem */
public final class C13428e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114554a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageButton f114555b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageButton f114556c;

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f114557d;

    private C13428e(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, ProgressBar progressBar) {
        this.f114554a = constraintLayout;
        this.f114555b = imageButton;
        this.f114556c = imageButton2;
        this.f114557d = progressBar;
    }

    public static C13428e a(View view) {
        int i10 = x.f57129C;
        ImageButton imageButton = (ImageButton) b.a(view, i10);
        if (imageButton != null) {
            i10 = x.f57130D;
            ImageButton imageButton2 = (ImageButton) b.a(view, i10);
            if (imageButton2 != null) {
                i10 = C13317i.f112939O1;
                ProgressBar progressBar = (ProgressBar) b.a(view, i10);
                if (progressBar != null) {
                    return new C13428e((ConstraintLayout) view, imageButton, imageButton2, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13428e c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C13428e d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113138e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114554a;
    }
}
