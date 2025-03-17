package kK;

import XH.C16820k;
import gK.C17294a;
import jK.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.V;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import lK.d0;
import lK.g0;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0017\u001a\u00020\u00138\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u001a\u001a\u00020\u0002*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001e\u001a\u00020\u001b*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010\"\u001a\u00020\u001f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010&\u001a\u00020#*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0017\u0010)\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0017\u0010,\u001a\u0004\u0018\u00010\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", "a", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "b", "(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;", "", "c", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/json/JsonElement;", "element", "", "d", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)Ljava/lang/Void;", "", "l", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "k", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsonUnquotedLiteralDescriptor", "j", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "i", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "", "g", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "", "h", "(Lkotlinx/serialization/json/JsonPrimitive;)F", "float", "e", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "f", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final SerialDescriptor f144324a = U.a("kotlinx.serialization.json.JsonUnquotedLiteral", C17294a.K(V.f144353a));

    public static final JsonPrimitive a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new w(bool, false, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null);
    }

    public static final JsonPrimitive b(Number number) {
        return number == null ? JsonNull.INSTANCE : new w(number, false, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null);
    }

    public static final JsonPrimitive c(String str) {
        return str == null ? JsonNull.INSTANCE : new w(str, true, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null);
    }

    private static final Void d(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + P.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Boolean e(JsonPrimitive jsonPrimitive) {
        C17542s.j(jsonPrimitive, "<this>");
        return g0.d(jsonPrimitive.b());
    }

    public static final String f(JsonPrimitive jsonPrimitive) {
        C17542s.j(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.b();
    }

    public static final double g(JsonPrimitive jsonPrimitive) {
        C17542s.j(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.b());
    }

    public static final float h(JsonPrimitive jsonPrimitive) {
        C17542s.j(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.b());
    }

    public static final JsonObject i(JsonElement jsonElement) {
        C17542s.j(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d(jsonElement, "JsonObject");
        throw new C16820k();
    }

    public static final JsonPrimitive j(JsonElement jsonElement) {
        C17542s.j(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d(jsonElement, "JsonPrimitive");
        throw new C16820k();
    }

    public static final SerialDescriptor k() {
        return f144324a;
    }

    public static final long l(JsonPrimitive jsonPrimitive) {
        C17542s.j(jsonPrimitive, "<this>");
        return new d0(jsonPrimitive.b()).p();
    }
}
