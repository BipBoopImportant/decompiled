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
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;

public final class h0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CardView f114587a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f114588b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f114589c;

    /* renamed from: d  reason: collision with root package name */
    public final CardView f114590d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114591e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f114592f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageButton f114593g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f114594h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f114595i;

    private h0(CardView cardView, MaterialButton materialButton, MaterialButton materialButton2, CardView cardView2, TextView textView, TextView textView2, ImageButton imageButton, ImageView imageView, TextView textView3) {
        this.f114587a = cardView;
        this.f114588b = materialButton;
        this.f114589c = materialButton2;
        this.f114590d = cardView2;
        this.f114591e = textView;
        this.f114592f = textView2;
        this.f114593g = imageButton;
        this.f114594h = imageView;
        this.f114595i = textView3;
    }

    public static h0 a(View view) {
        int i10 = C13317i.f112987a1;
        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
        if (materialButton != null) {
            i10 = C13317i.f112992b1;
            MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
            if (materialButton2 != null) {
                CardView cardView = (CardView) view;
                i10 = C13317i.f112997c1;
                TextView textView = (TextView) b.a(view, i10);
                if (textView != null) {
                    i10 = C13317i.f113002d1;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        i10 = C13317i.f113007e1;
                        ImageButton imageButton = (ImageButton) b.a(view, i10);
                        if (imageButton != null) {
                            i10 = C13317i.f113012f1;
                            ImageView imageView = (ImageView) b.a(view, i10);
                            if (imageView != null) {
                                i10 = C13317i.f113017g1;
                                TextView textView3 = (TextView) b.a(view, i10);
                                if (textView3 != null) {
                                    return new h0(cardView, materialButton, materialButton2, cardView, textView, textView2, imageButton, imageView, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113136c0, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CardView getRoot() {
        return this.f114587a;
    }
}
