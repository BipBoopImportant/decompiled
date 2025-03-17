package Mn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"LMn/a;", "Landroid/os/Parcelable;", "", "productNumber", "", "quantity", "", "itemTotalPrice", "<init>", "(Ljava/lang/String;ID)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "D", "()D", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1672a();

    /* renamed from: a  reason: collision with root package name */
    private final String f83496a;

    /* renamed from: b  reason: collision with root package name */
    private final int f83497b;

    /* renamed from: c  reason: collision with root package name */
    private final double f83498c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mn.a$a  reason: collision with other inner class name */
    public static final class C1672a implements Parcelable.Creator<a> {
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new a(parcel.readString(), parcel.readInt(), parcel.readDouble());
        }

        /* renamed from: b */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, int i10, double d10) {
        C17542s.j(str, "productNumber");
        this.f83496a = str;
        this.f83497b = i10;
        this.f83498c = d10;
    }

    public final double a() {
        return this.f83498c;
    }

    public final String b() {
        return this.f83496a;
    }

    public final int c() {
        return this.f83497b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f83496a, aVar.f83496a) && this.f83497b == aVar.f83497b && Double.compare(this.f83498c, aVar.f83498c) == 0;
    }

    public int hashCode() {
        return (((this.f83496a.hashCode() * 31) + Integer.hashCode(this.f83497b)) * 31) + Double.hashCode(this.f83498c);
    }

    public String toString() {
        String str = this.f83496a;
        int i10 = this.f83497b;
        double d10 = this.f83498c;
        return "AnalyticsCartItem(productNumber=" + str + ", quantity=" + i10 + ", itemTotalPrice=" + d10 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f83496a);
        parcel.writeInt(this.f83497b);
        parcel.writeDouble(this.f83498c);
    }
}
