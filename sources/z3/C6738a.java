package Z3;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import q3.A;
import q3.y;
import q3.z;
import t3.B;
import t3.N;

/* renamed from: Z3.a  reason: case insensitive filesystem */
public final class C6738a implements z.b {
    public static final Parcelable.Creator<C6738a> CREATOR = new C0723a();

    /* renamed from: a  reason: collision with root package name */
    public final int f41329a;

    /* renamed from: b  reason: collision with root package name */
    public final String f41330b;

    /* renamed from: c  reason: collision with root package name */
    public final String f41331c;

    /* renamed from: d  reason: collision with root package name */
    public final int f41332d;

    /* renamed from: e  reason: collision with root package name */
    public final int f41333e;

    /* renamed from: f  reason: collision with root package name */
    public final int f41334f;

    /* renamed from: g  reason: collision with root package name */
    public final int f41335g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f41336h;

    /* renamed from: Z3.a$a  reason: collision with other inner class name */
    class C0723a implements Parcelable.Creator<C6738a> {
        C0723a() {
        }

        /* renamed from: a */
        public C6738a createFromParcel(Parcel parcel) {
            return new C6738a(parcel);
        }

        /* renamed from: b */
        public C6738a[] newArray(int i10) {
            return new C6738a[i10];
        }
    }

    public C6738a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f41329a = i10;
        this.f41330b = str;
        this.f41331c = str2;
        this.f41332d = i11;
        this.f41333e = i12;
        this.f41334f = i13;
        this.f41335g = i14;
        this.f41336h = bArr;
    }

    public static C6738a a(B b10) {
        int q10 = b10.q();
        String r10 = A.r(b10.F(b10.q(), StandardCharsets.US_ASCII));
        String E10 = b10.E(b10.q());
        int q11 = b10.q();
        int q12 = b10.q();
        int q13 = b10.q();
        int q14 = b10.q();
        int q15 = b10.q();
        byte[] bArr = new byte[q15];
        b10.l(bArr, 0, q15);
        return new C6738a(q10, r10, E10, q11, q12, q13, q14, bArr);
    }

    public void c3(y.b bVar) {
        bVar.K(this.f41336h, this.f41329a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6738a.class != obj.getClass()) {
            return false;
        }
        C6738a aVar = (C6738a) obj;
        return this.f41329a == aVar.f41329a && this.f41330b.equals(aVar.f41330b) && this.f41331c.equals(aVar.f41331c) && this.f41332d == aVar.f41332d && this.f41333e == aVar.f41333e && this.f41334f == aVar.f41334f && this.f41335g == aVar.f41335g && Arrays.equals(this.f41336h, aVar.f41336h);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f41329a) * 31) + this.f41330b.hashCode()) * 31) + this.f41331c.hashCode()) * 31) + this.f41332d) * 31) + this.f41333e) * 31) + this.f41334f) * 31) + this.f41335g) * 31) + Arrays.hashCode(this.f41336h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f41330b + ", description=" + this.f41331c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f41329a);
        parcel.writeString(this.f41330b);
        parcel.writeString(this.f41331c);
        parcel.writeInt(this.f41332d);
        parcel.writeInt(this.f41333e);
        parcel.writeInt(this.f41334f);
        parcel.writeInt(this.f41335g);
        parcel.writeByteArray(this.f41336h);
    }

    C6738a(Parcel parcel) {
        this.f41329a = parcel.readInt();
        this.f41330b = (String) N.i(parcel.readString());
        this.f41331c = (String) N.i(parcel.readString());
        this.f41332d = parcel.readInt();
        this.f41333e = parcel.readInt();
        this.f41334f = parcel.readInt();
        this.f41335g = parcel.readInt();
        this.f41336h = (byte[]) N.i(parcel.createByteArray());
    }
}
