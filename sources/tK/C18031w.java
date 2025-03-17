package tK;

import S1.C4820m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"LtK/w;", "", "LS1/m;", "fontFamily", "LtK/c;", "body", "LtK/r;", "heading", "<init>", "(LS1/m;LtK/c;LtK/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LS1/m;", "b", "()LS1/m;", "LtK/c;", "()LtK/c;", "c", "LtK/r;", "()LtK/r;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tK.w  reason: case insensitive filesystem */
public final class C18031w {

    /* renamed from: a  reason: collision with root package name */
    private final C4820m f147666a;

    /* renamed from: b  reason: collision with root package name */
    private final C18012c f147667b;

    /* renamed from: c  reason: collision with root package name */
    private final r f147668c;

    public C18031w(C4820m mVar, C18012c cVar, r rVar) {
        C17542s.j(mVar, "fontFamily");
        C17542s.j(cVar, "body");
        C17542s.j(rVar, "heading");
        this.f147666a = mVar;
        this.f147667b = cVar;
        this.f147668c = rVar;
    }

    public final C18012c a() {
        return this.f147667b;
    }

    public final C4820m b() {
        return this.f147666a;
    }

    public final r c() {
        return this.f147668c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18031w)) {
            return false;
        }
        C18031w wVar = (C18031w) obj;
        return C17542s.e(this.f147666a, wVar.f147666a) && C17542s.e(this.f147667b, wVar.f147667b) && C17542s.e(this.f147668c, wVar.f147668c);
    }

    public int hashCode() {
        return (((this.f147666a.hashCode() * 31) + this.f147667b.hashCode()) * 31) + this.f147668c.hashCode();
    }

    public String toString() {
        C4820m mVar = this.f147666a;
        C18012c cVar = this.f147667b;
        r rVar = this.f147668c;
        return "SkapaTypesets(fontFamily=" + mVar + ", body=" + cVar + ", heading=" + rVar + ")";
    }
}
