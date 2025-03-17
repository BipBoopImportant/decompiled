package QJ;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u000b\u0010\u000f\u001a\u00020\u00018\u0002X\u0004¨\u0006\u0010"}, d2 = {"LQJ/C;", "", "", "cause", "", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "c", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Throwable;", "_handled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.C  reason: case insensitive filesystem */
public class C16285C {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f137554b = AtomicIntegerFieldUpdater.newUpdater(C16285C.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f137555a;

    public C16285C(Throwable th2, boolean z10) {
        this.f137555a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f137554b.get(this) == 1;
    }

    public final boolean c() {
        return f137554b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return V.a(this) + '[' + this.f137555a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16285C(Throwable th2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
