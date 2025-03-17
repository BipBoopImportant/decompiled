package dc;

import K9.C6607e;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;

/* renamed from: dc.d  reason: case insensitive filesystem */
public class C9618d extends f<a.d.c> {

    /* renamed from: k  reason: collision with root package name */
    private static final a.g<e> f72379k;

    /* renamed from: l  reason: collision with root package name */
    private static final a.C0821a<e, a.d.c> f72380l;

    /* renamed from: m  reason: collision with root package name */
    static final com.google.android.gms.common.api.a<a.d.c> f72381m;

    /* renamed from: dc.d$a */
    class a extends a.C0821a<e, a.d.c> {
        a() {
        }

        /* renamed from: c */
        public e b(Context context, Looper looper, C6607e eVar, a.d.c cVar, g.a aVar, g.b bVar) {
            return new e(context, looper, eVar, aVar, bVar);
        }
    }

    static {
        a.g<e> gVar = new a.g<>();
        f72379k = gVar;
        a aVar = new a();
        f72380l = aVar;
        f72381m = new com.google.android.gms.common.api.a<>("DynamicLinks.API", aVar, gVar);
    }

    public C9618d(Context context) {
        super(context, f72381m, a.d.f47997j0, f.a.f48010c);
    }
}
