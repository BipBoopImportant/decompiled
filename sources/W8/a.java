package W8;

import D8.c;
import androidx.lifecycle.O;
import androidx.lifecycle.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import v8.C8902a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"LW8/a;", "", "<init>", "()V", "", "title", "", "timestamp", "", "customVariables", "", "isHeapPageView", "LXH/N;", "e", "(Ljava/lang/String;JLjava/util/Map;Z)V", "Lv8/a$b;", "a", "()Lv8/a$b;", "LD8/c;", "b", "LD8/c;", "logger", "c", "Lv8/a$b;", "setLastSavedHeapMetadata", "(Lv8/a$b;)V", "lastSavedHeapMetadata", "()Z", "isHeapRegistered", "d", "isInForeground", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40541a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final c f40542b = new c("HeapBridge");

    /* renamed from: c  reason: collision with root package name */
    private static C8902a.b f40543c;

    private a() {
    }

    public final C8902a.b a() {
        return null;
    }

    public final C8902a.b b() {
        return f40543c;
    }

    public final boolean c() {
        return false;
    }

    public final boolean d() {
        return O.f22160i.a().getLifecycle().d().b(r.b.STARTED);
    }

    public final void e(String str, long j10, Map<String, String> map, boolean z10) {
        C17542s.j(str, "title");
        C17542s.j(map, "customVariables");
    }
}
