package sF;

import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "orientation", "LXH/N;", "c", "(ILU0/m;I)V", "Landroid/content/Context;", "Landroid/app/Activity;", "f", "(Landroid/content/Context;)Landroid/app/Activity;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sF/j$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements L {
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sF/j$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f131000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f131001b;

        public b(Activity activity, int i10) {
            this.f131000a = activity;
            this.f131001b = i10;
        }

        public void b() {
            this.f131000a.setRequestedOrientation(this.f131001b);
        }
    }

    public static final void c(int i10, C4889m mVar, int i11) {
        int i12;
        C4889m k10 = mVar.k(-1686754250);
        if ((i11 & 6) == 0) {
            i12 = (k10.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1686754250, i12, -1, "com.sugarcube.app.base.ui.compose.util.LockScreenOrientation (Orientation.kt:17)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            Integer valueOf = Integer.valueOf(i10);
            k10.W(66828402);
            int i13 = i12 & 14;
            boolean F10 = (i13 == 4) | k10.F(context);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new h(context, i10);
                k10.u(D10);
            }
            k10.P();
            P.c(valueOf, (C17642l) D10, k10, i13);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new i(i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final L d(Context context, int i10, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        Activity f10 = f(context);
        if (f10 == null) {
            return new a();
        }
        int requestedOrientation = f10.getRequestedOrientation();
        f10.setRequestedOrientation(i10);
        return new b(f10, requestedOrientation);
    }

    /* access modifiers changed from: private */
    public static final C16807N e(int i10, int i11, C4889m mVar, int i12) {
        c(i10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    public static final Activity f(Context context) {
        C17542s.j(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C17542s.i(baseContext, "getBaseContext(...)");
        return f(baseContext);
    }
}
