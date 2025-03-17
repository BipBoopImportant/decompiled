package C;

import android.content.Context;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;

/* renamed from: C.u  reason: case insensitive filesystem */
public final /* synthetic */ class C4412u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4414w f5418a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f5419b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Executor f5420c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5421d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c.a f5422e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f5423f;

    public /* synthetic */ C4412u(C4414w wVar, Context context, Executor executor, int i10, c.a aVar, long j10) {
        this.f5418a = wVar;
        this.f5419b = context;
        this.f5420c = executor;
        this.f5421d = i10;
        this.f5422e = aVar;
        this.f5423f = j10;
    }

    public final void run() {
        this.f5418a.n(this.f5419b, this.f5420c, this.f5421d, this.f5422e, this.f5423f);
    }
}
