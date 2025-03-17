package Mw;

import Ae.c;
import Ae.e;
import HJ.C15854t;
import Mw.C13213c;
import Nn.C10805h;
import Nn.F;
import XH.C16796C;
import XH.v;
import YH.X;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay.CopyAndPayFragment;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.oppwa.mobile.connect.provider.AsyncPaymentActivity;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001e\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"LMw/d;", "LMw/c;", "LAe/e;", "analytics", "LEo/a;", "customTabsApi", "<init>", "(LAe/e;LEo/a;)V", "Landroid/content/Context;", "context", "", "f", "(Landroid/content/Context;)Ljava/lang/String;", "LXH/N;", "c", "()V", "", "isValid", "d", "(Z)V", "LNn/h$d;", "paymentResultError", "b", "(LNn/h$d;)V", "LMw/c$c;", "result", "paymentSolutionId", "LMw/c$b;", "paymentError", "paymentErrorMessage", "a", "(LMw/c$c;Ljava/lang/String;LMw/c$b;Ljava/lang/String;)V", "e", "(Landroid/content/Context;)V", "LAe/e;", "getAnalytics", "()LAe/e;", "LEo/a;", "getCustomTabsApi", "()LEo/a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mw.d  reason: case insensitive filesystem */
public final class C13214d implements C13213c {

    /* renamed from: a  reason: collision with root package name */
    private final e f112047a;

    /* renamed from: b  reason: collision with root package name */
    private final Eo.a f112048b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LMw/d$a;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "CHECKOUT_BROWSER_DATA", "PAYMENT_CALLBACK_RECEIVED", "PAYMENT_CALLBACK_COMPLETED", "PAYMENT_RESULT", "PAYMENT_ERROR", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mw.d$a */
    private enum a {
        CHECKOUT_BROWSER_DATA("checkout_browser_data"),
        PAYMENT_CALLBACK_RECEIVED("payment_callback"),
        PAYMENT_CALLBACK_COMPLETED("payment_callback_completed"),
        PAYMENT_RESULT("payment_result"),
        PAYMENT_ERROR(AsyncPaymentActivity.EXTRA_PAYMENT_ERROR);
        
        private final String key;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.key = str;
        }

        public final String b() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LMw/d$b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "BROWSER_DEFAULT", "BROWSER_HAS_CHROME", "RESULT", "ERROR", "BRAND", "REASON", "ERROR_MESSAGE", "IS_VALID", "PAYMENT_SOLUTION_ID", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mw.d$b */
    private enum b {
        BROWSER_DEFAULT("browser_default"),
        BROWSER_HAS_CHROME("browser_has_chrome"),
        RESULT("result"),
        ERROR(UiComponentContainer.RESULT_ERROR),
        BRAND(CopyAndPayFragment.BRAND_KEY),
        REASON("reason"),
        ERROR_MESSAGE("error_message"),
        IS_VALID("is_valid"),
        PAYMENT_SOLUTION_ID("payment_solution_id");
        
        private final String key;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str) {
            this.key = str;
        }

        public final String b() {
            return this.key;
        }
    }

    public C13214d(e eVar, Eo.a aVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "customTabsApi");
        this.f112047a = eVar;
        this.f112048b = aVar;
    }

    private final String f(Context context) {
        ActivityInfo activityInfo;
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.test.com")), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }

    public void a(C13213c.C2746c cVar, String str, C13213c.b bVar, String str2) {
        C17542s.j(cVar, "result");
        C17542s.j(str, "paymentSolutionId");
        Map c10 = X.c();
        c10.put(b.RESULT.b(), cVar.b());
        String b10 = b.PAYMENT_SOLUTION_ID.b();
        c cVar2 = c.f58680a;
        c10.put(b10, cVar2.a(str));
        if (bVar != null) {
            c10.put(b.ERROR.b(), bVar.b());
        }
        String a10 = cVar2.a(str2);
        if (a10 != null) {
            c10.put(b.ERROR_MESSAGE.b(), a10);
        }
        this.f112047a.track(a.PAYMENT_RESULT.b(), X.b(c10));
    }

    public void b(C10805h.d dVar) {
        C17542s.j(dVar, "paymentResultError");
        v a10 = C16796C.a(b.ERROR.b(), dVar.a().b());
        String b10 = b.BRAND.b();
        F b11 = dVar.b();
        String str = null;
        v a11 = C16796C.a(b10, b11 != null ? b11.b() : null);
        String b12 = b.REASON.b();
        F b13 = dVar.b();
        if (b13 != null) {
            str = b13.c();
        }
        this.f112047a.track(a.PAYMENT_ERROR.b(), X.m(a10, a11, C16796C.a(b12, str)));
    }

    public void c() {
        this.f112047a.track(a.PAYMENT_CALLBACK_RECEIVED.b(), (Map<String, ? extends Object>) null);
    }

    public void d(boolean z10) {
        this.f112047a.track(a.PAYMENT_CALLBACK_COMPLETED.b(), X.f(C16796C.a(b.IS_VALID.b(), Boolean.valueOf(z10))));
    }

    public void e(Context context) {
        C17542s.j(context, "context");
        try {
            this.f112047a.track(a.CHECKOUT_BROWSER_DATA.b(), X.m(C16796C.a(b.BROWSER_DEFAULT.b(), f(context)), C16796C.a(b.BROWSER_HAS_CHROME.b(), Boolean.valueOf(this.f112048b.b(context)))));
        } catch (Throwable th2) {
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C13214d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }
}
