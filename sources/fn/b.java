package Fn;

import Fn.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LFn/b;", "", "<init>", "()V", "b", "a", "LFn/b$a;", "LFn/b$b;", "caas_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001c\u0010$R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\u0019\u0010$¨\u0006&"}, d2 = {"LFn/b$a;", "LFn/b;", "", "id", "LFn/i;", "userContext", "LFn/h;", "totalPrice", "", "LFn/a$a;", "items", "LFn/c;", "discountCodes", "<init>", "(Ljava/lang/String;LFn/i;LFn/h;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LFn/i;", "d", "()LFn/i;", "c", "LFn/h;", "()LFn/h;", "Ljava/util/List;", "()Ljava/util/List;", "e", "caas_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final String f80962a;

        /* renamed from: b  reason: collision with root package name */
        private final i f80963b;

        /* renamed from: c  reason: collision with root package name */
        private final h f80964c;

        /* renamed from: d  reason: collision with root package name */
        private final List<a.C1553a> f80965d;

        /* renamed from: e  reason: collision with root package name */
        private final List<c> f80966e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, i iVar, h hVar, List<a.C1553a> list, List<c> list2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(iVar, "userContext");
            C17542s.j(list, "items");
            C17542s.j(list2, "discountCodes");
            this.f80962a = str;
            this.f80963b = iVar;
            this.f80964c = hVar;
            this.f80965d = list;
            this.f80966e = list2;
        }

        public List<c> a() {
            return this.f80966e;
        }

        public List<a.C1553a> b() {
            return this.f80965d;
        }

        public h c() {
            return this.f80964c;
        }

        public i d() {
            return this.f80963b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f80962a, aVar.f80962a) && C17542s.e(this.f80963b, aVar.f80963b) && C17542s.e(this.f80964c, aVar.f80964c) && C17542s.e(this.f80965d, aVar.f80965d) && C17542s.e(this.f80966e, aVar.f80966e);
        }

        public int hashCode() {
            int hashCode = ((this.f80962a.hashCode() * 31) + this.f80963b.hashCode()) * 31;
            h hVar = this.f80964c;
            return ((((hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f80965d.hashCode()) * 31) + this.f80966e.hashCode();
        }

        public String toString() {
            String str = this.f80962a;
            i iVar = this.f80963b;
            h hVar = this.f80964c;
            List<a.C1553a> list = this.f80965d;
            List<c> list2 = this.f80966e;
            return "InStoreModel(id=" + str + ", userContext=" + iVar + ", totalPrice=" + hVar + ", items=" + list + ", discountCodes=" + list2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001d\u0010%R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\u001a\u0010%R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"LFn/b$b;", "LFn/b;", "", "id", "LFn/i;", "userContext", "LFn/h;", "totalPrice", "", "LFn/a$b;", "items", "LFn/c;", "discountCodes", "", "hasFamilyOnlyDiscount", "<init>", "(Ljava/lang/String;LFn/i;LFn/h;Ljava/util/List;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "LFn/i;", "d", "()LFn/i;", "c", "LFn/h;", "()LFn/h;", "Ljava/util/List;", "()Ljava/util/List;", "e", "f", "Z", "getHasFamilyOnlyDiscount", "()Z", "caas_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fn.b$b  reason: collision with other inner class name */
    public static final class C1565b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final String f80967a;

        /* renamed from: b  reason: collision with root package name */
        private final i f80968b;

        /* renamed from: c  reason: collision with root package name */
        private final h f80969c;

        /* renamed from: d  reason: collision with root package name */
        private final List<a.b> f80970d;

        /* renamed from: e  reason: collision with root package name */
        private final List<c> f80971e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f80972f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1565b(String str, i iVar, h hVar, List<a.b> list, List<c> list2, boolean z10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(iVar, "userContext");
            C17542s.j(list, "items");
            C17542s.j(list2, "discountCodes");
            this.f80967a = str;
            this.f80968b = iVar;
            this.f80969c = hVar;
            this.f80970d = list;
            this.f80971e = list2;
            this.f80972f = z10;
        }

        public List<c> a() {
            return this.f80971e;
        }

        public List<a.b> b() {
            return this.f80970d;
        }

        public h c() {
            return this.f80969c;
        }

        public i d() {
            return this.f80968b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1565b)) {
                return false;
            }
            C1565b bVar = (C1565b) obj;
            return C17542s.e(this.f80967a, bVar.f80967a) && C17542s.e(this.f80968b, bVar.f80968b) && C17542s.e(this.f80969c, bVar.f80969c) && C17542s.e(this.f80970d, bVar.f80970d) && C17542s.e(this.f80971e, bVar.f80971e) && this.f80972f == bVar.f80972f;
        }

        public int hashCode() {
            int hashCode = ((this.f80967a.hashCode() * 31) + this.f80968b.hashCode()) * 31;
            h hVar = this.f80969c;
            return ((((((hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f80970d.hashCode()) * 31) + this.f80971e.hashCode()) * 31) + Boolean.hashCode(this.f80972f);
        }

        public String toString() {
            String str = this.f80967a;
            i iVar = this.f80968b;
            h hVar = this.f80969c;
            List<a.b> list = this.f80970d;
            List<c> list2 = this.f80971e;
            boolean z10 = this.f80972f;
            return "OnlineModel(id=" + str + ", userContext=" + iVar + ", totalPrice=" + hVar + ", items=" + list + ", discountCodes=" + list2 + ", hasFamilyOnlyDiscount=" + z10 + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
