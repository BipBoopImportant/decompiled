package ha;

import ed.C9641i;

/* renamed from: ha.p8  reason: case insensitive filesystem */
public final /* synthetic */ class C8107p8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C8136s8 f52718a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8005f6 f52719b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f52720c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f52721d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C9641i f52722e;

    public /* synthetic */ C8107p8(C8136s8 s8Var, C8005f6 f6Var, Object obj, long j10, C9641i iVar) {
        this.f52718a = s8Var;
        this.f52719b = f6Var;
        this.f52720c = obj;
        this.f52721d = j10;
        this.f52722e = iVar;
    }

    public final void run() {
        this.f52718a.h(this.f52719b, this.f52720c, this.f52721d, this.f52722e);
    }
}
