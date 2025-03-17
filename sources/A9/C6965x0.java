package a9;

import E8.b;
import E8.c;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.contentsquare.android.sdk.A;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.x0  reason: case insensitive filesystem */
public final class C6965x0 implements c.b, ComponentCallbacks, ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    public final c f42931a;

    /* renamed from: b  reason: collision with root package name */
    public final A f42932b;

    /* renamed from: c  reason: collision with root package name */
    public final D8.c f42933c = new D8.c("SessionReplayStartStopController");

    /* renamed from: d  reason: collision with root package name */
    public boolean f42934d;

    /* renamed from: e  reason: collision with root package name */
    public final int f42935e;

    /* renamed from: f  reason: collision with root package name */
    public final int f42936f;

    /* renamed from: a9.x0$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42937a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                E8.b[] r0 = E8.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                E8.b r1 = E8.b.SESSION_REPLAY_FORCE_START     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                E8.b r1 = E8.b.SCREEN_NUMBER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                E8.b r1 = E8.b.RAW_CONFIGURATION_AS_JSON     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                E8.b r1 = E8.b.TRACKING_ENABLE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                E8.b r1 = E8.b.FORGET_ME     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                E8.b r1 = E8.b.PAUSE_TRACKING     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                E8.b r1 = E8.b.LOCAL_SESSION_REPLAY_MODE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f42937a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.C6965x0.a.<clinit>():void");
        }
    }

    public C6965x0(Application application, c cVar, A a10) {
        C17542s.j(application, "application");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(a10, "startStopRules");
        this.f42931a = cVar;
        this.f42932b = a10;
        this.f42935e = cVar.d(b.SESSION_ID, 0);
        this.f42936f = cVar.d(b.SCREEN_NUMBER, 0);
        application.registerComponentCallbacks(this);
        cVar.n(this);
    }

    public final void o(b bVar) {
        C17542s.j(bVar, "key");
        boolean z10 = false;
        switch (a.f42937a[bVar.ordinal()]) {
            case 1:
                this.f42932b.a(false, false, this.f42934d);
                return;
            case 2:
                boolean z11 = this.f42931a.d(b.PAUSED_SESSION_ID, -1) != -1;
                int d10 = this.f42931a.d(b.SESSION_ID, 0);
                int d11 = this.f42931a.d(b.SCREEN_NUMBER, 0);
                int i10 = this.f42935e;
                boolean z12 = d10 != i10 && d11 == 1;
                boolean z13 = d10 == i10 && d11 == this.f42936f + 1;
                if (z11 || z12 || z13) {
                    z10 = true;
                }
                if (z12) {
                    this.f42933c.f("New session detected. New session/screen: " + d10 + '/' + d11 + ". Started with: " + this.f42935e + '/' + this.f42936f);
                }
                if (z13) {
                    this.f42933c.f("Session resumed. Session/screen: " + d10 + '/' + d11 + ". Started with: " + this.f42935e + '/' + this.f42936f);
                }
                this.f42932b.a(z10, z12, this.f42934d);
                return;
            case 3:
                this.f42932b.a(true, false, this.f42934d);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
                this.f42932b.a(true, true, this.f42934d);
                return;
            default:
                return;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C17542s.j(configuration, "newConfig");
    }

    public final void onLowMemory() {
        this.f42933c.j("Low Memory Detected");
        U8.a.f40370a.d("sr.low_memory", Boolean.TRUE);
        this.f42934d = true;
        this.f42932b.a(false, false, true);
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 15) {
            this.f42933c.j("Low Memory Detected");
            U8.a.f40370a.d("sr.trim_memory", Boolean.TRUE);
            this.f42934d = true;
            this.f42932b.a(false, false, true);
        }
    }
}
