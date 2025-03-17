package io.ktor.utils.io.jvm.javaio;

import XH.C16820k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/g;", "Lio/ktor/utils/io/jvm/javaio/e;", "Ljava/lang/Thread;", "<init>", "()V", "", "c", "()Ljava/lang/Void;", "", "timeNanos", "LXH/N;", "a", "(J)V", "token", "d", "(Ljava/lang/Thread;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g implements e<Thread> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f143816a = new g();

    private g() {
    }

    private final Void c() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    public void a(long j10) {
        c();
        throw new C16820k();
    }

    /* renamed from: d */
    public void b(Thread thread) {
        C17542s.j(thread, "token");
        c.f143804a.b(thread);
    }
}
