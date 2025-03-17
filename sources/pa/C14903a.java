package pA;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C10242c;
import wA.C15151a;
import wA.C15152b;
import wA.C15153c;
import xA.C15198a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LpA/a;", "", "a", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pA.a  reason: case insensitive filesystem */
public abstract class C14903a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3206a f130177a = new C3206a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LpA/a$a;", "", "<init>", "()V", "LxA/a;", "themeSystemApi", "Lsf/c;", "appUserDataRepository", "LwA/a;", "a", "(LxA/a;Lsf/c;)LwA/a;", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pA.a$a  reason: collision with other inner class name */
    public static final class C3206a {
        public /* synthetic */ C3206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15151a a(C15198a aVar, C10242c cVar) {
            C17542s.j(aVar, "themeSystemApi");
            C17542s.j(cVar, "appUserDataRepository");
            return aVar.b() ? new C15153c(aVar, cVar) : new C15152b();
        }

        private C3206a() {
        }
    }
}
