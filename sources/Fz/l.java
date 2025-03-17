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

public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110146a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f110147b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f110148c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f110149d;

    private l(ConstraintLayout constraintLayout, TextView textView, Button button, TextView textView2) {
        this.f110146a = constraintLayout;
        this.f110147b = textView;
        this.f110148c = button;
        this.f110149d = textView2;
    }

    public static l a(View view) {
        int i10 = c.f109507D;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = c.f109547X;
            Button button = (Button) b.a(view, i10);
            if (button != null) {
                i10 = c.f109603q1;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    return new l((ConstraintLayout) view, textView, button, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static l c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109644l, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110146a;
    }
}
