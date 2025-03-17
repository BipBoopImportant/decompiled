package tI;

import YH.V;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"LtI/l;", "LYH/V;", "", "first", "last", "step", "<init>", "(JJJ)V", "", "hasNext", "()Z", "c", "()J", "a", "J", "getStep", "b", "finalElement", "Z", "d", "next", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.l  reason: case insensitive filesystem */
public final class C17976l extends V {

    /* renamed from: a  reason: collision with root package name */
    private final long f147341a;

    /* renamed from: b  reason: collision with root package name */
    private final long f147342b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f147343c;

    /* renamed from: d  reason: collision with root package name */
    private long f147344d;

    public C17976l(long j10, long j11, long j12) {
        this.f147341a = j12;
        this.f147342b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f147343c = z10;
        this.f147344d = !z10 ? j11 : j10;
    }

    public long c() {
        long j10 = this.f147344d;
        if (j10 != this.f147342b) {
            this.f147344d = this.f147341a + j10;
        } else if (this.f147343c) {
            this.f147343c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }

    public boolean hasNext() {
        return this.f147343c;
    }
}
