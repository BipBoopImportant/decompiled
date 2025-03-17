package j7;

import GK.C15774B;
import GK.C15776D;
import GK.C15777E;
import GK.C15804w;
import HJ.C15854t;
import WK.y;
import YH.C16877v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lj7/f;", "LGK/w;", "<init>", "()V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: j7.f  reason: case insensitive filesystem */
public final class C8412f implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f54065a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj7/f$a;", "", "<init>", "()V", "", "HEADER", "Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: j7.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C15776D intercept(C15804w.a aVar) {
        Long v10;
        C17542s.j(aVar, "chain");
        C15774B t10 = aVar.t();
        C15774B.a i10 = t10.i();
        i10.j("Max-Size");
        C15776D b10 = aVar.b(i10.b());
        C15777E c10 = b10.c();
        C17542s.g(c10);
        String str = (String) C16877v.y0(t10.f("Max-Size"));
        if (str == null || (v10 = C15854t.v(str)) == null) {
            return b10;
        }
        C15776D c11 = b10.u().b(C15777E.f134826b.b(y.d(y.l(new C8410d(c10.c(), v10.longValue()))), c10.h(), c10.g())).c();
        return c11 == null ? b10 : c11;
    }
}
