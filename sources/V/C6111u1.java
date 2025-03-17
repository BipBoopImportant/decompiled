package v;

import C.B;
import androidx.concurrent.futures.c;

/* renamed from: v.u1  reason: case insensitive filesystem */
public final /* synthetic */ class C6111u1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6123y1 f30709a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.a f30710b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ B f30711c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f30712d;

    public /* synthetic */ C6111u1(C6123y1 y1Var, c.a aVar, B b10, long j10) {
        this.f30709a = y1Var;
        this.f30710b = aVar;
        this.f30711c = b10;
        this.f30712d = j10;
    }

    public final void run() {
        this.f30709a.R(this.f30710b, this.f30711c, this.f30712d);
    }
}
