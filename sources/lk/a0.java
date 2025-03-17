package lK;

import XH.C16820k;
import com.optimizely.ab.config.FeatureVariable;
import fK.C17251d;
import hK.l;
import iK.C17392a;
import iK.C17394c;
import kK.C17514c;
import kK.C17518g;
import kK.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import mK.C17611d;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001^B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\u0017J\u000f\u00103\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u0011\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b6\u00107J=\u00109\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\b\u00108\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010!J\u000f\u0010<\u001a\u00020\u0012H\u0016¢\u0006\u0004\b<\u00104J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u001aH\u0016¢\u0006\u0004\bC\u0010\u001cJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0010H\u0016¢\u0006\u0004\bP\u0010'J\u0017\u0010R\u001a\u00020Q2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010YR\u0014\u0010\t\u001a\u00020\b8\u0000X\u0004¢\u0006\u0006\n\u0004\bW\u0010ZR\u001a\u0010`\u001a\u00020[8\u0016X\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0016\u0010a\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010>R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020d8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010eR\u0016\u0010i\u001a\u0004\u0018\u00010g8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010h¨\u0006j"}, d2 = {"LlK/a0;", "LkK/i;", "", "LiK/a;", "LkK/c;", "json", "LlK/k0;", "mode", "LlK/a;", "lexer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "LlK/a0$a;", "discriminatorHolder", "<init>", "(LkK/c;LlK/k0;LlK/a;Lkotlinx/serialization/descriptors/SerialDescriptor;LlK/a0$a;)V", "", "unknownKey", "", "T", "(LlK/a0$a;Ljava/lang/String;)Z", "LXH/N;", "S", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "L", "()V", "", "O", "()I", "index", "M", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "P", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "key", "R", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/String;)Z", "N", "Q", "()Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "h", "()Lkotlinx/serialization/json/JsonElement;", "LfK/d;", "deserializer", "E", "(LfK/d;)Ljava/lang/Object;", "LiK/c;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LiK/c;", "c", "F", "()Z", "", "k", "()Ljava/lang/Void;", "previousValue", "o", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILfK/d;Ljava/lang/Object;)Ljava/lang/Object;", "p", "x", "", "I", "()B", "", "t", "()S", "i", "", "m", "()J", "", "u", "()F", "", "w", "()D", "", "y", "()C", "z", "Lkotlinx/serialization/encoding/Decoder;", "r", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "enumDescriptor", "f", "LkK/c;", "d", "()LkK/c;", "LlK/k0;", "LlK/a;", "LmK/d;", "e", "LmK/d;", "a", "()LmK/d;", "serializersModule", "currentIndex", "g", "LlK/a0$a;", "LkK/g;", "LkK/g;", "configuration", "LlK/z;", "LlK/z;", "elementMarker", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a0 extends C17392a implements i {

    /* renamed from: b  reason: collision with root package name */
    private final C17514c f144475b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f144476c;

    /* renamed from: d  reason: collision with root package name */
    public final C17570a f144477d;

    /* renamed from: e  reason: collision with root package name */
    private final C17611d f144478e;

    /* renamed from: f  reason: collision with root package name */
    private int f144479f = -1;

    /* renamed from: g  reason: collision with root package name */
    private a f144480g;

    /* renamed from: h  reason: collision with root package name */
    private final C17518g f144481h;

    /* renamed from: i  reason: collision with root package name */
    private final C17594z f144482i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LlK/a0$a;", "", "", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f144483a;

        public a(String str) {
            this.f144483a = str;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f144484a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
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
                lK.k0 r1 = lK.k0.OBJ     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f144484a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lK.a0.b.<clinit>():void");
        }
    }

    public a0(C17514c cVar, k0 k0Var, C17570a aVar, SerialDescriptor serialDescriptor, a aVar2) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(k0Var, "mode");
        C17542s.j(aVar, "lexer");
        C17542s.j(serialDescriptor, "descriptor");
        this.f144475b = cVar;
        this.f144476c = k0Var;
        this.f144477d = aVar;
        this.f144478e = cVar.a();
        this.f144480g = aVar2;
        C17518g g10 = cVar.g();
        this.f144481h = g10;
        this.f144482i = g10.j() ? null : new C17594z(serialDescriptor);
    }

    private final void L() {
        if (this.f144477d.H() == 4) {
            C17570a.z(this.f144477d, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }

    private final boolean M(SerialDescriptor serialDescriptor, int i10) {
        String I10;
        C17514c cVar = this.f144475b;
        boolean j10 = serialDescriptor.j(i10);
        SerialDescriptor g10 = serialDescriptor.g(i10);
        if (j10 && !g10.b() && this.f144477d.P(true)) {
            return true;
        }
        if (C17542s.e(g10.h(), l.b.f143469a) && ((!g10.b() || !this.f144477d.P(false)) && (I10 = this.f144477d.I(this.f144481h.q())) != null)) {
            int i11 = C17567H.i(g10, cVar, I10);
            boolean z10 = !cVar.g().j() && g10.b();
            if (i11 == -3 && (j10 || z10)) {
                this.f144477d.q();
                return true;
            }
        }
        return false;
    }

    private final int N() {
        boolean O10 = this.f144477d.O();
        if (this.f144477d.f()) {
            int i10 = this.f144479f;
            if (i10 == -1 || O10) {
                int i11 = i10 + 1;
                this.f144479f = i11;
                return i11;
            }
            C17570a.z(this.f144477d, "Expected end of the array or comma", 0, (String) null, 6, (Object) null);
            throw new C16820k();
        } else if (!O10 || this.f144475b.g().d()) {
            return -1;
        } else {
            C17562C.g(this.f144477d, "array");
            throw new C16820k();
        }
    }

    private final int O() {
        int i10 = this.f144479f;
        boolean z10 = false;
        boolean z11 = i10 % 2 != 0;
        if (!z11) {
            this.f144477d.m(':');
        } else if (i10 != -1) {
            z10 = this.f144477d.O();
        }
        if (this.f144477d.f()) {
            if (z11) {
                if (this.f144479f == -1) {
                    C17570a aVar = this.f144477d;
                    int i11 = aVar.f144471a;
                    if (z10) {
                        C17570a.z(aVar, "Unexpected leading comma", i11, (String) null, 4, (Object) null);
                        throw new C16820k();
                    }
                } else {
                    C17570a aVar2 = this.f144477d;
                    int i12 = aVar2.f144471a;
                    if (!z10) {
                        C17570a.z(aVar2, "Expected comma after the key-value pair", i12, (String) null, 4, (Object) null);
                        throw new C16820k();
                    }
                }
            }
            int i13 = this.f144479f + 1;
            this.f144479f = i13;
            return i13;
        } else if (!z10 || this.f144475b.g().d()) {
            return -1;
        } else {
            C17562C.h(this.f144477d, (String) null, 1, (Object) null);
            throw new C16820k();
        }
    }

    private final int P(SerialDescriptor serialDescriptor) {
        int i10;
        boolean z10;
        boolean O10 = this.f144477d.O();
        while (true) {
            boolean z11 = true;
            if (this.f144477d.f()) {
                String Q10 = Q();
                this.f144477d.m(':');
                i10 = C17567H.i(serialDescriptor, this.f144475b, Q10);
                if (i10 == -3) {
                    z10 = false;
                } else if (!this.f144481h.g() || !M(serialDescriptor, i10)) {
                    C17594z zVar = this.f144482i;
                } else {
                    z10 = this.f144477d.O();
                    z11 = false;
                }
                O10 = z11 ? R(serialDescriptor, Q10) : z10;
            } else if (!O10 || this.f144475b.g().d()) {
                C17594z zVar2 = this.f144482i;
                if (zVar2 != null) {
                    return zVar2.d();
                }
                return -1;
            } else {
                C17562C.h(this.f144477d, (String) null, 1, (Object) null);
                throw new C16820k();
            }
        }
        C17594z zVar3 = this.f144482i;
        if (zVar3 != null) {
            zVar3.c(i10);
        }
        return i10;
    }

    private final String Q() {
        return this.f144481h.q() ? this.f144477d.t() : this.f144477d.j();
    }

    private final boolean R(SerialDescriptor serialDescriptor, String str) {
        if (C17567H.m(serialDescriptor, this.f144475b) || T(this.f144480g, str)) {
            this.f144477d.K(this.f144481h.q());
        } else {
            this.f144477d.f144472b.b();
            this.f144477d.A(str);
        }
        return this.f144477d.O();
    }

    private final void S(SerialDescriptor serialDescriptor) {
        do {
        } while (p(serialDescriptor) != -1);
    }

    private final boolean T(a aVar, String str) {
        if (aVar == null || !C17542s.e(aVar.f144483a, str)) {
            return false;
        }
        aVar.f144483a = null;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        r4 = kK.j.j(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T E(fK.C17251d<? extends T> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 2
            r1 = 0
            boolean r2 = r12 instanceof jK.C17443b     // Catch:{ e -> 0x0080 }
            if (r2 == 0) goto L_0x0144
            kK.c r2 = r11.f144475b     // Catch:{ e -> 0x0080 }
            kK.g r2 = r2.g()     // Catch:{ e -> 0x0080 }
            boolean r2 = r2.p()     // Catch:{ e -> 0x0080 }
            if (r2 == 0) goto L_0x0019
            goto L_0x0144
        L_0x0019:
            r2 = r12
            jK.b r2 = (jK.C17443b) r2     // Catch:{ e -> 0x0080 }
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.getDescriptor()     // Catch:{ e -> 0x0080 }
            kK.c r3 = r11.f144475b     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = lK.W.c(r2, r3)     // Catch:{ e -> 0x0080 }
            lK.a r3 = r11.f144477d     // Catch:{ e -> 0x0080 }
            kK.g r4 = r11.f144481h     // Catch:{ e -> 0x0080 }
            boolean r4 = r4.q()     // Catch:{ e -> 0x0080 }
            java.lang.String r3 = r3.G(r2, r4)     // Catch:{ e -> 0x0080 }
            if (r3 != 0) goto L_0x00fe
            boolean r2 = r12 instanceof jK.C17443b     // Catch:{ e -> 0x0080 }
            if (r2 == 0) goto L_0x00f9
            kK.c r2 = r11.d()     // Catch:{ e -> 0x0080 }
            kK.g r2 = r2.g()     // Catch:{ e -> 0x0080 }
            boolean r2 = r2.p()     // Catch:{ e -> 0x0080 }
            if (r2 == 0) goto L_0x0048
            goto L_0x00f9
        L_0x0048:
            r2 = r12
            jK.b r2 = (jK.C17443b) r2     // Catch:{ e -> 0x0080 }
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.getDescriptor()     // Catch:{ e -> 0x0080 }
            kK.c r3 = r11.d()     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = lK.W.c(r2, r3)     // Catch:{ e -> 0x0080 }
            kotlinx.serialization.json.JsonElement r3 = r11.h()     // Catch:{ e -> 0x0080 }
            r4 = r12
            jK.b r4 = (jK.C17443b) r4     // Catch:{ e -> 0x0080 }
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r4.getDescriptor()     // Catch:{ e -> 0x0080 }
            java.lang.String r4 = r4.i()     // Catch:{ e -> 0x0080 }
            boolean r5 = r3 instanceof kotlinx.serialization.json.JsonObject     // Catch:{ e -> 0x0080 }
            r6 = -1
            if (r5 == 0) goto L_0x00a9
            kotlinx.serialization.json.JsonObject r3 = (kotlinx.serialization.json.JsonObject) r3     // Catch:{ e -> 0x0080 }
            java.lang.Object r4 = r3.get(r2)     // Catch:{ e -> 0x0080 }
            kotlinx.serialization.json.JsonElement r4 = (kotlinx.serialization.json.JsonElement) r4     // Catch:{ e -> 0x0080 }
            if (r4 == 0) goto L_0x0083
            kotlinx.serialization.json.JsonPrimitive r4 = kK.j.j(r4)     // Catch:{ e -> 0x0080 }
            if (r4 == 0) goto L_0x0083
            java.lang.String r4 = kK.j.f(r4)     // Catch:{ e -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r12 = move-exception
            goto L_0x0149
        L_0x0083:
            r4 = r1
        L_0x0084:
            jK.b r12 = (jK.C17443b) r12     // Catch:{ q -> 0x0098 }
            fK.d r12 = fK.C17257j.a(r12, r11, r4)     // Catch:{ q -> 0x0098 }
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>"
            kotlin.jvm.internal.C17542s.h(r12, r4)     // Catch:{ e -> 0x0080 }
            kK.c r4 = r11.d()     // Catch:{ e -> 0x0080 }
            java.lang.Object r12 = lK.h0.b(r4, r2, r3, r12)     // Catch:{ e -> 0x0080 }
            goto L_0x00fd
        L_0x0098:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()     // Catch:{ e -> 0x0080 }
            kotlin.jvm.internal.C17542s.g(r12)     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = r3.toString()     // Catch:{ e -> 0x0080 }
            lK.y r12 = lK.C17562C.f(r6, r12, r2)     // Catch:{ e -> 0x0080 }
            throw r12     // Catch:{ e -> 0x0080 }
        L_0x00a9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ e -> 0x0080 }
            r12.<init>()     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = "Expected "
            r12.append(r2)     // Catch:{ e -> 0x0080 }
            java.lang.Class<kotlinx.serialization.json.JsonObject> r2 = kotlinx.serialization.json.JsonObject.class
            uI.d r2 = kotlin.jvm.internal.P.b(r2)     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = r2.f()     // Catch:{ e -> 0x0080 }
            r12.append(r2)     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = ", but had "
            r12.append(r2)     // Catch:{ e -> 0x0080 }
            java.lang.Class r2 = r3.getClass()     // Catch:{ e -> 0x0080 }
            uI.d r2 = kotlin.jvm.internal.P.b(r2)     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = r2.f()     // Catch:{ e -> 0x0080 }
            r12.append(r2)     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = " as the serialized body of "
            r12.append(r2)     // Catch:{ e -> 0x0080 }
            r12.append(r4)     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = " at element: "
            r12.append(r2)     // Catch:{ e -> 0x0080 }
            lK.a r2 = r11.f144477d     // Catch:{ e -> 0x0080 }
            lK.I r2 = r2.f144472b     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = r2.a()     // Catch:{ e -> 0x0080 }
            r12.append(r2)     // Catch:{ e -> 0x0080 }
            java.lang.String r12 = r12.toString()     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = r3.toString()     // Catch:{ e -> 0x0080 }
            lK.y r12 = lK.C17562C.f(r6, r12, r2)     // Catch:{ e -> 0x0080 }
            throw r12     // Catch:{ e -> 0x0080 }
        L_0x00f9:
            java.lang.Object r12 = r12.deserialize(r11)     // Catch:{ e -> 0x0080 }
        L_0x00fd:
            return r12
        L_0x00fe:
            jK.b r12 = (jK.C17443b) r12     // Catch:{ q -> 0x0115 }
            fK.d r12 = fK.C17257j.a(r12, r11, r3)     // Catch:{ q -> 0x0115 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>"
            kotlin.jvm.internal.C17542s.h(r12, r3)     // Catch:{ e -> 0x0080 }
            lK.a0$a r3 = new lK.a0$a     // Catch:{ e -> 0x0080 }
            r3.<init>(r2)     // Catch:{ e -> 0x0080 }
            r11.f144480g = r3     // Catch:{ e -> 0x0080 }
            java.lang.Object r12 = r12.deserialize(r11)     // Catch:{ e -> 0x0080 }
            return r12
        L_0x0115:
            r12 = move-exception
            java.lang.String r2 = r12.getMessage()     // Catch:{ e -> 0x0080 }
            kotlin.jvm.internal.C17542s.g(r2)     // Catch:{ e -> 0x0080 }
            r3 = 10
            java.lang.String r2 = HJ.C15854t.s1(r2, r3, r1, r0, r1)     // Catch:{ e -> 0x0080 }
            java.lang.String r4 = "."
            java.lang.String r6 = HJ.C15854t.P0(r2, r4)     // Catch:{ e -> 0x0080 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ e -> 0x0080 }
            kotlin.jvm.internal.C17542s.g(r12)     // Catch:{ e -> 0x0080 }
            java.lang.String r2 = ""
            java.lang.String r8 = HJ.C15854t.i1(r12, r3, r2)     // Catch:{ e -> 0x0080 }
            lK.a r5 = r11.f144477d     // Catch:{ e -> 0x0080 }
            r9 = 2
            r10 = 0
            r7 = 0
            lK.C17570a.z(r5, r6, r7, r8, r9, r10)     // Catch:{ e -> 0x0080 }
            XH.k r12 = new XH.k     // Catch:{ e -> 0x0080 }
            r12.<init>()     // Catch:{ e -> 0x0080 }
            throw r12     // Catch:{ e -> 0x0080 }
        L_0x0144:
            java.lang.Object r12 = r12.deserialize(r11)     // Catch:{ e -> 0x0080 }
            return r12
        L_0x0149:
            java.lang.String r2 = r12.getMessage()
            kotlin.jvm.internal.C17542s.g(r2)
            java.lang.String r3 = "at path"
            r4 = 0
            boolean r0 = HJ.C15854t.d0(r2, r3, r4, r0, r1)
            if (r0 == 0) goto L_0x015a
            throw r12
        L_0x015a:
            fK.e r0 = new fK.e
            java.util.List r1 = r12.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.getMessage()
            r2.append(r3)
            java.lang.String r3 = " at path: "
            r2.append(r3)
            lK.a r3 = r11.f144477d
            lK.I r3 = r3.f144472b
            java.lang.String r3 = r3.a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.a0.E(fK.d):java.lang.Object");
    }

    public boolean F() {
        C17594z zVar = this.f144482i;
        return !(zVar != null ? zVar.b() : false) && !C17570a.Q(this.f144477d, false, 1, (Object) null);
    }

    public byte I() {
        long n10 = this.f144477d.n();
        byte b10 = (byte) ((int) n10);
        if (n10 == ((long) b10)) {
            return b10;
        }
        C17570a aVar = this.f144477d;
        C17570a.z(aVar, "Failed to parse byte for input '" + n10 + '\'', 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    public C17611d a() {
        return this.f144478e;
    }

    public C17394c b(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        k0 b10 = l0.b(this.f144475b, serialDescriptor);
        this.f144477d.f144472b.c(serialDescriptor);
        this.f144477d.m(b10.begin);
        L();
        int i10 = b.f144484a[b10.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new a0(this.f144475b, b10, this.f144477d, serialDescriptor, this.f144480g);
        } else if (this.f144476c == b10 && this.f144475b.g().j()) {
            return this;
        } else {
            return new a0(this.f144475b, b10, this.f144477d, serialDescriptor, this.f144480g);
        }
    }

    public void c(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        if (serialDescriptor.d() == 0 && C17567H.m(serialDescriptor, this.f144475b)) {
            S(serialDescriptor);
        }
        if (!this.f144477d.O() || this.f144475b.g().d()) {
            this.f144477d.m(this.f144476c.end);
            this.f144477d.f144472b.b();
            return;
        }
        C17562C.g(this.f144477d, "");
        throw new C16820k();
    }

    public final C17514c d() {
        return this.f144475b;
    }

    public int f(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "enumDescriptor");
        C17514c cVar = this.f144475b;
        String z10 = z();
        return C17567H.j(serialDescriptor, cVar, z10, " at path " + this.f144477d.f144472b.a());
    }

    public JsonElement h() {
        return new V(this.f144475b.g(), this.f144477d).e();
    }

    public int i() {
        long n10 = this.f144477d.n();
        int i10 = (int) n10;
        if (n10 == ((long) i10)) {
            return i10;
        }
        C17570a aVar = this.f144477d;
        C17570a.z(aVar, "Failed to parse int for input '" + n10 + '\'', 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    public Void k() {
        return null;
    }

    public long m() {
        return this.f144477d.n();
    }

    public <T> T o(SerialDescriptor serialDescriptor, int i10, C17251d<? extends T> dVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(dVar, "deserializer");
        boolean z10 = this.f144476c == k0.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f144477d.f144472b.d();
        }
        T o10 = super.o(serialDescriptor, i10, dVar, t10);
        if (z10) {
            this.f144477d.f144472b.f(o10);
        }
        return o10;
    }

    public int p(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        int i10 = b.f144484a[this.f144476c.ordinal()];
        int N10 = i10 != 2 ? i10 != 4 ? N() : P(serialDescriptor) : O();
        if (this.f144476c != k0.MAP) {
            this.f144477d.f144472b.g(N10);
        }
        return N10;
    }

    public Decoder r(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return c0.b(serialDescriptor) ? new C17592x(this.f144477d, this.f144475b) : super.r(serialDescriptor);
    }

    public short t() {
        long n10 = this.f144477d.n();
        short s10 = (short) ((int) n10);
        if (n10 == ((long) s10)) {
            return s10;
        }
        C17570a aVar = this.f144477d;
        C17570a.z(aVar, "Failed to parse short for input '" + n10 + '\'', 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    public float u() {
        C17570a aVar = this.f144477d;
        String s10 = aVar.s();
        try {
            float parseFloat = Float.parseFloat(s10);
            if (this.f144475b.g().b() || (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            C17562C.k(this.f144477d, Float.valueOf(parseFloat));
            throw new C16820k();
        } catch (IllegalArgumentException unused) {
            C17570a.z(aVar, "Failed to parse type '" + "float" + "' for input '" + s10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }

    public double w() {
        C17570a aVar = this.f144477d;
        String s10 = aVar.s();
        try {
            double parseDouble = Double.parseDouble(s10);
            if (this.f144475b.g().b() || (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            C17562C.k(this.f144477d, Double.valueOf(parseDouble));
            throw new C16820k();
        } catch (IllegalArgumentException unused) {
            C17570a.z(aVar, "Failed to parse type '" + FeatureVariable.DOUBLE_TYPE + "' for input '" + s10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }

    public boolean x() {
        return this.f144477d.h();
    }

    public char y() {
        String s10 = this.f144477d.s();
        if (s10.length() == 1) {
            return s10.charAt(0);
        }
        C17570a aVar = this.f144477d;
        C17570a.z(aVar, "Expected single char, but got '" + s10 + '\'', 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    public String z() {
        return this.f144481h.q() ? this.f144477d.t() : this.f144477d.q();
    }
}
