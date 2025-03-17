package androidx.compose.foundation.gestures;

import j0.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p0.o;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006#"}, d2 = {"Landroidx/compose/foundation/gestures/f;", "T", "Lp0/o;", "Lj0/P;", "anchors", "<init>", "(Lj0/P;)V", "value", "", "f", "(Ljava/lang/Object;)F", "", "d", "(Ljava/lang/Object;)Z", "position", "c", "(F)Ljava/lang/Object;", "searchUpwards", "b", "(FZ)Ljava/lang/Object;", "e", "()F", "g", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lj0/P;", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f<T> implements o<T> {

    /* renamed from: a  reason: collision with root package name */
    private final P<T> f17810a;

    public f(P<T> p10) {
        this.f17810a = p10;
    }

    public int a() {
        return this.f17810a.g();
    }

    public T b(float f10, boolean z10) {
        P<T> p10 = this.f17810a;
        T[] tArr = p10.f24547b;
        float[] fArr = p10.f24548c;
        long[] jArr = p10.f24546a;
        int length = jArr.length - 2;
        T t10 = null;
        if (length >= 0) {
            float f11 = Float.POSITIVE_INFINITY;
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            T t11 = tArr[i13];
                            float f12 = fArr[i13];
                            float f13 = z10 ? f12 - f10 : f10 - f12;
                            if (f13 < 0.0f) {
                                f13 = Float.POSITIVE_INFINITY;
                            }
                            if (f13 <= f11) {
                                f11 = f13;
                                t10 = t11;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    public T c(float f10) {
        P<T> p10 = this.f17810a;
        T[] tArr = p10.f24547b;
        float[] fArr = p10.f24548c;
        long[] jArr = p10.f24546a;
        int length = jArr.length - 2;
        T t10 = null;
        if (length >= 0) {
            float f11 = Float.POSITIVE_INFINITY;
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            T t11 = tArr[i13];
                            float abs = Math.abs(f10 - fArr[i13]);
                            if (abs <= f11) {
                                f11 = abs;
                                t10 = t11;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    public boolean d(T t10) {
        return this.f17810a.b(t10);
    }

    public float e() {
        return a.q(this.f17810a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return C17542s.e(this.f17810a, ((f) obj).f17810a);
    }

    public float f(T t10) {
        return this.f17810a.f(t10, Float.NaN);
    }

    public float g() {
        return a.p(this.f17810a);
    }

    public int hashCode() {
        return this.f17810a.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.f17810a + ')';
    }
}
