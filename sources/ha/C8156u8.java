package ha;

import K9.C6618p;
import K9.C6624w;
import K9.C6625x;
import K9.C6626y;
import K9.C6627z;
import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ha.u8  reason: case insensitive filesystem */
public final class C8156u8 {

    /* renamed from: a  reason: collision with root package name */
    private final C6626y f52830a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f52831b = new AtomicLong(-1);

    C8156u8(Context context, String str) {
        this.f52830a = C6625x.b(context, C6627z.a().b("mlkit:vision").a());
    }

    public static C8156u8 a(Context context) {
        return new C8156u8(context, "mlkit:vision");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(long j10, Exception exc) {
        this.f52831b.set(j10);
    }

    public final synchronized void c(int i10, int i11, long j10, long j11) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f52831b.get() != -1) {
                if (elapsedRealtime - this.f52831b.get() <= TimeUnit.MINUTES.toMillis(30)) {
                    return;
                }
            }
            this.f52830a.g(new C6624w(0, Arrays.asList(new C6618p[]{new C6618p(i10, i11, 0, j10, j11, (String) null, (String) null, 0)}))).e(new C8146t8(this, elapsedRealtime));
        }
    }
}
