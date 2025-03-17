package RJ;

import QJ.N;
import android.os.Build;
import dI.C17160a;
import dI.C17168i;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LRJ/b;", "LdI/a;", "LQJ/N;", "<init>", "()V", "Ljava/lang/reflect/Method;", "E0", "()Ljava/lang/reflect/Method;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "", "_preHandler", "Ljava/lang/Object;", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RJ.b  reason: case insensitive filesystem */
public final class C16381b extends C17160a implements N {
    private volatile Object _preHandler = this;

    public C16381b() {
        super(N.f137593c0);
    }

    private final Method E0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", (Class[]) null);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void handleException(C17168i iVar, Throwable th2) {
        if (Build.VERSION.SDK_INT < 28) {
            Method E02 = E0();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            Object invoke = E02 != null ? E02.invoke((Object) null, (Object[]) null) : null;
            if (invoke instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) invoke;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
