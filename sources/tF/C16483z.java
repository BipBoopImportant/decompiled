package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: TF.z  reason: case insensitive filesystem */
public final class C16483z implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138511a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f138512b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f138513c;

    private C16483z(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f138511a = constraintLayout;
        this.f138512b = imageView;
        this.f138513c = textView;
    }

    public static C16483z a(View view) {
        int i10 = C16401b.f138130f0;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = C16401b.f138191z1;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                return new C16483z((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138511a;
    }
}
