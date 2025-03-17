package aK;

import QJ.c1;
import dI.C17160a;
import dI.C17168i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.MDC;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00162\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00040\u00012\u00020\u0005:\u0001\u0012B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u00020\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LaK/a;", "LQJ/c1;", "", "", "Lkotlinx/coroutines/slf4j/MDCContextMap;", "LdI/a;", "contextMap", "<init>", "(Ljava/util/Map;)V", "LXH/N;", "F0", "LdI/i;", "context", "I0", "(LdI/i;)Ljava/util/Map;", "oldState", "E0", "(LdI/i;Ljava/util/Map;)V", "a", "Ljava/util/Map;", "getContextMap", "()Ljava/util/Map;", "b", "kotlinx-coroutines-slf4j"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aK.a  reason: case insensitive filesystem */
public final class C17031a extends C17160a implements c1<Map<String, ? extends String>> {

    /* renamed from: b  reason: collision with root package name */
    public static final C3458a f141072b = new C3458a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f141073a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LaK/a$a;", "LdI/i$c;", "LaK/a;", "<init>", "()V", "kotlinx-coroutines-slf4j"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aK.a$a  reason: collision with other inner class name */
    public static final class C3458a implements C17168i.c<C17031a> {
        public /* synthetic */ C3458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3458a() {
        }
    }

    public C17031a() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    private final void F0(Map<String, String> map) {
        if (map == null) {
            MDC.clear();
        } else {
            MDC.setContextMap(map);
        }
    }

    /* renamed from: E0 */
    public void N(C17168i iVar, Map<String, String> map) {
        F0(map);
    }

    /* renamed from: I0 */
    public Map<String, String> t0(C17168i iVar) {
        Map<String, String> copyOfContextMap = MDC.getCopyOfContextMap();
        F0(this.f141073a);
        return copyOfContextMap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17031a(Map<String, String> map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MDC.getCopyOfContextMap() : map);
    }

    public C17031a(Map<String, String> map) {
        super(f141072b);
        this.f141073a = map;
    }
}
