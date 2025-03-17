package OD;

import PD.C13336a;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"LOD/a;", "LPD/a;", "<init>", "()V", "LXH/N;", "invoke", "webview-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: OD.a  reason: case insensitive filesystem */
public final class C13303a implements C13336a {
    public void invoke() {
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
    }
}
