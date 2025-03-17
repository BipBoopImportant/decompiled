package go;

import Nn.G;
import RC.n;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\u00020-8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b(\u0010/¨\u00061"}, d2 = {"Lgo/U;", "LxB/a;", "LNn/G;", "pickupPointHolder", "", "selected", "loading", "", "address", "", "numberOfItemsUnavailable", "showUnavailableWarning", "LRC/n$a;", "priceDetails", "<init>", "(LNn/G;ZZLjava/lang/String;IZLRC/n$a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/G;", "j", "()LNn/G;", "b", "Z", "o", "()Z", "c", "h", "d", "Ljava/lang/String;", "g", "e", "I", "i", "f", "p", "LRC/n$a;", "n", "()LRC/n$a;", "", "J", "()J", "stableId", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class U implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final G f97762a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f97763b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f97764c;

    /* renamed from: d  reason: collision with root package name */
    private final String f97765d;

    /* renamed from: e  reason: collision with root package name */
    private final int f97766e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f97767f;

    /* renamed from: g  reason: collision with root package name */
    private final n.a f97768g;

    /* renamed from: h  reason: collision with root package name */
    private final long f97769h;

    public U(G g10, boolean z10, boolean z11, String str, int i10, boolean z12, n.a aVar) {
        C17542s.j(g10, "pickupPointHolder");
        C17542s.j(str, PlaceTypes.ADDRESS);
        this.f97762a = g10;
        this.f97763b = z10;
        this.f97764c = z11;
        this.f97765d = str;
        this.f97766e = i10;
        this.f97767f = z12;
        this.f97768g = aVar;
        kotlin.jvm.internal.U u10 = new kotlin.jvm.internal.U(3);
        u10.a(P.b(U.class));
        u10.a(g10);
        u10.b(new Object[0]);
        this.f97769h = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return C17542s.e(this.f97762a, u10.f97762a) && this.f97763b == u10.f97763b && this.f97764c == u10.f97764c && C17542s.e(this.f97765d, u10.f97765d) && this.f97766e == u10.f97766e && this.f97767f == u10.f97767f && C17542s.e(this.f97768g, u10.f97768g);
    }

    public long f() {
        return this.f97769h;
    }

    public final String g() {
        return this.f97765d;
    }

    public final boolean h() {
        return this.f97764c;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f97762a.hashCode() * 31) + Boolean.hashCode(this.f97763b)) * 31) + Boolean.hashCode(this.f97764c)) * 31) + this.f97765d.hashCode()) * 31) + Integer.hashCode(this.f97766e)) * 31) + Boolean.hashCode(this.f97767f)) * 31;
        n.a aVar = this.f97768g;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final int i() {
        return this.f97766e;
    }

    public final G j() {
        return this.f97762a;
    }

    public final n.a n() {
        return this.f97768g;
    }

    public final boolean o() {
        return this.f97763b;
    }

    public final boolean p() {
        return this.f97767f;
    }

    public String toString() {
        G g10 = this.f97762a;
        boolean z10 = this.f97763b;
        boolean z11 = this.f97764c;
        String str = this.f97765d;
        int i10 = this.f97766e;
        boolean z12 = this.f97767f;
        n.a aVar = this.f97768g;
        return "PickUpPointItem(pickupPointHolder=" + g10 + ", selected=" + z10 + ", loading=" + z11 + ", address=" + str + ", numberOfItemsUnavailable=" + i10 + ", showUnavailableWarning=" + z12 + ", priceDetails=" + aVar + ")";
    }
}
