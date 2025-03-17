package AF;

import OE.C13316h;
import OE.n;
import QE.h0;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.common.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LAF/t;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LQE/h0;", "binding", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "<init>", "(LQE/h0;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;)V", "e", "LQE/h0;", "getBinding", "()LQE/h0;", "f", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.t  reason: case insensitive filesystem */
public final class C12599t extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final h0 f107717e;

    /* renamed from: f  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107718f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12599t(h0 h0Var, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
        super(h0Var.getRoot());
        C17542s.j(h0Var, "binding");
        this.f107717e = h0Var;
        this.f107718f = onInteractionsListener;
        h0Var.f114590d.setOnClickListener(new r(this));
        h0Var.f114595i.setText(n.f113387j0);
        h0Var.f114592f.setText(n.f113388j1);
        ImageView imageView = h0Var.f114594h;
        imageView.setImageResource(C13316h.f112837S);
        imageView.setColorFilter(C6012a.c(imageView.getContext(), R.color.ikea_blue));
        h0Var.f114593g.setOnClickListener(new C12598s(this));
    }

    /* access modifiers changed from: private */
    public static final void e(C12599t tVar, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = tVar.f107718f;
        if (onInteractionsListener != null) {
            onInteractionsListener.onNewScanClicked();
        }
    }

    /* access modifiers changed from: private */
    public static final void f(C12599t tVar, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = tVar.f107718f;
        if (onInteractionsListener != null) {
            onInteractionsListener.onNewScanClicked();
        }
    }
}
