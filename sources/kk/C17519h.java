package kK;

import XH.C16820k;
import fK.C17251d;
import fK.q;
import fK.r;
import fK.z;
import hK.C17338d;
import hK.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LkK/h;", "", "T", "Lkotlinx/serialization/KSerializer;", "LuI/d;", "baseClass", "<init>", "(LuI/d;)V", "subClass", "", "c", "(LuI/d;LuI/d;)Ljava/lang/Void;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "LfK/d;", "b", "(Lkotlinx/serialization/json/JsonElement;)LfK/d;", "a", "LuI/d;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kK.h  reason: case insensitive filesystem */
public abstract class C17519h<T> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C18055d<T> f144322a;

    /* renamed from: b  reason: collision with root package name */
    private final SerialDescriptor f144323b;

    public C17519h(C18055d<T> dVar) {
        C17542s.j(dVar, "baseClass");
        this.f144322a = dVar;
        this.f144323b = k.f("JsonContentPolymorphicSerializer<" + dVar.f() + '>', C17338d.b.f143438a, new SerialDescriptor[0], (C17642l) null, 8, (Object) null);
    }

    private final Void c(C18055d<?> dVar, C18055d<?> dVar2) {
        String f10 = dVar.f();
        if (f10 == null) {
            f10 = String.valueOf(dVar);
        }
        throw new q("Class '" + f10 + "' is not registered for polymorphic serialization " + ("in the scope of '" + dVar2.f() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    /* access modifiers changed from: protected */
    public abstract C17251d<T> b(JsonElement jsonElement);

    public final T deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        i d10 = r.d(decoder);
        JsonElement h10 = d10.h();
        C17251d b10 = b(h10);
        C17542s.h(b10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return d10.d().f((KSerializer) b10, h10);
    }

    public SerialDescriptor getDescriptor() {
        return this.f144323b;
    }

    public final void serialize(Encoder encoder, T t10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(t10, "value");
        r<T> f10 = encoder.a().f(this.f144322a, t10);
        if (f10 == null && (f10 = z.h(P.b(t10.getClass()))) == null) {
            c(P.b(t10.getClass()), this.f144322a);
            throw new C16820k();
        } else {
            ((KSerializer) f10).serialize(encoder, t10);
        }
    }
}
