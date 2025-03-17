package fI;

import YH.C16860d;
import YH.C16870n;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LfI/c;", "", "T", "LfI/a;", "LYH/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "index", "m", "(I)Ljava/lang/Enum;", "element", "", "k", "(Ljava/lang/Enum;)Z", "p", "(Ljava/lang/Enum;)I", "q", "b", "[Ljava/lang/Enum;", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fI.c  reason: case insensitive filesystem */
final class C17222c<T extends Enum<T>> extends C16860d<T> implements C17220a<T>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final T[] f143155b;

    public C17222c(T[] tArr) {
        C17542s.j(tArr, "entries");
        this.f143155b = tArr;
    }

    public int a() {
        return this.f143155b.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return k((Enum) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return p((Enum) obj);
    }

    public boolean k(T t10) {
        C17542s.j(t10, "element");
        return ((Enum) C16870n.p0(this.f143155b, t10.ordinal())) == t10;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return q((Enum) obj);
    }

    /* renamed from: m */
    public T get(int i10) {
        C16860d.f140429a.b(i10, this.f143155b.length);
        return this.f143155b[i10];
    }

    public int p(T t10) {
        C17542s.j(t10, "element");
        int ordinal = t10.ordinal();
        if (((Enum) C16870n.p0(this.f143155b, ordinal)) == t10) {
            return ordinal;
        }
        return -1;
    }

    public int q(T t10) {
        C17542s.j(t10, "element");
        return indexOf(t10);
    }
}
