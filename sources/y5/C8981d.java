package y5;

import XH.C16807N;
import java.io.Closeable;
import kotlin.Metadata;
import nI.C17642l;
import w5.c;
import w5.f;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00060\u0001j\u0002`\u0002Jg\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b2\u0006\u0010\f\u001a\u00020\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bH&¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0018\"\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0018\"\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010\u001f\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0018\"\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Ly5/d;", "Ljava/io/Closeable;", "Lapp/cash/sqldelight/db/Closeable;", "R", "", "identifier", "", "sql", "Lkotlin/Function1;", "Ly5/c;", "Ly5/b;", "mapper", "parameters", "Ly5/e;", "LXH/N;", "binders", "H0", "(Ljava/lang/Integer;Ljava/lang/String;LnI/l;ILnI/l;)Ly5/b;", "", "V1", "(Ljava/lang/Integer;Ljava/lang/String;ILnI/l;)Ly5/b;", "Lw5/f;", "X1", "()Lw5/f;", "", "queryKeys", "Lw5/c$a;", "listener", "A2", "([Ljava/lang/String;Lw5/c$a;)V", "j3", "k2", "([Ljava/lang/String;)V", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y5.d  reason: case insensitive filesystem */
public interface C8981d extends Closeable {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y5.d$a */
    public static final class a {
        public static /* synthetic */ C8979b a(C8981d dVar, Integer num, String str, int i10, C17642l lVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 8) != 0) {
                    lVar = null;
                }
                return dVar.V1(num, str, i10, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
    }

    void A2(String[] strArr, c.a aVar);

    <R> C8979b<R> H0(Integer num, String str, C17642l<? super C8980c, ? extends C8979b<R>> lVar, int i10, C17642l<? super C8982e, C16807N> lVar2);

    C8979b<Long> V1(Integer num, String str, int i10, C17642l<? super C8982e, C16807N> lVar);

    f X1();

    void j3(String[] strArr, c.a aVar);

    void k2(String... strArr);
}
