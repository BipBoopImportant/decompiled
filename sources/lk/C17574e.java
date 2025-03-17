package lK;

import XH.C16797D;
import XH.C16799F;
import XH.C16801H;
import XH.C16804K;
import XH.C16807N;
import XH.C16820k;
import hK.C17338d;
import hK.C17339e;
import hK.l;
import hK.m;
import iK.C17393b;
import iK.C17395d;
import jK.C17474q0;
import kK.C17514c;
import kK.C17518g;
import kK.j;
import kK.q;
import kK.s;
import kK.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import mK.C17611d;
import nI.C17642l;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002\r\u0012\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0016H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000204H\u0014¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000207H\u0014¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020:H\u0014¢\u0006\u0004\b;\u0010<J+\u0010@\u001a\u00020\u0007\"\u0004\b\u0000\u0010=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020BH\u0014¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u001dH\u0014¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020GH\u0014¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0014¢\u0006\u0004\bJ\u0010KJ'\u0010N\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u00102\u0006\u0010M\u001a\u00020\u0016H\u0014¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020P2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020P2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020U2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0010H\u0014¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bV\u0010Z\u001a\u0004\b[\u0010\\R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0004X\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020a8\u0004X\u0004¢\u0006\u0006\n\u0004\b[\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0011\u0010l\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\bj\u0010k\u0001\u0003mno¨\u0006p"}, d2 = {"LlK/e;", "LjK/q0;", "LkK/s;", "LkK/c;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "LXH/N;", "nodeConsumer", "<init>", "(LkK/c;LnI/l;)V", "", "tag", "lK/e$b", "v0", "(Ljava/lang/String;)LlK/e$b;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "inlineDescriptor", "lK/e$a", "u0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)LlK/e$a;", "descriptor", "", "index", "b0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "element", "A", "(Lkotlinx/serialization/json/JsonElement;)V", "", "z", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "parentName", "childName", "a0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "key", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "v", "()V", "o", "p0", "(Ljava/lang/String;)V", "value", "n0", "(Ljava/lang/String;I)V", "", "h0", "(Ljava/lang/String;B)V", "", "q0", "(Ljava/lang/String;S)V", "", "o0", "(Ljava/lang/String;J)V", "", "l0", "(Ljava/lang/String;F)V", "T", "LfK/r;", "serializer", "n", "(LfK/r;Ljava/lang/Object;)V", "", "j0", "(Ljava/lang/String;D)V", "g0", "(Ljava/lang/String;Z)V", "", "i0", "(Ljava/lang/String;C)V", "r0", "(Ljava/lang/String;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "k0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "Lkotlinx/serialization/encoding/Encoder;", "m0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "k", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "LiK/d;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LiK/d;", "U", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LkK/c;", "d", "()LkK/c;", "c", "LnI/l;", "t0", "()LnI/l;", "LkK/g;", "LkK/g;", "configuration", "e", "Ljava/lang/String;", "polymorphicDiscriminator", "f", "polymorphicSerialName", "LmK/d;", "a", "()LmK/d;", "serializersModule", "LlK/K;", "LlK/P;", "LlK/S;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.e  reason: case insensitive filesystem */
abstract class C17574e extends C17474q0 implements s {

    /* renamed from: b  reason: collision with root package name */
    private final C17514c f144502b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<JsonElement, C16807N> f144503c;

    /* renamed from: d  reason: collision with root package name */
    protected final C17518g f144504d;

    /* renamed from: e  reason: collision with root package name */
    private String f144505e;

    /* renamed from: f  reason: collision with root package name */
    private String f144506f;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"lK/e$a", "LiK/b;", "", "value", "LXH/N;", "G", "(Ljava/lang/String;)V", "LmK/d;", "a", "()LmK/d;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lK.e$a */
    public static final class a extends C17393b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17574e f144507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f144508b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f144509c;

        a(C17574e eVar, String str, SerialDescriptor serialDescriptor) {
            this.f144507a = eVar;
            this.f144508b = str;
            this.f144509c = serialDescriptor;
        }

        public void G(String str) {
            C17542s.j(str, "value");
            this.f144507a.w0(this.f144508b, new w(str, false, this.f144509c));
        }

        public C17611d a() {
            return this.f144507a.d().a();
        }
    }

    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"lK/e$b", "LiK/b;", "", "s", "LXH/N;", "K", "(Ljava/lang/String;)V", "", "value", "C", "(I)V", "", "l", "(J)V", "", "g", "(B)V", "", "q", "(S)V", "LmK/d;", "a", "LmK/d;", "()LmK/d;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lK.e$b */
    public static final class b extends C17393b {

        /* renamed from: a  reason: collision with root package name */
        private final C17611d f144510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17574e f144511b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f144512c;

        b(C17574e eVar, String str) {
            this.f144511b = eVar;
            this.f144512c = str;
            this.f144510a = eVar.d().a();
        }

        public void C(int i10) {
            K(Integer.toUnsignedString(C16799F.b(i10)));
        }

        public final void K(String str) {
            C17542s.j(str, "s");
            this.f144511b.w0(this.f144512c, new w(str, false, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null));
        }

        public C17611d a() {
            return this.f144510a;
        }

        public void g(byte b10) {
            K(C16797D.n(C16797D.b(b10)));
        }

        public void l(long j10) {
            K(Long.toUnsignedString(C16801H.b(j10)));
        }

        public void q(short s10) {
            K(C16804K.n(C16804K.b(s10)));
        }
    }

    public /* synthetic */ C17574e(C17514c cVar, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, lVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(C17574e eVar, JsonElement jsonElement) {
        C17542s.j(jsonElement, "node");
        eVar.w0((String) eVar.V(), jsonElement);
        return C16807N.f139792a;
    }

    private final a u0(String str, SerialDescriptor serialDescriptor) {
        return new a(this, str, serialDescriptor);
    }

    private final b v0(String str) {
        return new b(this, str);
    }

    public void A(JsonElement jsonElement) {
        C17542s.j(jsonElement, "element");
        if (this.f144505e == null || (jsonElement instanceof JsonObject)) {
            n(q.f144325a, jsonElement);
        } else {
            W.d(this.f144506f, jsonElement);
            throw new C16820k();
        }
    }

    /* access modifiers changed from: protected */
    public void U(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        this.f144503c.invoke(s0());
    }

    public final C17611d a() {
        return this.f144502b.a();
    }

    /* access modifiers changed from: protected */
    public String a0(String str, String str2) {
        C17542s.j(str, "parentName");
        C17542s.j(str2, "childName");
        return str2;
    }

    public C17395d b(SerialDescriptor serialDescriptor) {
        C17574e eVar;
        C17542s.j(serialDescriptor, "descriptor");
        C17642l dVar = W() == null ? this.f144503c : new C17573d(this);
        l h10 = serialDescriptor.h();
        if (C17542s.e(h10, m.b.f143471a) || (h10 instanceof C17338d)) {
            eVar = new S(this.f144502b, dVar);
        } else if (C17542s.e(h10, m.c.f143472a)) {
            C17514c cVar = this.f144502b;
            SerialDescriptor a10 = l0.a(serialDescriptor.g(0), cVar.a());
            l h11 = a10.h();
            if ((h11 instanceof C17339e) || C17542s.e(h11, l.b.f143469a)) {
                eVar = new U(this.f144502b, dVar);
            } else if (cVar.g().c()) {
                eVar = new S(this.f144502b, dVar);
            } else {
                throw C17562C.d(a10);
            }
        } else {
            eVar = new P(this.f144502b, dVar);
        }
        String str = this.f144505e;
        if (str != null) {
            if (eVar instanceof U) {
                U u10 = (U) eVar;
                u10.w0("key", j.c(str));
                String str2 = this.f144506f;
                if (str2 == null) {
                    str2 = serialDescriptor.i();
                }
                u10.w0("value", j.c(str2));
            } else {
                String str3 = this.f144506f;
                if (str3 == null) {
                    str3 = serialDescriptor.i();
                }
                eVar.w0(str, j.c(str3));
            }
            this.f144505e = null;
            this.f144506f = null;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public String b0(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return C17567H.h(serialDescriptor, this.f144502b, i10);
    }

    public final C17514c d() {
        return this.f144502b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public void J(String str, boolean z10) {
        C17542s.j(str, "tag");
        w0(str, j.a(Boolean.valueOf(z10)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void K(String str, byte b10) {
        C17542s.j(str, "tag");
        w0(str, j.b(Byte.valueOf(b10)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void L(String str, char c10) {
        C17542s.j(str, "tag");
        w0(str, j.c(String.valueOf(c10)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void M(String str, double d10) {
        C17542s.j(str, "tag");
        w0(str, j.b(Double.valueOf(d10)));
        if (this.f144504d.b()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw C17562C.c(Double.valueOf(d10), str, s0().toString());
        }
    }

    public Encoder k(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        if (W() == null) {
            return new K(this.f144502b, this.f144503c).k(serialDescriptor);
        }
        if (this.f144505e != null) {
            this.f144506f = serialDescriptor.i();
        }
        return super.k(serialDescriptor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void N(String str, SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(str, "tag");
        C17542s.j(serialDescriptor, "enumDescriptor");
        w0(str, j.c(serialDescriptor.e(i10)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public void O(String str, float f10) {
        C17542s.j(str, "tag");
        w0(str, j.b(Float.valueOf(f10)));
        if (this.f144504d.b()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw C17562C.c(Float.valueOf(f10), str, s0().toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public Encoder P(String str, SerialDescriptor serialDescriptor) {
        C17542s.j(str, "tag");
        C17542s.j(serialDescriptor, "inlineDescriptor");
        return c0.b(serialDescriptor) ? v0(str) : c0.a(serialDescriptor) ? u0(str, serialDescriptor) : super.P(str, serialDescriptor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (d().g().f() != kK.C17512a.NONE) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        if (kotlin.jvm.internal.C17542s.e(r1, hK.m.d.f143473a) == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void n(fK.r<? super T> r4, T r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.Object r0 = r3.W()
            if (r0 != 0) goto L_0x002c
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getDescriptor()
            mK.d r1 = r3.a()
            kotlinx.serialization.descriptors.SerialDescriptor r0 = lK.l0.a(r0, r1)
            boolean r0 = lK.j0.c(r0)
            if (r0 != 0) goto L_0x001e
            goto L_0x002c
        L_0x001e:
            lK.K r0 = new lK.K
            kK.c r1 = r3.f144502b
            nI.l<kotlinx.serialization.json.JsonElement, XH.N> r2 = r3.f144503c
            r0.<init>(r1, r2)
            r0.n(r4, r5)
            goto L_0x00f4
        L_0x002c:
            kK.c r0 = r3.d()
            kK.g r0 = r0.g()
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x003f
            r4.serialize(r3, r5)
            goto L_0x00f4
        L_0x003f:
            boolean r0 = r4 instanceof jK.C17443b
            if (r0 == 0) goto L_0x0054
            kK.c r1 = r3.d()
            kK.g r1 = r1.g()
            kK.a r1 = r1.f()
            kK.a r2 = kK.C17512a.NONE
            if (r1 == r2) goto L_0x009c
            goto L_0x0089
        L_0x0054:
            kK.c r1 = r3.d()
            kK.g r1 = r1.g()
            kK.a r1 = r1.f()
            int[] r2 = lK.W.a.f144466a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x009c
            r2 = 2
            if (r1 == r2) goto L_0x009c
            r2 = 3
            if (r1 != r2) goto L_0x0096
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            hK.l r1 = r1.h()
            hK.m$a r2 = hK.m.a.f143470a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r2 != 0) goto L_0x0089
            hK.m$d r2 = hK.m.d.f143473a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r1 == 0) goto L_0x009c
        L_0x0089:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kK.c r2 = r3.d()
            java.lang.String r1 = lK.W.c(r1, r2)
            goto L_0x009d
        L_0x0096:
            XH.t r4 = new XH.t
            r4.<init>()
            throw r4
        L_0x009c:
            r1 = 0
        L_0x009d:
            if (r0 == 0) goto L_0x00e3
            r0 = r4
            jK.b r0 = (jK.C17443b) r0
            if (r5 == 0) goto L_0x00bf
            fK.r r0 = fK.C17257j.b(r0, r3, r5)
            if (r1 == 0) goto L_0x00b8
            lK.W.e(r4, r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r0.getDescriptor()
            hK.l r4 = r4.h()
            lK.W.b(r4)
        L_0x00b8:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.C17542s.h(r0, r4)
            r4 = r0
            goto L_0x00e3
        L_0x00bf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Value for serializer "
            r4.append(r5)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r0.getDescriptor()
            r4.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L_0x00e3:
            if (r1 == 0) goto L_0x00f1
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getDescriptor()
            java.lang.String r0 = r0.i()
            r3.f144505e = r1
            r3.f144506f = r0
        L_0x00f1:
            r4.serialize(r3, r5)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.C17574e.n(fK.r, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public void Q(String str, int i10) {
        C17542s.j(str, "tag");
        w0(str, j.b(Integer.valueOf(i10)));
    }

    public void o() {
        String str = (String) W();
        if (str == null) {
            this.f144503c.invoke(JsonNull.INSTANCE);
        } else {
            p0(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public void R(String str, long j10) {
        C17542s.j(str, "tag");
        w0(str, j.b(Long.valueOf(j10)));
    }

    /* access modifiers changed from: protected */
    public void p0(String str) {
        C17542s.j(str, "tag");
        w0(str, JsonNull.INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void S(String str, short s10) {
        C17542s.j(str, "tag");
        w0(str, j.b(Short.valueOf(s10)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void T(String str, String str2) {
        C17542s.j(str, "tag");
        C17542s.j(str2, "value");
        w0(str, j.c(str2));
    }

    public abstract JsonElement s0();

    /* access modifiers changed from: protected */
    public final C17642l<JsonElement, C16807N> t0() {
        return this.f144503c;
    }

    public void v() {
    }

    public abstract void w0(String str, JsonElement jsonElement);

    public boolean z(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return this.f144504d.i();
    }

    private C17574e(C17514c cVar, C17642l<? super JsonElement, C16807N> lVar) {
        this.f144502b = cVar;
        this.f144503c = lVar;
        this.f144504d = cVar.g();
    }
}
