package F8;

import G8.e;
import HJ.C15846l;
import HJ.C15854t;
import android.app.Application;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u0003\u001a(*BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00108\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b8\u0006@BX\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010:\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b8\u0006@BX\u000e¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b-\u00107R$\u0010?\u001a\u00020;2\u0006\u00103\u001a\u00020;8\u0006@BX\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0011\u0010F\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\bA\u0010ER\u0011\u0010H\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bG\u0010!R\u0013\u0010I\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0013\u0010J\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b/\u0010!R\u0011\u0010K\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b4\u0010!R\u0011\u0010L\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b9\u00107R\u0011\u0010N\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bM\u0010!R\u0011\u0010P\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bO\u0010!R\u0011\u0010S\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\b(\u0010RR\u0011\u0010W\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"LF8/g;", "", "Landroid/app/Application;", "application", "Landroid/util/DisplayMetrics;", "metrics", "LG8/d;", "buildInformation", "LF8/i;", "networkInfoProvider", "LG8/a;", "buildConfigInstantiable", "LG8/e;", "buildInstantiable", "<init>", "(Landroid/app/Application;Landroid/util/DisplayMetrics;LG8/d;LF8/i;LG8/a;LG8/e;)V", "LF8/j;", "listener", "LXH/N;", "s", "(LF8/j;)V", "Lorg/json/JSONObject;", "p", "(LG8/d;)Lorg/json/JSONObject;", "x", "()Lorg/json/JSONObject;", "a", "", "pixels", "r", "(I)I", "", "w", "()Ljava/lang/String;", "t", "v", "q", "u", "()V", "Landroid/app/Application;", "b", "Landroid/util/DisplayMetrics;", "c", "LG8/d;", "()LG8/d;", "d", "LF8/i;", "e", "LG8/a;", "f", "LG8/e;", "<set-?>", "g", "I", "k", "()I", "deviceWidth", "h", "deviceHeight", "", "i", "F", "()F", "deviceScale", "LD8/c;", "j", "LD8/c;", "logger", "LF8/g$b;", "()LF8/g$b;", "deviceType", "l", "networkOperator", "deviceModel", "deviceManufacturer", "deviceOs", "deviceOsApi", "n", "userLanguage", "o", "userTimezone", "LF8/e;", "()LF8/e;", "activeConnectionType", "LF8/g$c;", "m", "()LF8/g$c;", "screenOrientation", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: k  reason: collision with root package name */
    public static final a f35521k = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Application f35522a;

    /* renamed from: b  reason: collision with root package name */
    private final DisplayMetrics f35523b;

    /* renamed from: c  reason: collision with root package name */
    private final G8.d f35524c;

    /* renamed from: d  reason: collision with root package name */
    private final i f35525d;

    /* renamed from: e  reason: collision with root package name */
    private final G8.a f35526e;

    /* renamed from: f  reason: collision with root package name */
    private final e f35527f;

    /* renamed from: g  reason: collision with root package name */
    private int f35528g;

    /* renamed from: h  reason: collision with root package name */
    private int f35529h;

    /* renamed from: i  reason: collision with root package name */
    private float f35530i;

    /* renamed from: j  reason: collision with root package name */
    private final D8.c f35531j;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00118\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00118\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"LF8/g$a;", "", "<init>", "()V", "", "ANDROID_SDK_DEBUG", "Ljava/lang/String;", "ANDROID_SDK_IDENTIFIER", "ANDROID_SDK_RELEASE", "BATCH_APP_NAME", "BATCH_SDK_FLAVOR", "BATCH_SDK_TYPE", "HEIGHT", "LABEL_APP_BUILD_NUMBER", "LABEL_APP_VERSION", "LABEL_SDK_BUILD", "LABEL_SDK_VERSION", "", "LANDSCAPE_INT", "I", "PHONE_INT", "PORTRAIT_INT", "SCALE", "TABLET_INT", "WIDTH", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LF8/g$b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "PHONE", "TABLET", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        PHONE(4),
        TABLET(5);
        
        private final int value;

        private b(int i10) {
            this.value = i10;
        }

        public final int b() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LF8/g$c;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "PORTRAIT", "LANDSCAPE", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum c {
        PORTRAIT(0),
        LANDSCAPE(1);
        
        private final int value;

        private c(int i10) {
            this.value = i10;
        }

        public final int b() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHJ/l;", "it", "", "a", "(LHJ/l;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends C17544u implements C17642l<C15846l, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f35532c = new d();

        public d() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C15846l lVar) {
            C17542s.j(lVar, "it");
            return C15854t.Q(lVar.getValue(), ".", "", false, 4, (Object) null);
        }
    }

    public g(Application application, DisplayMetrics displayMetrics, G8.d dVar, i iVar, G8.a aVar, e eVar) {
        C17542s.j(application, "application");
        C17542s.j(displayMetrics, "metrics");
        C17542s.j(dVar, "buildInformation");
        C17542s.j(iVar, "networkInfoProvider");
        C17542s.j(aVar, "buildConfigInstantiable");
        C17542s.j(eVar, "buildInstantiable");
        this.f35522a = application;
        this.f35523b = displayMetrics;
        this.f35524c = dVar;
        this.f35525d = iVar;
        this.f35526e = aVar;
        this.f35527f = eVar;
        this.f35531j = new D8.c("DeviceInfo");
        u();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String q() {
        /*
            r7 = this;
            G8.e r0 = r7.f35527f
            java.lang.String r0 = r0.d()
            HJ.p r1 = new HJ.p
            java.lang.String r2 = "^\\."
            r1.<init>((java.lang.String) r2)
            java.lang.String r2 = "0."
            java.lang.String r0 = r1.l(r0, r2)
            HJ.p r1 = new HJ.p
            java.lang.String r2 = "^[0-9]*|\\.[0-9]*"
            r1.<init>((java.lang.String) r2)
            r2 = 0
            r3 = 2
            r4 = 0
            GJ.h r0 = HJ.C15850p.f(r1, r0, r2, r3, r4)
            F8.g$d r1 = F8.g.d.f35532c
            GJ.h r0 = GJ.C15768k.S(r0, r1)
            java.util.List r0 = GJ.C15768k.a0(r0)
            java.lang.Object r1 = YH.C16877v.z0(r0, r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x003a
            int r2 = r2.length()
            if (r2 != 0) goto L_0x003b
        L_0x003a:
            r1 = r4
        L_0x003b:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "0"
            if (r1 != 0) goto L_0x0042
            r1 = r2
        L_0x0042:
            r5 = 1
            java.lang.Object r5 = YH.C16877v.z0(r0, r5)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0052
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0058
            r5 = r2
        L_0x0058:
            java.lang.Object r0 = YH.C16877v.z0(r0, r3)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0069
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r4 = r0
        L_0x0069:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r2 = r4
        L_0x006f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            r0.append(r5)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F8.g.q():java.lang.String");
    }

    private final String t() {
        StringBuilder sb2;
        String valueOf;
        String c10 = this.f35527f.c();
        String b10 = this.f35527f.b();
        if (c10 == null || c10.length() == 0 || b10 == null || b10.length() == 0) {
            return null;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = c10.toLowerCase(locale);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase2 = b10.toLowerCase(locale);
        C17542s.i(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (C15854t.W(lowerCase, lowerCase2, false, 2, (Object) null) && c10.length() > b10.length()) {
            String substring = c10.substring(b10.length() + 1);
            C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
            int length = substring.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = C17542s.l(substring.charAt(!z10 ? i10 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i10++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            c10 = substring.subSequence(i10, length + 1).toString();
            if (c10.length() <= 0) {
                return c10;
            }
            sb2 = new StringBuilder();
            valueOf = String.valueOf(c10.charAt(0));
            C17542s.h(valueOf, "null cannot be cast to non-null type java.lang.String");
            locale = Locale.ROOT;
        } else if (c10.length() <= 0) {
            return c10;
        } else {
            sb2 = new StringBuilder();
            valueOf = String.valueOf(c10.charAt(0));
            C17542s.h(valueOf, "null cannot be cast to non-null type java.lang.String");
        }
        String upperCase = valueOf.toUpperCase(locale);
        C17542s.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb2.append(upperCase);
        String substring2 = c10.substring(1);
        C17542s.i(substring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring2);
        return sb2.toString();
    }

    private final void u() {
        DisplayMetrics displayMetrics;
        float f10;
        WindowManager windowManager = (WindowManager) this.f35522a.getSystemService("window");
        if (windowManager != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                WindowMetrics a10 = windowManager.getCurrentWindowMetrics();
                C17542s.i(a10, "windowManager.currentWindowMetrics");
                this.f35529h = a10.getBounds().height();
                this.f35528g = a10.getBounds().width();
                if (i10 >= 34) {
                    f10 = a10.getDensity();
                } else {
                    displayMetrics = this.f35522a.getResources().getDisplayMetrics();
                    f10 = displayMetrics.density;
                }
            } else {
                windowManager.getDefaultDisplay().getRealMetrics(this.f35523b);
                displayMetrics = this.f35523b;
                this.f35529h = displayMetrics.heightPixels;
                this.f35528g = displayMetrics.widthPixels;
                f10 = displayMetrics.density;
            }
            this.f35530i = f10;
        }
        D8.c cVar = this.f35531j;
        cVar.f("DeviceWidth: " + this.f35529h + "  DeviceHeight: " + this.f35528g + "  DeviceScale: " + this.f35530i);
    }

    private final String v() {
        String b10 = this.f35527f.b();
        if (b10 == null || b10.length() == 0) {
            return null;
        }
        if (b10.length() <= 0) {
            return b10;
        }
        StringBuilder sb2 = new StringBuilder();
        String valueOf = String.valueOf(b10.charAt(0));
        C17542s.h(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        C17542s.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb2.append(upperCase);
        String substring = b10.substring(1);
        C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        return sb2.toString();
    }

    private final String w() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f35522a.getSystemService("phone");
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", r(this.f35528g));
            jSONObject.put("h", r(this.f35529h));
            jSONObject.put("d", (double) this.f35530i);
        } catch (JSONException e10) {
            this.f35531j.i(e10, "Failed to process device resolution for bundle.");
        }
        return jSONObject;
    }

    public final e b() {
        return this.f35525d.h();
    }

    public final G8.d c() {
        return this.f35524c;
    }

    public final int d() {
        return this.f35529h;
    }

    public final String e() {
        return v();
    }

    public final String f() {
        return t();
    }

    public final String g() {
        return q();
    }

    public final int h() {
        return this.f35527f.a();
    }

    public final float i() {
        return this.f35530i;
    }

    public final b j() {
        return this.f35522a.getResources().getBoolean(u8.b.f56879a) ? b.TABLET : b.PHONE;
    }

    public final int k() {
        return this.f35528g;
    }

    public final String l() {
        return w();
    }

    public final c m() {
        return this.f35522a.getResources().getConfiguration().orientation == 2 ? c.LANDSCAPE : c.PORTRAIT;
    }

    public final String n() {
        String locale = Locale.getDefault().toString();
        C17542s.i(locale, "getDefault().toString()");
        return locale;
    }

    public final String o() {
        String id2 = TimeZone.getDefault().getID();
        C17542s.i(id2, "getDefault().id");
        return id2;
    }

    public final JSONObject p(G8.d dVar) {
        C17542s.j(dVar, "buildInformation");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sv", dVar.i());
            jSONObject.put("sb", dVar.h());
            jSONObject.put("av", dVar.d());
            jSONObject.put("ab", dVar.e());
        } catch (JSONException e10) {
            this.f35531j.i(e10, "Failed to get json version Origin for DeviceInfo.");
        }
        return jSONObject;
    }

    public final int r(int i10) {
        return (int) ((float) Math.rint((double) (((float) i10) / this.f35530i)));
    }

    public final void s(j jVar) {
        C17542s.j(jVar, "listener");
        this.f35525d.k(jVar);
    }

    public final JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sf", this.f35526e.c() ? "debug" : "release");
            jSONObject.put("an", this.f35524c.c());
            jSONObject.put("st", "sdk-android");
        } catch (JSONException e10) {
            this.f35531j.i(e10, "Failed to get Type Origin json for event.");
        }
        return jSONObject;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ g(android.app.Application r10, android.util.DisplayMetrics r11, G8.d r12, F8.i r13, G8.a r14, G8.e r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L_0x000b
            G8.d r0 = new G8.d
            r7 = r10
            r0.<init>(r10)
            goto L_0x000d
        L_0x000b:
            r7 = r10
            r0 = r12
        L_0x000d:
            r1 = r16 & 8
            if (r1 == 0) goto L_0x001e
            F8.i r8 = new F8.i
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r8
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r5 = r8
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r1 = r16 & 16
            if (r1 == 0) goto L_0x002a
            G8.a r1 = new G8.a
            r1.<init>()
            r6 = r1
            goto L_0x002b
        L_0x002a:
            r6 = r14
        L_0x002b:
            r1 = r16 & 32
            if (r1 == 0) goto L_0x0036
            G8.e r1 = new G8.e
            r1.<init>()
            r8 = r1
            goto L_0x0037
        L_0x0036:
            r8 = r15
        L_0x0037:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r0
            r7 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F8.g.<init>(android.app.Application, android.util.DisplayMetrics, G8.d, F8.i, G8.a, G8.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
