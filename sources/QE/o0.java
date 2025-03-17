package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

public final class o0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114668a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114669b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114670c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114671d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialButton f114672e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f114673f;

    private o0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, MaterialButton materialButton, TextView textView3) {
        this.f114668a = constraintLayout;
        this.f114669b = textView;
        this.f114670c = textView2;
        this.f114671d = imageView;
        this.f114672e = materialButton;
        this.f114673f = textView3;
    }

    public static o0 a(View view) {
        int i10 = C13317i.f112920J2;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f112924K2;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = C13317i.f112928L2;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f112932M2;
                    MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                    if (materialButton != null) {
                        i10 = C13317i.f112936N2;
                        TextView textView3 = (TextView) b.a(view, i10);
                        if (textView3 != null) {
                            return new o0((ConstraintLayout) view, textView, textView2, imageView, materialButton, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114668a;
    }
}
