package iL;

import XH.C16807N;
import gL.C17295a;
import gL.C17296b;
import kL.C17523d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u00042\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LiL/b;", "LiL/c;", "<init>", "()V", "LgL/b;", "koinApplication", "LXH/N;", "b", "(LgL/b;)V", "LgL/a;", "get", "()LgL/a;", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "appDeclaration", "a", "(LnI/l;)LgL/b;", "LgL/a;", "_koin", "c", "LgL/b;", "_koinApplication", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iL.b  reason: case insensitive filesystem */
public final class C17397b implements C17398c {

    /* renamed from: a  reason: collision with root package name */
    public static final C17397b f143527a = new C17397b();

    /* renamed from: b  reason: collision with root package name */
    private static C17295a f143528b;

    /* renamed from: c  reason: collision with root package name */
    private static C17296b f143529c;

    private C17397b() {
    }

    private final void b(C17296b bVar) {
        if (f143528b == null) {
            f143529c = bVar;
            f143528b = bVar.b();
            return;
        }
        throw new C17523d("A Koin Application has already been started");
    }

    public C17296b a(C17642l<? super C17296b, C16807N> lVar) {
        C17296b a10;
        C17542s.j(lVar, "appDeclaration");
        synchronized (this) {
            a10 = C17296b.f143341c.a();
            f143527a.b(a10);
            lVar.invoke(a10);
            a10.a();
        }
        return a10;
    }

    public C17295a get() {
        C17295a aVar = f143528b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }
}
