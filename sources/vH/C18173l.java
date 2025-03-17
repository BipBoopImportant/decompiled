package vH;

import AH.C15411b;
import AH.C15412c;
import EH.C15612Q;
import EH.C15627l;
import EH.C15636u;
import JH.C15954a;
import JH.C15955b;
import MH.C16039a;
import XH.C16807N;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import org.slf4j.Logger;
import pH.C17747b;
import qH.C17777b;
import vH.C18172k;

@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000f\u001a\u00060\fj\u0002`\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\" \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014*B\u0010\u001a\"\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00162\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016*N\u0010\u001d\"$\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001b2$\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001b*B\u0010\u001f\"\u001e\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00162\u001e\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¨\u0006 "}, d2 = {"LAH/c;", "builder", "vH/l$a", "a", "(LAH/c;)LvH/l$a;", "LpH/b;", "Lkotlin/Function1;", "LvH/k$b;", "LXH/N;", "block", "b", "(LpH/b;LnI/l;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "Lorg/slf4j/Logger;", "LOGGER", "LJH/a;", "", "LJH/a;", "e", "()LJH/a;", "ExpectSuccessAttributeKey", "Lkotlin/Function2;", "", "LdI/e;", "", "CallExceptionHandler", "Lkotlin/Function3;", "LAH/b;", "CallRequestExceptionHandler", "LBH/c;", "ResponseValidator", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.l  reason: case insensitive filesystem */
public final class C18173l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f148934a = C16039a.a("io.ktor.client.plugins.HttpCallValidator");

    /* renamed from: b  reason: collision with root package name */
    private static final C15954a<Boolean> f148935b = new C15954a<>("ExpectSuccessAttributeKey");

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"vH/l$a", "LAH/b;", "LEH/u;", "a", "LEH/u;", "U", "()LEH/u;", "method", "LEH/Q;", "b", "LEH/Q;", "getUrl", "()LEH/Q;", "url", "LJH/b;", "c", "LJH/b;", "getAttributes", "()LJH/b;", "attributes", "LEH/l;", "d", "LEH/l;", "()LEH/l;", "headers", "LqH/b;", "h0", "()LqH/b;", "call", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.l$a */
    public static final class a implements C15411b {

        /* renamed from: a  reason: collision with root package name */
        private final C15636u f148936a;

        /* renamed from: b  reason: collision with root package name */
        private final C15612Q f148937b;

        /* renamed from: c  reason: collision with root package name */
        private final C15955b f148938c;

        /* renamed from: d  reason: collision with root package name */
        private final C15627l f148939d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15412c f148940e;

        a(C15412c cVar) {
            this.f148940e = cVar;
            this.f148936a = cVar.h();
            this.f148937b = cVar.i().b();
            this.f148938c = cVar.c();
            this.f148939d = cVar.a().p();
        }

        public C15636u U() {
            return this.f148936a;
        }

        public C15627l a() {
            return this.f148939d;
        }

        public C15955b getAttributes() {
            return this.f148938c;
        }

        public C17168i getCoroutineContext() {
            return C15411b.a.a(this);
        }

        public C15612Q getUrl() {
            return this.f148937b;
        }

        public C17777b h0() {
            throw new IllegalStateException("Call is not initialized");
        }
    }

    /* access modifiers changed from: private */
    public static final a a(C15412c cVar) {
        return new a(cVar);
    }

    public static final void b(C17747b<?> bVar, C17642l<? super C18172k.b, C16807N> lVar) {
        C17542s.j(bVar, "<this>");
        C17542s.j(lVar, "block");
        bVar.i(C18172k.f148902d, lVar);
    }

    public static final C15954a<Boolean> e() {
        return f148935b;
    }
}
