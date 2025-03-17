package Jm;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"LJm/e;", "", "LJm/c;", "a", "()LJm/c;", "navigateTo", "b", "LJm/e$a;", "LJm/e$b;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LJm/e$a;", "LJm/e;", "LJm/c;", "navigateTo", "<init>", "(LJm/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJm/c;", "()LJm/c;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final c f82622a;

        public a() {
            this((c) null, 1, (DefaultConstructorMarker) null);
        }

        public c a() {
            return this.f82622a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f82622a, ((a) obj).f82622a);
        }

        public int hashCode() {
            c cVar = this.f82622a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            c cVar = this.f82622a;
            return "Loading(navigateTo=" + cVar + ")";
        }

        public a(c cVar) {
            this.f82622a = cVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : cVar);
        }
    }

    c a();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"LJm/e$b;", "LJm/e;", "LKJ/c;", "LJm/b;", "content", "LJm/c;", "navigateTo", "<init>", "(LKJ/c;LJm/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "b", "()LKJ/c;", "LJm/c;", "()LJm/c;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<b> f82623a;

        /* renamed from: b  reason: collision with root package name */
        private final c f82624b;

        public b(C15987c<b> cVar, c cVar2) {
            C17542s.j(cVar, "content");
            this.f82623a = cVar;
            this.f82624b = cVar2;
        }

        public c a() {
            return this.f82624b;
        }

        public final C15987c<b> b() {
            return this.f82623a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f82623a, bVar.f82623a) && C17542s.e(this.f82624b, bVar.f82624b);
        }

        public int hashCode() {
            int hashCode = this.f82623a.hashCode() * 31;
            c cVar = this.f82624b;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            C15987c<b> cVar = this.f82623a;
            c cVar2 = this.f82624b;
            return "Success(content=" + cVar + ", navigateTo=" + cVar2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C15987c cVar, c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i10 & 2) != 0 ? null : cVar2);
        }
    }
}
