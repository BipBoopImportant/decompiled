package Le;

import com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H¦@¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LLe/b;", "", "LLe/b$a;", "params", "", "componentValue", "LXH/N;", "c", "(LLe/b$a;Ljava/lang/String;)V", "searchString", "countryCode", "", "LJe/b;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "address", "lookupKey", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "b", "(LJe/b;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LLe/b$a;", "", "", "isGooglePlaces", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f61620a;

        public a(boolean z10) {
            this.f61620a = z10;
        }

        public final boolean a() {
            return this.f61620a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f61620a == ((a) obj).f61620a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f61620a);
        }

        public String toString() {
            boolean z10 = this.f61620a;
            return "InitializeParams(isGooglePlaces=" + z10 + ")";
        }
    }

    Object a(String str, String str2, C17164e<? super List<? extends Je.b>> eVar);

    Object b(Je.b bVar, String str, C17164e<? super PostalCodeAddress> eVar);

    void c(a aVar, String str);
}
