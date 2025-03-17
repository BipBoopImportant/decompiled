package Iz;

import HJ.C15854t;
import Iz.Y;
import QJ.Q;
import Ry.b;
import XH.C16807N;
import XH.y;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.adjust.sdk.Constants;
import com.ingka.ikea.app.scanandgoonlineprovider.dialog.ConnectToWifiDialog;
import com.ingka.ikea.app.scanandgoonlineprovider.dialog.UnstableConnectionDialog;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import ow.c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rw.g;
import tf.C10253a;
import x4.C8951o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J-\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J)\u0010#\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010&JI\u0010-\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u00102¨\u00063"}, d2 = {"LIz/b0;", "LIz/Y;", "LSy/a;", "scanAndGoAnalytics", "Ltf/a;", "killSwitch", "LRy/b;", "scanAndGoCapability", "<init>", "(LSy/a;Ltf/a;LRy/b;)V", "Lx4/o;", "navController", "LAe/l;", "entryPoint", "LXH/N;", "m", "(Lx4/o;LAe/l;)V", "h", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "c", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function0;", "onDismiss", "j", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/a;)V", "i", "f", "", "barcode", "d", "(Lx4/o;Ljava/lang/String;)V", "deeplink", "e", "(Lx4/o;LAe/l;Ljava/lang/String;)V", "g", "(Lx4/o;)V", "title", "description", "badge", "buttonText", "imageUrl", "imageContentDescription", "b", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "LSy/a;", "Ltf/a;", "LRy/b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements Y {

    /* renamed from: a  reason: collision with root package name */
    private final Sy.a f111015a;

    /* renamed from: b  reason: collision with root package name */
    private final C10253a f111016b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b f111017c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.navigation.ScanAndGoNavigationImpl$start$isStoreConfirmed$1", f = "ScanAndGoNavigationImpl.kt", l = {44}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111018c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b0 f111019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f111019d = b0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f111019d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111018c;
            if (i10 == 0) {
                y.b(obj);
                b l10 = this.f111019d.f111017c;
                this.f111018c = 1;
                obj = l10.c(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public b0(Sy.a aVar, C10253a aVar2, b bVar) {
        C17542s.j(aVar, "scanAndGoAnalytics");
        C17542s.j(aVar2, "killSwitch");
        C17542s.j(bVar, "scanAndGoCapability");
        this.f111015a = aVar;
        this.f111016b = aVar2;
        this.f111017c = bVar;
    }

    private final void m(C8951o oVar, Ae.l lVar) {
        Uri build = c.a(Uri.parse("ikea://navigation/scanandgo/onboarding?entryPoint={entryPoint}&")).buildUpon().appendQueryParameter("entryPoint", lVar.b()).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    /* access modifiers changed from: private */
    public static final void n(C17631a aVar, FragmentManager fragmentManager, String str, String str2, Bundle bundle) {
        C17542s.j(str2, "<unused var>");
        C17542s.j(bundle, "<unused var>");
        aVar.invoke();
        fragmentManager.z(str);
    }

    /* access modifiers changed from: private */
    public static final void o(C17631a aVar, FragmentManager fragmentManager, String str, String str2, Bundle bundle) {
        C17542s.j(str2, "<unused var>");
        C17542s.j(bundle, "<unused var>");
        aVar.invoke();
        fragmentManager.z(str);
    }

    public void b(C8951o oVar, String str, String str2, String str3, String str4, String str5, String str6) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "title");
        C17542s.j(str2, "description");
        C17542s.j(str3, "badge");
        C17542s.j(str4, "buttonText");
        C17542s.j(str5, "imageUrl");
        Uri.Builder appendQueryParameter = Uri.parse(c.b(c0.f111023a.a())).buildUpon().appendQueryParameter("readMoreTitle", str).appendQueryParameter("readMoreDescription", str2);
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        Uri build = g.a(appendQueryParameter, "readMoreImageContentDescription", str6).appendQueryParameter("readMoreImageUrl", str5).appendQueryParameter("readMoreBadge", str3).appendQueryParameter("buttonText", str4).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }

    public void c(FragmentManager fragmentManager) {
        C17542s.j(fragmentManager, "fragmentManager");
        new UnstableConnectionDialog().show(fragmentManager, "UnstableConnectionDialog");
    }

    public void d(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "barcode");
        Uri build = c.a(Uri.parse("ikea://navigation/scanandgo/scanner/v1/collect?barcode={barcode}")).buildUpon().appendQueryParameter("barcode", str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void e(C8951o oVar, Ae.l lVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(lVar, "entryPoint");
        Uri build = c.a(Uri.parse("ikea://navigation/scanandgo/scanner/v1/product?entryPoint={entryPoint}&deeplink={deeplink}")).buildUpon().appendQueryParameter("entryPoint", lVar.b()).appendQueryParameter(Constants.DEEPLINK, str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void f(FragmentManager fragmentManager, C5221y yVar, C17631a<C16807N> aVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(aVar, "onDismiss");
        fragmentManager.R1("fr_res_key_wifi", yVar, new a0(aVar, fragmentManager, "fr_res_key_wifi"));
    }

    public void g(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri build = c.a(Uri.parse("ikea://navigation/scanandgo/scanner/v1/coupon")).buildUpon().build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void h(C8951o oVar, Ae.l lVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(lVar, "entryPoint");
        if (!this.f111016b.q()) {
            Throwable th2 = new Throwable("ScanAndGo not supported");
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = b0.class.getName();
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
        } else if (((Boolean) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null)).booleanValue()) {
            this.f111015a.E(lVar);
            Y.b.a(this, oVar, lVar, (String) null, 4, (Object) null);
        } else {
            this.f111015a.C(lVar);
            m(oVar, lVar);
        }
    }

    public void i(FragmentManager fragmentManager) {
        C17542s.j(fragmentManager, "fragmentManager");
        new ConnectToWifiDialog().show(fragmentManager, "ConnectToWifiDialog");
    }

    public void j(FragmentManager fragmentManager, C5221y yVar, C17631a<C16807N> aVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(aVar, "onDismiss");
        fragmentManager.R1("fr_res_key_no_connection", yVar, new Z(aVar, fragmentManager, "fr_res_key_no_connection"));
    }
}
