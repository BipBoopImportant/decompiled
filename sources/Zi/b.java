package Zi;

import Py.a;
import XH.C16807N;
import XH.C16818i;
import android.net.Uri;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.L;
import androidx.lifecycle.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LZi/b;", "LPy/a;", "<init>", "()V", "Lx4/o;", "navController", "", "timeSlotId", "", "isEarlyPayment", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroidx/lifecycle/U;", "savedStatehandle", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "LPy/a$a;", "listener", "b", "(Landroidx/lifecycle/U;Landroidx/lifecycle/y;LnI/l;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements Py.a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f89908a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f89908a = lVar;
        }

        public final C16818i<?> c() {
            return this.f89908a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f89908a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(U u10, C17642l lVar, a.C2810a aVar) {
        u10.j("FRAGMENT_REQUEST_KEY_CHECKOUT_RESULT");
        C17542s.g(aVar);
        lVar.invoke(aVar);
        return C16807N.f139792a;
    }

    public void a(C8951o oVar, String str, Boolean bool) {
        C17542s.j(oVar, "navController");
        Uri.Builder buildUpon = c.a(Uri.parse("ikea://navigation/scanandgo/checkout?timeSlotId={timeSlotId}&earlyPayment={earlyPayment}&")).buildUpon();
        if (str != null) {
            buildUpon.appendQueryParameter("timeSlotId", str);
        }
        buildUpon.appendQueryParameter("earlyPayment", String.valueOf(bool != null ? bool.booleanValue() : false));
        Uri build = buildUpon.build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }

    public void b(U u10, C5221y yVar, C17642l<? super a.C2810a, C16807N> lVar) {
        C17542s.j(u10, "savedStatehandle");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(lVar, "listener");
        u10.g("FRAGMENT_REQUEST_KEY_CHECKOUT_RESULT").observe(yVar, new a(new a(u10, lVar)));
    }
}
