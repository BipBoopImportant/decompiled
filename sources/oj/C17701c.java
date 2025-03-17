package oJ;

import DI.C15554a;
import cJ.C17069f;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;

/* renamed from: oJ.c  reason: case insensitive filesystem */
public final class C17701c extends C17699a implements C17704f {

    /* renamed from: c  reason: collision with root package name */
    private final C15554a f145292c;

    /* renamed from: d  reason: collision with root package name */
    private final C17069f f145293d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17701c(C15554a aVar, C18096U u10, C17069f fVar, C17705g gVar) {
        super(u10, gVar);
        C17542s.j(aVar, "declarationDescriptor");
        C17542s.j(u10, "receiverType");
        this.f145292c = aVar;
        this.f145293d = fVar;
    }

    public C17069f a() {
        return this.f145293d;
    }

    public C15554a d() {
        return this.f145292c;
    }

    public String toString() {
        return "Cxt { " + d() + " }";
    }
}
