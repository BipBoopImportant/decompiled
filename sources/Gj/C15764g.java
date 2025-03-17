package GJ;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import oI.C17693a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LGJ/g;", "", "T", "LGJ/h;", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(LnI/a;LnI/l;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "LnI/a;", "b", "LnI/l;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GJ.g  reason: case insensitive filesystem */
final class C15764g<T> implements C15765h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C17631a<T> f134742a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<T, T> f134743b;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"GJ/g$a", "", "LXH/N;", "c", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", "b", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GJ.g$a */
    public static final class a implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private T f134744a;

        /* renamed from: b  reason: collision with root package name */
        private int f134745b = -2;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15764g<T> f134746c;

        a(C15764g<T> gVar) {
            this.f134746c = gVar;
        }

        private final void c() {
            T t10;
            if (this.f134745b == -2) {
                t10 = this.f134746c.f134742a.invoke();
            } else {
                C17642l d10 = this.f134746c.f134743b;
                T t11 = this.f134744a;
                C17542s.g(t11);
                t10 = d10.invoke(t11);
            }
            this.f134744a = t10;
            this.f134745b = t10 == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f134745b < 0) {
                c();
            }
            return this.f134745b == 1;
        }

        public T next() {
            if (this.f134745b < 0) {
                c();
            }
            if (this.f134745b != 0) {
                T t10 = this.f134744a;
                C17542s.h(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f134745b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15764g(C17631a<? extends T> aVar, C17642l<? super T, ? extends T> lVar) {
        C17542s.j(aVar, "getInitialValue");
        C17542s.j(lVar, "getNextValue");
        this.f134742a = aVar;
        this.f134743b = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
