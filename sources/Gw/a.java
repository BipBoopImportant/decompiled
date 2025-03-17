package gw;

import cw.d;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lgw/a;", "Lgp/b;", "Lgw/d;", "localSource", "Lcw/d;", "messageCenterRepository", "<init>", "(Lgw/d;Lcw/d;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Lgw/d;", "Lcw/d;", "Lgp/e;", "c", "Lgp/e;", "()Lgp/e;", "taskId", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final d f73465a;

    /* renamed from: b  reason: collision with root package name */
    private final d f73466b;

    /* renamed from: c  reason: collision with root package name */
    private final C11346e f73467c = C11346e.WHATS_NEW_CLEAR_ON_LOGOUT;

    public a(d dVar, d dVar2) {
        C17542s.j(dVar, "localSource");
        C17542s.j(dVar2, "messageCenterRepository");
        this.f73465a = dVar;
        this.f73466b = dVar2;
    }

    public C11346e a() {
        return this.f73467c;
    }

    public Object b(Object obj, C17164e<? super Boolean> eVar) {
        this.f73465a.d();
        this.f73466b.invalidate();
        return b.a(true);
    }
}
