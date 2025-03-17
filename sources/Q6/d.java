package Q6;

import Q6.f;
import R6.b;
import S6.f;
import S6.g;
import WK.C16770e;
import WK.C16772g;
import WK.C16773h;
import XH.C16820k;
import YH.C16877v;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.io.EOFException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 H2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0001H\u0016¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020\u0001H\u0016¢\u0006\u0004\b,\u0010)J\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u0010\u0015J\u0011\u00103\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b3\u0010\u0015J\u000f\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010.J\u0011\u00105\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\bJ\u000f\u0010A\u001a\u00020\u0016H\u0016¢\u0006\u0004\bA\u0010\u001aJ\u000f\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010\u001aJ\u001d\u0010E\u001a\u00020\u00062\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110CH\u0016¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\b\u0012\u0004\u0012\u00020G0CH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010QR\u0016\u0010T\u001a\u00020:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010SR\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010QR\u0018\u0010W\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010YR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010QR\u001c\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\\8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010]R\u0014\u0010`\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010YR\u0014\u0010b\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010YR\u0016\u0010c\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010Q¨\u0006d"}, d2 = {"LQ6/d;", "LQ6/f;", "LWK/g;", "source", "<init>", "(LWK/g;)V", "", "c", "()I", "i", "l", "", "", "e", "(C)Z", "LWK/h;", "runTerminator", "", "g", "(LWK/h;)Ljava/lang/String;", "h", "()Ljava/lang/String;", "LXH/N;", "q", "(LWK/h;)V", "s", "()V", "newTop", "n", "(I)V", "throwOnEof", "f", "(Z)I", "d", "o", "()C", "message", "", "t", "(Ljava/lang/String;)Ljava/lang/Void;", "G", "()LQ6/f;", "E", "C", "K", "hasNext", "()Z", "LQ6/f$a;", "O", "()LQ6/f$a;", "B0", "C1", "w1", "v2", "()Ljava/lang/Void;", "", "d2", "()D", "", "U2", "()J", "LQ6/e;", "R2", "()LQ6/e;", "G0", "close", "a0", "", "names", "T2", "(Ljava/util/List;)I", "", "m", "()Ljava/util/List;", "D", "a", "LWK/g;", "LWK/e;", "b", "LWK/e;", "buffer", "I", "peeked", "J", "peekedLong", "peekedNumberLength", "Ljava/lang/String;", "peekedString", "", "[I", "stack", "stackSize", "", "[Ljava/lang/String;", "pathNames", "j", "pathIndices", "k", "indexStack", "indexStackSize", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final a f39594m = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private static final C16773h f39595n;

    /* renamed from: o  reason: collision with root package name */
    private static final C16773h f39596o;

    /* renamed from: p  reason: collision with root package name */
    private static final C16773h f39597p;

    /* renamed from: a  reason: collision with root package name */
    private final C16772g f39598a;

    /* renamed from: b  reason: collision with root package name */
    private final C16770e f39599b;

    /* renamed from: c  reason: collision with root package name */
    private int f39600c;

    /* renamed from: d  reason: collision with root package name */
    private long f39601d;

    /* renamed from: e  reason: collision with root package name */
    private int f39602e;

    /* renamed from: f  reason: collision with root package name */
    private String f39603f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f39604g;

    /* renamed from: h  reason: collision with root package name */
    private int f39605h = 1;

    /* renamed from: i  reason: collision with root package name */
    private final String[] f39606i = new String[256];

    /* renamed from: j  reason: collision with root package name */
    private final int[] f39607j = new int[256];

    /* renamed from: k  reason: collision with root package name */
    private final int[] f39608k;

    /* renamed from: l  reason: collision with root package name */
    private int f39609l;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0014\u0010\u0017\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\tR\u0014\u0010\u0019\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\tR\u0014\u0010\u001b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\tR\u0014\u0010\u001c\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\tR\u0014\u0010\u001d\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\tR\u0014\u0010\u001e\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\tR\u0014\u0010\u001f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b \u0010\tR\u0014\u0010!\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\tR\u0014\u0010\"\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010\tR\u0014\u0010#\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b#\u0010\tR\u0014\u0010$\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b$\u0010\tR\u0014\u0010%\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b%\u0010\tR\u0014\u0010&\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b&\u0010\tR\u0014\u0010'\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0006¨\u0006)"}, d2 = {"LQ6/d$a;", "", "<init>", "()V", "LWK/h;", "DOUBLE_QUOTE_OR_SLASH", "LWK/h;", "", "MAX_STACK_SIZE", "I", "", "MIN_INCOMPLETE_INTEGER", "J", "NUMBER_CHAR_DECIMAL", "NUMBER_CHAR_DIGIT", "NUMBER_CHAR_EXP_DIGIT", "NUMBER_CHAR_EXP_E", "NUMBER_CHAR_EXP_SIGN", "NUMBER_CHAR_FRACTION_DIGIT", "NUMBER_CHAR_NONE", "NUMBER_CHAR_SIGN", "PEEKED_BEGIN_ARRAY", "PEEKED_BEGIN_OBJECT", "PEEKED_BUFFERED", "PEEKED_DOUBLE_QUOTED", "PEEKED_DOUBLE_QUOTED_NAME", "PEEKED_END_ARRAY", "PEEKED_END_OBJECT", "PEEKED_EOF", "PEEKED_FALSE", "PEEKED_LONG", "PEEKED_NONE", "PEEKED_NULL", "PEEKED_NUMBER", "PEEKED_SINGLE_QUOTED", "PEEKED_SINGLE_QUOTED_NAME", "PEEKED_TRUE", "PEEKED_UNQUOTED", "PEEKED_UNQUOTED_NAME", "SINGLE_QUOTE_OR_SLASH", "UNQUOTED_STRING_TERMINALS", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C16773h.a aVar = C16773h.f139664d;
        f39595n = aVar.d("'\\");
        f39596o = aVar.d("\"\\");
        f39597p = aVar.d("{}[]:, \n\t\r/\\;#=");
    }

    public d(C16772g gVar) {
        C17542s.j(gVar, "source");
        this.f39598a = gVar;
        this.f39599b = gVar.p();
        int[] iArr = new int[256];
        iArr[0] = 6;
        this.f39604g = iArr;
        int[] iArr2 = new int[256];
        iArr2[0] = 0;
        this.f39608k = iArr2;
        this.f39609l = 1;
    }

    private final int c() {
        int[] iArr = this.f39604g;
        int i10 = this.f39605h;
        int i11 = iArr[i10 - 1];
        switch (i11) {
            case 1:
                iArr[i10 - 1] = 2;
                break;
            case 2:
                int f10 = f(true);
                this.f39599b.readByte();
                char c10 = (char) f10;
                if (c10 == ']') {
                    this.f39600c = 4;
                    return 4;
                } else if (c10 != ',') {
                    t("Unterminated array");
                    throw new C16820k();
                }
                break;
            case 3:
            case 5:
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int f11 = f(true);
                    this.f39599b.readByte();
                    char c11 = (char) f11;
                    if (c11 == '}') {
                        this.f39600c = 2;
                        return 2;
                    } else if (c11 != ',') {
                        t("Unterminated object");
                        throw new C16820k();
                    }
                }
                char f12 = (char) f(true);
                if (f12 == '\"') {
                    this.f39599b.readByte();
                    this.f39600c = 13;
                    return 13;
                } else if (f12 != '}') {
                    t("Unexpected character: " + f12);
                    throw new C16820k();
                } else if (i11 != 5) {
                    this.f39599b.readByte();
                    this.f39600c = 2;
                    return 2;
                } else {
                    t("Expected name");
                    throw new C16820k();
                }
            case 4:
                iArr[i10 - 1] = 5;
                int f13 = f(true);
                this.f39599b.readByte();
                if (((char) f13) != ':') {
                    t("Expected ':'");
                    throw new C16820k();
                }
                break;
            case 6:
                iArr[i10 - 1] = 7;
                break;
            case 7:
                if (f(false) == -1) {
                    this.f39600c = 17;
                    return 17;
                }
                t("Malformed JSON");
                throw new C16820k();
            default:
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                break;
        }
        char f14 = (char) f(true);
        if (f14 == ']') {
            if (i11 == 1) {
                this.f39599b.readByte();
                this.f39600c = 4;
                return 4;
            }
            t("Unexpected value");
            throw new C16820k();
        } else if (f14 == ';' || f14 == ',' || f14 == '\'') {
            t("Unexpected value");
            throw new C16820k();
        } else if (f14 == '\"') {
            this.f39599b.readByte();
            this.f39600c = 9;
            return 9;
        } else if (f14 == '[') {
            this.f39599b.readByte();
            this.f39600c = 3;
            return 3;
        } else if (f14 == '{') {
            this.f39599b.readByte();
            this.f39600c = 1;
            return 1;
        } else {
            int i12 = i();
            if (i12 != 0) {
                return i12;
            }
            int l10 = l();
            if (l10 != 0) {
                return l10;
            }
            if (!e((char) this.f39599b.u(0))) {
                t("Expected value");
                throw new C16820k();
            }
            t("Malformed JSON");
            throw new C16820k();
        }
    }

    private final String d() {
        return C16877v.G0(m(), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    private final boolean e(char c10) {
        if (c10 == '/' || c10 == '\\' || c10 == ';' || c10 == '#' || c10 == '=') {
            t("Unexpected character: " + c10);
            throw new C16820k();
        }
        return !(c10 == '{' || c10 == '}' || c10 == '[' || c10 == ']' || c10 == ':' || c10 == ',' || c10 == ' ' || c10 == 9 || c10 == 13 || c10 == 10);
    }

    private final int f(boolean z10) {
        int i10 = 0;
        while (true) {
            long j10 = (long) i10;
            if (this.f39598a.V0(j10 + 1)) {
                i10++;
                byte u10 = this.f39599b.u(j10);
                if (u10 != 10 && u10 != 32 && u10 != 13 && u10 != 9) {
                    this.f39599b.M(((long) i10) - 1);
                    if (u10 == 47) {
                        if (!this.f39598a.V0(2)) {
                            return u10;
                        }
                        t("Malformed JSON");
                        throw new C16820k();
                    } else if (u10 != 35) {
                        return u10;
                    } else {
                        t("Malformed JSON");
                        throw new C16820k();
                    }
                }
            } else if (!z10) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    private final String g(C16773h hVar) {
        StringBuilder sb2 = null;
        while (true) {
            long b32 = this.f39598a.b3(hVar);
            if (b32 == -1) {
                t("Unterminated string");
                throw new C16820k();
            } else if (this.f39599b.u(b32) == ((byte) 92)) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f39599b.B1(b32));
                this.f39599b.readByte();
                sb2.append(o());
            } else if (sb2 == null) {
                String B12 = this.f39599b.B1(b32);
                this.f39599b.readByte();
                return B12;
            } else {
                sb2.append(this.f39599b.B1(b32));
                this.f39599b.readByte();
                String sb3 = sb2.toString();
                C17542s.i(sb3, "{\n        builder.append…uilder.toString()\n      }");
                return sb3;
            }
        }
    }

    private final String h() {
        long b32 = this.f39598a.b3(f39597p);
        return b32 != -1 ? this.f39599b.B1(b32) : this.f39599b.l0();
    }

    private final int i() {
        int i10;
        String str;
        String str2;
        byte u10 = this.f39599b.u(0);
        if (u10 == ((byte) 116) || u10 == ((byte) 84)) {
            str2 = "true";
            str = "TRUE";
            i10 = 5;
        } else if (u10 == ((byte) CheckoutActivity.RESULT_ERROR) || u10 == ((byte) 70)) {
            str2 = "false";
            str = "FALSE";
            i10 = 6;
        } else if (u10 != ((byte) 110) && u10 != ((byte) 78)) {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i10 = 7;
        }
        int length = str2.length();
        for (int i11 = 1; i11 < length; i11++) {
            long j10 = (long) i11;
            if (!this.f39598a.V0(1 + j10)) {
                return 0;
            }
            byte u11 = this.f39599b.u(j10);
            if (u11 != ((byte) str2.charAt(i11)) && u11 != ((byte) str.charAt(i11))) {
                return 0;
            }
        }
        long j11 = (long) length;
        if (this.f39598a.V0(1 + j11) && e((char) this.f39599b.u(j11))) {
            return 0;
        }
        this.f39599b.M(j11);
        this.f39600c = i10;
        return i10;
    }

    private final int l() {
        long j10;
        int i10;
        char c10;
        int i11 = 0;
        int i12 = 0;
        char c11 = 0;
        boolean z10 = false;
        long j11 = 0;
        boolean z11 = true;
        while (true) {
            j10 = (long) i12;
            if (!this.f39598a.V0(1 + j10)) {
                i10 = i11;
                break;
            }
            byte u10 = this.f39599b.u(j10);
            c10 = (char) u10;
            if (c10 == '-') {
                if (c11 == 0) {
                    c11 = 1;
                    z10 = true;
                    i12++;
                    i11 = 0;
                } else if (c11 != 5) {
                    return i11;
                }
            } else if (c10 != '+') {
                if (c10 == 'e' || c10 == 'E') {
                    if (c11 != 2 && c11 != 4) {
                        return i11;
                    }
                    c11 = 5;
                } else if (c10 != '.') {
                    byte b10 = (byte) 48;
                    if (u10 >= b10 && u10 <= ((byte) 57)) {
                        if (c11 == 0 || c11 == 1) {
                            j11 = -((long) (u10 - b10));
                            c11 = 2;
                            i12++;
                            i11 = 0;
                        } else if (c11 != 2) {
                            if (c11 == 3) {
                                c11 = 4;
                            } else if (c11 == 5 || c11 == 6) {
                                c11 = 7;
                            }
                            i12++;
                            i11 = 0;
                        } else if (j11 == 0) {
                            return 0;
                        } else {
                            long j12 = (((long) 10) * j11) - ((long) (u10 - b10));
                            int i13 = (j11 > -922337203685477580L ? 1 : (j11 == -922337203685477580L ? 0 : -1));
                            z11 = ((i13 > 0) && z11) || (i13 == 0 && j12 < j11);
                            j11 = j12;
                            i12++;
                            i11 = 0;
                        }
                    }
                } else if (c11 != 2) {
                    return i11;
                } else {
                    c11 = 3;
                }
                i12++;
                i11 = 0;
            } else if (c11 != 5) {
                return i11;
            }
            c11 = 6;
            i12++;
            i11 = 0;
        }
        if (e(c10)) {
            return 0;
        }
        i10 = 0;
        if (c11 == 2 && z11 && (j11 != Long.MIN_VALUE || z10)) {
            if (!z10) {
                j11 = -j11;
            }
            this.f39601d = j11;
            this.f39599b.M(j10);
            this.f39600c = 15;
            return 15;
        } else if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i10;
        } else {
            this.f39602e = i12;
            this.f39600c = 16;
            return 16;
        }
    }

    private final void n(int i10) {
        int i11 = this.f39605h;
        int[] iArr = this.f39604g;
        if (i11 != iArr.length) {
            this.f39605h = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new f("Nesting too deep at " + m());
    }

    private final char o() {
        int i10;
        if (this.f39598a.V0(1)) {
            char readByte = (char) this.f39599b.readByte();
            if (readByte == 'u') {
                if (this.f39598a.V0(4)) {
                    char c10 = (char) 0;
                    for (int i11 = 0; i11 < 4; i11++) {
                        byte u10 = this.f39599b.u((long) i11);
                        char c11 = (char) (c10 << 4);
                        byte b10 = (byte) 48;
                        if (u10 < b10 || u10 > ((byte) 57)) {
                            byte b11 = (byte) 97;
                            if ((u10 < b11 || u10 > ((byte) CheckoutActivity.RESULT_ERROR)) && (u10 < (b11 = (byte) 65) || u10 > ((byte) 70))) {
                                t("\\u" + this.f39599b.B1(4));
                                throw new C16820k();
                            }
                            i10 = (u10 - b11) + 10;
                        } else {
                            i10 = u10 - b10;
                        }
                        c10 = (char) (c11 + i10);
                    }
                    this.f39599b.M(4);
                    return c10;
                }
                throw new EOFException("Unterminated escape sequence at path " + m());
            } else if (readByte == 't') {
                return 9;
            } else {
                if (readByte == 'b') {
                    return 8;
                }
                if (readByte == 'n') {
                    return 10;
                }
                if (readByte == 'r') {
                    return 13;
                }
                if (readByte == 'f') {
                    return 12;
                }
                if (readByte == 10 || readByte == '\'' || readByte == '\"' || readByte == '\\' || readByte == '/') {
                    return readByte;
                }
                t("Invalid escape sequence: \\" + readByte);
                throw new C16820k();
            }
        } else {
            t("Unterminated escape sequence");
            throw new C16820k();
        }
    }

    private final void q(C16773h hVar) {
        while (true) {
            long b32 = this.f39598a.b3(hVar);
            if (b32 == -1) {
                t("Unterminated string");
                throw new C16820k();
            } else if (this.f39599b.u(b32) == ((byte) 92)) {
                this.f39599b.M(b32 + 1);
                o();
            } else {
                this.f39599b.M(b32 + 1);
                return;
            }
        }
    }

    private final void s() {
        long b32 = this.f39598a.b3(f39597p);
        C16770e eVar = this.f39599b;
        if (b32 == -1) {
            b32 = eVar.size();
        }
        eVar.M(b32);
    }

    private final Void t(String str) {
        throw new g(str + " at path " + m());
    }

    public String B0() {
        String str;
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : c()) {
            case 12:
                str = g(f39595n);
                break;
            case 13:
                str = g(f39596o);
                break;
            case 14:
                str = h();
                break;
            default:
                throw new f("Expected a name but was " + O() + " at path " + d());
        }
        this.f39600c = 0;
        this.f39606i[this.f39605h - 1] = str;
        return str;
    }

    public f C() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : c()) == 1) {
            n(3);
            this.f39600c = 0;
            int i10 = this.f39609l;
            this.f39609l = i10 + 1;
            this.f39608k[i10] = 0;
            return this;
        }
        throw new f("Expected BEGIN_OBJECT but was " + O() + " at path " + d());
    }

    public String C1() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        String str = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : c();
        if (intValue == 15) {
            str = String.valueOf(this.f39601d);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = g(f39595n);
                    break;
                case 9:
                    str = g(f39596o);
                    break;
                case 10:
                    str = h();
                    break;
                case 11:
                    String str2 = this.f39603f;
                    if (str2 != null) {
                        this.f39603f = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    throw new f("Expected a string but was " + O() + " at path " + d());
            }
        } else {
            str = this.f39599b.B1((long) this.f39602e);
        }
        this.f39600c = 0;
        int[] iArr = this.f39607j;
        int i10 = this.f39605h - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public void D() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    public f E() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : c()) == 4) {
            int i10 = this.f39605h;
            this.f39605h = i10 - 1;
            int[] iArr = this.f39607j;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.f39600c = 0;
            return this;
        }
        throw new f("Expected END_ARRAY but was " + O() + " at path " + d());
    }

    public f G() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : c()) == 3) {
            n(1);
            this.f39607j[this.f39605h - 1] = 0;
            this.f39600c = 0;
            return this;
        }
        throw new f("Expected BEGIN_ARRAY but was " + O() + " at path " + d());
    }

    public int G0() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : c();
        if (intValue == 15) {
            long j10 = this.f39601d;
            int i10 = (int) j10;
            if (j10 == ((long) i10)) {
                this.f39600c = 0;
                int[] iArr = this.f39607j;
                int i11 = this.f39605h - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new f("Expected an int but was " + this.f39601d + " at path " + m());
        }
        if (intValue == 16) {
            this.f39603f = this.f39599b.B1((long) this.f39602e);
        } else if (intValue == 9 || intValue == 8) {
            String g10 = g(intValue == 9 ? f39596o : f39595n);
            this.f39603f = g10;
            try {
                C17542s.g(g10);
                int parseInt = Integer.parseInt(g10);
                this.f39600c = 0;
                int[] iArr2 = this.f39607j;
                int i12 = this.f39605h - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new f("Expected an int but was " + O() + " at path " + d());
        }
        this.f39600c = 11;
        try {
            String str = this.f39603f;
            C17542s.g(str);
            double parseDouble = Double.parseDouble(str);
            int i13 = (int) parseDouble;
            if (((double) i13) == parseDouble) {
                this.f39603f = null;
                this.f39600c = 0;
                int[] iArr3 = this.f39607j;
                int i14 = this.f39605h - 1;
                iArr3[i14] = iArr3[i14] + 1;
                return i13;
            }
            throw new f("Expected an int but was " + this.f39603f + " at path " + d());
        } catch (NumberFormatException unused2) {
            throw new f("Expected an int but was " + this.f39603f + " at path " + d());
        }
    }

    public f K() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : c()) == 2) {
            int i10 = this.f39605h;
            int i11 = i10 - 1;
            this.f39605h = i11;
            this.f39606i[i11] = null;
            int[] iArr = this.f39607j;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f39600c = 0;
            this.f39609l--;
            return this;
        }
        throw new f("Expected END_OBJECT but was " + O() + " at path " + d());
    }

    public f.a O() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : c()) {
            case 1:
                return f.a.BEGIN_OBJECT;
            case 2:
                return f.a.END_OBJECT;
            case 3:
                return f.a.BEGIN_ARRAY;
            case 4:
                return f.a.END_ARRAY;
            case 5:
            case 6:
                return f.a.BOOLEAN;
            case 7:
                return f.a.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return f.a.STRING;
            case 12:
            case 13:
            case 14:
                return f.a.NAME;
            case 15:
                return f.a.LONG;
            case 16:
                return f.a.NUMBER;
            case 17:
                return f.a.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public e R2() {
        String C12 = C1();
        C17542s.g(C12);
        return new e(C12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        a0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int T2(java.util.List<java.lang.String> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "names"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = -1
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x000d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r6.B0()
            int[] r2 = r6.f39608k
            int r3 = r6.f39609l
            int r3 = r3 + -1
            r2 = r2[r3]
            java.lang.Object r3 = r7.get(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r0)
            r4 = 0
            if (r3 == 0) goto L_0x0047
            int[] r0 = r6.f39608k
            int r1 = r6.f39609l
            int r3 = r1 + -1
            int r5 = r2 + 1
            r0[r3] = r5
            int r1 = r1 + -1
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L_0x0046
            int[] r7 = r6.f39608k
            int r0 = r6.f39609l
            int r0 = r0 + -1
            r7[r0] = r4
        L_0x0046:
            return r2
        L_0x0047:
            r3 = r2
        L_0x0048:
            int r3 = r3 + 1
            int r5 = r7.size()
            if (r3 != r5) goto L_0x0051
            r3 = r4
        L_0x0051:
            if (r3 != r2) goto L_0x0057
            r6.a0()
            goto L_0x000d
        L_0x0057:
            java.lang.Object r5 = r7.get(r3)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r0)
            if (r5 == 0) goto L_0x0048
            int[] r0 = r6.f39608k
            int r1 = r6.f39609l
            int r2 = r1 + -1
            int r5 = r3 + 1
            r0[r2] = r5
            int r1 = r1 + -1
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L_0x007d
            int[] r7 = r6.f39608k
            int r0 = r6.f39609l
            int r0 = r0 + -1
            r7[r0] = r4
        L_0x007d:
            return r3
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.d.T2(java.util.List):int");
    }

    public long U2() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : c();
        if (intValue == 15) {
            this.f39600c = 0;
            int[] iArr = this.f39607j;
            int i10 = this.f39605h - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f39601d;
        }
        if (intValue == 16) {
            this.f39603f = this.f39599b.B1((long) this.f39602e);
        } else if (intValue == 9 || intValue == 8) {
            String g10 = g(intValue == 9 ? f39596o : f39595n);
            this.f39603f = g10;
            try {
                C17542s.g(g10);
                long parseLong = Long.parseLong(g10);
                this.f39600c = 0;
                int[] iArr2 = this.f39607j;
                int i11 = this.f39605h - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new S6.f("Expected a long but was " + O() + " at path " + d());
        }
        this.f39600c = 11;
        try {
            String str = this.f39603f;
            C17542s.g(str);
            double parseDouble = Double.parseDouble(str);
            long j10 = (long) parseDouble;
            if (((double) j10) == parseDouble) {
                this.f39603f = null;
                this.f39600c = 0;
                int[] iArr3 = this.f39607j;
                int i12 = this.f39605h - 1;
                iArr3[i12] = iArr3[i12] + 1;
                return j10;
            }
            throw new S6.f("Expected a long but was " + this.f39603f + " at path " + d());
        } catch (NumberFormatException unused2) {
            throw new S6.f("Expected a long but was " + this.f39603f + " at path " + d());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        r6.f39600c = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a0() {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r6.f39600c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r2.intValue()
            if (r3 != 0) goto L_0x000f
            r2 = 0
        L_0x000f:
            if (r2 == 0) goto L_0x0016
            int r2 = r2.intValue()
            goto L_0x001a
        L_0x0016:
            int r2 = r6.c()
        L_0x001a:
            r3 = 1
            switch(r2) {
                case 1: goto L_0x004e;
                case 2: goto L_0x0047;
                case 3: goto L_0x0041;
                case 4: goto L_0x0038;
                case 5: goto L_0x001e;
                case 6: goto L_0x001e;
                case 7: goto L_0x001e;
                case 8: goto L_0x0032;
                case 9: goto L_0x002c;
                case 10: goto L_0x0028;
                case 11: goto L_0x001e;
                case 12: goto L_0x0032;
                case 13: goto L_0x002c;
                case 14: goto L_0x0028;
                case 15: goto L_0x001e;
                case 16: goto L_0x001f;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0053
        L_0x001f:
            WK.e r2 = r6.f39599b
            int r4 = r6.f39602e
            long r4 = (long) r4
            r2.M(r4)
            goto L_0x0053
        L_0x0028:
            r6.s()
            goto L_0x0053
        L_0x002c:
            WK.h r2 = f39596o
            r6.q(r2)
            goto L_0x0053
        L_0x0032:
            WK.h r2 = f39595n
            r6.q(r2)
            goto L_0x0053
        L_0x0038:
            int r2 = r6.f39605h
            int r2 = r2 + -1
            r6.f39605h = r2
        L_0x003e:
            int r1 = r1 + -1
            goto L_0x0053
        L_0x0041:
            r6.n(r3)
        L_0x0044:
            int r1 = r1 + 1
            goto L_0x0053
        L_0x0047:
            int r2 = r6.f39605h
            int r2 = r2 + -1
            r6.f39605h = r2
            goto L_0x003e
        L_0x004e:
            r2 = 3
            r6.n(r2)
            goto L_0x0044
        L_0x0053:
            r6.f39600c = r0
            if (r1 != 0) goto L_0x0002
            int[] r0 = r6.f39607j
            int r1 = r6.f39605h
            int r2 = r1 + -1
            r4 = r0[r2]
            int r4 = r4 + r3
            r0[r2] = r4
            java.lang.String[] r0 = r6.f39606i
            int r1 = r1 - r3
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.d.a0():void");
    }

    public void close() {
        this.f39600c = 0;
        this.f39604g[0] = 8;
        this.f39605h = 1;
        this.f39599b.c();
        this.f39598a.close();
    }

    public double d2() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : c();
        if (intValue == 15) {
            this.f39600c = 0;
            int[] iArr = this.f39607j;
            int i10 = this.f39605h - 1;
            iArr[i10] = iArr[i10] + 1;
            return (double) this.f39601d;
        }
        if (intValue == 16) {
            this.f39603f = this.f39599b.B1((long) this.f39602e);
        } else if (intValue == 9) {
            this.f39603f = g(f39596o);
        } else if (intValue == 8) {
            this.f39603f = g(f39595n);
        } else if (intValue == 10) {
            this.f39603f = h();
        } else if (intValue != 11) {
            throw new S6.f("Expected a double but was " + O() + " at path " + d());
        }
        this.f39600c = 11;
        try {
            String str = this.f39603f;
            C17542s.g(str);
            double parseDouble = Double.parseDouble(str);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new g("JSON forbids NaN and infinities: " + parseDouble + " at path " + d());
            }
            this.f39603f = null;
            this.f39600c = 0;
            int[] iArr2 = this.f39607j;
            int i11 = this.f39605h - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new S6.f("Expected a double but was " + this.f39603f + " at path " + d());
        }
    }

    public boolean hasNext() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : c();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    public List<Object> m() {
        return b.f39694a.a(this.f39605h, this.f39604g, this.f39606i, this.f39607j);
    }

    public Void v2() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : c()) == 7) {
            this.f39600c = 0;
            int[] iArr = this.f39607j;
            int i10 = this.f39605h - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new S6.f("Expected null but was " + O() + " at path " + d());
    }

    public boolean w1() {
        Integer valueOf = Integer.valueOf(this.f39600c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : c();
        if (intValue == 5) {
            this.f39600c = 0;
            int[] iArr = this.f39607j;
            int i10 = this.f39605h - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        } else if (intValue == 6) {
            this.f39600c = 0;
            int[] iArr2 = this.f39607j;
            int i11 = this.f39605h - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        } else {
            throw new S6.f("Expected a boolean but was " + O() + " at path " + d());
        }
    }
}
