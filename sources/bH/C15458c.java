package BH;

import EH.C15633r;
import EH.C15637v;
import EH.C15638w;
import LH.C16012b;
import QJ.Q;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import qH.C17777b;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u001a8&X§\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"LBH/c;", "LEH/r;", "LQJ/Q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "LqH/b;", "h0", "()LqH/b;", "call", "LEH/w;", "f", "()LEH/w;", "status", "LEH/v;", "g", "()LEH/v;", "version", "LLH/b;", "c", "()LLH/b;", "requestTime", "e", "responseTime", "Lio/ktor/utils/io/g;", "b", "()Lio/ktor/utils/io/g;", "getContent$annotations", "content", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: BH.c  reason: case insensitive filesystem */
public abstract class C15458c implements C15633r, Q {
    public abstract g b();

    public abstract C16012b c();

    public abstract C16012b e();

    public abstract C15638w f();

    public abstract C15637v g();

    public abstract C17777b h0();

    public String toString() {
        return "HttpResponse[" + C15460e.d(this).getUrl() + ", " + f() + ']';
    }
}
