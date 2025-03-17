package VH;

import QJ.C16315k0;
import RH.k;
import RH.w;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 -2\u00020\u0001:\u0004\u0012\u0016\u001a\u001dBI\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\u0001\u0003./0¨\u00061"}, d2 = {"LVH/b;", "", "", "fin", "LVH/d;", "frameType", "", "data", "LQJ/k0;", "disposableHandle", "rsv1", "rsv2", "rsv3", "<init>", "(ZLVH/d;[BLQJ/k0;ZZZ)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "getFin", "()Z", "b", "LVH/d;", "getFrameType", "()LVH/d;", "c", "[B", "()[B", "d", "LQJ/k0;", "getDisposableHandle", "()LQJ/k0;", "e", "getRsv1", "f", "getRsv2", "g", "getRsv3", "Ljava/nio/ByteBuffer;", "h", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "buffer", "i", "LVH/b$a;", "LVH/b$b;", "LVH/b$d;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: VH.b  reason: case insensitive filesystem */
public abstract class C16655b {

    /* renamed from: i  reason: collision with root package name */
    public static final c f139303i = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f139304j = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final boolean f139305a;

    /* renamed from: b  reason: collision with root package name */
    private final C16657d f139306b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f139307c;

    /* renamed from: d  reason: collision with root package name */
    private final C16315k0 f139308d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f139309e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f139310f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f139311g;

    /* renamed from: h  reason: collision with root package name */
    private final ByteBuffer f139312h;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LVH/b$a;", "LVH/b;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: VH.b$a */
    public static final class a extends C16655b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z10, byte[] bArr, boolean z11, boolean z12, boolean z13) {
            super(z10, C16657d.BINARY, bArr, C16658e.f139313a, z11, z12, z13, (DefaultConstructorMarker) null);
            C17542s.j(bArr, "data");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(boolean z10, byte[] bArr) {
            this(z10, bArr, false, false, false);
            C17542s.j(bArr, "data");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"LVH/b$b;", "LVH/b;", "", "data", "<init>", "([B)V", "LVH/a;", "reason", "(LVH/a;)V", "LRH/k;", "packet", "(LRH/k;)V", "()V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: VH.b$b  reason: collision with other inner class name */
    public static final class C3411b extends C16655b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3411b(byte[] bArr) {
            super(true, C16657d.CLOSE, bArr, C16658e.f139313a, false, false, false, (DefaultConstructorMarker) null);
            C17542s.j(bArr, "data");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C3411b(k kVar) {
            this(w.c(kVar, 0, 1, (Object) null));
            C17542s.j(kVar, "packet");
        }

        public C3411b() {
            this(C16655b.f139304j);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3411b(VH.C16654a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "reason"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                RH.j r0 = new RH.j
                r1 = 0
                r2 = 1
                r0.<init>(r1, r2, r1)
                short r1 = r9.a()     // Catch:{ all -> 0x0029 }
                RH.u.a(r0, r1)     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = r9.c()     // Catch:{ all -> 0x0029 }
                r6 = 14
                r7 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r1 = r0
                RH.w.i(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0029 }
                RH.k r9 = r0.t0()     // Catch:{ all -> 0x0029 }
                r8.<init>((RH.k) r9)
                return
            L_0x0029:
                r9 = move-exception
                r0.J()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: VH.C16655b.C3411b.<init>(VH.a):void");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LVH/b$c;", "", "<init>", "()V", "", "Empty", "[B", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: VH.b$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LVH/b$d;", "LVH/b;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: VH.b$d */
    public static final class d extends C16655b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(boolean z10, byte[] bArr, boolean z11, boolean z12, boolean z13) {
            super(z10, C16657d.TEXT, bArr, C16658e.f139313a, z11, z12, z13, (DefaultConstructorMarker) null);
            C17542s.j(bArr, "data");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public d(boolean z10, byte[] bArr) {
            this(z10, bArr, false, false, false);
            C17542s.j(bArr, "data");
        }
    }

    public /* synthetic */ C16655b(boolean z10, C16657d dVar, byte[] bArr, C16315k0 k0Var, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, dVar, bArr, k0Var, z11, z12, z13);
    }

    public final byte[] b() {
        return this.f139307c;
    }

    public String toString() {
        return "Frame " + this.f139306b + " (fin=" + this.f139305a + ", buffer len = " + this.f139307c.length + ')';
    }

    private C16655b(boolean z10, C16657d dVar, byte[] bArr, C16315k0 k0Var, boolean z11, boolean z12, boolean z13) {
        this.f139305a = z10;
        this.f139306b = dVar;
        this.f139307c = bArr;
        this.f139308d = k0Var;
        this.f139309e = z11;
        this.f139310f = z12;
        this.f139311g = z13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        C17542s.i(wrap, "wrap(data)");
        this.f139312h = wrap;
    }
}
