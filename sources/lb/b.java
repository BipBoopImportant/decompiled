package Lb;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import mc.C10036b;

public final /* synthetic */ class b implements C10036b {
    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.t())));
    }
}
