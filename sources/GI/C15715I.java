package GI;

import DI.C15537H;
import DI.C15551W;
import cJ.C17066c;
import kotlin.jvm.internal.C17542s;
import tJ.C17994n;

/* renamed from: GI.I  reason: case insensitive filesystem */
public interface C15715I {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134504a = a.f134505a;

    /* renamed from: GI.I$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f134505a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C15537H<C15715I> f134506b = new C15537H<>("PackageViewDescriptorFactory");

        private a() {
        }

        public final C15537H<C15715I> a() {
            return f134506b;
        }
    }

    /* renamed from: GI.I$b */
    public static final class b implements C15715I {

        /* renamed from: b  reason: collision with root package name */
        public static final b f134507b = new b();

        private b() {
        }

        public C15551W a(C15712F f10, C17066c cVar, C17994n nVar) {
            C17542s.j(f10, "module");
            C17542s.j(cVar, "fqName");
            C17542s.j(nVar, "storageManager");
            return new C15754x(f10, cVar, nVar);
        }
    }

    C15551W a(C15712F f10, C17066c cVar, C17994n nVar);
}
