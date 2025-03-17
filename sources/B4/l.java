package b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t3.N;

public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f45399b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45400c;

    /* renamed from: d  reason: collision with root package name */
    public final int f45401d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f45402e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f45403f;

    class a implements Parcelable.Creator<l> {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f45399b = i10;
        this.f45400c = i11;
        this.f45401d = i12;
        this.f45402e = iArr;
        this.f45403f = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f45399b == lVar.f45399b && this.f45400c == lVar.f45400c && this.f45401d == lVar.f45401d && Arrays.equals(this.f45402e, lVar.f45402e) && Arrays.equals(this.f45403f, lVar.f45403f);
    }

    public int hashCode() {
        return ((((((((527 + this.f45399b) * 31) + this.f45400c) * 31) + this.f45401d) * 31) + Arrays.hashCode(this.f45402e)) * 31) + Arrays.hashCode(this.f45403f);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45399b);
        parcel.writeInt(this.f45400c);
        parcel.writeInt(this.f45401d);
        parcel.writeIntArray(this.f45402e);
        parcel.writeIntArray(this.f45403f);
    }

    l(Parcel parcel) {
        super("MLLT");
        this.f45399b = parcel.readInt();
        this.f45400c = parcel.readInt();
        this.f45401d = parcel.readInt();
        this.f45402e = (int[]) N.i(parcel.createIntArray());
        this.f45403f = (int[]) N.i(parcel.createIntArray());
    }
}
