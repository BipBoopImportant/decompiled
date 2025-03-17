package androidx.lifecycle;

import T4.a;
import YH.C16877v;
import android.content.Context;
import androidx.lifecycle.O;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LT4/a;", "Landroidx/lifecycle/y;", "<init>", "()V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Landroidx/lifecycle/y;", "", "Ljava/lang/Class;", "a", "()Ljava/util/List;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements a<C5221y> {
    public List<Class<? extends a<?>>> a() {
        return C16877v.n();
    }

    /* renamed from: c */
    public C5221y b(Context context) {
        C17542s.j(context, "context");
        androidx.startup.a e10 = androidx.startup.a.e(context);
        C17542s.i(e10, "getInstance(context)");
        if (e10.g(ProcessLifecycleInitializer.class)) {
            C5217u.a(context);
            O.b bVar = O.f22160i;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
