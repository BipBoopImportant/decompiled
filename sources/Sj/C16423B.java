package SJ;

import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"LSJ/B;", "E", "", "element", "LXH/N;", "y", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "LSJ/n;", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "a", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "b", "(LnI/l;)V", "A", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SJ.B  reason: case insensitive filesystem */
public interface C16423B<E> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SJ.B$a */
    public static final class a {
        public static /* synthetic */ boolean a(C16423B b10, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return b10.a(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    boolean A();

    boolean a(Throwable th2);

    void b(C17642l<? super Throwable, C16807N> lVar);

    Object k(E e10);

    Object y(E e10, C17164e<? super C16807N> eVar);
}
