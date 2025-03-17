package yl;

import HJ.C15854t;
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
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LXH/N;", "c", "(LU0/m;I)V", "Landroid/content/Context;", "Landroid/app/Activity;", "f", "(Landroid/content/Context;)Landroid/app/Activity;", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yl.c  reason: case insensitive filesystem */
public final class C12376c {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"yl/c$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.c$a */
    public static final class a implements L {
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"yl/c$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.c$b */
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f106503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f106504b;

        public b(Activity activity, int i10) {
            this.f106503a = activity;
            this.f106504b = i10;
        }

        public void b() {
            this.f106503a.setRequestedOrientation(this.f106504b);
        }
    }

    public static final void c(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(1049533814);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1049533814, i10, -1, "com.ingka.ikea.app.uicomposables.runtime.LockOrientationUntilDisposed (LockOrientationUntilDisposed.kt:22)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            Configuration configuration = (Configuration) k10.Q(AndroidCompositionLocals_androidKt.f());
            C16807N n10 = C16807N.f139792a;
            k10.W(-72811704);
            boolean F10 = k10.F(context) | k10.F(configuration);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12374a(context, configuration);
                k10.u(D10);
            }
            k10.P();
            P.c(n10, (C17642l) D10, k10, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C12375b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final L d(Context context, Configuration configuration, M m10) {
        Configuration configuration2 = configuration;
        C17542s.j(m10, "$this$DisposableEffect");
        Activity f10 = f(context);
        if (f10 == null) {
            return new a();
        }
        int requestedOrientation = f10.getRequestedOrientation();
        int i10 = configuration2.orientation;
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                IllegalStateException illegalStateException = new IllegalStateException("Unhandled orientation " + configuration2.orientation);
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
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = m10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
                i11 = requestedOrientation;
            } else {
                i11 = 0;
            }
        }
        f10.setRequestedOrientation(i11);
        return new b(f10, requestedOrientation);
    }

    /* access modifiers changed from: private */
    public static final C16807N e(int i10, C4889m mVar, int i11) {
        c(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final Activity f(Context context) {
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
