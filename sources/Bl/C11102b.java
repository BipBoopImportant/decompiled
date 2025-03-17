package bl;

import X4.a;
import X4.b;
import al.C11067a;
import al.C11068b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: bl.b  reason: case insensitive filesystem */
public final class C11102b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f90467a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f90468b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f90469c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f90470d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f90471e;

    private C11102b(ConstraintLayout constraintLayout, TextView textView, Button button, ImageView imageView, TextView textView2) {
        this.f90467a = constraintLayout;
        this.f90468b = textView;
        this.f90469c = button;
        this.f90470d = imageView;
        this.f90471e = textView2;
    }

    public static C11102b a(View view) {
        int i10 = C11067a.f90298l;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C11067a.f90299m;
            Button button = (Button) b.a(view, i10);
            if (button != null) {
                i10 = C11067a.f90300n;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C11067a.f90301o;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        return new C11102b((ConstraintLayout) view, textView, button, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C11102b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C11068b.f90319g, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90467a;
    }
}
