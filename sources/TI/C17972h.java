package tI;

import YH.U;
import gI.C17269c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0013¨\u0006!"}, d2 = {"LtI/h;", "", "", "start", "endInclusive", "step", "<init>", "(III)V", "LYH/U;", "t", "()LYH/U;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "p", "first", "b", "q", "last", "c", "s", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.h  reason: case insensitive filesystem */
public class C17972h implements Iterable<Integer>, C17693a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f147327d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f147328a;

    /* renamed from: b  reason: collision with root package name */
    private final int f147329b;

    /* renamed from: c  reason: collision with root package name */
    private final int f147330c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LtI/h$a;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "LtI/h;", "a", "(III)LtI/h;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tI.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17972h a(int i10, int i11, int i12) {
            return new C17972h(i10, i11, i12);
        }

        private a() {
        }
    }

    public C17972h(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f147328a = i10;
            this.f147329b = C17269c.c(i10, i11, i12);
            this.f147330c = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17972h) {
            if (!isEmpty() || !((C17972h) obj).isEmpty()) {
                C17972h hVar = (C17972h) obj;
                if (!(this.f147328a == hVar.f147328a && this.f147329b == hVar.f147329b && this.f147330c == hVar.f147330c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f147328a * 31) + this.f147329b) * 31) + this.f147330c;
    }

    public boolean isEmpty() {
        if (this.f147330c > 0) {
            if (this.f147328a <= this.f147329b) {
                return false;
            }
        } else if (this.f147328a >= this.f147329b) {
            return false;
        }
        return true;
    }

    public final int p() {
        return this.f147328a;
    }

    public final int q() {
        return this.f147329b;
    }

    public final int s() {
        return this.f147330c;
    }

    /* renamed from: t */
    public U iterator() {
        return new C17973i(this.f147328a, this.f147329b, this.f147330c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f147330c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f147328a);
            sb2.append("..");
            sb2.append(this.f147329b);
            sb2.append(" step ");
            i10 = this.f147330c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f147328a);
            sb2.append(" downTo ");
            sb2.append(this.f147329b);
            sb2.append(" step ");
            i10 = -this.f147330c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
