package AF;

import QE.g0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LAF/C;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LQE/g0;", "binding", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "<init>", "(LQE/g0;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;)V", "e", "LQE/g0;", "getBinding", "()LQE/g0;", "f", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.C  reason: case insensitive filesystem */
public final class C12569C extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final g0 f107632e;

    /* renamed from: f  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107633f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12569C(g0 g0Var, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
        super(g0Var.getRoot());
        C17542s.j(g0Var, "binding");
        this.f107632e = g0Var;
        this.f107633f = onInteractionsListener;
        g0Var.f114579c.setOnClickListener(new C12568B(this));
    }

    /* access modifiers changed from: private */
    public static final void d(C12569C c10, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = c10.f107633f;
        if (onInteractionsListener != null) {
            onInteractionsListener.onPrivacyPolicyConsentContinueClicked();
        }
    }
}
