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

public final class d0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CardView f114551a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f114552b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114553c;

    private d0(CardView cardView, ImageView imageView, TextView textView) {
        this.f114551a = cardView;
        this.f114552b = imageView;
        this.f114553c = textView;
    }

    public static d0 a(View view) {
        int i10 = C13317i.f113056o0;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = C13317i.f113061p0;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                return new d0((CardView) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113130Z, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CardView getRoot() {
        return this.f114551a;
    }
}
