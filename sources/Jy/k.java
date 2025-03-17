package Jy;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LJy/k;", "LJy/o;", "LxB/a;", "", "index", "", "title", "formattedDiscount", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "b", "Ljava/lang/String;", "h", "c", "g", "", "d", "J", "f", "()J", "stableId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends o implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final int f111417a;

    /* renamed from: b  reason: collision with root package name */
    private final String f111418b;

    /* renamed from: c  reason: collision with root package name */
    private final String f111419c;

    /* renamed from: d  reason: collision with root package name */
    private final long f111420d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(int i10, String str, String str2) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "title");
        C17542s.j(str2, "formattedDiscount");
        this.f111417a = i10;
        this.f111418b = str;
        this.f111419c = str2;
        Integer valueOf = Integer.valueOf(i10);
        U u10 = new U(3);
        u10.a(P.b(k.class));
        u10.a(valueOf);
        u10.b(new Object[0]);
        this.f111420d = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f111417a == kVar.f111417a && C17542s.e(this.f111418b, kVar.f111418b) && C17542s.e(this.f111419c, kVar.f111419c);
    }

    public long f() {
        return this.f111420d;
    }

    public final String g() {
        return this.f111419c;
    }

    public final String h() {
        return this.f111418b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f111417a) * 31) + this.f111418b.hashCode()) * 31) + this.f111419c.hashCode();
    }

    public String toString() {
        int i10 = this.f111417a;
        String str = this.f111418b;
        String str2 = this.f111419c;
        return "DiscountRowModel(index=" + i10 + ", title=" + str + ", formattedDiscount=" + str2 + ")";
    }
}
