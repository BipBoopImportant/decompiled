package B6;

import android.graphics.PointF;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f33209a;

    /* renamed from: b  reason: collision with root package name */
    public String f33210b;

    /* renamed from: c  reason: collision with root package name */
    public float f33211c;

    /* renamed from: d  reason: collision with root package name */
    public a f33212d;

    /* renamed from: e  reason: collision with root package name */
    public int f33213e;

    /* renamed from: f  reason: collision with root package name */
    public float f33214f;

    /* renamed from: g  reason: collision with root package name */
    public float f33215g;

    /* renamed from: h  reason: collision with root package name */
    public int f33216h;

    /* renamed from: i  reason: collision with root package name */
    public int f33217i;

    /* renamed from: j  reason: collision with root package name */
    public float f33218j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f33219k;

    /* renamed from: l  reason: collision with root package name */
    public PointF f33220l;

    /* renamed from: m  reason: collision with root package name */
    public PointF f33221m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f33209a = str;
        this.f33210b = str2;
        this.f33211c = f10;
        this.f33212d = aVar;
        this.f33213e = i10;
        this.f33214f = f11;
        this.f33215g = f12;
        this.f33216h = i11;
        this.f33217i = i12;
        this.f33218j = f13;
        this.f33219k = z10;
        this.f33220l = pointF;
        this.f33221m = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.f33209a.hashCode() * 31) + this.f33210b.hashCode()) * 31)) + this.f33211c)) * 31) + this.f33212d.ordinal()) * 31) + this.f33213e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f33214f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f33216h;
    }

    public b() {
    }
}
