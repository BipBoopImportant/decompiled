package OK;

import HK.C15864d;
import WK.C16770e;
import WK.C16772g;
import WK.C16773h;
import WK.N;
import WK.y;
import YH.C16870n;
import YH.C16877v;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\b¨\u0006\u0015"}, d2 = {"LOK/d;", "", "<init>", "()V", "", "LWK/h;", "", "d", "()Ljava/util/Map;", "name", "a", "(LWK/h;)LWK/h;", "", "LOK/c;", "b", "[LOK/c;", "c", "()[LOK/c;", "STATIC_HEADER_TABLE", "Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: OK.d  reason: case insensitive filesystem */
public final class C16174d {

    /* renamed from: a  reason: collision with root package name */
    public static final C16174d f136950a;

    /* renamed from: b  reason: collision with root package name */
    private static final C16173c[] f136951b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<C16773h, Integer> f136952c;

    static {
        C16174d dVar = new C16174d();
        f136950a = dVar;
        C16173c cVar = r2;
        C16173c cVar2 = new C16173c(C16173c.f136946j, "");
        C16173c cVar3 = r3;
        C16773h hVar = C16173c.f136943g;
        C16173c cVar4 = new C16173c(hVar, "GET");
        C16173c cVar5 = r5;
        C16173c cVar6 = new C16173c(hVar, "POST");
        C16173c cVar7 = r5;
        C16773h hVar2 = C16173c.f136944h;
        C16173c cVar8 = new C16173c(hVar2, "/");
        C16173c cVar9 = r7;
        C16173c cVar10 = new C16173c(hVar2, "/index.html");
        C16173c cVar11 = r7;
        C16773h hVar3 = C16173c.f136945i;
        C16173c cVar12 = new C16173c(hVar3, "http");
        C16173c cVar13 = r9;
        C16173c cVar14 = new C16173c(hVar3, Constants.SCHEME);
        C16173c cVar15 = r9;
        C16773h hVar4 = C16173c.f136942f;
        C16173c cVar16 = new C16173c(hVar4, "200");
        C16173c cVar17 = r10;
        C16173c cVar18 = new C16173c(hVar4, "204");
        C16173c cVar19 = r11;
        C16173c cVar20 = new C16173c(hVar4, "206");
        C16173c cVar21 = r12;
        C16173c cVar22 = new C16173c(hVar4, "304");
        C16173c cVar23 = r13;
        C16173c cVar24 = new C16173c(hVar4, "400");
        C16173c cVar25 = r15;
        C16174d dVar2 = dVar;
        C16173c cVar26 = new C16173c(hVar4, "404");
        C16773h hVar5 = hVar4;
        C16173c cVar27 = r0;
        C16173c cVar28 = cVar;
        C16173c cVar29 = new C16173c(hVar5, "500");
        String str = "";
        C16173c cVar30 = r0;
        C16173c cVar31 = new C16173c("accept-charset", str);
        C16173c cVar32 = r0;
        C16173c cVar33 = new C16173c("accept-encoding", "gzip, deflate");
        C16173c cVar34 = r0;
        C16173c cVar35 = new C16173c("accept-language", str);
        C16173c cVar36 = r0;
        C16173c cVar37 = new C16173c("accept-ranges", str);
        C16173c cVar38 = r0;
        C16173c cVar39 = new C16173c("accept", str);
        C16173c cVar40 = r0;
        C16173c cVar41 = new C16173c("access-control-allow-origin", str);
        C16173c cVar42 = r0;
        C16173c cVar43 = new C16173c("age", str);
        C16173c cVar44 = r0;
        C16173c cVar45 = new C16173c("allow", str);
        C16173c cVar46 = r0;
        C16173c cVar47 = new C16173c("authorization", str);
        C16173c cVar48 = r0;
        C16173c cVar49 = new C16173c("cache-control", str);
        C16173c cVar50 = r0;
        C16173c cVar51 = new C16173c("content-disposition", str);
        C16173c cVar52 = r0;
        C16173c cVar53 = new C16173c("content-encoding", str);
        C16173c cVar54 = r0;
        C16173c cVar55 = new C16173c("content-language", str);
        C16173c cVar56 = r0;
        C16173c cVar57 = new C16173c("content-length", str);
        C16173c cVar58 = r0;
        C16173c cVar59 = new C16173c("content-location", str);
        C16173c cVar60 = r0;
        C16173c cVar61 = new C16173c("content-range", str);
        C16173c cVar62 = r0;
        C16173c cVar63 = new C16173c("content-type", str);
        C16173c cVar64 = r0;
        C16173c cVar65 = new C16173c("cookie", str);
        C16173c cVar66 = r0;
        C16173c cVar67 = new C16173c("date", str);
        C16173c cVar68 = r0;
        C16173c cVar69 = new C16173c("etag", str);
        C16173c cVar70 = r0;
        C16173c cVar71 = new C16173c("expect", str);
        C16173c cVar72 = r0;
        C16173c cVar73 = new C16173c("expires", str);
        C16173c cVar74 = r0;
        C16173c cVar75 = new C16173c("from", str);
        C16173c cVar76 = r0;
        C16173c cVar77 = new C16173c("host", str);
        C16173c cVar78 = r0;
        C16173c cVar79 = new C16173c("if-match", str);
        C16173c cVar80 = r0;
        C16173c cVar81 = new C16173c("if-modified-since", str);
        C16173c cVar82 = r0;
        C16173c cVar83 = new C16173c("if-none-match", str);
        C16173c cVar84 = r0;
        C16173c cVar85 = new C16173c("if-range", str);
        C16173c cVar86 = r0;
        C16173c cVar87 = new C16173c("if-unmodified-since", str);
        C16173c cVar88 = r0;
        C16173c cVar89 = new C16173c("last-modified", str);
        C16173c cVar90 = r0;
        C16173c cVar91 = new C16173c("link", str);
        C16173c cVar92 = r0;
        C16173c cVar93 = new C16173c("location", str);
        C16173c cVar94 = r0;
        C16173c cVar95 = new C16173c("max-forwards", str);
        C16173c cVar96 = r0;
        C16173c cVar97 = new C16173c("proxy-authenticate", str);
        C16173c cVar98 = r0;
        C16173c cVar99 = new C16173c("proxy-authorization", str);
        C16173c cVar100 = r0;
        C16173c cVar101 = new C16173c("range", str);
        C16173c cVar102 = r0;
        C16173c cVar103 = new C16173c("referer", str);
        C16173c cVar104 = r0;
        C16173c cVar105 = new C16173c("refresh", str);
        C16173c cVar106 = r0;
        C16173c cVar107 = new C16173c("retry-after", str);
        C16173c cVar108 = r0;
        C16173c cVar109 = new C16173c("server", str);
        C16173c cVar110 = r0;
        C16173c cVar111 = new C16173c("set-cookie", str);
        C16173c cVar112 = r0;
        C16173c cVar113 = new C16173c("strict-transport-security", str);
        C16173c cVar114 = r0;
        C16173c cVar115 = new C16173c("transfer-encoding", str);
        C16173c cVar116 = r0;
        C16173c cVar117 = new C16173c("user-agent", str);
        C16173c cVar118 = r0;
        C16173c cVar119 = new C16173c("vary", str);
        C16173c cVar120 = r0;
        C16173c cVar121 = new C16173c("via", str);
        C16173c cVar122 = r0;
        C16173c cVar123 = new C16173c("www-authenticate", str);
        f136951b = new C16173c[]{cVar28, cVar3, cVar5, cVar7, cVar9, cVar11, cVar13, cVar15, cVar17, cVar19, cVar21, cVar23, cVar25, cVar27, cVar30, cVar32, cVar34, cVar36, cVar38, cVar40, cVar42, cVar44, cVar46, cVar48, cVar50, cVar52, cVar54, cVar56, cVar58, cVar60, cVar62, cVar64, cVar66, cVar68, cVar70, cVar72, cVar74, cVar76, cVar78, cVar80, cVar82, cVar84, cVar86, cVar88, cVar90, cVar92, cVar94, cVar96, cVar98, cVar100, cVar102, cVar104, cVar106, cVar108, cVar110, cVar112, cVar114, cVar116, cVar118, cVar120, cVar122};
        f136952c = dVar2.d();
    }

    private C16174d() {
    }

    private final Map<C16773h, Integer> d() {
        C16173c[] cVarArr = f136951b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            C16173c[] cVarArr2 = f136951b;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f136947a)) {
                linkedHashMap.put(cVarArr2[i10].f136947a, Integer.valueOf(i10));
            }
        }
        Map<C16773h, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C17542s.i(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final C16773h a(C16773h hVar) {
        C17542s.j(hVar, "name");
        int W10 = hVar.W();
        int i10 = 0;
        while (i10 < W10) {
            byte B10 = hVar.B(i10);
            if (65 > B10 || B10 >= 91) {
                i10++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.c0());
            }
        }
        return hVar;
    }

    public final Map<C16773h, Integer> b() {
        return f136952c;
    }

    public final C16173c[] c() {
        return f136951b;
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u000bJ\u001d\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\u0003\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f058\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b&\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0016\u00109\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010/¨\u0006;"}, d2 = {"LOK/d$a;", "", "LWK/N;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(LWK/N;II)V", "LXH/N;", "a", "()V", "b", "bytesToRecover", "d", "(I)I", "index", "l", "(I)V", "c", "p", "q", "nameIndex", "n", "o", "LWK/h;", "f", "(I)LWK/h;", "", "h", "(I)Z", "LOK/c;", "entry", "g", "(ILOK/c;)V", "i", "()I", "", "e", "()Ljava/util/List;", "k", "firstByte", "prefixMask", "m", "(II)I", "j", "()LWK/h;", "I", "", "Ljava/util/List;", "headerList", "LWK/g;", "LWK/g;", "", "[LOK/c;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f136953a;

        /* renamed from: b  reason: collision with root package name */
        private int f136954b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C16173c> f136955c;

        /* renamed from: d  reason: collision with root package name */
        private final C16772g f136956d;

        /* renamed from: e  reason: collision with root package name */
        public C16173c[] f136957e;

        /* renamed from: f  reason: collision with root package name */
        private int f136958f;

        /* renamed from: g  reason: collision with root package name */
        public int f136959g;

        /* renamed from: h  reason: collision with root package name */
        public int f136960h;

        public a(N n10, int i10, int i11) {
            C17542s.j(n10, "source");
            this.f136953a = i10;
            this.f136954b = i11;
            this.f136955c = new ArrayList();
            this.f136956d = y.d(n10);
            C16173c[] cVarArr = new C16173c[8];
            this.f136957e = cVarArr;
            this.f136958f = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f136954b;
            int i11 = this.f136960h;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                d(i11 - i10);
            }
        }

        private final void b() {
            C16870n.A(this.f136957e, (Object) null, 0, 0, 6, (Object) null);
            this.f136958f = this.f136957e.length - 1;
            this.f136959g = 0;
            this.f136960h = 0;
        }

        private final int c(int i10) {
            return this.f136958f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f136957e.length;
                while (true) {
                    length--;
                    i11 = this.f136958f;
                    if (length < i11 || i10 <= 0) {
                        C16173c[] cVarArr = this.f136957e;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f136959g);
                        this.f136958f += i12;
                    } else {
                        C16173c cVar = this.f136957e[length];
                        C17542s.g(cVar);
                        int i13 = cVar.f136949c;
                        i10 -= i13;
                        this.f136960h -= i13;
                        this.f136959g--;
                        i12++;
                    }
                }
                C16173c[] cVarArr2 = this.f136957e;
                System.arraycopy(cVarArr2, i11 + 1, cVarArr2, i11 + 1 + i12, this.f136959g);
                this.f136958f += i12;
            }
            return i12;
        }

        private final C16773h f(int i10) {
            if (h(i10)) {
                return C16174d.f136950a.c()[i10].f136947a;
            }
            int c10 = c(i10 - C16174d.f136950a.c().length);
            if (c10 >= 0) {
                C16173c[] cVarArr = this.f136957e;
                if (c10 < cVarArr.length) {
                    C16173c cVar = cVarArr[c10];
                    C17542s.g(cVar);
                    return cVar.f136947a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, C16173c cVar) {
            this.f136955c.add(cVar);
            int i11 = cVar.f136949c;
            if (i10 != -1) {
                C16173c cVar2 = this.f136957e[c(i10)];
                C17542s.g(cVar2);
                i11 -= cVar2.f136949c;
            }
            int i12 = this.f136954b;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f136960h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f136959g + 1;
                C16173c[] cVarArr = this.f136957e;
                if (i13 > cVarArr.length) {
                    C16173c[] cVarArr2 = new C16173c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f136958f = this.f136957e.length - 1;
                    this.f136957e = cVarArr2;
                }
                int i14 = this.f136958f;
                this.f136958f = i14 - 1;
                this.f136957e[i14] = cVar;
                this.f136959g++;
            } else {
                this.f136957e[i10 + c(i10) + d10] = cVar;
            }
            this.f136960h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= C16174d.f136950a.c().length - 1;
        }

        private final int i() {
            return C15864d.d(this.f136956d.readByte(), 255);
        }

        private final void l(int i10) {
            if (h(i10)) {
                this.f136955c.add(C16174d.f136950a.c()[i10]);
                return;
            }
            int c10 = c(i10 - C16174d.f136950a.c().length);
            if (c10 >= 0) {
                C16173c[] cVarArr = this.f136957e;
                if (c10 < cVarArr.length) {
                    C16173c cVar = cVarArr[c10];
                    C17542s.g(cVar);
                    this.f136955c.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) {
            g(-1, new C16173c(f(i10), j()));
        }

        private final void o() {
            g(-1, new C16173c(C16174d.f136950a.a(j()), j()));
        }

        private final void p(int i10) {
            this.f136955c.add(new C16173c(f(i10), j()));
        }

        private final void q() {
            this.f136955c.add(new C16173c(C16174d.f136950a.a(j()), j()));
        }

        public final List<C16173c> e() {
            List<C16173c> t12 = C16877v.t1(this.f136955c);
            this.f136955c.clear();
            return t12;
        }

        public final C16773h j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long m10 = (long) m(i10, 127);
            if (!z10) {
                return this.f136956d.E1(m10);
            }
            C16770e eVar = new C16770e();
            C16181k.f137110a.b(this.f136956d, m10, eVar);
            return eVar.i0();
        }

        public final void k() {
            while (!this.f136956d.Y1()) {
                int d10 = C15864d.d(this.f136956d.readByte(), 255);
                if (d10 == 128) {
                    throw new IOException("index == 0");
                } else if ((d10 & 128) == 128) {
                    l(m(d10, 127) - 1);
                } else if (d10 == 64) {
                    o();
                } else if ((d10 & 64) == 64) {
                    n(m(d10, 63) - 1);
                } else if ((d10 & 32) == 32) {
                    int m10 = m(d10, 31);
                    this.f136954b = m10;
                    if (m10 < 0 || m10 > this.f136953a) {
                        throw new IOException("Invalid dynamic table size update " + this.f136954b);
                    }
                    a();
                } else if (d10 == 16 || d10 == 0) {
                    q();
                } else {
                    p(m(d10, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(N n10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(n10, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b \u0010$R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100*8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b0\u0010$¨\u00062"}, d2 = {"LOK/d$b;", "", "", "headerTableSizeSetting", "", "useCompression", "LWK/e;", "out", "<init>", "(IZLWK/e;)V", "LXH/N;", "b", "()V", "bytesToRecover", "c", "(I)I", "LOK/c;", "entry", "d", "(LOK/c;)V", "a", "", "headerBlock", "g", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "h", "(III)V", "LWK/h;", "data", "f", "(LWK/h;)V", "e", "(I)V", "I", "Z", "LWK/e;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[LOK/c;", "dynamicTable", "nextHeaderIndex", "i", "headerCount", "j", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.d$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f136961a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f136962b;

        /* renamed from: c  reason: collision with root package name */
        private final C16770e f136963c;

        /* renamed from: d  reason: collision with root package name */
        private int f136964d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f136965e;

        /* renamed from: f  reason: collision with root package name */
        public int f136966f;

        /* renamed from: g  reason: collision with root package name */
        public C16173c[] f136967g;

        /* renamed from: h  reason: collision with root package name */
        private int f136968h;

        /* renamed from: i  reason: collision with root package name */
        public int f136969i;

        /* renamed from: j  reason: collision with root package name */
        public int f136970j;

        public b(int i10, boolean z10, C16770e eVar) {
            C17542s.j(eVar, "out");
            this.f136961a = i10;
            this.f136962b = z10;
            this.f136963c = eVar;
            this.f136964d = Integer.MAX_VALUE;
            this.f136966f = i10;
            C16173c[] cVarArr = new C16173c[8];
            this.f136967g = cVarArr;
            this.f136968h = cVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f136966f;
            int i11 = this.f136970j;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                c(i11 - i10);
            }
        }

        private final void b() {
            C16870n.A(this.f136967g, (Object) null, 0, 0, 6, (Object) null);
            this.f136968h = this.f136967g.length - 1;
            this.f136969i = 0;
            this.f136970j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f136967g.length;
                while (true) {
                    length--;
                    i11 = this.f136968h;
                    if (length < i11 || i10 <= 0) {
                        C16173c[] cVarArr = this.f136967g;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f136969i);
                        C16173c[] cVarArr2 = this.f136967g;
                        int i13 = this.f136968h;
                        Arrays.fill(cVarArr2, i13 + 1, i13 + 1 + i12, (Object) null);
                        this.f136968h += i12;
                    } else {
                        C16173c cVar = this.f136967g[length];
                        C17542s.g(cVar);
                        i10 -= cVar.f136949c;
                        int i14 = this.f136970j;
                        C16173c cVar2 = this.f136967g[length];
                        C17542s.g(cVar2);
                        this.f136970j = i14 - cVar2.f136949c;
                        this.f136969i--;
                        i12++;
                    }
                }
                C16173c[] cVarArr3 = this.f136967g;
                System.arraycopy(cVarArr3, i11 + 1, cVarArr3, i11 + 1 + i12, this.f136969i);
                C16173c[] cVarArr22 = this.f136967g;
                int i132 = this.f136968h;
                Arrays.fill(cVarArr22, i132 + 1, i132 + 1 + i12, (Object) null);
                this.f136968h += i12;
            }
            return i12;
        }

        private final void d(C16173c cVar) {
            int i10 = cVar.f136949c;
            int i11 = this.f136966f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f136970j + i10) - i11);
            int i12 = this.f136969i + 1;
            C16173c[] cVarArr = this.f136967g;
            if (i12 > cVarArr.length) {
                C16173c[] cVarArr2 = new C16173c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f136968h = this.f136967g.length - 1;
                this.f136967g = cVarArr2;
            }
            int i13 = this.f136968h;
            this.f136968h = i13 - 1;
            this.f136967g[i13] = cVar;
            this.f136969i++;
            this.f136970j += i10;
        }

        public final void e(int i10) {
            this.f136961a = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f136966f;
            if (i11 != min) {
                if (min < i11) {
                    this.f136964d = Math.min(this.f136964d, min);
                }
                this.f136965e = true;
                this.f136966f = min;
                a();
            }
        }

        public final void f(C16773h hVar) {
            C17542s.j(hVar, "data");
            if (this.f136962b) {
                C16181k kVar = C16181k.f137110a;
                if (kVar.d(hVar) < hVar.W()) {
                    C16770e eVar = new C16770e();
                    kVar.c(hVar, eVar);
                    C16773h i02 = eVar.i0();
                    h(i02.W(), 127, 128);
                    this.f136963c.j2(i02);
                    return;
                }
            }
            h(hVar.W(), 127, 0);
            this.f136963c.j2(hVar);
        }

        public final void g(List<C16173c> list) {
            int i10;
            int i11;
            C17542s.j(list, "headerBlock");
            if (this.f136965e) {
                int i12 = this.f136964d;
                if (i12 < this.f136966f) {
                    h(i12, 31, 32);
                }
                this.f136965e = false;
                this.f136964d = Integer.MAX_VALUE;
                h(this.f136966f, 31, 32);
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                C16173c cVar = list.get(i13);
                C16773h a02 = cVar.f136947a.a0();
                C16773h hVar = cVar.f136948b;
                C16174d dVar = C16174d.f136950a;
                Integer num = dVar.b().get(a02);
                if (num != null) {
                    int intValue = num.intValue();
                    i10 = intValue + 1;
                    if (2 <= i10 && i10 < 8) {
                        if (C17542s.e(dVar.c()[intValue].f136948b, hVar)) {
                            i11 = i10;
                        } else if (C17542s.e(dVar.c()[i10].f136948b, hVar)) {
                            i11 = i10;
                            i10 = intValue + 2;
                        }
                    }
                    i11 = i10;
                    i10 = -1;
                } else {
                    i11 = -1;
                    i10 = -1;
                }
                if (i10 == -1) {
                    int i14 = this.f136968h + 1;
                    int length = this.f136967g.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        C16173c cVar2 = this.f136967g[i14];
                        C17542s.g(cVar2);
                        if (C17542s.e(cVar2.f136947a, a02)) {
                            C16173c cVar3 = this.f136967g[i14];
                            C17542s.g(cVar3);
                            if (C17542s.e(cVar3.f136948b, hVar)) {
                                i10 = C16174d.f136950a.c().length + (i14 - this.f136968h);
                                break;
                            } else if (i11 == -1) {
                                i11 = (i14 - this.f136968h) + C16174d.f136950a.c().length;
                            }
                        }
                        i14++;
                    }
                }
                if (i10 != -1) {
                    h(i10, 127, 128);
                } else if (i11 == -1) {
                    this.f136963c.Z1(64);
                    f(a02);
                    f(hVar);
                    d(cVar);
                } else if (!a02.X(C16173c.f136941e) || C17542s.e(C16173c.f136946j, a02)) {
                    h(i11, 63, 64);
                    f(hVar);
                    d(cVar);
                } else {
                    h(i11, 15, 0);
                    f(hVar);
                }
            }
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f136963c.Z1(i10 | i12);
                return;
            }
            this.f136963c.Z1(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f136963c.Z1(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f136963c.Z1(i13);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i10, boolean z10, C16770e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT : i10, (i11 & 2) != 0 ? true : z10, eVar);
        }
    }
}
