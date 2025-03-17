package Zj;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H&¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LZj/h;", "", "", "name", "value", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "", "e", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "b", "(Ljava/lang/String;Ljava/lang/Long;)V", "g", "(Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "h", "(Ljava/lang/String;Z)Z", "d", "(Ljava/lang/String;J)J", "", "f", "(Ljava/lang/String;)Ljava/util/Map;", "map", "c", "(Ljava/lang/String;Ljava/util/Map;)V", "remove", "(Ljava/lang/String;)V", "clear", "()V", "securestorage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ long a(h hVar, String str, long j10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    j10 = 0;
                }
                return hVar.d(str, j10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveLong");
        }
    }

    void a(String str, String str2);

    void b(String str, Long l10);

    void c(String str, Map<String, String> map);

    void clear();

    long d(String str, long j10);

    void e(String str, Boolean bool);

    Map<String, String> f(String str);

    String g(String str);

    boolean h(String str, boolean z10);

    void remove(String str);
}
