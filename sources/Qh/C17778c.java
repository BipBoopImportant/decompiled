package qH;

import BH.C15458c;
import BH.C15460e;
import EH.C15627l;
import EH.C15631p;
import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18055d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LqH/c;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "LBH/c;", "response", "LuI/d;", "from", "to", "<init>", "(LBH/c;LuI/d;LuI/d;)V", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: qH.c  reason: case insensitive filesystem */
public final class C17778c extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    private final String f146450a;

    public C17778c(C15458c cVar, C18055d<?> dVar, C18055d<?> dVar2) {
        C17542s.j(cVar, "response");
        C17542s.j(dVar, "from");
        C17542s.j(dVar2, "to");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n        Expected response body of the type '");
        sb2.append(dVar2);
        sb2.append("' but was '");
        sb2.append(dVar);
        sb2.append("'\n        In response from `");
        sb2.append(C15460e.d(cVar).getUrl());
        sb2.append("`\n        Response status `");
        sb2.append(cVar.f());
        sb2.append("`\n        Response header `ContentType: ");
        C15627l a10 = cVar.a();
        C15631p pVar = C15631p.f134088a;
        sb2.append(a10.get(pVar.h()));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(C15460e.d(cVar).a().get(pVar.c()));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f146450a = C15854t.m(sb2.toString());
    }

    public String getMessage() {
        return this.f146450a;
    }
}
