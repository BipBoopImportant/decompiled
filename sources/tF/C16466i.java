package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* renamed from: TF.i  reason: case insensitive filesystem */
public final class C16466i implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CardView f138417a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageButton f138418b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f138419c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f138420d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f138421e;

    private C16466i(CardView cardView, ImageButton imageButton, TextView textView, ImageView imageView, TextView textView2) {
        this.f138417a = cardView;
        this.f138418b = imageButton;
        this.f138419c = textView;
        this.f138420d = imageView;
        this.f138421e = textView2;
    }

    public static C16466i a(View view) {
        int i10 = C16401b.f138073F0;
        ImageButton imageButton = (ImageButton) b.a(view, i10);
        if (imageButton != null) {
            i10 = C16401b.f138075G0;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C16401b.f138077H0;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C16401b.f138079I0;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        return new C16466i((CardView) view, imageButton, textView, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public CardView getRoot() {
        return this.f138417a;
    }
}
