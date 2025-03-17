package io.ktor.utils.io.internal;

import QJ.F0;
import io.ktor.utils.io.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/internal/d;", "", "LXH/N;", "a", "()V", "Lio/ktor/utils/io/a;", "Lio/ktor/utils/io/a;", "c", "()Lio/ktor/utils/io/a;", "delegatedTo", "", "b", "Z", "()Z", "delegateClose", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f143742c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_closeWaitJob");
    private volatile /* synthetic */ Object _closeWaitJob;

    /* renamed from: a  reason: collision with root package name */
    private final a f143743a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f143744b;
    private volatile /* synthetic */ int closed;

    public final void a() {
        this.closed = 1;
        F0 f02 = (F0) f143742c.getAndSet(this, (Object) null);
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
    }

    public final boolean b() {
        return this.f143744b;
    }

    public final a c() {
        return this.f143743a;
    }
}
