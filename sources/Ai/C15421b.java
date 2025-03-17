package AI;

import DI.C15538I;
import DI.C15545P;
import FI.C15685a;
import FI.C15686b;
import FI.C15687c;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import java.util.ServiceLoader;
import kotlin.jvm.internal.C17542s;
import tJ.C17994n;

/* renamed from: AI.b  reason: case insensitive filesystem */
public interface C15421b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f132976a = a.f132977a;

    /* renamed from: AI.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f132977a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C16824o<C15421b> f132978b = C16825p.a(s.PUBLICATION, C15420a.f132975a);

        private a() {
        }

        /* access modifiers changed from: private */
        public static final C15421b a() {
            Class<C15421b> cls = C15421b.class;
            ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
            C17542s.g(load);
            C15421b bVar = (C15421b) C16877v.x0(load);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final C15421b c() {
            return f132978b.getValue();
        }
    }

    C15545P a(C17994n nVar, C15538I i10, Iterable<? extends C15686b> iterable, C15687c cVar, C15685a aVar, boolean z10);
}
