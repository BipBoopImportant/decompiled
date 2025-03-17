package l0;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Ll0/a;", "", "<init>", "()V", "", "time", "Ll0/a$a;", "b", "(F)Ll0/a$a;", "velocity", "friction", "", "a", "(FF)D", "", "[F", "SplinePositions", "c", "SplineTimes", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l0.a  reason: case insensitive filesystem */
public final class C5506a {

    /* renamed from: a  reason: collision with root package name */
    public static final C5506a f25307a = new C5506a();

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f25308b;

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f25309c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f25310d = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ll0/a$a;", "", "", "distanceCoefficient", "velocityCoefficient", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l0.a$a  reason: collision with other inner class name */
    public static final class C0402a {

        /* renamed from: a  reason: collision with root package name */
        private final float f25311a;

        /* renamed from: b  reason: collision with root package name */
        private final float f25312b;

        public C0402a(float f10, float f11) {
            this.f25311a = f10;
            this.f25312b = f11;
        }

        public final float a() {
            return this.f25311a;
        }

        public final float b() {
            return this.f25312b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0402a)) {
                return false;
            }
            C0402a aVar = (C0402a) obj;
            return Float.compare(this.f25311a, aVar.f25311a) == 0 && Float.compare(this.f25312b, aVar.f25312b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f25311a) * 31) + Float.hashCode(this.f25312b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f25311a + ", velocityCoefficient=" + this.f25312b + ')';
        }
    }

    static {
        float[] fArr = new float[CheckoutActivity.RESULT_CANCELED];
        f25308b = fArr;
        float[] fArr2 = new float[CheckoutActivity.RESULT_CANCELED];
        f25309c = fArr2;
        x.b(fArr, fArr2, 100);
    }

    private C5506a() {
    }

    public final double a(float f10, float f11) {
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) f11));
    }

    public final C0402a b(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float l10 = C17978n.l(f10, 0.0f, 1.0f);
        float f13 = (float) 100;
        int i10 = (int) (f13 * l10);
        if (i10 < 100) {
            float f14 = ((float) i10) / f13;
            int i11 = i10 + 1;
            float f15 = ((float) i11) / f13;
            float[] fArr = f25308b;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            f11 = f17;
            f12 = ((l10 - f14) * f17) + f16;
        }
        return new C0402a(f12, f11);
    }
}
