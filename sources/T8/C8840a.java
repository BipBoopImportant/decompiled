package t8;

import D8.c;
import HJ.C15854t;
import L1.j;
import L1.l;
import L1.m;
import L1.p;
import L1.s;
import XH.t;
import XH.x;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m8.C8563d;
import tI.C17978n;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "LL1/p;", "d", "(Landroidx/compose/ui/platform/AndroidComposeView;)LL1/p;", "Lm8/d;", "e", "(Landroidx/compose/ui/platform/AndroidComposeView;)Lm8/d;", "node", "", "indexInParent", "a", "(Lm8/d;I)I", "b", "c", "LD8/c;", "LD8/c;", "logger", "", "Z", "isComposeLazyPseudoScrollAxisRange", "compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t8.a  reason: case insensitive filesystem */
public final class C8840a {

    /* renamed from: a  reason: collision with root package name */
    private static final c f56660a = new c("Compose");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f56661b;

    static {
        Object obj;
        boolean z10 = true;
        try {
            x.a aVar = x.f139812b;
            Method[] declaredMethods = LazyLayoutSemanticState.class.getDeclaredMethods();
            C17542s.i(declaredMethods, "classLazyLayoutSemanticState.declaredMethods");
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                Method method = declaredMethods[i10];
                String name = method.getName();
                C17542s.i(name, "method.name");
                if (C15854t.b0(name, "pseudo", true)) {
                    break;
                } else if (C17542s.e(method.getName(), "getViewport")) {
                    break;
                } else {
                    i10++;
                }
            }
            obj = x.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        if (x.h(obj)) {
            f56660a.f("Detected compose version ".concat(((Boolean) obj).booleanValue() ? "1.6.0 or higher" : "prior 1.6.0"));
        }
        Throwable e10 = x.e(obj);
        Boolean bool = obj;
        if (e10 != null) {
            f56660a.i(e10, "Feature detection failed");
            bool = Boolean.FALSE;
        }
        f56661b = ((Boolean) bool).booleanValue();
    }

    public static final int a(C8563d dVar, int i10) {
        C17542s.j(dVar, "node");
        boolean z10 = f56661b;
        if (z10) {
            return b(dVar, i10);
        }
        if (!z10) {
            return c(dVar, i10);
        }
        throw new t();
    }

    private static final int b(C8563d dVar, int i10) {
        C8563d dVar2;
        p c10 = dVar.c();
        if (c10 == null) {
            return i10;
        }
        l n10 = c10.n();
        s sVar = s.f9010a;
        boolean k10 = n10.k(sVar.a());
        j jVar = (j) m.a(c10.n(), sVar.I());
        int i11 = 0;
        if (!(!k10 || jVar == null || (dVar2 = (C8563d) C16877v.y0(dVar.e())) == null)) {
            i11 = C17978n.e((int) (jVar.c().invoke().floatValue() - (c10.j().r() - dVar2.getBounds().r())), 0) / 500;
        }
        return i11 + i10;
    }

    private static final int c(C8563d dVar, int i10) {
        p c10 = dVar.c();
        if (c10 == null) {
            return i10;
        }
        l n10 = c10.n();
        s sVar = s.f9010a;
        boolean k10 = n10.k(sVar.a());
        j jVar = (j) m.a(c10.n(), sVar.I());
        return ((!k10 || jVar == null) ? 0 : (int) jVar.c().invoke().floatValue()) + i10;
    }

    public static final p d(AndroidComposeView androidComposeView) {
        C17542s.j(androidComposeView, "<this>");
        return androidComposeView.getSemanticsOwner().a();
    }

    public static final C8563d e(AndroidComposeView androidComposeView) {
        C17542s.j(androidComposeView, "<this>");
        return b.b(androidComposeView.getRoot());
    }
}
