package t5;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/Network;", "a", "(Landroid/net/ConnectivityManager;)Landroid/net/Network;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.r  reason: case insensitive filesystem */
public final class C8823r {
    public static final Network a(ConnectivityManager connectivityManager) {
        C17542s.j(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
