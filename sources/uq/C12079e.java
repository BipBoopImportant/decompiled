package uq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001e"}, d2 = {"Luq/e;", "", "", "debugMode", "", "clientId", "episodKey", "userAgent", "", "batchSize", "batchTime", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Ljava/lang/String;", "c", "e", "f", "I", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uq.e  reason: case insensitive filesystem */
public final class C12079e {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f103999a;

    /* renamed from: b  reason: collision with root package name */
    private final String f104000b;

    /* renamed from: c  reason: collision with root package name */
    private final String f104001c;

    /* renamed from: d  reason: collision with root package name */
    private final String f104002d;

    /* renamed from: e  reason: collision with root package name */
    private final int f104003e;

    /* renamed from: f  reason: collision with root package name */
    private final int f104004f;

    public C12079e(boolean z10, String str, String str2, String str3, int i10, int i11) {
        C17542s.j(str, "clientId");
        C17542s.j(str2, "episodKey");
        C17542s.j(str3, "userAgent");
        this.f103999a = z10;
        this.f104000b = str;
        this.f104001c = str2;
        this.f104002d = str3;
        this.f104003e = i10;
        this.f104004f = i11;
    }

    public final int a() {
        return this.f104003e;
    }

    public final int b() {
        return this.f104004f;
    }

    public final String c() {
        return this.f104000b;
    }

    public final boolean d() {
        return this.f103999a;
    }

    public final String e() {
        return this.f104001c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12079e)) {
            return false;
        }
        C12079e eVar = (C12079e) obj;
        return this.f103999a == eVar.f103999a && C17542s.e(this.f104000b, eVar.f104000b) && C17542s.e(this.f104001c, eVar.f104001c) && C17542s.e(this.f104002d, eVar.f104002d) && this.f104003e == eVar.f104003e && this.f104004f == eVar.f104004f;
    }

    public final String f() {
        return this.f104002d;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f103999a) * 31) + this.f104000b.hashCode()) * 31) + this.f104001c.hashCode()) * 31) + this.f104002d.hashCode()) * 31) + Integer.hashCode(this.f104003e)) * 31) + Integer.hashCode(this.f104004f);
    }

    public String toString() {
        boolean z10 = this.f103999a;
        String str = this.f104000b;
        String str2 = this.f104001c;
        String str3 = this.f104002d;
        int i10 = this.f104003e;
        int i11 = this.f104004f;
        return "EpisodConfig(debugMode=" + z10 + ", clientId=" + str + ", episodKey=" + str2 + ", userAgent=" + str3 + ", batchSize=" + i10 + ", batchTime=" + i11 + ")";
    }
}
