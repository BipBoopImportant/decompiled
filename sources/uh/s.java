package Uh;

import Zw.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rw.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LUh/s;", "LZw/a;", "<init>", "()V", "Lx4/o;", "navController", "", "itemNo", "LDe/a;", "sourceComponent", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;LDe/a;)V", "Landroid/net/Uri;", "b", "(Ljava/lang/String;LDe/a;)Landroid/net/Uri;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements a {
    public void a(C8951o oVar, String str, De.a aVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "sourceComponent");
        oVar.Y(b(str, aVar), c.f28698a.c().a());
    }

    public Uri b(String str, De.a aVar) {
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "sourceComponent");
        Uri build = Uri.parse(ow.c.b("ikea://navigation/pip/pip?itemNo={itemNo}&sourceComponent={sourceComponent}")).buildUpon().appendQueryParameter("itemNo", str).appendQueryParameter("sourceComponent", aVar.getValue()).build();
        C17542s.i(build, "build(...)");
        return build;
    }
}
