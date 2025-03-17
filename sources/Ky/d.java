package Ky;

import Ay.c;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LKy/d;", "LAy/c;", "<init>", "()V", "", "d", "()Ljava/lang/String;", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "", "showCombinedCart", "LXH/N;", "b", "(Lx4/o;Lx4/C;Z)V", "a", "(Lx4/o;)V", "c", "(Z)Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {
    private final String d() {
        return "ikea://navigation/cart/scanandgo/onboarding";
    }

    public void a(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse(d());
        C17542s.i(parse, "parse(...)");
        oVar.X(parse);
    }

    public void b(C8951o oVar, C c10, boolean z10) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse(c(z10));
        C17542s.i(parse, "parse(...)");
        if (c10 == null) {
            c10 = rw.c.f28698a.c().a();
        }
        oVar.Y(parse, c10);
    }

    public String c(boolean z10) {
        String uri = Uri.parse(ow.c.b("ikea://navigation/cart/scanandgo/cart?shownAsCombinedCart={shownAsCombinedCart}")).buildUpon().appendQueryParameter("shownAsCombinedCart", String.valueOf(z10)).build().toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }
}
