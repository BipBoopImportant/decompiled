package b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t3.N;

public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f45377b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f45378c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f45379d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f45380e;

    /* renamed from: f  reason: collision with root package name */
    private final i[] f45381f;

    class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f45377b = str;
        this.f45378c = z10;
        this.f45379d = z11;
        this.f45380e = strArr;
        this.f45381f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f45378c == dVar.f45378c && this.f45379d == dVar.f45379d && N.d(this.f45377b, dVar.f45377b) && Arrays.equals(this.f45380e, dVar.f45380e) && Arrays.equals(this.f45381f, dVar.f45381f);
    }

    public int hashCode() {
        int i10 = (((true + (this.f45378c ? 1 : 0)) * 31) + (this.f45379d ? 1 : 0)) * 31;
        String str = this.f45377b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45377b);
        parcel.writeByte(this.f45378c ? (byte) 1 : 0);
        parcel.writeByte(this.f45379d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f45380e);
        parcel.writeInt(this.f45381f.length);
        for (i writeParcelable : this.f45381f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f45377b = (String) N.i(parcel.readString());
        boolean z10 = true;
        this.f45378c = parcel.readByte() != 0;
        this.f45379d = parcel.readByte() == 0 ? false : z10;
        this.f45380e = (String[]) N.i(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f45381f = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f45381f[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
