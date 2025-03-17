package a9;

import D8.c;
import android.app.Activity;
import android.view.Window;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;
import nI.C17642l;

/* renamed from: a9.k3  reason: case insensitive filesystem */
public abstract class C6865k3 {

    /* renamed from: e  reason: collision with root package name */
    public static final C8537a[] f42650e = new C8537a[0];

    /* renamed from: a  reason: collision with root package name */
    public final O0 f42651a;

    /* renamed from: b  reason: collision with root package name */
    public final c f42652b;

    /* renamed from: c  reason: collision with root package name */
    public final C6908p6 f42653c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42654d;

    public C6865k3(O0 o02, c cVar, C6908p6 p6Var) {
        C17542s.j(o02, "pathGenerator");
        C17542s.j(cVar, "logger");
        C17542s.j(p6Var, "glassPane");
        this.f42651a = o02;
        this.f42652b = cVar;
        this.f42653c = p6Var;
    }

    public abstract void a(int i10, String str, String str2, C8537a[] aVarArr, boolean z10, Long l10, String str3);

    public final void b(Activity activity, String str) {
        C17542s.j(activity, "activity");
        C17542s.j(str, "webViewUrl");
        Activity activity2 = activity;
        String str2 = str;
        c(activity2, new C6926s1(this.f42654d, ((D4) this.f42653c).f41960d, new X3(activity, str, this.f42651a)), new O1(activity, (String) null, 6), str2, f42650e, false, (Long) null);
    }

    public final void c(Activity activity, C17642l lVar, O1 o12, String str, C8537a[] aVarArr, boolean z10, Long l10) {
        Window window = activity.getWindow();
        if (window == null) {
            c cVar = this.f42652b;
            cVar.l("[handleScreenChanged]: Was called for activity: [" + activity.getClass().getSimpleName() + "], but the activity did not have a Window");
        } else {
            String str2 = (String) lVar.invoke((FrameLayout) window.findViewById(16908290));
            if (str2 != null) {
                D4 d42 = (D4) this.f42653c;
                String str3 = d42.f41960d;
                d42.f41960d = str2;
                d42.f41961e = str;
                C17542s.j(aVarArr, "<set-?>");
                d42.f41962f = aVarArr;
                a((int) Math.max(Math.min(1, 2147483647L), -2147483648L), str, str2, aVarArr, z10, l10, str3);
                this.f42652b.f((String) o12.get());
            }
        }
        this.f42654d = false;
    }
}
