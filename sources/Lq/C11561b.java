package lq;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import jq.n;
import jq.o;

/* renamed from: lq.b  reason: case insensitive filesystem */
public final class C11561b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f99466a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f99467b;

    /* renamed from: c  reason: collision with root package name */
    public final HorizontalProgressView f99468c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f99469d;

    private C11561b(ConstraintLayout constraintLayout, RecyclerView recyclerView, HorizontalProgressView horizontalProgressView, FrameLayout frameLayout) {
        this.f99466a = constraintLayout;
        this.f99467b = recyclerView;
        this.f99468c = horizontalProgressView;
        this.f99469d = frameLayout;
    }

    public static C11561b a(View view) {
        int i10 = n.f98662g;
        RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
        if (recyclerView != null) {
            i10 = n.f98666k;
            HorizontalProgressView horizontalProgressView = (HorizontalProgressView) b.a(view, i10);
            if (horizontalProgressView != null) {
                i10 = n.f98669n;
                FrameLayout frameLayout = (FrameLayout) b.a(view, i10);
                if (frameLayout != null) {
                    return new C11561b((ConstraintLayout) view, recyclerView, horizontalProgressView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C11561b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o.f98672b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f99466a;
    }
}
