package b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t3.N;

public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f45371b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45372c;

    /* renamed from: d  reason: collision with root package name */
    public final int f45373d;

    /* renamed from: e  reason: collision with root package name */
    public final long f45374e;

    /* renamed from: f  reason: collision with root package name */
    public final long f45375f;

    /* renamed from: g  reason: collision with root package name */
    private final i[] f45376g;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f45371b = str;
        this.f45372c = i10;
        this.f45373d = i11;
        this.f45374e = j10;
        this.f45375f = j11;
        this.f45376g = iVarArr;
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
        return this.f45372c == cVar.f45372c && this.f45373d == cVar.f45373d && this.f45374e == cVar.f45374e && this.f45375f == cVar.f45375f && N.d(this.f45371b, cVar.f45371b) && Arrays.equals(this.f45376g, cVar.f45376g);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f45372c) * 31) + this.f45373d) * 31) + ((int) this.f45374e)) * 31) + ((int) this.f45375f)) * 31;
        String str = this.f45371b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45371b);
        parcel.writeInt(this.f45372c);
        parcel.writeInt(this.f45373d);
        parcel.writeLong(this.f45374e);
        parcel.writeLong(this.f45375f);
        parcel.writeInt(this.f45376g.length);
        for (i writeParcelable : this.f45376g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f45371b = (String) N.i(parcel.readString());
        this.f45372c = parcel.readInt();
        this.f45373d = parcel.readInt();
        this.f45374e = parcel.readLong();
        this.f45375f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f45376g = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f45376g[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
