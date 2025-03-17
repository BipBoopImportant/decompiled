package Pe;

import Oe.l;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.RectangularBounds;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J@\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LPe/d;", "", "", "componentValue", "LXH/N;", "a", "(Ljava/lang/String;)V", "text", "", "locationRestriction", "Lcom/google/android/libraries/places/api/model/RectangularBounds;", "bounds", "countryCode", "", "LPe/d$a;", "c", "(Ljava/lang/String;ZLcom/google/android/libraries/places/api/model/RectangularBounds;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LOe/a;", "addressAndPlaceId", "LOe/l;", "b", "(LOe/a;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LPe/d$a;", "", "", "address", "subAddress", "placeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f62745a;

        /* renamed from: b  reason: collision with root package name */
        private final String f62746b;

        /* renamed from: c  reason: collision with root package name */
        private final String f62747c;

        public a(String str, String str2, String str3) {
            C17542s.j(str, PlaceTypes.ADDRESS);
            C17542s.j(str2, "subAddress");
            C17542s.j(str3, "placeId");
            this.f62745a = str;
            this.f62746b = str2;
            this.f62747c = str3;
        }

        public final String a() {
            return this.f62745a;
        }

        public final String b() {
            return this.f62747c;
        }

        public final String c() {
            return this.f62746b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f62745a, aVar.f62745a) && C17542s.e(this.f62746b, aVar.f62746b) && C17542s.e(this.f62747c, aVar.f62747c);
        }

        public int hashCode() {
            return (((this.f62745a.hashCode() * 31) + this.f62746b.hashCode()) * 31) + this.f62747c.hashCode();
        }

        public String toString() {
            String str = this.f62745a;
            String str2 = this.f62746b;
            String str3 = this.f62747c;
            return "AutocompletePrediction(address=" + str + ", subAddress=" + str2 + ", placeId=" + str3 + ")";
        }
    }

    void a(String str);

    Object b(Oe.a aVar, String str, C17164e<? super l> eVar);

    Object c(String str, boolean z10, RectangularBounds rectangularBounds, String str2, String str3, C17164e<? super List<a>> eVar);
}
