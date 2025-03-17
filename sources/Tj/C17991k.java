package tJ;

import XH.C16807N;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

/* renamed from: tJ.k  reason: case insensitive filesystem */
public interface C17991k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f147373a = a.f147374a;

    /* renamed from: tJ.k$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f147374a = new a();

        private a() {
        }

        public final C17984d a(Runnable runnable, C17642l<? super InterruptedException, C16807N> lVar) {
            return (runnable == null || lVar == null) ? new C17984d((Lock) null, 1, (DefaultConstructorMarker) null) : new C17983c(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
