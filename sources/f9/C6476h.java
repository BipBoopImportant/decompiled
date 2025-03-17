package F9;

import java.util.concurrent.ScheduledFuture;
import xa.C8965f;
import xa.C8971l;

/* renamed from: F9.h  reason: case insensitive filesystem */
public final /* synthetic */ class C6476h implements C8965f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6471c f35576a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f35577b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f35578c;

    public /* synthetic */ C6476h(C6471c cVar, String str, ScheduledFuture scheduledFuture) {
        this.f35576a = cVar;
        this.f35577b = str;
        this.f35578c = scheduledFuture;
    }

    public final void onComplete(C8971l lVar) {
        this.f35576a.h(this.f35577b, this.f35578c, lVar);
    }
}
