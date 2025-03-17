package ga;

import K9.C6617o;
import Zc.C9394c;
import Zc.C9398g;
import Zc.n;
import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import xa.C8971l;

public final class O {

    /* renamed from: k  reason: collision with root package name */
    private static final C7915q f51365k = C7915q.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a  reason: collision with root package name */
    private final String f51366a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51367b;

    /* renamed from: c  reason: collision with root package name */
    private final I f51368c;

    /* renamed from: d  reason: collision with root package name */
    private final n f51369d;

    /* renamed from: e  reason: collision with root package name */
    private final C8971l f51370e;

    /* renamed from: f  reason: collision with root package name */
    private final C8971l f51371f;

    /* renamed from: g  reason: collision with root package name */
    private final String f51372g;

    /* renamed from: h  reason: collision with root package name */
    private final int f51373h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f51374i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Map f51375j = new HashMap();

    public O(Context context, n nVar, I i10, String str) {
        this.f51366a = context.getPackageName();
        this.f51367b = C9394c.a(context);
        this.f51369d = nVar;
        this.f51368c = i10;
        Z.a();
        this.f51372g = str;
        this.f51370e = C9398g.a().b(new M(this));
        C9398g a10 = C9398g.a();
        nVar.getClass();
        this.f51371f = a10.b(new N(nVar));
        C7915q qVar = f51365k;
        this.f51373h = qVar.containsKey(str) ? DynamiteModule.c(context, (String) qVar.get(str)) : -1;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a() {
        return C6617o.a().b(this.f51372g);
    }
}
