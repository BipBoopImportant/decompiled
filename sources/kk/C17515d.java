package kK;

import gK.C17294a;
import hK.l;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"LkK/d;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonArray;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "a", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kK.d  reason: case insensitive filesystem */
public final class C17515d implements KSerializer<JsonArray> {

    /* renamed from: a  reason: collision with root package name */
    public static final C17515d f144284a = new C17515d();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f144285b = a.f144286b;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\u00020\u00068\u0016XD¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00128VX\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00128VX\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00048\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"LkK/d$a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "", "index", "", "e", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "f", "(I)Ljava/util/List;", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "j", "(I)Z", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "getSerialName$annotations", "serialName", "LhK/l;", "h", "()LhK/l;", "kind", "b", "()Z", "isNullable", "isInline", "d", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kK.d$a */
    private static final class a implements SerialDescriptor {

        /* renamed from: b  reason: collision with root package name */
        public static final a f144286b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final String f144287c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ SerialDescriptor f144288a = C17294a.h(q.f144325a).getDescriptor();

        private a() {
        }

        public boolean b() {
            return this.f144288a.b();
        }

        public int c(String str) {
            C17542s.j(str, "name");
            return this.f144288a.c(str);
        }

        public int d() {
            return this.f144288a.d();
        }

        public String e(int i10) {
            return this.f144288a.e(i10);
        }

        public List<Annotation> f(int i10) {
            return this.f144288a.f(i10);
        }

        public SerialDescriptor g(int i10) {
            return this.f144288a.g(i10);
        }

        public List<Annotation> getAnnotations() {
            return this.f144288a.getAnnotations();
        }

        public l h() {
            return this.f144288a.h();
        }

        public String i() {
            return f144287c;
        }

        public boolean isInline() {
            return this.f144288a.isInline();
        }

        public boolean j(int i10) {
            return this.f144288a.j(i10);
        }
    }

    private C17515d() {
    }

    /* renamed from: b */
    public JsonArray deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        r.g(decoder);
        return new JsonArray((List) C17294a.h(q.f144325a).deserialize(decoder));
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonArray jsonArray) {
        C17542s.j(encoder, "encoder");
        C17542s.j(jsonArray, "value");
        r.h(encoder);
        C17294a.h(q.f144325a).serialize(encoder, jsonArray);
    }

    public SerialDescriptor getDescriptor() {
        return f144285b;
    }
}
