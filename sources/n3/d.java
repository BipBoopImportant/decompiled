package n3;

import androidx.lifecycle.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln3/d;", "", "<init>", "()V", "Landroidx/lifecycle/f0;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f26579a = new d();

    private d() {
    }

    public final <T extends f0> T a(Class<T> cls) {
        C17542s.j(cls, "modelClass");
        try {
            T newInstance = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            C17542s.i(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (f0) newInstance;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
