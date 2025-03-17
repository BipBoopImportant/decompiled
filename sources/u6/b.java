package U6;

import SJ.C16434j;
import SJ.C16436l;
import SJ.C16438n;
import XH.C16807N;
import ZJ.C17012g;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000f\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\t0\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016HAø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0018\u001a\u00028\u0000H\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u001f\u0010\u0010J\u0019\u0010!\u001a\u00020 2\b\u0010\b\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010#R&\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\t\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010$R$\u0010'\u001a\u00020 2\u0006\u0010%\u001a\u00020 8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020 8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b)\u0010(R#\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160+8\u0016X\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b,\u0010-\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"LU6/b;", "E", "LSJ/j;", "wrapped", "<init>", "(LSJ/j;)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "LXH/N;", "i", "(Ljava/util/concurrent/CancellationException;)V", "Lkotlin/Function1;", "", "handler", "b", "(LnI/l;)V", "LSJ/l;", "iterator", "()LSJ/l;", "j", "(LdI/e;)Ljava/lang/Object;", "LSJ/n;", "n", "element", "y", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "r", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "", "a", "(Ljava/lang/Throwable;)Z", "LSJ/j;", "LnI/l;", "<set-?>", "Z", "isClosed", "()Z", "A", "isClosedForSend", "LZJ/g;", "m", "()LZJ/g;", "onReceiveCatching", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b<E> implements C16434j<E> {

    /* renamed from: a  reason: collision with root package name */
    private final C16434j<E> f40257a;

    /* renamed from: b  reason: collision with root package name */
    private C17642l<? super Throwable, C16807N> f40258b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40259c;

    public b(C16434j<E> jVar) {
        C17542s.j(jVar, "wrapped");
        this.f40257a = jVar;
    }

    public boolean A() {
        return this.f40257a.A();
    }

    public boolean a(Throwable th2) {
        C17642l<? super Throwable, C16807N> lVar;
        this.f40259c = true;
        boolean a10 = this.f40257a.a(th2);
        if (a10 && (lVar = this.f40258b) != null) {
            lVar.invoke(th2);
        }
        this.f40258b = null;
        return a10;
    }

    public void b(C17642l<? super Throwable, C16807N> lVar) {
        C17542s.j(lVar, "handler");
        this.f40257a.b(lVar);
    }

    public final void c(C17642l<? super Throwable, C16807N> lVar) {
        C17542s.j(lVar, "handler");
        this.f40258b = lVar;
    }

    public void i(CancellationException cancellationException) {
        this.f40257a.i(cancellationException);
    }

    public C16436l<E> iterator() {
        return this.f40257a.iterator();
    }

    public Object j(C17164e<? super E> eVar) {
        return this.f40257a.j(eVar);
    }

    public Object k(E e10) {
        return this.f40257a.k(e10);
    }

    public C17012g<C16438n<E>> m() {
        return this.f40257a.m();
    }

    public Object n(C17164e<? super C16438n<? extends E>> eVar) {
        Object n10 = this.f40257a.n(eVar);
        C17187b.f();
        return n10;
    }

    public Object r() {
        return this.f40257a.r();
    }

    public Object y(E e10, C17164e<? super C16807N> eVar) {
        return this.f40257a.y(e10, eVar);
    }
}
