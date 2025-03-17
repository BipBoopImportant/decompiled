package W0;

import YH.C16870n;
import YH.C16877v;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;
import oI.C17696d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0010\fKB!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\"\u0010\rJ\u001b\u0010#\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b#\u0010\u001cJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010(J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b/\u0010*J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\rJ\u001b\u00101\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b1\u0010\u001cJ\u0015\u00102\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u0006H\u0001¢\u0006\u0004\b9\u0010&J\u001b\u0010:\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b:\u0010\u001cJ \u0010;\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b;\u0010<J%\u0010@\u001a\u00020\u000f2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00028\u00000=j\b\u0012\u0004\u0012\u00028\u0000`>¢\u0006\u0004\b@\u0010AR0\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010B\u0012\u0004\bG\u0010!\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010HR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006O"}, d2 = {"LW0/b;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "element", "", "b", "(Ljava/lang/Object;)Z", "index", "LXH/N;", "a", "(ILjava/lang/Object;)V", "", "elements", "h", "(ILjava/util/List;)Z", "e", "(ILW0/b;)Z", "", "g", "(ILjava/util/Collection;)Z", "i", "(Ljava/util/Collection;)Z", "", "j", "()Ljava/util/List;", "k", "()V", "l", "m", "capacity", "n", "(I)V", "p", "()Ljava/lang/Object;", "s", "(Ljava/lang/Object;)I", "t", "()Z", "v", "w", "x", "y", "A", "B", "(I)Ljava/lang/Object;", "start", "end", "C", "(II)V", "newSize", "F", "D", "E", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "G", "(Ljava/util/Comparator;)V", "[Ljava/lang/Object;", "q", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "Ljava/util/List;", "list", "<set-?>", "c", "I", "r", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<T> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final int f14622d = 8;

    /* renamed from: a  reason: collision with root package name */
    private T[] f14623a;

    /* renamed from: b  reason: collision with root package name */
    private List<T> f14624b;

    /* renamed from: c  reason: collision with root package name */
    private int f14625c;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00102¨\u00064"}, d2 = {"LW0/b$a;", "T", "", "LW0/b;", "vector", "<init>", "(LW0/b;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "LXH/N;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "b", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "LW0/b;", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> implements List<T>, C17696d {

        /* renamed from: a  reason: collision with root package name */
        private final b<T> f14626a;

        public a(b<T> bVar) {
            this.f14626a = bVar;
        }

        public int a() {
            return this.f14626a.r();
        }

        public boolean add(T t10) {
            return this.f14626a.b(t10);
        }

        public boolean addAll(int i10, Collection<? extends T> collection) {
            return this.f14626a.g(i10, collection);
        }

        public T b(int i10) {
            c.c(this, i10);
            return this.f14626a.B(i10);
        }

        public void clear() {
            this.f14626a.k();
        }

        public boolean contains(Object obj) {
            return this.f14626a.l(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            return this.f14626a.m(collection);
        }

        public T get(int i10) {
            c.c(this, i10);
            return this.f14626a.q()[i10];
        }

        public int indexOf(Object obj) {
            return this.f14626a.s(obj);
        }

        public boolean isEmpty() {
            return this.f14626a.t();
        }

        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            return this.f14626a.x(obj);
        }

        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        public final /* bridge */ T remove(int i10) {
            return b(i10);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            return this.f14626a.A(collection);
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            return this.f14626a.D(collection);
        }

        public T set(int i10, T t10) {
            c.c(this, i10);
            return this.f14626a.E(i10, t10);
        }

        public final /* bridge */ int size() {
            return a();
        }

        public List<T> subList(int i10, int i11) {
            c.d(this, i10, i11);
            return new C0212b(this, i10, i11);
        }

        public Object[] toArray() {
            return C17534j.a(this);
        }

        public void add(int i10, T t10) {
            this.f14626a.a(i10, t10);
        }

        public boolean addAll(Collection<? extends T> collection) {
            return this.f14626a.i(collection);
        }

        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        public boolean remove(Object obj) {
            return this.f14626a.y(obj);
        }

        public <T> T[] toArray(T[] tArr) {
            return C17534j.b(this, tArr);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u00103R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00105¨\u00067"}, d2 = {"LW0/b$b;", "T", "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "LXH/N;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "b", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Ljava/util/List;", "I", "c", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: W0.b$b  reason: collision with other inner class name */
    private static final class C0212b<T> implements List<T>, C17696d {

        /* renamed from: a  reason: collision with root package name */
        private final List<T> f14627a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14628b;

        /* renamed from: c  reason: collision with root package name */
        private int f14629c;

        public C0212b(List<T> list, int i10, int i11) {
            this.f14627a = list;
            this.f14628b = i10;
            this.f14629c = i11;
        }

        public int a() {
            return this.f14629c - this.f14628b;
        }

        public boolean add(T t10) {
            List<T> list = this.f14627a;
            int i10 = this.f14629c;
            this.f14629c = i10 + 1;
            list.add(i10, t10);
            return true;
        }

        public boolean addAll(int i10, Collection<? extends T> collection) {
            this.f14627a.addAll(i10 + this.f14628b, collection);
            this.f14629c += collection.size();
            return collection.size() > 0;
        }

        public T b(int i10) {
            c.c(this, i10);
            this.f14629c--;
            return this.f14627a.remove(i10 + this.f14628b);
        }

        public void clear() {
            int i10 = this.f14629c - 1;
            int i11 = this.f14628b;
            if (i11 <= i10) {
                while (true) {
                    this.f14627a.remove(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10--;
                }
            }
            this.f14629c = this.f14628b;
        }

        public boolean contains(Object obj) {
            int i10 = this.f14629c;
            for (int i11 = this.f14628b; i11 < i10; i11++) {
                if (C17542s.e(this.f14627a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public T get(int i10) {
            c.c(this, i10);
            return this.f14627a.get(i10 + this.f14628b);
        }

        public int indexOf(Object obj) {
            int i10 = this.f14629c;
            for (int i11 = this.f14628b; i11 < i10; i11++) {
                if (C17542s.e(this.f14627a.get(i11), obj)) {
                    return i11 - this.f14628b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f14629c == this.f14628b;
        }

        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            int i10 = this.f14629c - 1;
            int i11 = this.f14628b;
            if (i11 > i10) {
                return -1;
            }
            while (!C17542s.e(this.f14627a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f14628b;
        }

        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        public final /* bridge */ T remove(int i10) {
            return b(i10);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            int i10 = this.f14629c;
            for (Object remove : collection) {
                remove(remove);
            }
            return i10 != this.f14629c;
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            int i10 = this.f14629c;
            int i11 = i10 - 1;
            int i12 = this.f14628b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f14627a.get(i11))) {
                        this.f14627a.remove(i11);
                        this.f14629c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f14629c;
        }

        public T set(int i10, T t10) {
            c.c(this, i10);
            return this.f14627a.set(i10 + this.f14628b, t10);
        }

        public final /* bridge */ int size() {
            return a();
        }

        public List<T> subList(int i10, int i11) {
            c.d(this, i10, i11);
            return new C0212b(this, i10, i11);
        }

        public Object[] toArray() {
            return C17534j.a(this);
        }

        public void add(int i10, T t10) {
            this.f14627a.add(i10 + this.f14628b, t10);
            this.f14629c++;
        }

        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        public boolean remove(Object obj) {
            int i10 = this.f14629c;
            for (int i11 = this.f14628b; i11 < i10; i11++) {
                if (C17542s.e(this.f14627a.get(i11), obj)) {
                    this.f14627a.remove(i11);
                    this.f14629c--;
                    return true;
                }
            }
            return false;
        }

        public <T> T[] toArray(T[] tArr) {
            return C17534j.b(this, tArr);
        }

        public boolean addAll(Collection<? extends T> collection) {
            this.f14627a.addAll(this.f14629c, collection);
            this.f14629c += collection.size();
            return collection.size() > 0;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LW0/b$c;", "T", "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "LXH/N;", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "a", "Ljava/util/List;", "b", "I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c<T> implements ListIterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final List<T> f14630a;

        /* renamed from: b  reason: collision with root package name */
        private int f14631b;

        public c(List<T> list, int i10) {
            this.f14630a = list;
            this.f14631b = i10;
        }

        public void add(T t10) {
            this.f14630a.add(this.f14631b, t10);
            this.f14631b++;
        }

        public boolean hasNext() {
            return this.f14631b < this.f14630a.size();
        }

        public boolean hasPrevious() {
            return this.f14631b > 0;
        }

        public T next() {
            List<T> list = this.f14630a;
            int i10 = this.f14631b;
            this.f14631b = i10 + 1;
            return list.get(i10);
        }

        public int nextIndex() {
            return this.f14631b;
        }

        public T previous() {
            int i10 = this.f14631b - 1;
            this.f14631b = i10;
            return this.f14630a.get(i10);
        }

        public int previousIndex() {
            return this.f14631b - 1;
        }

        public void remove() {
            int i10 = this.f14631b - 1;
            this.f14631b = i10;
            this.f14630a.remove(i10);
        }

        public void set(T t10) {
            this.f14630a.set(this.f14631b, t10);
        }
    }

    public b(T[] tArr, int i10) {
        this.f14623a = tArr;
        this.f14625c = i10;
    }

    public final boolean A(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f14625c;
        for (Object y10 : collection) {
            y(y10);
        }
        return i10 != this.f14625c;
    }

    public final T B(int i10) {
        T[] tArr = this.f14623a;
        T t10 = tArr[i10];
        if (i10 != r() - 1) {
            C16870n.n(tArr, tArr, i10, i10 + 1, this.f14625c);
        }
        int i11 = this.f14625c - 1;
        this.f14625c = i11;
        tArr[i11] = null;
        return t10;
    }

    public final void C(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f14625c;
            if (i11 < i12) {
                T[] tArr = this.f14623a;
                C16870n.n(tArr, tArr, i10, i11, i12);
            }
            int i13 = this.f14625c - (i11 - i10);
            int r10 = r() - 1;
            if (i13 <= r10) {
                int i14 = i13;
                while (true) {
                    this.f14623a[i14] = null;
                    if (i14 == r10) {
                        break;
                    }
                    i14++;
                }
            }
            this.f14625c = i13;
        }
    }

    public final boolean D(Collection<? extends T> collection) {
        int i10 = this.f14625c;
        for (int r10 = r() - 1; -1 < r10; r10--) {
            if (!collection.contains(q()[r10])) {
                B(r10);
            }
        }
        return i10 != this.f14625c;
    }

    public final T E(int i10, T t10) {
        T[] tArr = this.f14623a;
        T t11 = tArr[i10];
        tArr[i10] = t10;
        return t11;
    }

    public final void F(int i10) {
        this.f14625c = i10;
    }

    public final void G(Comparator<T> comparator) {
        C16870n.M(this.f14623a, comparator, 0, this.f14625c);
    }

    public final void a(int i10, T t10) {
        n(this.f14625c + 1);
        T[] tArr = this.f14623a;
        int i11 = this.f14625c;
        if (i10 != i11) {
            C16870n.n(tArr, tArr, i10 + 1, i10, i11);
        }
        tArr[i10] = t10;
        this.f14625c++;
    }

    public final boolean b(T t10) {
        n(this.f14625c + 1);
        T[] tArr = this.f14623a;
        int i10 = this.f14625c;
        tArr[i10] = t10;
        this.f14625c = i10 + 1;
        return true;
    }

    public final boolean e(int i10, b<T> bVar) {
        if (bVar.t()) {
            return false;
        }
        n(this.f14625c + bVar.f14625c);
        T[] tArr = this.f14623a;
        int i11 = this.f14625c;
        if (i10 != i11) {
            C16870n.n(tArr, tArr, bVar.f14625c + i10, i10, i11);
        }
        C16870n.n(bVar.f14623a, tArr, i10, 0, bVar.f14625c);
        this.f14625c += bVar.f14625c;
        return true;
    }

    public final boolean g(int i10, Collection<? extends T> collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        n(this.f14625c + collection.size());
        T[] tArr = this.f14623a;
        if (i10 != this.f14625c) {
            C16870n.n(tArr, tArr, collection.size() + i10, i10, this.f14625c);
        }
        for (T next : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            tArr[i11 + i10] = next;
            i11 = i12;
        }
        this.f14625c += collection.size();
        return true;
    }

    public final boolean h(int i10, List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        n(this.f14625c + list.size());
        T[] tArr = this.f14623a;
        if (i10 != this.f14625c) {
            C16870n.n(tArr, tArr, list.size() + i10, i10, this.f14625c);
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            tArr[i10 + i11] = list.get(i11);
        }
        this.f14625c += list.size();
        return true;
    }

    public final boolean i(Collection<? extends T> collection) {
        return g(this.f14625c, collection);
    }

    public final List<T> j() {
        List<T> list = this.f14624b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f14624b = aVar;
        return aVar;
    }

    public final void k() {
        T[] tArr = this.f14623a;
        int r10 = r();
        while (true) {
            r10--;
            if (-1 < r10) {
                tArr[r10] = null;
            } else {
                this.f14625c = 0;
                return;
            }
        }
    }

    public final boolean l(T t10) {
        int r10 = r() - 1;
        if (r10 >= 0) {
            int i10 = 0;
            while (!C17542s.e(q()[i10], t10)) {
                if (i10 != r10) {
                    i10++;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean m(Collection<? extends T> collection) {
        for (Object l10 : collection) {
            if (!l(l10)) {
                return false;
            }
        }
        return true;
    }

    public final void n(int i10) {
        T[] tArr = this.f14623a;
        if (tArr.length < i10) {
            T[] copyOf = Arrays.copyOf(tArr, Math.max(i10, tArr.length * 2));
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f14623a = copyOf;
        }
    }

    public final T p() {
        if (!t()) {
            return q()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final T[] q() {
        return this.f14623a;
    }

    public final int r() {
        return this.f14625c;
    }

    public final int s(T t10) {
        int i10 = this.f14625c;
        if (i10 <= 0) {
            return -1;
        }
        T[] tArr = this.f14623a;
        int i11 = 0;
        while (!C17542s.e(t10, tArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean t() {
        return this.f14625c == 0;
    }

    public final boolean v() {
        return this.f14625c != 0;
    }

    public final T w() {
        if (!t()) {
            return q()[r() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int x(T t10) {
        int i10 = this.f14625c;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f14623a;
        while (!C17542s.e(t10, tArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean y(T t10) {
        int s10 = s(t10);
        if (s10 < 0) {
            return false;
        }
        B(s10);
        return true;
    }
}
