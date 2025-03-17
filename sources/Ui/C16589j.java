package UI;

import XH.t;
import kotlin.jvm.internal.C17542s;
import uJ.C18078B;
import uJ.C18087K;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18107c0;
import uJ.C18113f0;
import uJ.M0;
import uJ.O0;
import uJ.P0;
import uJ.u0;
import zJ.C18755d;

/* renamed from: UI.j  reason: case insensitive filesystem */
public final class C16589j extends C18078B implements C18107c0 {

    /* renamed from: b  reason: collision with root package name */
    private final C18113f0 f139044b;

    public C16589j(C18113f0 f0Var) {
        C17542s.j(f0Var, "delegate");
        this.f139044b = f0Var;
    }

    private final C18113f0 Z0(C18113f0 f0Var) {
        C18113f0 U02 = f0Var.U0(false);
        return !C18755d.y(f0Var) ? U02 : new C16589j(U02);
    }

    public boolean F0() {
        return true;
    }

    public boolean O0() {
        return false;
    }

    public C18096U S(C18096U u10) {
        C17542s.j(u10, "replacement");
        P0 Q02 = u10.Q0();
        if (!C18755d.y(Q02) && !M0.l(Q02)) {
            return Q02;
        }
        if (Q02 instanceof C18113f0) {
            return Z0((C18113f0) Q02);
        }
        if (Q02 instanceof C18087K) {
            C18087K k10 = (C18087K) Q02;
            return O0.d(C18099X.e(Z0(k10.V0()), Z0(k10.W0())), O0.a(Q02));
        }
        throw new t();
    }

    /* renamed from: U0 */
    public C18113f0 R0(boolean z10) {
        return z10 ? W0().U0(true) : this;
    }

    /* access modifiers changed from: protected */
    public C18113f0 W0() {
        return this.f139044b;
    }

    /* renamed from: a1 */
    public C16589j V0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return new C16589j(W0().V0(u0Var));
    }

    /* renamed from: b1 */
    public C16589j Y0(C18113f0 f0Var) {
        C17542s.j(f0Var, "delegate");
        return new C16589j(f0Var);
    }
}
