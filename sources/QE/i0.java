package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class i0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114602a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114603b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114604c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114605d;

    private i0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f114602a = constraintLayout;
        this.f114603b = textView;
        this.f114604c = textView2;
        this.f114605d = textView3;
    }

    public static i0 a(View view) {
        int i10 = C13317i.f113072r2;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f113076s2;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = C13317i.f113080t2;
                TextView textView3 = (TextView) b.a(view, i10);
                if (textView3 != null) {
                    return new i0((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114602a;
    }
}
