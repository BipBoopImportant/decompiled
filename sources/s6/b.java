package S6;

import N6.d;
import WK.C16772g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LS6/b;", "LS6/a;", "", "statusCode", "", "LN6/d;", "headers", "LWK/g;", "body", "", "message", "", "cause", "<init>", "(ILjava/util/List;LWK/g;Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "I", "getStatusCode", "()I", "b", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "c", "LWK/g;", "getBody", "()LWK/g;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final int f39916a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f39917b;

    /* renamed from: c  reason: collision with root package name */
    private final C16772g f39918c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, List list, C16772g gVar, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, gVar, str, (i11 & 16) != 0 ? null : th2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i10, List<d> list, C16772g gVar, String str, Throwable th2) {
        super(str, th2);
        C17542s.j(list, "headers");
        C17542s.j(str, "message");
        this.f39916a = i10;
        this.f39917b = list;
        this.f39918c = gVar;
    }
}
