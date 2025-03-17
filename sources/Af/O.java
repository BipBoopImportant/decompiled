package AF;

import DF.C12787d;
import DF.C12789f;
import NF.C13291e;
import QE.c0;
import QE.o0;
import XH.C16807N;
import android.view.View;
import com.squareup.picasso.t;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LAF/O;", "LAF/b;", "LQE/c0;", "binding", "Lcom/squareup/picasso/t;", "picasso", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "", "isDecorateSupported", "<init>", "(LQE/c0;Lcom/squareup/picasso/t;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Z)V", "LDF/d;", "galleryModel", "LXH/N;", "c", "(LDF/d;)V", "i", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class O extends C12582b {

    /* renamed from: i  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107677i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(c0 c0Var, t tVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, boolean z10) {
        super(c0Var, tVar, z10);
        C17542s.j(c0Var, "binding");
        C17542s.j(tVar, "picasso");
        this.f107677i = onInteractionsListener;
    }

    /* access modifiers changed from: private */
    public static final void i(O o10, C12787d dVar, View view) {
        C13291e.c(o10.f107677i, dVar instanceof C12789f ? (C12789f) dVar : null, new C12580N());
    }

    /* access modifiers changed from: private */
    public static final C16807N j(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, C12789f fVar) {
        C17542s.j(onInteractionsListener, "listener");
        C17542s.j(fVar, "model");
        onInteractionsListener.onRetryUploadClicked(fVar.l());
        return C16807N.f139792a;
    }

    public void c(C12787d dVar) {
        C17542s.j(dVar, "galleryModel");
        super.c(dVar);
        o0 o0Var = d().f114543g;
        if (o0Var != null) {
            o0Var.getRoot().setVisibility(0);
            o0Var.f114672e.setOnClickListener(new C12579M(this, dVar));
        }
    }
}
