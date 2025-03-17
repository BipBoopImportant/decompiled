package f5;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import c5.C7094a;
import d5.e;
import java.lang.reflect.Method;
import k5.C8433a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17631a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lf5/e;", "", "Ljava/lang/ClassLoader;", "loader", "Ld5/d;", "consumerAdapter", "<init>", "(Ljava/lang/ClassLoader;Ld5/d;)V", "", "e", "()Z", "o", "k", "l", "m", "n", "i", "j", "a", "Ljava/lang/ClassLoader;", "b", "Ld5/d;", "Lc5/a;", "c", "Lc5/a;", "safeWindowExtensionsProvider", "Ljava/lang/Class;", "f", "()Ljava/lang/Class;", "foldingFeatureClass", "h", "windowLayoutComponentClass", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "g", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: f5.e  reason: case insensitive filesystem */
public final class C7849e {

    /* renamed from: a  reason: collision with root package name */
    private final ClassLoader f51133a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final d5.d f51134b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C7094a f51135c;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f5.e$a */
    static final class a extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7849e f51136c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C7849e eVar) {
            super(0);
            this.f51136c = eVar;
        }

        public final Boolean invoke() {
            boolean z10;
            Class b10 = this.f51136c.f();
            Method method = b10.getMethod("getBounds", (Class[]) null);
            Method method2 = b10.getMethod("getType", (Class[]) null);
            Method method3 = b10.getMethod("getState", (Class[]) null);
            C8433a aVar = C8433a.f54146a;
            C17542s.i(method, "getBoundsMethod");
            if (aVar.c(method, P.b(Rect.class)) && aVar.d(method)) {
                C17542s.i(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (aVar.c(method2, P.b(cls)) && aVar.d(method2)) {
                    C17542s.i(method3, "getStateMethod");
                    if (aVar.c(method3, P.b(cls)) && aVar.d(method3)) {
                        z10 = true;
                        return Boolean.valueOf(z10);
                    }
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f5.e$b */
    static final class b extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7849e f51137c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C7849e eVar) {
            super(0);
            this.f51137c = eVar;
        }

        public final Boolean invoke() {
            boolean z10;
            Class<?> b10 = this.f51137c.f51134b.b();
            if (b10 == null) {
                return Boolean.FALSE;
            }
            Class d10 = this.f51137c.h();
            Method method = d10.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, b10});
            Method method2 = d10.getMethod("removeWindowLayoutInfoListener", new Class[]{b10});
            C8433a aVar = C8433a.f54146a;
            C17542s.i(method, "addListenerMethod");
            if (aVar.d(method)) {
                C17542s.i(method2, "removeListenerMethod");
                if (aVar.d(method2)) {
                    z10 = true;
                    return Boolean.valueOf(z10);
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f5.e$c */
    static final class c extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7849e f51138c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C7849e eVar) {
            super(0);
            this.f51138c = eVar;
        }

        public final Boolean invoke() {
            boolean z10;
            Class d10 = this.f51138c.h();
            Class<Consumer> cls = Consumer.class;
            Method method = d10.getMethod("addWindowLayoutInfoListener", new Class[]{Context.class, cls});
            Method method2 = d10.getMethod("removeWindowLayoutInfoListener", new Class[]{cls});
            C8433a aVar = C8433a.f54146a;
            C17542s.i(method, "addListenerMethod");
            if (aVar.d(method)) {
                C17542s.i(method2, "removeListenerMethod");
                if (aVar.d(method2)) {
                    z10 = true;
                    return Boolean.valueOf(z10);
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f5.e$d */
    static final class d extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7849e f51139c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C7849e eVar) {
            super(0);
            this.f51139c = eVar;
        }

        public final Boolean invoke() {
            Method method = this.f51139c.f51135c.c().getMethod("getWindowLayoutComponent", (Class[]) null);
            Class d10 = this.f51139c.h();
            C8433a aVar = C8433a.f54146a;
            C17542s.i(method, "getWindowLayoutComponentMethod");
            return Boolean.valueOf(aVar.d(method) && aVar.b(method, d10));
        }
    }

    public C7849e(ClassLoader classLoader, d5.d dVar) {
        C17542s.j(classLoader, "loader");
        C17542s.j(dVar, "consumerAdapter");
        this.f51133a = classLoader;
        this.f51134b = dVar;
        this.f51135c = new C7094a(classLoader);
    }

    private final boolean e() {
        if (!n()) {
            return false;
        }
        int a10 = e.f50736a.a();
        if (a10 == 1) {
            return i();
        }
        if (2 > a10 || a10 > Integer.MAX_VALUE) {
            return false;
        }
        return j();
    }

    /* access modifiers changed from: private */
    public final Class<?> f() {
        Class<?> loadClass = this.f51133a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        C17542s.i(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return loadClass;
    }

    /* access modifiers changed from: private */
    public final Class<?> h() {
        Class<?> loadClass = this.f51133a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C17542s.i(loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return loadClass;
    }

    private final boolean k() {
        return C8433a.e("FoldingFeature class is not valid", new a(this));
    }

    private final boolean l() {
        return C8433a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b(this));
    }

    private final boolean m() {
        return C8433a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c(this));
    }

    private final boolean o() {
        return C8433a.e("WindowExtensions#getWindowLayoutComponent is not valid", new d(this));
    }

    public final WindowLayoutComponent g() {
        if (!e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean n() {
        return this.f51135c.f() && o() && k();
    }
}
