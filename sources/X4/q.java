package x4;

import HJ.C15850p;
import HJ.C15854t;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.v;
import YH.C16877v;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 \u001d2\u00020\u0001:\u0004GKMOB'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002¢\u0006\u0004\b!\u0010\"JC\u0010'\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002¢\u0006\u0004\b'\u0010(J1\u0010,\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b,\u0010-J3\u0010.\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%02H\u0002¢\u0006\u0004\b3\u00104J#\u00106\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u000105H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000fH\u0002¢\u0006\u0004\b8\u00101J\u0017\u0010:\u001a\u0002092\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b:\u0010;J/\u0010<\u001a\u0004\u0018\u00010\u00132\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0007¢\u0006\u0004\b<\u0010=J/\u0010>\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0000¢\u0006\u0004\b>\u0010=J\u0019\u0010@\u001a\u0002092\b\u0010?\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b@\u0010AJ\u001a\u0010C\u001a\u00020\u001c2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u000209H\u0016¢\u0006\u0004\bE\u0010FR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010JR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010HR\u001d\u0010Y\u001a\u0004\u0018\u00010T8BX\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001b\u0010\\\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010V\u001a\u0004\bZ\u0010[R'\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%028BX\u0002¢\u0006\f\n\u0004\b@\u0010V\u001a\u0004\b]\u00104R\u0016\u0010`\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010_R/\u0010c\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001058BX\u0002¢\u0006\f\n\u0004\ba\u0010V\u001a\u0004\bb\u00107R!\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8BX\u0002¢\u0006\f\n\u0004\bd\u0010V\u001a\u0004\bd\u0010eR\u001d\u0010h\u001a\u0004\u0018\u00010\u00028BX\u0002¢\u0006\f\n\u0004\bb\u0010V\u001a\u0004\bg\u0010JR\u001d\u0010j\u001a\u0004\u0018\u00010T8BX\u0002¢\u0006\f\n\u0004\bi\u0010V\u001a\u0004\bi\u0010XR\u0018\u0010k\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010HR\u001d\u0010m\u001a\u0004\u0018\u00010T8BX\u0002¢\u0006\f\n\u0004\b<\u0010V\u001a\u0004\bl\u0010XR*\u0010r\u001a\u00020\u001c2\u0006\u0010n\u001a\u00020\u001c8G@@X\u000e¢\u0006\u0012\n\u0004\b>\u0010_\u001a\u0004\bo\u0010[\"\u0004\bp\u0010qR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020#8@X\u0004¢\u0006\u0006\u001a\u0004\ba\u0010e¨\u0006t"}, d2 = {"Lx4/q;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "(Ljava/lang/String;)V", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "LXH/N;", "g", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "fragment", "Landroid/os/Bundle;", "bundle", "", "Lx4/i;", "arguments", "s", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Ljava/util/regex/Matcher;", "matcher", "", "q", "(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z", "Landroid/net/Uri;", "deepLink", "r", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "inputParams", "Lx4/q$d;", "storedParam", "E", "(Ljava/util/List;Lx4/q$d;Landroid/os/Bundle;Ljava/util/Map;)Z", "name", "value", "argument", "B", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lx4/i;)V", "C", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lx4/i;)Z", "G", "()V", "", "H", "()Ljava/util/Map;", "LXH/v;", "D", "()LXH/v;", "F", "", "u", "(Ljava/lang/String;)I", "o", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "p", "requestedLink", "h", "(Landroid/net/Uri;)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "b", "i", "c", "t", "d", "Ljava/util/List;", "pathArgs", "e", "pathRegex", "Ljava/util/regex/Pattern;", "f", "LXH/o;", "w", "()Ljava/util/regex/Pattern;", "pathPattern", "A", "()Z", "isParameterizedQuery", "x", "queryArgsMap", "Z", "isSingleQueryParamValueOnly", "j", "l", "fragArgsAndRegex", "k", "()Ljava/util/List;", "fragArgs", "n", "fragRegex", "m", "fragPattern", "mimeTypeRegex", "v", "mimeTypePattern", "<set-?>", "z", "setExactDeepLink$navigation_common_release", "(Z)V", "isExactDeepLink", "argumentsNames", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* renamed from: q  reason: collision with root package name */
    private static final b f57616q = new b((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f57617r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f57618s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a  reason: collision with root package name */
    private final String f57619a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57620b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57621c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f57622d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f57623e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o f57624f;

    /* renamed from: g  reason: collision with root package name */
    private final C16824o f57625g;

    /* renamed from: h  reason: collision with root package name */
    private final C16824o f57626h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f57627i;

    /* renamed from: j  reason: collision with root package name */
    private final C16824o f57628j;

    /* renamed from: k  reason: collision with root package name */
    private final C16824o f57629k;

    /* renamed from: l  reason: collision with root package name */
    private final C16824o f57630l;

    /* renamed from: m  reason: collision with root package name */
    private final C16824o f57631m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public String f57632n;

    /* renamed from: o  reason: collision with root package name */
    private final C16824o f57633o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f57634p;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\rB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lx4/q$a;", "", "<init>", "()V", "", "uriPattern", "d", "(Ljava/lang/String;)Lx4/q$a;", "action", "b", "mimeType", "c", "Lx4/q;", "a", "()Lx4/q;", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final C0927a f57635d = new C0927a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private String f57636a;

        /* renamed from: b  reason: collision with root package name */
        private String f57637b;

        /* renamed from: c  reason: collision with root package name */
        private String f57638c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/q$a$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: x4.q$a$a  reason: collision with other inner class name */
        public static final class C0927a {
            public /* synthetic */ C0927a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0927a() {
            }
        }

        public final q a() {
            return new q(this.f57636a, this.f57637b, this.f57638c);
        }

        public final a b(String str) {
            C17542s.j(str, "action");
            if (str.length() > 0) {
                this.f57637b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }

        public final a c(String str) {
            C17542s.j(str, "mimeType");
            this.f57638c = str;
            return this;
        }

        public final a d(String str) {
            C17542s.j(str, "uriPattern");
            this.f57636a = str;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lx4/q$b;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "FILL_IN_PATTERN", "Ljava/util/regex/Pattern;", "SCHEME_PATTERN", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0012"}, d2 = {"Lx4/q$c;", "", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "other", "", "a", "(Lx4/q$c;)I", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "setType", "type", "b", "setSubType", "subType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        private String f57639a;

        /* renamed from: b  reason: collision with root package name */
        private String f57640b;

        public c(String str) {
            List list;
            C17542s.j(str, "mimeType");
            List<String> m10 = new C15850p("/").m(str, 0);
            if (!m10.isEmpty()) {
                ListIterator<String> listIterator = m10.listIterator(m10.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            list = C16877v.k1(m10, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = C16877v.n();
            this.f57639a = (String) list.get(0);
            this.f57640b = (String) list.get(1);
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            C17542s.j(cVar, "other");
            int i10 = C17542s.e(this.f57639a, cVar.f57639a) ? 2 : 0;
            return C17542s.e(this.f57640b, cVar.f57640b) ? i10 + 1 : i10;
        }

        public final String b() {
            return this.f57640b;
        }

        public final String j() {
            return this.f57639a;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lx4/q$d;", "", "<init>", "()V", "", "name", "LXH/N;", "a", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "paramRegex", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f57641a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f57642b = new ArrayList();

        public final void a(String str) {
            C17542s.j(str, "name");
            this.f57642b.add(str);
        }

        public final List<String> b() {
            return this.f57642b;
        }

        public final String c() {
            return this.f57641a;
        }

        public final void d(String str) {
            this.f57641a = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<List<String>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57643c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(q qVar) {
            super(0);
            this.f57643c = qVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = (java.util.List) r0.c();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<java.lang.String> invoke() {
            /*
                r1 = this;
                x4.q r0 = r1.f57643c
                XH.v r0 = r0.l()
                if (r0 == 0) goto L_0x0010
                java.lang.Object r0 = r0.c()
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L_0x0015
            L_0x0010:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0015:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.q.e.invoke():java.util.List");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXH/v;", "", "", "b", "()LXH/v;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17631a<v<? extends List<String>, ? extends String>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57644c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(q qVar) {
            super(0);
            this.f57644c = qVar;
        }

        /* renamed from: b */
        public final v<List<String>, String> invoke() {
            return this.f57644c.D();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "b", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17631a<Pattern> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57645c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(q qVar) {
            super(0);
            this.f57645c = qVar;
        }

        /* renamed from: b */
        public final Pattern invoke() {
            String b10 = this.f57645c.n();
            if (b10 != null) {
                return Pattern.compile(b10, 2);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57646c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(q qVar) {
            super(0);
            this.f57646c = qVar;
        }

        /* renamed from: b */
        public final String invoke() {
            v a10 = this.f57646c.l();
            if (a10 != null) {
                return (String) a10.d();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "argName", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<String, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f57647c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Bundle bundle) {
            super(1);
            this.f57647c = bundle;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C17542s.j(str, "argName");
            return Boolean.valueOf(!this.f57647c.containsKey(str));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57648c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(q qVar) {
            super(0);
            this.f57648c = qVar;
        }

        public final Boolean invoke() {
            return Boolean.valueOf((this.f57648c.y() == null || Uri.parse(this.f57648c.y()).getQuery() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "b", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    static final class k extends C17544u implements C17631a<Pattern> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57649c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(q qVar) {
            super(0);
            this.f57649c = qVar;
        }

        /* renamed from: b */
        public final Pattern invoke() {
            String c10 = this.f57649c.f57632n;
            if (c10 != null) {
                return Pattern.compile(c10);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "b", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    static final class l extends C17544u implements C17631a<Pattern> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57650c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(q qVar) {
            super(0);
            this.f57650c = qVar;
        }

        /* renamed from: b */
        public final Pattern invoke() {
            String d10 = this.f57650c.f57623e;
            if (d10 != null) {
                return Pattern.compile(d10, 2);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lx4/q$d;", "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements C17631a<Map<String, d>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57651c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(q qVar) {
            super(0);
            this.f57651c = qVar;
        }

        /* renamed from: b */
        public final Map<String, d> invoke() {
            return this.f57651c.H();
        }
    }

    public q(String str, String str2, String str3) {
        this.f57619a = str;
        this.f57620b = str2;
        this.f57621c = str3;
        this.f57622d = new ArrayList();
        this.f57624f = C16825p.b(new l(this));
        this.f57625g = C16825p.b(new j(this));
        s sVar = s.NONE;
        this.f57626h = C16825p.a(sVar, new m(this));
        this.f57628j = C16825p.a(sVar, new f(this));
        this.f57629k = C16825p.a(sVar, new e(this));
        this.f57630l = C16825p.a(sVar, new h(this));
        this.f57631m = C16825p.b(new g(this));
        this.f57633o = C16825p.b(new k(this));
        G();
        F();
    }

    private final boolean A() {
        return ((Boolean) this.f57625g.getValue()).booleanValue();
    }

    private final void B(Bundle bundle, String str, String str2, C8945i iVar) {
        if (iVar != null) {
            iVar.a().d(bundle, str, str2);
        } else {
            bundle.putString(str, str2);
        }
    }

    private final boolean C(Bundle bundle, String str, String str2, C8945i iVar) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (iVar == null) {
            return false;
        }
        F<Object> a10 = iVar.a();
        a10.e(bundle, str, str2, a10.a(bundle, str));
        return false;
    }

    /* access modifiers changed from: private */
    public final v<List<String>, String> D() {
        String str = this.f57619a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f57619a).getFragment();
        StringBuilder sb2 = new StringBuilder();
        C17542s.g(fragment);
        g(fragment, arrayList, sb2);
        String sb3 = sb2.toString();
        C17542s.i(sb3, "fragRegex.toString()");
        return C16796C.a(arrayList, sb3);
    }

    private final boolean E(List<String> list, d dVar, Bundle bundle, Map<String, C8945i> map) {
        Object obj;
        Bundle b10 = D2.d.b(new v[0]);
        Iterator it = dVar.b().iterator();
        while (true) {
            F<Object> f10 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            C8945i iVar = map.get(str);
            if (iVar != null) {
                f10 = iVar.a();
            }
            if ((f10 instanceof C8940d) && !iVar.b()) {
                f10.h(b10, str, ((C8940d) f10).k());
            }
        }
        for (String str2 : list) {
            String c10 = dVar.c();
            Matcher matcher = c10 != null ? Pattern.compile(c10, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            Iterable b11 = dVar.b();
            ArrayList arrayList = new ArrayList(C16877v.y(b11, 10));
            int i10 = 0;
            for (Object next : b11) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                String str3 = (String) next;
                String group = matcher.group(i11);
                if (group == null) {
                    group = "";
                } else {
                    C17542s.i(group, "argMatcher.group(index + 1) ?: \"\"");
                }
                C8945i iVar2 = map.get(str3);
                try {
                    if (!b10.containsKey(str3)) {
                        B(b10, str3, group, iVar2);
                        obj = C16807N.f139792a;
                    } else {
                        obj = Boolean.valueOf(C(b10, str3, group, iVar2));
                    }
                } catch (IllegalArgumentException unused) {
                    obj = C16807N.f139792a;
                }
                arrayList.add(obj);
                i10 = i11;
            }
        }
        bundle.putAll(b10);
        return true;
    }

    private final void F() {
        if (this.f57621c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f57621c).matches()) {
                c cVar = new c(this.f57621c);
                this.f57632n = C15854t.Q("^(" + cVar.j() + "|[*]+)/(" + cVar.b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
                return;
            }
            throw new IllegalArgumentException(("The given mimeType " + this.f57621c + " does not match to required \"type/subtype\" format").toString());
        }
    }

    private final void G() {
        if (this.f57619a != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f57617r.matcher(this.f57619a).find()) {
                sb2.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f57619a);
            matcher.find();
            boolean z10 = false;
            String substring = this.f57619a.substring(0, matcher.start());
            C17542s.i(substring, "substring(...)");
            g(substring, this.f57622d, sb2);
            if (!C15854t.d0(sb2, ".*", false, 2, (Object) null) && !C15854t.d0(sb2, "([^/]+?)", false, 2, (Object) null)) {
                z10 = true;
            }
            this.f57634p = z10;
            sb2.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb3 = sb2.toString();
            C17542s.i(sb3, "uriRegex.toString()");
            this.f57623e = C15854t.Q(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final Map<String, d> H() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri parse = Uri.parse(this.f57619a);
        for (String next : parse.getQueryParameterNames()) {
            StringBuilder sb2 = new StringBuilder();
            List<String> queryParameters = parse.getQueryParameters(next);
            if (queryParameters.size() <= 1) {
                C17542s.i(queryParameters, "queryParams");
                String str = (String) C16877v.y0(queryParameters);
                if (str == null) {
                    this.f57627i = true;
                    str = next;
                }
                Matcher matcher = f57618s.matcher(str);
                d dVar = new d();
                int i10 = 0;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    C17542s.h(group, "null cannot be cast to non-null type kotlin.String");
                    dVar.a(group);
                    C17542s.i(str, "queryParam");
                    String substring = str.substring(i10, matcher.start());
                    C17542s.i(substring, "substring(...)");
                    sb2.append(Pattern.quote(substring));
                    sb2.append("(.+?)?");
                    i10 = matcher.end();
                }
                if (i10 < str.length()) {
                    C17542s.i(str, "queryParam");
                    String substring2 = str.substring(i10);
                    C17542s.i(substring2, "substring(...)");
                    sb2.append(Pattern.quote(substring2));
                }
                String sb3 = sb2.toString();
                C17542s.i(sb3, "argRegex.toString()");
                dVar.d(C15854t.Q(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null));
                C17542s.i(next, "paramName");
                linkedHashMap.put(next, dVar);
            } else {
                throw new IllegalArgumentException(("Query parameter " + next + " must only be present once in " + this.f57619a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
        }
        return linkedHashMap;
    }

    private final void g(String str, List<String> list, StringBuilder sb2) {
        Matcher matcher = f57618s.matcher(str);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            C17542s.h(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i10) {
                String substring = str.substring(i10, matcher.start());
                C17542s.i(substring, "substring(...)");
                sb2.append(Pattern.quote(substring));
            }
            sb2.append("([^/]*?|)");
            i10 = matcher.end();
        }
        if (i10 < str.length()) {
            String substring2 = str.substring(i10);
            C17542s.i(substring2, "substring(...)");
            sb2.append(Pattern.quote(substring2));
        }
    }

    private final List<String> k() {
        return (List) this.f57629k.getValue();
    }

    /* access modifiers changed from: private */
    public final v<List<String>, String> l() {
        return (v) this.f57628j.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.f57631m.getValue();
    }

    /* access modifiers changed from: private */
    public final String n() {
        return (String) this.f57630l.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map<String, C8945i> map) {
        Iterable iterable = this.f57622d;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i11));
            C8945i iVar = map.get(str);
            try {
                C17542s.i(decode, "value");
                B(bundle, str, decode, iVar);
                arrayList.add(C16807N.f139792a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(Uri uri, Bundle bundle, Map<String, C8945i> map) {
        String query;
        for (Map.Entry next : x().entrySet()) {
            d dVar = (d) next.getValue();
            List<String> queryParameters = uri.getQueryParameters((String) next.getKey());
            if (this.f57627i && (query = uri.getQuery()) != null && !C17542s.e(query, uri.toString())) {
                queryParameters = C16877v.e(query);
            }
            C17542s.i(queryParameters, "inputParams");
            if (!E(queryParameters, dVar, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String str, Bundle bundle, Map<String, C8945i> map) {
        Pattern m10 = m();
        Matcher matcher = m10 != null ? m10.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            Iterable k10 = k();
            ArrayList arrayList = new ArrayList(C16877v.y(k10, 10));
            int i10 = 0;
            for (Object next : k10) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                String str2 = (String) next;
                String decode = Uri.decode(matcher.group(i11));
                C8945i iVar = map.get(str2);
                try {
                    C17542s.i(decode, "value");
                    B(bundle, str2, decode, iVar);
                    arrayList.add(C16807N.f139792a);
                    i10 = i11;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final Pattern v() {
        return (Pattern) this.f57633o.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.f57624f.getValue();
    }

    private final Map<String, d> x() {
        return (Map) this.f57626h.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return C17542s.e(this.f57619a, qVar.f57619a) && C17542s.e(this.f57620b, qVar.f57620b) && C17542s.e(this.f57621c, qVar.f57621c);
    }

    public final int h(Uri uri) {
        if (uri == null || this.f57619a == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.f57619a).getPathSegments();
        C17542s.i(pathSegments, "requestedPathSegments");
        C17542s.i(pathSegments2, "uriPathSegments");
        return C16877v.C0(pathSegments, pathSegments2).size();
    }

    public int hashCode() {
        String str = this.f57619a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f57620b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f57621c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String i() {
        return this.f57620b;
    }

    public final List<String> j() {
        Collection collection = this.f57622d;
        ArrayList arrayList = new ArrayList();
        for (d b10 : x().values()) {
            C16877v.E(arrayList, b10.b());
        }
        return C16877v.V0(C16877v.V0(collection, arrayList), k());
    }

    public final Bundle o(Uri uri, Map<String, C8945i> map) {
        C17542s.j(uri, "deepLink");
        C17542s.j(map, "arguments");
        Pattern w10 = w();
        Matcher matcher = w10 != null ? w10.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, map)) {
            return null;
        }
        if (A() && !r(uri, bundle, map)) {
            return null;
        }
        s(uri.getFragment(), bundle, map);
        if (!C8947k.a(map, new i(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final Bundle p(Uri uri, Map<String, C8945i> map) {
        C17542s.j(map, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern w10 = w();
        Matcher matcher = w10 != null ? w10.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, map);
        if (A()) {
            r(uri, bundle, map);
        }
        return bundle;
    }

    public final String t() {
        return this.f57621c;
    }

    public final int u(String str) {
        C17542s.j(str, "mimeType");
        if (this.f57621c != null) {
            Pattern v10 = v();
            C17542s.g(v10);
            if (v10.matcher(str).matches()) {
                return new c(this.f57621c).compareTo(new c(str));
            }
        }
        return -1;
    }

    public final String y() {
        return this.f57619a;
    }

    public final boolean z() {
        return this.f57634p;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public q(String str) {
        this(str, (String) null, (String) null);
        C17542s.j(str, "uri");
    }
}
