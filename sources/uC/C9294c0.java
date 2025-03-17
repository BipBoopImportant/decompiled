package Uc;

import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qa.g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001b\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b\u001f\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b!\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b#\u0010-R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b%\u0010-¨\u0006."}, d2 = {"LUc/c0;", "", "", "isBuildingEnabled", "isIndoorEnabled", "isMyLocationEnabled", "isTrafficEnabled", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBoundsForCameraTarget", "Lqa/g;", "mapStyleOptions", "LUc/k0;", "mapType", "", "maxZoomPreference", "minZoomPreference", "<init>", "(ZZZZLcom/google/android/gms/maps/model/LatLngBounds;Lqa/g;LUc/k0;FF)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "f", "()Z", "b", "g", "c", "h", "d", "i", "e", "Lcom/google/android/gms/maps/model/LatLngBounds;", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "Lqa/g;", "()Lqa/g;", "LUc/k0;", "()LUc/k0;", "F", "()F", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Uc.c0  reason: case insensitive filesystem */
public final class C9294c0 {

    /* renamed from: j  reason: collision with root package name */
    public static final int f64220j = 0;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f64221a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f64222b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f64223c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f64224d;

    /* renamed from: e  reason: collision with root package name */
    private final LatLngBounds f64225e;

    /* renamed from: f  reason: collision with root package name */
    private final g f64226f;

    /* renamed from: g  reason: collision with root package name */
    private final C9312k0 f64227g;

    /* renamed from: h  reason: collision with root package name */
    private final float f64228h;

    /* renamed from: i  reason: collision with root package name */
    private final float f64229i;

    public C9294c0() {
        this(false, false, false, false, (LatLngBounds) null, (g) null, (C9312k0) null, 0.0f, 0.0f, 511, (DefaultConstructorMarker) null);
    }

    public final LatLngBounds a() {
        return this.f64225e;
    }

    public final g b() {
        return this.f64226f;
    }

    public final C9312k0 c() {
        return this.f64227g;
    }

    public final float d() {
        return this.f64228h;
    }

    public final float e() {
        return this.f64229i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9294c0) {
            C9294c0 c0Var = (C9294c0) obj;
            return this.f64221a == c0Var.f64221a && this.f64222b == c0Var.f64222b && this.f64223c == c0Var.f64223c && this.f64224d == c0Var.f64224d && C17542s.e(this.f64225e, c0Var.f64225e) && C17542s.e(this.f64226f, c0Var.f64226f) && this.f64227g == c0Var.f64227g && this.f64228h == c0Var.f64228h && this.f64229i == c0Var.f64229i;
        }
    }

    public final boolean f() {
        return this.f64221a;
    }

    public final boolean g() {
        return this.f64222b;
    }

    public final boolean h() {
        return this.f64223c;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f64221a), Boolean.valueOf(this.f64222b), Boolean.valueOf(this.f64223c), Boolean.valueOf(this.f64224d), this.f64225e, this.f64226f, this.f64227g, Float.valueOf(this.f64228h), Float.valueOf(this.f64229i)});
    }

    public final boolean i() {
        return this.f64224d;
    }

    public String toString() {
        return "MapProperties(isBuildingEnabled=" + this.f64221a + ", isIndoorEnabled=" + this.f64222b + ", isMyLocationEnabled=" + this.f64223c + ", isTrafficEnabled=" + this.f64224d + ", latLngBoundsForCameraTarget=" + this.f64225e + ", mapStyleOptions=" + this.f64226f + ", mapType=" + this.f64227g + ", maxZoomPreference=" + this.f64228h + ", minZoomPreference=" + this.f64229i + ')';
    }

    public C9294c0(boolean z10, boolean z11, boolean z12, boolean z13, LatLngBounds latLngBounds, g gVar, C9312k0 k0Var, float f10, float f11) {
        C17542s.j(k0Var, "mapType");
        this.f64221a = z10;
        this.f64222b = z11;
        this.f64223c = z12;
        this.f64224d = z13;
        this.f64225e = latLngBounds;
        this.f64226f = gVar;
        this.f64227g = k0Var;
        this.f64228h = f10;
        this.f64229i = f11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9294c0(boolean r10, boolean r11, boolean r12, boolean r13, com.google.android.gms.maps.model.LatLngBounds r14, qa.g r15, Uc.C9312k0 r16, float r17, float r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = r13
        L_0x001e:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0025
            r5 = r6
            goto L_0x0026
        L_0x0025:
            r5 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r6 = r15
        L_0x002c:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0033
            Uc.k0 r7 = Uc.C9312k0.NORMAL
            goto L_0x0035
        L_0x0033:
            r7 = r16
        L_0x0035:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x003c
            r8 = 1101529088(0x41a80000, float:21.0)
            goto L_0x003e
        L_0x003c:
            r8 = r17
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0045
            r0 = 1077936128(0x40400000, float:3.0)
            goto L_0x0047
        L_0x0045:
            r0 = r18
        L_0x0047:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r2
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Uc.C9294c0.<init>(boolean, boolean, boolean, boolean, com.google.android.gms.maps.model.LatLngBounds, qa.g, Uc.k0, float, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
