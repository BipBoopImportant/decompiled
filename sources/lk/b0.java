package lK;

import XH.C16820k;
import com.optimizely.ab.config.FeatureVariable;
import fK.r;
import iK.C17393b;
import kK.C17514c;
import kK.C17518g;
import kK.q;
import kK.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import mK.C17611d;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020\u0013\"\u0004\b\u0000\u0010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010$\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b,\u0010 JA\u0010.\u001a\u00020\u0013\"\b\b\u0000\u0010!*\u00020-2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\b\u0010$\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00132\u0006\u0010$\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010$\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00132\u0006\u0010$\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00132\u0006\u0010$\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00132\u0006\u0010$\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00132\u0006\u0010$\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010UR\u001e\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010VR\u001a\u0010[\u001a\u00020W8\u0016X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bP\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010]R\u0016\u0010`\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010b¨\u0006f"}, d2 = {"LlK/b0;", "LkK/s;", "LiK/b;", "LlK/n;", "composer", "LkK/c;", "json", "LlK/k0;", "mode", "", "modeReuseCache", "<init>", "(LlK/n;LkK/c;LlK/k0;[LkK/s;)V", "LlK/v;", "output", "(LlK/v;LkK/c;LlK/k0;[LkK/s;)V", "", "discriminator", "serialName", "LXH/N;", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlinx/serialization/json/JsonElement;", "element", "A", "(Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "z", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "T", "LfK/r;", "serializer", "value", "n", "(LfK/r;Ljava/lang/Object;)V", "LiK/d;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LiK/d;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "I", "", "B", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILfK/r;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "k", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "o", "()V", "r", "(Z)V", "", "g", "(B)V", "", "q", "(S)V", "C", "(I)V", "", "l", "(J)V", "", "t", "(F)V", "", "f", "(D)V", "", "u", "(C)V", "G", "(Ljava/lang/String;)V", "enumDescriptor", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "a", "LlK/n;", "LkK/c;", "d", "()LkK/c;", "LlK/k0;", "[LkK/s;", "LmK/d;", "e", "LmK/d;", "()LmK/d;", "serializersModule", "LkK/g;", "LkK/g;", "configuration", "Z", "forceQuoting", "h", "Ljava/lang/String;", "polymorphicDiscriminator", "i", "polymorphicSerialName", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 extends C17393b implements s {

    /* renamed from: a  reason: collision with root package name */
    private final C17583n f144485a;

    /* renamed from: b  reason: collision with root package name */
    private final C17514c f144486b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f144487c;

    /* renamed from: d  reason: collision with root package name */
    private final s[] f144488d;

    /* renamed from: e  reason: collision with root package name */
    private final C17611d f144489e;

    /* renamed from: f  reason: collision with root package name */
    private final C17518g f144490f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f144491g;

    /* renamed from: h  reason: collision with root package name */
    private String f144492h;

    /* renamed from: i  reason: collision with root package name */
    private String f144493i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f144494a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                lK.k0[] r0 = lK.k0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                lK.k0 r1 = lK.k0.LIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                lK.k0 r1 = lK.k0.MAP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                lK.k0 r1 = lK.k0.POLY_OBJ     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f144494a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lK.b0.a.<clinit>():void");
        }
    }

    public b0(C17583n nVar, C17514c cVar, k0 k0Var, s[] sVarArr) {
        C17542s.j(nVar, "composer");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(k0Var, "mode");
        this.f144485a = nVar;
        this.f144486b = cVar;
        this.f144487c = k0Var;
        this.f144488d = sVarArr;
        this.f144489e = d().a();
        this.f144490f = d().g();
        int ordinal = k0Var.ordinal();
        if (sVarArr != null) {
            s sVar = sVarArr[ordinal];
            if (sVar != null || sVar != this) {
                sVarArr[ordinal] = this;
            }
        }
    }

    private final void K(String str, String str2) {
        this.f144485a.c();
        G(str);
        this.f144485a.f(':');
        this.f144485a.p();
        G(str2);
    }

    public void A(JsonElement jsonElement) {
        C17542s.j(jsonElement, "element");
        if (this.f144492h == null || (jsonElement instanceof JsonObject)) {
            n(q.f144325a, jsonElement);
        } else {
            W.d(this.f144493i, jsonElement);
            throw new C16820k();
        }
    }

    public <T> void B(SerialDescriptor serialDescriptor, int i10, r<? super T> rVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(rVar, "serializer");
        if (t10 != null || this.f144490f.j()) {
            super.B(serialDescriptor, i10, rVar, t10);
        }
    }

    public void C(int i10) {
        if (this.f144491g) {
            G(String.valueOf(i10));
        } else {
            this.f144485a.i(i10);
        }
    }

    public void G(String str) {
        C17542s.j(str, "value");
        this.f144485a.n(str);
    }

    public boolean I(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        int i11 = a.f144494a[this.f144487c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f144485a.a()) {
                        this.f144485a.f(',');
                    }
                    this.f144485a.c();
                    G(C17567H.h(serialDescriptor, d(), i10));
                    this.f144485a.f(':');
                    this.f144485a.p();
                } else {
                    if (i10 == 0) {
                        this.f144491g = true;
                    }
                    if (i10 == 1) {
                        this.f144485a.f(',');
                        this.f144485a.p();
                        this.f144491g = false;
                    }
                }
            } else if (!this.f144485a.a()) {
                if (i10 % 2 == 0) {
                    this.f144485a.f(',');
                    this.f144485a.c();
                    z10 = true;
                } else {
                    this.f144485a.f(':');
                    this.f144485a.p();
                }
                this.f144491g = z10;
            } else {
                this.f144491g = true;
                this.f144485a.c();
            }
        } else {
            if (!this.f144485a.a()) {
                this.f144485a.f(',');
            }
            this.f144485a.c();
        }
        return true;
    }

    public C17611d a() {
        return this.f144489e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r5 = r5[r0.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public iK.C17395d b(kotlinx.serialization.descriptors.SerialDescriptor r5) {
        /*
            r4 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            kK.c r0 = r4.d()
            lK.k0 r0 = lK.l0.b(r0, r5)
            char r1 = r0.begin
            if (r1 == 0) goto L_0x001b
            lK.n r2 = r4.f144485a
            r2.f(r1)
            lK.n r1 = r4.f144485a
            r1.b()
        L_0x001b:
            java.lang.String r1 = r4.f144492h
            if (r1 == 0) goto L_0x002f
            java.lang.String r2 = r4.f144493i
            if (r2 != 0) goto L_0x0027
            java.lang.String r2 = r5.i()
        L_0x0027:
            r4.K(r1, r2)
            r5 = 0
            r4.f144492h = r5
            r4.f144493i = r5
        L_0x002f:
            lK.k0 r5 = r4.f144487c
            if (r5 != r0) goto L_0x0034
            return r4
        L_0x0034:
            kK.s[] r5 = r4.f144488d
            if (r5 == 0) goto L_0x0041
            int r1 = r0.ordinal()
            r5 = r5[r1]
            if (r5 == 0) goto L_0x0041
            goto L_0x004e
        L_0x0041:
            lK.b0 r5 = new lK.b0
            lK.n r1 = r4.f144485a
            kK.c r2 = r4.d()
            kK.s[] r3 = r4.f144488d
            r5.<init>((lK.C17583n) r1, (kK.C17514c) r2, (lK.k0) r0, (kK.s[]) r3)
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.b0.b(kotlinx.serialization.descriptors.SerialDescriptor):iK.d");
    }

    public void c(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        if (this.f144487c.end != 0) {
            this.f144485a.q();
            this.f144485a.d();
            this.f144485a.f(this.f144487c.end);
        }
    }

    public C17514c d() {
        return this.f144486b;
    }

    public void f(double d10) {
        if (this.f144491g) {
            G(String.valueOf(d10));
        } else {
            this.f144485a.g(d10);
        }
        if (this.f144490f.b()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw C17562C.b(Double.valueOf(d10), this.f144485a.f144534a.toString());
        }
    }

    public void g(byte b10) {
        if (this.f144491g) {
            G(String.valueOf(b10));
        } else {
            this.f144485a.e(b10);
        }
    }

    public void j(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "enumDescriptor");
        G(serialDescriptor.e(i10));
    }

    public Encoder k(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        if (c0.b(serialDescriptor)) {
            C17583n nVar = this.f144485a;
            if (!(nVar instanceof C17585p)) {
                nVar = new C17585p(nVar.f144534a, this.f144491g);
            }
            return new b0(nVar, d(), this.f144487c, (s[]) null);
        } else if (c0.a(serialDescriptor)) {
            C17583n nVar2 = this.f144485a;
            if (!(nVar2 instanceof C17584o)) {
                nVar2 = new C17584o(nVar2.f144534a, this.f144491g);
            }
            return new b0(nVar2, d(), this.f144487c, (s[]) null);
        } else if (this.f144492h == null) {
            return super.k(serialDescriptor);
        } else {
            this.f144493i = serialDescriptor.i();
            return this;
        }
    }

    public void l(long j10) {
        if (this.f144491g) {
            G(String.valueOf(j10));
        } else {
            this.f144485a.j(j10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (kotlin.jvm.internal.C17542s.e(r1, hK.m.d.f143473a) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (d().g().f() != kK.C17512a.NONE) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void n(fK.r<? super T> r4, T r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            kK.c r0 = r3.d()
            kK.g r0 = r0.g()
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x0018
            r4.serialize(r3, r5)
            goto L_0x00cd
        L_0x0018:
            boolean r0 = r4 instanceof jK.C17443b
            if (r0 == 0) goto L_0x002d
            kK.c r1 = r3.d()
            kK.g r1 = r1.g()
            kK.a r1 = r1.f()
            kK.a r2 = kK.C17512a.NONE
            if (r1 == r2) goto L_0x0075
            goto L_0x0062
        L_0x002d:
            kK.c r1 = r3.d()
            kK.g r1 = r1.g()
            kK.a r1 = r1.f()
            int[] r2 = lK.W.a.f144466a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x0075
            r2 = 2
            if (r1 == r2) goto L_0x0075
            r2 = 3
            if (r1 != r2) goto L_0x006f
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            hK.l r1 = r1.h()
            hK.m$a r2 = hK.m.a.f143470a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r2 != 0) goto L_0x0062
            hK.m$d r2 = hK.m.d.f143473a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r1 == 0) goto L_0x0075
        L_0x0062:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kK.c r2 = r3.d()
            java.lang.String r1 = lK.W.c(r1, r2)
            goto L_0x0076
        L_0x006f:
            XH.t r4 = new XH.t
            r4.<init>()
            throw r4
        L_0x0075:
            r1 = 0
        L_0x0076:
            if (r0 == 0) goto L_0x00bc
            r0 = r4
            jK.b r0 = (jK.C17443b) r0
            if (r5 == 0) goto L_0x0098
            fK.r r0 = fK.C17257j.b(r0, r3, r5)
            if (r1 == 0) goto L_0x0091
            lK.W.e(r4, r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r0.getDescriptor()
            hK.l r4 = r4.h()
            lK.W.b(r4)
        L_0x0091:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.C17542s.h(r0, r4)
            r4 = r0
            goto L_0x00bc
        L_0x0098:
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
        L_0x00bc:
            if (r1 == 0) goto L_0x00ca
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getDescriptor()
            java.lang.String r0 = r0.i()
            r3.f144492h = r1
            r3.f144493i = r0
        L_0x00ca:
            r4.serialize(r3, r5)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.b0.n(fK.r, java.lang.Object):void");
    }

    public void o() {
        this.f144485a.k("null");
    }

    public void q(short s10) {
        if (this.f144491g) {
            G(String.valueOf(s10));
        } else {
            this.f144485a.l(s10);
        }
    }

    public void r(boolean z10) {
        if (this.f144491g) {
            G(String.valueOf(z10));
        } else {
            this.f144485a.m(z10);
        }
    }

    public void t(float f10) {
        if (this.f144491g) {
            G(String.valueOf(f10));
        } else {
            this.f144485a.h(f10);
        }
        if (this.f144490f.b()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw C17562C.b(Float.valueOf(f10), this.f144485a.f144534a.toString());
        }
    }

    public void u(char c10) {
        G(String.valueOf(c10));
    }

    public boolean z(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return this.f144490f.i();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b0(C17590v vVar, C17514c cVar, k0 k0Var, s[] sVarArr) {
        this(r.a(vVar, cVar), cVar, k0Var, sVarArr);
        C17542s.j(vVar, "output");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(k0Var, "mode");
        C17542s.j(sVarArr, "modeReuseCache");
    }
}
