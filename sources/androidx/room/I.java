package androidx.room;

import dI.C17165f;
import dI.C17168i;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/room/I;", "LdI/i$b;", "LdI/f;", "transactionDispatcher", "<init>", "(LdI/f;)V", "LXH/N;", "a", "()V", "j", "LdI/f;", "b", "()LdI/f;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "LdI/i$c;", "getKey", "()LdI/i$c;", "key", "c", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class I implements C17168i.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f44244c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17165f f44245a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f44246b = new AtomicInteger(0);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/I$a;", "LdI/i$c;", "Landroidx/room/I;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C17168i.c<I> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public I(C17165f fVar) {
        this.f44245a = fVar;
    }

    public final void a() {
        this.f44246b.incrementAndGet();
    }

    public final C17165f b() {
        return this.f44245a;
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return C17168i.b.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C17168i.b.a.b(this, cVar);
    }

    public C17168i.c<I> getKey() {
        return f44244c;
    }

    public final void j() {
        if (this.f44246b.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C17168i.b.a.c(this, cVar);
    }

    public C17168i plus(C17168i iVar) {
        return C17168i.b.a.d(this, iVar);
    }
}
