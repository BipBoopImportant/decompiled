package b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import q3.y;
import t3.N;

/* renamed from: b4.a  reason: case insensitive filesystem */
public final class C7057a extends i {
    public static final Parcelable.Creator<C7057a> CREATOR = new C0783a();

    /* renamed from: b  reason: collision with root package name */
    public final String f45366b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45367c;

    /* renamed from: d  reason: collision with root package name */
    public final int f45368d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f45369e;

    /* renamed from: b4.a$a  reason: collision with other inner class name */
    class C0783a implements Parcelable.Creator<C7057a> {
        C0783a() {
        }

        /* renamed from: a */
        public C7057a createFromParcel(Parcel parcel) {
            return new C7057a(parcel);
        }

        /* renamed from: b */
        public C7057a[] newArray(int i10) {
            return new C7057a[i10];
        }
    }

    public C7057a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f45366b = str;
        this.f45367c = str2;
        this.f45368d = i10;
        this.f45369e = bArr;
    }

    public void c3(y.b bVar) {
        bVar.K(this.f45369e, this.f45368d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7057a.class != obj.getClass()) {
            return false;
        }
        C7057a aVar = (C7057a) obj;
        return this.f45368d == aVar.f45368d && N.d(this.f45366b, aVar.f45366b) && N.d(this.f45367c, aVar.f45367c) && Arrays.equals(this.f45369e, aVar.f45369e);
    }

    public int hashCode() {
        int i10 = (527 + this.f45368d) * 31;
        String str = this.f45366b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45367c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((hashCode + i11) * 31) + Arrays.hashCode(this.f45369e);
    }

    public String toString() {
        return this.f45394a + ": mimeType=" + this.f45366b + ", description=" + this.f45367c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45366b);
        parcel.writeString(this.f45367c);
        parcel.writeInt(this.f45368d);
        parcel.writeByteArray(this.f45369e);
    }

    C7057a(Parcel parcel) {
        super("APIC");
        this.f45366b = (String) N.i(parcel.readString());
        this.f45367c = parcel.readString();
        this.f45368d = parcel.readInt();
        this.f45369e = (byte[]) N.i(parcel.createByteArray());
    }
}
