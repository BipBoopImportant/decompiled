package h6;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LXH/N;", "a", "()V", "Landroid/content/Context;", "", "permission", "", "b", "(Landroid/content/Context;Ljava/lang/String;)Z", "coil-network-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final void a() {
        if (C17542s.e(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
    }

    public static final boolean b(Context context, String str) {
        return C6012a.a(context, str) == 0;
    }
}
