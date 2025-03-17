package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: TF.v  reason: case insensitive filesystem */
public final class C16479v implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138478a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f138479b;

    private C16479v(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f138478a = constraintLayout;
        this.f138479b = recyclerView;
    }

    public static C16479v a(View view) {
        int i10 = C16401b.f138111Y0;
        RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
        if (recyclerView != null) {
            return new C16479v((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138478a;
    }
}
