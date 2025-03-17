package com.ingka.ikea.account.impl.modalsettings;

import HJ.C15854t;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import YC.C13856a;
import YC.C13857b;
import YC.C13860e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.lifecycle.C5222z;
import com.ingka.ikea.account.impl.modalsettings.C;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fI.C17220a;
import fI.C17221b;
import h.C5403a;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import ug.C10272a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001bH\u0015¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\u0003R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010B\u001a\u00020=8BX\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LXH/N;", "F0", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "useCase", "", "onSuccessToken", "z0", "(Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Intent;", "intent", "", "E0", "(Landroid/content/Intent;)Z", "Landroid/net/Uri;", "callbackUri", "J0", "(Landroid/net/Uri;)Z", "lastPath", "I0", "(Ljava/lang/String;Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;)Z", "G0", "onNewIntent", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onResume", "LEo/a;", "z", "LEo/a;", "A0", "()LEo/a;", "setChromeTabsApi", "(LEo/a;)V", "chromeTabsApi", "Lug/a;", "A", "Lug/a;", "B0", "()Lug/a;", "setDebugFeatures", "(Lug/a;)V", "debugFeatures", "LYC/b;", "B", "LYC/b;", "D0", "()LYC/b;", "setUiMode", "(LYC/b;)V", "uiMode", "C", "Ljava/lang/String;", "randomToken", "Lcom/ingka/ikea/account/impl/modalsettings/C;", "D", "LXH/o;", "C0", "()Lcom/ingka/ikea/account/impl/modalsettings/C;", "safeArgs", "E", "Z", "hostedPageLaunched", "F", "Companion", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HostedRedirectActivity extends Hilt_HostedRedirectActivity {

    /* renamed from: F  reason: collision with root package name */
    public static final Companion f69590F = new Companion((DefaultConstructorMarker) null);

    /* renamed from: G  reason: collision with root package name */
    public static final int f69591G = 8;

    /* renamed from: A  reason: collision with root package name */
    public C10272a f69592A;

    /* renamed from: B  reason: collision with root package name */
    public C13857b f69593B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public String f69594C;

    /* renamed from: D  reason: collision with root package name */
    private final C16824o f69595D = C16825p.b(new B(this));

    /* renamed from: E  reason: collision with root package name */
    private boolean f69596E;

    /* renamed from: z  reason: collision with root package name */
    public Eo.a f69597z;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion;", "", "<init>", "()V", "", "DEBUG_HLP_BYPASS_DELAY", "J", "", "EXTRA_INTENT_LAUNCHED", "Ljava/lang/String;", "EXTRA_INTENT_TOKEN", "QUERY_CALLBACK_KEY", "RESULT_QUERY_STATUS", "a", "b", "RedirectUseCase", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_PHONE", "CHANGE_EMAIL", "CHANGE_PASSWORD", "DELETE_ACCOUNT", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum RedirectUseCase {
            CHANGE_PHONE,
            CHANGE_EMAIL,
            CHANGE_PASSWORD,
            DELETE_ACCOUNT;

            static {
                RedirectUseCase[] $values;
                $ENTRIES = C17221b.a($values);
            }

            public static C17220a<RedirectUseCase> getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$a;", "Lh/a;", "Lcom/ingka/ikea/account/impl/modalsettings/C;", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$b;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/ingka/ikea/account/impl/modalsettings/C;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$b;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends C5403a<C, b> {
            /* renamed from: a */
            public Intent createIntent(Context context, C c10) {
                C17542s.j(context, "context");
                C17542s.j(c10, "input");
                Intent intent = new Intent(context, HostedRedirectActivity.class);
                intent.putExtras(c10.c());
                return intent;
            }

            /* renamed from: b */
            public b parseResult(int i10, Intent intent) {
                RedirectUseCase redirectUseCase;
                Bundle extras;
                if (i10 != -1) {
                    return b.a.f69598a;
                }
                if (intent == null || (extras = intent.getExtras()) == null || (redirectUseCase = C.f69582c.a(extras).b()) == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown use case: " + this);
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, illegalArgumentException, str3);
                        str = str3;
                        str2 = str4;
                    }
                    redirectUseCase = RedirectUseCase.CHANGE_PASSWORD;
                }
                return new b.C1198b(true, redirectUseCase);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$b;", "", "<init>", "()V", "b", "a", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$b$a;", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$b$b;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class b {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$b$a;", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$b;", "<init>", "()V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a extends b {

                /* renamed from: a  reason: collision with root package name */
                public static final a f69598a = new a();

                private a() {
                    super((DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$b$b;", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$b;", "", "success", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "useCase", "<init>", "(ZLcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getSuccess", "()Z", "b", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "()Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$b$b  reason: collision with other inner class name */
            public static final class C1198b extends b {

                /* renamed from: a  reason: collision with root package name */
                private final boolean f69599a;

                /* renamed from: b  reason: collision with root package name */
                private final RedirectUseCase f69600b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1198b(boolean z10, RedirectUseCase redirectUseCase) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(redirectUseCase, "useCase");
                    this.f69599a = z10;
                    this.f69600b = redirectUseCase;
                }

                public final RedirectUseCase a() {
                    return this.f69600b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1198b)) {
                        return false;
                    }
                    C1198b bVar = (C1198b) obj;
                    return this.f69599a == bVar.f69599a && this.f69600b == bVar.f69600b;
                }

                public int hashCode() {
                    return (Boolean.hashCode(this.f69599a) * 31) + this.f69600b.hashCode();
                }

                public String toString() {
                    boolean z10 = this.f69599a;
                    RedirectUseCase redirectUseCase = this.f69600b;
                    return "Result(success=" + z10 + ", useCase=" + redirectUseCase + ")";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f69601a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase[] r0 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_PHONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_EMAIL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_PASSWORD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.DELETE_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f69601a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$mockHlpSuccess$2", f = "HostedRedirectActivity.kt", l = {195}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f69602c;

        /* renamed from: d  reason: collision with root package name */
        int f69603d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HostedRedirectActivity f69604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(HostedRedirectActivity hostedRedirectActivity, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f69604e = hostedRedirectActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f69604e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            HostedRedirectActivity hostedRedirectActivity;
            Object f10 = C17187b.f();
            int i10 = this.f69603d;
            if (i10 == 0) {
                y.b(obj);
                HostedRedirectActivity hostedRedirectActivity2 = this.f69604e;
                long seconds = TimeUnit.MILLISECONDS.toSeconds(3000);
                Toast.makeText(hostedRedirectActivity2, "Mocking success in " + seconds + "s", 1).show();
                this.f69602c = hostedRedirectActivity2;
                this.f69603d = 1;
                if (C16297b0.b(3000, this) == f10) {
                    return f10;
                }
                hostedRedirectActivity = hostedRedirectActivity2;
            } else if (i10 == 1) {
                hostedRedirectActivity = (HostedRedirectActivity) this.f69602c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Intent intent = new Intent(hostedRedirectActivity, HostedRedirectActivity.class);
            HostedRedirectActivity hostedRedirectActivity3 = this.f69604e;
            intent.addFlags(603979776);
            intent.setData(Uri.parse(hostedRedirectActivity3.z0(hostedRedirectActivity3.C0().b(), hostedRedirectActivity3.f69594C)));
            this.f69604e.onNewIntent(intent);
            return C16807N.f139792a;
        }
    }

    public HostedRedirectActivity() {
        UUID randomUUID = UUID.randomUUID();
        this.f69594C = "success-" + randomUUID;
    }

    /* access modifiers changed from: private */
    public final C C0() {
        return (C) this.f69595D.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r5 = r18.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean E0(android.content.Intent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Intent r2 = r17.getIntent()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0014
            r0.setResult(r3)
            return r4
        L_0x0014:
            r2 = 0
            if (r1 == 0) goto L_0x0022
            android.net.Uri r5 = r18.getData()
            if (r5 == 0) goto L_0x0022
            java.lang.String r5 = r5.getHost()
            goto L_0x0023
        L_0x0022:
            r5 = r2
        L_0x0023:
            if (r5 == 0) goto L_0x0136
            int r5 = r5.length()
            if (r5 != 0) goto L_0x002d
            goto L_0x0136
        L_0x002d:
            if (r1 == 0) goto L_0x003a
            android.net.Uri r5 = r18.getData()
            if (r5 == 0) goto L_0x003a
            java.lang.String r5 = r5.getLastPathSegment()
            goto L_0x003b
        L_0x003a:
            r5 = r2
        L_0x003b:
            qv.e r12 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x004e:
            boolean r8 = r6.hasNext()
            r13 = 0
            if (r8 == 0) goto L_0x0066
            java.lang.Object r8 = r6.next()
            r9 = r8
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r12, r13)
            if (r9 == 0) goto L_0x004e
            r7.add(r8)
            goto L_0x004e
        L_0x0066:
            java.util.Iterator r14 = r7.iterator()
            r6 = r2
            r7 = r6
        L_0x006c:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x00f6
            java.lang.Object r8 = r14.next()
            qv.b r8 = (qv.C11819b) r8
            r10 = 0
            if (r6 != 0) goto L_0x0097
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "Handle intent, lastPathSegment: "
            r6.append(r9)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = qv.C11818a.a(r6, r10)
            if (r6 != 0) goto L_0x0093
            goto L_0x00f6
        L_0x0093:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x0097:
            r15 = r6
            if (r7 != 0) goto L_0x00e6
            java.lang.Class<com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity> r6 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.class
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 36
            r9 = 2
            java.lang.String r7 = HJ.C15854t.s1(r6, r7, r2, r9, r2)
            r11 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r11, r2, r9, r2)
            int r9 = r7.length()
            if (r9 != 0) goto L_0x00b7
            goto L_0x00bd
        L_0x00b7:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r7, r6)
        L_0x00bd:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r9 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r9, r4)
            if (r7 == 0) goto L_0x00d0
            java.lang.String r7 = "m"
            goto L_0x00d2
        L_0x00d0:
            java.lang.String r7 = "b"
        L_0x00d2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = "|"
            r9.append(r7)
            r9.append(r6)
            java.lang.String r7 = r9.toString()
        L_0x00e6:
            r16 = r7
            r6 = r8
            r7 = r12
            r8 = r16
            r9 = r13
            r11 = r15
            r6.a(r7, r8, r9, r10, r11)
            r6 = r15
            r7 = r16
            goto L_0x006c
        L_0x00f6:
            com.ingka.ikea.account.impl.modalsettings.C r6 = r17.C0()
            com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r6 = r6.b()
            boolean r5 = r0.I0(r5, r6)
            if (r5 == 0) goto L_0x0135
            if (r1 == 0) goto L_0x010a
            android.net.Uri r2 = r18.getData()
        L_0x010a:
            if (r2 == 0) goto L_0x012d
            boolean r1 = r0.J0(r2)
            if (r1 == 0) goto L_0x0129
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            com.ingka.ikea.account.impl.modalsettings.C r2 = r17.C0()
            android.os.Bundle r2 = r2.c()
            r1.putExtras(r2)
            XH.N r2 = XH.C16807N.f139792a
            r2 = -1
            r0.setResult(r2, r1)
            goto L_0x012c
        L_0x0129:
            r0.setResult(r3)
        L_0x012c:
            return r4
        L_0x012d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        L_0x0135:
            return r4
        L_0x0136:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.E0(android.content.Intent):boolean");
    }

    private final void F0() {
        if (B0().d()) {
            G0();
            return;
        }
        C13856a a10 = C13857b.a.a(D0(), (C13860e) null, 1, (Object) null);
        Uri build = Uri.parse(C0().a()).buildUpon().appendQueryParameter(a10.a(), a10.b()).appendQueryParameter("callbackUrl", z0(C0().b(), this.f69594C)).build();
        Eo.a A02 = A0();
        String uri = build.toString();
        C17542s.i(uri, "toString(...)");
        A02.a(this, uri);
        this.f69596E = true;
    }

    private final void G0() {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Bypassing the HLP and will return success soon", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = HostedRedirectActivity.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C H0(HostedRedirectActivity hostedRedirectActivity) {
        C.a aVar = C.f69582c;
        Bundle extras = hostedRedirectActivity.getIntent().getExtras();
        if (extras != null) {
            return aVar.a(extras);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final boolean I0(String str, Companion.RedirectUseCase redirectUseCase) {
        int i10 = a.f69601a[redirectUseCase.ordinal()];
        if (i10 == 1) {
            return C17542s.e(str, Uri.parse("https://accounts.ikea.com/changePhone").getLastPathSegment());
        }
        if (i10 == 2) {
            return C17542s.e(str, Uri.parse("https://accounts.ikea.com/changeEmail").getLastPathSegment());
        }
        if (i10 == 3) {
            return C17542s.e(str, Uri.parse("https://accounts.ikea.com/changePassword").getLastPathSegment());
        }
        if (i10 == 4) {
            return C17542s.e(str, Uri.parse("https://accounts.ikea.com/deleteAccount").getLastPathSegment());
        }
        throw new t();
    }

    private final boolean J0(Uri uri) {
        String queryParameter = uri.getQueryParameter("status");
        if (!(queryParameter == null || queryParameter.length() == 0)) {
            String str = this.f69594C;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (C17542s.e(queryParameter, str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final String z0(Companion.RedirectUseCase redirectUseCase, String str) {
        String str2;
        int i10 = a.f69601a[redirectUseCase.ordinal()];
        if (i10 == 1) {
            str2 = "https://accounts.ikea.com/changePhone";
        } else if (i10 == 2) {
            str2 = "https://accounts.ikea.com/changeEmail";
        } else if (i10 == 3) {
            str2 = "https://accounts.ikea.com/changePassword";
        } else if (i10 == 4) {
            str2 = "https://accounts.ikea.com/deleteAccount";
        } else {
            throw new t();
        }
        Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
        if (str != null) {
            buildUpon.appendQueryParameter("status", str);
        }
        String uri = buildUpon.build().toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }

    public final Eo.a A0() {
        Eo.a aVar = this.f69597z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabsApi");
        return null;
    }

    public final C10272a B0() {
        C10272a aVar = this.f69592A;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("debugFeatures");
        return null;
    }

    public final C13857b D0() {
        C13857b bVar = this.f69593B;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("uiMode");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            String string = bundle.getString("EXTRA_INTENT_TOKEN");
            if (string != null) {
                this.f69594C = string;
                this.f69596E = bundle.getBoolean("EXTRA_INTENT_LAUNCHED", false);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingSuperCall"})
    public void onNewIntent(Intent intent) {
        C17542s.j(intent, "intent");
        super.onNewIntent(intent);
        if (E0(intent)) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        String a10;
        super.onResume();
        if (!this.f69596E && ((a10 = C0().a()) == null || C15854t.v0(a10))) {
            finish();
        } else if (!this.f69596E) {
            F0();
        } else if (E0(getIntent())) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingSuperCall"})
    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("EXTRA_INTENT_LAUNCHED", this.f69596E);
        bundle.putString("EXTRA_INTENT_TOKEN", this.f69594C);
    }
}
