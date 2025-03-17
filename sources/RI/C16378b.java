package RI;

import DI.n0;
import YH.g0;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18113f0;
import uJ.L0;

/* renamed from: RI.b  reason: case insensitive filesystem */
public final class C16378b {
    public static final C16377a a(L0 l02, boolean z10, boolean z11, n0 n0Var) {
        C17542s.j(l02, "<this>");
        return new C16377a(l02, (C16379c) null, z11, z10, n0Var != null ? g0.c(n0Var) : null, (C18113f0) null, 34, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C16377a b(L0 l02, boolean z10, boolean z11, n0 n0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            n0Var = null;
        }
        return a(l02, z10, z11, n0Var);
    }
}
