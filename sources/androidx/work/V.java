package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/work/V;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/x;", "a", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/x;", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class V {
    private static final C7054x c(Context context, String str, WorkerParameters workerParameters) {
        try {
            Object newInstance = d(str).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            C17542s.i(newInstance, "{\n                val co…Parameters)\n            }");
            return (C7054x) newInstance;
        } catch (Throwable th2) {
            C7055y e10 = C7055y.e();
            String a10 = W.f45107a;
            e10.d(a10, "Could not instantiate " + str, th2);
            throw th2;
        }
    }

    private static final Class<? extends C7054x> d(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(C7054x.class);
            C17542s.i(asSubclass, "{\n                Class.…class.java)\n            }");
            return asSubclass;
        } catch (Throwable th2) {
            C7055y e10 = C7055y.e();
            String a10 = W.f45107a;
            e10.d(a10, "Invalid class: " + str, th2);
            throw th2;
        }
    }

    public abstract C7054x a(Context context, String str, WorkerParameters workerParameters);

    public final C7054x b(Context context, String str, WorkerParameters workerParameters) {
        C17542s.j(context, "appContext");
        C17542s.j(str, "workerClassName");
        C17542s.j(workerParameters, "workerParameters");
        C7054x a10 = a(context, str, workerParameters);
        if (a10 == null) {
            a10 = c(context, str, workerParameters);
        }
        if (!a10.isUsed()) {
            return a10;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
