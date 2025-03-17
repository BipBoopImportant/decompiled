package lK;

import HJ.C15833N;
import XH.C16820k;
import com.optimizely.ab.config.FeatureVariable;
import iK.C17392a;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mK.C17611d;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LlK/x;", "LiK/a;", "LlK/a;", "lexer", "LkK/c;", "json", "<init>", "(LlK/a;LkK/c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "i", "()I", "", "m", "()J", "", "I", "()B", "", "t", "()S", "b", "LlK/a;", "LmK/d;", "c", "LmK/d;", "a", "()LmK/d;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.x  reason: case insensitive filesystem */
public final class C17592x extends C17392a {

    /* renamed from: b  reason: collision with root package name */
    private final C17570a f144543b;

    /* renamed from: c  reason: collision with root package name */
    private final C17611d f144544c;

    public C17592x(C17570a aVar, C17514c cVar) {
        C17542s.j(aVar, "lexer");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f144543b = aVar;
        this.f144544c = cVar.a();
    }

    public byte I() {
        C17570a aVar = this.f144543b;
        String s10 = aVar.s();
        try {
            return C15833N.a(s10);
        } catch (IllegalArgumentException unused) {
            C17570a.z(aVar, "Failed to parse type '" + "UByte" + "' for input '" + s10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }

    public C17611d a() {
        return this.f144544c;
    }

    public int i() {
        C17570a aVar = this.f144543b;
        String s10 = aVar.s();
        try {
            return C15833N.d(s10);
        } catch (IllegalArgumentException unused) {
            C17570a.z(aVar, "Failed to parse type '" + "UInt" + "' for input '" + s10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }

    public long m() {
        C17570a aVar = this.f144543b;
        String s10 = aVar.s();
        try {
            return C15833N.g(s10);
        } catch (IllegalArgumentException unused) {
            C17570a.z(aVar, "Failed to parse type '" + "ULong" + "' for input '" + s10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }

    public int p(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    public short t() {
        C17570a aVar = this.f144543b;
        String s10 = aVar.s();
        try {
            return C15833N.j(s10);
        } catch (IllegalArgumentException unused) {
            C17570a.z(aVar, "Failed to parse type '" + "UShort" + "' for input '" + s10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }
}
