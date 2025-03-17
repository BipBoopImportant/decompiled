package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

public final class p0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114681a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114682b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f114683c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114684d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialButton f114685e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f114686f;

    private p0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView2) {
        this.f114681a = constraintLayout;
        this.f114682b = textView;
        this.f114683c = imageView;
        this.f114684d = materialButton;
        this.f114685e = materialButton2;
        this.f114686f = textView2;
    }

    public static p0 a(View view) {
        int i10 = C13317i.f113084u2;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f113088v2;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                i10 = C13317i.f113092w2;
                MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                if (materialButton != null) {
                    i10 = C13317i.f113096x2;
                    MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
                    if (materialButton2 != null) {
                        i10 = C13317i.f113100y2;
                        TextView textView2 = (TextView) b.a(view, i10);
                        if (textView2 != null) {
                            return new p0((ConstraintLayout) view, textView, imageView, materialButton, materialButton2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114681a;
    }
}
