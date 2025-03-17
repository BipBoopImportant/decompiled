package tL;

import XH.C16807N;
import gL.C17296b;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\n"}, d2 = {"", "createEagerInstances", "Lkotlin/Function1;", "LgL/b;", "LXH/N;", "Lorg/koin/dsl/KoinAppDeclaration;", "appDeclaration", "a", "(ZLnI/l;)LgL/b;", "KoinAppDeclaration", "koin-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: tL.a  reason: case insensitive filesystem */
public final class C18035a {
    public static final C17296b a(boolean z10, C17642l<? super C17296b, C16807N> lVar) {
        C17296b a10 = C17296b.f143341c.a();
        if (lVar != null) {
            lVar.invoke(a10);
        }
        if (z10) {
            a10.a();
        }
        return a10;
    }

    public static /* synthetic */ C17296b b(boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return a(z10, lVar);
    }
}
