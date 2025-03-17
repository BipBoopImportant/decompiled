package HH;

import YH.C16877v;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"", "LHH/f;", "a", "Ljava/util/List;", "()Ljava/util/List;", "providers", "ktor-serialization-kotlinx"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: HH.a  reason: case insensitive filesystem */
public final class C15810a {

    /* renamed from: a  reason: collision with root package name */
    private static final List<C15815f> f135220a;

    static {
        Class<C15815f> cls = C15815f.class;
        ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
        C17542s.i(load, "load(it, it.classLoader)");
        f135220a = C16877v.t1(load);
    }

    public static final List<C15815f> a() {
        return f135220a;
    }
}
