package H9;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import j0.C5445a;
import java.util.Set;
import xa.C8972m;

public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5445a f36627a;

    /* renamed from: b  reason: collision with root package name */
    private final C5445a f36628b;

    /* renamed from: c  reason: collision with root package name */
    private final C8972m f36629c;

    /* renamed from: d  reason: collision with root package name */
    private int f36630d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36631e;

    public final Set a() {
        return this.f36627a.keySet();
    }

    public final void b(C6528b bVar, ConnectionResult connectionResult, String str) {
        this.f36627a.put(bVar, connectionResult);
        this.f36628b.put(bVar, str);
        this.f36630d--;
        if (!connectionResult.U()) {
            this.f36631e = true;
        }
        if (this.f36630d != 0) {
            return;
        }
        if (this.f36631e) {
            this.f36629c.b(new c(this.f36627a));
            return;
        }
        this.f36629c.c(this.f36628b);
    }
}
