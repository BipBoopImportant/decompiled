package hm;

import com.ingka.ikea.assemblyservice.impl.data.network.AssemblyEndpoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhm/a;", "", "a", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hm.a  reason: case insensitive filesystem */
public interface C11368a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2201a f98086a = C2201a.f98087a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhm/a$a;", "", "<init>", "()V", "Ltw/h;", "networkService", "Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint;", "a", "(Ltw/h;)Lcom/ingka/ikea/assemblyservice/impl/data/network/AssemblyEndpoint;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hm.a$a  reason: collision with other inner class name */
    public static final class C2201a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C2201a f98087a = new C2201a();

        private C2201a() {
        }

        public final AssemblyEndpoint a(h hVar) {
            C17542s.j(hVar, "networkService");
            return (AssemblyEndpoint) hVar.b(AssemblyEndpoint.class);
        }
    }
}
