package androidx.camera.core.impl;

import C.C4387c0;
import C.C4410s;
import C.s0;
import android.os.SystemClock;
import androidx.camera.core.impl.T;

public final class L implements s0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f16740a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16741b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16742c;

    /* renamed from: d  reason: collision with root package name */
    private final Throwable f16743d;

    public L(long j10, int i10, Throwable th2) {
        this.f16742c = SystemClock.elapsedRealtime() - j10;
        this.f16741b = i10;
        if (th2 instanceof T.b) {
            this.f16740a = 2;
            this.f16743d = th2;
        } else if (th2 instanceof C4387c0) {
            Throwable cause = th2.getCause();
            th2 = cause != null ? cause : th2;
            this.f16743d = th2;
            if (th2 instanceof C4410s) {
                this.f16740a = 2;
            } else if (th2 instanceof IllegalArgumentException) {
                this.f16740a = 1;
            } else {
                this.f16740a = 0;
            }
        } else {
            this.f16740a = 0;
            this.f16743d = th2;
        }
    }

    public int i() {
        return this.f16740a;
    }

    public Throwable j() {
        return this.f16743d;
    }

    public long k() {
        return this.f16742c;
    }
}
