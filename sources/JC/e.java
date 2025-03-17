package Jc;

import Ic.i;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import xa.C8971l;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private f f61135a;

    /* renamed from: b  reason: collision with root package name */
    private a f61136b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f61137c;

    /* renamed from: d  reason: collision with root package name */
    private Set<Lc.f> f61138d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(f fVar, a aVar, Executor executor) {
        this.f61135a = fVar;
        this.f61136b = aVar;
        this.f61137c = executor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(C8971l lVar, Lc.f fVar, g gVar) {
        try {
            g gVar2 = (g) lVar.m();
            if (gVar2 != null) {
                this.f61137c.execute(new d(fVar, this.f61136b.b(gVar2)));
            }
        } catch (i e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }

    public void g(g gVar) {
        try {
            Lc.e b10 = this.f61136b.b(gVar);
            for (Lc.f cVar : this.f61138d) {
                this.f61137c.execute(new c(cVar, b10));
            }
        } catch (i e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }

    public void h(Lc.f fVar) {
        this.f61138d.add(fVar);
        C8971l<g> e10 = this.f61135a.e();
        e10.f(this.f61137c, new b(this, e10, fVar));
    }
}
