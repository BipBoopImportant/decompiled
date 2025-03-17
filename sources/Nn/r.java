package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"LNn/r;", "Landroid/os/Parcelable;", "", "deliveryServiceId", "pickupPointId", "", "LNn/q;", "deliveryTimeWindows", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f84144a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84145b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C10814q> f84146c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        /* renamed from: a */
        public final r createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(C10814q.CREATOR.createFromParcel(parcel));
            }
            return new r(readString, readString2, arrayList);
        }

        /* renamed from: b */
        public final r[] newArray(int i10) {
            return new r[i10];
        }
    }

    public r(String str, String str2, List<C10814q> list) {
        C17542s.j(str, "deliveryServiceId");
        C17542s.j(list, "deliveryTimeWindows");
        this.f84144a = str;
        this.f84145b = str2;
        this.f84146c = list;
    }

    public final String a() {
        return this.f84144a;
    }

    public final List<C10814q> b() {
        return this.f84146c;
    }

    public final String c() {
        return this.f84145b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return C17542s.e(this.f84144a, rVar.f84144a) && C17542s.e(this.f84145b, rVar.f84145b) && C17542s.e(this.f84146c, rVar.f84146c);
    }

    public int hashCode() {
        int hashCode = this.f84144a.hashCode() * 31;
        String str = this.f84145b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f84146c.hashCode();
    }

    public String toString() {
        String str = this.f84144a;
        String str2 = this.f84145b;
        List<C10814q> list = this.f84146c;
        return "DeliveryTimeWindowsData(deliveryServiceId=" + str + ", pickupPointId=" + str2 + ", deliveryTimeWindows=" + list + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f84144a);
        parcel.writeString(this.f84145b);
        List<C10814q> list = this.f84146c;
        parcel.writeInt(list.size());
        for (C10814q writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
    }
}
