package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b$\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"LNn/H;", "Landroid/os/Parcelable;", "", "checkoutId", "LNn/E;", "psp", "apiUrl", "sessionId", "iopgId", "gatewayMerchantId", "<init>", "(Ljava/lang/String;LNn/E;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LNn/E;", "e", "()LNn/E;", "c", "d", "f", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f83959a;

    /* renamed from: b  reason: collision with root package name */
    private final E f83960b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83961c;

    /* renamed from: d  reason: collision with root package name */
    private final String f83962d;

    /* renamed from: e  reason: collision with root package name */
    private final String f83963e;

    /* renamed from: f  reason: collision with root package name */
    private final String f83964f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<H> {
        /* renamed from: a */
        public final H createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new H(parcel.readString(), E.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final H[] newArray(int i10) {
            return new H[i10];
        }
    }

    public H(String str, E e10, String str2, String str3, String str4, String str5) {
        C17542s.j(str, "checkoutId");
        C17542s.j(e10, "psp");
        C17542s.j(str2, "apiUrl");
        C17542s.j(str3, "sessionId");
        C17542s.j(str4, "iopgId");
        this.f83959a = str;
        this.f83960b = e10;
        this.f83961c = str2;
        this.f83962d = str3;
        this.f83963e = str4;
        this.f83964f = str5;
    }

    public final String a() {
        return this.f83961c;
    }

    public final String b() {
        return this.f83959a;
    }

    public final String c() {
        return this.f83964f;
    }

    public final String d() {
        return this.f83963e;
    }

    public final int describeContents() {
        return 0;
    }

    public final E e() {
        return this.f83960b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return C17542s.e(this.f83959a, h10.f83959a) && this.f83960b == h10.f83960b && C17542s.e(this.f83961c, h10.f83961c) && C17542s.e(this.f83962d, h10.f83962d) && C17542s.e(this.f83963e, h10.f83963e) && C17542s.e(this.f83964f, h10.f83964f);
    }

    public final String f() {
        return this.f83962d;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f83959a.hashCode() * 31) + this.f83960b.hashCode()) * 31) + this.f83961c.hashCode()) * 31) + this.f83962d.hashCode()) * 31) + this.f83963e.hashCode()) * 31;
        String str = this.f83964f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f83959a;
        E e10 = this.f83960b;
        String str2 = this.f83961c;
        String str3 = this.f83962d;
        String str4 = this.f83963e;
        String str5 = this.f83964f;
        return "PspSession(checkoutId=" + str + ", psp=" + e10 + ", apiUrl=" + str2 + ", sessionId=" + str3 + ", iopgId=" + str4 + ", gatewayMerchantId=" + str5 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f83959a);
        parcel.writeString(this.f83960b.name());
        parcel.writeString(this.f83961c);
        parcel.writeString(this.f83962d);
        parcel.writeString(this.f83963e);
        parcel.writeString(this.f83964f);
    }
}
