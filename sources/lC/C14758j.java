package lC;

import XH.t;
import YC.C13858c;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import jC.C14615b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tK.C18010a;
import u2.C6012a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R+\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0002¢\u0006\u0012\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0013\u0010\u001b*\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LlC/j;", "LlC/k;", "Landroid/view/View;", "view", "Landroid/view/Window;", "window", "LlC/d;", "iconColorHandler", "<init>", "(Landroid/view/View;Landroid/view/Window;LlC/d;)V", "", "drawUnder", "", "background", "LXH/N;", "c", "(ZI)V", "b", "(Z)V", "a", "Landroid/view/View;", "Landroid/view/Window;", "LlC/d;", "LjC/b;", "<set-?>", "getIconColor", "()LjC/b;", "(LjC/b;)V", "getIconColor$delegate", "(LlC/j;)Ljava/lang/Object;", "iconColor", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lC.j  reason: case insensitive filesystem */
public final class C14758j implements k {

    /* renamed from: a  reason: collision with root package name */
    private final View f128911a;

    /* renamed from: b  reason: collision with root package name */
    private final Window f128912b;

    /* renamed from: c  reason: collision with root package name */
    private final C14752d f128913c;

    public C14758j(View view, Window window, C14752d dVar) {
        C17542s.j(view, "view");
        C17542s.j(dVar, "iconColorHandler");
        this.f128911a = view;
        this.f128912b = window;
        this.f128913c = dVar;
    }

    private final void c(boolean z10, int i10) {
        Window window = this.f128912b;
        if (window != null) {
            window.setNavigationBarColor(z10 ? 0 : C6012a.c(this.f128911a.getContext(), i10));
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                window.setNavigationBarDividerColor(0);
            }
            if (i11 >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public void a(C14615b bVar) {
        C17542s.j(bVar, "<set-?>");
        this.f128913c.c(bVar);
    }

    public void b(boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            Context context = this.f128911a.getContext();
            C17542s.i(context, "getContext(...)");
            boolean b10 = C13858c.b(context);
            if (b10) {
                c(z10, C18010a.f147423g);
            } else if (!b10) {
                c(z10, C18010a.f147425i);
            } else {
                throw new t();
            }
        } else {
            c(z10, C18010a.f147425i);
        }
    }
}
