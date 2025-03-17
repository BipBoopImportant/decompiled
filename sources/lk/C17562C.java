package lK;

import XH.C16820k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import tI.C17978n;

@Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\u0013*\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010$\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"", "offset", "", "message", "LlK/y;", "e", "(ILjava/lang/String;)LlK/y;", "", "input", "f", "(ILjava/lang/String;Ljava/lang/CharSequence;)LlK/y;", "", "value", "output", "LlK/A;", "b", "(Ljava/lang/Number;Ljava/lang/String;)LlK/A;", "LlK/a;", "result", "", "k", "(LlK/a;Ljava/lang/Number;)Ljava/lang/Void;", "entity", "g", "(LlK/a;Ljava/lang/String;)Ljava/lang/Void;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "d", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LlK/A;", "key", "c", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)LlK/A;", "a", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)LlK/y;", "l", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.C  reason: case insensitive filesystem */
public final class C17562C {
    public static final C17593y a(Number number, String str, String str2) {
        C17542s.j(number, "value");
        C17542s.j(str, "key");
        C17542s.j(str2, "output");
        return e(-1, l(number, str, str2));
    }

    public static final C17560A b(Number number, String str) {
        C17542s.j(number, "value");
        C17542s.j(str, "output");
        return new C17560A("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + j(str, 0, 1, (Object) null));
    }

    public static final C17560A c(Number number, String str, String str2) {
        C17542s.j(number, "value");
        C17542s.j(str, "key");
        C17542s.j(str2, "output");
        return new C17560A(l(number, str, str2));
    }

    public static final C17560A d(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "keyDescriptor");
        return new C17560A("Value of type '" + serialDescriptor.i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.h() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final C17593y e(int i10, String str) {
        C17542s.j(str, "message");
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        return new C17593y(str);
    }

    public static final C17593y f(int i10, String str, CharSequence charSequence) {
        C17542s.j(str, "message");
        C17542s.j(charSequence, "input");
        return e(i10, str + "\nJSON input: " + i(charSequence, i10));
    }

    public static final Void g(C17570a aVar, String str) {
        C17542s.j(aVar, "<this>");
        C17542s.j(str, "entity");
        aVar.y("Trailing comma before the end of JSON " + str, aVar.f144471a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new C16820k();
    }

    public static /* synthetic */ Void h(C17570a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return g(aVar, str);
    }

    public static final CharSequence i(CharSequence charSequence, int i10) {
        C17542s.j(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str = ".....";
        if (i10 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return str + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        String str2 = i11 <= 0 ? "" : str;
        if (i12 >= charSequence.length()) {
            str = "";
        }
        return str2 + charSequence.subSequence(C17978n.e(i11, 0), C17978n.i(i12, charSequence.length())).toString() + str;
    }

    public static /* synthetic */ CharSequence j(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return i(charSequence, i10);
    }

    public static final Void k(C17570a aVar, Number number) {
        C17542s.j(aVar, "<this>");
        C17542s.j(number, "result");
        C17570a.z(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, (Object) null);
        throw new C16820k();
    }

    private static final String l(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + j(str2, 0, 1, (Object) null);
    }
}
