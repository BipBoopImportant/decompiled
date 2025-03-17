package uJ;

import EI.C15644c;
import EI.C15646e;
import HJ.C15854t;
import YH.C16877v;
import fJ.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import yJ.C18742k;
import yJ.C18743l;

/* renamed from: uJ.f0  reason: case insensitive filesystem */
public abstract class C18113f0 extends P0 implements C18742k, C18743l {
    public C18113f0() {
        super((DefaultConstructorMarker) null);
    }

    public abstract C18113f0 U0(boolean z10);

    public abstract C18113f0 V0(u0 u0Var);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (C15644c O10 : getAnnotations()) {
            C15854t.p(sb2, "[", n.O(n.f143183k, O10, (C15646e) null, 2, (Object) null), "] ");
        }
        sb2.append(N0());
        if (!L0().isEmpty()) {
            C16877v.E0(L0(), sb2, ", ", "<", ">", 0, (CharSequence) null, (C17642l) null, 112, (Object) null);
        }
        if (O0()) {
            sb2.append("?");
        }
        return sb2.toString();
    }
}
