package BJ;

import AI.C15434o;
import BJ.C15471f;
import DI.C15579z;
import DI.u0;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import zJ.C18755d;

/* renamed from: BJ.j  reason: case insensitive filesystem */
final class C15475j implements C15471f {

    /* renamed from: a  reason: collision with root package name */
    public static final C15475j f133322a = new C15475j();

    /* renamed from: b  reason: collision with root package name */
    private static final String f133323b = "second parameter must be of type KProperty<*> or its supertype";

    private C15475j() {
    }

    public boolean a(C15579z zVar) {
        C17542s.j(zVar, "functionDescriptor");
        u0 u0Var = zVar.j().get(1);
        C15434o.b bVar = C15434o.f133002k;
        C17542s.g(u0Var);
        C18096U a10 = bVar.a(C17506e.s(u0Var));
        if (a10 == null) {
            return false;
        }
        C18096U type = u0Var.getType();
        C17542s.i(type, "getType(...)");
        return C18755d.w(a10, C18755d.A(type));
    }

    public String b(C15579z zVar) {
        return C15471f.a.a(this, zVar);
    }

    public String getDescription() {
        return f133323b;
    }
}
