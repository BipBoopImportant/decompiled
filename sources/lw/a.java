package lw;

import Ps.e;
import cw.d;
import dE.C14342b;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Llw/a;", "LGs/a;", "LdE/b;", "whatsNewNavigation", "Lcw/d;", "messageCenterRepository", "<init>", "(LdE/b;Lcw/d;)V", "", "", "data", "a", "(Ljava/util/Map;)Ljava/lang/String;", "", "featureVersion", "b", "(ILjava/util/Map;LdI/e;)Ljava/lang/Object;", "LdE/b;", "Lcw/d;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "persistableName", "I", "getVersion", "()I", "version", "e", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Gs.a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0408a f25495e = new C0408a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f25496f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C14342b f25497a;

    /* renamed from: b  reason: collision with root package name */
    private final d f25498b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25499c = "Whats-New-InboxFeature";

    /* renamed from: d  reason: collision with root package name */
    private final int f25500d = 1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Llw/a$a;", "", "<init>", "()V", "", "MESSAGE_ID", "Ljava/lang/String;", "CONTENT_URI_KEY", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lw.a$a  reason: collision with other inner class name */
    public static final class C0408a {
        public /* synthetic */ C0408a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0408a() {
        }
    }

    public a(C14342b bVar, d dVar) {
        C17542s.j(bVar, "whatsNewNavigation");
        C17542s.j(dVar, "messageCenterRepository");
        this.f25497a = bVar;
        this.f25498b = dVar;
    }

    public String a(Map<String, String> map) {
        C17542s.j(map, "data");
        return e.INFORMATION.b();
    }

    public Object b(int i10, Map<String, String> map, C17164e<? super String> eVar) {
        String str = map.get("messageId");
        if (str == null) {
            str = "";
        }
        this.f25498b.f(str, true);
        String str2 = map.get("contentUri");
        if (str2 != null) {
            return str2;
        }
        String uri = this.f25497a.b().toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }

    public String d() {
        return this.f25499c;
    }

    public int getVersion() {
        return this.f25500d;
    }
}
