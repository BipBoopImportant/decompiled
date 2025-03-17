package rE;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rE.d  reason: case insensitive filesystem */
public final class C14999d extends C14997b {
    public static final Parcelable.Creator<C14999d> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public String f130666d;

    /* renamed from: e  reason: collision with root package name */
    public int f130667e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f130668f = -1;

    /* renamed from: rE.d$a */
    public static class a implements Parcelable.Creator<C14999d> {
        public Object createFromParcel(Parcel parcel) {
            return new C14999d(parcel);
        }

        public Object[] newArray(int i10) {
            return new C14999d[i10];
        }
    }

    public C14999d() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14999d.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C14999d dVar = (C14999d) obj;
        if (this.f130667e != dVar.f130667e || this.f130668f != dVar.f130668f) {
            return false;
        }
        String str = this.f130666d;
        String str2 = dVar.f130666d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public String g() {
        return this.f130666d;
    }

    public int h() {
        return this.f130667e;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f130666d;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f130667e) * 31) + this.f130668f;
    }

    public int i() {
        return this.f130668f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f130666d);
        parcel.writeInt(this.f130667e);
        parcel.writeInt(this.f130668f);
    }

    public C14999d(Parcel parcel) {
        super(parcel);
        this.f130666d = parcel.readString();
        this.f130667e = parcel.readInt();
        this.f130668f = parcel.readInt();
    }
}
