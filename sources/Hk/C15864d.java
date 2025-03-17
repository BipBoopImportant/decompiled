package HK;

import GK.C15775C;
import GK.C15776D;
import GK.C15777E;
import GK.C15786e;
import GK.C15799r;
import GK.C15802u;
import GK.C15803v;
import GK.C15805x;
import GK.z;
import HJ.C15838d;
import HJ.C15850p;
import HJ.C15854t;
import OK.C16173c;
import WK.C16760C;
import WK.C16770e;
import WK.C16771f;
import WK.C16772g;
import WK.C16773h;
import WK.N;
import XH.C16816g;
import YH.C16870n;
import YH.C16877v;
import YH.U;
import YH.X;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010,\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b0\u00101\u001a\u0015\u00102\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b2\u00101\u001a)\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u0002040\u000e\"\u000204¢\u0006\u0004\b6\u00107\u001a\u0019\u0010;\u001a\u000209*\u0002082\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a'\u0010@\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010B\u001a\u00020\u001b*\u00020*¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010G\u001a\u00020F*\b\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020E0D*\u00020F¢\u0006\u0004\bI\u0010J\u001a\u0019\u0010K\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010O\u001a\u00020N*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u001c\u0010S\u001a\u00020\u001b*\u00020Q2\u0006\u0010R\u001a\u00020\u001bH\u0004¢\u0006\u0004\bS\u0010T\u001a\u001c\u0010V\u001a\u00020\u001b*\u00020U2\u0006\u0010R\u001a\u00020\u001bH\u0004¢\u0006\u0004\bV\u0010W\u001a\u001c\u0010X\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010R\u001a\u00020\u0000H\u0004¢\u0006\u0004\bX\u0010Y\u001a\u0019\u0010\\\u001a\u00020\u0004*\u00020Z2\u0006\u0010[\u001a\u00020\u001b¢\u0006\u0004\b\\\u0010]\u001a\u0011\u0010^\u001a\u00020\u001b*\u000208¢\u0006\u0004\b^\u0010_\u001a!\u0010b\u001a\u00020\t*\u00020`2\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\bb\u0010c\u001a!\u0010e\u001a\u00020\t*\u00020`2\u0006\u0010d\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\be\u0010c\u001a\u0011\u0010g\u001a\u00020\u0007*\u00020f¢\u0006\u0004\bg\u0010h\u001a\u0019\u0010j\u001a\u00020\t*\u00020f2\u0006\u0010i\u001a\u000208¢\u0006\u0004\bj\u0010k\u001a\u0019\u0010n\u001a\u00020\u001b*\u00020l2\u0006\u0010m\u001a\u00020Q¢\u0006\u0004\bn\u0010o\u001a\u001b\u0010p\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bp\u0010q\u001a\u0011\u0010s\u001a\u00020\u0000*\u00020r¢\u0006\u0004\bs\u0010t\u001a\u0019\u0010v\u001a\u00020\u0000*\u00020\u00072\u0006\u0010u\u001a\u00020\u0000¢\u0006\u0004\bv\u0010w\u001a\u001b\u0010x\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010u\u001a\u00020\u001b¢\u0006\u0004\bx\u0010q\u001a#\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010y*\b\u0012\u0004\u0012\u00028\u00000D¢\u0006\u0004\bz\u0010{\u001a/\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010y2\u0012\u0010|\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0004\b}\u0010~\u001a:\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010;\"\u0004\b\u0001\u0010*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0015\u0010\u0001\u001a\u00020\u0004*\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0014\u0010\u0001\u001a\u00020\u0004*\u00020f¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u001f\u0010\u0001\u001a\u00020\t*\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0012\u0010y\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0005\by\u0010\u0001\u001a\u0014\u0010\u0001\u001a\u00020\u0007*\u00020\u001b¢\u0006\u0006\b\u0001\u0010\u0001\u001a,\u0010\u0001\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0012*\t\u0012\u0004\u0012\u00028\u00000\u00012\u0007\u0010\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b\u0001\u0010\u0001\u001a0\u0010\u0001\u001a\u00030\u0001*\b0\u0001j\u0003`\u00012\u0013\u0010\u0001\u001a\u000e\u0012\n\u0012\b0\u0001j\u0003`\u00010D¢\u0006\u0006\b\u0001\u0010\u0001\"\u0018\u0010\u0001\u001a\u00030\u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"\u0016\u0010\u0001\u001a\u00020F8\u0006X\u0004¢\u0006\u0007\n\u0005\bm\u0010\u0001\"\u0018\u0010¢\u0001\u001a\u00030 \u00018\u0006X\u0004¢\u0006\b\n\u0006\b\u0001\u0010¡\u0001\"\u0017\u0010¥\u0001\u001a\u00030£\u00018\u0006X\u0004¢\u0006\u0007\n\u0005\bS\u0010¤\u0001\"\u0017\u0010¨\u0001\u001a\u00030¦\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bV\u0010§\u0001\"\u0017\u0010«\u0001\u001a\u00030©\u00018\u0006X\u0004¢\u0006\u0007\n\u0005\bX\u0010ª\u0001\"\u0017\u0010®\u0001\u001a\u00030¬\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bO\u0010­\u0001\"\u0016\u0010°\u0001\u001a\u00020\t8\u0000X\u0004¢\u0006\u0007\n\u0005\b¯\u0001\u0010x\"\u0016\u0010²\u0001\u001a\u00020\u00078\u0000X\u0004¢\u0006\u0007\n\u0005\b0\u0010±\u0001¨\u0006³\u0001"}, d2 = {"", "arrayLength", "offset", "count", "LXH/N;", "l", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "O", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", "other", "Ljava/util/Comparator;", "comparator", "E", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "u", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "LGK/v;", "includeDefaultPort", "U", "(LGK/v;Z)Ljava/lang/String;", "value", "", "x", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "o", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "z", "(Ljava/lang/String;II)I", "B", "a0", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "q", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "p", "(Ljava/lang/String;CII)I", "y", "(Ljava/lang/String;)I", "i", "(Ljava/lang/String;)Z", "H", "format", "", "args", "t", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "LWK/g;", "Ljava/nio/charset/Charset;", "default", "K", "(LWK/g;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "k", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "I", "(C)I", "", "LOK/c;", "LGK/u;", "R", "(Ljava/util/List;)LGK/u;", "Q", "(LGK/u;)Ljava/util/List;", "j", "(LGK/v;LGK/v;)Z", "LGK/r;", "LGK/r$c;", "g", "(LGK/r;)LGK/r$c;", "", "mask", "d", "(BI)I", "", "e", "(SI)I", "f", "(IJ)J", "LWK/f;", "medium", "d0", "(LWK/f;I)V", "L", "(LWK/g;)I", "LWK/N;", "timeUnit", "N", "(LWK/N;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "s", "Ljava/net/Socket;", "J", "(Ljava/net/Socket;)Ljava/lang/String;", "source", "G", "(Ljava/net/Socket;LWK/g;)Z", "LWK/e;", "b", "M", "(LWK/e;B)I", "D", "(Ljava/lang/String;I)I", "LGK/D;", "v", "(LGK/D;)J", "defaultValue", "Y", "(Ljava/lang/String;J)J", "Z", "T", "W", "(Ljava/util/List;)Ljava/util/List;", "elements", "w", "([Ljava/lang/Object;)Ljava/util/List;", "V", "", "X", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "m", "(Ljava/io/Closeable;)V", "n", "(Ljava/net/Socket;)V", "LPK/a;", "Ljava/io/File;", "file", "F", "(LPK/a;Ljava/io/File;)Z", "(J)Ljava/lang/String;", "S", "(I)Ljava/lang/String;", "", "element", "c", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "c0", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", "a", "[B", "EMPTY_BYTE_ARRAY", "LGK/u;", "EMPTY_HEADERS", "LGK/E;", "LGK/E;", "EMPTY_RESPONSE", "LGK/C;", "LGK/C;", "EMPTY_REQUEST", "LWK/C;", "LWK/C;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "LHJ/p;", "LHJ/p;", "VERIFY_AS_IP_ADDRESS", "h", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: HK.d  reason: case insensitive filesystem */
public final class C15864d {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f135356a;

    /* renamed from: b  reason: collision with root package name */
    public static final C15802u f135357b = C15802u.f135106b.h(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final C15777E f135358c;

    /* renamed from: d  reason: collision with root package name */
    public static final C15775C f135359d;

    /* renamed from: e  reason: collision with root package name */
    private static final C16760C f135360e;

    /* renamed from: f  reason: collision with root package name */
    public static final TimeZone f135361f;

    /* renamed from: g  reason: collision with root package name */
    private static final C15850p f135362g = new C15850p("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f135363h = false;

    /* renamed from: i  reason: collision with root package name */
    public static final String f135364i;

    static {
        byte[] bArr = new byte[0];
        f135356a = bArr;
        f135358c = C15777E.b.e(C15777E.f134826b, bArr, (C15805x) null, 1, (Object) null);
        f135359d = C15775C.a.k(C15775C.f134790a, bArr, (C15805x) null, 0, 0, 7, (Object) null);
        C16760C.a aVar = C16760C.f139587d;
        C16773h.a aVar2 = C16773h.f139664d;
        f135360e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C17542s.g(timeZone);
        f135361f = timeZone;
        String name = z.class.getName();
        C17542s.i(name, "OkHttpClient::class.java.name");
        f135364i = C15854t.P0(C15854t.O0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        C17542s.j(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i12 == i10) {
                        break;
                    }
                    i12--;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        C17542s.j(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != 9) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C17542s.j(strArr, "<this>");
        C17542s.j(strArr2, "other");
        C17542s.j(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        jI.C17416c.a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        jI.C17416c.a(r0, (java.lang.Throwable) null);
        r3.g(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean F(PK.C16212a r3, java.io.File r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            WK.L r0 = r3.e(r4)
            r1 = 0
            r3.g(r4)     // Catch:{ IOException -> 0x0019 }
            jI.C17416c.a(r0, r1)
            r3 = 1
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            XH.N r2 = XH.C16807N.f139792a     // Catch:{ all -> 0x0017 }
            jI.C17416c.a(r0, r1)
            r3.g(r4)
            r3 = 0
            return r3
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            jI.C17416c.a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: HK.C15864d.F(PK.a, java.io.File):boolean");
    }

    public static final boolean G(Socket socket, C16772g gVar) {
        int soTimeout;
        C17542s.j(socket, "<this>");
        C17542s.j(gVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z10 = !gVar.Y1();
            socket.setSoTimeout(soTimeout);
            return z10;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th2) {
            socket.setSoTimeout(soTimeout);
            throw th2;
        }
    }

    public static final boolean H(String str) {
        C17542s.j(str, "name");
        return C15854t.H(str, "Authorization", true) || C15854t.H(str, "Cookie", true) || C15854t.H(str, "Proxy-Authorization", true) || C15854t.H(str, "Set-Cookie", true);
    }

    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final String J(Socket socket) {
        C17542s.j(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        C17542s.i(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset K(C16772g gVar, Charset charset) {
        C17542s.j(gVar, "<this>");
        C17542s.j(charset, "default");
        int z12 = gVar.z1(f135360e);
        if (z12 == -1) {
            return charset;
        }
        if (z12 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            C17542s.i(charset2, "UTF_8");
            return charset2;
        } else if (z12 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            C17542s.i(charset3, "UTF_16BE");
            return charset3;
        } else if (z12 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            C17542s.i(charset4, "UTF_16LE");
            return charset4;
        } else if (z12 == 3) {
            return C15838d.f135278a.a();
        } else {
            if (z12 == 4) {
                return C15838d.f135278a.b();
            }
            throw new AssertionError();
        }
    }

    public static final int L(C16772g gVar) {
        C17542s.j(gVar, "<this>");
        return d(gVar.readByte(), 255) | (d(gVar.readByte(), 255) << 16) | (d(gVar.readByte(), 255) << 8);
    }

    public static final int M(C16770e eVar, byte b10) {
        C17542s.j(eVar, "<this>");
        int i10 = 0;
        while (!eVar.Y1() && eVar.u(0) == b10) {
            i10++;
            eVar.readByte();
        }
        return i10;
    }

    public static final boolean N(N n10, int i10, TimeUnit timeUnit) {
        C17542s.j(n10, "<this>");
        C17542s.j(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c10 = n10.y().e() ? n10.y().c() - nanoTime : Long.MAX_VALUE;
        n10.y().d(Math.min(c10, timeUnit.toNanos((long) i10)) + nanoTime);
        try {
            C16770e eVar = new C16770e();
            while (n10.u0(eVar, 8192) != -1) {
                eVar.c();
            }
            if (c10 == Long.MAX_VALUE) {
                n10.y().a();
            } else {
                n10.y().d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c10 == Long.MAX_VALUE) {
                n10.y().a();
            } else {
                n10.y().d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th2) {
            if (c10 == Long.MAX_VALUE) {
                n10.y().a();
            } else {
                n10.y().d(nanoTime + c10);
            }
            throw th2;
        }
    }

    public static final ThreadFactory O(String str, boolean z10) {
        C17542s.j(str, "name");
        return new C15863c(str, z10);
    }

    /* access modifiers changed from: private */
    public static final Thread P(String str, boolean z10, Runnable runnable) {
        C17542s.j(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List<C16173c> Q(C15802u uVar) {
        C17542s.j(uVar, "<this>");
        C17974j w10 = C17978n.w(0, uVar.size());
        ArrayList arrayList = new ArrayList(C16877v.y(w10, 10));
        Iterator it = w10.iterator();
        while (it.hasNext()) {
            int c10 = ((U) it).c();
            arrayList.add(new C16173c(uVar.k(c10), uVar.t(c10)));
        }
        return arrayList;
    }

    public static final C15802u R(List<C16173c> list) {
        C17542s.j(list, "<this>");
        C15802u.a aVar = new C15802u.a();
        for (C16173c next : list) {
            aVar.d(next.a().c0(), next.b().c0());
        }
        return aVar.f();
    }

    public static final String S(int i10) {
        String hexString = Integer.toHexString(i10);
        C17542s.i(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String T(long j10) {
        String hexString = Long.toHexString(j10);
        C17542s.i(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String U(C15803v vVar, boolean z10) {
        String str;
        C17542s.j(vVar, "<this>");
        if (C15854t.d0(vVar.i(), ":", false, 2, (Object) null)) {
            str = '[' + vVar.i() + ']';
        } else {
            str = vVar.i();
        }
        if (!z10 && vVar.o() == C15803v.f135109k.c(vVar.t())) {
            return str;
        }
        return str + ':' + vVar.o();
    }

    public static /* synthetic */ String V(C15803v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return U(vVar, z10);
    }

    public static final <T> List<T> W(List<? extends T> list) {
        C17542s.j(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(C16877v.w1(list));
        C17542s.i(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> X(Map<K, ? extends V> map) {
        C17542s.j(map, "<this>");
        if (map.isEmpty()) {
            return X.j();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C17542s.i(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long Y(String str, long j10) {
        C17542s.j(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int Z(String str, int i10) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String a0(String str, int i10, int i11) {
        C17542s.j(str, "<this>");
        int z10 = z(str, i10, i11);
        String substring = str.substring(z10, B(str, z10, i11));
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String b0(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return a0(str, i10, i11);
    }

    public static final <E> void c(List<E> list, E e10) {
        C17542s.j(list, "<this>");
        if (!list.contains(e10)) {
            list.add(e10);
        }
    }

    public static final Throwable c0(Exception exc, List<? extends Exception> list) {
        C17542s.j(exc, "<this>");
        C17542s.j(list, "suppressed");
        for (Exception a10 : list) {
            C16816g.a(exc, a10);
        }
        return exc;
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final void d0(C16771f fVar, int i10) {
        C17542s.j(fVar, "<this>");
        fVar.Z1((i10 >>> 16) & 255);
        fVar.Z1((i10 >>> 8) & 255);
        fVar.Z1(i10 & 255);
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final C15799r.c g(C15799r rVar) {
        C17542s.j(rVar, "<this>");
        return new C15862b(rVar);
    }

    /* access modifiers changed from: private */
    public static final C15799r h(C15799r rVar, C15786e eVar) {
        C17542s.j(rVar, "$this_asFactory");
        C17542s.j(eVar, "it");
        return rVar;
    }

    public static final boolean i(String str) {
        C17542s.j(str, "<this>");
        return f135362g.i(str);
    }

    public static final boolean j(C15803v vVar, C15803v vVar2) {
        C17542s.j(vVar, "<this>");
        C17542s.j(vVar2, "other");
        return C17542s.e(vVar.i(), vVar2.i()) && vVar.o() == vVar2.o() && C17542s.e(vVar.t(), vVar2.t());
    }

    public static final int k(String str, long j10, TimeUnit timeUnit) {
        C17542s.j(str, "name");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j10);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException((str + " too large.").toString());
            } else if (millis != 0 || i10 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException((str + " too small.").toString());
            }
        } else {
            throw new IllegalStateException("unit == null");
        }
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        C17542s.j(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        C17542s.j(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!C17542s.e(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String str) {
        C17542s.j(strArr, "<this>");
        C17542s.j(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C16870n.n0(strArr2)] = str;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        C17542s.j(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int q(String str, String str2, int i10, int i11) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "delimiters");
        while (i10 < i11) {
            if (C15854t.c0(str2, str.charAt(i10), false, 2, (Object) null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(N n10, int i10, TimeUnit timeUnit) {
        C17542s.j(n10, "<this>");
        C17542s.j(timeUnit, "timeUnit");
        try {
            return N(n10, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String str, Object... objArr) {
        C17542s.j(str, "format");
        C17542s.j(objArr, "args");
        V v10 = V.f144353a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C17542s.i(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C17542s.j(strArr, "<this>");
        C17542s.j(comparator, "comparator");
        if (!(strArr.length == 0 || strArr2 == null || strArr2.length == 0)) {
            for (String str : strArr) {
                Iterator a10 = C17527c.a(strArr2);
                while (a10.hasNext()) {
                    if (comparator.compare(str, (String) a10.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(C15776D d10) {
        C17542s.j(d10, "<this>");
        String b10 = d10.q().b("Content-Length");
        if (b10 != null) {
            return Y(b10, -1);
        }
        return -1;
    }

    @SafeVarargs
    public static final <T> List<T> w(T... tArr) {
        C17542s.j(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C16877v.q(Arrays.copyOf(objArr, objArr.length)));
        C17542s.i(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int x(String[] strArr, String str, Comparator<String> comparator) {
        C17542s.j(strArr, "<this>");
        C17542s.j(str, "value");
        C17542s.j(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        C17542s.j(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (C17542s.l(charAt, 31) <= 0 || C17542s.l(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        C17542s.j(str, "<this>");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
