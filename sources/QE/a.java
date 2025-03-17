package Qe;

import Ge.k;
import Ge.l;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class a implements X4.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f63068a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f63069b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f63070c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f63071d;

    private a(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f63068a = constraintLayout;
        this.f63069b = textView;
        this.f63070c = textView2;
        this.f63071d = textView3;
    }

    public static a a(View view) {
        int i10 = k.f60617a;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = k.f60620d;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = k.f60624h;
                TextView textView3 = (TextView) b.a(view, i10);
                if (textView3 != null) {
                    return new a((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(l.f60632a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f63068a;
    }
}
