package Zc;

import K9.C6620s;
import Kb.C9128c;
import Kb.C9131f;
import Kb.n;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import xa.C8973n;

/* renamed from: Zc.i  reason: case insensitive filesystem */
public class C9400i {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f65094b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static C9400i f65095c;

    /* renamed from: a  reason: collision with root package name */
    private n f65096a;

    private C9400i() {
    }

    public static C9400i c() {
        C9400i iVar;
        synchronized (f65094b) {
            C6620s.q(f65095c != null, "MlKitContext has not been initialized");
            iVar = (C9400i) C6620s.l(f65095c);
        }
        return iVar;
    }

    public static C9400i d(Context context) {
        C9400i iVar;
        synchronized (f65094b) {
            C6620s.q(f65095c == null, "MlKitContext is already initialized");
            C9400i iVar2 = new C9400i();
            f65095c = iVar2;
            Context e10 = e(context);
            n e11 = n.m(C8973n.f57779a).d(C9131f.c(e10, MlKitComponentDiscoveryService.class).b()).b(C9128c.s(e10, Context.class, new Class[0])).b(C9128c.s(iVar2, C9400i.class, new Class[0])).e();
            iVar2.f65096a = e11;
            e11.p(true);
            iVar = f65095c;
        }
        return iVar;
    }

    private static Context e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public <T> T a(Class<T> cls) {
        C6620s.q(f65095c == this, "MlKitContext has been deleted");
        C6620s.l(this.f65096a);
        return this.f65096a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
