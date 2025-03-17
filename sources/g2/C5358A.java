package g2;

import c2.h;
import g2.C5402z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.C5519c;
import l2.f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lg2/A;", "Lg2/z$a;", "", "Lg2/z;", "Lc2/h;", "value", "", "valueSymbol", "<init>", "(Lc2/h;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "Ll2/c;", "a", "()Ll2/c;", "Lg2/B;", "b", "Lg2/B;", "c", "getMin$constraintlayout_compose_release", "()Lg2/B;", "min", "d", "getMax$constraintlayout_compose_release", "max", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.A  reason: case insensitive filesystem */
public final class C5358A implements C5402z.a, C5402z {

    /* renamed from: b  reason: collision with root package name */
    private final C5359B f23482b;

    /* renamed from: c  reason: collision with root package name */
    private final C5359B f23483c;

    /* renamed from: d  reason: collision with root package name */
    private final C5359B f23484d;

    private C5358A(h hVar, String str) {
        this.f23482b = new C5359B(hVar, str, "base", (DefaultConstructorMarker) null);
        this.f23483c = new C5359B((h) null, (String) null, "min", (DefaultConstructorMarker) null);
        this.f23484d = new C5359B((h) null, (String) null, "max", (DefaultConstructorMarker) null);
    }

    public final C5519c a() {
        if (this.f23483c.b() && this.f23484d.b()) {
            return this.f23482b.a();
        }
        f fVar = new f(new char[0]);
        if (!this.f23483c.b()) {
            fVar.j0("min", this.f23483c.a());
        }
        if (!this.f23484d.b()) {
            fVar.j0("max", this.f23484d.a());
        }
        fVar.j0("value", this.f23482b.a());
        return fVar;
    }

    public C5358A(String str) {
        this((h) null, str);
    }
}
