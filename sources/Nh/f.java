package NH;

import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00012H\u0010\n\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\t0\u00042\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "TSubject", "TContext", "context", "", "Lkotlin/Function3;", "LNH/e;", "LdI/e;", "LXH/N;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "interceptors", "subject", "LdI/i;", "coroutineContext", "", "debugMode", "a", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;LdI/i;Z)LNH/e;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final <TSubject, TContext> e<TSubject, TContext> a(TContext tcontext, List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super C17164e<? super C16807N>, ? extends Object>> list, TSubject tsubject, C17168i iVar, boolean z10) {
        C17542s.j(tcontext, "context");
        C17542s.j(list, "interceptors");
        C17542s.j(tsubject, "subject");
        C17542s.j(iVar, "coroutineContext");
        return (g.a() || z10) ? new C16096a(tcontext, list, tsubject, iVar) : new n(tsubject, tcontext, list);
    }
}
