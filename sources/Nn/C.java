package Nn;

import YH.C16877v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b'\u0010*R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b+\u0010&¨\u0006,"}, d2 = {"LNn/C;", "Landroid/os/Parcelable;", "", "orderNumber", "", "LNn/D;", "paymentOptions", "paymentContextId", "", "amountLeftToPay", "LNn/F;", "transactions", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DLjava/util/List;)LNn/C;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "e", "D", "()D", "g", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C implements Parcelable {
    public static final Parcelable.Creator<C> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f83836a;

    /* renamed from: b  reason: collision with root package name */
    private final List<D> f83837b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83838c;

    /* renamed from: d  reason: collision with root package name */
    private final double f83839d;

    /* renamed from: e  reason: collision with root package name */
    private final List<F> f83840e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<C> {
        /* renamed from: a */
        public final C createFromParcel(Parcel parcel) {
            Class<C> cls;
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (true) {
                cls = C.class;
                if (i10 == readInt) {
                    break;
                }
                arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                i10++;
            }
            String readString2 = parcel.readString();
            double readDouble = parcel.readDouble();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(parcel.readParcelable(cls.getClassLoader()));
            }
            return new C(readString, arrayList, readString2, readDouble, arrayList2);
        }

        /* renamed from: b */
        public final C[] newArray(int i10) {
            return new C[i10];
        }
    }

    public C(String str, List<? extends D> list, String str2, double d10, List<? extends F> list2) {
        C17542s.j(list, "paymentOptions");
        C17542s.j(str2, "paymentContextId");
        C17542s.j(list2, "transactions");
        this.f83836a = str;
        this.f83837b = list;
        this.f83838c = str2;
        this.f83839d = d10;
        this.f83840e = list2;
    }

    public static /* synthetic */ C b(C c10, String str, List<D> list, String str2, double d10, List<F> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c10.f83836a;
        }
        if ((i10 & 2) != 0) {
            list = c10.f83837b;
        }
        List<D> list3 = list;
        if ((i10 & 4) != 0) {
            str2 = c10.f83838c;
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            d10 = c10.f83839d;
        }
        double d11 = d10;
        if ((i10 & 16) != 0) {
            list2 = c10.f83840e;
        }
        return c10.a(str, list3, str3, d11, list2);
    }

    public final C a(String str, List<? extends D> list, String str2, double d10, List<? extends F> list2) {
        C17542s.j(list, "paymentOptions");
        C17542s.j(str2, "paymentContextId");
        C17542s.j(list2, "transactions");
        return new C(str, list, str2, d10, list2);
    }

    public final double c() {
        return this.f83839d;
    }

    public final String d() {
        return this.f83836a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f83838c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return C17542s.e(this.f83836a, c10.f83836a) && C17542s.e(this.f83837b, c10.f83837b) && C17542s.e(this.f83838c, c10.f83838c) && Double.compare(this.f83839d, c10.f83839d) == 0 && C17542s.e(this.f83840e, c10.f83840e);
    }

    public final List<D> f() {
        return this.f83837b;
    }

    public final List<F> g() {
        return this.f83840e;
    }

    public int hashCode() {
        String str = this.f83836a;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.f83837b.hashCode()) * 31) + this.f83838c.hashCode()) * 31) + Double.hashCode(this.f83839d)) * 31) + this.f83840e.hashCode();
    }

    public String toString() {
        String str = this.f83836a;
        List<D> list = this.f83837b;
        String str2 = this.f83838c;
        double d10 = this.f83839d;
        List<F> list2 = this.f83840e;
        return "PaymentHolder(orderNumber=" + str + ", paymentOptions=" + list + ", paymentContextId=" + str2 + ", amountLeftToPay=" + d10 + ", transactions=" + list2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f83836a);
        List<D> list = this.f83837b;
        parcel.writeInt(list.size());
        for (D writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i10);
        }
        parcel.writeString(this.f83838c);
        parcel.writeDouble(this.f83839d);
        List<F> list2 = this.f83840e;
        parcel.writeInt(list2.size());
        for (F writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i10);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(String str, List list, String str2, double d10, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2, d10, (i10 & 16) != 0 ? C16877v.n() : list2);
    }
}
