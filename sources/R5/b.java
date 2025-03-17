package R5;

import N5.f;
import N5.i;
import N5.q;
import R5.c;
import XH.t;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LR5/b;", "LR5/c;", "LR5/d;", "target", "LN5/i;", "result", "<init>", "(LR5/d;LN5/i;)V", "LXH/N;", "a", "()V", "LR5/d;", "b", "LN5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final d f39687a;

    /* renamed from: b  reason: collision with root package name */
    private final i f39688b;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LR5/b$a;", "LR5/c$a;", "<init>", "()V", "LR5/d;", "target", "LN5/i;", "result", "LR5/c;", "a", "(LR5/d;LN5/i;)LR5/c;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements c.a {
        public c a(d dVar, i iVar) {
            return new b(dVar, iVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(d dVar, i iVar) {
        this.f39687a = dVar;
        this.f39688b = iVar;
    }

    public void a() {
        i iVar = this.f39688b;
        if (iVar instanceof q) {
            this.f39687a.b(((q) iVar).a());
        } else if (iVar instanceof f) {
            this.f39687a.e(((f) iVar).a());
        } else {
            throw new t();
        }
    }
}
