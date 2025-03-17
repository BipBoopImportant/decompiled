package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\r\u000f\b\n\u000b\f\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/utils/io/internal/g;", "", "Ljava/nio/ByteBuffer;", "backingBuffer", "Lio/ktor/utils/io/internal/i;", "capacity", "<init>", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/i;)V", "c", "()Lio/ktor/utils/io/internal/g;", "d", "e", "f", "a", "Ljava/nio/ByteBuffer;", "b", "Lio/ktor/utils/io/internal/i;", "()Ljava/nio/ByteBuffer;", "readBuffer", "writeBuffer", "g", "Lio/ktor/utils/io/internal/g$a;", "Lio/ktor/utils/io/internal/g$b;", "Lio/ktor/utils/io/internal/g$c;", "Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$f;", "Lio/ktor/utils/io/internal/g$g;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f143753a;

    /* renamed from: b  reason: collision with root package name */
    public final i f143754b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/internal/g$a;", "Lio/ktor/utils/io/internal/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends g {

        /* renamed from: c  reason: collision with root package name */
        public static final a f143755c = new a();

        private a() {
            super(h.a(), h.b(), (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "IDLE(empty)";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/utils/io/internal/g$b;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$c;", "initial", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g$d;", "h", "()Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g$g;", "i", "()Lio/ktor/utils/io/internal/g$g;", "", "toString", "()Ljava/lang/String;", "c", "Lio/ktor/utils/io/internal/g$c;", "g", "()Lio/ktor/utils/io/internal/g$c;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends g {

        /* renamed from: c  reason: collision with root package name */
        private final c f143756c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(cVar.f143753a, cVar.f143754b, (DefaultConstructorMarker) null);
            C17542s.j(cVar, "initial");
            this.f143756c = cVar;
        }

        public final c g() {
            return this.f143756c;
        }

        /* renamed from: h */
        public d c() {
            return this.f143756c.h();
        }

        /* renamed from: i */
        public C3510g d() {
            return this.f143756c.j();
        }

        public String toString() {
            return "IDLE(with buffer)";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010%\u001a\u00020\u000b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010*\u001a\u00020&8\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lio/ktor/utils/io/internal/g$c;", "Lio/ktor/utils/io/internal/g;", "Ljava/nio/ByteBuffer;", "backingBuffer", "", "reservedSize", "<init>", "(Ljava/nio/ByteBuffer;I)V", "Lio/ktor/utils/io/internal/g$d;", "k", "()Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g$g;", "l", "()Lio/ktor/utils/io/internal/g$g;", "", "toString", "()Ljava/lang/String;", "c", "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "writeBuffer", "d", "a", "readBuffer", "Lio/ktor/utils/io/internal/g$b;", "e", "Lio/ktor/utils/io/internal/g$b;", "g", "()Lio/ktor/utils/io/internal/g$b;", "idleState", "f", "Lio/ktor/utils/io/internal/g$d;", "h", "readingState", "Lio/ktor/utils/io/internal/g$g;", "j", "writingState", "Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$e;", "i", "()Lio/ktor/utils/io/internal/g$e;", "readingWritingState", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends g {

        /* renamed from: c  reason: collision with root package name */
        private final ByteBuffer f143757c;

        /* renamed from: d  reason: collision with root package name */
        private final ByteBuffer f143758d;

        /* renamed from: e  reason: collision with root package name */
        private final b f143759e;

        /* renamed from: f  reason: collision with root package name */
        private final d f143760f;

        /* renamed from: g  reason: collision with root package name */
        private final C3510g f143761g;

        /* renamed from: h  reason: collision with root package name */
        private final e f143762h;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(ByteBuffer byteBuffer, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(byteBuffer, (i11 & 2) != 0 ? 8 : i10);
        }

        public ByteBuffer a() {
            return this.f143758d;
        }

        public ByteBuffer b() {
            return this.f143757c;
        }

        public final b g() {
            return this.f143759e;
        }

        public final d h() {
            return this.f143760f;
        }

        public final e i() {
            return this.f143762h;
        }

        public final C3510g j() {
            return this.f143761g;
        }

        /* renamed from: k */
        public d c() {
            return this.f143760f;
        }

        /* renamed from: l */
        public C3510g d() {
            return this.f143761g;
        }

        public String toString() {
            return "Initial";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ByteBuffer byteBuffer, int i10) {
            super(byteBuffer, new i(byteBuffer.capacity() - i10), (DefaultConstructorMarker) null);
            C17542s.j(byteBuffer, "backingBuffer");
            if (byteBuffer.position() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (byteBuffer.limit() == byteBuffer.capacity()) {
                ByteBuffer duplicate = byteBuffer.duplicate();
                C17542s.i(duplicate, "backingBuffer.duplicate()");
                this.f143757c = duplicate;
                ByteBuffer duplicate2 = byteBuffer.duplicate();
                C17542s.i(duplicate2, "backingBuffer.duplicate()");
                this.f143758d = duplicate2;
                this.f143759e = new b(this);
                this.f143760f = new d(this);
                this.f143761g = new C3510g(this);
                this.f143762h = new e(this);
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/ktor/utils/io/internal/g$d;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$c;", "initial", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g$e;", "g", "()Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$b;", "h", "()Lio/ktor/utils/io/internal/g$b;", "", "toString", "()Ljava/lang/String;", "c", "Lio/ktor/utils/io/internal/g$c;", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "readBuffer", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends g {

        /* renamed from: c  reason: collision with root package name */
        private final c f143763c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(cVar.f143753a, cVar.f143754b, (DefaultConstructorMarker) null);
            C17542s.j(cVar, "initial");
            this.f143763c = cVar;
        }

        public ByteBuffer a() {
            return this.f143763c.a();
        }

        /* renamed from: g */
        public e d() {
            return this.f143763c.i();
        }

        /* renamed from: h */
        public b e() {
            return this.f143763c.g();
        }

        public String toString() {
            return "Reading";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$c;", "initial", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g$g;", "g", "()Lio/ktor/utils/io/internal/g$g;", "Lio/ktor/utils/io/internal/g$d;", "h", "()Lio/ktor/utils/io/internal/g$d;", "", "toString", "()Ljava/lang/String;", "c", "Lio/ktor/utils/io/internal/g$c;", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "readBuffer", "b", "writeBuffer", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends g {

        /* renamed from: c  reason: collision with root package name */
        private final c f143764c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(c cVar) {
            super(cVar.f143753a, cVar.f143754b, (DefaultConstructorMarker) null);
            C17542s.j(cVar, "initial");
            this.f143764c = cVar;
        }

        public ByteBuffer a() {
            return this.f143764c.a();
        }

        public ByteBuffer b() {
            return this.f143764c.b();
        }

        /* renamed from: g */
        public C3510g e() {
            return this.f143764c.j();
        }

        /* renamed from: h */
        public d f() {
            return this.f143764c.h();
        }

        public String toString() {
            return "Reading+Writing";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/internal/g$f;", "Lio/ktor/utils/io/internal/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends g {

        /* renamed from: c  reason: collision with root package name */
        public static final f f143765c = new f();

        private f() {
            super(h.a(), h.b(), (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Terminated";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/ktor/utils/io/internal/g$g;", "Lio/ktor/utils/io/internal/g;", "Lio/ktor/utils/io/internal/g$c;", "initial", "<init>", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g$e;", "g", "()Lio/ktor/utils/io/internal/g$e;", "Lio/ktor/utils/io/internal/g$b;", "h", "()Lio/ktor/utils/io/internal/g$b;", "", "toString", "()Ljava/lang/String;", "c", "Lio/ktor/utils/io/internal/g$c;", "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "writeBuffer", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.internal.g$g  reason: collision with other inner class name */
    public static final class C3510g extends g {

        /* renamed from: c  reason: collision with root package name */
        private final c f143766c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3510g(c cVar) {
            super(cVar.f143753a, cVar.f143754b, (DefaultConstructorMarker) null);
            C17542s.j(cVar, "initial");
            this.f143766c = cVar;
        }

        public ByteBuffer b() {
            return this.f143766c.b();
        }

        /* renamed from: g */
        public e c() {
            return this.f143766c.i();
        }

        /* renamed from: h */
        public b f() {
            return this.f143766c.g();
        }

        public String toString() {
            return "Writing";
        }
    }

    public /* synthetic */ g(ByteBuffer byteBuffer, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, iVar);
    }

    public ByteBuffer a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    public ByteBuffer b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public g c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public g d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public g e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public g f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }

    private g(ByteBuffer byteBuffer, i iVar) {
        this.f143753a = byteBuffer;
        this.f143754b = iVar;
    }
}
