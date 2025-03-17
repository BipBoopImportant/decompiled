package O;

import C.C4404l;
import C.V;
import C.Z;
import H2.a;
import H2.i;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: O.y  reason: case insensitive filesystem */
public class C4714y {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f9660a;

    /* renamed from: b  reason: collision with root package name */
    private final Z f9661b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Throwable> f9662c;

    public C4714y(C4404l lVar) {
        i.a(lVar.g() == 4);
        this.f9660a = lVar.c();
        Z d10 = lVar.d();
        Objects.requireNonNull(d10);
        this.f9661b = d10;
        this.f9662c = lVar.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Z.a aVar, c.a aVar2) {
        aVar2.c(this.f9661b.a(aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d(Z.a aVar, c.a aVar2) {
        this.f9660a.execute(new C4713x(this, aVar, aVar2));
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    public Z.b e(Z.a aVar) {
        try {
            return (Z.b) c.a(new C4712w(this, aVar)).get();
        } catch (Exception e10) {
            e = e10;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new V(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
