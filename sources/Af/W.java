package AF;

import DF.C12787d;
import DF.C12791h;
import JF.C13085G;
import OE.C13320l;
import QE.c0;
import QE.i0;
import android.view.View;
import android.widget.TextView;
import com.squareup.picasso.t;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LAF/W;", "LAF/b;", "LQE/c0;", "binding", "Lcom/squareup/picasso/t;", "picasso", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "", "isDecorateSupported", "<init>", "(LQE/c0;Lcom/squareup/picasso/t;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Z)V", "LDF/d;", "galleryModel", "LXH/N;", "c", "(LDF/d;)V", "i", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class W extends C12582b {

    /* renamed from: i  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107686i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public W(c0 c0Var, t tVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, boolean z10) {
        super(c0Var, tVar, z10);
        C17542s.j(c0Var, "binding");
        C17542s.j(tVar, "picasso");
        this.f107686i = onInteractionsListener;
    }

    /* access modifiers changed from: private */
    public static final void i(W w10, C12787d dVar, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = w10.f107686i;
        if (onInteractionsListener != null) {
            onInteractionsListener.onSceneDesignExistingClicked(((C12791h) dVar).e());
        }
    }

    /* access modifiers changed from: private */
    public static final void j(W w10, C12787d dVar, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = w10.f107686i;
        if (onInteractionsListener != null) {
            onInteractionsListener.onSceneDesignExistingClicked(((C12791h) dVar).e());
        }
    }

    public void c(C12787d dVar) {
        C17542s.j(dVar, "galleryModel");
        super.c(dVar);
        i0 i0Var = d().f114538b;
        if (dVar instanceof C12791h) {
            i0Var.getRoot().setVisibility(0);
            TextView textView = i0Var.f114604c;
            C12791h hVar = (C12791h) dVar;
            Instant lastCreatedAt = hVar.l().getLastCreatedAt();
            textView.setText(lastCreatedAt != null ? C13085G.a(lastCreatedAt, hVar.k()) : null);
            i0Var.f114605d.setText(hVar.l().getName());
            i0Var.f114603b.setText(d().getRoot().getContext().getResources().getQuantityString(C13320l.f113162b, hVar.j(), new Object[]{Integer.valueOf(hVar.j())}));
            i0Var.getRoot().setOnClickListener(new U(this, dVar));
            d().f114546j.setOnClickListener(new V(this, dVar));
        }
    }
}
