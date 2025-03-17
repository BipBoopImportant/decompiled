package c0;

import C.C4391e0;
import a0.h0;
import android.os.Build;
import androidx.camera.core.impl.h1;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f22977a;

    /* renamed from: b  reason: collision with root package name */
    private final h1 f22978b;

    /* renamed from: c  reason: collision with root package name */
    private final CameraUseInconsistentTimebaseQuirk f22979c;

    /* renamed from: d  reason: collision with root package name */
    private long f22980d = -1;

    /* renamed from: e  reason: collision with root package name */
    private h1 f22981e;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22982a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.core.impl.h1[] r0 = androidx.camera.core.impl.h1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22982a = r0
                androidx.camera.core.impl.h1 r1 = androidx.camera.core.impl.h1.REALTIME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22982a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.h1 r1 = androidx.camera.core.impl.h1.UPTIME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.e.a.<clinit>():void");
        }
    }

    public e(h0 h0Var, h1 h1Var, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f22977a = h0Var;
        this.f22978b = h1Var;
        this.f22979c = cameraUseInconsistentTimebaseQuirk;
    }

    private long a() {
        long j10 = Long.MAX_VALUE;
        long j11 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            long b10 = this.f22977a.b();
            long a10 = this.f22977a.a();
            long b11 = this.f22977a.b();
            long j12 = b11 - b10;
            if (i10 == 0 || j12 < j10) {
                j11 = a10 - ((b10 + b11) >> 1);
                j10 = j12;
            }
        }
        return Math.max(0, j11);
    }

    private boolean c() {
        return this.f22977a.a() - this.f22977a.b() > 3000000;
    }

    private boolean d(long j10) {
        return Math.abs(j10 - this.f22977a.a()) < Math.abs(j10 - this.f22977a.b());
    }

    private h1 e(long j10) {
        boolean z10;
        String str;
        if (this.f22979c != null) {
            C4391e0.l("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            z10 = false;
        } else if (!c()) {
            return this.f22978b;
        } else {
            z10 = true;
        }
        h1 h1Var = d(j10) ? h1.REALTIME : h1.UPTIME;
        if (!z10 || h1Var == this.f22978b) {
            C4391e0.a("VideoTimebaseConverter", "Detect input timebase = " + h1Var);
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                str = ", SOC: " + Build.SOC_MODEL;
            } else {
                str = "";
            }
            C4391e0.c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", new Object[]{Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i10), str, this.f22978b, h1Var}));
        }
        return h1Var;
    }

    public long b(long j10) {
        if (this.f22981e == null) {
            this.f22981e = e(j10);
        }
        int i10 = a.f22982a[this.f22981e.ordinal()];
        if (i10 == 1) {
            if (this.f22980d == -1) {
                this.f22980d = a();
                C4391e0.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f22980d);
            }
            return j10 - this.f22980d;
        } else if (i10 == 2) {
            return j10;
        } else {
            throw new AssertionError("Unknown timebase: " + this.f22981e);
        }
    }
}
