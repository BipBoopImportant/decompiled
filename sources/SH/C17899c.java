package sH;

import JH.n;
import QJ.C16283A;
import QJ.F0;
import QJ.M;
import QJ.P;
import XH.C16824o;
import XH.C16825p;
import dI.C17168i;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import pH.C17746a;
import sH.C17898b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118VX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LsH/c;", "LsH/b;", "", "engineName", "<init>", "(Ljava/lang/String;)V", "LXH/N;", "close", "()V", "a", "Ljava/lang/String;", "LQJ/M;", "b", "LQJ/M;", "e", "()LQJ/M;", "dispatcher", "LdI/i;", "c", "LXH/o;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: sH.c  reason: case insensitive filesystem */
public abstract class C17899c implements C17898b {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f146985d = AtomicIntegerFieldUpdater.newUpdater(C17899c.class, "closed");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f146986a;

    /* renamed from: b  reason: collision with root package name */
    private final M f146987b = C17900d.a();

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f146988c = C16825p.b(new a(this));
    private volatile /* synthetic */ int closed = 0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdI/i;", "b", "()LdI/i;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sH.c$a */
    static final class a extends C17544u implements C17631a<C17168i> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17899c f146989c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17899c cVar) {
            super(0);
            this.f146989c = cVar;
        }

        /* renamed from: b */
        public final C17168i invoke() {
            C17168i plus = n.b((F0) null, 1, (Object) null).plus(this.f146989c.e());
            return plus.plus(new P(this.f146989c.f146986a + "-context"));
        }
    }

    public C17899c(String str) {
        C17542s.j(str, "engineName");
        this.f146986a = str;
    }

    public void a2(C17746a aVar) {
        C17898b.a.h(this, aVar);
    }

    public Set<C17901e<?>> b2() {
        return C17898b.a.g(this);
    }

    public void close() {
        if (f146985d.compareAndSet(this, 0, 1)) {
            C17168i.b bVar = getCoroutineContext().get(F0.f137562d0);
            C16283A a10 = bVar instanceof C16283A ? (C16283A) bVar : null;
            if (a10 != null) {
                a10.l();
            }
        }
    }

    public M e() {
        return this.f146987b;
    }

    public C17168i getCoroutineContext() {
        return (C17168i) this.f146988c.getValue();
    }
}
