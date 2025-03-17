package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ljava/nio/ByteBuffer;", "a", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "EmptyByteBuffer", "Lio/ktor/utils/io/internal/i;", "b", "Lio/ktor/utils/io/internal/i;", "()Lio/ktor/utils/io/internal/i;", "EmptyCapacity", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final ByteBuffer f143767a;

    /* renamed from: b  reason: collision with root package name */
    private static final i f143768b = new i(0);

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        C17542s.i(allocate, "allocate(0)");
        f143767a = allocate;
    }

    public static final ByteBuffer a() {
        return f143767a;
    }

    public static final i b() {
        return f143768b;
    }
}
