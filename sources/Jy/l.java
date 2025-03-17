package Jy;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\b\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u0012B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"LJy/l;", "LJy/o;", "LxB/a;", "", "id", "", "size", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "I", "g", "", "c", "J", "f", "()J", "stableId", "d", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends o implements C15201a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f111421d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f111422a;

    /* renamed from: b  reason: collision with root package name */
    private final int f111423b;

    /* renamed from: c  reason: collision with root package name */
    private final long f111424c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"LJy/l$a;", "", "<init>", "()V", "", "UNCOLLECTED_CASH_AND_CARRY_PRODUCTS_SECTION_DIVIDER", "Ljava/lang/String;", "UNAVAILABLE_PRODUCTS_SECTION_DIVIDER", "UNCOLLECTED_SELFSERVE_PRODUCTS_SECTION", "FULLSERVE_PRODUCTS_SECTION_DIVIDER", "COLLECTED_PRODUCTS_SECTION_DIVIDER", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 12 : i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C17542s.e(this.f111422a, lVar.f111422a) && this.f111423b == lVar.f111423b;
    }

    public long f() {
        return this.f111424c;
    }

    public final int g() {
        return this.f111423b;
    }

    public int hashCode() {
        return (this.f111422a.hashCode() * 31) + Integer.hashCode(this.f111423b);
    }

    public String toString() {
        String str = this.f111422a;
        int i10 = this.f111423b;
        return "DividerModel(id=" + str + ", size=" + i10 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, int i10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "id");
        this.f111422a = str;
        this.f111423b = i10;
        U u10 = new U(3);
        u10.a(P.b(l.class));
        u10.a(str);
        u10.b(new Object[0]);
        this.f111424c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }
}
