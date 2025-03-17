package mC;

import HJ.C15854t;
import YH.C16877v;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5221y;
import com.sugarcube.core.logger.DslKt;
import jC.C14614a;
import jC.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mC.C14787e;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u001a\u0010#\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LmC/d;", "LmC/e$a;", "Landroidx/fragment/app/o;", "fragment", "<init>", "(Landroidx/fragment/app/o;)V", "LjC/h;", "parent", "", "parentName", "LjC/a;", "config", "LXH/N;", "j", "(LjC/h;Ljava/lang/String;LjC/a;)V", "i", "(Ljava/lang/String;)Ljava/lang/String;", "message", "h", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "a", "(LjC/a;)V", "Landroid/view/Window;", "d", "()Landroid/view/Window;", "Landroidx/lifecycle/y;", "c", "()Landroidx/lifecycle/y;", "Landroid/view/View;", "b", "()Landroid/view/View;", "Landroidx/fragment/app/o;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mC.d  reason: case insensitive filesystem */
public final class C14786d implements C14787e.a {

    /* renamed from: a  reason: collision with root package name */
    private final C5187o f129362a;

    /* renamed from: b  reason: collision with root package name */
    private final String f129363b;

    public C14786d(C5187o oVar) {
        C17542s.j(oVar, "fragment");
        this.f129362a = oVar;
        String simpleName = oVar.getClass().getSimpleName();
        C17542s.i(simpleName, "getSimpleName(...)");
        this.f129363b = simpleName;
    }

    /* access modifiers changed from: private */
    public final String h(String str, String str2) {
        String name = getName();
        return C15854t.m("\n        " + name + " wants to draw under the system bars but the parent Activity prevent it.\n    \n        Mismatched config(s):\n        " + str2 + "\n        \n        If this is a problem, have a look at " + str + " and configure it properly in:\n            installSystemUiHandler(...)\n        ");
    }

    /* access modifiers changed from: private */
    public final String i(String str) {
        String name = getName();
        return C15854t.m("\n        " + name + " requires the parent Activity to also be implementing SystemUi like:\n        Add:\n            class MyActivity : Activity(), `SystemUi by SystemUi()`\n        to the Activity and call\n            installSystemUiHandler()\n        in onCreate().\n\n        Have a look at " + str + " and make sure it's set up.\n        ");
    }

    private final void j(h hVar, String str, C14614a aVar) {
        boolean z10;
        boolean z11;
        String str2 = str;
        String str3 = null;
        if (!hVar.j0()) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            Iterator it = d.f102012a.a().iterator();
            while (true) {
                z11 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a(i(str2), (Throwable) null);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str4 == null) {
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "SystemUi";
                }
                String str5 = str4;
                bVar.a(eVar, str5, z11, (Throwable) null, str3);
                str4 = str5;
                z11 = z11;
            }
            return;
        }
        C14614a e02 = hVar.e0();
        ArrayList arrayList2 = new ArrayList();
        if (aVar.e() && !e02.e()) {
            arrayList2.add("status bar");
        }
        if (aVar.d() && !e02.d()) {
            arrayList2.add("navigation bar");
        }
        if (aVar.c() && !e02.c()) {
            arrayList2.add("display cutout");
        }
        if (!arrayList2.isEmpty()) {
            String G02 = C16877v.G0(arrayList2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C14785c(), 30, (Object) null);
            e eVar2 = e.WARN;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            Iterator it2 = d.f102012a.a().iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList3.add(next2);
                }
            }
            String str6 = null;
            for (C11819b bVar2 : arrayList3) {
                if (str3 == null) {
                    String a11 = C11818a.a(h(str2, G02), (Throwable) null);
                    if (a11 != null) {
                        str3 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str6 == null) {
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "SystemUi";
                }
                String str7 = str6;
                bVar2.a(eVar2, str7, z10, (Throwable) null, str3);
                str6 = str7;
                eVar2 = eVar2;
                z10 = z10;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final CharSequence k(String str) {
        C17542s.j(str, "it");
        return "Fragment want to draw under " + str + " but parent prevent it";
    }

    public void a(C14614a aVar) {
        C17542s.j(aVar, "config");
        C5191t requireActivity = this.f129362a.requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        h hVar = requireActivity instanceof h ? (h) requireActivity : null;
        if (hVar != null) {
            String simpleName = requireActivity.getClass().getSimpleName();
            C17542s.i(simpleName, "getSimpleName(...)");
            j(hVar, simpleName, aVar);
        }
    }

    public View b() {
        View requireView = this.f129362a.requireView();
        C17542s.i(requireView, "requireView(...)");
        return requireView;
    }

    public C5221y c() {
        C5221y viewLifecycleOwner = this.f129362a.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return viewLifecycleOwner;
    }

    public Window d() {
        C5191t activity = this.f129362a.getActivity();
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            return window;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public String getName() {
        return this.f129363b;
    }
}
