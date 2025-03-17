package gd;

import K9.C6612j;
import K9.C6620s;
import android.os.SystemClock;
import fd.C9707a;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* renamed from: gd.a  reason: case insensitive filesystem */
public class C9723a {

    /* renamed from: c  reason: collision with root package name */
    private static final C6612j f73041c = new C6612j("StreamingFormatChecker", "");

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList f73042a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private long f73043b = -1;

    public void a(C9707a aVar) {
        if (aVar.e() == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f73042a.add(Long.valueOf(elapsedRealtime));
            if (this.f73042a.size() > 5) {
                this.f73042a.removeFirst();
            }
            if (this.f73042a.size() == 5 && elapsedRealtime - ((Long) C6620s.l((Long) this.f73042a.peekFirst())).longValue() < 5000) {
                long j10 = this.f73043b;
                if (j10 == -1 || elapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5)) {
                    this.f73043b = elapsedRealtime;
                    f73041c.f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
