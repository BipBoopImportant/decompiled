package MB;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.store.datalayer.StorageType;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rw.c;
import x4.C;
import x4.C8951o;
import x4.y;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0012JI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LMB/a;", "", "Lx4/o;", "navController", "Lcom/ingka/ikea/store/datalayer/StorageType;", "storage", "", "itemNo", "", "forScanAndGo", "requestKey", "Lx4/C;", "navOptions", "LXH/N;", "a", "(Lx4/o;Lcom/ingka/ikea/store/datalayer/StorageType;Ljava/lang/String;ZLjava/lang/String;Lx4/C;)V", "Lx4/y;", "navGraphBuilder", "b", "(Lx4/y;)V", "storepicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: MB.a  reason: case insensitive filesystem */
public interface C13194a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MB.a$a  reason: collision with other inner class name */
    public static final class C2742a {
        public static /* synthetic */ void a(C13194a aVar, C8951o oVar, StorageType storageType, String str, boolean z10, String str2, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str = null;
                }
                String str3 = str;
                if ((i10 & 8) != 0) {
                    z10 = false;
                }
                boolean z11 = z10;
                if ((i10 & 16) != 0) {
                    str2 = "StorePickerFragment.Result.Key";
                }
                String str4 = str2;
                if ((i10 & 32) != 0) {
                    c10 = c.f28698a.d().a();
                }
                aVar.a(oVar, storageType, str3, z11, str4, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openStorePicker");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LMB/a$b;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "LMB/a$b$a;", "storepicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MB.a$b */
    public static abstract class b implements Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014¨\u0006!"}, d2 = {"LMB/a$b$a;", "LMB/a$b;", "", "storeId", "storeName", "", "isShopAndGoEnabled", "buCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "d", "()Z", "storepicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: MB.a$b$a  reason: collision with other inner class name */
        public static final class C2743a extends b {
            public static final Parcelable.Creator<C2743a> CREATOR = new C2744a();

            /* renamed from: a  reason: collision with root package name */
            private final String f111979a;

            /* renamed from: b  reason: collision with root package name */
            private final String f111980b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f111981c;

            /* renamed from: d  reason: collision with root package name */
            private final String f111982d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: MB.a$b$a$a  reason: collision with other inner class name */
            public static final class C2744a implements Parcelable.Creator<C2743a> {
                /* renamed from: a */
                public final C2743a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new C2743a(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                }

                /* renamed from: b */
                public final C2743a[] newArray(int i10) {
                    return new C2743a[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2743a(String str, String str2, boolean z10, String str3) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "storeId");
                C17542s.j(str2, "storeName");
                C17542s.j(str3, "buCode");
                this.f111979a = str;
                this.f111980b = str2;
                this.f111981c = z10;
                this.f111982d = str3;
            }

            public final String a() {
                return this.f111982d;
            }

            public final String b() {
                return this.f111979a;
            }

            public final String c() {
                return this.f111980b;
            }

            public final boolean d() {
                return this.f111981c;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2743a)) {
                    return false;
                }
                C2743a aVar = (C2743a) obj;
                return C17542s.e(this.f111979a, aVar.f111979a) && C17542s.e(this.f111980b, aVar.f111980b) && this.f111981c == aVar.f111981c && C17542s.e(this.f111982d, aVar.f111982d);
            }

            public int hashCode() {
                return (((((this.f111979a.hashCode() * 31) + this.f111980b.hashCode()) * 31) + Boolean.hashCode(this.f111981c)) * 31) + this.f111982d.hashCode();
            }

            public String toString() {
                String str = this.f111979a;
                String str2 = this.f111980b;
                boolean z10 = this.f111981c;
                String str3 = this.f111982d;
                return "Success(storeId=" + str + ", storeName=" + str2 + ", isShopAndGoEnabled=" + z10 + ", buCode=" + str3 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f111979a);
                parcel.writeString(this.f111980b);
                parcel.writeInt(this.f111981c ? 1 : 0);
                parcel.writeString(this.f111982d);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    void a(C8951o oVar, StorageType storageType, String str, boolean z10, String str2, C c10);

    void b(y yVar);
}
