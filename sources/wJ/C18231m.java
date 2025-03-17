package wJ;

import DI.C15561h;
import DI.C15566m;
import DI.a0;
import DI.h0;
import LI.C16015b;
import cJ.C17069f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17649d;

/* renamed from: wJ.m  reason: case insensitive filesystem */
public final class C18231m extends C18225g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18231m(C18226h hVar, String... strArr) {
        super(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        C17542s.j(hVar, "kind");
        C17542s.j(strArr, "formatParams");
    }

    public Set<C17069f> a() {
        throw new IllegalStateException();
    }

    public Set<C17069f> c() {
        throw new IllegalStateException();
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    public Set<C17069f> f() {
        throw new IllegalStateException();
    }

    public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(dVar, "kindFilter");
        C17542s.j(lVar, "nameFilter");
        throw new IllegalStateException(j());
    }

    /* renamed from: h */
    public Set<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    /* renamed from: i */
    public Set<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
