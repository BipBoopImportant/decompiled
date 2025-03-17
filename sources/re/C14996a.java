package rE;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: rE.a  reason: case insensitive filesystem */
public final class C14996a extends C14997b {
    public static final Parcelable.Creator<C14996a> CREATOR = new C3230a();

    /* renamed from: d  reason: collision with root package name */
    public String f130647d;

    /* renamed from: e  reason: collision with root package name */
    public int f130648e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f130649f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int[] f130650g;

    /* renamed from: rE.a$a  reason: collision with other inner class name */
    public static class C3230a implements Parcelable.Creator<C14996a> {
        public Object createFromParcel(Parcel parcel) {
            return new C14996a(parcel);
        }

        public Object[] newArray(int i10) {
            return new C14996a[i10];
        }
    }

    public C14996a() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14996a.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C14996a aVar = (C14996a) obj;
        if (this.f130648e != aVar.f130648e || this.f130649f != aVar.f130649f) {
            return false;
        }
        String str = this.f130647d;
        if (str == null ? aVar.f130647d == null : str.equals(aVar.f130647d)) {
            return Arrays.equals(this.f130650g, aVar.f130650g);
        }
        return false;
    }

    public String g() {
        return this.f130647d;
    }

    public int getHeight() {
        return this.f130649f;
    }

    public int h() {
        return this.f130648e;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f130647d;
        return ((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f130648e) * 31) + this.f130649f) * 31) + Arrays.hashCode(this.f130650g);
    }

    public int[] i() {
        return this.f130650g;
    }

    public void j(String str) {
        C14997b.f(str);
        this.f130647d = str;
    }

    public void k(int i10) {
        e(i10);
        this.f130648e = i10;
    }

    public void l(int i10) {
        this.f130649f = i10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f130647d);
        parcel.writeInt(this.f130648e);
        parcel.writeInt(this.f130649f);
        parcel.writeIntArray(this.f130650g);
    }

    public C14996a(Parcel parcel) {
        super(parcel);
        this.f130647d = parcel.readString();
        this.f130648e = parcel.readInt();
        this.f130649f = parcel.readInt();
        this.f130650g = parcel.createIntArray();
    }
}
