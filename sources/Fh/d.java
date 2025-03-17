package FH;

import EH.C15618c;
import EH.C15627l;
import EH.C15638w;
import XH.C16807N;
import dI.C17164e;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\u0005\u0011\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LFH/d;", "", "<init>", "()V", "LEH/c;", "b", "()LEH/c;", "contentType", "", "a", "()Ljava/lang/Long;", "contentLength", "LEH/w;", "d", "()LEH/w;", "status", "LEH/l;", "c", "()LEH/l;", "headers", "LFH/d$a;", "LFH/d$b;", "LFH/d$c;", "LFH/d$d;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class d {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LFH/d$a;", "LFH/d;", "<init>", "()V", "", "e", "()[B", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a extends d {
        public a() {
            super((DefaultConstructorMarker) null);
        }

        public abstract byte[] e();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFH/d$b;", "LFH/d;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b extends d {
        public b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LFH/d$c;", "LFH/d;", "<init>", "()V", "Lio/ktor/utils/io/g;", "e", "()Lio/ktor/utils/io/g;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c extends d {
        public c() {
            super((DefaultConstructorMarker) null);
        }

        public abstract g e();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"LFH/d$d;", "LFH/d;", "<init>", "()V", "Lio/ktor/utils/io/j;", "channel", "LXH/N;", "e", "(Lio/ktor/utils/io/j;LdI/e;)Ljava/lang/Object;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: FH.d$d  reason: collision with other inner class name */
    public static abstract class C3307d extends d {
        public C3307d() {
            super((DefaultConstructorMarker) null);
        }

        public abstract Object e(j jVar, C17164e<? super C16807N> eVar);
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Long a() {
        return null;
    }

    public C15618c b() {
        return null;
    }

    public C15627l c() {
        return C15627l.f134034a.a();
    }

    public C15638w d() {
        return null;
    }

    private d() {
    }
}
