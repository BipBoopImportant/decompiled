package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class E implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114341a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114342b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114343c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114344d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f114345e;

    private E(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, MaterialButton materialButton, ImageView imageView) {
        this.f114341a = constraintLayout;
        this.f114342b = floatingActionButton;
        this.f114343c = textView;
        this.f114344d = materialButton;
        this.f114345e = imageView;
    }

    public static E a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113065q;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112982Z0;
                MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                if (materialButton != null) {
                    i10 = C13317i.f112943P1;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        return new E((ConstraintLayout) view, floatingActionButton, textView, materialButton, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static E c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113107C, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114341a;
    }
}
