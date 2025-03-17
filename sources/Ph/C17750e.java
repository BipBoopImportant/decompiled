package pH;

import QJ.F0;
import XH.C16807N;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import sH.C17898b;
import sH.C17903g;
import sH.h;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LsH/g;", "T", "LsH/h;", "engineFactory", "Lkotlin/Function1;", "LpH/b;", "LXH/N;", "block", "LpH/a;", "a", "(LsH/h;LnI/l;)LpH/a;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: pH.e  reason: case insensitive filesystem */
public final class C17750e {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsH/g;", "T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pH.e$a */
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17898b f146337c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17898b bVar) {
            super(1);
            this.f146337c = bVar;
        }

        public final void a(Throwable th2) {
            this.f146337c.close();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public static final <T extends C17903g> C17746a a(h<? extends T> hVar, C17642l<? super C17747b<T>, C16807N> lVar) {
        C17542s.j(hVar, "engineFactory");
        C17542s.j(lVar, "block");
        C17747b bVar = new C17747b();
        lVar.invoke(bVar);
        C17898b a10 = hVar.a(bVar.c());
        C17746a aVar = new C17746a(a10, bVar, true);
        C17168i.b bVar2 = aVar.getCoroutineContext().get(F0.f137562d0);
        C17542s.g(bVar2);
        ((F0) bVar2).s(new a(a10));
        return aVar;
    }
}
