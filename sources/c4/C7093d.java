package c4;

import android.os.Parcel;
import android.os.Parcelable;
import nb.C10073c;
import q3.z;

/* renamed from: c4.d  reason: case insensitive filesystem */
public final class C7093d implements z.b {
    public static final Parcelable.Creator<C7093d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f45659a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45660b;

    /* renamed from: c4.d$a */
    class a implements Parcelable.Creator<C7093d> {
        a() {
        }

        /* renamed from: a */
        public C7093d createFromParcel(Parcel parcel) {
            return new C7093d(parcel, (a) null);
        }

        /* renamed from: b */
        public C7093d[] newArray(int i10) {
            return new C7093d[i10];
        }
    }

    /* synthetic */ C7093d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7093d.class != obj.getClass()) {
            return false;
        }
        C7093d dVar = (C7093d) obj;
        return this.f45659a == dVar.f45659a && this.f45660b == dVar.f45660b;
    }

    public int hashCode() {
        return ((527 + C10073c.a(this.f45659a)) * 31) + this.f45660b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f45659a + ", svcTemporalLayerCount=" + this.f45660b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f45659a);
        parcel.writeInt(this.f45660b);
    }

    public C7093d(float f10, int i10) {
        this.f45659a = f10;
        this.f45660b = i10;
    }

    private C7093d(Parcel parcel) {
        this.f45659a = parcel.readFloat();
        this.f45660b = parcel.readInt();
    }
}
