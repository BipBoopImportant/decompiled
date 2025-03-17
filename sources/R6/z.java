package r6;

import GJ.C15768k;
import XH.C16824o;
import XH.C16825p;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R1\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR)\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f0\u00048FX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lr6/z;", "", "<init>", "()V", "", "Lr6/h;", "kotlin.jvm.PlatformType", "b", "LXH/o;", "f", "()Ljava/util/List;", "fetchers", "Lr6/f;", "c", "e", "decoders", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f55717a = new z();

    /* renamed from: b  reason: collision with root package name */
    private static final C16824o f55718b = C16825p.b(new x());

    /* renamed from: c  reason: collision with root package name */
    private static final C16824o f55719c = C16825p.b(new y());

    private z() {
    }

    /* access modifiers changed from: private */
    public static final List c() {
        Class<C8698f> cls = C8698f.class;
        return C8695c.c(C15768k.a0(C15768k.h(ServiceLoader.load(cls, cls.getClassLoader()).iterator())));
    }

    /* access modifiers changed from: private */
    public static final List d() {
        Class<h> cls = h.class;
        return C8695c.c(C15768k.a0(C15768k.h(ServiceLoader.load(cls, cls.getClassLoader()).iterator())));
    }

    public final List<C8698f> e() {
        return (List) f55719c.getValue();
    }

    public final List<h<?>> f() {
        return (List) f55718b.getValue();
    }
}
