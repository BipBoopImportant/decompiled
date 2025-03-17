package Lb;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import mc.C10036b;

public final /* synthetic */ class d implements C10036b {
    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
    }
}
