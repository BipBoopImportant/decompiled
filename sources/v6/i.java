package v6;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import t6.C8834c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u0004\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroid/content/Intent;", "", "url", "f", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;", "b", "(Landroid/content/Intent;)Ljava/lang/String;", "", "bool", "e", "(Landroid/content/Intent;Z)Landroid/content/Intent;", "a", "(Landroid/content/Intent;)Z", "token", "g", "Lt6/c;", "status", "d", "(Landroid/content/Intent;Lt6/c;)Landroid/content/Intent;", "c", "afterpay_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class i {
    public static final boolean a(Intent intent) {
        C17542s.j(intent, "<this>");
        return intent.getBooleanExtra("AFTERPAY_SHOULD_LOAD_REDIRECT_URLS", false);
    }

    public static final String b(Intent intent) {
        C17542s.j(intent, "<this>");
        return intent.getStringExtra("AFTERPAY_CHECKOUT_URL");
    }

    public static final String c(Intent intent) {
        C17542s.j(intent, "<this>");
        return intent.getStringExtra("AFTERPAY_INFO_URL");
    }

    public static final Intent d(Intent intent, C8834c cVar) {
        C17542s.j(intent, "<this>");
        C17542s.j(cVar, "status");
        Intent putExtra = intent.putExtra("AFTERPAY_CANCELLATION_STATUS", cVar.name());
        C17542s.i(putExtra, "putExtra(AfterpayIntent.…TION_STATUS, status.name)");
        return putExtra;
    }

    public static final Intent e(Intent intent, boolean z10) {
        C17542s.j(intent, "<this>");
        Intent putExtra = intent.putExtra("AFTERPAY_SHOULD_LOAD_REDIRECT_URLS", z10);
        C17542s.i(putExtra, "putExtra(AfterpayIntent.…LOAD_REDIRECT_URLS, bool)");
        return putExtra;
    }

    public static final Intent f(Intent intent, String str) {
        C17542s.j(intent, "<this>");
        C17542s.j(str, "url");
        Intent putExtra = intent.putExtra("AFTERPAY_CHECKOUT_URL", str);
        C17542s.i(putExtra, "putExtra(AfterpayIntent.CHECKOUT_URL, url)");
        return putExtra;
    }

    public static final Intent g(Intent intent, String str) {
        C17542s.j(intent, "<this>");
        C17542s.j(str, "token");
        Intent putExtra = intent.putExtra("AFTERPAY_ORDER_TOKEN", str);
        C17542s.i(putExtra, "putExtra(AfterpayIntent.ORDER_TOKEN, token)");
        return putExtra;
    }
}
