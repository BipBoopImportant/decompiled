package Rd;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rw.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\u0007J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\bJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0017H&¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"LRd/a;", "", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "LXH/N;", "b", "(Lx4/o;Lx4/C;)V", "c", "Landroid/app/Activity;", "activity", "d", "(Landroid/app/Activity;)V", "e", "f", "(Lx4/o;)V", "g", "i", "", "success", "a", "(Lx4/o;Z)V", "", "addressId", "isDeletable", "k", "(Lx4/o;Ljava/lang/String;Z)V", "addressType", "j", "(Lx4/o;Ljava/lang/String;)V", "h", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rd.a$a  reason: collision with other inner class name */
    public static final class C1079a {
        public static /* synthetic */ void a(a aVar, C8951o oVar, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    c10 = c.f28698a.d().a();
                }
                aVar.h(oVar, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: editProfile");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LRd/a$b;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "a", "c", "LRd/a$b$a;", "LRd/a$b$b;", "LRd/a$b$c;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b implements Parcelable {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LRd/a$b$a;", "LRd/a$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rd.a$b$a  reason: collision with other inner class name */
        public static final class C1080a extends b {
            public static final Parcelable.Creator<C1080a> CREATOR = new C1081a();

            /* renamed from: a  reason: collision with root package name */
            public static final C1080a f63189a = new C1080a();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Rd.a$b$a$a  reason: collision with other inner class name */
            public static final class C1081a implements Parcelable.Creator<C1080a> {
                /* renamed from: a */
                public final C1080a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return C1080a.f63189a;
                }

                /* renamed from: b */
                public final C1080a[] newArray(int i10) {
                    return new C1080a[i10];
                }
            }

            private C1080a() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1080a);
            }

            public int hashCode() {
                return -778106053;
            }

            public String toString() {
                return "Cancelled";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LRd/a$b$b;", "LRd/a$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rd.a$b$b  reason: collision with other inner class name */
        public static final class C1082b extends b {
            public static final Parcelable.Creator<C1082b> CREATOR = new C1083a();

            /* renamed from: a  reason: collision with root package name */
            public static final C1082b f63190a = new C1082b();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Rd.a$b$b$a  reason: collision with other inner class name */
            public static final class C1083a implements Parcelable.Creator<C1082b> {
                /* renamed from: a */
                public final C1082b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return C1082b.f63190a;
                }

                /* renamed from: b */
                public final C1082b[] newArray(int i10) {
                    return new C1082b[i10];
                }
            }

            private C1082b() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1082b);
            }

            public int hashCode() {
                return -80767891;
            }

            public String toString() {
                return "Success";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LRd/a$b$c;", "LRd/a$b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {
            public static final Parcelable.Creator<c> CREATOR = new C1084a();

            /* renamed from: a  reason: collision with root package name */
            public static final c f63191a = new c();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Rd.a$b$c$a  reason: collision with other inner class name */
            public static final class C1084a implements Parcelable.Creator<c> {
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return c.f63191a;
                }

                /* renamed from: b */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1501561012;
            }

            public String toString() {
                return "Unknown";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    void a(C8951o oVar, boolean z10);

    void b(C8951o oVar, C c10);

    void c(C8951o oVar, C c10);

    void d(Activity activity);

    void e(Activity activity);

    void f(C8951o oVar);

    void g(C8951o oVar, C c10);

    void h(C8951o oVar, C c10);

    void i(C8951o oVar, C c10);

    void j(C8951o oVar, String str);

    void k(C8951o oVar, String str, boolean z10);
}
