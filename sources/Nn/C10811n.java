package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006 "}, d2 = {"LNn/n;", "Landroid/os/Parcelable;", "", "inclTax", "exclTax", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "isInclTax", "c", "(Ljava/lang/Boolean;)Ljava/lang/Double;", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.n  reason: case insensitive filesystem */
public final class C10811n implements Parcelable {
    public static final Parcelable.Creator<C10811n> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Double f84104a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f84105b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.n$a */
    public static final class a implements Parcelable.Creator<C10811n> {
        /* renamed from: a */
        public final C10811n createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            Double d10 = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                d10 = Double.valueOf(parcel.readDouble());
            }
            return new C10811n(valueOf, d10);
        }

        /* renamed from: b */
        public final C10811n[] newArray(int i10) {
            return new C10811n[i10];
        }
    }

    public C10811n(Double d10, Double d11) {
        this.f84104a = d10;
        this.f84105b = d11;
    }

    public final Double a() {
        return this.f84105b;
    }

    public final Double b() {
        return this.f84104a;
    }

    public final Double c(Boolean bool) {
        return C17542s.e(bool, Boolean.TRUE) ? this.f84104a : this.f84105b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10811n)) {
            return false;
        }
        C10811n nVar = (C10811n) obj;
        return C17542s.e(this.f84104a, nVar.f84104a) && C17542s.e(this.f84105b, nVar.f84105b);
    }

    public int hashCode() {
        Double d10 = this.f84104a;
        int i10 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f84105b;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Double d10 = this.f84104a;
        Double d11 = this.f84105b;
        return "DeliveryPriceHolder(inclTax=" + d10 + ", exclTax=" + d11 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        Double d10 = this.f84104a;
        if (d10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d10.doubleValue());
        }
        Double d11 = this.f84105b;
        if (d11 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d11.doubleValue());
    }
}
