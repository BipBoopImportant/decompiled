package Iz;

import Ae.l;
import XH.C16807N;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import x4.C8951o;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001:\u0001&J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\fJ-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH&¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJI\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b$\u0010%¨\u0006'"}, d2 = {"LIz/Y;", "", "Lx4/o;", "navController", "LAe/l;", "entryPoint", "LXH/N;", "h", "(Lx4/o;LAe/l;)V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "c", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function0;", "onDismiss", "j", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/a;)V", "i", "f", "", "barcode", "d", "(Lx4/o;Ljava/lang/String;)V", "deeplink", "e", "(Lx4/o;LAe/l;Ljava/lang/String;)V", "g", "(Lx4/o;)V", "title", "description", "badge", "buttonText", "imageUrl", "imageContentDescription", "b", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Y {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIz/Y$a;", "Landroid/os/Parcelable;", "b", "a", "LIz/Y$a$a;", "LIz/Y$a$b;", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a extends Parcelable {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LIz/Y$a$a;", "LIz/Y$a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iz.Y$a$a  reason: collision with other inner class name */
        public static final class C2681a implements a {
            public static final Parcelable.Creator<C2681a> CREATOR = new C2682a();

            /* renamed from: a  reason: collision with root package name */
            public static final C2681a f111000a = new C2681a();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Iz.Y$a$a$a  reason: collision with other inner class name */
            public static final class C2682a implements Parcelable.Creator<C2681a> {
                /* renamed from: a */
                public final C2681a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return C2681a.f111000a;
                }

                /* renamed from: b */
                public final C2681a[] newArray(int i10) {
                    return new C2681a[i10];
                }
            }

            private C2681a() {
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2681a);
            }

            public int hashCode() {
                return 80305911;
            }

            public String toString() {
                return "Dismissed";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"LIz/Y$a$b;", "LIz/Y$a;", "", "coupon", "scanType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getScanType", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {
            public static final Parcelable.Creator<b> CREATOR = new C2683a();

            /* renamed from: a  reason: collision with root package name */
            private final String f111001a;

            /* renamed from: b  reason: collision with root package name */
            private final String f111002b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Iz.Y$a$b$a  reason: collision with other inner class name */
            public static final class C2683a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new b(parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b(String str, String str2) {
                C17542s.j(str, "coupon");
                C17542s.j(str2, "scanType");
                this.f111001a = str;
                this.f111002b = str2;
            }

            public final String a() {
                return this.f111001a;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f111001a, bVar.f111001a) && C17542s.e(this.f111002b, bVar.f111002b);
            }

            public int hashCode() {
                return (this.f111001a.hashCode() * 31) + this.f111002b.hashCode();
            }

            public String toString() {
                String str = this.f111001a;
                String str2 = this.f111002b;
                return "Success(coupon=" + str + ", scanType=" + str2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f111001a);
                parcel.writeString(this.f111002b);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(Y y10, C8951o oVar, l lVar, String str, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str = null;
                }
                y10.e(oVar, lVar, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openScanner");
        }
    }

    void b(C8951o oVar, String str, String str2, String str3, String str4, String str5, String str6);

    void c(FragmentManager fragmentManager);

    void d(C8951o oVar, String str);

    void e(C8951o oVar, l lVar, String str);

    void f(FragmentManager fragmentManager, C5221y yVar, C17631a<C16807N> aVar);

    void g(C8951o oVar);

    void h(C8951o oVar, l lVar);

    void i(FragmentManager fragmentManager);

    void j(FragmentManager fragmentManager, C5221y yVar, C17631a<C16807N> aVar);
}
