package EH;

import EH.C15625j;
import HJ.C15854t;
import YH.C16877v;
import com.optimizely.ab.config.FeatureVariable;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Marker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u000f2\u00020\u0001:\u0003$%&B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"¨\u0006'"}, d2 = {"LEH/c;", "LEH/j;", "", "contentType", "contentSubtype", "existingContent", "", "LEH/i;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "name", "value", "", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "h", "(Ljava/lang/String;Ljava/lang/String;)LEH/c;", "i", "()LEH/c;", "pattern", "g", "(LEH/c;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "getContentSubtype", "a", "b", "c", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.c  reason: case insensitive filesystem */
public final class C15618c extends C15625j {

    /* renamed from: f  reason: collision with root package name */
    public static final b f133986f = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C15618c f133987g = new C15618c(Marker.ANY_MARKER, Marker.ANY_MARKER, (List) null, 4, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final String f133988d;

    /* renamed from: e  reason: collision with root package name */
    private final String f133989e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bA\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00108\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\b¨\u0006E"}, d2 = {"LEH/c$a;", "", "<init>", "()V", "LEH/c;", "b", "LEH/c;", "getAny", "()LEH/c;", "Any", "c", "getAtom", "Atom", "d", "getCbor", "Cbor", "e", "a", "Json", "f", "getHalJson", "HalJson", "g", "getJavaScript", "JavaScript", "h", "OctetStream", "i", "getRss", "Rss", "j", "getXml", "Xml", "k", "getXml_Dtd", "Xml_Dtd", "l", "getZip", "Zip", "m", "getGZip", "GZip", "n", "getFormUrlEncoded", "FormUrlEncoded", "o", "getPdf", "Pdf", "p", "getXlsx", "Xlsx", "q", "getDocx", "Docx", "r", "getPptx", "Pptx", "s", "getProtoBuf", "ProtoBuf", "t", "getWasm", "Wasm", "u", "getProblemJson", "ProblemJson", "v", "getProblemXml", "ProblemXml", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133990a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C15618c f133991b = new C15618c("application", Marker.ANY_MARKER, (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        private static final C15618c f133992c = new C15618c("application", "atom+xml", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: d  reason: collision with root package name */
        private static final C15618c f133993d = new C15618c("application", "cbor", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        private static final C15618c f133994e = new C15618c("application", FeatureVariable.JSON_TYPE, (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: f  reason: collision with root package name */
        private static final C15618c f133995f = new C15618c("application", "hal+json", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: g  reason: collision with root package name */
        private static final C15618c f133996g = new C15618c("application", "javascript", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: h  reason: collision with root package name */
        private static final C15618c f133997h = new C15618c("application", "octet-stream", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        private static final C15618c f133998i = new C15618c("application", "rss+xml", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: j  reason: collision with root package name */
        private static final C15618c f133999j = new C15618c("application", "xml", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: k  reason: collision with root package name */
        private static final C15618c f134000k = new C15618c("application", "xml-dtd", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: l  reason: collision with root package name */
        private static final C15618c f134001l = new C15618c("application", "zip", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: m  reason: collision with root package name */
        private static final C15618c f134002m = new C15618c("application", "gzip", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: n  reason: collision with root package name */
        private static final C15618c f134003n = new C15618c("application", "x-www-form-urlencoded", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: o  reason: collision with root package name */
        private static final C15618c f134004o = new C15618c("application", "pdf", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: p  reason: collision with root package name */
        private static final C15618c f134005p = new C15618c("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: q  reason: collision with root package name */
        private static final C15618c f134006q = new C15618c("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: r  reason: collision with root package name */
        private static final C15618c f134007r = new C15618c("application", "vnd.openxmlformats-officedocument.presentationml.presentation", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: s  reason: collision with root package name */
        private static final C15618c f134008s = new C15618c("application", "protobuf", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: t  reason: collision with root package name */
        private static final C15618c f134009t = new C15618c("application", "wasm", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: u  reason: collision with root package name */
        private static final C15618c f134010u = new C15618c("application", "problem+json", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: v  reason: collision with root package name */
        private static final C15618c f134011v = new C15618c("application", "problem+xml", (List) null, 4, (DefaultConstructorMarker) null);

        private a() {
        }

        public final C15618c a() {
            return f133994e;
        }

        public final C15618c b() {
            return f133997h;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LEH/c$b;", "", "<init>", "()V", "", "value", "LEH/c;", "b", "(Ljava/lang/String;)LEH/c;", "Any", "LEH/c;", "a", "()LEH/c;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15618c a() {
            return C15618c.f133987g;
        }

        public final C15618c b(String str) {
            C17542s.j(str, "value");
            if (C15854t.v0(str)) {
                return a();
            }
            C15625j.a aVar = C15625j.f134030c;
            C15623h hVar = (C15623h) C16877v.I0(C15630o.c(str));
            String d10 = hVar.d();
            List<C15624i> b10 = hVar.b();
            int r02 = C15854t.r0(d10, '/', 0, false, 6, (Object) null);
            if (r02 != -1) {
                String substring = d10.substring(0, r02);
                C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String obj = C15854t.z1(substring).toString();
                if (obj.length() != 0) {
                    String substring2 = d10.substring(r02 + 1);
                    C17542s.i(substring2, "this as java.lang.String).substring(startIndex)");
                    String obj2 = C15854t.z1(substring2).toString();
                    if (C15854t.c0(obj, ' ', false, 2, (Object) null) || C15854t.c0(obj2, ' ', false, 2, (Object) null)) {
                        throw new C15616a(str);
                    } else if (obj2.length() != 0 && !C15854t.c0(obj2, '/', false, 2, (Object) null)) {
                        return new C15618c(obj, obj2, b10);
                    } else {
                        throw new C15616a(str);
                    }
                } else {
                    throw new C15616a(str);
                }
            } else if (C17542s.e(C15854t.z1(d10).toString(), Marker.ANY_MARKER)) {
                return C15618c.f133986f.a();
            } else {
                throw new C15616a(str);
            }
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b¨\u0006\""}, d2 = {"LEH/c$c;", "", "<init>", "()V", "LEH/c;", "b", "LEH/c;", "getAny", "()LEH/c;", "Any", "c", "a", "Plain", "d", "getCSS", "CSS", "e", "getCSV", "CSV", "f", "getHtml", "Html", "g", "getJavaScript", "JavaScript", "h", "getVCard", "VCard", "i", "getXml", "Xml", "j", "getEventStream", "EventStream", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.c$c  reason: collision with other inner class name */
    public static final class C3303c {

        /* renamed from: a  reason: collision with root package name */
        public static final C3303c f134012a = new C3303c();

        /* renamed from: b  reason: collision with root package name */
        private static final C15618c f134013b = new C15618c("text", Marker.ANY_MARKER, (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        private static final C15618c f134014c = new C15618c("text", "plain", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: d  reason: collision with root package name */
        private static final C15618c f134015d = new C15618c("text", "css", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        private static final C15618c f134016e = new C15618c("text", "csv", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: f  reason: collision with root package name */
        private static final C15618c f134017f = new C15618c("text", "html", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: g  reason: collision with root package name */
        private static final C15618c f134018g = new C15618c("text", "javascript", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: h  reason: collision with root package name */
        private static final C15618c f134019h = new C15618c("text", "vcard", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        private static final C15618c f134020i = new C15618c("text", "xml", (List) null, 4, (DefaultConstructorMarker) null);

        /* renamed from: j  reason: collision with root package name */
        private static final C15618c f134021j = new C15618c("text", "event-stream", (List) null, 4, (DefaultConstructorMarker) null);

        private C3303c() {
        }

        public final C15618c a() {
            return f134014c;
        }
    }

    private C15618c(String str, String str2, String str3, List<C15624i> list) {
        super(str3, list);
        this.f133988d = str;
        this.f133989e = str2;
    }

    private final boolean f(String str, String str2) {
        int size = b().size();
        if (size == 0) {
            return false;
        }
        if (size != 1) {
            Iterable<C15624i> b10 = b();
            if ((b10 instanceof Collection) && ((Collection) b10).isEmpty()) {
                return false;
            }
            for (C15624i iVar : b10) {
                if (!C15854t.H(iVar.c(), str, true) || !C15854t.H(iVar.d(), str2, true)) {
                }
            }
            return false;
        }
        C15624i iVar2 = b().get(0);
        if (!C15854t.H(iVar2.c(), str, true) || !C15854t.H(iVar2.d(), str2, true)) {
            return false;
        }
        return true;
    }

    public final String e() {
        return this.f133988d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15618c) {
            C15618c cVar = (C15618c) obj;
            return C15854t.H(this.f133988d, cVar.f133988d, true) && C15854t.H(this.f133989e, cVar.f133989e, true) && C17542s.e(b(), cVar.b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r4 != null) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(EH.C15618c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = r7.f133988d
            java.lang.String r1 = "*"
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = r7.f133988d
            java.lang.String r4 = r6.f133988d
            boolean r0 = HJ.C15854t.H(r0, r4, r3)
            if (r0 != 0) goto L_0x001c
            return r2
        L_0x001c:
            java.lang.String r0 = r7.f133989e
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = r7.f133989e
            java.lang.String r4 = r6.f133989e
            boolean r0 = HJ.C15854t.H(r0, r4, r3)
            if (r0 != 0) goto L_0x002f
            return r2
        L_0x002f:
            java.util.List r7 = r7.b()
            java.util.Iterator r7 = r7.iterator()
        L_0x0037:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r7.next()
            EH.i r0 = (EH.C15624i) r0
            java.lang.String r4 = r0.a()
            java.lang.String r0 = r0.b()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r4, r1)
            if (r5 == 0) goto L_0x0089
            boolean r4 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r4 == 0) goto L_0x0059
        L_0x0057:
            r0 = r3
            goto L_0x009a
        L_0x0059:
            java.util.List r4 = r6.b()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x006e
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x006e
        L_0x006c:
            r0 = r2
            goto L_0x009a
        L_0x006e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0072:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r4.next()
            EH.i r5 = (EH.C15624i) r5
            java.lang.String r5 = r5.d()
            boolean r5 = HJ.C15854t.H(r5, r0, r3)
            if (r5 == 0) goto L_0x0072
            goto L_0x0057
        L_0x0089:
            java.lang.String r4 = r6.c(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r5 == 0) goto L_0x0096
            if (r4 == 0) goto L_0x006c
            goto L_0x0057
        L_0x0096:
            boolean r0 = HJ.C15854t.H(r4, r0, r3)
        L_0x009a:
            if (r0 != 0) goto L_0x0037
            return r2
        L_0x009d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: EH.C15618c.g(EH.c):boolean");
    }

    public final C15618c h(String str, String str2) {
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
        return f(str, str2) ? this : new C15618c(this.f133988d, this.f133989e, a(), C16877v.W0(b(), new C15624i(str, str2)));
    }

    public int hashCode() {
        String str = this.f133988d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f133989e.toLowerCase(locale);
        C17542s.i(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode() + (b().hashCode() * 31);
    }

    public final C15618c i() {
        return b().isEmpty() ? this : new C15618c(this.f133988d, this.f133989e, (List) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15618c(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? C16877v.n() : list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15618c(String str, String str2, List<C15624i> list) {
        this(str, str2, str + '/' + str2, list);
        C17542s.j(str, "contentType");
        C17542s.j(str2, "contentSubtype");
        C17542s.j(list, "parameters");
    }
}
