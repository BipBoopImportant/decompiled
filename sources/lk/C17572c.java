package lK;

import HJ.C15854t;
import XH.C16820k;
import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;
import hK.C17338d;
import hK.C17339e;
import hK.l;
import hK.m;
import iK.C17394c;
import jK.C17472p0;
import kK.C17514c;
import kK.C17518g;
import kK.i;
import kK.j;
import kK.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import mK.C17611d;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H$¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010.\u001a\u00020!H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bH\u0010\u0016J\u001f\u0010K\u001a\u00020J2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010I\u001a\u00020!H\u0014¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020J2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010QR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0004X\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Y8\u0004X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8VX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0001\u0003abc¨\u0006d"}, d2 = {"LlK/c;", "LjK/p0;", "LkK/i;", "LkK/c;", "json", "Lkotlinx/serialization/json/JsonElement;", "value", "", "polymorphicDiscriminator", "<init>", "(LkK/c;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Lkotlinx/serialization/json/JsonPrimitive;", "literal", "primitive", "tag", "", "C0", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "n0", "()Lkotlinx/serialization/json/JsonElement;", "currentTag", "B0", "(Ljava/lang/String;)Ljava/lang/String;", "h", "T", "LfK/d;", "deserializer", "E", "(LfK/d;)Ljava/lang/Object;", "parentName", "childName", "f0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "LiK/c;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LiK/c;", "LXH/N;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "F", "()Z", "m0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "enumDescriptor", "", "s0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "o0", "(Ljava/lang/String;)Z", "", "p0", "(Ljava/lang/String;)B", "", "x0", "(Ljava/lang/String;)S", "v0", "(Ljava/lang/String;)I", "", "w0", "(Ljava/lang/String;)J", "", "t0", "(Ljava/lang/String;)F", "", "r0", "(Ljava/lang/String;)D", "", "q0", "(Ljava/lang/String;)C", "y0", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "u0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "r", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "d", "LkK/c;", "()LkK/c;", "e", "Lkotlinx/serialization/json/JsonElement;", "A0", "f", "Ljava/lang/String;", "z0", "()Ljava/lang/String;", "LkK/g;", "g", "LkK/g;", "configuration", "LmK/d;", "a", "()LmK/d;", "serializersModule", "LlK/J;", "LlK/O;", "LlK/Q;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.c  reason: case insensitive filesystem */
abstract class C17572c extends C17472p0 implements i {

    /* renamed from: d  reason: collision with root package name */
    private final C17514c f144495d;

    /* renamed from: e  reason: collision with root package name */
    private final JsonElement f144496e;

    /* renamed from: f  reason: collision with root package name */
    private final String f144497f;

    /* renamed from: g  reason: collision with root package name */
    protected final C17518g f144498g;

    public /* synthetic */ C17572c(C17514c cVar, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, jsonElement, str);
    }

    private final Void C0(JsonPrimitive jsonPrimitive, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (C15854t.W(str, "i", false, 2, (Object) null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        String sb3 = sb2.toString();
        throw C17562C.f(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + sb3 + " value at element: " + B0(str2), n0().toString());
    }

    public abstract JsonElement A0();

    public final String B0(String str) {
        C17542s.j(str, "currentTag");
        return j0() + '.' + str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
        r0 = kK.j.j(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T E(fK.C17251d<? extends T> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            boolean r0 = r6 instanceof jK.C17443b
            if (r0 == 0) goto L_0x00c0
            kK.c r0 = r5.d()
            kK.g r0 = r0.g()
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x0019
            goto L_0x00c0
        L_0x0019:
            r0 = r6
            jK.b r0 = (jK.C17443b) r0
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r0.getDescriptor()
            kK.c r2 = r5.d()
            java.lang.String r1 = lK.W.c(r1, r2)
            kotlinx.serialization.json.JsonElement r2 = r5.h()
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r0.getDescriptor()
            java.lang.String r0 = r0.i()
            boolean r3 = r2 instanceof kotlinx.serialization.json.JsonObject
            r4 = -1
            if (r3 == 0) goto L_0x0074
            kotlinx.serialization.json.JsonObject r2 = (kotlinx.serialization.json.JsonObject) r2
            java.lang.Object r0 = r2.get(r1)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x004e
            kotlinx.serialization.json.JsonPrimitive r0 = kK.j.j(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = kK.j.f(r0)
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            jK.b r6 = (jK.C17443b) r6     // Catch:{ q -> 0x0063 }
            fK.d r6 = fK.C17257j.a(r6, r5, r0)     // Catch:{ q -> 0x0063 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>"
            kotlin.jvm.internal.C17542s.h(r6, r0)
            kK.c r0 = r5.d()
            java.lang.Object r6 = lK.h0.b(r0, r1, r2, r6)
            goto L_0x00c4
        L_0x0063:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            kotlin.jvm.internal.C17542s.g(r6)
            java.lang.String r0 = r2.toString()
            lK.y r6 = lK.C17562C.f(r4, r6, r0)
            throw r6
        L_0x0074:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Expected "
            r6.append(r1)
            java.lang.Class<kotlinx.serialization.json.JsonObject> r1 = kotlinx.serialization.json.JsonObject.class
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            java.lang.String r1 = r1.f()
            r6.append(r1)
            java.lang.String r1 = ", but had "
            r6.append(r1)
            java.lang.Class r1 = r2.getClass()
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            java.lang.String r1 = r1.f()
            r6.append(r1)
            java.lang.String r1 = " as the serialized body of "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = " at element: "
            r6.append(r0)
            java.lang.String r0 = r5.j0()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = r2.toString()
            lK.y r6 = lK.C17562C.f(r4, r6, r0)
            throw r6
        L_0x00c0:
            java.lang.Object r6 = r6.deserialize(r5)
        L_0x00c4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.C17572c.E(fK.d):java.lang.Object");
    }

    public boolean F() {
        return !(n0() instanceof JsonNull);
    }

    public C17611d a() {
        return d().a();
    }

    public C17394c b(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        JsonElement n02 = n0();
        l h10 = serialDescriptor.h();
        Class<JsonArray> cls = JsonArray.class;
        if (C17542s.e(h10, m.b.f143471a) || (h10 instanceof C17338d)) {
            C17514c d10 = d();
            String i10 = serialDescriptor.i();
            if (n02 instanceof JsonArray) {
                return new Q(d10, (JsonArray) n02);
            }
            throw C17562C.f(-1, "Expected " + P.b(cls).f() + ", but had " + P.b(n02.getClass()).f() + " as the serialized body of " + i10 + " at element: " + j0(), n02.toString());
        }
        Class<JsonObject> cls2 = JsonObject.class;
        if (C17542s.e(h10, m.c.f143472a)) {
            C17514c d11 = d();
            SerialDescriptor a10 = l0.a(serialDescriptor.g(0), d11.a());
            l h11 = a10.h();
            if ((h11 instanceof C17339e) || C17542s.e(h11, l.b.f143469a)) {
                C17514c d12 = d();
                String i11 = serialDescriptor.i();
                if (n02 instanceof JsonObject) {
                    return new T(d12, (JsonObject) n02);
                }
                throw C17562C.f(-1, "Expected " + P.b(cls2).f() + ", but had " + P.b(n02.getClass()).f() + " as the serialized body of " + i11 + " at element: " + j0(), n02.toString());
            } else if (d11.g().c()) {
                C17514c d13 = d();
                String i12 = serialDescriptor.i();
                if (n02 instanceof JsonArray) {
                    return new Q(d13, (JsonArray) n02);
                }
                throw C17562C.f(-1, "Expected " + P.b(cls).f() + ", but had " + P.b(n02.getClass()).f() + " as the serialized body of " + i12 + " at element: " + j0(), n02.toString());
            } else {
                throw C17562C.d(a10);
            }
        } else {
            C17514c d14 = d();
            String i13 = serialDescriptor.i();
            if (n02 instanceof JsonObject) {
                return new O(d14, (JsonObject) n02, this.f144497f, (SerialDescriptor) null, 8, (DefaultConstructorMarker) null);
            }
            throw C17562C.f(-1, "Expected " + P.b(cls2).f() + ", but had " + P.b(n02.getClass()).f() + " as the serialized body of " + i13 + " at element: " + j0(), n02.toString());
        }
    }

    public void c(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
    }

    public C17514c d() {
        return this.f144495d;
    }

    /* access modifiers changed from: protected */
    public String f0(String str, String str2) {
        C17542s.j(str, "parentName");
        C17542s.j(str2, "childName");
        return str2;
    }

    public JsonElement h() {
        return n0();
    }

    /* access modifiers changed from: protected */
    public abstract JsonElement m0(String str);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = m0(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.json.JsonElement n0() {
        /*
            r1 = this;
            java.lang.Object r0 = r1.Z()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000e
            kotlinx.serialization.json.JsonElement r0 = r1.m0(r0)
            if (r0 != 0) goto L_0x0012
        L_0x000e:
            kotlinx.serialization.json.JsonElement r0 = r1.A0()
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.C17572c.n0():kotlinx.serialization.json.JsonElement");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public boolean O(String str) {
        C17542s.j(str, "tag");
        JsonElement m02 = m0(str);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                Boolean e10 = j.e(jsonPrimitive);
                if (e10 != null) {
                    return e10.booleanValue();
                }
                C0(jsonPrimitive, FeatureVariable.BOOLEAN_TYPE, str);
                throw new C16820k();
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, FeatureVariable.BOOLEAN_TYPE, str);
                throw new C16820k();
            }
        } else {
            throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(m02.getClass()).f() + " as the serialized body of " + FeatureVariable.BOOLEAN_TYPE + " at element: " + B0(str), m02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public byte P(String str) {
        C17542s.j(str, "tag");
        JsonElement m02 = m0(str);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                long l10 = j.l(jsonPrimitive);
                Byte valueOf = (-128 > l10 || l10 > 127) ? null : Byte.valueOf((byte) ((int) l10));
                if (valueOf != null) {
                    return valueOf.byteValue();
                }
                C0(jsonPrimitive, "byte", str);
                throw new C16820k();
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "byte", str);
                throw new C16820k();
            }
        } else {
            throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(m02.getClass()).f() + " as the serialized body of " + "byte" + " at element: " + B0(str), m02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public char Q(String str) {
        C17542s.j(str, "tag");
        JsonElement m02 = m0(str);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                return C15854t.J1(jsonPrimitive.b());
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "char", str);
                throw new C16820k();
            }
        } else {
            throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(m02.getClass()).f() + " as the serialized body of " + "char" + " at element: " + B0(str), m02.toString());
        }
    }

    public Decoder r(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return Z() != null ? super.r(serialDescriptor) : new C17569J(d(), A0(), this.f144497f).r(serialDescriptor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public double R(String str) {
        C17542s.j(str, "tag");
        JsonElement m02 = m0(str);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                double g10 = j.g(jsonPrimitive);
                if (d().g().b() || (!Double.isInfinite(g10) && !Double.isNaN(g10))) {
                    return g10;
                }
                throw C17562C.a(Double.valueOf(g10), str, n0().toString());
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, FeatureVariable.DOUBLE_TYPE, str);
                throw new C16820k();
            }
        } else {
            throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(m02.getClass()).f() + " as the serialized body of " + FeatureVariable.DOUBLE_TYPE + " at element: " + B0(str), m02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public int S(String str, SerialDescriptor serialDescriptor) {
        C17542s.j(str, "tag");
        C17542s.j(serialDescriptor, "enumDescriptor");
        C17514c d10 = d();
        JsonElement k02 = m0(str);
        String i10 = serialDescriptor.i();
        if (k02 instanceof JsonPrimitive) {
            return C17567H.k(serialDescriptor, d10, ((JsonPrimitive) k02).b(), (String) null, 4, (Object) null);
        }
        throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(k02.getClass()).f() + " as the serialized body of " + i10 + " at element: " + B0(str), k02.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public float T(String str) {
        C17542s.j(str, "tag");
        JsonElement m02 = m0(str);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                float h10 = j.h(jsonPrimitive);
                if (d().g().b() || (!Float.isInfinite(h10) && !Float.isNaN(h10))) {
                    return h10;
                }
                throw C17562C.a(Float.valueOf(h10), str, n0().toString());
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "float", str);
                throw new C16820k();
            }
        } else {
            throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(m02.getClass()).f() + " as the serialized body of " + "float" + " at element: " + B0(str), m02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public Decoder U(String str, SerialDescriptor serialDescriptor) {
        C17542s.j(str, "tag");
        C17542s.j(serialDescriptor, "inlineDescriptor");
        if (!c0.b(serialDescriptor)) {
            return super.U(str, serialDescriptor);
        }
        C17514c d10 = d();
        JsonElement k02 = m0(str);
        String i10 = serialDescriptor.i();
        if (k02 instanceof JsonPrimitive) {
            return new C17592x(e0.a(d10, ((JsonPrimitive) k02).b()), d());
        }
        throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(k02.getClass()).f() + " as the serialized body of " + i10 + " at element: " + B0(str), k02.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public int V(String str) {
        C17542s.j(str, "tag");
        JsonElement m02 = m0(str);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                long l10 = j.l(jsonPrimitive);
                Integer valueOf = (-2147483648L > l10 || l10 > 2147483647L) ? null : Integer.valueOf((int) l10);
                if (valueOf != null) {
                    return valueOf.intValue();
                }
                C0(jsonPrimitive, "int", str);
                throw new C16820k();
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "int", str);
                throw new C16820k();
            }
        } else {
            throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(m02.getClass()).f() + " as the serialized body of " + "int" + " at element: " + B0(str), m02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public long W(String str) {
        C17542s.j(str, "tag");
        JsonElement m02 = m0(str);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                return j.l(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, Constants.LONG, str);
                throw new C16820k();
            }
        } else {
            throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(m02.getClass()).f() + " as the serialized body of " + Constants.LONG + " at element: " + B0(str), m02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public short X(String str) {
        C17542s.j(str, "tag");
        JsonElement m02 = m0(str);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            try {
                long l10 = j.l(jsonPrimitive);
                Short valueOf = (-32768 > l10 || l10 > 32767) ? null : Short.valueOf((short) ((int) l10));
                if (valueOf != null) {
                    return valueOf.shortValue();
                }
                C0(jsonPrimitive, "short", str);
                throw new C16820k();
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "short", str);
                throw new C16820k();
            }
        } else {
            throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(m02.getClass()).f() + " as the serialized body of " + "short" + " at element: " + B0(str), m02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public String Y(String str) {
        C17542s.j(str, "tag");
        JsonElement m02 = m0(str);
        if (m02 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) m02;
            if (jsonPrimitive instanceof w) {
                w wVar = (w) jsonPrimitive;
                if (wVar.k() || d().g().q()) {
                    return wVar.b();
                }
                throw C17562C.f(-1, "String literal for key '" + str + "' should be quoted at element: " + B0(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", n0().toString());
            }
            throw C17562C.f(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + B0(str), n0().toString());
        }
        throw C17562C.f(-1, "Expected " + P.b(JsonPrimitive.class).f() + ", but had " + P.b(m02.getClass()).f() + " as the serialized body of " + FeatureVariable.STRING_TYPE + " at element: " + B0(str), m02.toString());
    }

    /* access modifiers changed from: protected */
    public final String z0() {
        return this.f144497f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17572c(C17514c cVar, JsonElement jsonElement, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, jsonElement, (i10 & 4) != 0 ? null : str, (DefaultConstructorMarker) null);
    }

    private C17572c(C17514c cVar, JsonElement jsonElement, String str) {
        this.f144495d = cVar;
        this.f144496e = jsonElement;
        this.f144497f = str;
        this.f144498g = d().g();
    }
}
