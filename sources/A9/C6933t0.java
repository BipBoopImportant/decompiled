package a9;

import G8.i;
import com.google.ar.core.ImageMetadata;
import d9.F;
import d9.G;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.t0  reason: case insensitive filesystem */
public final class C6933t0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f42859a = ImageMetadata.LENS_APERTURE;

    /* renamed from: b  reason: collision with root package name */
    public final G.b f42860b;

    /* renamed from: c  reason: collision with root package name */
    public C6932t f42861c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f42862d;

    public C6933t0(G.b bVar) {
        C17542s.j(bVar, "position");
        this.f42860b = bVar;
        this.f42861c = new C6932t(bVar);
        this.f42862d = new LinkedHashSet();
    }

    public final synchronized M1 a(String str) {
        M1 m12;
        C17542s.j(str, "url");
        C6932t tVar = this.f42861c;
        tVar.getClass();
        C17542s.j(str, "url");
        m12 = new M1(str, i.f36274a.a(tVar.a(), tVar.f42639a));
        tVar.f42639a.reset();
        return m12;
    }

    public final synchronized void b() {
        this.f42861c = new C6932t(this.f42860b);
        for (C6780A a10 : this.f42862d) {
            a10.a();
        }
    }

    public final synchronized void c(C6780A a10) {
        C17542s.j(a10, "listener");
        this.f42862d.add(a10);
    }

    public final synchronized void d(List<? extends C6921r4> list) {
        C17542s.j(list, "srEvents");
        for (C6921r4 r4Var : list) {
            C6932t tVar = this.f42861c;
            tVar.getClass();
            C17542s.j(r4Var, "event");
            F c10 = r4Var.c();
            tVar.f42857b.E(c10);
            tVar.f42858c += c10.toByteArray().length;
            for (C6780A a10 : this.f42862d) {
                a10.a(r4Var);
            }
        }
    }
}
