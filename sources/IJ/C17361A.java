package iJ;

import DI.C15538I;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;

/* renamed from: iJ.A  reason: case insensitive filesystem */
public final class C17361A extends C17368b {

    /* renamed from: c  reason: collision with root package name */
    private final C18096U f143498c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17361A(List<? extends C17373g<?>> list, C18096U u10) {
        super(list, new z(u10));
        C17542s.j(list, "value");
        C17542s.j(u10, "type");
        this.f143498c = u10;
    }

    /* access modifiers changed from: private */
    public static final C18096U c(C18096U u10, C15538I i10) {
        C17542s.j(i10, "it");
        return u10;
    }

    public final C18096U e() {
        return this.f143498c;
    }
}
