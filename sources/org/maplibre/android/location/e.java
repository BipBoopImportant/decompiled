package org.maplibre.android.location;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: O  reason: collision with root package name */
    private static final int[] f145587O = {0, 0, 0, 0};

    /* renamed from: A  reason: collision with root package name */
    private float f145588A;

    /* renamed from: B  reason: collision with root package name */
    private float f145589B;

    /* renamed from: C  reason: collision with root package name */
    private RectF f145590C;

    /* renamed from: D  reason: collision with root package name */
    private String f145591D;

    /* renamed from: E  reason: collision with root package name */
    private String f145592E;

    /* renamed from: F  reason: collision with root package name */
    private float f145593F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f145594G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f145595H;

    /* renamed from: I  reason: collision with root package name */
    private Boolean f145596I;

    /* renamed from: J  reason: collision with root package name */
    private Boolean f145597J;

    /* renamed from: K  reason: collision with root package name */
    private Integer f145598K;

    /* renamed from: L  reason: collision with root package name */
    private float f145599L;

    /* renamed from: M  reason: collision with root package name */
    private float f145600M;

    /* renamed from: N  reason: collision with root package name */
    private float f145601N;

    /* renamed from: a  reason: collision with root package name */
    private float f145602a;

    /* renamed from: b  reason: collision with root package name */
    private int f145603b;

    /* renamed from: c  reason: collision with root package name */
    private int f145604c;

    /* renamed from: d  reason: collision with root package name */
    private String f145605d;

    /* renamed from: e  reason: collision with root package name */
    private int f145606e;

    /* renamed from: f  reason: collision with root package name */
    private String f145607f;

    /* renamed from: g  reason: collision with root package name */
    private int f145608g;

    /* renamed from: h  reason: collision with root package name */
    private String f145609h;

    /* renamed from: i  reason: collision with root package name */
    private int f145610i;

    /* renamed from: j  reason: collision with root package name */
    private String f145611j;

    /* renamed from: k  reason: collision with root package name */
    private int f145612k;

    /* renamed from: l  reason: collision with root package name */
    private String f145613l;

    /* renamed from: m  reason: collision with root package name */
    private int f145614m;

    /* renamed from: n  reason: collision with root package name */
    private String f145615n;

    /* renamed from: o  reason: collision with root package name */
    private Integer f145616o;

    /* renamed from: p  reason: collision with root package name */
    private Integer f145617p;

    /* renamed from: q  reason: collision with root package name */
    private Integer f145618q;

    /* renamed from: r  reason: collision with root package name */
    private Integer f145619r;

    /* renamed from: s  reason: collision with root package name */
    private Integer f145620s;

    /* renamed from: t  reason: collision with root package name */
    private float f145621t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f145622u;

    /* renamed from: v  reason: collision with root package name */
    private long f145623v;

    /* renamed from: w  reason: collision with root package name */
    private int[] f145624w;

    /* renamed from: x  reason: collision with root package name */
    private float f145625x;

    /* renamed from: y  reason: collision with root package name */
    private float f145626y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f145627z;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    protected e(Parcel parcel) {
        this.f145602a = parcel.readFloat();
        this.f145603b = parcel.readInt();
        this.f145604c = parcel.readInt();
        this.f145605d = parcel.readString();
        this.f145606e = parcel.readInt();
        this.f145607f = parcel.readString();
        this.f145608g = parcel.readInt();
        this.f145609h = parcel.readString();
        this.f145610i = parcel.readInt();
        this.f145611j = parcel.readString();
        this.f145612k = parcel.readInt();
        this.f145613l = parcel.readString();
        this.f145614m = parcel.readInt();
        this.f145615n = parcel.readString();
        Class<Integer> cls = Integer.class;
        this.f145616o = (Integer) parcel.readValue(cls.getClassLoader());
        this.f145617p = (Integer) parcel.readValue(cls.getClassLoader());
        this.f145618q = (Integer) parcel.readValue(cls.getClassLoader());
        this.f145619r = (Integer) parcel.readValue(cls.getClassLoader());
        this.f145620s = (Integer) parcel.readValue(cls.getClassLoader());
        this.f145621t = parcel.readFloat();
        boolean z10 = false;
        this.f145622u = parcel.readByte() != 0;
        this.f145623v = parcel.readLong();
        this.f145624w = parcel.createIntArray();
        this.f145625x = parcel.readFloat();
        this.f145626y = parcel.readFloat();
        this.f145627z = parcel.readByte() != 0;
        this.f145588A = parcel.readFloat();
        this.f145589B = parcel.readFloat();
        this.f145590C = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
        this.f145591D = parcel.readString();
        this.f145592E = parcel.readString();
        this.f145593F = parcel.readFloat();
        this.f145594G = parcel.readByte() != 0;
        this.f145595H = parcel.readByte() != 0 ? true : z10;
        Class<Boolean> cls2 = Boolean.class;
        this.f145596I = (Boolean) parcel.readValue(cls2.getClassLoader());
        this.f145597J = (Boolean) parcel.readValue(cls2.getClassLoader());
        this.f145598K = (Integer) parcel.readValue(cls.getClassLoader());
        this.f145599L = parcel.readFloat();
        this.f145600M = parcel.readFloat();
        this.f145601N = parcel.readFloat();
    }

    public boolean a() {
        return this.f145622u;
    }

    public Integer b() {
        return this.f145598K;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (Float.compare(eVar.f145602a, this.f145602a) != 0 || this.f145603b != eVar.f145603b || this.f145604c != eVar.f145604c || this.f145606e != eVar.f145606e || this.f145608g != eVar.f145608g || this.f145610i != eVar.f145610i || this.f145612k != eVar.f145612k || this.f145614m != eVar.f145614m || Float.compare(eVar.f145621t, this.f145621t) != 0 || this.f145622u != eVar.f145622u || this.f145623v != eVar.f145623v || Float.compare(eVar.f145625x, this.f145625x) != 0 || Float.compare(eVar.f145626y, this.f145626y) != 0 || this.f145627z != eVar.f145627z || Float.compare(eVar.f145588A, this.f145588A) != 0 || Float.compare(eVar.f145589B, this.f145589B) != 0 || Float.compare(eVar.f145593F, this.f145593F) != 0) {
            return false;
        }
        RectF rectF = this.f145590C;
        if (rectF == null ? eVar.f145590C != null : !rectF.equals(eVar.f145590C)) {
            return false;
        }
        if (this.f145594G != eVar.f145594G || this.f145595H != eVar.f145595H) {
            return false;
        }
        String str = this.f145605d;
        if (str == null ? eVar.f145605d != null : !str.equals(eVar.f145605d)) {
            return false;
        }
        String str2 = this.f145607f;
        if (str2 == null ? eVar.f145607f != null : !str2.equals(eVar.f145607f)) {
            return false;
        }
        String str3 = this.f145609h;
        if (str3 == null ? eVar.f145609h != null : !str3.equals(eVar.f145609h)) {
            return false;
        }
        String str4 = this.f145611j;
        if (str4 == null ? eVar.f145611j != null : !str4.equals(eVar.f145611j)) {
            return false;
        }
        String str5 = this.f145613l;
        if (str5 == null ? eVar.f145613l != null : !str5.equals(eVar.f145613l)) {
            return false;
        }
        String str6 = this.f145615n;
        if (str6 == null ? eVar.f145615n != null : !str6.equals(eVar.f145615n)) {
            return false;
        }
        Integer num = this.f145616o;
        if (num == null ? eVar.f145616o != null : !num.equals(eVar.f145616o)) {
            return false;
        }
        Integer num2 = this.f145617p;
        if (num2 == null ? eVar.f145617p != null : !num2.equals(eVar.f145617p)) {
            return false;
        }
        Integer num3 = this.f145618q;
        if (num3 == null ? eVar.f145618q != null : !num3.equals(eVar.f145618q)) {
            return false;
        }
        Integer num4 = this.f145619r;
        if (num4 == null ? eVar.f145619r != null : !num4.equals(eVar.f145619r)) {
            return false;
        }
        Integer num5 = this.f145620s;
        if (num5 == null ? eVar.f145620s != null : !num5.equals(eVar.f145620s)) {
            return false;
        }
        if (!Arrays.equals(this.f145624w, eVar.f145624w)) {
            return false;
        }
        String str7 = this.f145591D;
        if (str7 == null ? eVar.f145591D != null : !str7.equals(eVar.f145591D)) {
            return false;
        }
        if (this.f145596I != eVar.f145596I || this.f145597J != eVar.f145597J) {
            return false;
        }
        Integer num6 = this.f145598K;
        if (num6 == null ? eVar.b() != null : !num6.equals(eVar.f145598K)) {
            return false;
        }
        if (Float.compare(eVar.f145599L, this.f145599L) != 0 || Float.compare(eVar.f145600M, this.f145600M) != 0 || Float.compare(eVar.f145601N, this.f145601N) != 0) {
            return false;
        }
        String str8 = this.f145592E;
        String str9 = eVar.f145592E;
        return str8 != null ? str8.equals(str9) : str9 == null;
    }

    public int hashCode() {
        float f10 = this.f145602a;
        int i10 = 0;
        int floatToIntBits = (((((f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31) + this.f145603b) * 31) + this.f145604c) * 31;
        String str = this.f145605d;
        int hashCode = (((floatToIntBits + (str != null ? str.hashCode() : 0)) * 31) + this.f145606e) * 31;
        String str2 = this.f145607f;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f145608g) * 31;
        String str3 = this.f145609h;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f145610i) * 31;
        String str4 = this.f145611j;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f145612k) * 31;
        String str5 = this.f145613l;
        int hashCode5 = (((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f145614m) * 31;
        String str6 = this.f145615n;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.f145616o;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f145617p;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f145618q;
        int hashCode9 = (hashCode8 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f145619r;
        int hashCode10 = (hashCode9 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.f145620s;
        int hashCode11 = (hashCode10 + (num5 != null ? num5.hashCode() : 0)) * 31;
        float f11 = this.f145621t;
        int floatToIntBits2 = f11 != 0.0f ? Float.floatToIntBits(f11) : 0;
        long j10 = this.f145623v;
        int hashCode12 = (((((((hashCode11 + floatToIntBits2) * 31) + (this.f145622u ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f145624w)) * 31;
        float f12 = this.f145625x;
        int floatToIntBits3 = (hashCode12 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
        float f13 = this.f145626y;
        int floatToIntBits4 = (((floatToIntBits3 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31) + (this.f145627z ? 1 : 0)) * 31;
        float f14 = this.f145588A;
        int floatToIntBits5 = (floatToIntBits4 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
        float f15 = this.f145589B;
        int floatToIntBits6 = (floatToIntBits5 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
        RectF rectF = this.f145590C;
        int hashCode13 = (floatToIntBits6 + (rectF != null ? rectF.hashCode() : 0)) * 31;
        String str7 = this.f145591D;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f145592E;
        int hashCode15 = (hashCode14 + (str8 != null ? str8.hashCode() : 0)) * 31;
        float f16 = this.f145593F;
        int floatToIntBits7 = (((((((((hashCode15 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31) + (this.f145594G ? 1 : 0)) * 31) + (this.f145595H ? 1 : 0)) * 31) + (this.f145596I.booleanValue() ? 1 : 0)) * 31) + (this.f145597J.booleanValue() ? 1 : 0)) * 31;
        Integer num6 = this.f145598K;
        int hashCode16 = (floatToIntBits7 + (num6 != null ? num6.hashCode() : 0)) * 31;
        float f17 = this.f145599L;
        int floatToIntBits8 = (hashCode16 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0)) * 31;
        float f18 = this.f145600M;
        int floatToIntBits9 = (floatToIntBits8 + (f18 != 0.0f ? Float.floatToIntBits(f18) : 0)) * 31;
        float f19 = this.f145601N;
        if (f19 != 0.0f) {
            i10 = Float.floatToIntBits(f19);
        }
        return floatToIntBits9 + i10;
    }

    public String toString() {
        return "LocationComponentOptions{accuracyAlpha=" + this.f145602a + ", accuracyColor=" + this.f145603b + ", backgroundDrawableStale=" + this.f145604c + ", backgroundStaleName=" + this.f145605d + ", foregroundDrawableStale=" + this.f145606e + ", foregroundStaleName=" + this.f145607f + ", gpsDrawable=" + this.f145608g + ", gpsName=" + this.f145609h + ", foregroundDrawable=" + this.f145610i + ", foregroundName=" + this.f145611j + ", backgroundDrawable=" + this.f145612k + ", backgroundName=" + this.f145613l + ", bearingDrawable=" + this.f145614m + ", bearingName=" + this.f145615n + ", bearingTintColor=" + this.f145616o + ", foregroundTintColor=" + this.f145617p + ", backgroundTintColor=" + this.f145618q + ", foregroundStaleTintColor=" + this.f145619r + ", backgroundStaleTintColor=" + this.f145620s + ", elevation=" + this.f145621t + ", enableStaleState=" + this.f145622u + ", staleStateTimeout=" + this.f145623v + ", padding=" + Arrays.toString(this.f145624w) + ", maxZoomIconScale=" + this.f145625x + ", minZoomIconScale=" + this.f145626y + ", trackingGesturesManagement=" + this.f145627z + ", trackingInitialMoveThreshold=" + this.f145588A + ", trackingMultiFingerMoveThreshold=" + this.f145589B + ", trackingMultiFingerProtectedMoveArea=" + this.f145590C + ", layerAbove=" + this.f145591D + "layerBelow=" + this.f145592E + "trackingAnimationDurationMultiplier=" + this.f145593F + "pulseEnabled=" + this.f145596I + "pulseFadeEnabled=" + this.f145597J + "pulseColor=" + this.f145598K + "pulseSingleDuration=" + this.f145599L + "pulseMaxRadius=" + this.f145600M + "pulseAlpha=" + this.f145601N + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f145602a);
        parcel.writeInt(this.f145603b);
        parcel.writeInt(this.f145604c);
        parcel.writeString(this.f145605d);
        parcel.writeInt(this.f145606e);
        parcel.writeString(this.f145607f);
        parcel.writeInt(this.f145608g);
        parcel.writeString(this.f145609h);
        parcel.writeInt(this.f145610i);
        parcel.writeString(this.f145611j);
        parcel.writeInt(this.f145612k);
        parcel.writeString(this.f145613l);
        parcel.writeInt(this.f145614m);
        parcel.writeString(this.f145615n);
        parcel.writeValue(this.f145616o);
        parcel.writeValue(this.f145617p);
        parcel.writeValue(this.f145618q);
        parcel.writeValue(this.f145619r);
        parcel.writeValue(this.f145620s);
        parcel.writeFloat(this.f145621t);
        parcel.writeByte(this.f145622u ? (byte) 1 : 0);
        parcel.writeLong(this.f145623v);
        parcel.writeIntArray(this.f145624w);
        parcel.writeFloat(this.f145625x);
        parcel.writeFloat(this.f145626y);
        parcel.writeByte(this.f145627z ? (byte) 1 : 0);
        parcel.writeFloat(this.f145588A);
        parcel.writeFloat(this.f145589B);
        parcel.writeParcelable(this.f145590C, i10);
        parcel.writeString(this.f145591D);
        parcel.writeString(this.f145592E);
        parcel.writeFloat(this.f145593F);
        parcel.writeByte(this.f145594G ? (byte) 1 : 0);
        parcel.writeByte(this.f145595H ? (byte) 1 : 0);
        parcel.writeValue(this.f145596I);
        parcel.writeValue(this.f145597J);
        parcel.writeValue(this.f145598K);
        parcel.writeFloat(this.f145599L);
        parcel.writeFloat(this.f145600M);
        parcel.writeFloat(this.f145601N);
    }
}
