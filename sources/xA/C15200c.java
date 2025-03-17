package xA;

import XH.t;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vA.C15127d;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LxA/c;", "LxA/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LvA/d;", "mode", "LXH/N;", "a", "(LvA/d;)V", "Landroid/content/Context;", "Landroid/app/UiModeManager;", "c", "()Landroid/app/UiModeManager;", "uiModeManager", "", "b", "()Z", "isAvailable", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xA.c  reason: case insensitive filesystem */
public final class C15200c implements C15198a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f131832a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xA.c$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f131833a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                vA.d[] r0 = vA.C15127d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                vA.d r1 = vA.C15127d.Day     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                vA.d r1 = vA.C15127d.Night     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                vA.d r1 = vA.C15127d.Auto     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f131833a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xA.C15200c.a.<clinit>():void");
        }
    }

    public C15200c(Context context) {
        C17542s.j(context, "context");
        this.f131832a = context;
    }

    private final UiModeManager c() {
        Object systemService = this.f131832a.getSystemService("uimode");
        C17542s.h(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        return (UiModeManager) systemService;
    }

    public void a(C15127d dVar) {
        C17542s.j(dVar, "mode");
        if (Build.VERSION.SDK_INT >= 31) {
            UiModeManager c10 = c();
            int i10 = a.f131833a[dVar.ordinal()];
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    if (i10 == 3) {
                        i11 = 0;
                    } else {
                        throw new t();
                    }
                }
            }
            c10.setApplicationNightMode(i11);
            c().getCurrentModeType();
        }
    }

    public boolean b() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
