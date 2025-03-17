package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class o implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110164a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputEditText f110165b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f110166c;

    /* renamed from: d  reason: collision with root package name */
    public final TextInputLayout f110167d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f110168e;

    /* renamed from: f  reason: collision with root package name */
    public final Button f110169f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f110170g;

    private o(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextView textView, TextInputLayout textInputLayout, TextView textView2, Button button, TextView textView3) {
        this.f110164a = constraintLayout;
        this.f110165b = textInputEditText;
        this.f110166c = textView;
        this.f110167d = textInputLayout;
        this.f110168e = textView2;
        this.f110169f = button;
        this.f110170g = textView3;
    }

    public static o a(View view) {
        int i10 = c.f109586l;
        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, i10);
        if (textInputEditText != null) {
            i10 = c.f109589m;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = c.f109595o;
                TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i10);
                if (textInputLayout != null) {
                    i10 = c.f109507D;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        i10 = c.f109557b0;
                        Button button = (Button) b.a(view, i10);
                        if (button != null) {
                            i10 = c.f109603q1;
                            TextView textView3 = (TextView) b.a(view, i10);
                            if (textView3 != null) {
                                return new o((ConstraintLayout) view, textInputEditText, textView, textInputLayout, textView2, button, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static o c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109647o, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110164a;
    }
}
