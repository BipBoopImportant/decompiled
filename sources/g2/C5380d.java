package g2;

import g2.C5387k;
import kotlin.Metadata;
import l2.C5517a;
import l2.e;
import l2.f;
import l2.i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lg2/d;", "Lg2/c0;", "Ll2/f;", "containerObject", "", "index", "<init>", "(Ll2/f;I)V", "Lg2/k$c;", "anchor", "Lc2/h;", "margin", "goneMargin", "LXH/N;", "b", "(Lg2/k$c;FF)V", "a", "Ll2/f;", "", "Ljava/lang/String;", "anchorName", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.d  reason: case insensitive filesystem */
public abstract class C5380d implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final f f23666a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23667b;

    public C5380d(f fVar, int i10) {
        this.f23666a = fVar;
        this.f23667b = C5377a.f23650a.b(i10);
    }

    public final void b(C5387k.c cVar, float f10, float f11) {
        String b10 = C5377a.f23650a.b(cVar.b());
        C5517a aVar = new C5517a(new char[0]);
        aVar.L(i.M(cVar.a().toString()));
        aVar.L(i.M(b10));
        aVar.L(new e(f10));
        aVar.L(new e(f11));
        this.f23666a.j0(this.f23667b, aVar);
    }
}
