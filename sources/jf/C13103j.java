package JF;

import OE.C13313e;
import OE.n;
import OE.q;
import VE.C13760b;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import YE.C13868b;
import YE.e;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.sugarcube.core.logger.AnyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010,¨\u0006."}, d2 = {"LJF/j;", "Landroidx/lifecycle/v;", "Landroid/app/Activity;", "activity", "LOE/q;", "sugarcube", "LOE/e;", "installationConfig", "Landroidx/lifecycle/r;", "lifecycle", "Lkotlin/Function0;", "LXH/N;", "onARCoreSupportedAndUpToDate", "<init>", "(Landroid/app/Activity;LOE/q;LOE/e;Landroidx/lifecycle/r;LnI/a;)V", "k", "()V", "j", "i", "q", "m", "t", "v", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "a", "Landroid/app/Activity;", "b", "LOE/q;", "getSugarcube", "()LOE/q;", "c", "LOE/e;", "d", "LnI/a;", "getOnARCoreSupportedAndUpToDate", "()LnI/a;", "setOnARCoreSupportedAndUpToDate", "(LnI/a;)V", "Landroid/app/Dialog;", "Landroid/app/Dialog;", "dialog", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JF.j  reason: case insensitive filesystem */
public final class C13103j implements C5218v {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f111333a;

    /* renamed from: b  reason: collision with root package name */
    private final q f111334b;

    /* renamed from: c  reason: collision with root package name */
    private final C13313e f111335c;

    /* renamed from: d  reason: collision with root package name */
    private C17631a<C16807N> f111336d;

    /* renamed from: e  reason: collision with root package name */
    private Dialog f111337e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JF.j$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f111338a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f111339b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0056 */
        static {
            /*
                androidx.lifecycle.r$a[] r0 = androidx.lifecycle.r.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.lifecycle.r$a r2 = androidx.lifecycle.r.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.lifecycle.r$a r3 = androidx.lifecycle.r.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f111338a = r0
                com.google.ar.core.ArCoreApk$Availability[] r0 = com.google.ar.core.ArCoreApk.Availability.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.ar.core.ArCoreApk$Availability r3 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_INSTALLED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_ERROR     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_CHECKING     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_TIMED_OUT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                f111339b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: JF.C13103j.a.<clinit>():void");
        }
    }

    public C13103j(Activity activity, q qVar, C13313e eVar, r rVar, C17631a<C16807N> aVar) {
        C17542s.j(activity, "activity");
        C17542s.j(qVar, "sugarcube");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(rVar, "lifecycle");
        C17542s.j(aVar, "onARCoreSupportedAndUpToDate");
        this.f111333a = activity;
        this.f111334b = qVar;
        this.f111335c = eVar;
        this.f111336d = aVar;
        rVar.c(this);
    }

    private final void i() {
        if (Build.VERSION.SDK_INT < 28) {
            v();
            return;
        }
        String f10 = this.f111335c.f();
        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(this.f111333a);
        C17542s.i(checkAvailability, "checkAvailability(...)");
        Log.d(AnyKt.SUGARCUBE_TAG, "ArCoreApk.checkAvailability = " + checkAvailability);
        this.f111334b.b().captureArCoreAvailability(f10, checkAvailability.name());
        switch (a.f111339b[checkAvailability.ordinal()]) {
            case 1:
                try {
                    C17631a<C16807N> aVar = this.f111336d;
                    C13868b bVar = C13868b.f118106a;
                    boolean z10 = aVar != null;
                    bVar.b("ARCore callback(" + z10 + ") version = " + f10, e.Capture);
                    if (aVar != null) {
                        aVar.invoke();
                        C16807N n10 = C16807N.f139792a;
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    C16807N n11 = C16807N.f139792a;
                    return;
                }
            case 2:
            case 3:
                q();
                return;
            case 4:
            case 5:
            case 6:
                Log.e(AnyKt.SUGARCUBE_TAG, "ARCore status not known, ArCoreApk.checkAvailability() returned " + checkAvailability);
                m();
                return;
            case 7:
                Log.e(AnyKt.SUGARCUBE_TAG, "ARCore is not supported on this device, ArCoreApk.checkAvailability() returned " + checkAvailability);
                t();
                return;
            default:
                throw new t();
        }
    }

    private final void j() {
        Dialog dialog = this.f111337e;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final void k() {
        i();
    }

    private final void m() {
        this.f111334b.b().captureArCoreRetryWarning();
        Activity activity = this.f111333a;
        Integer valueOf = Integer.valueOf(n.f113429p0);
        String string = activity.getString(n.f113436q0);
        C17542s.i(string, "getString(...)");
        CharSequence text = activity.getText(n.f113359f0);
        C17542s.i(text, "getText(...)");
        v a10 = C16796C.a(text, new C13101h(this));
        CharSequence text2 = activity.getText(n.f113179C);
        C17542s.i(text2, "getText(...)");
        this.f111337e = C13084F.y(activity, valueOf, string, a10, 0, C16796C.a(text2, new C13102i(this)), false, (DialogInterface.OnDismissListener) null, 104, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C13103j jVar) {
        C13868b.f118106a.b("ARCore status is not ready", e.Capture);
        jVar.f111334b.b().captureArCoreRetry();
        jVar.i();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C13103j jVar) {
        jVar.f111334b.b().captureArCoreRetryLeave();
        jVar.f111333a.finish();
        return C16807N.f139792a;
    }

    private final void q() {
        this.f111334b.b().captureArCoreUpdateDialog();
        Activity activity = this.f111333a;
        Integer valueOf = Integer.valueOf(n.f113408m0);
        String string = activity.getString(n.f113401l0);
        C17542s.i(string, "getString(...)");
        CharSequence text = activity.getText(n.f113497z);
        C17542s.i(text, "getText(...)");
        v a10 = C16796C.a(text, new C13098e(this, activity));
        CharSequence text2 = activity.getText(n.f113179C);
        C17542s.i(text2, "getText(...)");
        this.f111337e = C13084F.y(activity, valueOf, string, a10, 0, C16796C.a(text2, new C13099f(this)), false, (DialogInterface.OnDismissListener) null, 72, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C13103j jVar, Activity activity) {
        Log.e(AnyKt.SUGARCUBE_TAG, "ARCore installation requested.");
        C13868b.f118106a.b("ARCore installation requested", e.Capture);
        jVar.f111334b.b().captureArCoreUpdate();
        try {
            C17542s.g(ArCoreApk.getInstance().requestInstall(activity, true, ArCoreApk.InstallBehavior.OPTIONAL, ArCoreApk.UserMessageType.USER_ALREADY_INFORMED));
        } catch (FatalException e10) {
            String localizedMessage = e10.getLocalizedMessage();
            Log.e(AnyKt.SUGARCUBE_TAG, "Exception during ARCore installation: " + localizedMessage);
            jVar.i();
        } catch (UnavailableDeviceNotCompatibleException unused) {
            jVar.t();
        } catch (UnavailableUserDeclinedInstallationException unused2) {
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C13103j jVar) {
        jVar.f111334b.b().captureArCoreExit();
        jVar.f111333a.finish();
        return C16807N.f139792a;
    }

    private final void t() {
        this.f111334b.b().captureArCoreNotCompatibleWarning();
        Activity activity = this.f111333a;
        Integer valueOf = Integer.valueOf(n.f113415n0);
        String string = activity.getString(n.f113422o0);
        C17542s.i(string, "getString(...)");
        CharSequence text = activity.getText(n.f113344d);
        C17542s.i(text, "getText(...)");
        this.f111337e = C13084F.y(activity, valueOf, string, C16796C.a(text, new C13097d(this)), 0, (v) null, false, (DialogInterface.OnDismissListener) null, 88, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C13103j jVar) {
        C13868b.f118106a.b("ARCore is not supported on device", e.Capture);
        jVar.f111333a.finish();
        return C16807N.f139792a;
    }

    private final void v() {
        this.f111334b.b().captureOSNotCompatibleWarning();
        Activity activity = this.f111333a;
        Integer valueOf = Integer.valueOf(n.f113437q1);
        String string = activity.getString(n.f113444r1);
        C17542s.i(string, "getString(...)");
        CharSequence text = activity.getText(n.f113173B);
        C17542s.i(text, "getText(...)");
        this.f111337e = C13084F.y(activity, valueOf, string, (v) null, 0, C16796C.a(text, new C13100g(activity, this)), false, (DialogInterface.OnDismissListener) null, 76, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N w(Activity activity, C13103j jVar) {
        C13868b.f118106a.b("OS needs to be API 28 or higher", e.Capture);
        String h10 = C13760b.f117438d.h(jVar.f111334b.getCountry(), jVar.f111334b.getLanguage());
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(h10 + "articles/360039289854-Will-the-app-work-on-my-smartphone-")));
        jVar.f111333a.finish();
        return C16807N.f139792a;
    }

    public void e(C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "source");
        C17542s.j(aVar, "event");
        int i10 = a.f111338a[aVar.ordinal()];
        if (i10 == 1) {
            k();
        } else if (i10 == 2) {
            j();
        }
    }
}
