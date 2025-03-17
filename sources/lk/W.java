package lK;

import com.optimizely.ab.config.FeatureVariable;
import fK.C17261n;
import fK.r;
import hK.C17338d;
import hK.C17339e;
import hK.l;
import jK.Y;
import java.lang.annotation.Annotation;
import kK.C17514c;
import kK.C17517f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LfK/r;", "serializer", "actualSerializer", "", "classDiscriminator", "LXH/N;", "e", "(LfK/r;LfK/r;Ljava/lang/String;)V", "LhK/l;", "kind", "b", "(LhK/l;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "LkK/c;", "json", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LkK/c;)Ljava/lang/String;", "serialName", "Lkotlinx/serialization/json/JsonElement;", "element", "", "d", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Void;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class W {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f144466a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kK.a[] r0 = kK.C17512a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kK.a r1 = kK.C17512a.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kK.a r1 = kK.C17512a.POLYMORPHIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kK.a r1 = kK.C17512a.ALL_JSON_OBJECTS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f144466a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lK.W.a.<clinit>():void");
        }
    }

    public static final void b(l lVar) {
        C17542s.j(lVar, "kind");
        if (lVar instanceof l.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (lVar instanceof C17339e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (lVar instanceof C17338d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(SerialDescriptor serialDescriptor, C17514c cVar) {
        C17542s.j(serialDescriptor, "<this>");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        for (Annotation next : serialDescriptor.getAnnotations()) {
            if (next instanceof C17517f) {
                return ((C17517f) next).discriminator();
            }
        }
        return cVar.g().e();
    }

    public static final Void d(String str, JsonElement jsonElement) {
        C17542s.j(jsonElement, "element");
        throw new C17560A("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + P.b(jsonElement.getClass()).f() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    /* access modifiers changed from: private */
    public static final void e(r<?> rVar, r<?> rVar2, String str) {
        if ((rVar instanceof C17261n) && Y.a(rVar2.getDescriptor()).contains(str)) {
            String i10 = ((C17261n) rVar).getDescriptor().i();
            String i11 = rVar2.getDescriptor().i();
            throw new IllegalStateException(("Sealed class '" + i11 + "' cannot be serialized as base class '" + i10 + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
