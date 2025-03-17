package w5;

import A5.a;
import XH.C16807N;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00138\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lw5/f;", "", "<init>", "()V", "", "a", "J", "ownerThreadId", "", "Lkotlin/Function0;", "LXH/N;", "b", "Ljava/util/List;", "getPostCommitHooks$runtime", "()Ljava/util/List;", "postCommitHooks", "c", "getPostRollbackHooks$runtime", "postRollbackHooks", "", "", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "registeredQueries", "", "e", "pendingTables", "", "f", "Z", "getChildrenSuccessful$runtime", "()Z", "setChildrenSuccessful$runtime", "(Z)V", "childrenSuccessful", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private final long f57195a = a.a();

    /* renamed from: b  reason: collision with root package name */
    private final List<C17631a<C16807N>> f57196b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<C17631a<C16807N>> f57197c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final Set<Integer> f57198d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f57199e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f57200f = true;

    public final Set<String> a() {
        return this.f57199e;
    }

    public final Set<Integer> b() {
        return this.f57198d;
    }
}
