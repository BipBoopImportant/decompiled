package S5;

import F5.a;
import android.content.Context;
import jI.C17423j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LS5/s;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LF5/a;", "a", "(Landroid/content/Context;)LF5/a;", "b", "LF5/a;", "instance", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f39905a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static a f39906b;

    private s() {
    }

    public final synchronized a a(Context context) {
        a aVar;
        aVar = f39906b;
        if (aVar == null) {
            aVar = new a.C0570a().c(C17423j.v(j.o(context), "image_cache")).a();
            f39906b = aVar;
        }
        return aVar;
    }
}
