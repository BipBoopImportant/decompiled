package tI;

import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"LtI/d;", "LtI/f;", "", "start", "endInclusive", "<init>", "(DD)V", "a", "b", "", "e", "(DD)Z", "value", "(D)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "_start", "_endInclusive", "d", "()Ljava/lang/Double;", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.d  reason: case insensitive filesystem */
final class C17968d implements C17970f<Double> {

    /* renamed from: a  reason: collision with root package name */
    private final double f147323a;

    /* renamed from: b  reason: collision with root package name */
    private final double f147324b;

    public C17968d(double d10, double d11) {
        this.f147323a = d10;
        this.f147324b = d11;
    }

    public boolean a(double d10) {
        return d10 >= this.f147323a && d10 <= this.f147324b;
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    /* renamed from: c */
    public Double m() {
        return Double.valueOf(this.f147324b);
    }

    /* renamed from: d */
    public Double i() {
        return Double.valueOf(this.f147323a);
    }

    public boolean e(double d10, double d11) {
        return d10 <= d11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17968d) {
            if (!isEmpty() || !((C17968d) obj).isEmpty()) {
                C17968d dVar = (C17968d) obj;
                if (!(this.f147323a == dVar.f147323a && this.f147324b == dVar.f147324b)) {
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
        return (Double.hashCode(this.f147323a) * 31) + Double.hashCode(this.f147324b);
    }

    public boolean isEmpty() {
        return this.f147323a > this.f147324b;
    }

    public /* bridge */ /* synthetic */ boolean k(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public String toString() {
        return this.f147323a + ".." + this.f147324b;
    }
}
