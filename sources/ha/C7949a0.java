package ha;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ha.a0  reason: case insensitive filesystem */
final class C7949a0 extends AbstractCollection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C7959b0 f52408a;

    C7949a0(C7959b0 b0Var) {
        this.f52408a = b0Var;
    }

    public final void clear() {
        this.f52408a.clear();
    }

    public final Iterator iterator() {
        C7959b0 b0Var = this.f52408a;
        Map m10 = b0Var.m();
        return m10 != null ? m10.values().iterator() : new U(b0Var);
    }

    public final int size() {
        return this.f52408a.size();
    }
}
