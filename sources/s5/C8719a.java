package s5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Ls5/a;", "", "", "workSpecId", "prerequisiteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s5.a  reason: case insensitive filesystem */
public final class C8719a {

    /* renamed from: a  reason: collision with root package name */
    private final String f55871a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55872b;

    public C8719a(String str, String str2) {
        C17542s.j(str, "workSpecId");
        C17542s.j(str2, "prerequisiteId");
        this.f55871a = str;
        this.f55872b = str2;
    }

    public final String a() {
        return this.f55872b;
    }

    public final String b() {
        return this.f55871a;
    }
}
