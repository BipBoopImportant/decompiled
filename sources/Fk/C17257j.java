package fK;

import XH.C16820k;
import iK.C17394c;
import jK.C17443b;
import jK.C17445c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "T", "LjK/b;", "LiK/c;", "decoder", "", "klassName", "LfK/d;", "a", "(LjK/b;LiK/c;Ljava/lang/String;)LfK/d;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LfK/r;", "b", "(LjK/b;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)LfK/r;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fK.j  reason: case insensitive filesystem */
public final class C17257j {
    public static final <T> C17251d<T> a(C17443b<T> bVar, C17394c cVar, String str) {
        C17542s.j(bVar, "<this>");
        C17542s.j(cVar, "decoder");
        C17251d<T> d10 = bVar.d(cVar, str);
        if (d10 != null) {
            return d10;
        }
        C17445c.a(str, bVar.f());
        throw new C16820k();
    }

    public static final <T> r<T> b(C17443b<T> bVar, Encoder encoder, T t10) {
        C17542s.j(bVar, "<this>");
        C17542s.j(encoder, "encoder");
        C17542s.j(t10, "value");
        r<T> e10 = bVar.e(encoder, t10);
        if (e10 != null) {
            return e10;
        }
        C17445c.b(P.b(t10.getClass()), bVar.f());
        throw new C16820k();
    }
}
