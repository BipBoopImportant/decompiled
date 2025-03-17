package lq;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import jq.n;
import jq.o;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f99473a;

    /* renamed from: b  reason: collision with root package name */
    public final HorizontalProgressView f99474b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f99475c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f99476d;

    private d(ConstraintLayout constraintLayout, HorizontalProgressView horizontalProgressView, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.f99473a = constraintLayout;
        this.f99474b = horizontalProgressView;
        this.f99475c = constraintLayout2;
        this.f99476d = recyclerView;
    }

    public static d a(View view) {
        int i10 = n.f98664i;
        HorizontalProgressView horizontalProgressView = (HorizontalProgressView) b.a(view, i10);
        if (horizontalProgressView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = n.f98667l;
            RecyclerView recyclerView = (RecyclerView) b.a(view, i11);
            if (recyclerView != null) {
                return new d(constraintLayout, horizontalProgressView, constraintLayout, recyclerView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o.f98674d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f99473a;
    }
}
