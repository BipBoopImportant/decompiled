package Mm;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0013R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0019"}, d2 = {"LMm/e;", "", "LMm/f;", "type", "", "url", "<init>", "(LMm/f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMm/f;", "()LMm/f;", "getType$annotations", "()V", "b", "Ljava/lang/String;", "getUrl$annotations", "benefits_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f83491a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83492b;

    public e(f fVar, String str) {
        C17542s.j(fVar, "type");
        C17542s.j(str, "url");
        this.f83491a = fVar;
        this.f83492b = str;
    }

    public final f a() {
        return this.f83491a;
    }

    public final String b() {
        return this.f83492b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f83491a == eVar.f83491a && C17542s.e(this.f83492b, eVar.f83492b);
    }

    public int hashCode() {
        return (this.f83491a.hashCode() * 31) + this.f83492b.hashCode();
    }

    public String toString() {
        f fVar = this.f83491a;
        String str = this.f83492b;
        return "Media(type=" + fVar + ", url=" + str + ")";
    }
}
