package q1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5751x0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lq1/A;", "Lq1/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lp1/v0;", "n", "(FFFFLq1/c;)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: q1.A  reason: case insensitive filesystem */
public final class C5773A extends C5776c {
    public C5773A(String str, int i10) {
        super(str, C5775b.f27655a.c(), i10, (DefaultConstructorMarker) null);
    }

    public float[] b(float[] fArr) {
        float f10 = fArr[0];
        float f11 = -2.0f;
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        float f12 = 2.0f;
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f13 = fArr[1];
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        fArr[1] = f13;
        float f14 = fArr[2];
        if (f14 >= -2.0f) {
            f11 = f14;
        }
        if (f11 <= 2.0f) {
            f12 = f11;
        }
        fArr[2] = f12;
        return fArr;
    }

    public float e(int i10) {
        return 2.0f;
    }

    public float f(int i10) {
        return -2.0f;
    }

    public long j(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        float f13 = 2.0f;
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 <= 2.0f) {
            f13 = f11;
        }
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
    }

    public float[] l(float[] fArr) {
        float f10 = fArr[0];
        float f11 = -2.0f;
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        float f12 = 2.0f;
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f13 = fArr[1];
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        fArr[1] = f13;
        float f14 = fArr[2];
        if (f14 >= -2.0f) {
            f11 = f14;
        }
        if (f11 <= 2.0f) {
            f12 = f11;
        }
        fArr[2] = f12;
        return fArr;
    }

    public float m(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    public long n(float f10, float f11, float f12, float f13, C5776c cVar) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        float f14 = 2.0f;
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 <= 2.0f) {
            f14 = f12;
        }
        return C5751x0.a(f10, f11, f14, f13, cVar);
    }
}
