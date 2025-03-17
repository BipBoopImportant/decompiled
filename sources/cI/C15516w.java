package CI;

import BI.C15463a;
import DI.C15538I;
import DI.C15543N;
import FI.C15685a;
import FI.C15687c;
import LI.C16016c;
import VI.C16690v;
import YH.C16877v;
import cJ.C17066c;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mJ.C17606a;
import nI.C17642l;
import qJ.C17789B;
import qJ.C17815c;
import qJ.C17818f;
import qJ.C17825m;
import qJ.C17826n;
import qJ.C17827o;
import qJ.C17829q;
import qJ.C17830r;
import qJ.C17835w;
import qJ.C17836x;
import qJ.C17838z;
import rJ.C17856a;
import rJ.C17858c;
import tJ.C17994n;
import vJ.p;

/* renamed from: CI.w  reason: case insensitive filesystem */
public final class C15516w extends C17815c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f133561f = new a((DefaultConstructorMarker) null);

    /* renamed from: CI.w$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15516w(C17994n nVar, C16690v vVar, C15538I i10, C15543N n10, C15685a aVar, C15687c cVar, C17827o oVar, p pVar, C17606a aVar2) {
        super(nVar, vVar, i10);
        C17994n nVar2 = nVar;
        C15538I i11 = i10;
        C15543N n11 = n10;
        C17542s.j(nVar2, "storageManager");
        C17542s.j(vVar, "finder");
        C17542s.j(i11, "moduleDescriptor");
        C17542s.j(n11, "notFoundClasses");
        C17542s.j(aVar, "additionalClassPartsProvider");
        C17542s.j(cVar, "platformDependentDeclarationFilter");
        C17542s.j(oVar, "deserializationConfiguration");
        C17542s.j(pVar, "kotlinTypeChecker");
        C17542s.j(aVar2, "samConversionResolver");
        C17829q qVar = r5;
        C17829q qVar2 = new C17829q(this);
        C17818f fVar = r8;
        C17856a aVar3 = C17856a.f146679r;
        C17818f fVar2 = new C17818f(i11, n11, aVar3);
        C17789B.a aVar4 = C17789B.a.f146469a;
        C17835w wVar = C17835w.f146610a;
        C17542s.i(wVar, "DO_NOTHING");
        C17826n nVar3 = r0;
        C17994n nVar4 = nVar;
        C17826n nVar5 = new C17826n(nVar4, i10, oVar, qVar, fVar, this, aVar4, wVar, C16016c.a.f136089a, C17836x.a.f146611a, C16877v.q(new C15463a(nVar2, i10), new C15500g(nVar, i10, (C17642l) null, 4, (DefaultConstructorMarker) null)), n10, C17825m.f146565a.a(), aVar, cVar, aVar3.e(), pVar, aVar2, (List) null, C17838z.f146618a, 262144, (DefaultConstructorMarker) null);
        k(nVar3);
    }

    /* access modifiers changed from: protected */
    public C17830r e(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        InputStream a10 = h().a(cVar);
        if (a10 == null) {
            return null;
        }
        return C17858c.f146681o.a(cVar, j(), i(), a10, false);
    }
}
