package d5;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ld5/e;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "TAG", "", "a", "()I", "safeVendorApiLevel", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f50736a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final String f50737b = P.b(e.class).f();

    private e() {
    }

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.f50728a.a() != j.LOG) {
                return 0;
            }
            Log.d(f50737b, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (c.f50728a.a() != j.LOG) {
                return 0;
            }
            Log.d(f50737b, "Stub Extension");
            return 0;
        }
    }
}
