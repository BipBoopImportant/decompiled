package YH;

import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;
import oI.C17696d;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LYH/h;", "E", "", "Ljava/util/AbstractList;", "<init>", "()V", "", "index", "b", "(I)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YH.h  reason: case insensitive filesystem */
public abstract class C16864h<E> extends AbstractList<E> implements List<E>, C17696d {
    protected C16864h() {
    }

    public abstract int a();

    public abstract E b(int i10);

    public final /* bridge */ E remove(int i10) {
        return b(i10);
    }

    public final /* bridge */ int size() {
        return a();
    }
}
