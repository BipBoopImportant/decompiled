package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.C7753A;
import java.util.List;
import jd.C9898a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ld9/c;", "", "Ld9/A$a;", "_builder", "<init>", "(Ld9/A$a;)V", "Ld9/A;", "a", "()Ld9/A;", "Ljd/a;", "Ld9/z;", "", "values", "LXH/N;", "b", "(Ljd/a;Ljava/lang/Iterable;)V", "Ld9/A$a;", "c", "()Ljd/a;", "assetHashes", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.c  reason: case insensitive filesystem */
public final class C7757c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50776b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C7753A.a f50777a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/c$a;", "", "<init>", "()V", "Ld9/A$a;", "builder", "Ld9/c;", "a", "(Ld9/A$a;)Ld9/c;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.c$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7757c a(C7753A.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7757c(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7757c(C7753A.a aVar) {
        this.f50777a = aVar;
    }

    public final /* synthetic */ C7753A a() {
        GeneratedMessageLite o10 = this.f50777a.g();
        C17542s.i(o10, "_builder.build()");
        return (C7753A) o10;
    }

    public final /* synthetic */ void b(C9898a aVar, Iterable iterable) {
        C17542s.j(aVar, "<this>");
        C17542s.j(iterable, "values");
        this.f50777a.E(iterable);
    }

    public final /* synthetic */ C9898a c() {
        List<C7779z> G10 = this.f50777a.G();
        C17542s.i(G10, "_builder.getAssetHashesList()");
        return new C9898a(G10);
    }

    public /* synthetic */ C7757c(C7753A.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
