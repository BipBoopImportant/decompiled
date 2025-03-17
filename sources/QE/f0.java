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
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;

public final class f0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CardView f114567a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f114568b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114569c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114570d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114571e;

    private f0(CardView cardView, MaterialButton materialButton, TextView textView, ImageView imageView, TextView textView2) {
        this.f114567a = cardView;
        this.f114568b = materialButton;
        this.f114569c = textView;
        this.f114570d = imageView;
        this.f114571e = textView2;
    }

    public static f0 a(View view) {
        int i10 = C13317i.f112907G1;
        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
        if (materialButton != null) {
            i10 = C13317i.f112911H1;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112915I1;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f112919J1;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        return new f0((CardView) view, materialButton, textView, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113132a0, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CardView getRoot() {
        return this.f114567a;
    }
}
