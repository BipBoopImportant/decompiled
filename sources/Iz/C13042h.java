package Iz;

import android.net.Uri;
import cp.C11178c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LIz/h;", "LIz/g;", "Lcp/c;", "uriEncoder", "<init>", "(Lcp/c;)V", "", "newStoreName", "oldStoreName", "Landroid/net/Uri;", "a", "(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "Lcp/c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.h  reason: case insensitive filesystem */
public final class C13042h implements C13041g {

    /* renamed from: a  reason: collision with root package name */
    private final C11178c f111052a;

    public C13042h(C11178c cVar) {
        C17542s.j(cVar, "uriEncoder");
        this.f111052a = cVar;
    }

    public Uri a(String str, String str2) {
        C17542s.j(str, "newStoreName");
        C17542s.j(str2, "oldStoreName");
        Uri build = c.a(Uri.parse("ikea://navigation/scanandgo/dialog/wrongStore?oldStore={oldStore}&newStore={newStore}")).buildUpon().appendQueryParameter("newStore", this.f111052a.a(str)).appendQueryParameter("oldStore", this.f111052a.a(str2)).build();
        C17542s.i(build, "build(...)");
        return build;
    }
}
