package S;

import androidx.camera.core.impl.C5045s;
import androidx.camera.core.impl.C5047t;
import androidx.camera.core.impl.C5049u;
import androidx.camera.core.impl.C5051v;
import androidx.camera.core.impl.C5053w;
import androidx.camera.core.impl.C5055x;
import androidx.camera.core.impl.C5057y;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.g1;

public class m implements C5059z {

    /* renamed from: a  reason: collision with root package name */
    private final C5059z f12561a;

    /* renamed from: b  reason: collision with root package name */
    private final g1 f12562b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12563c;

    public m(g1 g1Var, C5059z zVar) {
        this(zVar, g1Var, -1);
    }

    public long a() {
        C5059z zVar = this.f12561a;
        if (zVar != null) {
            return zVar.a();
        }
        long j10 = this.f12563c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public g1 b() {
        return this.f12562b;
    }

    public C5057y d() {
        C5059z zVar = this.f12561a;
        return zVar != null ? zVar.d() : C5057y.UNKNOWN;
    }

    public C5053w e() {
        C5059z zVar = this.f12561a;
        return zVar != null ? zVar.e() : C5053w.UNKNOWN;
    }

    public C5045s g() {
        C5059z zVar = this.f12561a;
        return zVar != null ? zVar.g() : C5045s.UNKNOWN;
    }

    public C5051v h() {
        C5059z zVar = this.f12561a;
        return zVar != null ? zVar.h() : C5051v.UNKNOWN;
    }

    public C5055x i() {
        C5059z zVar = this.f12561a;
        return zVar != null ? zVar.i() : C5055x.UNKNOWN;
    }

    public C5049u j() {
        C5059z zVar = this.f12561a;
        return zVar != null ? zVar.j() : C5049u.UNKNOWN;
    }

    public C5047t k() {
        C5059z zVar = this.f12561a;
        return zVar != null ? zVar.k() : C5047t.UNKNOWN;
    }

    public m(g1 g1Var, long j10) {
        this((C5059z) null, g1Var, j10);
    }

    private m(C5059z zVar, g1 g1Var, long j10) {
        this.f12561a = zVar;
        this.f12562b = g1Var;
        this.f12563c = j10;
    }
}
