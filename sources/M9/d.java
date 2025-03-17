package M9;

import H9.C6545t;
import K9.C6624w;
import K9.C6626y;
import K9.C6627z;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import xa.C8971l;

public final class d extends f implements C6626y {

    /* renamed from: k  reason: collision with root package name */
    private static final a.g f38673k;

    /* renamed from: l  reason: collision with root package name */
    private static final a.C0821a f38674l;

    /* renamed from: m  reason: collision with root package name */
    private static final a f38675m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f38676n = 0;

    static {
        a.g gVar = new a.g();
        f38673k = gVar;
        c cVar = new c();
        f38674l = cVar;
        f38675m = new a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C6627z zVar) {
        super(context, f38675m, zVar, f.a.f48010c);
    }

    public final C8971l<Void> g(C6624w wVar) {
        C6545t.a a10 = C6545t.a();
        a10.d(aa.f.f42995a);
        a10.c(false);
        a10.b(new b(wVar));
        return m(a10.a());
    }
}
