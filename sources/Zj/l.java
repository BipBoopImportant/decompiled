package zj;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zj.C12527h;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lzj/l;", "", "<init>", "()V", "Lzj/h;", "a", "()Lzj/h;", "navigateTo", "b", "c", "Lzj/l$a;", "Lzj/l$b;", "Lzj/l$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzj/l$a;", "Lzj/l;", "Lzj/h;", "navigateTo", "<init>", "(Lzj/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzj/h;", "()Lzj/h;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends l {

        /* renamed from: a  reason: collision with root package name */
        private final C12527h f107404a;

        public a() {
            this((C12527h) null, 1, (DefaultConstructorMarker) null);
        }

        public C12527h a() {
            return this.f107404a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f107404a, ((a) obj).f107404a);
        }

        public int hashCode() {
            return this.f107404a.hashCode();
        }

        public String toString() {
            C12527h hVar = this.f107404a;
            return "Error(navigateTo=" + hVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C12527h hVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(hVar, "navigateTo");
            this.f107404a = hVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C12527h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C12527h.b.f107390a : hVar);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzj/l$b;", "Lzj/l;", "Lzj/h;", "navigateTo", "<init>", "(Lzj/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzj/h;", "()Lzj/h;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        private final C12527h f107405a;

        public b() {
            this((C12527h) null, 1, (DefaultConstructorMarker) null);
        }

        public C12527h a() {
            return this.f107405a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f107405a, ((b) obj).f107405a);
        }

        public int hashCode() {
            return this.f107405a.hashCode();
        }

        public String toString() {
            C12527h hVar = this.f107405a;
            return "Loading(navigateTo=" + hVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C12527h hVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(hVar, "navigateTo");
            this.f107405a = hVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C12527h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C12527h.b.f107390a : hVar);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzj/l$c;", "Lzj/l;", "Lzj/h;", "navigateTo", "Lzj/j;", "data", "<init>", "(Lzj/h;Lzj/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzj/h;", "()Lzj/h;", "b", "Lzj/j;", "()Lzj/j;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends l {

        /* renamed from: a  reason: collision with root package name */
        private final C12527h f107406a;

        /* renamed from: b  reason: collision with root package name */
        private final j f107407b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C12527h hVar, j jVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(hVar, "navigateTo");
            C17542s.j(jVar, "data");
            this.f107406a = hVar;
            this.f107407b = jVar;
        }

        public C12527h a() {
            return this.f107406a;
        }

        public final j b() {
            return this.f107407b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f107406a, cVar.f107406a) && C17542s.e(this.f107407b, cVar.f107407b);
        }

        public int hashCode() {
            return (this.f107406a.hashCode() * 31) + this.f107407b.hashCode();
        }

        public String toString() {
            C12527h hVar = this.f107406a;
            j jVar = this.f107407b;
            return "Success(navigateTo=" + hVar + ", data=" + jVar + ")";
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C12527h a();

    private l() {
    }
}
