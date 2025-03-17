package androidx.camera.core.impl;

import C.C4400j;
import C.C4402k;
import C.C4408p;
import C.H0;
import java.util.Collection;

public interface J extends C4400j, H0.b {

    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);
        
        private final boolean mHoldsCameraSlot;

        private a(boolean z10) {
            this.mHoldsCameraSlot = z10;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.mHoldsCameraSlot;
        }
    }

    C4402k a() {
        return d();
    }

    C4408p b() {
        return j();
    }

    F d();

    B f() {
        return E.a();
    }

    void g(boolean z10) {
    }

    void h(Collection<H0> collection);

    void i(Collection<H0> collection);

    I j();

    boolean m() {
        return b().f() == 0;
    }

    void o(B b10) {
    }

    H0<a> p();

    boolean q() {
        return true;
    }

    void r(boolean z10) {
    }
}
