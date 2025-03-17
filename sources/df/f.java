package Df;

import android.net.Uri;
import gn.C11314a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import rw.b;
import x4.C8951o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LDf/f;", "Lgn/a;", "<init>", "()V", "Lx4/o;", "navController", "", "inboxUnreadCount", "LXH/N;", "e", "(Lx4/o;I)V", "d", "(Lx4/o;)V", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements C11314a {
    public void d(C8951o oVar) {
        C17542s.j(oVar, "navController");
        if (!C8951o.o0(oVar, "browse/browse_page", false, false, 4, (Object) null)) {
            oVar.Y(Uri.parse("ikea://navigation/browse/browse_page"), b.a(oVar).a());
        }
    }

    public void e(C8951o oVar, int i10) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse("ikea://navigation/browse/search_page?inboxUnreadCount={inboxUnreadCount}");
        C17542s.i(parse, "parse(...)");
        Uri build = c.a(parse).buildUpon().appendQueryParameter("inboxUnreadCount", String.valueOf(i10)).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }
}
