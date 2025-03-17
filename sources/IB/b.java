package Ib;

import Fb.f;
import Ib.a;
import K9.C6620s;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7327j1;
import com.google.firebase.analytics.connector.internal.c;
import com.google.firebase.analytics.connector.internal.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jc.C9894a;
import jc.C9897d;

public class b implements a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f61009c;

    /* renamed from: a  reason: collision with root package name */
    private final ra.a f61010a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, Object> f61011b = new ConcurrentHashMap();

    class a implements a.C1003a {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ String f61012a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ b f61013b;

        a(b bVar, String str) {
            this.f61012a = str;
            this.f61013b = bVar;
        }
    }

    private b(ra.a aVar) {
        C6620s.l(aVar);
        this.f61010a = aVar;
    }

    public static a h(f fVar, Context context, C9897d dVar) {
        C6620s.l(fVar);
        C6620s.l(context);
        C6620s.l(dVar);
        C6620s.l(context.getApplicationContext());
        if (f61009c == null) {
            synchronized (b.class) {
                try {
                    if (f61009c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.a(Fb.b.class, new d(), new c());
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f61009c = new b(C7327j1.f(context, (String) null, (String) null, (String) null, bundle).A());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f61009c;
    }

    static /* synthetic */ void i(C9894a aVar) {
        boolean z10 = ((Fb.b) aVar.a()).f60397a;
        synchronized (b.class) {
            ((b) C6620s.l(f61009c)).f61010a.i(z10);
        }
    }

    private final boolean j(String str) {
        return !str.isEmpty() && this.f61011b.containsKey(str) && this.f61011b.get(str) != null;
    }

    public a.C1003a a(String str, a.b bVar) {
        C6620s.l(bVar);
        if (!c.j(str) || j(str)) {
            return null;
        }
        ra.a aVar = this.f61010a;
        Object bVar2 = "fiam".equals(str) ? new com.google.firebase.analytics.connector.internal.b(aVar, bVar) : "clx".equals(str) ? new d(aVar, bVar) : null;
        if (bVar2 == null) {
            return null;
        }
        this.f61011b.put(str, bVar2);
        return new a(this, str);
    }

    public void b(a.c cVar) {
        if (c.g(cVar)) {
            this.f61010a.g(c.b(cVar));
        }
    }

    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (c.j(str) && c.e(str2, bundle) && c.h(str, str2, bundle)) {
            c.d(str, str2, bundle);
            this.f61010a.e(str, str2, bundle);
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || c.e(str2, bundle)) {
            this.f61010a.a(str, str2, bundle);
        }
    }

    public void d(String str, String str2, Object obj) {
        if (c.j(str) && c.f(str, str2)) {
            this.f61010a.h(str, str2, obj);
        }
    }

    public Map<String, Object> e(boolean z10) {
        return this.f61010a.d((String) null, (String) null, z10);
    }

    public int f(String str) {
        return this.f61010a.c(str);
    }

    public List<a.c> g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle a10 : this.f61010a.b(str, str2)) {
            arrayList.add(c.a(a10));
        }
        return arrayList;
    }
}
