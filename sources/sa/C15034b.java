package sA;

import Ae.e;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vA.C15125b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LsA/b;", "LsA/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LvA/b;", "mode", "LXH/v;", "", "b", "(LvA/b;)LXH/v;", "LXH/N;", "a", "(LvA/b;)V", "LAe/e;", "getAnalytics", "()LAe/e;", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sA.b  reason: case insensitive filesystem */
public final class C15034b implements C15033a {

    /* renamed from: a  reason: collision with root package name */
    private final e f130926a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sA.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f130927a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                vA.b[] r0 = vA.C15125b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                vA.b r1 = vA.C15125b.Light     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                vA.b r1 = vA.C15125b.Dark     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                vA.b r1 = vA.C15125b.System     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f130927a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sA.C15034b.a.<clinit>():void");
        }
    }

    public C15034b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f130926a = eVar;
    }

    private final v<String, String> b(C15125b bVar) {
        String str;
        int i10 = a.f130927a[bVar.ordinal()];
        if (i10 == 1) {
            str = "app_theme_light";
        } else if (i10 == 2) {
            str = "app_theme_dark";
        } else if (i10 == 3) {
            str = "app_theme_system";
        } else {
            throw new t();
        }
        return C16796C.a("component_value", str);
    }

    public void a(C15125b bVar) {
        C17542s.j(bVar, "mode");
        e.c.b(this.f130926a, Interaction$Component.APP_THEME, (String) null, X.f(b(bVar)), (e.b) null, 10, (Object) null);
    }
}
