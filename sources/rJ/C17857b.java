package rJ;

import AI.C15421b;
import AI.C15435p;
import DI.C15538I;
import DI.C15543N;
import DI.C15545P;
import DI.C15548T;
import FI.C15685a;
import FI.C15686b;
import FI.C15687c;
import LI.C16016c;
import YH.C16877v;
import cJ.C17066c;
import com.google.ar.core.ImageMetadata;
import eJ.C17196g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mJ.C17607b;
import nI.C17642l;
import qJ.C17789B;
import qJ.C17818f;
import qJ.C17825m;
import qJ.C17826n;
import qJ.C17827o;
import qJ.C17829q;
import qJ.C17834v;
import qJ.C17835w;
import qJ.C17836x;
import tJ.C17994n;
import vJ.p;

/* renamed from: rJ.b  reason: case insensitive filesystem */
public final class C17857b implements C15421b {

    /* renamed from: b  reason: collision with root package name */
    private final C17859d f146680b = new C17859d();

    /* renamed from: rJ.b$a */
    /* synthetic */ class a extends C17540p implements C17642l<String, InputStream> {
        a(Object obj) {
            super(1, obj, C17859d.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
        }

        /* renamed from: t */
        public final InputStream invoke(String str) {
            C17542s.j(str, "p0");
            return ((C17859d) this.receiver).a(str);
        }
    }

    public C15545P a(C17994n nVar, C15538I i10, Iterable<? extends C15686b> iterable, C15687c cVar, C15685a aVar, boolean z10) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(i10, "builtInsModule");
        C17542s.j(iterable, "classDescriptorFactories");
        C17542s.j(cVar, "platformDependentDeclarationFilter");
        C17542s.j(aVar, "additionalClassPartsProvider");
        return b(nVar, i10, C15435p.f133022H, iterable, cVar, aVar, z10, new a(this.f146680b));
    }

    public final C15545P b(C17994n nVar, C15538I i10, Set<C17066c> set, Iterable<? extends C15686b> iterable, C15687c cVar, C15685a aVar, boolean z10, C17642l<? super String, ? extends InputStream> lVar) {
        C17994n nVar2 = nVar;
        C15538I i11 = i10;
        Set<C17066c> set2 = set;
        C17642l<? super String, ? extends InputStream> lVar2 = lVar;
        C17542s.j(nVar2, "storageManager");
        C17542s.j(i11, "module");
        C17542s.j(set2, "packageFqNames");
        C17542s.j(iterable, "classDescriptorFactories");
        C17542s.j(cVar, "platformDependentDeclarationFilter");
        C17542s.j(aVar, "additionalClassPartsProvider");
        C17542s.j(lVar2, "loadResource");
        Iterable<C17066c> iterable2 = set2;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable2, 10));
        for (C17066c cVar2 : iterable2) {
            String r10 = C17856a.f146679r.r(cVar2);
            InputStream inputStream = (InputStream) lVar2.invoke(r10);
            if (inputStream != null) {
                arrayList.add(C17858c.f146681o.a(cVar2, nVar, i10, inputStream, z10));
            } else {
                throw new IllegalStateException("Resource not found in classpath: " + r10);
            }
        }
        C15548T t10 = r2;
        C15548T t11 = new C15548T(arrayList);
        C15543N n10 = r1;
        C15543N n11 = new C15543N(nVar2, i11);
        C17827o.a aVar2 = C17827o.a.f146589a;
        C17829q qVar = r5;
        C17829q qVar2 = new C17829q(t11);
        C17818f fVar = r7;
        C15548T t12 = t11;
        C17856a aVar3 = C17856a.f146679r;
        C17818f fVar2 = new C17818f(i11, n11, aVar3);
        C17789B.a aVar4 = C17789B.a.f146469a;
        C17835w wVar = C17835w.f146610a;
        C17826n nVar3 = r0;
        C17835w wVar2 = wVar;
        ArrayList arrayList2 = arrayList;
        C17542s.i(wVar, "DO_NOTHING");
        C16016c.a aVar5 = C16016c.a.f136089a;
        ArrayList<C17858c> arrayList3 = arrayList2;
        C17836x.a aVar6 = C17836x.a.f146611a;
        C17825m a10 = C17825m.f146565a.a();
        C17196g e10 = aVar3.e();
        C17607b bVar = r1;
        C17607b bVar2 = new C17607b(nVar2, C16877v.n());
        C15548T t13 = t12;
        C17826n nVar4 = new C17826n(nVar, i10, aVar2, qVar, fVar, t10, aVar4, wVar2, aVar5, aVar6, iterable, n10, a10, aVar, cVar, e10, (p) null, bVar, (List) null, (C17834v) null, ImageMetadata.SCALER_CROP_REGION, (DefaultConstructorMarker) null);
        for (C17858c L02 : arrayList3) {
            L02.L0(nVar3);
        }
        return t13;
    }
}
