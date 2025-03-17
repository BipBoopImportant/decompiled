package O8;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LO8/c;", "", "LC8/a;", "httpConnection", "<init>", "(LC8/a;)V", "", "endpoint", "", "data", "", "isLogVisualizerEnabled", "a", "(Ljava/lang/String;[BZ)Z", "LC8/a;", "LD8/c;", "b", "LD8/c;", "logger", "c", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f39271c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C8.a f39272a;

    /* renamed from: b  reason: collision with root package name */
    private final D8.c f39273b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LO8/c$a;", "", "<init>", "()V", "", "CRASH_EVENT_PROTOBUF_VERSION", "Ljava/lang/String;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(C8.a aVar) {
        C17542s.j(aVar, "httpConnection");
        this.f39272a = aVar;
        this.f39273b = new D8.c("CrashDataUploader");
    }

    public final boolean a(String str, byte[] bArr, boolean z10) {
        C17542s.j(str, "endpoint");
        C17542s.j(bArr, "data");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z10) {
            linkedHashMap.put("cs-log-request", "true");
        }
        Throwable d10 = this.f39272a.h(str, bArr, "1", linkedHashMap).d();
        if (d10 == null) {
            return true;
        }
        D8.c cVar = this.f39273b;
        cVar.i(d10, "Failed to send the crash event data to: " + str);
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(C8.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C8.a() : aVar);
    }
}
