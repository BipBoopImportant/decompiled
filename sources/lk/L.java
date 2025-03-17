package lK;

import fK.C17251d;
import fK.r;
import hK.C17338d;
import hK.C17339e;
import hK.l;
import hK.m;
import java.util.List;
import kK.C17512a;
import kK.C17518g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mK.C17615h;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\r\u0010\fJI\u0010\u0015\u001a\u00020\n\"\b\b\u0000\u0010\u000f*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b2 \u0010\u0014\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JM\u0010\u001b\u001a\u00020\n\"\b\b\u0000\u0010\u0017*\u00020\u000e\"\b\b\u0001\u0010\u0018*\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJC\u0010\u001f\u001a\u00020\n\"\b\b\u0000\u0010\u0017*\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0016JE\u0010#\u001a\u00020\n\"\b\b\u0000\u0010\u0017*\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u001c\u0010\"\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!0\u0011H\u0016¢\u0006\u0004\b#\u0010\u0016R\u0014\u0010%\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006,"}, d2 = {"LlK/L;", "LmK/h;", "LkK/g;", "configuration", "<init>", "(LkK/g;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "LuI/d;", "actualClass", "LXH/N;", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LuI/d;)V", "h", "", "T", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "provider", "d", "(LuI/d;LnI/l;)V", "Base", "Sub", "baseClass", "actualSerializer", "a", "(LuI/d;LuI/d;Lkotlinx/serialization/KSerializer;)V", "LfK/r;", "defaultSerializerProvider", "g", "", "LfK/d;", "defaultDeserializerProvider", "e", "Ljava/lang/String;", "discriminator", "", "b", "Z", "useArrayPolymorphism", "c", "isDiscriminatorRequired", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class L implements C17615h {

    /* renamed from: a  reason: collision with root package name */
    private final String f144431a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f144432b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f144433c;

    public L(C17518g gVar) {
        C17542s.j(gVar, "configuration");
        this.f144431a = gVar.e();
        this.f144432b = gVar.p();
        this.f144433c = gVar.f() != C17512a.NONE;
    }

    private final void h(SerialDescriptor serialDescriptor, C18055d<?> dVar) {
        int d10 = serialDescriptor.d();
        int i10 = 0;
        while (i10 < d10) {
            String e10 = serialDescriptor.e(i10);
            if (!C17542s.e(e10, this.f144431a)) {
                i10++;
            } else {
                throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + e10 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void i(SerialDescriptor serialDescriptor, C18055d<?> dVar) {
        l h10 = serialDescriptor.h();
        if ((h10 instanceof C17338d) || C17542s.e(h10, l.a.f143468a)) {
            throw new IllegalArgumentException("Serializer for " + dVar.f() + " can't be registered as a subclass for polymorphic serialization because its kind " + h10 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        } else if (this.f144432b || !this.f144433c) {
        } else {
            if (C17542s.e(h10, m.b.f143471a) || C17542s.e(h10, m.c.f143472a) || (h10 instanceof C17339e) || (h10 instanceof l.b)) {
                throw new IllegalArgumentException("Serializer for " + dVar.f() + " of kind " + h10 + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    public <Base, Sub extends Base> void a(C18055d<Base> dVar, C18055d<Sub> dVar2, KSerializer<Sub> kSerializer) {
        C17542s.j(dVar, "baseClass");
        C17542s.j(dVar2, "actualClass");
        C17542s.j(kSerializer, "actualSerializer");
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        i(descriptor, dVar2);
        if (!this.f144432b && this.f144433c) {
            h(descriptor, dVar2);
        }
    }

    public <T> void d(C18055d<T> dVar, C17642l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar) {
        C17542s.j(dVar, "kClass");
        C17542s.j(lVar, "provider");
    }

    public <Base> void e(C18055d<Base> dVar, C17642l<? super String, ? extends C17251d<? extends Base>> lVar) {
        C17542s.j(dVar, "baseClass");
        C17542s.j(lVar, "defaultDeserializerProvider");
    }

    public <Base> void g(C18055d<Base> dVar, C17642l<? super Base, ? extends r<? super Base>> lVar) {
        C17542s.j(dVar, "baseClass");
        C17542s.j(lVar, "defaultSerializerProvider");
    }
}
