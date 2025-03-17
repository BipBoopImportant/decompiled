package UJ;

import dI.C17168i;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0003¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0012\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LUJ/m;", "LdI/i;", "", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;LdI/i;)V", "LdI/i$b;", "E", "LdI/i$c;", "key", "get", "(LdI/i$c;)LdI/i$b;", "", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "context", "plus", "(LdI/i;)LdI/i;", "minusKey", "(LdI/i$c;)LdI/i;", "b", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.m  reason: case insensitive filesystem */
public final class C16620m implements C17168i {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C17168i f139153a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f139154b;

    public C16620m(Throwable th2, C17168i iVar) {
        this.f139153a = iVar;
        this.f139154b = th2;
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return this.f139153a.fold(r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return this.f139153a.get(cVar);
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return this.f139153a.minusKey(cVar);
    }

    public C17168i plus(C17168i iVar) {
        return this.f139153a.plus(iVar);
    }
}
