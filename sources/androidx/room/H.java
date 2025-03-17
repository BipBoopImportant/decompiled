package androidx.room;

import Q4.k;
import XH.C16824o;
import XH.C16825p;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/room/H;", "", "Landroidx/room/x;", "database", "<init>", "(Landroidx/room/x;)V", "LQ4/k;", "createNewStatement", "()LQ4/k;", "", "canUseCached", "getStmt", "(Z)LQ4/k;", "", "createQuery", "()Ljava/lang/String;", "LXH/N;", "assertNotMainThread", "()V", "acquire", "statement", "release", "(LQ4/k;)V", "Landroidx/room/x;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stmt$delegate", "LXH/o;", "stmt", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class H {
    private final x database;
    private final AtomicBoolean lock = new AtomicBoolean(false);
    private final C16824o stmt$delegate = C16825p.b(new a(this));

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LQ4/k;", "b", "()LQ4/k;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<k> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H f44243c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H h10) {
            super(0);
            this.f44243c = h10;
        }

        /* renamed from: b */
        public final k invoke() {
            return this.f44243c.createNewStatement();
        }
    }

    public H(x xVar) {
        C17542s.j(xVar, "database");
        this.database = xVar;
    }

    /* access modifiers changed from: private */
    public final k createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final k getStmt() {
        return (k) this.stmt$delegate.getValue();
    }

    public k acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    /* access modifiers changed from: protected */
    public abstract String createQuery();

    public void release(k kVar) {
        C17542s.j(kVar, "statement");
        if (kVar == getStmt()) {
            this.lock.set(false);
        }
    }

    private final k getStmt(boolean z10) {
        if (z10) {
            return getStmt();
        }
        return createNewStatement();
    }
}
