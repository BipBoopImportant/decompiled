package C3;

import C3.C6417h;
import J3.j;
import android.net.Uri;
import java.util.Map;
import kb.e0;
import nb.C10076f;
import q3.w;
import t3.C5950a;
import t3.N;
import w3.g;
import w3.m;

/* renamed from: C3.l  reason: case insensitive filesystem */
public final class C6421l implements w {

    /* renamed from: a  reason: collision with root package name */
    private final Object f33656a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private w.f f33657b;

    /* renamed from: c  reason: collision with root package name */
    private u f33658c;

    /* renamed from: d  reason: collision with root package name */
    private g.a f33659d;

    /* renamed from: e  reason: collision with root package name */
    private String f33660e;

    /* renamed from: f  reason: collision with root package name */
    private j f33661f;

    private u b(w.f fVar) {
        g.a aVar = this.f33659d;
        if (aVar == null) {
            aVar = new m.b().c(this.f33660e);
        }
        Uri uri = fVar.f28370c;
        K k10 = new K(uri == null ? null : uri.toString(), fVar.f28375h, aVar);
        e0<Map.Entry<String, String>> q10 = fVar.f28372e.entrySet().iterator();
        while (q10.hasNext()) {
            Map.Entry next = q10.next();
            k10.c((String) next.getKey(), (String) next.getValue());
        }
        C6417h.b e10 = new C6417h.b().f(fVar.f28368a, J.f33562d).c(fVar.f28373f).d(fVar.f28374g).e(C10076f.l(fVar.f28377j));
        j jVar = this.f33661f;
        if (jVar != null) {
            e10.b(jVar);
        }
        C6417h a10 = e10.a(k10);
        a10.F(0, fVar.c());
        return a10;
    }

    public u a(w wVar) {
        u uVar;
        C5950a.e(wVar.f28319b);
        w.f fVar = wVar.f28319b.f28413c;
        if (fVar == null) {
            return u.f33682a;
        }
        synchronized (this.f33656a) {
            try {
                if (!N.d(fVar, this.f33657b)) {
                    this.f33657b = fVar;
                    this.f33658c = b(fVar);
                }
                uVar = (u) C5950a.e(this.f33658c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }
}
