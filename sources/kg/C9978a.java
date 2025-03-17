package kg;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ingka.ikea.app.s;
import com.ingka.ikea.app.t;

/* renamed from: kg.a  reason: case insensitive filesystem */
public final class C9978a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f75069a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f75070b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f75071c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f75072d;

    /* renamed from: e  reason: collision with root package name */
    public final ScrollView f75073e;

    /* renamed from: f  reason: collision with root package name */
    public final Button f75074f;

    private C9978a(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, ScrollView scrollView, Button button2) {
        this.f75069a = constraintLayout;
        this.f75070b = button;
        this.f75071c = textView;
        this.f75072d = textView2;
        this.f75073e = scrollView;
        this.f75074f = button2;
    }

    public static C9978a a(View view) {
        int i10 = s.f72305a;
        Button button = (Button) b.a(view, i10);
        if (button != null) {
            i10 = s.f72306b;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = s.f72307c;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    i10 = s.f72308d;
                    ScrollView scrollView = (ScrollView) b.a(view, i10);
                    if (scrollView != null) {
                        i10 = s.f72310f;
                        Button button2 = (Button) b.a(view, i10);
                        if (button2 != null) {
                            return new C9978a((ConstraintLayout) view, button, textView, textView2, scrollView, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C9978a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C9978a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(t.f72313a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f75069a;
    }
}
