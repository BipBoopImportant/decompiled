package tI;

import YH.C16876u;
import gI.C17269c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LtI/a;", "", "", "start", "endInclusive", "", "step", "<init>", "(CCI)V", "LYH/u;", "s", "()LYH/u;", "a", "C", "p", "()C", "first", "b", "q", "last", "c", "I", "getStep", "()I", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.a  reason: case insensitive filesystem */
public class C17965a implements Iterable<Character>, C17693a {

    /* renamed from: d  reason: collision with root package name */
    public static final C4282a f147313d = new C4282a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final char f147314a;

    /* renamed from: b  reason: collision with root package name */
    private final char f147315b;

    /* renamed from: c  reason: collision with root package name */
    private final int f147316c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LtI/a$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tI.a$a  reason: collision with other inner class name */
    public static final class C4282a {
        public /* synthetic */ C4282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4282a() {
        }
    }

    public C17965a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i10 != Integer.MIN_VALUE) {
            this.f147314a = c10;
            this.f147315b = (char) C17269c.c(c10, c11, i10);
            this.f147316c = i10;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final char p() {
        return this.f147314a;
    }

    public final char q() {
        return this.f147315b;
    }

    /* renamed from: s */
    public C16876u iterator() {
        return new C17966b(this.f147314a, this.f147315b, this.f147316c);
    }
}
