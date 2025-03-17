package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class P implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114424a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114425b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114426c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageButton f114427d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f114428e;

    private P(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ImageButton imageButton, ImageView imageView) {
        this.f114424a = constraintLayout;
        this.f114425b = floatingActionButton;
        this.f114426c = textView;
        this.f114427d = imageButton;
        this.f114428e = imageView;
    }

    public static P a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113065q;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112982Z0;
                ImageButton imageButton = (ImageButton) b.a(view, i10);
                if (imageButton != null) {
                    i10 = C13317i.f112943P1;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        return new P((ConstraintLayout) view, floatingActionButton, textView, imageButton, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static P c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113118N, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114424a;
    }
}
