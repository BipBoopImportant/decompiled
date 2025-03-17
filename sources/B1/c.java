package B1;

import XH.t;
import YH.C16870n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010)\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010(¨\u0006."}, d2 = {"LB1/c;", "", "", "isDataDifferential", "LB1/c$a;", "strategy", "<init>", "(ZLB1/c$a;)V", "", "dataPoints", "time", "", "sampleCount", "", "b", "([F[FI)F", "", "timeMillis", "dataPoint", "LXH/N;", "a", "(JF)V", "c", "()F", "maximumVelocity", "d", "(F)F", "e", "()V", "Z", "()Z", "LB1/c$a;", "I", "minSampleSize", "", "LB1/a;", "[LB1/a;", "samples", "index", "f", "[F", "reusableDataPointsArray", "g", "reusableTimeArray", "h", "reusableVelocityCoefficients", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5162a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5163b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5164c;

    /* renamed from: d  reason: collision with root package name */
    private final a[] f5165d;

    /* renamed from: e  reason: collision with root package name */
    private int f5166e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f5167f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f5168g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f5169h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LB1/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        Lsq2,
        Impulse
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5170a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                B1.c$a[] r0 = B1.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                B1.c$a r1 = B1.c.a.Impulse     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                B1.c$a r1 = B1.c.a.Lsq2     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f5170a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: B1.c.b.<clinit>():void");
        }
    }

    public c(boolean z10, a aVar) {
        this.f5162a = z10;
        this.f5163b = aVar;
        if (!z10 || !aVar.equals(a.Lsq2)) {
            int i10 = b.f5170a[aVar.ordinal()];
            int i11 = 2;
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 3;
                } else {
                    throw new t();
                }
            }
            this.f5164c = i11;
            this.f5165d = new a[20];
            this.f5167f = new float[20];
            this.f5168g = new float[20];
            this.f5169h = new float[3];
            return;
        }
        throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
    }

    private final float b(float[] fArr, float[] fArr2, int i10) {
        try {
            return e.i(fArr2, fArr, i10, 2, this.f5169h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j10, float f10) {
        int i10 = (this.f5166e + 1) % 20;
        this.f5166e = i10;
        e.j(this.f5165d, i10, j10, f10);
    }

    public final float c() {
        float f10;
        float[] fArr = this.f5167f;
        float[] fArr2 = this.f5168g;
        int i10 = this.f5166e;
        a aVar = this.f5165d[i10];
        if (aVar == null) {
            return 0.0f;
        }
        int i11 = 0;
        a aVar2 = aVar;
        while (true) {
            a aVar3 = this.f5165d[i10];
            if (aVar3 != null) {
                float b10 = (float) (aVar.b() - aVar3.b());
                float abs = (float) Math.abs(aVar3.b() - aVar2.b());
                a aVar4 = (this.f5163b == a.Lsq2 || this.f5162a) ? aVar3 : aVar;
                if (b10 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i11] = aVar3.a();
                fArr2[i11] = -b10;
                if (i10 == 0) {
                    i10 = 20;
                }
                i10--;
                i11++;
                if (i11 >= 20) {
                    break;
                }
                aVar2 = aVar4;
            } else {
                break;
            }
        }
        if (i11 < this.f5164c) {
            return 0.0f;
        }
        int i12 = b.f5170a[this.f5163b.ordinal()];
        if (i12 == 1) {
            f10 = e.f(fArr, fArr2, i11, this.f5162a);
        } else if (i12 == 2) {
            f10 = b(fArr, fArr2, i11);
        } else {
            throw new t();
        }
        return f10 * ((float) 1000);
    }

    public final float d(float f10) {
        if (!(f10 > 0.0f)) {
            D1.a.b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        float c10 = c();
        if (c10 != 0.0f && !Float.isNaN(c10)) {
            return c10 > 0.0f ? C17978n.h(c10, f10) : C17978n.d(c10, -f10);
        }
        return 0.0f;
    }

    public final void e() {
        C16870n.A(this.f5165d, (Object) null, 0, 0, 6, (Object) null);
        this.f5166e = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z10, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.Lsq2 : aVar);
    }
}
