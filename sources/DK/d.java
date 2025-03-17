package Dk;

import A4.b;
import A4.c;
import XH.C16807N;
import com.ingka.ikea.app.splash.ApplinkErrorDialog;
import com.ingka.ikea.app.splash.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/y;", "LXH/N;", "d", "(Lx4/y;)V", "splash_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void d(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "applinkError?errorMessage={errorMessage}&contentUri={contentUri}&openInBrowser={openInBrowser}", P.b(ApplinkErrorDialog.class));
        cVar.d("ikea://navigation/applinkError?errorMessage={errorMessage}&contentUri={contentUri}&openInBrowser={openInBrowser}");
        cVar.a("errorMessage", new a());
        cVar.a("contentUri", new b());
        cVar.a("openInBrowser", new c());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57429d);
        jVar.b(Integer.valueOf(n.f92434a));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        jVar.b((Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57439n);
        jVar.b(Boolean.FALSE);
        return C16807N.f139792a;
    }
}
