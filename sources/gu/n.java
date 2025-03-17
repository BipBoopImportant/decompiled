package Gu;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import fK.p;
import jK.C17487x0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00078\u0006XD¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LGu/n;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "deeplinkBasePath", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {
    public static final n INSTANCE = new n();

    /* renamed from: a  reason: collision with root package name */
    private static final String f81259a = "ikea://navigation/wayfinding/onboarding";

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ C16824o<KSerializer<Object>> f81260b = C16825p.a(s.PUBLICATION, new m());

    private n() {
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new C17487x0("com.ingka.ikea.instore.wayfinding.impl.navigation.WayfindingRoutes.Onboarding", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer c() {
        return f81260b.getValue();
    }

    public final String d() {
        return f81259a;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof n);
    }

    public int hashCode() {
        return -1301912380;
    }

    public final KSerializer<n> serializer() {
        return c();
    }

    public String toString() {
        return "Onboarding";
    }
}
