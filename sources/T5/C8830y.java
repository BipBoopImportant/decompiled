package t5;

import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lt5/y;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "request", "", "a", "(Landroid/net/NetworkRequest;)[I", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.y  reason: case insensitive filesystem */
final class C8830y {

    /* renamed from: a  reason: collision with root package name */
    public static final C8830y f56627a = new C8830y();

    private C8830y() {
    }

    public final int[] a(NetworkRequest networkRequest) {
        C17542s.j(networkRequest, "request");
        int[] a10 = networkRequest.getCapabilities();
        C17542s.i(a10, "request.capabilities");
        return a10;
    }

    public final int[] b(NetworkRequest networkRequest) {
        C17542s.j(networkRequest, "request");
        int[] a10 = networkRequest.getTransportTypes();
        C17542s.i(a10, "request.transportTypes");
        return a10;
    }
}
