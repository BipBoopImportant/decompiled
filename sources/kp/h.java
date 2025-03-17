package kp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lkp/h;", "Landroid/os/Parcelable;", "", "totalPrice", "totalPriceExclTax", "totalTax", "subtotalPrice", "subtotalPriceExclTax", "subtotalTax", "<init>", "(DDDDDD)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "d", "()D", "b", "e", "c", "f", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final double f99057a;

    /* renamed from: b  reason: collision with root package name */
    private final double f99058b;

    /* renamed from: c  reason: collision with root package name */
    private final double f99059c;

    /* renamed from: d  reason: collision with root package name */
    private final double f99060d;

    /* renamed from: e  reason: collision with root package name */
    private final double f99061e;

    /* renamed from: f  reason: collision with root package name */
    private final double f99062f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        /* renamed from: a */
        public final h createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new h(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* renamed from: b */
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f99057a = d10;
        this.f99058b = d11;
        this.f99059c = d12;
        this.f99060d = d13;
        this.f99061e = d14;
        this.f99062f = d15;
    }

    public final double a() {
        return this.f99060d;
    }

    public final double b() {
        return this.f99061e;
    }

    public final double c() {
        return this.f99062f;
    }

    public final double d() {
        return this.f99057a;
    }

    public final int describeContents() {
        return 0;
    }

    public final double e() {
        return this.f99058b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Double.compare(this.f99057a, hVar.f99057a) == 0 && Double.compare(this.f99058b, hVar.f99058b) == 0 && Double.compare(this.f99059c, hVar.f99059c) == 0 && Double.compare(this.f99060d, hVar.f99060d) == 0 && Double.compare(this.f99061e, hVar.f99061e) == 0 && Double.compare(this.f99062f, hVar.f99062f) == 0;
    }

    public final double f() {
        return this.f99059c;
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.f99057a) * 31) + Double.hashCode(this.f99058b)) * 31) + Double.hashCode(this.f99059c)) * 31) + Double.hashCode(this.f99060d)) * 31) + Double.hashCode(this.f99061e)) * 31) + Double.hashCode(this.f99062f);
    }

    public String toString() {
        double d10 = this.f99057a;
        double d11 = this.f99058b;
        double d12 = this.f99059c;
        double d13 = this.f99060d;
        double d14 = this.f99061e;
        double d15 = this.f99062f;
        return "ReceiptPrice(totalPrice=" + d10 + ", totalPriceExclTax=" + d11 + ", totalTax=" + d12 + ", subtotalPrice=" + d13 + ", subtotalPriceExclTax=" + d14 + ", subtotalTax=" + d15 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeDouble(this.f99057a);
        parcel.writeDouble(this.f99058b);
        parcel.writeDouble(this.f99059c);
        parcel.writeDouble(this.f99060d);
        parcel.writeDouble(this.f99061e);
        parcel.writeDouble(this.f99062f);
    }
}
