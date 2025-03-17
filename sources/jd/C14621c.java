package jD;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LjD/c;", "", "", "key", "", "a", "(Ljava/lang/String;)Z", "includePartial", "LXH/N;", "b", "(Ljava/lang/String;Z)V", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jD.c  reason: case insensitive filesystem */
public interface C14621c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jD.c$a */
    public static final class a {
        public static /* synthetic */ void a(C14621c cVar, String str, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                cVar.b(str, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
        }
    }

    boolean a(String str);

    void b(String str, boolean z10);
}
