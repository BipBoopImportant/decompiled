package Jy;

import fI.C17221b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import rz.K;
import xB.C15201a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LJy/n;", "LJy/o;", "LxB/a;", "", "totalFamilySavings", "Lrz/K;", "profileState", "<init>", "(DLrz/K;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "h", "()D", "b", "Lrz/K;", "g", "()Lrz/K;", "", "c", "J", "f", "()J", "stableId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends o implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final double f111426a;

    /* renamed from: b  reason: collision with root package name */
    private final K f111427b;

    /* renamed from: c  reason: collision with root package name */
    private final long f111428c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LJy/n$a;", "", "<init>", "(Ljava/lang/String;I)V", "SIGNUP_LOGIN", "UPGRADE_TO_FAMILY", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        SIGNUP_LOGIN,
        UPGRADE_TO_FAMILY;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(double d10, K k10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(k10, "profileState");
        this.f111426a = d10;
        this.f111427b = k10;
        Double valueOf = Double.valueOf(d10);
        Object[] objArr = {k10};
        U u10 = new U(3);
        u10.a(P.b(n.class));
        u10.a(valueOf);
        u10.b(objArr);
        this.f111428c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Double.compare(this.f111426a, nVar.f111426a) == 0 && C17542s.e(this.f111427b, nVar.f111427b);
    }

    public long f() {
        return this.f111428c;
    }

    public final K g() {
        return this.f111427b;
    }

    public final double h() {
        return this.f111426a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f111426a) * 31) + this.f111427b.hashCode();
    }

    public String toString() {
        double d10 = this.f111426a;
        K k10 = this.f111427b;
        return "FamilyBannerModel(totalFamilySavings=" + d10 + ", profileState=" + k10 + ")";
    }
}
