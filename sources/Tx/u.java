package tx;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import ds.C11239c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10025b;
import lg.C10027d;
import nI.C17642l;
import sx.C15050a;
import sx.C15051b;
import u2.C6012a;
import vg.g;
import wx.c;
import wx.d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ltx/u;", "Ltx/z;", "Landroid/view/View;", "rootView", "Lds/c;", "imageLoader", "<init>", "(Landroid/view/View;Lds/c;)V", "Lwx/c;", "valueHolder", "LXH/N;", "c", "(Lwx/c;)V", "e", "Lds/c;", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "d", "()Landroid/widget/ImageView;", "imageView", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends z {

    /* renamed from: e  reason: collision with root package name */
    private final C11239c f131239e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f131240f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(View view, C11239c cVar) {
        super(view);
        C17542s.j(view, "rootView");
        C17542s.j(cVar, "imageLoader");
        this.f131239e = cVar;
        View findViewById = view.findViewById(C15051b.f131004b);
        C17542s.i(findViewById, "findViewById(...)");
        this.f131240f = (ImageView) findViewById;
    }

    public void c(c cVar) {
        C17542s.j(cVar, "valueHolder");
        this.itemView.setBackgroundResource(cVar.a() ? C15050a.f131002a : C10027d.f75275f);
        String str = null;
        d dVar = cVar instanceof d ? (d) cVar : null;
        if (dVar != null) {
            str = dVar.d();
        }
        String str2 = str;
        ColorDrawable colorDrawable = new ColorDrawable(C6012a.c(this.f131240f.getContext(), C10025b.f75263e));
        if (str2 == null || str2.length() == 0) {
            this.f131240f.setImageDrawable(colorDrawable);
        } else {
            C11239c.a.d(this.f131239e, this.f131240f, str2, (g.b) null, (C17642l) null, 12, (Object) null);
        }
    }

    public final ImageView d() {
        return this.f131240f;
    }
}
