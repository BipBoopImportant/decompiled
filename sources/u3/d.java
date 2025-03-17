package u3;

import android.os.Parcel;
import android.os.Parcelable;
import nb.C10078h;
import q3.z;

public final class d implements z.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f30073a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30074b;

    /* renamed from: c  reason: collision with root package name */
    public final long f30075c;

    class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f30073a == dVar.f30073a && this.f30074b == dVar.f30074b && this.f30075c == dVar.f30075c;
    }

    public int hashCode() {
        return ((((527 + C10078h.a(this.f30073a)) * 31) + C10078h.a(this.f30074b)) * 31) + C10078h.a(this.f30075c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f30073a + ", modification time=" + this.f30074b + ", timescale=" + this.f30075c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f30073a);
        parcel.writeLong(this.f30074b);
        parcel.writeLong(this.f30075c);
    }

    public d(long j10, long j11, long j12) {
        this.f30073a = j10;
        this.f30074b = j11;
        this.f30075c = j12;
    }

    private d(Parcel parcel) {
        this.f30073a = parcel.readLong();
        this.f30074b = parcel.readLong();
        this.f30075c = parcel.readLong();
    }
}
