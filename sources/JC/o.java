package jC;

import HJ.C15854t;
import XH.C16807N;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lC.C14751c;
import mC.C14783a;
import mC.C14784b;
import mC.C14786d;
import mC.C14787e;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\t*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001a\u001a\u00020\t*\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001d\u001a\u00020\t*\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\t2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0#H\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010,R$\u00103\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00128\u0016@RX\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020(8BX\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010:¨\u0006<"}, d2 = {"LjC/o;", "LjC/h;", "Landroidx/lifecycle/h;", "<init>", "()V", "LmC/e;", "target", "LjC/a;", "config", "LXH/N;", "j", "(LmC/e;LjC/a;)V", "Lkotlin/Function0;", "", "msg", "o", "(LnI/a;)LjC/o;", "Landroidx/fragment/app/t;", "", "drawUnderStatusBar", "drawUnderNavigationBar", "drawUnderDisplayCutout", "handleImeInsets", "a0", "(Landroidx/fragment/app/t;ZZZZ)V", "Landroidx/fragment/app/o;", "c0", "(Landroidx/fragment/app/o;ZZZZ)V", "Landroidx/fragment/app/DialogFragment;", "d", "(Landroidx/fragment/app/DialogFragment;ZZZZ)V", "Landroidx/lifecycle/y;", "owner", "onDestroy", "(Landroidx/lifecycle/y;)V", "Lkotlin/Function1;", "LjC/q;", "block", "b", "(LnI/l;)V", "LjC/s;", "a", "LjC/s;", "_systemUiInternal", "LmC/e;", "_target", "value", "c", "Z", "j0", "()Z", "isSystemUiInstalled", "i", "()LjC/s;", "systemUiInternal", "e0", "()LjC/a;", "drawUnderConfig", "()LjC/q;", "systemUi", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements h, C5205h {

    /* renamed from: a  reason: collision with root package name */
    private s f127878a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C14787e f127879b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f127880c;

    private final s i() {
        s sVar = this.f127878a;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalArgumentException("Accessed systemUi when null, did you call installSystemUiHandler()");
    }

    private final void j(C14787e eVar, C14614a aVar) {
        if (!j0()) {
            this.f127879b = eVar;
            o(new m(aVar));
            C5221y c10 = eVar.c();
            this.f127878a = new r(aVar, eVar, (C14751c) null, 4, (DefaultConstructorMarker) null);
            o(new n());
            c10.getLifecycle().c(this);
            this.f127880c = true;
            return;
        }
        throw new IllegalStateException("Don't call installSystemUiHandler more than once, did a super class do it already?");
    }

    /* access modifiers changed from: private */
    public static final String k(C14614a aVar) {
        String simpleName = C14616c.a(C14615b.f127855a).getClass().getSimpleName();
        return "Installing SystemUi: IconColor:" + simpleName + " DrawBehind:" + aVar;
    }

    /* access modifiers changed from: private */
    public static final String m() {
        return "Adding lifecycle observer";
    }

    private final o o(C17631a<String> aVar) {
        e eVar = e.DEBUG;
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
                C14787e h10 = this.f127879b;
                String name = h10 != null ? h10.getName() : null;
                String a10 = C11818a.a("[" + name + "] " + aVar.invoke(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "SystemUi";
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return this;
    }

    /* access modifiers changed from: private */
    public static final String p() {
        return "onDestroy, removing lifecycle observer";
    }

    public q Z() {
        return i();
    }

    public void a0(C5191t tVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(tVar, "<this>");
        j(new C14784b(tVar), new C14614a(z10, z11, z12, z13));
    }

    public void b(C17642l<? super q, C16807N> lVar) {
        C17542s.j(lVar, "block");
        lVar.invoke(Z());
    }

    public void c0(C5187o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(oVar, "<this>");
        j(new C14786d(oVar), new C14614a(z10, z11, z12, z13));
    }

    public void d(DialogFragment dialogFragment, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(dialogFragment, "<this>");
        j(new C14783a(dialogFragment), new C14614a(z10, z11, z12, z13));
    }

    public C14614a e0() {
        return i().getConfig();
    }

    public boolean j0() {
        return this.f127880c;
    }

    public void onDestroy(C5221y yVar) {
        C17542s.j(yVar, "owner");
        o(new l());
        this.f127878a = null;
        this.f127879b = null;
        yVar.getLifecycle().g(this);
        this.f127880c = false;
    }
}
