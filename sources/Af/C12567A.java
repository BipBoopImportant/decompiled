package AF;

import QE.Y;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.app.base.ui.gallery.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LAF/A;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LQE/Y;", "binding", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "<init>", "(LQE/Y;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Lcom/sugarcube/app/base/ui/gallery/h;)V", "e", "LQE/Y;", "()LQE/Y;", "f", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "g", "Lcom/sugarcube/app/base/ui/gallery/h;", "getTab", "()Lcom/sugarcube/app/base/ui/gallery/h;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.A  reason: case insensitive filesystem */
public final class C12567A extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final Y f107628e;

    /* renamed from: f  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107629f;

    /* renamed from: g  reason: collision with root package name */
    private final h f107630g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12567A(Y y10, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, h hVar) {
        super(y10.getRoot());
        C17542s.j(y10, "binding");
        this.f107628e = y10;
        this.f107629f = onInteractionsListener;
        this.f107630g = hVar;
        y10.f114492e.setOnClickListener(new C12604y(this));
        y10.f114491d.setOnClickListener(new C12605z(this));
    }

    /* access modifiers changed from: private */
    public static final void f(C12567A a10, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = a10.f107629f;
        if (onInteractionsListener != null) {
            onInteractionsListener.onSignUpClicked(a10.f107630g);
        }
    }

    /* access modifiers changed from: private */
    public static final void g(C12567A a10, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = a10.f107629f;
        if (onInteractionsListener != null) {
            onInteractionsListener.onLoginClicked(a10.f107630g);
        }
    }

    public final Y e() {
        return this.f107628e;
    }
}
