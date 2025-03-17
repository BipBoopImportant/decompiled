package a9;

import D8.c;
import F8.e;
import F8.g;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.h4  reason: case insensitive filesystem */
public final class C6842h4 {

    /* renamed from: a  reason: collision with root package name */
    public final C6806d0 f42593a;

    /* renamed from: b  reason: collision with root package name */
    public com.contentsquare.android.core.features.config.model.a f42594b = com.contentsquare.android.core.features.config.model.a.HIGH;

    /* renamed from: c  reason: collision with root package name */
    public e f42595c;

    /* renamed from: d  reason: collision with root package name */
    public final c f42596d;

    /* renamed from: a9.h4$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42597a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                F8.e[] r0 = F8.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                F8.e r1 = F8.e.OFFLINE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                F8.e r1 = F8.e.CONNECTIVITY_ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                F8.e r1 = F8.e.WIFI     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f42597a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.C6842h4.a.<clinit>():void");
        }
    }

    public C6842h4(g gVar, C6806d0 d0Var) {
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(d0Var, "eventsProvidersManager");
        this.f42593a = d0Var;
        this.f42595c = gVar.b();
        this.f42596d = new c("QualityChangeProvider");
    }
}
