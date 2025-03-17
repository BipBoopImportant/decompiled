package Je;

import com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LJe/b;", "", "<init>", "()V", "a", "b", "LJe/b$a;", "LJe/b$b;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LJe/b$a;", "LJe/b;", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "postalCodeAddress", "<init>", "(Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "()Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final PostalCodeAddress f61259a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(PostalCodeAddress postalCodeAddress) {
            super((DefaultConstructorMarker) null);
            C17542s.j(postalCodeAddress, "postalCodeAddress");
            this.f61259a = postalCodeAddress;
        }

        public final PostalCodeAddress a() {
            return this.f61259a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f61259a, ((a) obj).f61259a);
        }

        public int hashCode() {
            return this.f61259a.hashCode();
        }

        public String toString() {
            PostalCodeAddress postalCodeAddress = this.f61259a;
            return "AddressLookupModel(postalCodeAddress=" + postalCodeAddress + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"LJe/b$b;", "LJe/b;", "", "placeId", "addressName", "subAddressName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Je.b$b  reason: collision with other inner class name */
    public static final class C1013b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final String f61260a;

        /* renamed from: b  reason: collision with root package name */
        private final String f61261b;

        /* renamed from: c  reason: collision with root package name */
        private final String f61262c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1013b(String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "placeId");
            C17542s.j(str2, "addressName");
            C17542s.j(str3, "subAddressName");
            this.f61260a = str;
            this.f61261b = str2;
            this.f61262c = str3;
        }

        public final String a() {
            return this.f61261b;
        }

        public final String b() {
            return this.f61260a;
        }

        public final String c() {
            return this.f61262c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1013b)) {
                return false;
            }
            C1013b bVar = (C1013b) obj;
            return C17542s.e(this.f61260a, bVar.f61260a) && C17542s.e(this.f61261b, bVar.f61261b) && C17542s.e(this.f61262c, bVar.f61262c);
        }

        public int hashCode() {
            return (((this.f61260a.hashCode() * 31) + this.f61261b.hashCode()) * 31) + this.f61262c.hashCode();
        }

        public String toString() {
            String str = this.f61260a;
            String str2 = this.f61261b;
            String str3 = this.f61262c;
            return "PlacesAddressModel(placeId=" + str + ", addressName=" + str2 + ", subAddressName=" + str3 + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
