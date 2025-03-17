package io.ktor.utils.io;

import RH.k;
import SH.C16416a;
import XH.C16824o;
import XH.C16825p;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u0000 !2\u00020\u0001:\u0001!J+\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lio/ktor/utils/io/g;", "", "", "dst", "", "offset", "length", "j", "([BIILdI/e;)Ljava/lang/Object;", "LSH/a;", "g", "(LSH/a;LdI/e;)Ljava/lang/Object;", "", "limit", "LRH/k;", "d", "(JLdI/e;)Ljava/lang/Object;", "", "cause", "", "p", "(Ljava/lang/Throwable;)Z", "max", "i", "e", "()I", "availableForRead", "m", "()Z", "isClosedForRead", "c", "()Ljava/lang/Throwable;", "closedCause", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f143712a = a.f143713a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/g$a;", "", "<init>", "()V", "Lio/ktor/utils/io/g;", "b", "LXH/o;", "a", "()Lio/ktor/utils/io/g;", "Empty", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f143713a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C16824o<c> f143714b = C16825p.b(C3508a.f143715c);

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/c;", "b", "()Lio/ktor/utils/io/c;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: io.ktor.utils.io.g$a$a  reason: collision with other inner class name */
        static final class C3508a extends C17544u implements C17631a<c> {

            /* renamed from: c  reason: collision with root package name */
            public static final C3508a f143715c = new C3508a();

            C3508a() {
                super(0);
            }

            /* renamed from: b */
            public final c invoke() {
                c b10 = e.b(false, 1, (Object) null);
                k.a(b10);
                return b10;
            }
        }

        private a() {
        }

        public final g a() {
            return f143714b.getValue();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ Object a(g gVar, long j10, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    j10 = Long.MAX_VALUE;
                }
                return gVar.d(j10, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readRemaining");
        }
    }

    Throwable c();

    Object d(long j10, C17164e<? super k> eVar);

    int e();

    Object g(C16416a aVar, C17164e<? super Integer> eVar);

    Object i(long j10, C17164e<? super Long> eVar);

    Object j(byte[] bArr, int i10, int i11, C17164e<? super Integer> eVar);

    boolean m();

    boolean p(Throwable th2);
}
