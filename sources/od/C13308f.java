package OD;

import PD.e;
import XH.C16807N;
import android.webkit.CookieManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LOD/f;", "LPD/e;", "<init>", "()V", "", "url", "cookie", "Lkotlin/Function1;", "", "LXH/N;", "cookieSetCallback", "a", "(Ljava/lang/String;Ljava/lang/String;LnI/l;)V", "webview-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: OD.f  reason: case insensitive filesystem */
public final class C13308f implements e {
    /* access modifiers changed from: private */
    public static final void c(C17642l lVar, Boolean bool) {
        C17542s.g(bool);
        lVar.invoke(bool);
    }

    public void a(String str, String str2, C17642l<? super Boolean, C16807N> lVar) {
        C17542s.j(str, "url");
        C17542s.j(str2, "cookie");
        C17542s.j(lVar, "cookieSetCallback");
        CookieManager.getInstance().setCookie(str, str2, new C13307e(lVar));
    }
}
