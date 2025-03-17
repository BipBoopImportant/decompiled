package WI;

import YH.C16870n;
import YH.C16877v;
import YH.X;
import bJ.C17046e;
import fI.C17221b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

/* renamed from: WI.a  reason: case insensitive filesystem */
public final class C16730a {

    /* renamed from: a  reason: collision with root package name */
    private final C3422a f139493a;

    /* renamed from: b  reason: collision with root package name */
    private final C17046e f139494b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f139495c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f139496d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f139497e;

    /* renamed from: f  reason: collision with root package name */
    private final String f139498f;

    /* renamed from: g  reason: collision with root package name */
    private final int f139499g;

    /* renamed from: h  reason: collision with root package name */
    private final String f139500h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f139501i;

    /* renamed from: WI.a$a  reason: collision with other inner class name */
    public enum C3422a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final C3423a Companion = null;
        /* access modifiers changed from: private */
        public static final Map<Integer, C3422a> entryById = null;

        /* renamed from: id  reason: collision with root package name */
        private final int f139502id;

        /* renamed from: WI.a$a$a  reason: collision with other inner class name */
        public static final class C3423a {
            public /* synthetic */ C3423a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C3422a a(int i10) {
                C3422a aVar = (C3422a) C3422a.entryById.get(Integer.valueOf(i10));
                return aVar == null ? C3422a.UNKNOWN : aVar;
            }

            private C3423a() {
            }
        }

        static {
            int i10;
            C3422a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C3423a((DefaultConstructorMarker) null);
            C3422a[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(values.length), 16));
            for (C3422a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f139502id), aVar);
            }
            entryById = linkedHashMap;
        }

        private C3422a(int i10) {
            this.f139502id = i10;
        }

        public static final C3422a j(int i10) {
            return Companion.a(i10);
        }
    }

    public C16730a(C3422a aVar, C17046e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        C17542s.j(aVar, "kind");
        C17542s.j(eVar, "metadataVersion");
        this.f139493a = aVar;
        this.f139494b = eVar;
        this.f139495c = strArr;
        this.f139496d = strArr2;
        this.f139497e = strArr3;
        this.f139498f = str;
        this.f139499g = i10;
        this.f139500h = str2;
        this.f139501i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final String[] a() {
        return this.f139495c;
    }

    public final String[] b() {
        return this.f139496d;
    }

    public final C3422a c() {
        return this.f139493a;
    }

    public final C17046e d() {
        return this.f139494b;
    }

    public final String e() {
        String str = this.f139498f;
        if (this.f139493a == C3422a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> f() {
        String[] strArr = this.f139495c;
        List<String> list = null;
        if (this.f139493a != C3422a.MULTIFILE_CLASS) {
            strArr = null;
        }
        if (strArr != null) {
            list = C16870n.f(strArr);
        }
        return list == null ? C16877v.n() : list;
    }

    public final String[] g() {
        return this.f139497e;
    }

    public final boolean i() {
        return h(this.f139499g, 2);
    }

    public final boolean j() {
        return h(this.f139499g, 16) && !h(this.f139499g, 32);
    }

    public String toString() {
        return this.f139493a + " version=" + this.f139494b;
    }
}
