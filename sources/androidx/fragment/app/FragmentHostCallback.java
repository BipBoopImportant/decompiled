package androidx.fragment.app;

import XH.C16814e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C5147b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ9\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00028\u0000H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010(\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)JS\u0010/\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020*2\u0006\u0010%\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010#2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0017¢\u0006\u0004\b/\u00100J-\u00102\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010%\u001a\u00020\tH\u0017¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000205H\u0016¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b:\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010IR\u0017\u0010N\u001a\u00020J8G¢\u0006\f\n\u0004\b@\u0010K\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Landroidx/fragment/app/FragmentHostCallback;", "H", "Landroidx/fragment/app/v;", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", "context", "Landroid/os/Handler;", "handler", "", "windowAnimations", "<init>", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V", "Landroidx/fragment/app/t;", "(Landroidx/fragment/app/t;)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "LXH/N;", "i", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "k", "()Landroid/view/LayoutInflater;", "j", "()Ljava/lang/Object;", "p", "()V", "Landroidx/fragment/app/o;", "fragment", "Landroid/content/Intent;", "intent", "requestCode", "Landroid/os/Bundle;", "options", "n", "(Landroidx/fragment/app/o;Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "o", "(Landroidx/fragment/app/o;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "permissions", "l", "(Landroidx/fragment/app/o;[Ljava/lang/String;I)V", "permission", "", "m", "(Ljava/lang/String;)Z", "id", "Landroid/view/View;", "c", "(I)Landroid/view/View;", "d", "()Z", "a", "Landroid/app/Activity;", "e", "()Landroid/app/Activity;", "b", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "Landroid/os/Handler;", "h", "()Landroid/os/Handler;", "I", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "g", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class FragmentHostCallback<H> extends C5193v {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f21801a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f21802b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f21803c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21804d;

    /* renamed from: e  reason: collision with root package name */
    private final FragmentManager f21805e;

    public FragmentHostCallback(Activity activity, Context context, Handler handler, int i10) {
        C17542s.j(context, "context");
        C17542s.j(handler, "handler");
        this.f21801a = activity;
        this.f21802b = context;
        this.f21803c = handler;
        this.f21804d = i10;
        this.f21805e = new I();
    }

    public View c(int i10) {
        return null;
    }

    public boolean d() {
        return true;
    }

    public final Activity e() {
        return this.f21801a;
    }

    public final Context f() {
        return this.f21802b;
    }

    public final FragmentManager g() {
        return this.f21805e;
    }

    public final Handler h() {
        return this.f21803c;
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C17542s.j(str, "prefix");
        C17542s.j(printWriter, "writer");
    }

    public abstract H j();

    public LayoutInflater k() {
        LayoutInflater from = LayoutInflater.from(this.f21802b);
        C17542s.i(from, "from(context)");
        return from;
    }

    @C16814e
    public void l(C5187o oVar, String[] strArr, int i10) {
        C17542s.j(oVar, "fragment");
        C17542s.j(strArr, "permissions");
    }

    public boolean m(String str) {
        C17542s.j(str, "permission");
        return false;
    }

    public void n(C5187o oVar, Intent intent, int i10, Bundle bundle) {
        C17542s.j(oVar, "fragment");
        C17542s.j(intent, "intent");
        if (i10 == -1) {
            C6012a.o(this.f21802b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @C16814e
    public void o(C5187o oVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        C5187o oVar2 = oVar;
        C17542s.j(oVar, "fragment");
        IntentSender intentSender2 = intentSender;
        C17542s.j(intentSender, "intent");
        if (i10 == -1) {
            Activity activity = this.f21801a;
            if (activity != null) {
                C5147b.C(activity, intentSender, i10, intent, i11, i12, i13, bundle);
                return;
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void p() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(C5191t tVar) {
        this(tVar, tVar, new Handler(), 0);
        C17542s.j(tVar, "activity");
    }
}
