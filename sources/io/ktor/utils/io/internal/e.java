package io.ktor.utils.io.internal;

import TH.C16489c;
import TH.C16490d;
import TH.C16491e;
import TH.C16492f;
import androidx.recyclerview.widget.RecyclerView;
import io.ktor.utils.io.internal.g;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\" \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0007\u0010\r\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u0014"}, d2 = {"", "a", "I", "()I", "BUFFER_SIZE", "b", "BUFFER_POOL_SIZE", "c", "BUFFER_OBJECT_POOL_SIZE", "LTH/f;", "Ljava/nio/ByteBuffer;", "d", "LTH/f;", "()LTH/f;", "BufferPool", "Lio/ktor/utils/io/internal/g$c;", "e", "BufferObjectPool", "f", "BufferObjectNoPool", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int f143745a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f143746b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f143747c;

    /* renamed from: d  reason: collision with root package name */
    private static final C16492f<ByteBuffer> f143748d;

    /* renamed from: e  reason: collision with root package name */
    private static final C16492f<g.c> f143749e;

    /* renamed from: f  reason: collision with root package name */
    private static final C16492f<g.c> f143750f = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/ktor/utils/io/internal/e$a", "LTH/e;", "Lio/ktor/utils/io/internal/g$c;", "c", "()Lio/ktor/utils/io/internal/g$c;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends C16491e<g.c> {
        a() {
        }

        /* renamed from: c */
        public g.c Q1() {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(e.a());
            C17542s.i(allocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new g.c(allocateDirect, 0, 2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"io/ktor/utils/io/internal/e$b", "LTH/c;", "Lio/ktor/utils/io/internal/g$c;", "s", "()Lio/ktor/utils/io/internal/g$c;", "instance", "LXH/N;", "q", "(Lio/ktor/utils/io/internal/g$c;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends C16489c<g.c> {
        b(int i10) {
            super(i10);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void f(g.c cVar) {
            C17542s.j(cVar, "instance");
            e.d().f3(cVar.f143753a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public g.c h() {
            return new g.c(e.d().Q1(), 0, 2, (DefaultConstructorMarker) null);
        }
    }

    static {
        int a10 = k.a("BufferSize", RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
        f143745a = a10;
        int a11 = k.a("BufferPoolSize", RecyclerView.n.FLAG_MOVED);
        f143746b = a11;
        int a12 = k.a("BufferObjectPoolSize", 1024);
        f143747c = a12;
        f143748d = new C16490d(a11, a10);
        f143749e = new b(a12);
    }

    public static final int a() {
        return f143745a;
    }

    public static final C16492f<g.c> b() {
        return f143750f;
    }

    public static final C16492f<g.c> c() {
        return f143749e;
    }

    public static final C16492f<ByteBuffer> d() {
        return f143748d;
    }
}
