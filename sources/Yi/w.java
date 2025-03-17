package yi;

import Hx.f;
import aA.C13909a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import tf.C10253a;
import vi.C12127a;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\f0\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\f*\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 JC\u0010$\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b$\u0010%J?\u0010&\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b(\u0010)J3\u0010*\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b*\u0010)J\u0019\u0010+\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b+\u0010\u0015J\u001f\u0010,\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b.\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u00100¨\u00061"}, d2 = {"Lyi/w;", "Lvi/a;", "Ltf/a;", "killSwitchRepository", "LaA/a;", "sessionManager", "<init>", "(Ltf/a;LaA/a;)V", "", "orderId", "", "isFromOrderConfirmation", "Landroid/net/Uri;", "j", "(Ljava/lang/String;Z)Landroid/net/Uri;", "liteId", "countryCode", "kotlin.jvm.PlatformType", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "k", "(Ljava/lang/String;)Landroid/net/Uri;", "m", "()Landroid/net/Uri;", "i", "(Ljava/lang/String;Ljava/lang/String;Z)Landroid/net/Uri;", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "LXH/N;", "h", "(Lx4/o;Ljava/lang/String;Lx4/C;)V", "id", "LHx/f;", "type", "f", "(Lx4/o;Ljava/lang/String;LHx/f;Ljava/lang/String;ZLx4/C;)V", "c", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx4/C;)V", "g", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Lx4/C;)V", "b", "d", "e", "(Lx4/o;Ljava/lang/String;)V", "a", "Ltf/a;", "LaA/a;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w implements C12127a {

    /* renamed from: a  reason: collision with root package name */
    private final C10253a f106298a;

    /* renamed from: b  reason: collision with root package name */
    private final C13909a f106299b;

    public w(C10253a aVar, C13909a aVar2) {
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(aVar2, "sessionManager");
        this.f106298a = aVar;
        this.f106299b = aVar2;
    }

    private final Uri i(String str, String str2, boolean z10) {
        Uri build = Uri.parse(c.b(str)).buildUpon().appendQueryParameter("orderId", str2).appendQueryParameter("type", f.ORDER.b()).appendQueryParameter("fromConfirmation", String.valueOf(z10)).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    private final Uri j(String str, boolean z10) {
        boolean l10 = this.f106298a.l();
        if (!this.f106299b.isLoggedIn()) {
            Uri l11 = l(str, (String) null, (String) null);
            C17542s.i(l11, "getOrderLookupUri(...)");
            return l11;
        } else if (str != null && str.length() != 0) {
            return i("ikea://navigation/purchaseHistory/order/details?orderId={orderId}&fromConfirmation={fromConfirmation}&type={type}&liteId={liteId}", str, z10);
        } else {
            if (l10) {
                return m();
            }
            Uri l12 = l(str, (String) null, (String) null);
            C17542s.g(l12);
            return l12;
        }
    }

    private final Uri k(String str) {
        Uri build = Uri.parse(c.b("ikea://navigation/purchaseHistory/order/details/invoices?orderId={orderId}")).buildUpon().appendQueryParameter("orderId", str).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    private final Uri l(String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/purchaseHistory/order?orderId={orderId}&liteId={liteId}&cc={cc}")).buildUpon();
        C17542s.i(buildUpon, "buildUpon(...)");
        return x.b(x.b(x.b(buildUpon, "orderId", str), "cc", str3), "liteId", str2).build();
    }

    private final Uri m() {
        return Uri.parse(c.b("ikea://navigation/purchaseHistory/purchases"));
    }

    public Uri a(String str) {
        return j(str, false);
    }

    public void b(C8951o oVar, String str, String str2, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "orderId");
        Uri.Builder appendQueryParameter = Uri.parse(c.b("ikea://navigation/purchaseHistory/requestAssembly?type={type}&orderId={orderId}&liteId={liteId}")).buildUpon().appendQueryParameter("orderId", str);
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        Uri build = x.b(appendQueryParameter, "liteId", str2).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }

    public void c(C8951o oVar, String str, String str2, String str3, C c10) {
        C17542s.j(oVar, "navController");
        Uri l10 = l(str, str2, str3);
        C17542s.i(l10, "getOrderLookupUri(...)");
        oVar.Y(l10, c10);
    }

    public Uri d(String str) {
        return j(str, true);
    }

    public void e(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "orderId");
        oVar.Y(k(str), rw.c.f28698a.c().a());
    }

    public void f(C8951o oVar, String str, f fVar, String str2, boolean z10, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "id");
        C17542s.j(fVar, "type");
        Uri.Builder appendQueryParameter = Uri.parse(c.b("ikea://navigation/purchaseHistory/order/details?orderId={orderId}&fromConfirmation={fromConfirmation}&type={type}&liteId={liteId}")).buildUpon().appendQueryParameter("orderId", str).appendQueryParameter("type", fVar.b());
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        Uri build = x.b(appendQueryParameter, "liteId", str2).appendQueryParameter("fromConfirmation", String.valueOf(z10)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }

    public void g(C8951o oVar, String str, String str2, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "orderId");
        Uri.Builder appendQueryParameter = Uri.parse(c.b("ikea://navigation/purchaseHistory/returns?orderId={orderId}&liteId={liteId}")).buildUpon().appendQueryParameter("orderId", str);
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        Uri build = x.b(appendQueryParameter, "liteId", str2).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }

    public void h(C8951o oVar, String str, C c10) {
        C17542s.j(oVar, "navController");
        oVar.Y(a(str), c10);
    }
}
