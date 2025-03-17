package qJ;

import DI.C15538I;
import DI.C15543N;
import EI.C15644c;
import XI.C16829b;
import XI.n;
import ZI.c;
import ZI.e;
import iJ.C17373g;
import kotlin.jvm.internal.C17542s;
import pJ.C17755a;
import uJ.C18096U;

/* renamed from: qJ.f  reason: case insensitive filesystem */
public final class C17818f extends C17813a<C15644c> implements C17817e<C15644c, C17373g<?>> {

    /* renamed from: b  reason: collision with root package name */
    private final C17819g f146550b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17818f(C15538I i10, C15543N n10, C17755a aVar) {
        super(aVar);
        C17542s.j(i10, "module");
        C17542s.j(n10, "notFoundClasses");
        C17542s.j(aVar, "protocol");
        this.f146550b = new C17819g(i10, n10);
    }

    /* renamed from: n */
    public C15644c i(C16829b bVar, c cVar) {
        C17542s.j(bVar, "proto");
        C17542s.j(cVar, "nameResolver");
        return this.f146550b.a(bVar, cVar);
    }

    /* renamed from: o */
    public C17373g<?> a(C17801N n10, n nVar, C18096U u10) {
        C17542s.j(n10, "container");
        C17542s.j(nVar, "proto");
        C17542s.j(u10, "expectedType");
        return null;
    }

    /* renamed from: p */
    public C17373g<?> d(C17801N n10, n nVar, C18096U u10) {
        C17542s.j(n10, "container");
        C17542s.j(nVar, "proto");
        C17542s.j(u10, "expectedType");
        C16829b.C3431b.c cVar = (C16829b.C3431b.c) e.a(nVar, m().b());
        if (cVar == null) {
            return null;
        }
        return this.f146550b.f(u10, cVar, n10.b());
    }
}
