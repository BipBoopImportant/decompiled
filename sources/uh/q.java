package Uh;

import Vh.a;
import Vh.b;
import Vh.d;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.app.productinformationpage.ui.FeeDialogFragment;
import com.ingka.ikea.app.productinformationpage.ui.WarningMoreInfoFragment;
import com.ingka.ikea.app.productinformationpage.ui.sections.AssemblyAndDocumentsFragment;
import com.ingka.ikea.app.productinformationpage.ui.sections.GoodToKnowFragment;
import com.ingka.ikea.app.productinformationpage.ui.sections.MaterialsAndCareFragment;
import com.ingka.ikea.app.productinformationpage.ui.sections.SafetyAndComplianceFragment;
import com.ingka.ikea.app.productinformationpage.v2.ui.PipAssemblyDetailsBottomSheet;
import com.ingka.ikea.app.productinformationpage.v2.ui.PipFragment;
import com.ingka.ikea.app.productinformationpage.v2.ui.WebViewDialogFragment;
import com.ingka.ikea.app.productinformationpage.v3.PipFragmentV3;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.C8946j;
import x4.F;
import x4.s;
import x4.y;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a/\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\f\u0010\t\u001a\u0011\u0010\r\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\r\u0010\t\u001a\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\t\u001a\u0011\u0010\u000f\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\t\u001a\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\t\u001a\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\t\u001a\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lx4/y;", "", "pipV3", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "y", "(Lx4/y;ZLnI/l;)V", "B", "(Lx4/y;)V", "F", "L", "u", "J", "o", "q", "w", "s", "z", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    /* access modifiers changed from: private */
    public static final C16807N A(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(d.f64611t);
        return C16807N.f139792a;
    }

    public static final void B(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "pip/pip?itemNo={itemNo}&sourceComponent={sourceComponent}", P.b(PipFragment.class));
        cVar.a("itemNo", new m());
        cVar.a("sourceComponent", new n());
        cVar.f(new o());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        jVar.b((Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(s sVar) {
        C17542s.j(sVar, "$this$deepLink");
        sVar.b("android.intent.action.VIEW");
        sVar.d("ikea://navigation/pip/pip?itemNo={itemNo}&sourceComponent={sourceComponent}");
        sVar.c("text/plain");
        return C16807N.f139792a;
    }

    public static final void F(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "pip/pip?itemNo={itemNo}&sourceComponent={sourceComponent}", P.b(PipFragmentV3.class));
        cVar.a("itemNo", new p());
        cVar.a("sourceComponent", new d());
        cVar.f(new e());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        jVar.b((Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(s sVar) {
        C17542s.j(sVar, "$this$deepLink");
        sVar.b("android.intent.action.VIEW");
        sVar.d("ikea://navigation/pip/pip?itemNo={itemNo}&sourceComponent={sourceComponent}");
        sVar.c("text/plain");
        return C16807N.f139792a;
    }

    public static final void J(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "pip/safetyAndCompliance?productLarge={productLarge}", P.b(SafetyAndComplianceFragment.class));
        cVar.a("productLarge", new k());
        cVar.d("ikea://navigation/pip/safetyAndCompliance?productLarge={productLarge}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(b.f64605t);
        return C16807N.f139792a;
    }

    public static final void L(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "pip/moreInfo?warningMoreInfo={warningMoreInfo}", P.b(WarningMoreInfoFragment.class));
        cVar.a("warningMoreInfo", new c());
        cVar.d("ikea://navigation/pip/moreInfo?warningMoreInfo={warningMoreInfo}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(Vh.c.f64608t);
        return C16807N.f139792a;
    }

    public static final void o(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "pip/assemblyAndDocuments?productLarge={productLarge}", P.b(AssemblyAndDocumentsFragment.class));
        cVar.a("productLarge", new l());
        cVar.d("ikea://navigation/pip/assemblyAndDocuments?productLarge={productLarge}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(b.f64605t);
        return C16807N.f139792a;
    }

    public static final void q(y yVar) {
        C17542s.j(yVar, "<this>");
        A4.c cVar = new A4.c((A4.b) yVar.l().d(A4.b.class), "pip/assemblyDetails?itemNo={itemNo}", P.b(PipAssemblyDetailsBottomSheet.class));
        cVar.a("itemNo", new h());
        cVar.d("ikea://navigation/pip/assemblyDetails?itemNo={itemNo}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    public static final void s(y yVar) {
        C17542s.j(yVar, "<this>");
        A4.c cVar = new A4.c((A4.b) yVar.l().d(A4.b.class), "pip/fee?fee={fee}", P.b(FeeDialogFragment.class));
        cVar.a("fee", new j());
        cVar.d("ikea://navigation/pip/fee?fee={fee}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(a.f64602t);
        return C16807N.f139792a;
    }

    public static final void u(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "pip/goodToKnow?productLarge={productLarge}", P.b(GoodToKnowFragment.class));
        cVar.a("productLarge", new i());
        cVar.d("ikea://navigation/pip/goodToKnow?productLarge={productLarge}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(b.f64605t);
        return C16807N.f139792a;
    }

    public static final void w(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "pip/materialsAndCare?productLarge={productLarge}", P.b(MaterialsAndCareFragment.class));
        cVar.a("productLarge", new g());
        cVar.d("ikea://navigation/pip/materialsAndCare?productLarge={productLarge}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(b.f64605t);
        return C16807N.f139792a;
    }

    public static final void y(y yVar, boolean z10, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), "pip/pip?itemNo={itemNo}&sourceComponent={sourceComponent}", "pip");
        if (z10) {
            F(yVar2);
        } else {
            B(yVar2);
        }
        L(yVar2);
        u(yVar2);
        J(yVar2);
        o(yVar2);
        w(yVar2);
        s(yVar2);
        z(yVar2);
        q(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static final void z(y yVar) {
        C17542s.j(yVar, "<this>");
        A4.c cVar = new A4.c((A4.b) yVar.l().d(A4.b.class), "pip/webview?content={content}", P.b(WebViewDialogFragment.class));
        cVar.a("content", new f());
        cVar.d("ikea://navigation/pip/webview?content={content}");
        yVar.k(cVar);
    }
}
