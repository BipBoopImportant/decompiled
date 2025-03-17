package c4;

import android.os.Parcel;
import android.os.Parcelable;
import nb.C10078h;
import q3.z;

/* renamed from: c4.a  reason: case insensitive filesystem */
public final class C7090a implements z.b {
    public static final Parcelable.Creator<C7090a> CREATOR = new C0793a();

    /* renamed from: a  reason: collision with root package name */
    public final long f45649a;

    /* renamed from: b  reason: collision with root package name */
    public final long f45650b;

    /* renamed from: c  reason: collision with root package name */
    public final long f45651c;

    /* renamed from: d  reason: collision with root package name */
    public final long f45652d;

    /* renamed from: e  reason: collision with root package name */
    public final long f45653e;

    /* renamed from: c4.a$a  reason: collision with other inner class name */
    class C0793a implements Parcelable.Creator<C7090a> {
        C0793a() {
        }

        /* renamed from: a */
        public C7090a createFromParcel(Parcel parcel) {
            return new C7090a(parcel, (C0793a) null);
        }

        /* renamed from: b */
        public C7090a[] newArray(int i10) {
            return new C7090a[i10];
        }
    }

    /* synthetic */ C7090a(Parcel parcel, C0793a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7090a.class != obj.getClass()) {
            return false;
        }
        C7090a aVar = (C7090a) obj;
        return this.f45649a == aVar.f45649a && this.f45650b == aVar.f45650b && this.f45651c == aVar.f45651c && this.f45652d == aVar.f45652d && this.f45653e == aVar.f45653e;
    }

    public int hashCode() {
        return ((((((((527 + C10078h.a(this.f45649a)) * 31) + C10078h.a(this.f45650b)) * 31) + C10078h.a(this.f45651c)) * 31) + C10078h.a(this.f45652d)) * 31) + C10078h.a(this.f45653e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f45649a + ", photoSize=" + this.f45650b + ", photoPresentationTimestampUs=" + this.f45651c + ", videoStartPosition=" + this.f45652d + ", videoSize=" + this.f45653e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f45649a);
        parcel.writeLong(this.f45650b);
        parcel.writeLong(this.f45651c);
        parcel.writeLong(this.f45652d);
        parcel.writeLong(this.f45653e);
    }

    public C7090a(long j10, long j11, long j12, long j13, long j14) {
        this.f45649a = j10;
        this.f45650b = j11;
        this.f45651c = j12;
        this.f45652d = j13;
        this.f45653e = j14;
    }

    private C7090a(Parcel parcel) {
        this.f45649a = parcel.readLong();
        this.f45650b = parcel.readLong();
        this.f45651c = parcel.readLong();
        this.f45652d = parcel.readLong();
        this.f45653e = parcel.readLong();
    }
}
