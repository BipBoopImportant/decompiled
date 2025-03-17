package ZD;

import XH.t;
import android.net.Uri;
import dE.C14341a;
import dE.C14342b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LZD/e;", "LdE/b;", "<init>", "()V", "Lx4/o;", "navController", "LdE/a;", "type", "LXH/N;", "a", "(Lx4/o;LdE/a;)V", "Landroid/net/Uri;", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "globalWhatsNewDeepLink", "whatsnew-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZD.e  reason: case insensitive filesystem */
public final class C13907e implements C14342b {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f118395a = Uri.parse(c.b("ikea://navigation/whatsNew/whatsNew?applink={applink}"));

    public void a(C8951o oVar, C14341a aVar) {
        Uri uri;
        C17542s.j(oVar, "navController");
        C17542s.j(aVar, "type");
        if (C17542s.e(aVar, C14341a.b.f126191a)) {
            uri = Uri.parse(c.b("ikea://navigation/whatsNew/whatsNew?applink={applink}"));
        } else if (aVar instanceof C14341a.C3083a) {
            uri = Uri.parse(c.b("ikea://navigation/whatsNew/whatsNew?applink={applink}")).buildUpon().appendQueryParameter("applink", ((C14341a.C3083a) aVar).a()).build();
        } else {
            throw new t();
        }
        C17542s.g(uri);
        oVar.X(uri);
    }

    public Uri b() {
        return this.f118395a;
    }
}
