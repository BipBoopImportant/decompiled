package kj;

import Hj.t;
import Hj.u;
import Hj.y;
import Ij.h;
import Ij.i;
import QJ.M;
import android.content.Context;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.C5222z;
import gj.C11295f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJC\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lkj/f;", "", "<init>", "()V", "Landroidx/fragment/app/o;", "fragment", "Lgj/i;", "f", "(Landroidx/fragment/app/o;)Lgj/i;", "LWw/u;", "permissionStatusCheck", "LGj/h;", "d", "(LWw/u;)LGj/h;", "Lgj/f;", "c", "(Landroidx/fragment/app/o;)Lgj/f;", "processor", "LHj/y;", "scannerFilterProcessorFactory", "scannerPermissionHandler", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcher", "LHj/t;", "e", "(Landroidx/fragment/app/o;Lgj/i;LHj/y;LGj/h;Landroid/content/Context;LQJ/M;)LHj/t;", "LHj/u;", "b", "(Landroidx/fragment/app/o;Lgj/f;LHj/y;LGj/h;Landroid/content/Context;LQJ/M;)LHj/u;", "LIj/i;", "scannerBarcodeEmitter", "LIj/h;", "a", "(Landroidx/fragment/app/o;LIj/i;)LIj/h;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f98962a = new f();

    private f() {
    }

    public final h a(C5187o oVar, i iVar) {
        C17542s.j(oVar, "fragment");
        C17542s.j(iVar, "scannerBarcodeEmitter");
        return new h(iVar);
    }

    public final u b(C5187o oVar, C11295f fVar, y yVar, Gj.h hVar, Context context, M m10) {
        C17542s.j(oVar, "fragment");
        C17542s.j(fVar, "processor");
        C17542s.j(yVar, "scannerFilterProcessorFactory");
        C17542s.j(hVar, "scannerPermissionHandler");
        C17542s.j(context, "context");
        C17542s.j(m10, "dispatcher");
        return new u(C5222z.a(oVar), fVar, yVar, hVar, context, m10);
    }

    public final C11295f c(C5187o oVar) {
        C17542s.j(oVar, "fragment");
        return new C11295f(C5222z.a(oVar));
    }

    public final Gj.h d(Ww.u uVar) {
        C17542s.j(uVar, "permissionStatusCheck");
        return new Gj.h(uVar);
    }

    public final t e(C5187o oVar, gj.i iVar, y yVar, Gj.h hVar, Context context, M m10) {
        C17542s.j(oVar, "fragment");
        C17542s.j(iVar, "processor");
        C17542s.j(yVar, "scannerFilterProcessorFactory");
        C17542s.j(hVar, "scannerPermissionHandler");
        C17542s.j(context, "context");
        C17542s.j(m10, "dispatcher");
        return new t(C5222z.a(oVar), iVar, yVar, hVar, context, m10);
    }

    public final gj.i f(C5187o oVar) {
        C17542s.j(oVar, "fragment");
        return new gj.i(C5222z.a(oVar));
    }
}
