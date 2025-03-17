package androidx.core.app;

import I2.C4634t;
import XH.C16814e;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.A;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.r;
import j0.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010\"\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\"\u0010\u000bR.\u0010$\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0018\u0012\u0004\u0012\u00020\f0#8\u0002X\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u001a\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0005R\u0014\u0010.\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Landroidx/core/app/i;", "Landroid/app/Activity;", "Landroidx/lifecycle/y;", "LI2/t$a;", "<init>", "()V", "", "", "args", "", "shouldSkipDump", "([Ljava/lang/String;)Z", "Landroidx/core/app/i$a;", "extraData", "LXH/N;", "putExtraData", "(Landroidx/core/app/i$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "T", "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Landroidx/core/app/i$a;", "Landroid/view/KeyEvent;", "event", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "shouldDumpInternalState", "Lj0/b0;", "extraDataMap", "Lj0/b0;", "getExtraDataMap$annotations", "Landroidx/lifecycle/A;", "lifecycleRegistry", "Landroidx/lifecycle/A;", "getLifecycleRegistry$annotations", "Landroidx/lifecycle/r;", "getLifecycle", "()Landroidx/lifecycle/r;", "lifecycle", "a", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class i extends Activity implements C5221y, C4634t.a {
    private final b0<Class<? extends a>, a> extraDataMap = new b0<>(0, 1, (DefaultConstructorMarker) null);
    private final A lifecycleRegistry = new A(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/app/i$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @C16814e
    public static class a {
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    private final boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C17542s.j(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C17542s.i(decorView, "window.decorView");
        if (C4634t.d(decorView, keyEvent)) {
            return true;
        }
        return C4634t.e(this, decorView, this, keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C17542s.j(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C17542s.i(decorView, "window.decorView");
        if (C4634t.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @C16814e
    public <T extends a> T getExtraData(Class<T> cls) {
        C17542s.j(cls, "extraDataClass");
        return (a) this.extraDataMap.get(cls);
    }

    public r getLifecycle() {
        return this.lifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.f22205b.c(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        this.lifecycleRegistry.q(r.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @C16814e
    public void putExtraData(a aVar) {
        C17542s.j(aVar, "extraData");
        this.extraDataMap.put(aVar.getClass(), aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        C17542s.j(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
