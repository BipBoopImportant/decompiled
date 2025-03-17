package qg;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qg.z;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H$¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqg/a;", "Lqg/y;", "", "onEmptyInput", "", "name", "LIC/e;", "message", "<init>", "(ZLjava/lang/String;LIC/e;)V", "Lqg/z;", "b", "(Z)Lqg/z;", "input", "a", "(Ljava/lang/String;)Lqg/z;", "d", "(Ljava/lang/String;)Z", "Z", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "LIC/e;", "()LIC/e;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qg.a  reason: case insensitive filesystem */
public abstract class C10191a implements y {

    /* renamed from: d  reason: collision with root package name */
    public static final int f76061d = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f76062a;

    /* renamed from: b  reason: collision with root package name */
    private final String f76063b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f76064c;

    public C10191a(boolean z10, String str, C13023e eVar) {
        C17542s.j(str, "name");
        C17542s.j(eVar, "message");
        this.f76062a = z10;
        this.f76063b = str;
        this.f76064c = eVar;
    }

    private final z b(boolean z10) {
        return z10 ? z.b.f76234a : new z.a(c());
    }

    public z a(String str) {
        C17542s.j(str, "input");
        return b(str.length() == 0 ? this.f76062a : d(str));
    }

    public C13023e c() {
        return this.f76064c;
    }

    /* access modifiers changed from: protected */
    public abstract boolean d(String str);

    public String getName() {
        return this.f76063b;
    }
}
