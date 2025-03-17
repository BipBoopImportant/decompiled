package rE;

import android.os.Parcel;
import android.os.Parcelable;
import nts.C3727;
import tE.C15072a;

/* renamed from: rE.b  reason: case insensitive filesystem */
public class C14997b implements Parcelable {
    public static final Parcelable.Creator<C14997b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f130651a;

    /* renamed from: b  reason: collision with root package name */
    public String f130652b;

    /* renamed from: c  reason: collision with root package name */
    public int f130653c = 0;

    /* renamed from: rE.b$a */
    public static class a implements Parcelable.Creator<C14997b> {
        public Object createFromParcel(Parcel parcel) {
            return new C14997b(parcel);
        }

        public Object[] newArray(int i10) {
            return new C14997b[i10];
        }
    }

    public C14997b() {
    }

    public static void f(String str) {
        if (str == null || str.isEmpty() || str.charAt(0) != '#') {
            throw new C15072a(C3727.m1052("\u00035;#4p>'.(06,{8 d)#&!7+;)a(\u001e\u0010\b\u001f[\u0015\f\u0005\u0003T\u001b\u001d\u0007P\u0013\u000bO\t\u0000\u001a\u001f\u0011G1\u0007\t\u0011\u0006B\b\u0013O\u0000\u0002\u0018K\u000bI\u001e\u0016\u001a\u001c\u0010S\u001a\u0014\b_\u001d\u0012\u0010\u0014\bY\u001b(\" j", 51, 36, 112), (Throwable) null);
        }
    }

    public String a() {
        return this.f130652b;
    }

    public String b() {
        return this.f130651a;
    }

    public int c() {
        return this.f130653c;
    }

    public void d(String str) {
        this.f130652b = str;
    }

    public int describeContents() {
        return 0;
    }

    public void e(int i10) {
        if (i10 < 0) {
            throw new C15072a(C3727.m1052("\u00035;#4p>'.(06,{8 d)#&!7+;)a(\u001e\u0010\b\u001f[\u0015\f\u0005\u0003T\u001b\u001d\u0007P\u0013\u000bO\t\u0000\u001a\u001f\u0011G1\u0007\t\u0011\u0006B\b\u0013O\u0000\u0002\u0018K\u000bI\u001e\u0016\u001a\u001c\u0010S\u001a\u0014\b_\u001d\u0012\u0010\u0014\bY\u001b(\" j", 0, 27, 78), (Throwable) null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C14997b bVar = (C14997b) obj;
        if (this.f130653c != bVar.f130653c) {
            return false;
        }
        String str = this.f130651a;
        if (str == null ? bVar.f130651a != null : !str.equals(bVar.f130651a)) {
            return false;
        }
        String str2 = this.f130652b;
        String str3 = bVar.f130652b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f130651a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f130652b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + this.f130653c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f130651a);
        parcel.writeString(this.f130652b);
        parcel.writeInt(this.f130653c);
    }

    public C14997b(Parcel parcel) {
        this.f130651a = parcel.readString();
        this.f130652b = parcel.readString();
        this.f130653c = parcel.readInt();
    }
}
