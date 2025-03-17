package LJ;

import KJ.C15987c;
import KJ.C15990f;
import PJ.C16207a;
import PJ.C16210d;
import YH.C16870n;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010*\n\u0002\b\u000b\b\u0000\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001 B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"LLJ/j;", "E", "LKJ/c;", "LLJ/b;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "element", "LKJ/f;", "add", "(Ljava/lang/Object;)LKJ/f;", "", "elements", "addAll", "(Ljava/util/Collection;)LKJ/f;", "LKJ/f$a;", "e", "()LKJ/f$a;", "", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "index", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "b", "[Ljava/lang/Object;", "a", "()I", "size", "c", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: LJ.j  reason: case insensitive filesystem */
public final class C16026j<E> extends C16018b<E> implements C15987c<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f136112c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C16026j f136113d = new C16026j(new Object[0]);

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f136114b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LLJ/j$a;", "", "<init>", "()V", "LLJ/j;", "", "EMPTY", "LLJ/j;", "a", "()LLJ/j;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: LJ.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16026j a() {
            return C16026j.f136113d;
        }

        private a() {
        }
    }

    public C16026j(Object[] objArr) {
        C17542s.j(objArr, "buffer");
        this.f136114b = objArr;
        C16207a.a(objArr.length <= 32);
    }

    public int a() {
        return this.f136114b.length;
    }

    public C15990f<E> add(E e10) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f136114b, size() + 1);
            C17542s.i(copyOf, "copyOf(...)");
            copyOf[size()] = e10;
            return new C16026j(copyOf);
        }
        return new C16021e(this.f136114b, C16028l.c(e10), size() + 1, 0);
    }

    public C15990f<E> addAll(Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        if (collection.isEmpty()) {
            return this;
        }
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f136114b, size() + collection.size());
            C17542s.i(copyOf, "copyOf(...)");
            int size = size();
            for (Object obj : collection) {
                copyOf[size] = obj;
                size++;
            }
            return new C16026j(copyOf);
        }
        C15990f.a e10 = e();
        e10.addAll(collection);
        return e10.g();
    }

    public C15990f.a<E> e() {
        return new C16022f(this, (Object[]) null, this.f136114b, 0);
    }

    public E get(int i10) {
        C16210d.a(i10, size());
        return this.f136114b[i10];
    }

    public int indexOf(Object obj) {
        return C16870n.u0(this.f136114b, obj);
    }

    public int lastIndexOf(Object obj) {
        return C16870n.F0(this.f136114b, obj);
    }

    public ListIterator<E> listIterator(int i10) {
        C16210d.b(i10, size());
        return new C16019c(this.f136114b, i10, size());
    }
}
