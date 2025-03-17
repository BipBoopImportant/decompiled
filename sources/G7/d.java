package G7;

import G7.a;
import java.io.File;

public class d implements a.C0573a {

    /* renamed from: a  reason: collision with root package name */
    private final long f36234a;

    /* renamed from: b  reason: collision with root package name */
    private final a f36235b;

    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f36234a = j10;
        this.f36235b = aVar;
    }

    public a g() {
        File a10 = this.f36235b.a();
        if (a10 == null) {
            return null;
        }
        if (a10.isDirectory() || a10.mkdirs()) {
            return e.c(a10, this.f36234a);
        }
        return null;
    }
}
