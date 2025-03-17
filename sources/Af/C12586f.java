package AF;

import OE.n;
import QE.X;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.v;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import c1.c;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.common.R;
import kF.C14680A;
import kF.C14681B;
import kF.C14705a;
import kF.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LAF/f;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LQE/X;", "binding", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "LXH/v;", "Landroid/net/Uri;", "", "videoData", "<init>", "(LQE/X;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;LXH/v;)V", "e", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "f", "LXH/v;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.f  reason: case insensitive filesystem */
public final class C12586f extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107699e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final v<Uri, Integer> f107700f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.f$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12586f f107701a;

        a(C12586f fVar) {
            this.f107701a = fVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C14681B b10) {
            C17542s.j(b10, "it");
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1173397114, i11, -1, "com.sugarcube.app.base.ui.gallery.adapters.main.viewholders.CaptureCardViewHolder.<anonymous>.<anonymous> (CaptureCardViewHolder.kt:28)");
                }
                if (this.f107701a.f107700f != null) {
                    C12586f fVar = this.f107701a;
                    mVar.W(-1259013722);
                    Object D10 = mVar.D();
                    C4889m.a aVar = C4889m.f14007a;
                    if (D10 == aVar.a()) {
                        D10 = new K();
                        mVar.u(D10);
                    }
                    K k10 = (K) D10;
                    mVar.P();
                    Uri uri = (Uri) fVar.f107700f.c();
                    int intValue = ((Number) fVar.f107700f.d()).intValue();
                    mVar.W(-1259003046);
                    Object D11 = mVar.D();
                    if (D11 == aVar.a()) {
                        D11 = new C12585e();
                        mVar.u(D11);
                    }
                    mVar.P();
                    b0.l(uri, intValue, (C14705a) null, (C5221y) null, false, true, (C17642l) D11, k10, (C14680A) null, mVar, 1769472, 284);
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12586f(X x10, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, v<? extends Uri, Integer> vVar) {
        super(x10.getRoot());
        C17542s.j(x10, "binding");
        this.f107699e = onInteractionsListener;
        this.f107700f = vVar;
        x10.f114487g.setContent(c.c(-1173397114, true, new a(this)));
        LinearLayout linearLayout = x10.f114483c;
        linearLayout.setBackgroundColor(linearLayout.getResources().getColor(R.color.capture_entry_background, (Resources.Theme) null));
        linearLayout.setOnClickListener(new C12583c(this));
        x10.f114485e.setText(n.f113208G4);
        x10.f114482b.setText(n.f113405l4);
        MaterialButton materialButton = x10.f114484d;
        materialButton.setText(n.f113470v);
        materialButton.setOnClickListener(new C12584d(this));
    }

    /* access modifiers changed from: private */
    public static final void f(C12586f fVar, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = fVar.f107699e;
        if (onInteractionsListener != null) {
            onInteractionsListener.onNewScanClicked();
        }
    }

    /* access modifiers changed from: private */
    public static final void g(C12586f fVar, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = fVar.f107699e;
        if (onInteractionsListener != null) {
            onInteractionsListener.onNewScanClicked();
        }
    }
}
