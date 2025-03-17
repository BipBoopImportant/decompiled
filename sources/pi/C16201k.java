package PI;

import DI.C15538I;
import MI.C16044E;
import RI.e;
import XH.C16824o;
import kotlin.jvm.internal.C17542s;
import tJ.C17994n;

/* renamed from: PI.k  reason: case insensitive filesystem */
public final class C16201k {

    /* renamed from: a  reason: collision with root package name */
    private final C16194d f137188a;

    /* renamed from: b  reason: collision with root package name */
    private final C16206p f137189b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o<C16044E> f137190c;

    /* renamed from: d  reason: collision with root package name */
    private final e f137191d;

    public C16201k(C16194d dVar, C16206p pVar, C16824o<C16044E> oVar) {
        C17542s.j(dVar, "components");
        C17542s.j(pVar, "typeParameterResolver");
        C17542s.j(oVar, "delegateForDefaultTypeQualifiers");
        this.f137188a = dVar;
        this.f137189b = pVar;
        this.f137190c = oVar;
        this.f137191d = new e(this, pVar);
    }

    public final C16194d a() {
        return this.f137188a;
    }

    public final C16044E b() {
        return this.f137190c.getValue();
    }

    public final C16824o<C16044E> c() {
        return this.f137190c;
    }

    public final C15538I d() {
        return this.f137188a.m();
    }

    public final C17994n e() {
        return this.f137188a.u();
    }

    public final C16206p f() {
        return this.f137189b;
    }

    public final e g() {
        return this.f137191d;
    }
}
