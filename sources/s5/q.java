package S5;

import O5.c;
import O5.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LS5/q;", "LS5/n;", "LS5/r;", "logger", "<init>", "(LS5/r;)V", "LO5/i;", "size", "", "b", "(LO5/i;)Z", "a", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class q implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39904a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LS5/q$a;", "", "<init>", "()V", "", "MIN_SIZE_DIMENSION", "I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public q(r rVar) {
    }

    public boolean a() {
        return m.f39893a.b((r) null);
    }

    public boolean b(i iVar) {
        c b10 = iVar.b();
        int i10 = Integer.MAX_VALUE;
        if ((b10 instanceof c.a ? ((c.a) b10).f39247a : Integer.MAX_VALUE) > 100) {
            c a10 = iVar.a();
            if (a10 instanceof c.a) {
                i10 = ((c.a) a10).f39247a;
            }
            if (i10 > 100) {
                return true;
            }
        }
        return false;
    }
}
