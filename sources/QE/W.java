package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class W implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114477a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114478b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114479c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageButton f114480d;

    private W(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ImageButton imageButton) {
        this.f114477a = constraintLayout;
        this.f114478b = floatingActionButton;
        this.f114479c = textView;
        this.f114480d = imageButton;
    }

    public static W a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113030j;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112999c3;
                ImageButton imageButton = (ImageButton) b.a(view, i10);
                if (imageButton != null) {
                    return new W((ConstraintLayout) view, floatingActionButton, textView, imageButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static W c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113124T, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114477a;
    }
}
