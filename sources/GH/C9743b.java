package gh;

import SC.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lgh/b;", "", "<init>", "()V", "b", "a", "Lgh/b$a;", "Lgh/b$b;", "giftcard-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gh.b  reason: case insensitive filesystem */
public abstract class C9743b {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgh/b$a;", "Lgh/b;", "", "buyGiftCardsLink", "displayButtonText", "LSC/N;", "buttonVariant", "<init>", "(Ljava/lang/String;Ljava/lang/String;LSC/N;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LSC/N;", "()LSC/N;", "giftcard-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gh.b$a */
    public static final class a extends C9743b {

        /* renamed from: a  reason: collision with root package name */
        private final String f73101a;

        /* renamed from: b  reason: collision with root package name */
        private final String f73102b;

        /* renamed from: c  reason: collision with root package name */
        private final N f73103c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, N n10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "buyGiftCardsLink");
            C17542s.j(n10, "buttonVariant");
            this.f73101a = str;
            this.f73102b = str2;
            this.f73103c = n10;
        }

        public final N a() {
            return this.f73103c;
        }

        public final String b() {
            return this.f73101a;
        }

        public final String c() {
            return this.f73102b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f73101a, aVar.f73101a) && C17542s.e(this.f73102b, aVar.f73102b) && this.f73103c == aVar.f73103c;
        }

        public int hashCode() {
            int hashCode = this.f73101a.hashCode() * 31;
            String str = this.f73102b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f73103c.hashCode();
        }

        public String toString() {
            String str = this.f73101a;
            String str2 = this.f73102b;
            N n10 = this.f73103c;
            return "Content(buyGiftCardsLink=" + str + ", displayButtonText=" + str2 + ", buttonVariant=" + n10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgh/b$b;", "Lgh/b;", "<init>", "()V", "giftcard-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gh.b$b  reason: collision with other inner class name */
    public static final class C1276b extends C9743b {

        /* renamed from: a  reason: collision with root package name */
        public static final C1276b f73104a = new C1276b();

        private C1276b() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C9743b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C9743b() {
    }
}
