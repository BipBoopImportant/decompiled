package WK;

import XH.C16807N;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002(,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0015J/\u0010!\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH$¢\u0006\u0004\b!\u0010\"J/\u0010#\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH$¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH$¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010&\u001a\u00020\u0007H$¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010'\u001a\u00020\u000fH$¢\u0006\u0004\b'\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0016\u00100\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00107\u001a\u000601j\u0002`28\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"LWK/j;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "LWK/e;", "sink", "byteCount", "s", "(JLWK/e;J)J", "source", "LXH/N;", "w", "(JLWK/e;J)V", "size", "()J", "flush", "()V", "LWK/N;", "v", "(J)LWK/N;", "LWK/L;", "t", "(J)LWK/L;", "close", "", "array", "", "arrayOffset", "n", "(J[BII)I", "q", "(J[BII)V", "l", "o", "i", "a", "Z", "getReadWrite", "()Z", "b", "closed", "c", "I", "openStreamCount", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "d", "Ljava/util/concurrent/locks/ReentrantLock;", "h", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.j  reason: case insensitive filesystem */
public abstract class C16775j implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f139672a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f139673b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f139674c;

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantLock f139675d = S.b();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"LWK/j$a;", "LWK/L;", "LWK/j;", "fileHandle", "", "position", "<init>", "(LWK/j;J)V", "LWK/e;", "source", "byteCount", "LXH/N;", "s3", "(LWK/e;J)V", "flush", "()V", "LWK/O;", "y", "()LWK/O;", "close", "a", "LWK/j;", "getFileHandle", "()LWK/j;", "b", "J", "getPosition", "()J", "setPosition", "(J)V", "", "c", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.j$a */
    private static final class a implements L {

        /* renamed from: a  reason: collision with root package name */
        private final C16775j f139676a;

        /* renamed from: b  reason: collision with root package name */
        private long f139677b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f139678c;

        public a(C16775j jVar, long j10) {
            C17542s.j(jVar, "fileHandle");
            this.f139676a = jVar;
            this.f139677b = j10;
        }

        public void close() {
            if (!this.f139678c) {
                this.f139678c = true;
                ReentrantLock h10 = this.f139676a.h();
                h10.lock();
                try {
                    C16775j jVar = this.f139676a;
                    jVar.f139674c = jVar.f139674c - 1;
                    if (this.f139676a.f139674c == 0) {
                        if (this.f139676a.f139673b) {
                            C16807N n10 = C16807N.f139792a;
                            h10.unlock();
                            this.f139676a.i();
                        }
                    }
                } finally {
                    h10.unlock();
                }
            }
        }

        public void flush() {
            if (!this.f139678c) {
                this.f139676a.l();
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void s3(C16770e eVar, long j10) {
            C17542s.j(eVar, "source");
            if (!this.f139678c) {
                this.f139676a.w(this.f139677b, eVar, j10);
                this.f139677b += j10;
                return;
            }
            throw new IllegalStateException("closed");
        }

        public O y() {
            return O.f139626e;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LWK/j$b;", "LWK/N;", "LWK/j;", "fileHandle", "", "position", "<init>", "(LWK/j;J)V", "LWK/e;", "sink", "byteCount", "u0", "(LWK/e;J)J", "LWK/O;", "y", "()LWK/O;", "LXH/N;", "close", "()V", "a", "LWK/j;", "getFileHandle", "()LWK/j;", "b", "J", "getPosition", "()J", "setPosition", "(J)V", "", "c", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.j$b */
    private static final class b implements N {

        /* renamed from: a  reason: collision with root package name */
        private final C16775j f139679a;

        /* renamed from: b  reason: collision with root package name */
        private long f139680b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f139681c;

        public b(C16775j jVar, long j10) {
            C17542s.j(jVar, "fileHandle");
            this.f139679a = jVar;
            this.f139680b = j10;
        }

        public void close() {
            if (!this.f139681c) {
                this.f139681c = true;
                ReentrantLock h10 = this.f139679a.h();
                h10.lock();
                try {
                    C16775j jVar = this.f139679a;
                    jVar.f139674c = jVar.f139674c - 1;
                    if (this.f139679a.f139674c == 0) {
                        if (this.f139679a.f139673b) {
                            C16807N n10 = C16807N.f139792a;
                            h10.unlock();
                            this.f139679a.i();
                        }
                    }
                } finally {
                    h10.unlock();
                }
            }
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            if (!this.f139681c) {
                long e10 = this.f139679a.s(this.f139680b, eVar, j10);
                if (e10 != -1) {
                    this.f139680b += e10;
                }
                return e10;
            }
            throw new IllegalStateException("closed");
        }

        public O y() {
            return O.f139626e;
        }
    }

    public C16775j(boolean z10) {
        this.f139672a = z10;
    }

    /* access modifiers changed from: private */
    public final long s(long j10, C16770e eVar, long j11) {
        C16770e eVar2 = eVar;
        long j12 = j11;
        if (j12 >= 0) {
            long j13 = j12 + j10;
            long j14 = j10;
            while (true) {
                if (j14 >= j13) {
                    break;
                }
                I I02 = eVar2.I0(1);
                byte[] bArr = I02.f139610a;
                int i10 = I02.f139612c;
                int n10 = n(j14, bArr, i10, (int) Math.min(j13 - j14, (long) (8192 - i10)));
                if (n10 == -1) {
                    if (I02.f139611b == I02.f139612c) {
                        eVar2.f139653a = I02.b();
                        J.b(I02);
                    }
                    if (j10 == j14) {
                        return -1;
                    }
                } else {
                    I02.f139612c += n10;
                    long j15 = (long) n10;
                    j14 += j15;
                    eVar2.p0(eVar.size() + j15);
                }
            }
            return j14 - j10;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j12).toString());
    }

    public static /* synthetic */ L u(C16775j jVar, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            return jVar.t(j10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    /* access modifiers changed from: private */
    public final void w(long j10, C16770e eVar, long j11) {
        C16767b.b(eVar.size(), 0, j11);
        long j12 = j11 + j10;
        while (j10 < j12) {
            I i10 = eVar.f139653a;
            C17542s.g(i10);
            int min = (int) Math.min(j12 - j10, (long) (i10.f139612c - i10.f139611b));
            q(j10, i10.f139610a, i10.f139611b, min);
            i10.f139611b += min;
            long j13 = (long) min;
            j10 += j13;
            eVar.p0(eVar.size() - j13);
            if (i10.f139611b == i10.f139612c) {
                eVar.f139653a = i10.b();
                J.b(i10);
            }
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.f139675d;
        reentrantLock.lock();
        try {
            if (!this.f139673b) {
                this.f139673b = true;
                if (this.f139674c != 0) {
                    reentrantLock.unlock();
                    return;
                }
                C16807N n10 = C16807N.f139792a;
                reentrantLock.unlock();
                i();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void flush() {
        if (this.f139672a) {
            ReentrantLock reentrantLock = this.f139675d;
            reentrantLock.lock();
            try {
                if (!this.f139673b) {
                    C16807N n10 = C16807N.f139792a;
                    reentrantLock.unlock();
                    l();
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } else {
            throw new IllegalStateException("file handle is read-only");
        }
    }

    public final ReentrantLock h() {
        return this.f139675d;
    }

    /* access modifiers changed from: protected */
    public abstract void i();

    /* access modifiers changed from: protected */
    public abstract void l();

    /* access modifiers changed from: protected */
    public abstract int n(long j10, byte[] bArr, int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract long o();

    /* access modifiers changed from: protected */
    public abstract void q(long j10, byte[] bArr, int i10, int i11);

    /* JADX INFO: finally extract failed */
    public final long size() {
        ReentrantLock reentrantLock = this.f139675d;
        reentrantLock.lock();
        try {
            if (!this.f139673b) {
                C16807N n10 = C16807N.f139792a;
                reentrantLock.unlock();
                return o();
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final L t(long j10) {
        if (this.f139672a) {
            ReentrantLock reentrantLock = this.f139675d;
            reentrantLock.lock();
            try {
                if (!this.f139673b) {
                    this.f139674c++;
                    reentrantLock.unlock();
                    return new a(this, j10);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } else {
            throw new IllegalStateException("file handle is read-only");
        }
    }

    /* JADX INFO: finally extract failed */
    public final N v(long j10) {
        ReentrantLock reentrantLock = this.f139675d;
        reentrantLock.lock();
        try {
            if (!this.f139673b) {
                this.f139674c++;
                reentrantLock.unlock();
                return new b(this, j10);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
