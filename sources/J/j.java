package J;

import C.C4391e0;
import C.U;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\rB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001e"}, d2 = {"LJ/j;", "LC/U$i;", "screenFlash", "<init>", "(LC/U$i;)V", "LXH/N;", "e", "()V", "d", "", "expirationTimeMillis", "LC/U$j;", "screenFlashListener", "a", "(JLC/U$j;)V", "clear", "h", "()LC/U$i;", "f", "LC/U$i;", "Ljava/lang/Object;", "b", "Ljava/lang/Object;", "lock", "", "c", "Z", "isClearScreenFlashPending", "LC/U$j;", "pendingListener", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements U.i {

    /* renamed from: e  reason: collision with root package name */
    public static final a f8775e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final U.i f8776a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8777b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8778c;

    /* renamed from: d  reason: collision with root package name */
    private U.j f8779d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LJ/j$a;", "", "<init>", "()V", "LC/U$i;", "screenFlash", "LJ/j;", "a", "(LC/U$i;)LJ/j;", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(U.i iVar) {
            return new j(iVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ j(U.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar);
    }

    /* access modifiers changed from: private */
    public static final void c(j jVar) {
        C17542s.j(jVar, "this$0");
        synchronized (jVar.f8777b) {
            try {
                if (jVar.f8779d == null) {
                    C4391e0.l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                jVar.e();
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        C16807N n10;
        synchronized (this.f8777b) {
            try {
                if (this.f8778c) {
                    U.i iVar = this.f8776a;
                    if (iVar != null) {
                        iVar.clear();
                        n10 = C16807N.f139792a;
                    } else {
                        n10 = null;
                    }
                    if (n10 == null) {
                        C4391e0.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    C4391e0.l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f8778c = false;
                C16807N n11 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e() {
        synchronized (this.f8777b) {
            try {
                U.j jVar = this.f8779d;
                if (jVar != null) {
                    jVar.a();
                }
                this.f8779d = null;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final j g(U.i iVar) {
        return f8775e.a(iVar);
    }

    public void a(long j10, U.j jVar) {
        C16807N n10;
        C17542s.j(jVar, "screenFlashListener");
        synchronized (this.f8777b) {
            this.f8778c = true;
            this.f8779d = jVar;
            C16807N n11 = C16807N.f139792a;
        }
        U.i iVar = this.f8776a;
        if (iVar != null) {
            iVar.a(j10, new i(this));
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            C4391e0.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    public void clear() {
        d();
    }

    public final void f() {
        e();
        d();
    }

    public final U.i h() {
        return this.f8776a;
    }

    private j(U.i iVar) {
        this.f8776a = iVar;
        this.f8777b = new Object();
    }
}
