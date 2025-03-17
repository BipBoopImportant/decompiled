package kp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001e"}, d2 = {"Lkp/k;", "Landroid/os/Parcelable;", "", "taxValue", "", "taxType", "<init>", "(DLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Ljava/lang/String;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final double f99071a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99072b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        /* renamed from: a */
        public final k createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new k(parcel.readDouble(), parcel.readString());
        }

        /* renamed from: b */
        public final k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(double d10, String str) {
        C17542s.j(str, "taxType");
        this.f99071a = d10;
        this.f99072b = str;
    }

    public final String a() {
        return this.f99072b;
    }

    public final double b() {
        return this.f99071a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Double.compare(this.f99071a, kVar.f99071a) == 0 && C17542s.e(this.f99072b, kVar.f99072b);
    }

    public int hashCode() {
        return (Double.hashCode(this.f99071a) * 31) + this.f99072b.hashCode();
    }

    public String toString() {
        double d10 = this.f99071a;
        String str = this.f99072b;
        return "SalesTax(taxValue=" + d10 + ", taxType=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeDouble(this.f99071a);
        parcel.writeString(this.f99072b);
    }
}
