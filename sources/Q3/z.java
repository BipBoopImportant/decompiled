package q3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import nb.C10078h;
import q3.y;
import t3.N;

public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f28556a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28557b;

    class a implements Parcelable.Creator<z> {
        a() {
        }

        /* renamed from: a */
        public z createFromParcel(Parcel parcel) {
            return new z(parcel);
        }

        /* renamed from: b */
        public z[] newArray(int i10) {
            return new z[i10];
        }
    }

    public interface b extends Parcelable {
        void c3(y.b bVar) {
        }

        C5807s j0() {
            return null;
        }

        byte[] m3() {
            return null;
        }
    }

    public z(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public z a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new z(this.f28557b, (b[]) N.T0(this.f28556a, bVarArr));
    }

    public z b(z zVar) {
        return zVar == null ? this : a(zVar.f28556a);
    }

    public z c(long j10) {
        return this.f28557b == j10 ? this : new z(j10, this.f28556a);
    }

    public b d(int i10) {
        return this.f28556a[i10];
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f28556a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return Arrays.equals(this.f28556a, zVar.f28556a) && this.f28557b == zVar.f28557b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f28556a) * 31) + C10078h.a(this.f28557b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f28556a));
        if (this.f28557b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f28557b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28556a.length);
        for (b writeParcelable : this.f28556a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.f28557b);
    }

    public z(long j10, b... bVarArr) {
        this.f28557b = j10;
        this.f28556a = bVarArr;
    }

    public z(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public z(long j10, List<? extends b> list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    z(Parcel parcel) {
        this.f28556a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f28556a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f28557b = parcel.readLong();
                return;
            }
        }
    }
}
