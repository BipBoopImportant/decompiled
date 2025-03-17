package L3;

import L3.C6634D;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6634D.a f38244a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f38245b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f38246c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f38247d;

    public /* synthetic */ t(C6634D.a aVar, String str, long j10, long j11) {
        this.f38244a = aVar;
        this.f38245b = str;
        this.f38246c = j10;
        this.f38247d = j11;
    }

    public final void run() {
        this.f38244a.q(this.f38245b, this.f38246c, this.f38247d);
    }
}
