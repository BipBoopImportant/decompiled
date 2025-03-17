package RJ;

import XH.x;
import XH.y;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u0012\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/os/Handler;", "", "name", "LRJ/g;", "b", "(Landroid/os/Handler;Ljava/lang/String;)LRJ/g;", "Landroid/os/Looper;", "", "async", "a", "(Landroid/os/Looper;Z)Landroid/os/Handler;", "LRJ/g;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: RJ.h  reason: case insensitive filesystem */
public final class C16387h {

    /* renamed from: a  reason: collision with root package name */
    public static final C16386g f138026a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C16386g gVar = null;
        try {
            x.a aVar = x.f139812b;
            obj = x.b(new C16385f(a(Looper.getMainLooper(), true), (String) null, 2, (DefaultConstructorMarker) null));
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        if (!x.g(obj)) {
            gVar = obj;
        }
        f138026a = gVar;
    }

    public static final Handler a(Looper looper, boolean z10) {
        if (!z10) {
            return new Handler(looper);
        }
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            C17542s.h(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final C16386g b(Handler handler, String str) {
        return new C16385f(handler, str);
    }
}
