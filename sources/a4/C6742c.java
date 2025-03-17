package a4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import q3.y;
import q3.z;
import t3.C5950a;

/* renamed from: a4.c  reason: case insensitive filesystem */
public final class C6742c implements z.b {
    public static final Parcelable.Creator<C6742c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f41436a;

    /* renamed from: b  reason: collision with root package name */
    public final String f41437b;

    /* renamed from: c  reason: collision with root package name */
    public final String f41438c;

    /* renamed from: a4.c$a */
    class a implements Parcelable.Creator<C6742c> {
        a() {
        }

        /* renamed from: a */
        public C6742c createFromParcel(Parcel parcel) {
            return new C6742c(parcel);
        }

        /* renamed from: b */
        public C6742c[] newArray(int i10) {
            return new C6742c[i10];
        }
    }

    public C6742c(byte[] bArr, String str, String str2) {
        this.f41436a = bArr;
        this.f41437b = str;
        this.f41438c = str2;
    }

    public void c3(y.b bVar) {
        String str = this.f41437b;
        if (str != null) {
            bVar.p0(str);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6742c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f41436a, ((C6742c) obj).f41436a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f41436a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f41437b, this.f41438c, Integer.valueOf(this.f41436a.length)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f41436a);
        parcel.writeString(this.f41437b);
        parcel.writeString(this.f41438c);
    }

    C6742c(Parcel parcel) {
        this.f41436a = (byte[]) C5950a.e(parcel.createByteArray());
        this.f41437b = parcel.readString();
        this.f41438c = parcel.readString();
    }
}
