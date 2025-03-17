package C;

import android.content.Context;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;

/* renamed from: C.v  reason: case insensitive filesystem */
public final /* synthetic */ class C4413v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4414w f5425a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f5426b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f5427c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5428d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f5429e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c.a f5430f;

    public /* synthetic */ C4413v(C4414w wVar, Executor executor, long j10, int i10, Context context, c.a aVar) {
        this.f5425a = wVar;
        this.f5426b = executor;
        this.f5427c = j10;
        this.f5428d = i10;
        this.f5429e = context;
        this.f5430f = aVar;
    }

    public final void run() {
        this.f5425a.m(this.f5426b, this.f5427c, this.f5428d, this.f5429e, this.f5430f);
    }
}
