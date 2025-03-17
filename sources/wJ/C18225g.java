package wJ;

import DI.C15561h;
import DI.C15566m;
import DI.a0;
import DI.h0;
import LI.C16015b;
import YH.C16877v;
import YH.g0;
import cJ.C17069f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17649d;
import nJ.C17656k;

/* renamed from: wJ.g  reason: case insensitive filesystem */
public class C18225g implements C17656k {

    /* renamed from: b  reason: collision with root package name */
    private final C18226h f149158b;

    /* renamed from: c  reason: collision with root package name */
    private final String f149159c;

    public C18225g(C18226h hVar, String... strArr) {
        C17542s.j(hVar, "kind");
        C17542s.j(strArr, "formatParams");
        this.f149158b = hVar;
        String b10 = hVar.b();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(b10, Arrays.copyOf(copyOf, copyOf.length));
        C17542s.i(format, "format(...)");
        this.f149159c = format;
    }

    public Set<C17069f> a() {
        return g0.d();
    }

    public Set<C17069f> c() {
        return g0.d();
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        String format = String.format(C18220b.ERROR_CLASS.b(), Arrays.copyOf(new Object[]{fVar}, 1));
        C17542s.i(format, "format(...)");
        C17069f D10 = C17069f.D(format);
        C17542s.i(D10, "special(...)");
        return new C18219a(D10);
    }

    public Set<C17069f> f() {
        return g0.d();
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        return C16877v.n();
    }

    /* renamed from: h */
    public Set<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return g0.c(new C18221c(C18230l.f149170a.h()));
    }

    /* renamed from: i */
    public Set<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        return C18230l.f149170a.j();
    }

    /* access modifiers changed from: protected */
    public final String j() {
        return this.f149159c;
    }

    public String toString() {
        return "ErrorScope{" + this.f149159c + '}';
    }
}
