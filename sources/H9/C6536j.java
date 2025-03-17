package H9;

import K9.C6620s;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: H9.j  reason: case insensitive filesystem */
public final class C6536j<L> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f36589a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f36590b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a f36591c;

    /* renamed from: H9.j$a */
    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f36592a;

        /* renamed from: b  reason: collision with root package name */
        private final String f36593b;

        a(L l10, String str) {
            this.f36592a = l10;
            this.f36593b = str;
        }

        public String a() {
            int identityHashCode = System.identityHashCode(this.f36592a);
            return this.f36593b + "@" + identityHashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f36592a == aVar.f36592a && this.f36593b.equals(aVar.f36593b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f36592a) * 31) + this.f36593b.hashCode();
        }
    }

    /* renamed from: H9.j$b */
    public interface b<L> {
        void a(L l10);

        void b();
    }

    C6536j(Looper looper, L l10, String str) {
        this.f36589a = new R9.a(looper);
        this.f36590b = C6620s.m(l10, "Listener must not be null");
        this.f36591c = new a(l10, C6620s.f(str));
    }

    public void a() {
        this.f36590b = null;
        this.f36591c = null;
    }

    public a<L> b() {
        return this.f36591c;
    }

    public void c(b<? super L> bVar) {
        C6620s.m(bVar, "Notifier must not be null");
        this.f36589a.execute(new S(this, bVar));
    }

    /* access modifiers changed from: package-private */
    public final void d(b bVar) {
        Object obj = this.f36590b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }

    C6536j(Executor executor, L l10, String str) {
        this.f36589a = (Executor) C6620s.m(executor, "Executor must not be null");
        this.f36590b = C6620s.m(l10, "Listener must not be null");
        this.f36591c = new a(l10, C6620s.f(str));
    }
}
