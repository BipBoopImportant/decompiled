package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001d"}, d2 = {"LNn/a;", "Landroid/os/Parcelable;", "", "body", "title", "entryPointText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.a  reason: case insensitive filesystem */
public final class C10798a implements Parcelable {
    public static final Parcelable.Creator<C10798a> CREATOR = new C1696a();

    /* renamed from: a  reason: collision with root package name */
    private final String f84016a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84017b;

    /* renamed from: c  reason: collision with root package name */
    private final String f84018c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.a$a  reason: collision with other inner class name */
    public static final class C1696a implements Parcelable.Creator<C10798a> {
        /* renamed from: a */
        public final C10798a createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C10798a(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final C10798a[] newArray(int i10) {
            return new C10798a[i10];
        }
    }

    public C10798a(String str, String str2, String str3) {
        C17542s.j(str, "body");
        C17542s.j(str2, "title");
        C17542s.j(str3, "entryPointText");
        this.f84016a = str;
        this.f84017b = str2;
        this.f84018c = str3;
    }

    public final String a() {
        return this.f84016a;
    }

    public final String b() {
        return this.f84018c;
    }

    public final String c() {
        return this.f84017b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10798a)) {
            return false;
        }
        C10798a aVar = (C10798a) obj;
        return C17542s.e(this.f84016a, aVar.f84016a) && C17542s.e(this.f84017b, aVar.f84017b) && C17542s.e(this.f84018c, aVar.f84018c);
    }

    public int hashCode() {
        return (((this.f84016a.hashCode() * 31) + this.f84017b.hashCode()) * 31) + this.f84018c.hashCode();
    }

    public String toString() {
        String str = this.f84016a;
        String str2 = this.f84017b;
        String str3 = this.f84018c;
        return "AdditionalInformation(body=" + str + ", title=" + str2 + ", entryPointText=" + str3 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f84016a);
        parcel.writeString(this.f84017b);
        parcel.writeString(this.f84018c);
    }
}
