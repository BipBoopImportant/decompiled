package UJ;

import SJ.C16428d;
import TJ.C16532g;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LUJ/q;", "T", "LTJ/g;", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "d", "(LdI/i;ILSJ/d;)LTJ/g;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.q  reason: case insensitive filesystem */
public interface C16624q<T> extends C16532g<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UJ.q$a */
    public static final class a {
        public static /* synthetic */ C16532g a(C16624q qVar, C17168i iVar, int i10, C16428d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    iVar = C17169j.f142968a;
                }
                if ((i11 & 2) != 0) {
                    i10 = -3;
                }
                if ((i11 & 4) != 0) {
                    dVar = C16428d.SUSPEND;
                }
                return qVar.d(iVar, i10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    C16532g<T> d(C17168i iVar, int i10, C16428d dVar);
}
