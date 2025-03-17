package Mb;

import Ib.a;
import Nb.g;
import Ob.e;
import Ob.f;
import Pb.b;
import Pb.c;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mc.C10035a;
import mc.C10036b;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final C10035a<a> f61704a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Ob.a f61705b;

    /* renamed from: c  reason: collision with root package name */
    private volatile b f61706c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Pb.a> f61707d;

    public d(C10035a<a> aVar) {
        this(aVar, new c(), new f());
    }

    private void f() {
        this.f61704a.a(new c(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f61705b.a(str, bundle);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(Pb.a aVar) {
        synchronized (this) {
            try {
                if (this.f61706c instanceof c) {
                    this.f61707d.add(aVar);
                }
                this.f61706c.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(C10036b bVar) {
        g.f().b("AnalyticsConnector now available.");
        a aVar = (a) bVar.get();
        e eVar = new e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) != null) {
            g.f().b("Registered Firebase Analytics listener.");
            Ob.d dVar = new Ob.d();
            Ob.c cVar = new Ob.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    for (Pb.a a10 : this.f61707d) {
                        dVar.a(a10);
                    }
                    eVar2.d(dVar);
                    eVar2.e(cVar);
                    this.f61706c = dVar;
                    this.f61705b = cVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static a.C1003a j(a aVar, e eVar) {
        a.C1003a a10 = aVar.a("clx", eVar);
        if (a10 == null) {
            g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a10 = aVar.a("crash", eVar);
            if (a10 != null) {
                g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a10;
    }

    public Ob.a d() {
        return new b(this);
    }

    public b e() {
        return new a(this);
    }

    public d(C10035a<a> aVar, b bVar, Ob.a aVar2) {
        this.f61704a = aVar;
        this.f61706c = bVar;
        this.f61707d = new ArrayList();
        this.f61705b = aVar2;
        f();
    }
}
