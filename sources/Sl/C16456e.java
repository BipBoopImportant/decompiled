package SL;

import GK.C15775C;
import GK.C15777E;
import GK.C15805x;
import fK.C17246D;
import fK.C17251d;
import fK.C17262o;
import fK.r;
import fK.z;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0001\u0001\u001c¨\u0006\u001d"}, d2 = {"LSL/e;", "", "<init>", "()V", "T", "LfK/d;", "loader", "LGK/E;", "body", "a", "(LfK/d;LGK/E;)Ljava/lang/Object;", "LGK/x;", "contentType", "LfK/r;", "saver", "value", "LGK/C;", "d", "(LGK/x;LfK/r;Ljava/lang/Object;)LGK/C;", "Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "c", "(Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "LfK/o;", "b", "()LfK/o;", "format", "LSL/e$a;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: SL.e  reason: case insensitive filesystem */
public abstract class C16456e {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LSL/e$a;", "LSL/e;", "LfK/D;", "format", "<init>", "(LfK/D;)V", "T", "LfK/d;", "loader", "LGK/E;", "body", "a", "(LfK/d;LGK/E;)Ljava/lang/Object;", "LGK/x;", "contentType", "LfK/r;", "saver", "value", "LGK/C;", "d", "(LGK/x;LfK/r;Ljava/lang/Object;)LGK/C;", "LfK/D;", "e", "()LfK/D;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SL.e$a */
    public static final class a extends C16456e {

        /* renamed from: a  reason: collision with root package name */
        private final C17246D f138357a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17246D d10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(d10, "format");
            this.f138357a = d10;
        }

        public <T> T a(C17251d<? extends T> dVar, C15777E e10) {
            C17542s.j(dVar, "loader");
            C17542s.j(e10, "body");
            String l10 = e10.l();
            C17246D e11 = b();
            C17542s.g(l10);
            return e11.c(dVar, l10);
        }

        public <T> C15775C d(C15805x xVar, r<? super T> rVar, T t10) {
            C17542s.j(xVar, "contentType");
            C17542s.j(rVar, "saver");
            C15775C d10 = C15775C.d(xVar, b().b(rVar, t10));
            C17542s.i(d10, "create(...)");
            return d10;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C17246D b() {
            return this.f138357a;
        }
    }

    public /* synthetic */ C16456e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <T> T a(C17251d<? extends T> dVar, C15777E e10);

    /* access modifiers changed from: protected */
    public abstract C17262o b();

    public final KSerializer<Object> c(Type type) {
        C17542s.j(type, "type");
        return z.c(b().a(), type);
    }

    public abstract <T> C15775C d(C15805x xVar, r<? super T> rVar, T t10);

    private C16456e() {
    }
}
