package jI;

import XH.C16816g;
import java.io.Closeable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/io/Closeable;", "", "cause", "LXH/N;", "a", "(Ljava/io/Closeable;Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jI.c  reason: case insensitive filesystem */
public final class C17416c {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable == null) {
            return;
        }
        if (th2 == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th3) {
            C16816g.a(th2, th3);
        }
    }
}
