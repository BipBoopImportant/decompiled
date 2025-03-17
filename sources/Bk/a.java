package Bk;

import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ingka.ikea.app.splash.l;
import com.ingka.ikea.app.splash.m;

public final class a implements X4.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f79235a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f79236b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f79237c;

    /* renamed from: d  reason: collision with root package name */
    public final Guideline f79238d;

    /* renamed from: e  reason: collision with root package name */
    public final Button f79239e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f79240f;

    private a(ConstraintLayout constraintLayout, Button button, TextView textView, Guideline guideline, Button button2, TextView textView2) {
        this.f79235a = constraintLayout;
        this.f79236b = button;
        this.f79237c = textView;
        this.f79238d = guideline;
        this.f79239e = button2;
        this.f79240f = textView2;
    }

    public static a a(View view) {
        int i10 = l.f92428a;
        Button button = (Button) b.a(view, i10);
        if (button != null) {
            i10 = l.f92429b;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = l.f92430c;
                Guideline guideline = (Guideline) b.a(view, i10);
                if (guideline != null) {
                    i10 = l.f92431d;
                    Button button2 = (Button) b.a(view, i10);
                    if (button2 != null) {
                        i10 = l.f92432e;
                        TextView textView2 = (TextView) b.a(view, i10);
                        if (textView2 != null) {
                            return new a((ConstraintLayout) view, button, textView, guideline, button2, textView2);
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
        View inflate = layoutInflater.inflate(m.f92433a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f79235a;
    }
}
