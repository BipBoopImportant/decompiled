package gy;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgy/a;", "", "Lx4/o;", "navController", "LXH/N;", "b", "(Lx4/o;)V", "Lx4/C;", "navOptions", "a", "(Lx4/o;Lx4/C;)V", "", "c", "()Ljava/lang/String;", "regionsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gy.a  reason: case insensitive filesystem */
public interface C14522a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lgy/a$a;", "Landroid/os/Parcelable;", "b", "a", "Lgy/a$a$a;", "Lgy/a$a$b;", "regionsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gy.a$a  reason: collision with other inner class name */
    public interface C3128a extends Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgy/a$a$a;", "Lgy/a$a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "regionsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gy.a$a$a  reason: collision with other inner class name */
        public static final class C3129a implements C3128a, Parcelable {
            public static final Parcelable.Creator<C3129a> CREATOR = new C3130a();

            /* renamed from: a  reason: collision with root package name */
            public static final C3129a f127376a = new C3129a();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: gy.a$a$a$a  reason: collision with other inner class name */
            public static final class C3130a implements Parcelable.Creator<C3129a> {
                /* renamed from: a */
                public final C3129a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return C3129a.f127376a;
                }

                /* renamed from: b */
                public final C3129a[] newArray(int i10) {
                    return new C3129a[i10];
                }
            }

            private C3129a() {
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C3129a);
            }

            public int hashCode() {
                return 614678393;
            }

            public String toString() {
                return "Cancelled";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgy/a$a$b;", "Lgy/a$a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "regionsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gy.a$a$b */
        public static final class b implements C3128a, Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new C3131a();

            /* renamed from: a  reason: collision with root package name */
            public static final b f127377a = new b();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: gy.a$a$b$a  reason: collision with other inner class name */
            public static final class C3131a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return b.f127377a;
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            private b() {
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1703919659;
            }

            public String toString() {
                return "Success";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }
    }

    void a(C8951o oVar, C c10);

    void b(C8951o oVar);

    String c();
}
