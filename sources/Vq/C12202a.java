package vq;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvq/a;", "", "", "isTest", "LXH/N;", "a", "(Z)V", "", "b", "()Ljava/lang/String;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vq.a  reason: case insensitive filesystem */
public interface C12202a {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vq.a$a  reason: collision with other inner class name */
    public static final class C2501a {
        public static /* synthetic */ void a(C12202a aVar, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                aVar.a(z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }
    }

    void a(boolean z10);

    String b();
}
