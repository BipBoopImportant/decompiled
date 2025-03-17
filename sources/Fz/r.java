package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110185a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f110186b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f110187c;

    private r(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f110185a = constraintLayout;
        this.f110186b = imageView;
        this.f110187c = textView;
    }

    public static r a(View view) {
        int i10 = c.f109602q0;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = c.f109600p1;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                return new r((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static r c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109652t, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110185a;
    }
}
