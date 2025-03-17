package kK;

import com.optimizely.ab.config.FeatureVariable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mK.C17611d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\n\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR(\u0010&\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR\"\u0010,\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R(\u00104\u001a\u00020-8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010.\u0012\u0004\b3\u0010%\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\n\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u000eR(\u0010<\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b8\u0010\n\u0012\u0004\b;\u0010%\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000eR(\u0010A\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b=\u0010\n\u0012\u0004\b@\u0010%\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR(\u0010F\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\bB\u0010\n\u0012\u0004\bE\u0010%\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000eR\"\u0010I\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u0010L\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\f\"\u0004\b\u0018\u0010\u000eR\"\u0010O\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\f\"\u0004\b=\u0010\u000eR\"\u0010U\u001a\u00020P8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\b\u0010\u0010S\"\u0004\b8\u0010T¨\u0006V"}, d2 = {"LkK/e;", "", "LkK/c;", "json", "<init>", "(LkK/c;)V", "LkK/g;", "a", "()LkK/g;", "", "Z", "getEncodeDefaults", "()Z", "e", "(Z)V", "encodeDefaults", "b", "getExplicitNulls", "f", "explicitNulls", "c", "getIgnoreUnknownKeys", "g", "ignoreUnknownKeys", "d", "isLenient", "h", "getPrettyPrint", "i", "prettyPrint", "", "Ljava/lang/String;", "getPrettyPrintIndent", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "getPrettyPrintIndent$annotations", "()V", "prettyPrintIndent", "getCoerceInputValues", "setCoerceInputValues", "coerceInputValues", "getClassDiscriminator", "setClassDiscriminator", "classDiscriminator", "LkK/a;", "LkK/a;", "getClassDiscriminatorMode", "()LkK/a;", "setClassDiscriminatorMode", "(LkK/a;)V", "getClassDiscriminatorMode$annotations", "classDiscriminatorMode", "getUseAlternativeNames", "setUseAlternativeNames", "useAlternativeNames", "k", "getDecodeEnumsCaseInsensitive", "setDecodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "decodeEnumsCaseInsensitive", "l", "getAllowTrailingComma", "setAllowTrailingComma", "getAllowTrailingComma$annotations", "allowTrailingComma", "m", "getAllowComments", "setAllowComments", "getAllowComments$annotations", "allowComments", "n", "getAllowSpecialFloatingPointValues", "allowSpecialFloatingPointValues", "o", "getAllowStructuredMapKeys", "allowStructuredMapKeys", "p", "getUseArrayPolymorphism", "useArrayPolymorphism", "LmK/d;", "q", "LmK/d;", "()LmK/d;", "(LmK/d;)V", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kK.e  reason: case insensitive filesystem */
public final class C17516e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f144289a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f144290b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f144291c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f144292d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f144293e;

    /* renamed from: f  reason: collision with root package name */
    private String f144294f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f144295g;

    /* renamed from: h  reason: collision with root package name */
    private String f144296h;

    /* renamed from: i  reason: collision with root package name */
    private C17512a f144297i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f144298j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f144299k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f144300l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f144301m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f144302n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f144303o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f144304p;

    /* renamed from: q  reason: collision with root package name */
    private C17611d f144305q;

    public C17516e(C17514c cVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f144289a = cVar.g().i();
        this.f144290b = cVar.g().j();
        this.f144291c = cVar.g().k();
        this.f144292d = cVar.g().q();
        this.f144293e = cVar.g().m();
        this.f144294f = cVar.g().n();
        this.f144295g = cVar.g().g();
        this.f144296h = cVar.g().e();
        this.f144297i = cVar.g().f();
        this.f144298j = cVar.g().o();
        cVar.g().l();
        this.f144299k = cVar.g().h();
        this.f144300l = cVar.g().d();
        this.f144301m = cVar.g().a();
        this.f144302n = cVar.g().b();
        this.f144303o = cVar.g().c();
        this.f144304p = cVar.g().p();
        this.f144305q = cVar.a();
    }

    public final C17518g a() {
        if (this.f144304p) {
            if (!C17542s.e(this.f144296h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            } else if (this.f144297i != C17512a.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (!this.f144293e) {
            if (!C17542s.e(this.f144294f, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        } else if (!C17542s.e(this.f144294f, "    ")) {
            String str = this.f144294f;
            int i10 = 0;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if (charAt == ' ' || charAt == 9 || charAt == 13 || charAt == 10) {
                    i10++;
                } else {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f144294f).toString());
                }
            }
        }
        return new C17518g(this.f144289a, this.f144291c, this.f144292d, this.f144303o, this.f144293e, this.f144290b, this.f144294f, this.f144295g, this.f144304p, this.f144296h, this.f144302n, this.f144298j, (z) null, this.f144299k, this.f144300l, this.f144301m, this.f144297i);
    }

    public final C17611d b() {
        return this.f144305q;
    }

    public final void c(boolean z10) {
        this.f144302n = z10;
    }

    public final void d(boolean z10) {
        this.f144303o = z10;
    }

    public final void e(boolean z10) {
        this.f144289a = z10;
    }

    public final void f(boolean z10) {
        this.f144290b = z10;
    }

    public final void g(boolean z10) {
        this.f144291c = z10;
    }

    public final void h(boolean z10) {
        this.f144292d = z10;
    }

    public final void i(boolean z10) {
        this.f144293e = z10;
    }

    public final void j(String str) {
        C17542s.j(str, "<set-?>");
        this.f144294f = str;
    }

    public final void k(C17611d dVar) {
        C17542s.j(dVar, "<set-?>");
        this.f144305q = dVar;
    }

    public final void l(boolean z10) {
        this.f144304p = z10;
    }
}
