package L6;

import M6.r;
import QJ.M;
import QJ.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LL6/c;", "LM6/r$c;", "LQJ/M;", "dispatcher", "LQJ/Q;", "coroutineScope", "<init>", "(LQJ/M;LQJ/Q;)V", "c", "LQJ/M;", "e", "()LQJ/M;", "d", "LQJ/Q;", "()LQJ/Q;", "LM6/r$d;", "getKey", "()LM6/r$d;", "key", "a", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements r.c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f38352e = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final M f38353c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f38354d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LL6/c$a;", "LM6/r$d;", "LL6/c;", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements r.d<c> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(M m10, Q q10) {
        C17542s.j(m10, "dispatcher");
        C17542s.j(q10, "coroutineScope");
        this.f38353c = m10;
        this.f38354d = q10;
    }

    public <E extends r.c> E a(r.d<E> dVar) {
        return r.c.a.b(this, dVar);
    }

    public r b(r.d<?> dVar) {
        return r.c.a.c(this, dVar);
    }

    public r c(r rVar) {
        return r.c.a.d(this, rVar);
    }

    public final Q d() {
        return this.f38354d;
    }

    public final M e() {
        return this.f38353c;
    }

    public <R> R fold(R r10, p<? super R, ? super r.c, ? extends R> pVar) {
        return r.c.a.a(this, r10, pVar);
    }

    public r.d<?> getKey() {
        return f38352e;
    }
}
