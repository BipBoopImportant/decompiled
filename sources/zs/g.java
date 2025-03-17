package zs;

import Fs.a;
import Ps.b;
import Ps.d;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzs/g;", "LFs/a;", "<init>", "()V", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "LXH/N;", "e", "(Lx4/o;Lx4/C;)V", "", "id", "featureName", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LPs/d;", "notification", "a", "(LPs/d;)Ljava/lang/String;", "LGs/a;", "feature", "messageId", "b", "(LGs/a;Ljava/lang/String;)Ljava/lang/String;", "analytics", "c", "(Ljava/lang/String;)Ljava/lang/String;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements a {
    public String a(d dVar) {
        C17542s.j(dVar, "notification");
        return h.c(dVar.g());
    }

    public String b(Gs.a aVar, String str) {
        C17542s.j(aVar, "feature");
        C17542s.j(str, "messageId");
        return h.c(new b(str, aVar.d()));
    }

    public String c(String str) {
        C17542s.j(str, "analytics");
        String uri = c.a(Uri.parse("https://www.ikea.com/ikeaapp/inbox_page?click_analytics_key={click_analytics_key}")).buildUpon().appendQueryParameter("click_analytics_key", str).build().toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }

    public String d(String str, String str2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "featureName");
        String uri = c.a(Uri.parse("ikea://navigation/inbox_page/notification_details?id_key={id_key}&feature_key={feature_key}")).buildUpon().appendQueryParameter("id_key", str).appendQueryParameter("feature_key", str2).build().toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }

    public void e(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(c10, "navOptions");
        C8951o.g0(oVar, "inbox", c10, (I.a) null, 4, (Object) null);
    }
}
