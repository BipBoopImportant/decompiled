package X3;

import android.os.Parcel;
import android.os.Parcelable;
import q3.z;
import t3.C5950a;

/* renamed from: X3.a  reason: case insensitive filesystem */
public final class C6714a implements z.b {
    public static final Parcelable.Creator<C6714a> CREATOR = new C0674a();

    /* renamed from: a  reason: collision with root package name */
    public final int f40638a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40639b;

    /* renamed from: X3.a$a  reason: collision with other inner class name */
    class C0674a implements Parcelable.Creator<C6714a> {
        C0674a() {
        }

        /* renamed from: a */
        public C6714a createFromParcel(Parcel parcel) {
            return new C6714a(parcel.readInt(), (String) C5950a.e(parcel.readString()));
        }

        /* renamed from: b */
        public C6714a[] newArray(int i10) {
            return new C6714a[i10];
        }
    }

    public C6714a(int i10, String str) {
        this.f40638a = i10;
        this.f40639b = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f40638a + ",url=" + this.f40639b + ")";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f40639b);
        parcel.writeInt(this.f40638a);
    }
}
