package iJ;

import DI.C15538I;
import DI.C15558e;
import DI.C15578y;
import XH.C16796C;
import XH.v;
import cJ.C17065b;
import cJ.C17069f;
import gJ.C17278i;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.C18113f0;
import wJ.C18229k;
import wJ.C18230l;

/* renamed from: iJ.k  reason: case insensitive filesystem */
public final class C17377k extends C17373g<v<? extends C17065b, ? extends C17069f>> {

    /* renamed from: b  reason: collision with root package name */
    private final C17065b f143505b;

    /* renamed from: c  reason: collision with root package name */
    private final C17069f f143506c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17377k(C17065b bVar, C17069f fVar) {
        super(C16796C.a(bVar, fVar));
        C17542s.j(bVar, "enumClassId");
        C17542s.j(fVar, "enumEntryName");
        this.f143505b = bVar;
        this.f143506c = fVar;
    }

    public C18096U a(C15538I i10) {
        C18113f0 r10;
        C17542s.j(i10, "module");
        C15558e b10 = C15578y.b(i10, this.f143505b);
        if (b10 != null) {
            if (!C17278i.A(b10)) {
                b10 = null;
            }
            if (!(b10 == null || (r10 = b10.r()) == null)) {
                return r10;
            }
        }
        return C18230l.d(C18229k.ERROR_ENUM_TYPE, this.f143505b.toString(), this.f143506c.toString());
    }

    public final C17069f c() {
        return this.f143506c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f143505b.h());
        sb2.append('.');
        sb2.append(this.f143506c);
        return sb2.toString();
    }
}
