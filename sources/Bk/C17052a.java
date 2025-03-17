package bK;

import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LbK/a;", "", "owner", "", "a", "(Ljava/lang/Object;)Z", "LXH/N;", "e", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)V", "c", "()Z", "isLocked", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bK.a  reason: case insensitive filesystem */
public interface C17052a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bK.a$a  reason: collision with other inner class name */
    public static final class C3460a {
        public static /* synthetic */ Object a(C17052a aVar, Object obj, C17164e eVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                return aVar.e(obj, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean b(C17052a aVar, Object obj, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                return aVar.a(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void c(C17052a aVar, Object obj, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                aVar.d(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    boolean a(Object obj);

    boolean c();

    void d(Object obj);

    Object e(Object obj, C17164e<? super C16807N> eVar);
}
