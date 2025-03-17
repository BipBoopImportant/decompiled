package ID;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rw.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LID/b;", "", "<init>", "()V", "Landroid/net/Uri;", "a", "()Landroid/net/Uri;", "c", "", "redemptionCode", "b", "(Ljava/lang/String;)Landroid/net/Uri;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ID.b  reason: case insensitive filesystem */
public final class C13028b {

    /* renamed from: a  reason: collision with root package name */
    public static final C13028b f110950a = new C13028b();

    private C13028b() {
    }

    public final Uri a() {
        Uri build = Uri.parse("ikea://navigation/wallet/wallet_page?redemptionCode={redemptionCode}").buildUpon().clearQuery().build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public final Uri b(String str) {
        C17542s.j(str, "redemptionCode");
        Uri.Builder clearQuery = Uri.parse("ikea://navigation/wallet/wallet_page?redemptionCode={redemptionCode}").buildUpon().clearQuery();
        C17542s.i(clearQuery, "clearQuery(...)");
        Uri build = g.a(clearQuery, "redemptionCode", str).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public final Uri c() {
        Uri build = Uri.parse("ikea://navigation/wallet/wallet_page?redemptionCode={redemptionCode}").buildUpon().clearQuery().build();
        C17542s.i(build, "build(...)");
        return build;
    }
}
