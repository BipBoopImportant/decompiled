package kK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;
import lK.g0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\f¨\u0006\u001e"}, d2 = {"LkK/w;", "Lkotlinx/serialization/json/JsonPrimitive;", "", "body", "", "isString", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "coerceToInlineType", "<init>", "(Ljava/lang/Object;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "k", "()Z", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "i", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Ljava/lang/String;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends JsonPrimitive {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f144328a;

    /* renamed from: b  reason: collision with root package name */
    private final SerialDescriptor f144329b;

    /* renamed from: c  reason: collision with root package name */
    private final String f144330c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, boolean z10, SerialDescriptor serialDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z10, (i10 & 4) != 0 ? null : serialDescriptor);
    }

    public String b() {
        return this.f144330c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return k() == wVar.k() && C17542s.e(b(), wVar.b());
    }

    public int hashCode() {
        return (Boolean.hashCode(k()) * 31) + b().hashCode();
    }

    public final SerialDescriptor i() {
        return this.f144329b;
    }

    public boolean k() {
        return this.f144328a;
    }

    public String toString() {
        if (!k()) {
            return b();
        }
        StringBuilder sb2 = new StringBuilder();
        g0.c(sb2, b());
        return sb2.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(Object obj, boolean z10, SerialDescriptor serialDescriptor) {
        super((DefaultConstructorMarker) null);
        C17542s.j(obj, "body");
        this.f144328a = z10;
        this.f144329b = serialDescriptor;
        this.f144330c = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
