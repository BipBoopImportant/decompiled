package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.button.MaterialButton;

public final class X implements a {

    /* renamed from: a  reason: collision with root package name */
    private final View f114481a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114482b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f114483c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114484d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114485e;

    /* renamed from: f  reason: collision with root package name */
    public final CardView f114486f;

    /* renamed from: g  reason: collision with root package name */
    public final ComposeView f114487g;

    private X(View view, TextView textView, LinearLayout linearLayout, MaterialButton materialButton, TextView textView2, CardView cardView, ComposeView composeView) {
        this.f114481a = view;
        this.f114482b = textView;
        this.f114483c = linearLayout;
        this.f114484d = materialButton;
        this.f114485e = textView2;
        this.f114486f = cardView;
        this.f114487g = composeView;
    }

    public static X a(View view) {
        int i10 = C13317i.f112991b0;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f112996c0;
            LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
            if (linearLayout != null) {
                i10 = C13317i.f113001d0;
                MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                if (materialButton != null) {
                    i10 = C13317i.f113006e0;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        CardView cardView = (CardView) b.a(view, C13317i.f113011f0);
                        i10 = C13317i.f112986a0;
                        ComposeView composeView = (ComposeView) b.a(view, i10);
                        if (composeView != null) {
                            return new X(view, textView, linearLayout, materialButton, textView2, cardView, composeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static X b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113125U, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public View getRoot() {
        return this.f114481a;
    }
}
