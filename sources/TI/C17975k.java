package tI;

import YH.V;
import gI.C17269c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"LtI/k;", "", "", "start", "endInclusive", "step", "<init>", "(JJJ)V", "LYH/V;", "s", "()LYH/V;", "a", "J", "p", "()J", "first", "b", "q", "last", "c", "getStep", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.k  reason: case insensitive filesystem */
public class C17975k implements Iterable<Long>, C17693a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f147337d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f147338a;

    /* renamed from: b  reason: collision with root package name */
    private final long f147339b;

    /* renamed from: c  reason: collision with root package name */
    private final long f147340c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LtI/k$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tI.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C17975k(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j12 != Long.MIN_VALUE) {
            this.f147338a = j10;
            this.f147339b = C17269c.d(j10, j11, j12);
            this.f147340c = j12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long p() {
        return this.f147338a;
    }

    public final long q() {
        return this.f147339b;
    }

    /* renamed from: s */
    public V iterator() {
        return new C17976l(this.f147338a, this.f147339b, this.f147340c);
    }
}
