package ea;

import H9.C6536j;
import H9.C6537k;
import H9.C6541o;
import H9.C6545t;
import K9.C6620s;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.LocationRequest;
import na.C8592a;
import na.C8594c;
import xa.C8960a;
import xa.C8971l;
import xa.C8972m;

/* renamed from: ea.i  reason: case insensitive filesystem */
public final class C7825i extends f implements C8594c {

    /* renamed from: k  reason: collision with root package name */
    static final a.g f50958k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f50959l;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f50960m = new Object();

    static {
        a.g gVar = new a.g();
        f50958k = gVar;
        f50959l = new a("LocationServices.API", new C7822f(), gVar);
    }

    public C7825i(Activity activity) {
        super(activity, f50959l, a.d.f47997j0, f.a.f48010c);
    }

    private final C8971l D(LocationRequest locationRequest, C6536j jVar) {
        C7824h hVar = new C7824h(this, jVar, C7831o.f50970a);
        return o(C6541o.a().b(new C7828l(hVar, locationRequest)).f(hVar).g(jVar).e(2436).a());
    }

    public final C8971l<Void> b(LocationRequest locationRequest, na.f fVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C6620s.m(looper, "invalid null looper");
        }
        return D(locationRequest, C6537k.a(fVar, looper, na.f.class.getSimpleName()));
    }

    public final C8971l<Void> c(na.f fVar) {
        return p(C6537k.c(fVar, na.f.class.getSimpleName()), 2418).h(C7833q.f50972a, C7829m.f50968a);
    }

    public final C8971l<Location> f() {
        return n(C6545t.a().b(C7830n.f50969a).e(2414).a());
    }

    public final C8971l<Location> h(C8592a aVar, C8960a aVar2) {
        if (aVar2 != null) {
            C6620s.b(!aVar2.a(), "cancellationToken may not be already canceled");
        }
        C8971l<Location> n10 = n(C6545t.a().b(new C7826j(aVar, aVar2)).e(2415).a());
        if (aVar2 == null) {
            return n10;
        }
        C8972m mVar = new C8972m(aVar2);
        n10.i(new C7827k(mVar));
        return mVar.a();
    }

    /* access modifiers changed from: protected */
    public final String s(Context context) {
        return null;
    }

    public C7825i(Context context) {
        super(context, f50959l, a.d.f47997j0, f.a.f48010c);
    }
}
