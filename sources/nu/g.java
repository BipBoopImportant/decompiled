package nu;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnu/g;", "", "", "storeId", "Lnu/g$a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnu/g$a;", "", "", "storeId", "storeName", "", "scanAndGoContainsItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f100320a;

        /* renamed from: b  reason: collision with root package name */
        private final String f100321b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f100322c;

        public a(String str, String str2, boolean z10) {
            C17542s.j(str, "storeId");
            C17542s.j(str2, "storeName");
            this.f100320a = str;
            this.f100321b = str2;
            this.f100322c = z10;
        }

        public final boolean a() {
            return this.f100322c;
        }

        public final String b() {
            return this.f100320a;
        }

        public final String c() {
            return this.f100321b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f100320a, aVar.f100320a) && C17542s.e(this.f100321b, aVar.f100321b) && this.f100322c == aVar.f100322c;
        }

        public int hashCode() {
            return (((this.f100320a.hashCode() * 31) + this.f100321b.hashCode()) * 31) + Boolean.hashCode(this.f100322c);
        }

        public String toString() {
            String str = this.f100320a;
            String str2 = this.f100321b;
            boolean z10 = this.f100322c;
            return "StoreAndScanAndGoResult(storeId=" + str + ", storeName=" + str2 + ", scanAndGoContainsItems=" + z10 + ")";
        }
    }

    Object a(String str, C17164e<? super a> eVar);
}
