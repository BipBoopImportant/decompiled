package oq;

import android.content.Context;
import android.net.Uri;
import iq.C11411a;
import iq.C11412b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Loq/e;", "Liq/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lx4/o;", "navController", "", "productNo", "Liq/b;", "viewFilter", "LXH/N;", "b", "(Lx4/o;Ljava/lang/String;Liq/b;)V", "a", "(Lx4/o;Ljava/lang/String;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements C11411a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f100653a;

    public e(Context context) {
        C17542s.j(context, "context");
        this.f100653a = context;
    }

    public void a(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "productNo");
        Uri build = Uri.parse(c.b("ikea://navigation/energy/information?productNo={productNo}")).buildUpon().appendQueryParameter("productNo", str).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }

    public void b(C8951o oVar, String str, C11412b bVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "productNo");
        C17542s.j(bVar, "viewFilter");
        Uri build = Uri.parse(c.b("ikea://navigation/energy/label?productNo={productNo}&viewFilter={viewFilter}")).buildUpon().appendQueryParameter("productNo", str).appendQueryParameter("viewFilter", bVar.name()).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }
}
