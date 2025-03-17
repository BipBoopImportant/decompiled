package Lb;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import mc.C10036b;

public final /* synthetic */ class c implements C10036b {
    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
    }
}
