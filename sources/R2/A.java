package R2;

import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LR2/A;", "LdI/i$b;", "parent", "LR2/j;", "instance", "<init>", "(LR2/A;LR2/j;)V", "LR2/h;", "candidate", "LXH/N;", "a", "(LR2/h;)V", "LR2/A;", "b", "LR2/j;", "LdI/i$c;", "getKey", "()LdI/i$c;", "key", "c", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class A implements C17168i.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f12290c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f12291d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* renamed from: a  reason: collision with root package name */
    private final A f12292a;

    /* renamed from: b  reason: collision with root package name */
    private final j<?> f12293b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LR2/A$a;", "", "<init>", "()V", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LR2/A$a$a;", "LdI/i$c;", "LR2/A;", "<init>", "()V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R2.A$a$a  reason: collision with other inner class name */
        public static final class C0189a implements C17168i.c<A> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0189a f12294a = new C0189a();

            private C0189a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public A(A a10, j<?> jVar) {
        C17542s.j(jVar, "instance");
        this.f12292a = a10;
        this.f12293b = jVar;
    }

    public final void a(h<?> hVar) {
        C17542s.j(hVar, "candidate");
        if (this.f12293b != hVar) {
            A a10 = this.f12292a;
            if (a10 != null) {
                a10.a(hVar);
                return;
            }
            return;
        }
        throw new IllegalStateException(f12291d.toString());
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return C17168i.b.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C17168i.b.a.b(this, cVar);
    }

    public C17168i.c<?> getKey() {
        return a.C0189a.f12294a;
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C17168i.b.a.c(this, cVar);
    }

    public C17168i plus(C17168i iVar) {
        return C17168i.b.a.d(this, iVar);
    }
}
