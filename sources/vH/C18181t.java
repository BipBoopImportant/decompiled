package vH;

import MH.C16039a;
import QJ.C16283A;
import QJ.C16315k0;
import QJ.F0;
import QJ.I0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import org.slf4j.Logger;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LQJ/A;", "requestJob", "LQJ/F0;", "clientEngineJob", "LXH/N;", "c", "(LQJ/A;LQJ/F0;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "a", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.t  reason: case insensitive filesystem */
public final class C18181t {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f148992a = C16039a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vH.t$a */
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16315k0 f148993c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16315k0 k0Var) {
            super(1);
            this.f148993c = k0Var;
        }

        public final void a(Throwable th2) {
            this.f148993c.b();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vH.t$b */
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16283A f148994c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C16283A a10) {
            super(1);
            this.f148994c = a10;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                Logger b10 = C18181t.f148992a;
                b10.trace("Cancelling request because engine Job failed with error: " + th2);
                I0.c(this.f148994c, "Engine failed", th2);
                return;
            }
            C18181t.f148992a.trace("Cancelling request because engine Job completed");
            this.f148994c.l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void c(C16283A a10, F0 f02) {
        a10.s(new a(f02.s(new b(a10))));
    }
}
