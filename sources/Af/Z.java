package AF;

import DF.C12787d;
import DF.C12791h;
import QE.c0;
import QE.m0;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.t;
import com.sugarcube.app.base.data.model.Design;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LAF/Z;", "LAF/b;", "LQE/c0;", "binding", "Lcom/squareup/picasso/t;", "picasso", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "", "isDecorateSupported", "<init>", "(LQE/c0;Lcom/squareup/picasso/t;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Z)V", "LXH/N;", "k", "()V", "LDF/d;", "galleryModel", "c", "(LDF/d;)V", "i", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "j", "LDF/d;", "showroomItem", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Z extends C12582b {

    /* renamed from: i  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107689i;

    /* renamed from: j  reason: collision with root package name */
    private C12787d f107690j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Z(c0 c0Var, t tVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, boolean z10) {
        super(c0Var, tVar, z10);
        C17542s.j(c0Var, "binding");
        C17542s.j(tVar, "picasso");
        this.f107689i = onInteractionsListener;
    }

    /* access modifiers changed from: private */
    public static final void i(Z z10, View view) {
        z10.k();
    }

    /* access modifiers changed from: private */
    public static final void j(Z z10, View view) {
        z10.k();
    }

    private final void k() {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener;
        if (e() && (onInteractionsListener = this.f107689i) != null) {
            C12787d dVar = this.f107690j;
            if (dVar == null) {
                C17542s.z("showroomItem");
                dVar = null;
            }
            onInteractionsListener.onSceneSelected(dVar.e());
            C12787d dVar2 = this.f107690j;
            if (dVar2 == null) {
                C17542s.z("showroomItem");
                dVar2 = null;
            }
            String d10 = dVar2.d();
            if (d10 == null) {
                d10 = "";
            }
            String str = d10;
            C12787d dVar3 = this.f107690j;
            if (dVar3 == null) {
                C17542s.z("showroomItem");
                dVar3 = null;
            }
            UUID e10 = dVar3.e();
            C12787d dVar4 = this.f107690j;
            if (dVar4 == null) {
                C17542s.z("showroomItem");
                dVar4 = null;
            }
            GalleryHomeContentAdapter.OnInteractionsListener.a.a(onInteractionsListener, new Design(str, e10, 0, true, dVar4.a()), (String) null, 2, (Object) null);
        }
    }

    public void c(C12787d dVar) {
        C17542s.j(dVar, "galleryModel");
        super.c(dVar);
        this.f107690j = dVar;
        m0 m0Var = d().f114542f;
        m0Var.getRoot().setVisibility(0);
        MaterialButton materialButton = m0Var.f114656b;
        materialButton.setEnabled(e());
        materialButton.setOnClickListener(new X(this));
        C12787d dVar2 = this.f107690j;
        C12791h hVar = null;
        if (dVar2 == null) {
            C17542s.z("showroomItem");
            dVar2 = null;
        }
        if (dVar2 instanceof C12791h) {
            hVar = (C12791h) dVar2;
        }
        if (hVar != null) {
            m0Var.f114657c.setText(hVar.l().getName());
        }
        d().f114546j.setOnClickListener(new Y(this));
    }
}
