package vq;

import kotlin.Metadata;
import uq.g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvq/c;", "", "", "isTest", "LXH/N;", "a", "(Z)V", "Luq/g;", "event", "b", "(Luq/g;)V", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vq.c  reason: case insensitive filesystem */
public interface C12204c {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vq.c$a */
    public static final class a {
        public static /* synthetic */ void a(C12204c cVar, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                cVar.a(z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }
    }

    void a(boolean z10);

    void b(g gVar);
}
