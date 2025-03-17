package g1;

import U0.C0;
import X0.e;
import XH.C16807N;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import oI.C17696d;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001EB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010\u0017J\u001f\u00103\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00105\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u0010\u0007J\u0017\u00108\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010\u0017J\u001d\u00109\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010:\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010\u001fJ\u001d\u0010;\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b;\u0010\u001bJ \u0010<\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b>\u0010?J-\u0010B\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001cH\u0000¢\u0006\u0004\bB\u0010CR$\u0010I\u001a\u00020\r2\u0006\u0010D\u001a\u00020\r8\u0016@RX\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\u001c8@X\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR \u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000M8@X\u0004¢\u0006\f\u0012\u0004\bP\u0010\u0007\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010K¨\u0006S"}, d2 = {"Lg1/v;", "T", "Lg1/G;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "Lkotlin/Function1;", "", "block", "q", "(LnI/l;)Z", "Lg1/I;", "value", "LXH/N;", "p", "(Lg1/I;)V", "", "A", "()Ljava/util/List;", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "s", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "t", "(II)V", "start", "end", "x", "(Ljava/util/Collection;II)I", "<set-?>", "a", "Lg1/I;", "m", "()Lg1/I;", "firstStateRecord", "k", "()I", "structure", "Lg1/v$a;", "b", "()Lg1/v$a;", "getReadable$runtime_release$annotations", "readable", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.v  reason: case insensitive filesystem */
public final class C5353v<T> implements C5326G, List<T>, RandomAccess, C17696d {

    /* renamed from: a  reason: collision with root package name */
    private C5328I f23440a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006R\"\u0010\u0017\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lg1/v$a;", "T", "Lg1/I;", "LX0/e;", "list", "<init>", "(LX0/e;)V", "value", "LXH/N;", "c", "(Lg1/I;)V", "d", "()Lg1/I;", "LX0/e;", "i", "()LX0/e;", "l", "", "I", "j", "()I", "m", "(I)V", "modification", "e", "k", "n", "structuralChange", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g1.v$a */
    public static final class a<T> extends C5328I {

        /* renamed from: c  reason: collision with root package name */
        private e<? extends T> f23441c;

        /* renamed from: d  reason: collision with root package name */
        private int f23442d;

        /* renamed from: e  reason: collision with root package name */
        private int f23443e;

        public a(e<? extends T> eVar) {
            this.f23441c = eVar;
        }

        public void c(C5328I i10) {
            synchronized (C5354w.f23447a) {
                C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f23441c = ((a) i10).f23441c;
                this.f23442d = ((a) i10).f23442d;
                this.f23443e = ((a) i10).f23443e;
                C16807N n10 = C16807N.f139792a;
            }
        }

        public C5328I d() {
            return new a(this.f23441c);
        }

        public final e<T> i() {
            return this.f23441c;
        }

        public final int j() {
            return this.f23442d;
        }

        public final int k() {
            return this.f23443e;
        }

        public final void l(e<? extends T> eVar) {
            this.f23441c = eVar;
        }

        public final void m(int i10) {
            this.f23442d = i10;
        }

        public final void n(int i10) {
            this.f23443e = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.v$b */
    static final class b extends C17544u implements C17642l<List<T>, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f23444c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Collection<T> f23445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, Collection<? extends T> collection) {
            super(1);
            this.f23444c = i10;
            this.f23445d = collection;
        }

        /* renamed from: a */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.addAll(this.f23444c, this.f23445d));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.v$c */
    static final class c extends C17544u implements C17642l<List<T>, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Collection<T> f23446c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Collection<? extends T> collection) {
            super(1);
            this.f23446c = collection;
        }

        /* renamed from: a */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.retainAll(this.f23446c));
        }
    }

    public C5353v() {
        e b10 = X0.a.b();
        a aVar = new a(b10);
        if (C5342k.f23395e.e()) {
            a aVar2 = new a(b10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f23440a = aVar;
    }

    private final boolean q(C17642l<? super List<T>, Boolean> lVar) {
        int j10;
        e i10;
        Boolean invoke;
        C5342k c10;
        boolean z10;
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i10 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i10);
            e.a e10 = i10.e();
            invoke = lVar.invoke(e10);
            e g10 = e10.g();
            if (C17542s.e(g10, i10)) {
                break;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5354w.f23447a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(g10);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return invoke.booleanValue();
    }

    public final List<T> A() {
        return b().i();
    }

    public int a() {
        return b().i().size();
    }

    public boolean add(T t10) {
        int j10;
        e i10;
        boolean z10;
        C5342k c10;
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i10 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i10);
            e add = i10.add(t10);
            z10 = false;
            if (C17542s.e(add, i10)) {
                return false;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5354w.f23447a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(add);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return true;
    }

    public boolean addAll(int i10, Collection<? extends T> collection) {
        return q(new b(i10, collection));
    }

    public final a<T> b() {
        C5328I m10 = m();
        C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) C5347p.X((a) m10, this);
    }

    public void clear() {
        C5342k c10;
        C5328I m10 = m();
        C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) m10;
        C5347p.J();
        synchronized (C5347p.I()) {
            c10 = C5342k.f23395e.c();
            a aVar2 = (a) C5347p.h0(aVar, this, c10);
            synchronized (C5354w.f23447a) {
                aVar2.l(X0.a.b());
                aVar2.m(aVar2.j() + 1);
                aVar2.n(aVar2.k() + 1);
            }
        }
        C5347p.Q(c10, this);
    }

    public boolean contains(Object obj) {
        return b().i().contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return b().i().containsAll(collection);
    }

    public T get(int i10) {
        return b().i().get(i10);
    }

    public int indexOf(Object obj) {
        return b().i().indexOf(obj);
    }

    public boolean isEmpty() {
        return b().i().isEmpty();
    }

    public Iterator<T> iterator() {
        return listIterator();
    }

    public final int k() {
        C5328I m10 = m();
        C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) C5347p.F((a) m10)).k();
    }

    public int lastIndexOf(Object obj) {
        return b().i().lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return new C5321B(this, 0);
    }

    public C5328I m() {
        return this.f23440a;
    }

    public void p(C5328I i10) {
        i10.g(m());
        C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f23440a = (a) i10;
    }

    public final /* bridge */ T remove(int i10) {
        return s(i10);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        int j10;
        e i10;
        boolean z10;
        C5342k c10;
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i10 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i10);
            e<? extends Object> removeAll = i10.removeAll(collection);
            z10 = false;
            if (C17542s.e(removeAll, i10)) {
                return false;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5354w.f23447a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(removeAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return true;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        return q(new c(collection));
    }

    public T s(int i10) {
        int j10;
        e i11;
        C5342k c10;
        boolean z10;
        T t10 = get(i10);
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i11 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i11);
            e o02 = i11.o0(i10);
            if (C17542s.e(o02, i11)) {
                break;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5354w.f23447a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(o02);
                        z10 = true;
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return t10;
    }

    public T set(int i10, T t10) {
        int j10;
        e i11;
        C5342k c10;
        boolean z10;
        T t11 = get(i10);
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i11 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i11);
            e eVar = i11.set(i10, t10);
            if (C17542s.e(eVar, i11)) {
                break;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5354w.f23447a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(eVar);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return t11;
    }

    public final /* bridge */ int size() {
        return a();
    }

    public List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            C0.a("fromIndex or toIndex are out of bounds");
        }
        return new C5329J(this, i10, i11);
    }

    public final void t(int i10, int i11) {
        int j10;
        e i12;
        C5342k c10;
        boolean z10;
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i12 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i12);
            e.a e10 = i12.e();
            e10.subList(i10, i11).clear();
            e g10 = e10.g();
            if (!C17542s.e(g10, i12)) {
                C5328I m11 = m();
                C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m11;
                C5347p.J();
                synchronized (C5347p.I()) {
                    c10 = C5342k.f23395e.c();
                    a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                    synchronized (C5354w.f23447a) {
                        if (aVar3.j() == j10) {
                            aVar3.l(g10);
                            z10 = true;
                            aVar3.m(aVar3.j() + 1);
                            aVar3.n(aVar3.k() + 1);
                        } else {
                            z10 = false;
                        }
                    }
                }
                C5347p.Q(c10, this);
            } else {
                return;
            }
        } while (!z10);
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public String toString() {
        C5328I m10 = m();
        C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) C5347p.F((a) m10)).i() + ")@" + hashCode();
    }

    public final int x(Collection<? extends T> collection, int i10, int i11) {
        int j10;
        e i12;
        C5342k c10;
        boolean z10;
        int size = size();
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i12 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i12);
            e.a e10 = i12.e();
            e10.subList(i10, i11).retainAll(collection);
            e g10 = e10.g();
            if (C17542s.e(g10, i12)) {
                break;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5354w.f23447a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(g10);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return size - size();
    }

    public boolean addAll(Collection<? extends T> collection) {
        int j10;
        e i10;
        boolean z10;
        C5342k c10;
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i10 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i10);
            e<? extends T> addAll = i10.addAll(collection);
            z10 = false;
            if (C17542s.e(addAll, i10)) {
                return false;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5354w.f23447a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(addAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return true;
    }

    public ListIterator<T> listIterator(int i10) {
        return new C5321B(this, i10);
    }

    public boolean remove(Object obj) {
        int j10;
        e i10;
        boolean z10;
        C5342k c10;
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i10 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i10);
            e remove = i10.remove(obj);
            z10 = false;
            if (C17542s.e(remove, i10)) {
                return false;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5354w.f23447a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(remove);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return true;
    }

    public <T> T[] toArray(T[] tArr) {
        return C17534j.b(this, tArr);
    }

    public void add(int i10, T t10) {
        int j10;
        e i11;
        C5342k c10;
        boolean z10;
        do {
            synchronized (C5354w.f23447a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) C5347p.F((a) m10);
                j10 = aVar.j();
                i11 = aVar.i();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i11);
            e add = i11.add(i10, t10);
            if (!C17542s.e(add, i11)) {
                C5328I m11 = m();
                C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) m11;
                C5347p.J();
                synchronized (C5347p.I()) {
                    c10 = C5342k.f23395e.c();
                    a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                    synchronized (C5354w.f23447a) {
                        if (aVar3.j() == j10) {
                            aVar3.l(add);
                            z10 = true;
                            aVar3.n(aVar3.k() + 1);
                            aVar3.m(aVar3.j() + 1);
                        } else {
                            z10 = false;
                        }
                    }
                }
                C5347p.Q(c10, this);
            } else {
                return;
            }
        } while (!z10);
    }
}
