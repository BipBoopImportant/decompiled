package O9;

import K9.C6620s;
import com.google.android.gms.common.api.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final List f39299a;

    /* renamed from: b  reason: collision with root package name */
    private final a f39300b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f39301c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f39302a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private a f39303b;

        /* renamed from: c  reason: collision with root package name */
        private Executor f39304c;

        public a a(h hVar) {
            this.f39302a.add(hVar);
            return this;
        }

        public f b() {
            return new f(this.f39302a, this.f39303b, this.f39304c, true, (k) null);
        }
    }

    /* synthetic */ f(List list, a aVar, Executor executor, boolean z10, k kVar) {
        C6620s.m(list, "APIs must not be null.");
        C6620s.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            C6620s.m(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f39299a = list;
        this.f39300b = aVar;
        this.f39301c = executor;
    }

    public static a d() {
        return new a();
    }

    public List<h> a() {
        return this.f39299a;
    }

    public a b() {
        return this.f39300b;
    }

    public Executor c() {
        return this.f39301c;
    }
}
