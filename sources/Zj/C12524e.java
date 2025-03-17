package zj;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zj.C12520a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lzj/e;", "", "<init>", "()V", "Lzj/a;", "a", "()Lzj/a;", "navigateTo", "b", "c", "Lzj/e$a;", "Lzj/e$b;", "Lzj/e$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zj.e  reason: case insensitive filesystem */
public abstract class C12524e {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzj/e$a;", "Lzj/e;", "Lzj/a;", "navigateTo", "<init>", "(Lzj/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzj/a;", "()Lzj/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zj.e$a */
    public static final class a extends C12524e {

        /* renamed from: a  reason: collision with root package name */
        private final C12520a f107378a;

        public a() {
            this((C12520a) null, 1, (DefaultConstructorMarker) null);
        }

        public C12520a a() {
            return this.f107378a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f107378a, ((a) obj).f107378a);
        }

        public int hashCode() {
            return this.f107378a.hashCode();
        }

        public String toString() {
            C12520a aVar = this.f107378a;
            return "Error(navigateTo=" + aVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C12520a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "navigateTo");
            this.f107378a = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C12520a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C12520a.b.f107366a : aVar);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzj/e$b;", "Lzj/e;", "Lzj/a;", "navigateTo", "<init>", "(Lzj/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzj/a;", "()Lzj/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zj.e$b */
    public static final class b extends C12524e {

        /* renamed from: a  reason: collision with root package name */
        private final C12520a f107379a;

        public b() {
            this((C12520a) null, 1, (DefaultConstructorMarker) null);
        }

        public C12520a a() {
            return this.f107379a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f107379a, ((b) obj).f107379a);
        }

        public int hashCode() {
            return this.f107379a.hashCode();
        }

        public String toString() {
            C12520a aVar = this.f107379a;
            return "Loading(navigateTo=" + aVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C12520a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "navigateTo");
            this.f107379a = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C12520a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C12520a.b.f107366a : aVar);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzj/e$c;", "Lzj/e;", "Lzj/a;", "navigateTo", "Lzj/c;", "data", "<init>", "(Lzj/a;Lzj/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzj/a;", "()Lzj/a;", "b", "Lzj/c;", "()Lzj/c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zj.e$c */
    public static final class c extends C12524e {

        /* renamed from: a  reason: collision with root package name */
        private final C12520a f107380a;

        /* renamed from: b  reason: collision with root package name */
        private final C12522c f107381b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C12520a aVar, C12522c cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "navigateTo");
            C17542s.j(cVar, "data");
            this.f107380a = aVar;
            this.f107381b = cVar;
        }

        public C12520a a() {
            return this.f107380a;
        }

        public final C12522c b() {
            return this.f107381b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f107380a, cVar.f107380a) && C17542s.e(this.f107381b, cVar.f107381b);
        }

        public int hashCode() {
            return (this.f107380a.hashCode() * 31) + this.f107381b.hashCode();
        }

        public String toString() {
            C12520a aVar = this.f107380a;
            C12522c cVar = this.f107381b;
            return "Success(navigateTo=" + aVar + ", data=" + cVar + ")";
        }
    }

    public /* synthetic */ C12524e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C12520a a();

    private C12524e() {
    }
}
