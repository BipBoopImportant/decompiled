package io.ktor.utils.io.internal;

import XH.C16820k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0011J\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u001cJ\r\u0010 \u001a\u00020\u0013¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$¨\u0006%"}, d2 = {"Lio/ktor/utils/io/internal/i;", "", "", "totalCapacity", "<init>", "(I)V", "remaining", "update", "n", "", "b", "(III)Ljava/lang/Void;", "pending", "d", "(II)Ljava/lang/Void;", "LXH/N;", "j", "()V", "i", "", "m", "(I)Z", "l", "(I)I", "o", "a", "c", "e", "()Z", "k", "f", "g", "h", "", "toString", "()Ljava/lang/String;", "I", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f143769b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f143770c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f143771d;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    public volatile /* synthetic */ int _availableForWrite$internal;
    volatile /* synthetic */ int _pendingToFlush;

    /* renamed from: a  reason: collision with root package name */
    private final int f143772a;

    static {
        Class<i> cls = i.class;
        f143769b = AtomicIntegerFieldUpdater.newUpdater(cls, "_availableForRead$internal");
        f143770c = AtomicIntegerFieldUpdater.newUpdater(cls, "_availableForWrite$internal");
        f143771d = AtomicIntegerFieldUpdater.newUpdater(cls, "_pendingToFlush");
    }

    public i(int i10) {
        this.f143772a = i10;
        this._availableForWrite$internal = i10;
        this._pendingToFlush = 0;
    }

    private final Void b(int i10, int i11, int i12) {
        throw new IllegalArgumentException("Completed read overflow: " + i10 + " + " + i12 + " = " + i11 + " > " + this.f143772a);
    }

    private final Void d(int i10, int i11) {
        throw new IllegalArgumentException("Complete write overflow: " + i10 + " + " + i11 + " > " + this.f143772a);
    }

    public final void a(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._availableForWrite$internal;
            i12 = i11 + i10;
            if (i12 > this.f143772a) {
                b(i11, i12, i10);
                throw new C16820k();
            }
        } while (!f143770c.compareAndSet(this, i11, i12));
    }

    public final void c(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._pendingToFlush;
            i12 = i11 + i10;
            if (i12 > this.f143772a) {
                d(i11, i10);
                throw new C16820k();
            }
        } while (!f143771d.compareAndSet(this, i11, i12));
    }

    public final boolean e() {
        int andSet = f143771d.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : f143769b.addAndGet(this, andSet) > 0;
    }

    public final void f() {
        f143770c.getAndSet(this, 0);
    }

    public final boolean g() {
        return this._availableForWrite$internal == this.f143772a;
    }

    public final boolean h() {
        return this._availableForWrite$internal == 0;
    }

    public final void i() {
        this._availableForRead$internal = this.f143772a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void j() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f143772a;
    }

    public final boolean k() {
        int i10;
        do {
            i10 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i10 != this.f143772a) {
                return false;
            }
        } while (!f143770c.compareAndSet(this, i10, 0));
        return true;
    }

    public final int l(int i10) {
        int i11;
        int min;
        do {
            i11 = this._availableForRead$internal;
            min = Math.min(i10, i11);
            if (min == 0) {
                return 0;
            }
        } while (!f143769b.compareAndSet(this, i11, i11 - min));
        return Math.min(i10, i11);
    }

    public final boolean m(int i10) {
        int i11;
        do {
            i11 = this._availableForRead$internal;
            if (i11 < i10) {
                return false;
            }
        } while (!f143769b.compareAndSet(this, i11, i11 - i10));
        return true;
    }

    public final int n(int i10) {
        int i11;
        do {
            i11 = this._availableForWrite$internal;
            if (i11 < i10) {
                return 0;
            }
        } while (!f143770c.compareAndSet(this, i11, 0));
        return i11;
    }

    public final int o(int i10) {
        int i11;
        int min;
        do {
            i11 = this._availableForWrite$internal;
            min = Math.min(i10, i11);
            if (min == 0) {
                return 0;
            }
        } while (!f143770c.compareAndSet(this, i11, i11 - min));
        return Math.min(i10, i11);
    }

    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.f143772a + ']';
    }
}
