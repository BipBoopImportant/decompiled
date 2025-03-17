package com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1;

import Ay.c;
import Hj.A;
import Hj.B;
import Hj.D;
import Hj.E;
import Hj.F;
import Hj.z;
import Iz.C13035a;
import Iz.C13049o;
import Iz.Y;
import Oj.a;
import XH.C16807N;
import XH.t;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission.RationalePermissionPromptNavigation;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.d;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.navigation.UpptackaImportProductNavigation$Companion$Result;
import g.C5314c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import rw.f;
import sj.C11853d;
import vj.C12128a;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010\u001fJ\u0017\u0010%\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J%\u0010,\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100)2\u0006\u0010\u0017\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101JF\u00103\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010/\u001a\u00020.2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100)2\u0006\u0010\u0017\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/h;", "", "LIz/Y;", "scanAndGoNavigation", "LAy/c;", "scanAndGoCartNavigation", "LIz/o;", "productInfoPageNavigation", "LIz/a;", "collectProductNavigation", "Lvj/a;", "helpDialogNavigation", "LOj/a;", "upptackaImportProductNavigation", "<init>", "(LIz/Y;LAy/c;LIz/o;LIz/a;Lvj/a;LOj/a;)V", "", "destId", "Landroidx/fragment/app/o;", "fragment", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;", "viewModel", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c$k;", "navigateTo", "LXH/N;", "x", "(Ljava/lang/String;Landroidx/fragment/app/o;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c$k;)LXH/N;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c$f;", "p", "(Ljava/lang/String;Landroidx/fragment/app/o;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c$f;)V", "n", "(Landroidx/fragment/app/o;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c$g;", "r", "(Ljava/lang/String;Landroidx/fragment/app/o;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c$g;)V", "k", "v", "m", "(Landroidx/fragment/app/o;)V", "i", "(Ljava/lang/String;Landroidx/fragment/app/o;)V", "Lg/c;", "permissionsLauncher", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c$h;", "t", "(Lg/c;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c$h;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "permissionPromptNavigation", "u", "(Landroidx/fragment/app/o;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "h", "(Ljava/lang/String;Landroidx/fragment/app/o;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;Lg/c;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;)V", "a", "LIz/Y;", "b", "LAy/c;", "c", "LIz/o;", "d", "LIz/a;", "e", "Lvj/a;", "f", "LOj/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Y f92220a;

    /* renamed from: b  reason: collision with root package name */
    private final c f92221b;

    /* renamed from: c  reason: collision with root package name */
    private final C13049o f92222c;

    /* renamed from: d  reason: collision with root package name */
    private final C13035a f92223d;

    /* renamed from: e  reason: collision with root package name */
    private final C12128a f92224e;

    /* renamed from: f  reason: collision with root package name */
    private final a f92225f;

    public h(Y y10, c cVar, C13049o oVar, C13035a aVar, C12128a aVar2, a aVar3) {
        C17542s.j(y10, "scanAndGoNavigation");
        C17542s.j(cVar, "scanAndGoCartNavigation");
        C17542s.j(oVar, "productInfoPageNavigation");
        C17542s.j(aVar, "collectProductNavigation");
        C17542s.j(aVar2, "helpDialogNavigation");
        C17542s.j(aVar3, "upptackaImportProductNavigation");
        this.f92220a = y10;
        this.f92221b = cVar;
        this.f92222c = oVar;
        this.f92223d = aVar;
        this.f92224e = aVar2;
        this.f92225f = aVar3;
    }

    private final void i(String str, C5187o oVar) {
        f.d(oVar, str, new E(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N j(h hVar, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        c.a.a(hVar.f92221b, oVar, (C) null, false, 2, (Object) null);
        return C16807N.f139792a;
    }

    private final void k(C5187o oVar, f fVar) {
        Y y10 = this.f92220a;
        FragmentManager parentFragmentManager = oVar.getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        y10.i(parentFragmentManager);
        Y y11 = this.f92220a;
        FragmentManager parentFragmentManager2 = oVar.getParentFragmentManager();
        C17542s.i(parentFragmentManager2, "getParentFragmentManager(...)");
        y11.f(parentFragmentManager2, oVar, new B(fVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N l(f fVar) {
        fVar.U(d.o.f92166a);
        return C16807N.f139792a;
    }

    private final void m(C5187o oVar) {
        this.f92224e.a(androidx.navigation.fragment.a.a(oVar));
    }

    private final void n(C5187o oVar, f fVar) {
        C11853d.h(oVar, new A(fVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N o(f fVar, String str) {
        if (str == null) {
            fVar.U(d.o.f92166a);
        } else {
            fVar.U(new d.g(str));
        }
        return C16807N.f139792a;
    }

    private final void p(String str, C5187o oVar, c.f fVar) {
        this.f92223d.a(androidx.navigation.fragment.a.a(oVar), fVar.a(), fVar.b());
        this.f92223d.b(oVar, str, new D());
    }

    /* access modifiers changed from: private */
    public static final C16807N q() {
        return C16807N.f139792a;
    }

    private final void r(String str, C5187o oVar, c.g gVar) {
        f.d(oVar, str, new Hj.C(this, gVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N s(h hVar, c.g gVar, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        hVar.f92222c.a(oVar, gVar.a().a(), gVar.a().f());
        return C16807N.f139792a;
    }

    private final void t(C5314c<String> cVar, c.h hVar) {
        cVar.a(hVar.a());
    }

    private final void u(C5187o oVar, RationalePermissionPromptNavigation rationalePermissionPromptNavigation) {
        FragmentManager parentFragmentManager = oVar.getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        rationalePermissionPromptNavigation.b(parentFragmentManager);
    }

    private final void v(C5187o oVar, f fVar) {
        Y y10 = this.f92220a;
        FragmentManager parentFragmentManager = oVar.getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        y10.c(parentFragmentManager);
        Y y11 = this.f92220a;
        FragmentManager parentFragmentManager2 = oVar.getParentFragmentManager();
        C17542s.i(parentFragmentManager2, "getParentFragmentManager(...)");
        C5221y viewLifecycleOwner = oVar.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        y11.j(parentFragmentManager2, viewLifecycleOwner, new z(fVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N w(f fVar) {
        fVar.U(d.o.f92166a);
        return C16807N.f139792a;
    }

    private final C16807N x(String str, C5187o oVar, f fVar, c.k kVar) {
        this.f92225f.b(androidx.navigation.fragment.a.a(oVar), kVar.a().h());
        this.f92225f.a(oVar, str, new F(fVar));
        return null;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(f fVar, UpptackaImportProductNavigation$Companion$Result upptackaImportProductNavigation$Companion$Result) {
        C17542s.j(upptackaImportProductNavigation$Companion$Result, "it");
        if (upptackaImportProductNavigation$Companion$Result instanceof UpptackaImportProductNavigation$Companion$Result.a) {
            fVar.U(d.o.f92166a);
        } else if (upptackaImportProductNavigation$Companion$Result instanceof UpptackaImportProductNavigation$Companion$Result.b) {
            fVar.U(d.a.f92149a);
        } else {
            throw new t();
        }
        fVar.U(d.i.f92159a);
        return C16807N.f139792a;
    }

    public final void h(String str, C5187o oVar, f fVar, RationalePermissionPromptNavigation rationalePermissionPromptNavigation, C5314c<String> cVar, c cVar2) {
        C16807N n10;
        C17542s.j(str, "destId");
        C17542s.j(oVar, "fragment");
        C17542s.j(fVar, "viewModel");
        C17542s.j(rationalePermissionPromptNavigation, "permissionPromptNavigation");
        C17542s.j(cVar, "permissionsLauncher");
        C17542s.j(cVar2, "navigateTo");
        if (cVar2 instanceof c.k) {
            n10 = x(str, oVar, fVar, (c.k) cVar2);
        } else if (cVar2 instanceof c.f) {
            p(str, oVar, (c.f) cVar2);
            n10 = C16807N.f139792a;
        } else if (cVar2 instanceof c.e) {
            n(oVar, fVar);
            n10 = C16807N.f139792a;
        } else if (cVar2 instanceof c.g) {
            r(str, oVar, (c.g) cVar2);
            n10 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, c.C2036c.f92139a)) {
            k(oVar, fVar);
            n10 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, c.j.f92147a)) {
            v(oVar, fVar);
            n10 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, c.d.f92140a)) {
            m(oVar);
            n10 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, c.b.f92138a)) {
            i(str, oVar);
            n10 = C16807N.f139792a;
        } else if (cVar2 instanceof c.h) {
            t(cVar, (c.h) cVar2);
            n10 = C16807N.f139792a;
        } else if (cVar2 instanceof c.i) {
            u(oVar, rationalePermissionPromptNavigation);
            n10 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, c.a.f92137a)) {
            C8951o f10 = f.f(oVar, str, (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                f10.k0();
            }
            n10 = C16807N.f139792a;
        } else {
            throw new t();
        }
        if (n10 != null) {
            fVar.U(d.i.f92159a);
        }
    }
}
