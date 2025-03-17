package AF;

import DF.C12787d;
import QE.c0;
import QE.p0;
import android.view.View;
import com.squareup.picasso.t;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.app.base.ui.gallery.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LAF/S;", "LAF/b;", "LQE/c0;", "binding", "Lcom/squareup/picasso/t;", "picasso", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "", "isDecorateSupported", "<init>", "(LQE/c0;Lcom/squareup/picasso/t;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Lcom/sugarcube/app/base/ui/gallery/h;Z)V", "LDF/d;", "galleryModel", "LXH/N;", "c", "(LDF/d;)V", "i", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "j", "Lcom/sugarcube/app/base/ui/gallery/h;", "getTab", "()Lcom/sugarcube/app/base/ui/gallery/h;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class S extends C12582b {

    /* renamed from: i  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107680i;

    /* renamed from: j  reason: collision with root package name */
    private final h f107681j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S(c0 c0Var, t tVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, h hVar, boolean z10) {
        super(c0Var, tVar, z10);
        C17542s.j(c0Var, "binding");
        C17542s.j(tVar, "picasso");
        this.f107680i = onInteractionsListener;
        this.f107681j = hVar;
    }

    /* access modifiers changed from: private */
    public static final void i(S s10, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = s10.f107680i;
        if (onInteractionsListener != null) {
            onInteractionsListener.onSignUpClicked(s10.f107681j);
        }
    }

    /* access modifiers changed from: private */
    public static final void j(S s10, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = s10.f107680i;
        if (onInteractionsListener != null) {
            onInteractionsListener.onLoginClicked(s10.f107681j);
        }
    }

    public void c(C12787d dVar) {
        C17542s.j(dVar, "galleryModel");
        super.c(dVar);
        p0 p0Var = d().f114544h;
        if (p0Var != null) {
            p0Var.getRoot().setVisibility(0);
            p0Var.f114685e.setOnClickListener(new P(this));
            p0Var.f114684d.setOnClickListener(new Q(this));
        }
    }
}
