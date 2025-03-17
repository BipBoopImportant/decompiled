package w5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import y5.C8980c;
import y5.C8981d;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ai\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "RowType", "", "identifier", "", "", "queryKeys", "Ly5/d;", "driver", "fileName", "label", "query", "Lkotlin/Function1;", "Ly5/c;", "mapper", "Lw5/c;", "a", "(I[Ljava/lang/String;Ly5/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/l;)Lw5/c;", "runtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final <RowType> c<RowType> a(int i10, String[] strArr, C8981d dVar, String str, String str2, String str3, C17642l<? super C8980c, ? extends RowType> lVar) {
        C17542s.j(strArr, "queryKeys");
        C17542s.j(dVar, "driver");
        C17542s.j(str, "fileName");
        C17542s.j(str2, "label");
        C17542s.j(str3, "query");
        C17542s.j(lVar, "mapper");
        return new e(i10, strArr, dVar, str, str2, str3, lVar);
    }
}
