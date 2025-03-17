package yc;

import com.google.firebase.perf.session.SessionManager;
import nH.C17624c;
import nH.C17627f;

public final class g implements C17624c<SessionManager> {

    /* renamed from: a  reason: collision with root package name */
    private final C10427a f77895a;

    public g(C10427a aVar) {
        this.f77895a = aVar;
    }

    public static g a(C10427a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(C10427a aVar) {
        return (SessionManager) C17627f.d(aVar.f());
    }

    /* renamed from: b */
    public SessionManager get() {
        return c(this.f77895a);
    }
}
