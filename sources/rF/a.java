package Rf;

import Kf.B;
import Kf.C;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class a implements X4.a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f63192a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f63193b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f63194c;

    /* renamed from: d  reason: collision with root package name */
    public final Button f63195d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f63196e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f63197f;

    private a(LinearLayout linearLayout, ImageView imageView, Button button, Button button2, TextView textView, TextView textView2) {
        this.f63192a = linearLayout;
        this.f63193b = imageView;
        this.f63194c = button;
        this.f63195d = button2;
        this.f63196e = textView;
        this.f63197f = textView2;
    }

    public static a a(View view) {
        int i10 = B.f61486a;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = B.f61487b;
            Button button = (Button) b.a(view, i10);
            if (button != null) {
                i10 = B.f61488c;
                Button button2 = (Button) b.a(view, i10);
                if (button2 != null) {
                    i10 = B.f61489d;
                    TextView textView = (TextView) b.a(view, i10);
                    if (textView != null) {
                        i10 = B.f61490e;
                        TextView textView2 = (TextView) b.a(view, i10);
                        if (textView2 != null) {
                            return new a((LinearLayout) view, imageView, button, button2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C.f61491a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f63192a;
    }
}
