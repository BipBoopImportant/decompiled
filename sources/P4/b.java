package P4;

import P4.d;
import android.os.Bundle;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\t\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"LP4/b;", "Landroidx/lifecycle/v;", "LP4/f;", "owner", "<init>", "(LP4/f;)V", "", "className", "LXH/N;", "a", "(Ljava/lang/String;)V", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "LP4/f;", "b", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements C5218v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39367b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f39368a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LP4/b$a;", "", "<init>", "()V", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"LP4/b$b;", "LP4/d$c;", "LP4/d;", "registry", "<init>", "(LP4/d;)V", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "", "className", "LXH/N;", "a", "(Ljava/lang/String;)V", "", "Ljava/util/Set;", "classes", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P4.b$b  reason: collision with other inner class name */
    public static final class C0621b implements d.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<String> f39369a = new LinkedHashSet();

        public C0621b(d dVar) {
            C17542s.j(dVar, "registry");
            dVar.h("androidx.savedstate.Restarter", this);
        }

        public final void a(String str) {
            C17542s.j(str, "className");
            this.f39369a.add(str);
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f39369a));
            return bundle;
        }
    }

    public b(f fVar) {
        C17542s.j(fVar, "owner");
        this.f39368a = fVar;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(d.a.class);
            C17542s.i(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                    C17542s.i(newInstance, "{\n                constr…wInstance()\n            }");
                    ((d.a) newInstance).a(this.f39368a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    public void e(C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "source");
        C17542s.j(aVar, "event");
        if (aVar == r.a.ON_CREATE) {
            yVar.getLifecycle().g(this);
            Bundle b10 = this.f39368a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
            if (b10 != null) {
                ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String a10 : stringArrayList) {
                        a(a10);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
