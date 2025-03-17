package oo;

import Mn.e;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Loo/i;", "LMn/e;", "<init>", "()V", "", "b", "()Ljava/lang/String;", "Lx4/o;", "navController", "checkoutId", "Lx4/C;", "navOptions", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Lx4/C;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements e {
    private final String b() {
        return "ikea://navigation/checkout/checkout?checkoutId={checkoutId}";
    }

    public void a(C8951o oVar, String str, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "checkoutId");
        Uri build = Uri.parse(c.b(b())).buildUpon().appendQueryParameter("checkoutId", str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }
}
