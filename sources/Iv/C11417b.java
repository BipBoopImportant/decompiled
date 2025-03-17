package iv;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nv.C11679a;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liv/b;", "Lnv/a;", "<init>", "()V", "Lx4/o;", "navController", "LXH/N;", "a", "(Lx4/o;)V", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iv.b  reason: case insensitive filesystem */
public final class C11417b implements C11679a {
    public void a(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri build = Uri.parse(c.b("ikea://navigation/liveShopping/liveShopping")).buildUpon().build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }
}
