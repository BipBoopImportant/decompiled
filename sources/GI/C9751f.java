package gi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lgi/f;", "", "<init>", "()V", "a", "b", "Lgi/f$a;", "Lgi/f$b;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.f  reason: case insensitive filesystem */
public abstract class C9751f extends Throwable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, d2 = {"Lgi/f$a;", "Lgi/f;", "Llm/b;", "backInStockException", "Llm/a$c;", "fulfilmentOption", "", "productTitle", "<init>", "(Llm/b;Llm/a$c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llm/b;", "()Llm/b;", "b", "Llm/a$c;", "()Llm/a$c;", "c", "Ljava/lang/String;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.f$a */
    public static final class a extends C9751f {

        /* renamed from: a  reason: collision with root package name */
        private final lm.b f73417a;

        /* renamed from: b  reason: collision with root package name */
        private final C11550a.c f73418b;

        /* renamed from: c  reason: collision with root package name */
        private final String f73419c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(lm.b bVar, C11550a.c cVar, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "backInStockException");
            C17542s.j(cVar, "fulfilmentOption");
            C17542s.j(str, "productTitle");
            this.f73417a = bVar;
            this.f73418b = cVar;
            this.f73419c = str;
        }

        public final lm.b a() {
            return this.f73417a;
        }

        public final C11550a.c b() {
            return this.f73418b;
        }

        public final String c() {
            return this.f73419c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f73417a, aVar.f73417a) && C17542s.e(this.f73418b, aVar.f73418b) && C17542s.e(this.f73419c, aVar.f73419c);
        }

        public int hashCode() {
            return (((this.f73417a.hashCode() * 31) + this.f73418b.hashCode()) * 31) + this.f73419c.hashCode();
        }

        public String toString() {
            lm.b bVar = this.f73417a;
            C11550a.c cVar = this.f73418b;
            String str = this.f73419c;
            return "BackInStockServiceError(backInStockException=" + bVar + ", fulfilmentOption=" + cVar + ", productTitle=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgi/f$b;", "Lgi/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.f$b */
    public static final class b extends C9751f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f73420a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -168155488;
        }

        public String toString() {
            return "PushTokenError";
        }
    }

    public /* synthetic */ C9751f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C9751f() {
    }
}
