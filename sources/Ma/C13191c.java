package MA;

import PA.C13331a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LMA/c;", "LPA/a;", "<init>", "()V", "Lx4/o;", "navController", "", "shoppableImageId", "LPA/a$b;", "type", "LXH/N;", "j", "(Lx4/o;Ljava/lang/String;LPA/a$b;)V", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: MA.c  reason: case insensitive filesystem */
public final class C13191c implements C13331a {
    public void j(C8951o oVar, String str, C13331a.b bVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "shoppableImageId");
        C17542s.j(bVar, "type");
        Uri build = Uri.parse(c.b("ikea://navigation/shoppable_image?shoppableImageId={shoppableImageId}&shoppableImageType={shoppableImageType}")).buildUpon().appendQueryParameter("shoppableImageId", str).appendQueryParameter("shoppableImageType", bVar.b()).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }
}
