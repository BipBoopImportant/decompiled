package lK;

import XH.C16807N;
import com.optimizely.ab.config.FeatureVariable;
import fK.r;
import hK.C17339e;
import hK.l;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0018\u0010\r\u001a\u00020\n*\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"T", "LkK/c;", "json", "value", "LfK/r;", "serializer", "Lkotlinx/serialization/json/JsonElement;", "d", "(LkK/c;Ljava/lang/Object;LfK/r;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "requiresTopLevelTag", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {
    /* access modifiers changed from: private */
    public static final boolean c(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.h() instanceof C17339e) || serialDescriptor.h() == l.b.f143469a;
    }

    public static final <T> JsonElement d(C17514c cVar, T t10, r<? super T> rVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(rVar, "serializer");
        O o10 = new O();
        new P(cVar, new i0(o10)).n(rVar, t10);
        T t11 = o10.f144348a;
        if (t11 != null) {
            return (JsonElement) t11;
        }
        C17542s.z("result");
        return null;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(O o10, JsonElement jsonElement) {
        C17542s.j(jsonElement, "it");
        o10.f144348a = jsonElement;
        return C16807N.f139792a;
    }
}
