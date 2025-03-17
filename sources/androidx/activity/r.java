package androidx.activity;

import P4.d;
import P4.e;
import P4.f;
import P4.g;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.A;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bJ!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0017\u0010\u001eJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0017¢\u0006\u0004\b \u0010\u0013R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\u00020)8\u0006¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b-\u0010\u0013\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020!8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010/R\u0014\u00104\u001a\u0002018VX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/activity/r;", "Landroid/app/Dialog;", "Landroidx/lifecycle/y;", "Landroidx/activity/z;", "LP4/f;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "c", "Landroidx/lifecycle/A;", "a", "Landroidx/lifecycle/A;", "_lifecycleRegistry", "LP4/e;", "b", "LP4/e;", "savedStateRegistryController", "Landroidx/activity/w;", "Landroidx/activity/w;", "getOnBackPressedDispatcher", "()Landroidx/activity/w;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "()Landroidx/lifecycle/A;", "lifecycleRegistry", "LP4/d;", "getSavedStateRegistry", "()LP4/d;", "savedStateRegistry", "Landroidx/lifecycle/r;", "getLifecycle", "()Landroidx/lifecycle/r;", "lifecycle", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class r extends Dialog implements C5221y, z, f {

    /* renamed from: a  reason: collision with root package name */
    private A f15294a;

    /* renamed from: b  reason: collision with root package name */
    private final e f15295b;

    /* renamed from: c  reason: collision with root package name */
    private final w f15296c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    private final A b() {
        A a10 = this.f15294a;
        if (a10 != null) {
            return a10;
        }
        A a11 = new A(this);
        this.f15294a = a11;
        return a11;
    }

    /* access modifiers changed from: private */
    public static final void d(r rVar) {
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C17542s.j(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        C17542s.g(window);
        View decorView = window.getDecorView();
        C17542s.i(decorView, "window!!.decorView");
        l0.b(decorView, this);
        Window window2 = getWindow();
        C17542s.g(window2);
        View decorView2 = window2.getDecorView();
        C17542s.i(decorView2, "window!!.decorView");
        C.b(decorView2, this);
        Window window3 = getWindow();
        C17542s.g(window3);
        View decorView3 = window3.getDecorView();
        C17542s.i(decorView3, "window!!.decorView");
        g.b(decorView3, this);
    }

    public androidx.lifecycle.r getLifecycle() {
        return b();
    }

    public final w getOnBackPressedDispatcher() {
        return this.f15296c;
    }

    public d getSavedStateRegistry() {
        return this.f15295b.b();
    }

    public void onBackPressed() {
        this.f15296c.l();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            w wVar = this.f15296c;
            OnBackInvokedDispatcher a10 = getOnBackInvokedDispatcher();
            C17542s.i(a10, "onBackInvokedDispatcher");
            wVar.o(a10);
        }
        this.f15295b.d(bundle);
        b().l(r.a.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C17542s.i(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f15295b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        b().l(r.a.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        b().l(r.a.ON_DESTROY);
        this.f15294a = null;
        super.onStop();
    }

    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, int i10) {
        super(context, i10);
        C17542s.j(context, "context");
        this.f15295b = e.f39378d.a(this);
        this.f15296c = new w(new q(this));
    }

    public void setContentView(View view) {
        C17542s.j(view, "view");
        c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C17542s.j(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
