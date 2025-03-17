package kp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013¨\u0006 "}, d2 = {"Lkp/e;", "Landroid/os/Parcelable;", "", "amount", "", "couponCode", "description", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Ljava/lang/String;", "c", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kp.e  reason: case insensitive filesystem */
public final class C11523e implements Parcelable {
    public static final Parcelable.Creator<C11523e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final double f99051a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99052b;

    /* renamed from: c  reason: collision with root package name */
    private final String f99053c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kp.e$a */
    public static final class a implements Parcelable.Creator<C11523e> {
        /* renamed from: a */
        public final C11523e createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C11523e(parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final C11523e[] newArray(int i10) {
            return new C11523e[i10];
        }
    }

    public C11523e(double d10, String str, String str2) {
        this.f99051a = d10;
        this.f99052b = str;
        this.f99053c = str2;
    }

    public final double a() {
        return this.f99051a;
    }

    public final String b() {
        return this.f99052b;
    }

    public final String c() {
        return this.f99053c;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11523e)) {
            return false;
        }
        C11523e eVar = (C11523e) obj;
        return Double.compare(this.f99051a, eVar.f99051a) == 0 && C17542s.e(this.f99052b, eVar.f99052b) && C17542s.e(this.f99053c, eVar.f99053c);
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.f99051a) * 31;
        String str = this.f99052b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99053c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        double d10 = this.f99051a;
        String str = this.f99052b;
        String str2 = this.f99053c;
        return "DiscountSummary(amount=" + d10 + ", couponCode=" + str + ", description=" + str2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeDouble(this.f99051a);
        parcel.writeString(this.f99052b);
        parcel.writeString(this.f99053c);
    }
}
