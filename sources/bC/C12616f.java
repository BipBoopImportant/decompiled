package BC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"LBC/f;", "", "<init>", "()V", "LBC/a;", "a", "()LBC/a;", "navigateTo", "b", "c", "LBC/f$a;", "LBC/f$b;", "LBC/f$c;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: BC.f  reason: case insensitive filesystem */
public abstract class C12616f {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LBC/f$a;", "LBC/f;", "LBC/a;", "navigateTo", "<init>", "(LBC/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LBC/a;", "()LBC/a;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BC.f$a */
    public static final class a extends C12616f {

        /* renamed from: a  reason: collision with root package name */
        private final C12611a f107810a;

        public a() {
            this((C12611a) null, 1, (DefaultConstructorMarker) null);
        }

        public C12611a a() {
            return this.f107810a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f107810a, ((a) obj).f107810a);
        }

        public int hashCode() {
            C12611a aVar = this.f107810a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            C12611a aVar = this.f107810a;
            return "Error(navigateTo=" + aVar + ")";
        }

        public a(C12611a aVar) {
            super((DefaultConstructorMarker) null);
            this.f107810a = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C12611a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LBC/f$b;", "LBC/f;", "LBC/a;", "navigateTo", "<init>", "(LBC/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LBC/a;", "()LBC/a;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BC.f$b */
    public static final class b extends C12616f {

        /* renamed from: a  reason: collision with root package name */
        private final C12611a f107811a;

        public b() {
            this((C12611a) null, 1, (DefaultConstructorMarker) null);
        }

        public C12611a a() {
            return this.f107811a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f107811a, ((b) obj).f107811a);
        }

        public int hashCode() {
            C12611a aVar = this.f107811a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            C12611a aVar = this.f107811a;
            return "Loading(navigateTo=" + aVar + ")";
        }

        public b(C12611a aVar) {
            super((DefaultConstructorMarker) null);
            this.f107811a = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C12611a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LBC/f$c;", "LBC/f;", "LBC/d;", "uiData", "LBC/a;", "navigateTo", "<init>", "(LBC/d;LBC/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LBC/d;", "b", "()LBC/d;", "LBC/a;", "()LBC/a;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BC.f$c */
    public static final class c extends C12616f {

        /* renamed from: a  reason: collision with root package name */
        private final C12614d f107812a;

        /* renamed from: b  reason: collision with root package name */
        private final C12611a f107813b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C12614d dVar, C12611a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(dVar, "uiData");
            this.f107812a = dVar;
            this.f107813b = aVar;
        }

        public C12611a a() {
            return this.f107813b;
        }

        public final C12614d b() {
            return this.f107812a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f107812a, cVar.f107812a) && C17542s.e(this.f107813b, cVar.f107813b);
        }

        public int hashCode() {
            int hashCode = this.f107812a.hashCode() * 31;
            C12611a aVar = this.f107813b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            C12614d dVar = this.f107812a;
            C12611a aVar = this.f107813b;
            return "Success(uiData=" + dVar + ", navigateTo=" + aVar + ")";
        }
    }

    public /* synthetic */ C12616f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C12611a a();

    private C12616f() {
    }
}
