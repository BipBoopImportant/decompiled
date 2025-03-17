package tI;

import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"LtI/e;", "LtI/f;", "", "start", "endInclusive", "<init>", "(FF)V", "a", "b", "", "e", "(FF)Z", "value", "(F)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "_start", "_endInclusive", "d", "()Ljava/lang/Float;", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tI.e  reason: case insensitive filesystem */
final class C17969e implements C17970f<Float> {

    /* renamed from: a  reason: collision with root package name */
    private final float f147325a;

    /* renamed from: b  reason: collision with root package name */
    private final float f147326b;

    public C17969e(float f10, float f11) {
        this.f147325a = f10;
        this.f147326b = f11;
    }

    public boolean a(float f10) {
        return f10 >= this.f147325a && f10 <= this.f147326b;
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    /* renamed from: c */
    public Float m() {
        return Float.valueOf(this.f147326b);
    }

    /* renamed from: d */
    public Float i() {
        return Float.valueOf(this.f147325a);
    }

    public boolean e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17969e) {
            if (!isEmpty() || !((C17969e) obj).isEmpty()) {
                C17969e eVar = (C17969e) obj;
                if (!(this.f147325a == eVar.f147325a && this.f147326b == eVar.f147326b)) {
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
        return (Float.hashCode(this.f147325a) * 31) + Float.hashCode(this.f147326b);
    }

    public boolean isEmpty() {
        return this.f147325a > this.f147326b;
    }

    public /* bridge */ /* synthetic */ boolean k(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        return this.f147325a + ".." + this.f147326b;
    }
}
