package t5;

import android.net.NetworkRequest;
import androidx.work.C7055y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt5/v;", "", "<init>", "()V", "", "capabilities", "transports", "Landroid/net/NetworkRequest;", "a", "([I[I)Landroid/net/NetworkRequest;", "request", "", "capability", "", "c", "(Landroid/net/NetworkRequest;I)Z", "transport", "d", "Lt5/z;", "b", "([I[I)Lt5/z;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.v  reason: case insensitive filesystem */
public final class C8827v {

    /* renamed from: a  reason: collision with root package name */
    public static final C8827v f56626a = new C8827v();

    private C8827v() {
    }

    public static final NetworkRequest a(int[] iArr, int[] iArr2) {
        C17542s.j(iArr, "capabilities");
        C17542s.j(iArr2, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : iArr) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e10) {
                C7055y.e().l(C8831z.f56628b.a(), "Ignoring adding capability '" + i10 + '\'', e10);
            }
        }
        for (int addTransportType : iArr2) {
            builder.addTransportType(addTransportType);
        }
        NetworkRequest build = builder.build();
        C17542s.i(build, "networkRequest.build()");
        return build;
    }

    public final C8831z b(int[] iArr, int[] iArr2) {
        C17542s.j(iArr, "capabilities");
        C17542s.j(iArr2, "transports");
        return new C8831z(a(iArr, iArr2));
    }

    public final boolean c(NetworkRequest networkRequest, int i10) {
        C17542s.j(networkRequest, "request");
        return networkRequest.hasCapability(i10);
    }

    public final boolean d(NetworkRequest networkRequest, int i10) {
        C17542s.j(networkRequest, "request");
        return networkRequest.hasTransport(i10);
    }
}
