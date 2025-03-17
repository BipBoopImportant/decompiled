package c5;

import java.lang.reflect.Method;
import k5.C8433a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\f8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lc5/a;", "", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Ljava/lang/ClassLoader;)V", "", "e", "()Z", "f", "a", "Ljava/lang/ClassLoader;", "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "windowExtensionsProviderClass", "c", "windowExtensionsClass", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: c5.a  reason: case insensitive filesystem */
public final class C7094a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f45661a;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "b", "()Ljava/lang/Class;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: c5.a$a  reason: collision with other inner class name */
    static final class C0795a extends C17544u implements C17631a<Class<?>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7094a f45662c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0795a(C7094a aVar) {
            super(0);
            this.f45662c = aVar;
        }

        /* renamed from: b */
        public final Class<?> invoke() {
            Class<?> loadClass = this.f45662c.f45661a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            C17542s.i(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return loadClass;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: c5.a$b */
    static final class b extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7094a f45663c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C7094a aVar) {
            super(0);
            this.f45663c = aVar;
        }

        public final Boolean invoke() {
            Method declaredMethod = this.f45663c.d().getDeclaredMethod("getWindowExtensions", (Class[]) null);
            Class<?> c10 = this.f45663c.c();
            C8433a aVar = C8433a.f54146a;
            C17542s.i(declaredMethod, "getWindowExtensionsMethod");
            return Boolean.valueOf(aVar.b(declaredMethod, c10) && aVar.d(declaredMethod));
        }
    }

    public C7094a(ClassLoader classLoader) {
        C17542s.j(classLoader, "loader");
        this.f45661a = classLoader;
    }

    /* access modifiers changed from: private */
    public final Class<?> d() {
        Class<?> loadClass = this.f45661a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        C17542s.i(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return loadClass;
    }

    private final boolean e() {
        return C8433a.f54146a.a(new C0795a(this));
    }

    public final Class<?> c() {
        Class<?> loadClass = this.f45661a.loadClass("androidx.window.extensions.WindowExtensions");
        C17542s.i(loadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return loadClass;
    }

    public final boolean f() {
        return e() && C8433a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b(this));
    }
}
