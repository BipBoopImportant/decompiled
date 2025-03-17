package X6;

import M6.r;
import XH.C16814e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"LX6/d;", "LM6/r$c;", "", "startMillis", "endMillis", "", "statusCode", "", "LN6/d;", "headers", "<init>", "(JJILjava/util/List;)V", "c", "J", "getStartMillis", "()J", "d", "getEndMillis", "e", "I", "getStatusCode", "()I", "f", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "LM6/r$d;", "getKey", "()LM6/r$d;", "key", "g", "a", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d implements r.c {

    /* renamed from: g  reason: collision with root package name */
    public static final a f40710g = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final long f40711c;

    /* renamed from: d  reason: collision with root package name */
    private final long f40712d;

    /* renamed from: e  reason: collision with root package name */
    private final int f40713e;

    /* renamed from: f  reason: collision with root package name */
    private final List<N6.d> f40714f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LX6/d$a;", "LM6/r$d;", "LX6/d;", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements r.d<d> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @C16814e
    public d(long j10, long j11, int i10, List<N6.d> list) {
        C17542s.j(list, "headers");
        this.f40711c = j10;
        this.f40712d = j11;
        this.f40713e = i10;
        this.f40714f = list;
    }

    public <E extends r.c> E a(r.d<E> dVar) {
        return r.c.a.b(this, dVar);
    }

    public r b(r.d<?> dVar) {
        return r.c.a.c(this, dVar);
    }

    public r c(r rVar) {
        return r.c.a.d(this, rVar);
    }

    public <R> R fold(R r10, p<? super R, ? super r.c, ? extends R> pVar) {
        return r.c.a.a(this, r10, pVar);
    }

    public r.d<?> getKey() {
        return f40710g;
    }
}
