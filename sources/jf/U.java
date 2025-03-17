package JF;

import android.os.Handler;
import kotlin.jvm.internal.O;
import nI.C17642l;
import q3.E;

public final /* synthetic */ class U implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ E f111299a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C17642l f111300b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Handler f111301c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ O f111302d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f111303e;

    public /* synthetic */ U(E e10, C17642l lVar, Handler handler, O o10, long j10) {
        this.f111299a = e10;
        this.f111300b = lVar;
        this.f111301c = handler;
        this.f111302d = o10;
        this.f111303e = j10;
    }

    public final void run() {
        V.d(this.f111299a, this.f111300b, this.f111301c, this.f111302d, this.f111303e);
    }
}
