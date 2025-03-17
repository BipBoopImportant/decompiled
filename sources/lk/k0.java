package lK;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LlK/k0;", "", "", "begin", "end", "<init>", "(Ljava/lang/String;ICC)V", "C", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum k0 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    
    public final char begin;
    public final char end;

    static {
        k0[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private k0(char c10, char c11) {
        this.begin = c10;
        this.end = c11;
    }

    public static C17220a<k0> b() {
        return $ENTRIES;
    }
}
