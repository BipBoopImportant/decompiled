package yc;

import com.google.firebase.perf.config.RemoteConfigManager;
import nH.C17624c;
import nH.C17627f;

public final class f implements C17624c<RemoteConfigManager> {

    /* renamed from: a  reason: collision with root package name */
    private final C10427a f77894a;

    public f(C10427a aVar) {
        this.f77894a = aVar;
    }

    public static f a(C10427a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(C10427a aVar) {
        return (RemoteConfigManager) C17627f.d(aVar.e());
    }

    /* renamed from: b */
    public RemoteConfigManager get() {
        return c(this.f77894a);
    }
}
