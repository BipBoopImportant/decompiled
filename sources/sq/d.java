package sq;

import android.net.Uri;
import com.ingka.ikea.core.model.Media;
import fK.z;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17546w;
import kotlin.jvm.internal.P;
import mK.C17611d;
import ow.c;
import rq.C11841a;
import uI.C18068q;
import uI.C18070s;
import x4.C8951o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsq/d;", "Lrq/a;", "<init>", "()V", "", "Lcom/ingka/ikea/core/model/Media;", "images", "", "index", "Landroid/net/Uri;", "a", "([Lcom/ingka/ikea/core/model/Media;I)Landroid/net/Uri;", "Lx4/o;", "navController", "LXH/N;", "e", "(Lx4/o;[Lcom/ingka/ikea/core/model/Media;I)V", "enlargeimages-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C11841a {
    private final Uri a(Media[] mediaArr, int i10) {
        Uri parse = Uri.parse("ikea://navigation/pip/images/?index={index}&images={images}");
        C17542s.i(parse, "parse(...)");
        Uri.Builder buildUpon = c.a(parse).buildUpon();
        C17514c.a aVar = C17514c.f144280d;
        C17611d a10 = aVar.a();
        C18068q m10 = P.m(Media[].class, C18070s.f147781c.d(P.l(Media.class)));
        C17546w.a("kotlinx.serialization.serializer.withModule");
        Uri build = buildUpon.appendQueryParameter("images", aVar.b(z.d(a10, m10), mediaArr)).appendQueryParameter("index", String.valueOf(i10)).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public void e(C8951o oVar, Media[] mediaArr, int i10) {
        C17542s.j(oVar, "navController");
        C17542s.j(mediaArr, "images");
        oVar.X(a(mediaArr, i10));
    }
}
