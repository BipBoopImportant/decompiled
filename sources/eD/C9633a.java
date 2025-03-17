package ed;

import G9.C6521b;
import Zc.C9400i;
import Zc.m;
import bd.C9427a;
import bd.C9428b;
import cd.C9452a;
import gd.e;
import ha.C7985d6;
import ha.C8005f6;
import ha.C8015g6;
import ha.C8134s6;
import ha.C8136s8;
import ha.C8154u6;
import ha.C8176w8;
import ha.G8;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ed.a  reason: case insensitive filesystem */
public class C9633a extends e<List<C9452a>> implements C9427a {

    /* renamed from: l  reason: collision with root package name */
    private static final C9428b f72584l = new C9428b.a().a();

    /* renamed from: h  reason: collision with root package name */
    private final boolean f72585h;

    /* renamed from: i  reason: collision with root package name */
    private final C9428b f72586i;

    /* renamed from: j  reason: collision with root package name */
    final G8 f72587j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f72588k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9633a(C9428b bVar, C9642j jVar, Executor executor, C8136s8 s8Var, C9400i iVar) {
        super(jVar, executor);
        bVar.b();
        this.f72586i = bVar;
        boolean f10 = C9635c.f();
        this.f72585h = f10;
        C8134s6 s6Var = new C8134s6();
        s6Var.i(C9635c.c(bVar));
        C8154u6 j10 = s6Var.j();
        C8015g6 g6Var = new C8015g6();
        g6Var.e(f10 ? C7985d6.TYPE_THICK : C7985d6.TYPE_THIN);
        g6Var.g(j10);
        s8Var.d(C8176w8.e(g6Var, 1), C8005f6.ON_DEVICE_BARCODE_CREATE);
    }

    public final int K1() {
        return 1;
    }

    public final synchronized void close() {
        super.close();
    }

    public final C6521b[] d() {
        if (this.f72585h) {
            return m.f65102a;
        }
        return new C6521b[]{m.f65103b};
    }
}
