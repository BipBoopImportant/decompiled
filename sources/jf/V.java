package JF;

import XH.C16807N;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.C17642l;
import q3.E;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq3/E;", "Lkotlin/Function1;", "", "LXH/N;", "onProgress", "", "pollingFrequency", "b", "(Lq3/E;LnI/l;J)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class V {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"JF/V$a", "Lq3/E$d;", "", "isPlaying", "LXH/N;", "o0", "(Z)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements E.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f111304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O<Runnable> f111305b;

        a(Handler handler, O<Runnable> o10) {
            this.f111304a = handler;
            this.f111305b = o10;
        }

        public void o0(boolean z10) {
            Runnable runnable = null;
            if (z10) {
                Handler handler = this.f111304a;
                T t10 = this.f111305b.f144348a;
                if (t10 == null) {
                    C17542s.z("progressRunnable");
                } else {
                    runnable = (Runnable) t10;
                }
                handler.post(runnable);
                return;
            }
            Handler handler2 = this.f111304a;
            T t11 = this.f111305b.f144348a;
            if (t11 == null) {
                C17542s.z("progressRunnable");
            } else {
                runnable = (Runnable) t11;
            }
            handler2.removeCallbacks(runnable);
        }
    }

    public static final void b(E e10, C17642l<? super Integer, C16807N> lVar, long j10) {
        C17542s.j(e10, "<this>");
        C17542s.j(lVar, "onProgress");
        Handler handler = new Handler(Looper.getMainLooper());
        O o10 = new O();
        o10.f144348a = new U(e10, lVar, handler, o10, j10);
        e10.u(new a(handler, o10));
    }

    public static /* synthetic */ void c(E e10, C17642l lVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 20;
        }
        b(e10, lVar, j10);
    }

    /* access modifiers changed from: private */
    public static final void d(E e10, C17642l lVar, Handler handler, O o10, long j10) {
        Runnable runnable;
        lVar.invoke(Integer.valueOf((int) ((float) Math.ceil((double) ((((float) e10.h0()) * 100.0f) / ((float) e10.a()))))));
        T t10 = o10.f144348a;
        if (t10 == null) {
            C17542s.z("progressRunnable");
            runnable = null;
        } else {
            runnable = (Runnable) t10;
        }
        handler.postDelayed(runnable, j10);
    }
}
