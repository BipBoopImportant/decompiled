package d2;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\tB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010 \u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u001a¨\u0006\""}, d2 = {"Ld2/c;", "Ld2/a;", "", "fromSp", "toDp", "<init>", "([F[F)V", "", "dp", "a", "(F)F", "sp", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[F", "getMFromSpValues", "()[F", "getMFromSpValues$annotations", "()V", "mFromSpValues", "getMToDpValues", "getMToDpValues$annotations", "mToDpValues", "c", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d2.c  reason: case insensitive filesystem */
public final class C5276c implements C5274a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f23117c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f23118d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final float[] f23119a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f23120b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld2/c$a;", "", "<init>", "()V", "", "sourceValue", "", "sourceValues", "targetValues", "b", "(F[F[F)F", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d2.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final float b(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float a10;
            float abs = Math.abs(f10);
            float signum = Math.signum(f10);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                a10 = fArr2[binarySearch];
            } else {
                int i10 = -(binarySearch + 1);
                int i11 = i10 - 1;
                float f14 = 0.0f;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return f10 * (f16 / f15);
                }
                if (i11 == -1) {
                    float f17 = fArr[0];
                    f12 = fArr2[0];
                    f11 = f17;
                    f13 = 0.0f;
                } else {
                    float f18 = fArr[i11];
                    float f19 = fArr[i10];
                    f13 = fArr2[i11];
                    f14 = f18;
                    f11 = f19;
                    f12 = fArr2[i10];
                }
                a10 = C5277d.f23121a.a(f13, f12, f14, f11, abs);
            }
            return signum * a10;
        }

        private a() {
        }
    }

    public C5276c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f23119a = fArr;
        this.f23120b = fArr2;
    }

    public float a(float f10) {
        return f23117c.b(f10, this.f23120b, this.f23119a);
    }

    public float b(float f10) {
        return f23117c.b(f10, this.f23119a, this.f23120b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5276c)) {
            return false;
        }
        C5276c cVar = (C5276c) obj;
        return Arrays.equals(this.f23119a, cVar.f23119a) && Arrays.equals(this.f23120b, cVar.f23120b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f23119a) * 31) + Arrays.hashCode(this.f23120b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f23119a);
        C17542s.i(arrays, "toString(this)");
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f23120b);
        C17542s.i(arrays2, "toString(this)");
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
