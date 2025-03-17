package Fb;

import K9.C6620s;

public class l extends Exception {
    @Deprecated
    protected l() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(str);
        C6620s.g(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, Throwable th2) {
        super(str, th2);
        C6620s.g(str, "Detail message must not be empty");
    }
}
