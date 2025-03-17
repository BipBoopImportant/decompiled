package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b \u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b$\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b(\u0010.¨\u0006/"}, d2 = {"LNn/M;", "Landroid/os/Parcelable;", "Ljava/util/Date;", "fromDateTime", "toDateTime", "", "id", "", "LNn/c;", "capabilities", "LNn/n;", "deliveryPrice", "", "hasPriceDeviation", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;LNn/n;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "c", "()Ljava/util/Date;", "b", "f", "Ljava/lang/String;", "e", "d", "Ljava/util/List;", "()Ljava/util/List;", "LNn/n;", "()LNn/n;", "Z", "()Z", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Date f83998a;

    /* renamed from: b  reason: collision with root package name */
    private final Date f83999b;

    /* renamed from: c  reason: collision with root package name */
    private final String f84000c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C10800c> f84001d;

    /* renamed from: e  reason: collision with root package name */
    private final C10811n f84002e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f84003f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<M> {
        /* renamed from: a */
        public final M createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(C10800c.CREATOR.createFromParcel(parcel));
            }
            return new M(date, date2, readString, arrayList, parcel.readInt() == 0 ? null : C10811n.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final M[] newArray(int i10) {
            return new M[i10];
        }
    }

    public M(Date date, Date date2, String str, List<C10800c> list, C10811n nVar, boolean z10) {
        C17542s.j(date, "fromDateTime");
        C17542s.j(date2, "toDateTime");
        C17542s.j(str, "id");
        C17542s.j(list, "capabilities");
        this.f83998a = date;
        this.f83999b = date2;
        this.f84000c = str;
        this.f84001d = list;
        this.f84002e = nVar;
        this.f84003f = z10;
    }

    public final List<C10800c> a() {
        return this.f84001d;
    }

    public final C10811n b() {
        return this.f84002e;
    }

    public final Date c() {
        return this.f83998a;
    }

    public final boolean d() {
        return this.f84003f;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f84000c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return C17542s.e(this.f83998a, m10.f83998a) && C17542s.e(this.f83999b, m10.f83999b) && C17542s.e(this.f84000c, m10.f84000c) && C17542s.e(this.f84001d, m10.f84001d) && C17542s.e(this.f84002e, m10.f84002e) && this.f84003f == m10.f84003f;
    }

    public final Date f() {
        return this.f83999b;
    }

    public int hashCode() {
        int hashCode = ((((((this.f83998a.hashCode() * 31) + this.f83999b.hashCode()) * 31) + this.f84000c.hashCode()) * 31) + this.f84001d.hashCode()) * 31;
        C10811n nVar = this.f84002e;
        return ((hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + Boolean.hashCode(this.f84003f);
    }

    public String toString() {
        Date date = this.f83998a;
        Date date2 = this.f83999b;
        String str = this.f84000c;
        List<C10800c> list = this.f84001d;
        C10811n nVar = this.f84002e;
        boolean z10 = this.f84003f;
        return "TimeSlotHolder(fromDateTime=" + date + ", toDateTime=" + date2 + ", id=" + str + ", capabilities=" + list + ", deliveryPrice=" + nVar + ", hasPriceDeviation=" + z10 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeSerializable(this.f83998a);
        parcel.writeSerializable(this.f83999b);
        parcel.writeString(this.f84000c);
        List<C10800c> list = this.f84001d;
        parcel.writeInt(list.size());
        for (C10800c writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        C10811n nVar = this.f84002e;
        if (nVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nVar.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f84003f ? 1 : 0);
    }
}
