package uf;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001c"}, d2 = {"Luf/a;", "Landroid/os/Parcelable;", "", "cc", "lc", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uf.a  reason: case insensitive filesystem */
public final class C10271a implements Parcelable {
    public static final Parcelable.Creator<C10271a> CREATOR = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final C1420a f77012c = new C1420a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f77013a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77014b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luf/a$a;", "", "<init>", "()V", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uf.a$a  reason: collision with other inner class name */
    public static final class C1420a {
        public /* synthetic */ C1420a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1420a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uf.a$b */
    public static final class b implements Parcelable.Creator<C10271a> {
        /* renamed from: a */
        public final C10271a createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C10271a(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final C10271a[] newArray(int i10) {
            return new C10271a[i10];
        }
    }

    public C10271a(String str, String str2) {
        C17542s.j(str, "cc");
        C17542s.j(str2, "lc");
        this.f77013a = str;
        this.f77014b = str2;
    }

    public final String a() {
        return this.f77013a;
    }

    public final String b() {
        return this.f77014b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10271a)) {
            return false;
        }
        C10271a aVar = (C10271a) obj;
        return C17542s.e(this.f77013a, aVar.f77013a) && C17542s.e(this.f77014b, aVar.f77014b);
    }

    public int hashCode() {
        return (this.f77013a.hashCode() * 31) + this.f77014b.hashCode();
    }

    public String toString() {
        String str = this.f77013a;
        String str2 = this.f77014b;
        return "LanguageConfig(cc=" + str + ", lc=" + str2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f77013a);
        parcel.writeString(this.f77014b);
    }
}
