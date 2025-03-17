package hz;

import GK.z;
import cz.C14327a;
import cz.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mz.C14835a;
import pz.C14929a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhz/h;", "", "a", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f127519a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhz/h$a;", "", "<init>", "()V", "LHl/a;", "wifiConnector", "Lmz/a;", "scanAndGoSettingsDataStore", "Lcz/d;", "c", "(LHl/a;Lmz/a;)Lcz/d;", "Ltw/h;", "networkService", "scanAndGoTimeoutInterceptor", "Lcz/a;", "a", "(Ltw/h;Lcz/d;)Lcz/a;", "Lpz/a;", "b", "(Ltw/h;)Lpz/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"hz/h$a$a", "Ltw/h;", "", "T", "Ljava/lang/Class;", "endpoint", "b", "(Ljava/lang/Class;)Ljava/lang/Object;", "LGK/z;", "a", "()LGK/z;", "okHttpClient", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hz.h$a$a  reason: collision with other inner class name */
        public static final class C3143a implements tw.h {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ tw.h f127520a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z f127521b;

            C3143a(tw.h hVar, z zVar) {
                this.f127521b = zVar;
                this.f127520a = hVar;
            }

            public z a() {
                return this.f127521b;
            }

            public <T> T b(Class<T> cls) {
                C17542s.j(cls, "endpoint");
                return this.f127520a.b(cls);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C14327a a(tw.h hVar, d dVar) {
            C17542s.j(hVar, "networkService");
            C17542s.j(dVar, "scanAndGoTimeoutInterceptor");
            return (C14327a) new C3143a(hVar, hVar.a().H().b(dVar).c()).b(C14327a.class);
        }

        public final C14929a b(tw.h hVar) {
            C17542s.j(hVar, "networkService");
            return (C14929a) hVar.b(C14929a.class);
        }

        public final d c(Hl.a aVar, C14835a aVar2) {
            C17542s.j(aVar, "wifiConnector");
            C17542s.j(aVar2, "scanAndGoSettingsDataStore");
            return new d(aVar, aVar2);
        }

        private a() {
        }
    }
}
