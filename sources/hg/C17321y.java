package hG;

import QJ.C16311i0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.b1;
import XH.C16816g;
import XH.t;
import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.logger.Priority;
import dH.C17159c;
import dI.C17160a;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LhG/y;", "LQJ/Q;", "LdH/c;", "lifecycle", "<init>", "(LdH/c;)V", "LdI/i;", "a", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hG.y  reason: case insensitive filesystem */
public final class C17321y implements Q {

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f143415a = C16311i0.b().plus(b1.b((F0) null, 1, (Object) null)).plus(new a(N.f137593c0, this));

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hG/y$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hG.y$a */
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17321y f143416a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, C17321y yVar) {
            super(aVar);
            this.f143416a = yVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Priority priority = Priority.ERROR;
            String message = th2.getMessage();
            String str = "";
            if (message == null) {
                message = str;
            }
            String b10 = C16816g.b(th2);
            if (b10 != null) {
                str = b10;
            }
            int i10 = C17320x.f143414a[priority.ordinal()];
            if (i10 == 1) {
                Log.v(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 2) {
                Log.d(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 3) {
                Log.i(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 4) {
                Log.w(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 5) {
                Log.e(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else {
                throw new t();
            }
        }
    }

    public C17321y(C17159c cVar) {
        C17542s.j(cVar, "lifecycle");
        cVar.a(new C17319w(this));
    }

    /* access modifiers changed from: private */
    public static final void b(C17321y yVar) {
        S.e(yVar, (CancellationException) null, 1, (Object) null);
    }

    public C17168i getCoroutineContext() {
        return this.f143415a;
    }
}
