package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: TF.g  reason: case insensitive filesystem */
public final class C16464g implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f138412a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f138413b;

    private C16464g(LinearLayout linearLayout, TextView textView) {
        this.f138412a = linearLayout;
        this.f138413b = textView;
    }

    public static C16464g a(View view) {
        int i10 = C16401b.f138110Y;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            return new C16464g((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f138412a;
    }
}
