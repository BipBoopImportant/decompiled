package io.ktor.utils.io;

import QJ.Q;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/m;", "", "Lio/ktor/utils/io/u;", "LQJ/Q;", "delegate", "Lio/ktor/utils/io/c;", "channel", "<init>", "(LQJ/Q;Lio/ktor/utils/io/c;)V", "a", "Lio/ktor/utils/io/c;", "()Lio/ktor/utils/io/c;", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m implements Q, u {

    /* renamed from: a  reason: collision with root package name */
    private final c f143825a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Q f143826b;

    public m(Q q10, c cVar) {
        C17542s.j(q10, "delegate");
        C17542s.j(cVar, "channel");
        this.f143825a = cVar;
        this.f143826b = q10;
    }

    /* renamed from: a */
    public c d() {
        return this.f143825a;
    }

    public C17168i getCoroutineContext() {
        return this.f143826b.getCoroutineContext();
    }
}
