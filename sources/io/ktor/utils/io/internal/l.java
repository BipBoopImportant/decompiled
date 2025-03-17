package io.ktor.utils.io.internal;

import SH.C16416a;
import io.ktor.utils.io.a;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/ktor/utils/io/internal/l;", "", "Lio/ktor/utils/io/a;", "channel", "<init>", "(Lio/ktor/utils/io/a;)V", "a", "Lio/ktor/utils/io/a;", "current", "Ljava/nio/ByteBuffer;", "b", "Ljava/nio/ByteBuffer;", "byteBuffer", "LSH/a;", "c", "LSH/a;", "view", "Lio/ktor/utils/io/internal/i;", "d", "Lio/ktor/utils/io/internal/i;", "ringBufferCapacity", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private a f143785a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f143786b;

    /* renamed from: c  reason: collision with root package name */
    private C16416a f143787c;

    /* renamed from: d  reason: collision with root package name */
    private i f143788d = this.f143785a.Q().f143754b;

    public l(a aVar) {
        C17542s.j(aVar, "channel");
        this.f143785a = aVar.r0();
        C16416a.d dVar = C16416a.f138260j;
        this.f143786b = dVar.a().h();
        this.f143787c = dVar.a();
    }
}
