package Mc;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"LMc/z;", "", "LMc/i;", "eventType", "LMc/C;", "sessionData", "LMc/b;", "applicationInfo", "<init>", "(LMc/i;LMc/C;LMc/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMc/i;", "b", "()LMc/i;", "LMc/C;", "c", "()LMc/C;", "LMc/b;", "()LMc/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final C9150i f61870a;

    /* renamed from: b  reason: collision with root package name */
    private final C f61871b;

    /* renamed from: c  reason: collision with root package name */
    private final C9143b f61872c;

    public z(C9150i iVar, C c10, C9143b bVar) {
        C17542s.j(iVar, "eventType");
        C17542s.j(c10, "sessionData");
        C17542s.j(bVar, "applicationInfo");
        this.f61870a = iVar;
        this.f61871b = c10;
        this.f61872c = bVar;
    }

    public final C9143b a() {
        return this.f61872c;
    }

    public final C9150i b() {
        return this.f61870a;
    }

    public final C c() {
        return this.f61871b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f61870a == zVar.f61870a && C17542s.e(this.f61871b, zVar.f61871b) && C17542s.e(this.f61872c, zVar.f61872c);
    }

    public int hashCode() {
        return (((this.f61870a.hashCode() * 31) + this.f61871b.hashCode()) * 31) + this.f61872c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f61870a + ", sessionData=" + this.f61871b + ", applicationInfo=" + this.f61872c + ')';
    }
}
