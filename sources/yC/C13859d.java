package YC;

import XH.C16796C;
import XH.t;
import YH.X;
import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"LYC/d;", "LYC/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LYC/e;", "uiModeType", "LYC/a;", "a", "(LYC/e;)LYC/a;", "c", "", "", "b", "(LYC/e;)Ljava/util/Map;", "Landroid/content/Context;", "ui-mode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YC.d  reason: case insensitive filesystem */
public final class C13859d implements C13857b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f118080b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f118081c = "dark";

    /* renamed from: d  reason: collision with root package name */
    private static final String f118082d = "light";

    /* renamed from: e  reason: collision with root package name */
    private static final String f118083e = "ikea_theme";

    /* renamed from: f  reason: collision with root package name */
    private static final String f118084f = "dark_mode";

    /* renamed from: a  reason: collision with root package name */
    private final Context f118085a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LYC/d$a;", "", "<init>", "()V", "", "UI_MODE_VALUE_DARK", "Ljava/lang/String;", "UI_MODE_VALUE_LIGHT", "UI_MODE_KEY", "LEGACY_UI_MODE_KEY", "ui-mode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YC.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YC.d$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f118086a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                YC.e[] r0 = YC.C13860e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                YC.e r1 = YC.C13860e.LIGHT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                YC.e r1 = YC.C13860e.DARK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                YC.e r1 = YC.C13860e.AUTO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f118086a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: YC.C13859d.b.<clinit>():void");
        }
    }

    public C13859d(Context context) {
        C17542s.j(context, "context");
        this.f118085a = context;
    }

    public C13856a a(C13860e eVar) {
        C17542s.j(eVar, "uiModeType");
        int i10 = b.f118086a[eVar.ordinal()];
        if (i10 == 1) {
            return new C13856a(f118083e, f118082d);
        }
        if (i10 == 2) {
            return new C13856a(f118083e, f118081c);
        }
        if (i10 == 3) {
            return new C13856a(f118083e, C13858c.b(this.f118085a) ? f118081c : f118082d);
        }
        throw new t();
    }

    public Map<String, String> b(C13860e eVar) {
        C17542s.j(eVar, "uiModeType");
        return X.m(C16796C.a(f118083e, a(eVar).b()), C16796C.a(f118084f, c(eVar).b()));
    }

    public C13856a c(C13860e eVar) {
        C17542s.j(eVar, "uiModeType");
        int i10 = b.f118086a[eVar.ordinal()];
        if (i10 == 1) {
            return new C13856a(f118084f, "false");
        }
        if (i10 == 2) {
            return new C13856a(f118084f, "true");
        }
        if (i10 == 3) {
            return new C13856a(f118084f, String.valueOf(C13858c.b(this.f118085a)));
        }
        throw new t();
    }
}
