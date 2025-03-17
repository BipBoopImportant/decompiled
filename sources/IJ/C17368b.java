package iJ;

import AI.C15429j;
import DI.C15538I;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uJ.C18096U;

/* renamed from: iJ.b  reason: case insensitive filesystem */
public class C17368b extends C17373g<List<? extends C17373g<?>>> {

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<C15538I, C18096U> f143499b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17368b(List<? extends C17373g<?>> list, C17642l<? super C15538I, ? extends C18096U> lVar) {
        super(list);
        C17542s.j(list, "value");
        C17542s.j(lVar, "computeType");
        this.f143499b = lVar;
    }

    public C18096U a(C15538I i10) {
        C17542s.j(i10, "module");
        C18096U invoke = this.f143499b.invoke(i10);
        if (!C15429j.d0(invoke) && !C15429j.r0(invoke)) {
            C15429j.E0(invoke);
        }
        return invoke;
    }
}
