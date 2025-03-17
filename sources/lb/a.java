package Lb;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import mc.C10036b;

public final /* synthetic */ class a implements C10036b {
    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
    }
}
