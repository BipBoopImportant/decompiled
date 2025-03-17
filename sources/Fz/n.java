package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class n implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110155a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f110156b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f110157c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f110158d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f110159e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputEditText f110160f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout f110161g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatCheckBox f110162h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f110163i;

    private n(ConstraintLayout constraintLayout, TextView textView, Button button, TextView textView2, ImageView imageView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, AppCompatCheckBox appCompatCheckBox, TextView textView3) {
        this.f110155a = constraintLayout;
        this.f110156b = textView;
        this.f110157c = button;
        this.f110158d = textView2;
        this.f110159e = imageView;
        this.f110160f = textInputEditText;
        this.f110161g = textInputLayout;
        this.f110162h = appCompatCheckBox;
        this.f110163i = textView3;
    }

    public static n a(View view) {
        int i10 = c.f109507D;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = c.f109557b0;
            Button button = (Button) b.a(view, i10);
            if (button != null) {
                i10 = c.f109572g0;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    i10 = c.f109575h0;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        i10 = c.f109581j0;
                        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, i10);
                        if (textInputEditText != null) {
                            i10 = c.f109584k0;
                            TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i10);
                            if (textInputLayout != null) {
                                i10 = c.f109597o1;
                                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) b.a(view, i10);
                                if (appCompatCheckBox != null) {
                                    i10 = c.f109603q1;
                                    TextView textView3 = (TextView) b.a(view, i10);
                                    if (textView3 != null) {
                                        return new n((ConstraintLayout) view, textView, button, textView2, imageView, textInputEditText, textInputLayout, appCompatCheckBox, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static n c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109646n, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110155a;
    }
}
