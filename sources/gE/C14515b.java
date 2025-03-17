package gE;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LgE/b;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "a", "LgE/b$a;", "LgE/b$b;", "zipselector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gE.b  reason: case insensitive filesystem */
public abstract class C14515b implements Parcelable {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LgE/b$a;", "LgE/b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zipselector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gE.b$a */
    public static final class a extends C14515b {
        public static final Parcelable.Creator<a> CREATOR = new C3120a();

        /* renamed from: a  reason: collision with root package name */
        public static final a f127306a = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gE.b$a$a  reason: collision with other inner class name */
        public static final class C3120a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return a.f127306a;
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001e"}, d2 = {"LgE/b$b;", "LgE/b;", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "", "interactionValue", "<init>", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "b", "()Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "Ljava/lang/String;", "zipselector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gE.b$b  reason: collision with other inner class name */
    public static final class C3121b extends C14515b {
        public static final Parcelable.Creator<C3121b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final UserPostalCodeAddress f127307a;

        /* renamed from: b  reason: collision with root package name */
        private final String f127308b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gE.b$b$a */
        public static final class a implements Parcelable.Creator<C3121b> {
            /* renamed from: a */
            public final C3121b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new C3121b((UserPostalCodeAddress) parcel.readParcelable(C3121b.class.getClassLoader()), parcel.readString());
            }

            /* renamed from: b */
            public final C3121b[] newArray(int i10) {
                return new C3121b[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3121b(UserPostalCodeAddress userPostalCodeAddress, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(userPostalCodeAddress, "postalCodeAddress");
            this.f127307a = userPostalCodeAddress;
            this.f127308b = str;
        }

        public final String a() {
            return this.f127308b;
        }

        public final UserPostalCodeAddress b() {
            return this.f127307a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3121b)) {
                return false;
            }
            C3121b bVar = (C3121b) obj;
            return C17542s.e(this.f127307a, bVar.f127307a) && C17542s.e(this.f127308b, bVar.f127308b);
        }

        public int hashCode() {
            int hashCode = this.f127307a.hashCode() * 31;
            String str = this.f127308b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            UserPostalCodeAddress userPostalCodeAddress = this.f127307a;
            String str = this.f127308b;
            return "Value(postalCodeAddress=" + userPostalCodeAddress + ", interactionValue=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeParcelable(this.f127307a, i10);
            parcel.writeString(this.f127308b);
        }
    }

    public /* synthetic */ C14515b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C14515b() {
    }
}
