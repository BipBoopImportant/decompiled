package AF;

import OE.n;
import OE.q;
import QE.Z;
import VE.C13760b;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.app.base.ui.gallery.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LAF/w;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LOE/q;", "sugarcube", "Landroid/content/Context;", "context", "LQE/Z;", "binding", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "<init>", "(LOE/q;Landroid/content/Context;LQE/Z;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Lcom/sugarcube/app/base/ui/gallery/h;)V", "e", "LOE/q;", "getSugarcube", "()LOE/q;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "g", "LQE/Z;", "getBinding", "()LQE/Z;", "h", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "i", "Lcom/sugarcube/app/base/ui/gallery/h;", "getTab", "()Lcom/sugarcube/app/base/ui/gallery/h;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.w  reason: case insensitive filesystem */
public final class C12602w extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final q f107725e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f107726f;

    /* renamed from: g  reason: collision with root package name */
    private final Z f107727g;

    /* renamed from: h  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107728h;

    /* renamed from: i  reason: collision with root package name */
    private final h f107729i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12602w(q qVar, Context context, Z z10, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, h hVar) {
        super(z10.getRoot());
        Spanned spanned;
        C17542s.j(qVar, "sugarcube");
        C17542s.j(z10, "binding");
        this.f107725e = qVar;
        this.f107726f = context;
        this.f107727g = z10;
        this.f107728h = onInteractionsListener;
        this.f107729i = hVar;
        TextView textView = z10.f114494b;
        if (context != null) {
            String string = context.getString(n.f113357e5, new Object[]{C13760b.f117438d.h(qVar.getCountry(), qVar.getLanguage()), context.getString(n.f113454s4)});
            C17542s.i(string, "getString(...)");
            spanned = Html.fromHtml(context.getString(n.f113322Z4, new Object[]{string}), 0);
        } else {
            spanned = null;
        }
        textView.setText(spanned);
        z10.f114494b.setMovementMethod(LinkMovementMethod.getInstance());
        z10.f114494b.setOnClickListener(new C12601v(this));
    }

    /* access modifiers changed from: private */
    public static final void d(C12602w wVar, View view) {
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = wVar.f107728h;
        if (onInteractionsListener != null) {
            onInteractionsListener.onNeedHelpClicked(wVar.f107729i);
        }
    }
}
