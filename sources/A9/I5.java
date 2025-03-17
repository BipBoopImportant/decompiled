package a9;

import XH.C16796C;
import XH.t;
import XH.v;
import kotlin.jvm.internal.C17542s;

public final class I5 implements C6981z0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6863k1 f42071a;

    public I5(C6863k1 k1Var) {
        C17542s.j(k1Var, "samplingMode");
        this.f42071a = k1Var;
    }

    public final v<String, String> a() {
        String str;
        int ordinal = this.f42071a.ordinal();
        if (ordinal == 0) {
            str = "5";
        } else if (ordinal == 1) {
            str = "7";
        } else {
            throw new t();
        }
        return C16796C.a("rt", str);
    }
}
