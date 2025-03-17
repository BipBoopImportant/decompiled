package YH;

import java.util.Iterator;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\f\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LYH/u;", "", "", "<init>", "()V", "c", "()C", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YH.u  reason: case insensitive filesystem */
public abstract class C16876u implements Iterator<Character>, C17693a {
    public abstract char c();

    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(c());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
