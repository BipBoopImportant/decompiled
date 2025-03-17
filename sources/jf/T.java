package JF;

import HJ.C15854t;
import I2.C0;
import I2.C4626o0;
import I2.b1;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.Window;
import androidx.core.app.C5147b;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.core.logger.Priority;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0019\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010*\u001a\u0004\u0018\u00010&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)¨\u0006+"}, d2 = {"LJF/T;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "Landroidx/lifecycle/h;", "<init>", "()V", "LXH/N;", "j", "", "decorFitsSystemWindows", "f", "(Ljava/lang/Boolean;)V", "visible", "i", "(Z)V", "isLight", "h", "", "orientation", "g", "(Ljava/lang/Integer;)V", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "systemUiVisible", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "owner", "c", "(Landroidx/lifecycle/y;)V", "onResume", "onDestroy", "a", "Z", "b", "Ljava/lang/Integer;", "d", "Landroid/app/Activity;", "LI2/b1;", "e", "LXH/o;", "()LI2/b1;", "controller", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class T implements SystemUiDelegate, C5205h {

    /* renamed from: a  reason: collision with root package name */
    private boolean f111294a = true;

    /* renamed from: b  reason: collision with root package name */
    private boolean f111295b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f111296c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f111297d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f111298e = C16825p.b(new P(this));

    /* access modifiers changed from: private */
    public static final b1 b(T t10) {
        Window window;
        Activity activity = t10.f111297d;
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        Activity activity2 = t10.f111297d;
        if (activity2 != null) {
            return C4626o0.a(window, C5147b.x(activity2, 16908290));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final b1 d() {
        return (b1) this.f111298e.getValue();
    }

    private final void f(Boolean bool) {
        Activity activity = this.f111297d;
        if (activity != null && bool != null) {
            C4626o0.b(activity.getWindow(), bool.booleanValue());
        }
    }

    private final void g(Integer num) {
        Activity activity;
        Priority priority = Priority.DEBUG;
        String str = "Setting orientation: " + num;
        if (str == null) {
            str = "";
        }
        int i10 = Q.f111292a[priority.ordinal()];
        Class<T> cls = T.class;
        if (i10 == 1) {
            String name = cls.getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o12.length() != 0) {
                name = C15854t.P0(o12, "Kt");
            }
            Log.v(name, str + " " + "");
        } else if (i10 == 2) {
            String name2 = cls.getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o13.length() != 0) {
                name2 = C15854t.P0(o13, "Kt");
            }
            Log.d(name2, str + " " + "");
        } else if (i10 == 3) {
            String name3 = cls.getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o14.length() != 0) {
                name3 = C15854t.P0(o14, "Kt");
            }
            Log.i(name3, str + " " + "");
        } else if (i10 == 4) {
            String name4 = cls.getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o15.length() != 0) {
                name4 = C15854t.P0(o15, "Kt");
            }
            Log.w(name4, str + " " + "");
        } else if (i10 == 5) {
            String name5 = cls.getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o16.length() != 0) {
                name5 = C15854t.P0(o16, "Kt");
            }
            Log.e(name5, str + " " + "");
        } else {
            throw new t();
        }
        if (num != null && (activity = this.f111297d) != null) {
            activity.setRequestedOrientation(num.intValue());
        }
    }

    private final void h(Boolean bool) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            b1 d10 = d();
            if (d10 != null) {
                d10.d(booleanValue);
            }
        }
    }

    private final void i(boolean z10) {
        Priority priority = Priority.DEBUG;
        String str = "Setting systemUiVisibility = " + z10;
        if (str == null) {
            str = "";
        }
        int i10 = S.f111293a[priority.ordinal()];
        Class<T> cls = T.class;
        if (i10 == 1) {
            String name = cls.getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o12.length() != 0) {
                name = C15854t.P0(o12, "Kt");
            }
            Log.v(name, str + " " + "");
        } else if (i10 == 2) {
            String name2 = cls.getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o13.length() != 0) {
                name2 = C15854t.P0(o13, "Kt");
            }
            Log.d(name2, str + " " + "");
        } else if (i10 == 3) {
            String name3 = cls.getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o14.length() != 0) {
                name3 = C15854t.P0(o14, "Kt");
            }
            Log.i(name3, str + " " + "");
        } else if (i10 == 4) {
            String name4 = cls.getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o15.length() != 0) {
                name4 = C15854t.P0(o15, "Kt");
            }
            Log.w(name4, str + " " + "");
        } else if (i10 == 5) {
            String name5 = cls.getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o16.length() != 0) {
                name5 = C15854t.P0(o16, "Kt");
            }
            Log.e(name5, str + " " + "");
        } else {
            throw new t();
        }
        Activity activity = this.f111297d;
        if (activity == null) {
            return;
        }
        if (z10) {
            b1 b1Var = new b1(activity.getWindow(), activity.findViewById(16908290));
            b1Var.f(C0.l.g() | C0.l.f());
            b1Var.e(1);
            activity.getWindow().clearFlags(512);
            return;
        }
        b1 b1Var2 = new b1(activity.getWindow(), activity.findViewById(16908290));
        b1Var2.a(C0.l.g() | C0.l.f());
        b1Var2.e(2);
        activity.getWindow().setFlags(512, 512);
        if (Build.VERSION.SDK_INT >= 28) {
            activity.getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = (r0 = r0.getResources()).getConfiguration();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j() {
        /*
            r4 = this;
            java.lang.Integer r0 = r4.f111296c
            r4.g(r0)
            boolean r0 = r4.f111294a
            r4.i(r0)
            android.app.Activity r0 = r4.f111297d
            if (r0 == 0) goto L_0x0021
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0021
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L_0x0021
            int r0 = r0.uiMode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0031
            int r0 = r0.intValue()
            r0 = r0 & 48
            r3 = 32
            if (r0 != r3) goto L_0x0031
            r1 = r2
        L_0x0031:
            r0 = r1 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.h(r0)
            boolean r0 = r4.f111295b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: JF.T.j():void");
    }

    public void c(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.c(yVar);
        j();
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f111297d = activity;
        this.f111296c = num;
        this.f111294a = z10;
        this.f111295b = z11;
        yVar.getLifecycle().c(this);
        if (yVar.getLifecycle().d().b(r.b.RESUMED)) {
            j();
        }
    }

    public void onDestroy(C5221y yVar) {
        C17542s.j(yVar, "owner");
        this.f111297d = null;
        super.onDestroy(yVar);
    }

    public void onResume(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.onResume(yVar);
        j();
    }
}
