package io.ktor.utils.io;

import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/j;", "", "src", "LXH/N;", "b", "(Lio/ktor/utils/io/j;[BLdI/e;)Ljava/lang/Object;", "", "a", "(Lio/ktor/utils/io/j;)Z", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    public static final boolean a(j jVar) {
        C17542s.j(jVar, "<this>");
        return jVar.a((Throwable) null);
    }

    public static final Object b(j jVar, byte[] bArr, C17164e<? super C16807N> eVar) {
        Object l10 = jVar.l(bArr, 0, bArr.length, eVar);
        return l10 == C17187b.f() ? l10 : C16807N.f139792a;
    }
}
