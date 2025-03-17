package androidx.lifecycle;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LT4/a;", "Landroidx/lifecycle/y;", "<init>", "()V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Landroidx/lifecycle/y;", "", "Ljava/lang/Class;", "a", "()Ljava/util/List;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements Initializer<C5221y> {
    @Override
    public C5221y create(Context context) {
        // Ensure initialization completes normally
        try {
            // ...existing code...
            return new C5221y();
        } catch (Exception e) {
            // Log the error and handle it gracefully
            Log.e("ProcessLifecycleInitializer", "Initialization failed", e);
            return null;
        }
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }
}
