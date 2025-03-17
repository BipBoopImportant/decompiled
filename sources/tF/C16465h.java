package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: TF.h  reason: case insensitive filesystem */
public final class C16465h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f138414a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f138415b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f138416c;

    private C16465h(FrameLayout frameLayout, Button button, TextView textView) {
        this.f138414a = frameLayout;
        this.f138415b = button;
        this.f138416c = textView;
    }

    public static C16465h a(View view) {
        int i10 = C16401b.f138152m1;
        Button button = (Button) b.a(view, i10);
        if (button != null) {
            i10 = C16401b.f138155n1;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                return new C16465h((FrameLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f138414a;
    }
}
