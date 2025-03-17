package qE;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qE.m  reason: case insensitive filesystem */
public class C14953m implements Parcelable {
    public static final Parcelable.Creator<C14953m> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public String f130475a;

    /* renamed from: b  reason: collision with root package name */
    public String f130476b;

    /* renamed from: c  reason: collision with root package name */
    public a f130477c;

    /* renamed from: qE.m$a */
    public enum a {
        LOW,
        MEDIUM,
        HIGH
    }

    /* renamed from: qE.m$b */
    public static class b implements Parcelable.Creator<C14953m> {
        public Object createFromParcel(Parcel parcel) {
            return new C14953m(parcel);
        }

        public Object[] newArray(int i10) {
            return new C14953m[i10];
        }
    }

    public C14953m() {
        this.f130475a = "";
        this.f130476b = "";
        this.f130477c = a.HIGH;
    }

    public String a() {
        return this.f130475a;
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
        C14953m mVar = (C14953m) obj;
        if (this.f130475a.equals(mVar.f130475a) && this.f130476b.equals(mVar.f130476b)) {
            return this.f130477c == mVar.f130477c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f130475a.hashCode() * 31) + this.f130476b.hashCode()) * 31) + this.f130477c.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f130475a);
        parcel.writeString(this.f130476b);
        parcel.writeInt(this.f130477c.ordinal());
    }

    public C14953m(String str, String str2, a aVar) {
        this.f130475a = "";
        this.f130476b = "";
        a aVar2 = a.LOW;
        this.f130475a = str;
        this.f130476b = str2;
        this.f130477c = aVar;
    }

    public C14953m(Parcel parcel) {
        this.f130475a = "";
        this.f130476b = "";
        this.f130477c = a.HIGH;
        this.f130475a = parcel.readString();
        this.f130476b = parcel.readString();
        this.f130477c = a.values()[parcel.readInt()];
    }
}
