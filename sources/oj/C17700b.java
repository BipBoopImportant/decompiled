package oJ;

import DI.C15558e;
import cJ.C17069f;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;

/* renamed from: oJ.b  reason: case insensitive filesystem */
public final class C17700b extends C17699a implements C17704f {

    /* renamed from: c  reason: collision with root package name */
    private final C15558e f145290c;

    /* renamed from: d  reason: collision with root package name */
    private final C17069f f145291d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17700b(C15558e eVar, C18096U u10, C17069f fVar, C17705g gVar) {
        super(u10, gVar);
        C17542s.j(eVar, "classDescriptor");
        C17542s.j(u10, "receiverType");
        this.f145290c = eVar;
        this.f145291d = fVar;
    }

    public C17069f a() {
        return this.f145291d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f145290c + " }";
    }
}
