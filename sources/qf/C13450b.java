package QF;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import fK.p;
import jK.C17487x0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LQF/b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QF.b  reason: case insensitive filesystem */
public final class C13450b {
    public static final C13450b INSTANCE = new C13450b();

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ C16824o<KSerializer<Object>> f114759a = C16825p.a(s.PUBLICATION, new C13449a());

    /* renamed from: b  reason: collision with root package name */
    public static final int f114760b = 8;

    private C13450b() {
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new C17487x0("com.sugarcube.decorate.internal.navigation.DecorateLanding", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer c() {
        return f114759a.getValue();
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof C13450b);
    }

    public int hashCode() {
        return 1565970288;
    }

    public final KSerializer<C13450b> serializer() {
        return c();
    }

    public String toString() {
        return "DecorateLanding";
    }
}
