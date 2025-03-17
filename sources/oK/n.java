package OK;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LOK/n;", "Ljava/io/IOException;", "LOK/b;", "errorCode", "<init>", "(LOK/b;)V", "a", "LOK/b;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final C16172b f137123a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(C16172b bVar) {
        super("stream was reset: " + bVar);
        C17542s.j(bVar, "errorCode");
        this.f137123a = bVar;
    }
}
