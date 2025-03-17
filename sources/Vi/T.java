package Vi;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\n\u0012\u000eB%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"LVi/T;", "LxB/a;", "", "text", "", "iconRes", "", "isClickable", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "c", "Z", "i", "()Z", "", "d", "J", "f", "()J", "stableId", "LVi/T$a;", "LVi/T$b;", "LVi/T$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class T implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final String f88516a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f88517b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f88518c;

    /* renamed from: d  reason: collision with root package name */
    private final long f88519d;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LVi/T$a;", "LVi/T;", "", "text", "", "isClickable", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "h", "f", "Z", "i", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends T {

        /* renamed from: e  reason: collision with root package name */
        private final String f88520e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f88521f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10) {
            super(str, (Integer) null, z10, 2, (DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            this.f88520e = str;
            this.f88521f = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f88520e, aVar.f88520e) && this.f88521f == aVar.f88521f;
        }

        public String h() {
            return this.f88520e;
        }

        public int hashCode() {
            return (this.f88520e.hashCode() * 31) + Boolean.hashCode(this.f88521f);
        }

        public boolean i() {
            return this.f88521f;
        }

        public String toString() {
            String str = this.f88520e;
            boolean z10 = this.f88521f;
            return "ChildItemAvailabilityNotice(text=" + str + ", isClickable=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LVi/T$b;", "LVi/T;", "", "text", "", "iconRes", "", "isClickable", "<init>", "(Ljava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "h", "f", "I", "g", "()Ljava/lang/Integer;", "Z", "i", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends T {

        /* renamed from: e  reason: collision with root package name */
        private final String f88522e;

        /* renamed from: f  reason: collision with root package name */
        private final int f88523f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f88524g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, int i10, boolean z10) {
            super(str, Integer.valueOf(i10), z10, (DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            this.f88522e = str;
            this.f88523f = i10;
            this.f88524g = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f88522e, bVar.f88522e) && this.f88523f == bVar.f88523f && this.f88524g == bVar.f88524g;
        }

        public Integer g() {
            return Integer.valueOf(this.f88523f);
        }

        public String h() {
            return this.f88522e;
        }

        public int hashCode() {
            return (((this.f88522e.hashCode() * 31) + Integer.hashCode(this.f88523f)) * 31) + Boolean.hashCode(this.f88524g);
        }

        public boolean i() {
            return this.f88524g;
        }

        public String toString() {
            String str = this.f88522e;
            int i10 = this.f88523f;
            boolean z10 = this.f88524g;
            return "FullServerAvailabilityNotice(text=" + str + ", iconRes=" + i10 + ", isClickable=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LVi/T$c;", "LVi/T;", "", "text", "", "iconRes", "", "isClickable", "<init>", "(Ljava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "h", "f", "I", "g", "()Ljava/lang/Integer;", "Z", "i", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends T {

        /* renamed from: e  reason: collision with root package name */
        private final String f88525e;

        /* renamed from: f  reason: collision with root package name */
        private final int f88526f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f88527g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, int i10, boolean z10) {
            super(str, Integer.valueOf(i10), z10, (DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            this.f88525e = str;
            this.f88526f = i10;
            this.f88527g = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f88525e, cVar.f88525e) && this.f88526f == cVar.f88526f && this.f88527g == cVar.f88527g;
        }

        public Integer g() {
            return Integer.valueOf(this.f88526f);
        }

        public String h() {
            return this.f88525e;
        }

        public int hashCode() {
            return (((this.f88525e.hashCode() * 31) + Integer.hashCode(this.f88526f)) * 31) + Boolean.hashCode(this.f88527g);
        }

        public boolean i() {
            return this.f88527g;
        }

        public String toString() {
            String str = this.f88525e;
            int i10 = this.f88526f;
            boolean z10 = this.f88527g;
            return "ItemAvailabilityNotice(text=" + str + ", iconRes=" + i10 + ", isClickable=" + z10 + ")";
        }
    }

    public /* synthetic */ T(String str, Integer num, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, z10);
    }

    public long f() {
        return this.f88519d;
    }

    public Integer g() {
        return this.f88517b;
    }

    public String h() {
        return this.f88516a;
    }

    public boolean i() {
        return this.f88518c;
    }

    private T(String str, Integer num, boolean z10) {
        this.f88516a = str;
        this.f88517b = num;
        this.f88518c = z10;
        String h10 = h();
        U u10 = new U(3);
        u10.a(P.b(T.class));
        u10.a(h10);
        u10.b(new Object[0]);
        this.f88519d = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(String str, Integer num, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : num, z10, (DefaultConstructorMarker) null);
    }
}
