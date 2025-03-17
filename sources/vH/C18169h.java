package vH;

import AH.C15412c;
import BH.C15459d;
import BH.C15460e;
import BH.C15461f;
import EH.C15618c;
import EH.C15631p;
import FH.d;
import NH.e;
import OH.C16158a;
import QJ.F0;
import TH.C16492f;
import XH.C16807N;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import io.ktor.utils.io.g;
import io.ktor.utils.io.jvm.javaio.h;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.q;
import pH.C17746a;
import qH.C17777b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LpH/a;", "LXH/N;", "b", "(LpH/a;)V", "LEH/c;", "contentType", "LAH/c;", "context", "", "body", "LFH/d;", "a", "(LEH/c;LAH/c;Ljava/lang/Object;)LFH/d;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.h  reason: case insensitive filesystem */
public final class C18169h {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"vH/h$a", "LFH/d$c;", "Lio/ktor/utils/io/g;", "e", "()Lio/ktor/utils/io/g;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "contentLength", "LEH/c;", "b", "LEH/c;", "()LEH/c;", "contentType", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.h$a */
    public static final class a extends d.c {

        /* renamed from: a  reason: collision with root package name */
        private final Long f148893a;

        /* renamed from: b  reason: collision with root package name */
        private final C15618c f148894b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f148895c;

        a(C15412c cVar, C15618c cVar2, Object obj) {
            this.f148895c = obj;
            String j10 = cVar.a().j(C15631p.f134088a.g());
            this.f148893a = j10 != null ? Long.valueOf(Long.parseLong(j10)) : null;
            this.f148894b = cVar2 == null ? C15618c.a.f133990a.b() : cVar2;
        }

        public Long a() {
            return this.f148893a;
        }

        public C15618c b() {
            return this.f148894b;
        }

        public g e() {
            return h.b((InputStream) this.f148895c, (C17168i) null, (C16492f) null, 3, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "LBH/d;", "LqH/b;", "<name for destructuring parameter 0>", "LXH/N;", "<anonymous>", "(LNH/e;LBH/d;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: vH.h$b */
    static final class b extends l implements q<e<C15459d, C17777b>, C15459d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f148896c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f148897d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f148898e;

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"vH/h$b$a", "Ljava/io/InputStream;", "", "read", "()I", "", "b", "off", "len", "([BII)I", "available", "LXH/N;", "close", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: vH.h$b$a */
        public static final class a extends InputStream {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InputStream f148899a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e<C15459d, C17777b> f148900b;

            a(InputStream inputStream, e<C15459d, C17777b> eVar) {
                this.f148899a = inputStream;
                this.f148900b = eVar;
            }

            public int available() {
                return this.f148899a.available();
            }

            public void close() {
                super.close();
                this.f148899a.close();
                C15460e.c(this.f148900b.b().f());
            }

            public int read() {
                return this.f148899a.read();
            }

            public int read(byte[] bArr, int i10, int i11) {
                C17542s.j(bArr, DslKt.INDICATOR_BACKGROUND);
                return this.f148899a.read(bArr, i10, i11);
            }
        }

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(e<C15459d, C17777b> eVar, C15459d dVar, C17164e<? super C16807N> eVar2) {
            b bVar = new b(eVar2);
            bVar.f148897d = eVar;
            bVar.f148898e = dVar;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f148896c;
            if (i10 == 0) {
                y.b(obj);
                e eVar = (e) this.f148897d;
                C15459d dVar = (C15459d) this.f148898e;
                C16158a a10 = dVar.a();
                Object b10 = dVar.b();
                if (!(b10 instanceof g)) {
                    return C16807N.f139792a;
                }
                if (C17542s.e(a10.b(), P.b(InputStream.class))) {
                    C15459d dVar2 = new C15459d(a10, new a(io.ktor.utils.io.jvm.javaio.b.c((g) b10, (F0) ((C17777b) eVar.b()).getCoroutineContext().get(F0.f137562d0)), eVar));
                    this.f148897d = null;
                    this.f148896c = 1;
                    if (eVar.f(dVar2, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public static final d a(C15618c cVar, C15412c cVar2, Object obj) {
        C17542s.j(cVar2, "context");
        C17542s.j(obj, "body");
        if (obj instanceof InputStream) {
            return new a(cVar2, cVar, obj);
        }
        return null;
    }

    public static final void b(C17746a aVar) {
        C17542s.j(aVar, "<this>");
        aVar.l().l(C15461f.f133245h.a(), new b((C17164e<? super b>) null));
    }
}
