package lz;

import Sy.a;
import gz.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.O;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Llz/k;", "", "<init>", "()V", "", "barcode", "Lrz/O;", "scanType", "LSy/a$b;", "productAssortmentSpecialType", "Lgz/f;", "b", "(Ljava/lang/String;Lrz/O;LSy/a$b;)Lgz/f;", "databaseModel", "a", "(Lgz/f;)LSy/a$b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {
    public final a.b a(f fVar) {
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public final f b(String str, O o10, a.b bVar) {
        C17542s.j(str, "barcode");
        return new f(str, o10, bVar);
    }
}
