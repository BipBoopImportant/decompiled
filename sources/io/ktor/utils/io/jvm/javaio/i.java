package io.ktor.utils.io.jvm.javaio;

import QJ.M;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/i;", "LQJ/M;", "<init>", "()V", "LdI/i;", "context", "", "I0", "(LdI/i;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LXH/N;", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i extends M {

    /* renamed from: b  reason: collision with root package name */
    public static final i f143822b = new i();

    private i() {
    }

    public void E0(C17168i iVar, Runnable runnable) {
        C17542s.j(iVar, "context");
        C17542s.j(runnable, "block");
        runnable.run();
    }

    public boolean I0(C17168i iVar) {
        C17542s.j(iVar, "context");
        return true;
    }
}
