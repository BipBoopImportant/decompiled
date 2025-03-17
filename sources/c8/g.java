package C8;

import YH.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LC8/g;", "", "", "endpoint", "", "headers", "", "timeoutConnect", "timeoutRead", "<init>", "(Ljava/lang/String;Ljava/util/Map;II)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "I", "()I", "d", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f33770a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f33771b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33772c;

    /* renamed from: d  reason: collision with root package name */
    private final int f33773d;

    public g(String str, Map<String, String> map, int i10, int i11) {
        C17542s.j(str, "endpoint");
        C17542s.j(map, "headers");
        this.f33770a = str;
        this.f33771b = map;
        this.f33772c = i10;
        this.f33773d = i11;
    }

    public final String a() {
        return this.f33770a;
    }

    public final Map<String, String> b() {
        return this.f33771b;
    }

    public final int c() {
        return this.f33772c;
    }

    public final int d() {
        return this.f33773d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, Map map, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? X.j() : map, (i12 & 4) != 0 ? 1000 : i10, (i12 & 8) != 0 ? 10000 : i11);
    }
}
