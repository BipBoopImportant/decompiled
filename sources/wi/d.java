package wI;

import DI.h0;
import XH.C16818i;
import XH.v;
import XI.i;
import XI.t;
import ZI.g;
import bJ.C17046e;
import bJ.C17047f;
import bJ.C17050i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qJ.C17798K;
import uI.C18059h;
import xI.C18639i0;
import xI.C18642k;
import xI.j1;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"R", "LXH/i;", "LuI/h;", "a", "(LXH/i;)LuI/h;", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements p<C17798K, i, h0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f149148a = new a();

        a() {
            super(2, C17798K.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
        }

        /* renamed from: t */
        public final h0 invoke(C17798K k10, i iVar) {
            C17542s.j(k10, "p0");
            C17542s.j(iVar, "p1");
            return k10.s(iVar);
        }
    }

    public static final <R> C18059h<R> a(C16818i<? extends R> iVar) {
        C17542s.j(iVar, "<this>");
        Metadata metadata = (Metadata) iVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d12 = metadata.d1();
        if (d12.length == 0) {
            d12 = null;
        }
        if (d12 == null) {
            return null;
        }
        v<C17047f, i> j10 = C17050i.j(d12, metadata.d2());
        C17047f a10 = j10.a();
        i b10 = j10.b();
        C17046e eVar = new C17046e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = iVar.getClass();
        t h02 = b10.h0();
        C17542s.i(h02, "getTypeTable(...)");
        return new C18639i0(C18642k.f152431d, (h0) j1.h(cls, b10, a10, new g(h02), eVar, a.f149148a));
    }
}
