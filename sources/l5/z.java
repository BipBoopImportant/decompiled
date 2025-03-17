package l5;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import s5.C8731m;
import s5.C8739u;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Ll5/z;", "", "Ls5/m;", "id", "Ll5/y;", "d", "(Ls5/m;)Ll5/y;", "f", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "b", "(Ls5/m;)Z", "Ls5/u;", "spec", "c", "(Ls5/u;)Ll5/y;", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface z {

    /* renamed from: a  reason: collision with root package name */
    public static final a f54758a = a.f54759a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll5/z$a;", "", "<init>", "()V", "", "synchronized", "Ll5/z;", "b", "(Z)Ll5/z;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f54759a = new a();

        private a() {
        }

        public static /* synthetic */ z c(a aVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return aVar.b(z10);
        }

        public final z a() {
            return c(this, false, 1, (Object) null);
        }

        public final z b(boolean z10) {
            C8496A a10 = new C8496A();
            return z10 ? new C8497B(a10) : a10;
        }
    }

    static z a() {
        return f54758a.a();
    }

    static z e(boolean z10) {
        return f54758a.b(z10);
    }

    boolean b(C8731m mVar);

    C8528y c(C8739u uVar) {
        C17542s.j(uVar, "spec");
        return d(s5.z.a(uVar));
    }

    C8528y d(C8731m mVar);

    C8528y f(C8731m mVar);

    List<C8528y> remove(String str);
}
