package u3;

import android.os.Parcel;
import android.os.Parcelable;
import nb.C10073c;
import q3.z;
import t3.C5950a;

public final class c implements z.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f30071a;

    /* renamed from: b  reason: collision with root package name */
    public final float f30072b;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f30071a == cVar.f30071a && this.f30072b == cVar.f30072b;
    }

    public int hashCode() {
        return ((527 + C10073c.a(this.f30071a)) * 31) + C10073c.a(this.f30072b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f30071a + ", longitude=" + this.f30072b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f30071a);
        parcel.writeFloat(this.f30072b);
    }

    public c(float f10, float f11) {
        C5950a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f30071a = f10;
        this.f30072b = f11;
    }

    private c(Parcel parcel) {
        this.f30071a = parcel.readFloat();
        this.f30072b = parcel.readFloat();
    }
}
