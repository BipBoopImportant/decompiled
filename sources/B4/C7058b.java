package b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t3.N;

/* renamed from: b4.b  reason: case insensitive filesystem */
public final class C7058b extends i {
    public static final Parcelable.Creator<C7058b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f45370b;

    /* renamed from: b4.b$a */
    class a implements Parcelable.Creator<C7058b> {
        a() {
        }

        /* renamed from: a */
        public C7058b createFromParcel(Parcel parcel) {
            return new C7058b(parcel);
        }

        /* renamed from: b */
        public C7058b[] newArray(int i10) {
            return new C7058b[i10];
        }
    }

    public C7058b(String str, byte[] bArr) {
        super(str);
        this.f45370b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7058b.class != obj.getClass()) {
            return false;
        }
        C7058b bVar = (C7058b) obj;
        return this.f45394a.equals(bVar.f45394a) && Arrays.equals(this.f45370b, bVar.f45370b);
    }

    public int hashCode() {
        return ((527 + this.f45394a.hashCode()) * 31) + Arrays.hashCode(this.f45370b);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45394a);
        parcel.writeByteArray(this.f45370b);
    }

    C7058b(Parcel parcel) {
        super((String) N.i(parcel.readString()));
        this.f45370b = (byte[]) N.i(parcel.createByteArray());
    }
}
