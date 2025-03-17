package AF;

import DF.C12787d;
import DF.C12789f;
import JF.C13085G;
import OE.C13320l;
import QE.c0;
import QE.i0;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.squareup.picasso.t;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.common.R;
import com.sugarcube.core.network.models.RoomType;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LAF/G;", "LAF/b;", "LQE/c0;", "binding", "Lcom/squareup/picasso/t;", "picasso", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "", "isDecorateSupported", "<init>", "(LQE/c0;Lcom/squareup/picasso/t;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Z)V", "LDF/d;", "galleryModel", "LXH/N;", "c", "(LDF/d;)V", "i", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.G  reason: case insensitive filesystem */
public final class C12573G extends C12582b {

    /* renamed from: i  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107667i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12573G(c0 c0Var, t tVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, boolean z10) {
        super(c0Var, tVar, z10);
        C17542s.j(c0Var, "binding");
        C17542s.j(tVar, "picasso");
        this.f107667i = onInteractionsListener;
    }

    /* access modifiers changed from: private */
    public static final void i(C12573G g10, C12787d dVar, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = g10.f107667i;
        if (onInteractionsListener != null) {
            onInteractionsListener.onSceneDesignExistingClicked(((C12789f) dVar).e());
        }
    }

    /* access modifiers changed from: private */
    public static final void j(C12573G g10, C12787d dVar, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = g10.f107667i;
        if (onInteractionsListener != null) {
            onInteractionsListener.onSceneDesignExistingClicked(((C12789f) dVar).e());
        }
    }

    public void c(C12787d dVar) {
        C17542s.j(dVar, "galleryModel");
        super.c(dVar);
        i0 i0Var = d().f114538b;
        if (dVar instanceof C12789f) {
            i0Var.getRoot().setVisibility(0);
            C12789f fVar = (C12789f) dVar;
            i0Var.f114604c.setText(C13085G.a(fVar.l().getCreatedTs(), fVar.k()));
            i0Var.f114604c.setTextAppearance(R.style.TextAppearance_Sugarcube_CardView_Body_Disabled);
            RoomTypeRenderer roomTypeRenderer = RoomTypeRenderer.INSTANCE;
            Resources resources = i0Var.getRoot().getContext().getResources();
            C17542s.i(resources, "getResources(...)");
            RoomType room = roomTypeRenderer.getRoom(resources, fVar.l().getName());
            TextView textView = i0Var.f114605d;
            Resources resources2 = i0Var.getRoot().getContext().getResources();
            C17542s.i(resources2, "getResources(...)");
            textView.setText(roomTypeRenderer.getTitle(room, resources2));
            i0Var.f114603b.setText(d().getRoot().getContext().getResources().getQuantityString(C13320l.f113162b, fVar.j(), new Object[]{Integer.valueOf(fVar.j())}));
            i0Var.getRoot().setOnClickListener(new C12571E(this, dVar));
            d().f114546j.setOnClickListener(new C12572F(this, dVar));
        }
    }
}
