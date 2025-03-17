package AF;

import QE.f0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LAF/q;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LQE/f0;", "binding", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "<init>", "(LQE/f0;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.q  reason: case insensitive filesystem */
public final class C12597q extends RecyclerView.G {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12597q(f0 f0Var, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
        super(f0Var.getRoot());
        C17542s.j(f0Var, "binding");
        f0Var.f114568b.setOnClickListener(new C12596p(onInteractionsListener));
    }

    /* access modifiers changed from: private */
    public static final void d(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, View view) {
        if (onInteractionsListener != null) {
            onInteractionsListener.onDesignOnWebClicked();
        }
    }
}
