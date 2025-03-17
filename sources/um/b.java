package Um;

import android.net.Uri;
import bn.C11110a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LUm/b;", "Lbn/a;", "<init>", "()V", "Lx4/o;", "navController", "LXH/N;", "a", "(Lx4/o;)V", "", "url", "b", "(Lx4/o;Ljava/lang/String;)V", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11110a {
    public void a(C8951o oVar) {
        C17542s.j(oVar, "navController");
        oVar.X(Uri.parse("ikea://navigation/boka/book"));
    }

    public void b(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "url");
        Uri build = Uri.parse(c.b("ikea://navigation/boka/bookflow?sandboxUrl={sandboxUrl}")).buildUpon().appendQueryParameter("sandboxUrl", str).build();
        C17542s.g(build);
        oVar.Y(build, rw.c.f28698a.c().a());
    }
}
