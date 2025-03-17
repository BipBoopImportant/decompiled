package x4;

import C4.j;
import GJ.C15765h;
import GJ.C15768k;
import HJ.C15854t;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.C16869m;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fK.z;
import j0.c0;
import j0.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import uI.C18055d;
import x4.q;
import y4.C8977a;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 !2\u00020\u0001:\u0002GLB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u0002H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020\u001cH\u0017¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020+2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0010H\u0017¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u00020\u00172\b\b\u0001\u00104\u001a\u0002032\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u000e¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\u0004\u0018\u00010.2\b\u0010=\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0002H\u0016¢\u0006\u0004\b@\u0010AJ\u001a\u0010C\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u000203H\u0016¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010AR.\u0010R\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8\u0006@GX\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010HR$\u0010\\\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\t0]8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u0002050a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\"\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR,\u0010i\u001a\u0002032\b\b\u0001\u0010i\u001a\u0002038G@FX\u000e¢\u0006\u0012\n\u0004\bj\u0010%\u001a\u0004\bk\u0010F\"\u0004\bl\u0010mR.\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b;\u0010H\u001a\u0004\bn\u0010A\"\u0004\bo\u0010\u0005R\u001e\u0010s\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010p8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020\u00028WX\u0004¢\u0006\u0006\u001a\u0004\bv\u0010A¨\u0006x"}, d2 = {"Lx4/v;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Lx4/I;", "navigator", "(Lx4/I;)V", "Lx4/q;", "deepLink", "Landroid/net/Uri;", "uri", "", "Lx4/i;", "arguments", "", "F", "(Lx4/q;Landroid/net/Uri;Ljava/util/Map;)Z", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "LXH/N;", "J", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "D", "(Landroid/net/Uri;)Z", "Lx4/u;", "deepLinkRequest", "E", "(Lx4/u;)Z", "navDeepLink", "k", "(Lx4/q;)V", "route", "Lx4/v$b;", "I", "(Ljava/lang/String;)Lx4/v$b;", "navDeepLinkRequest", "H", "(Lx4/u;)Lx4/v$b;", "previousDestination", "", "p", "(Lx4/v;)[I", "Landroid/os/Bundle;", "G", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Q", "()Z", "", "actionId", "Lx4/h;", "action", "K", "(ILx4/h;)V", "argumentName", "argument", "i", "(Ljava/lang/String;Lx4/i;)V", "args", "m", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "A", "Lx4/x;", "<set-?>", "b", "Lx4/x;", "B", "()Lx4/x;", "O", "(Lx4/x;)V", "parent", "c", "idName", "", "d", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "M", "(Ljava/lang/CharSequence;)V", "label", "", "e", "Ljava/util/List;", "deepLinks", "Lj0/c0;", "f", "Lj0/c0;", "actions", "", "g", "Ljava/util/Map;", "_arguments", "id", "h", "x", "L", "(I)V", "C", "P", "LXH/o;", "j", "LXH/o;", "routeDeepLink", "s", "()Ljava/util/Map;", "t", "displayName", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class v {

    /* renamed from: k  reason: collision with root package name */
    public static final a f57671k = new a((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    private static final Map<String, Class<?>> f57672l = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final String f57673a;

    /* renamed from: b  reason: collision with root package name */
    private x f57674b;

    /* renamed from: c  reason: collision with root package name */
    private String f57675c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f57676d;

    /* renamed from: e  reason: collision with root package name */
    private final List<q> f57677e;

    /* renamed from: f  reason: collision with root package name */
    private final c0<C8944h> f57678f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Map<String, C8945i> f57679g;

    /* renamed from: h  reason: collision with root package name */
    private int f57680h;

    /* renamed from: i  reason: collision with root package name */
    private String f57681i;

    /* renamed from: j  reason: collision with root package name */
    private C16824o<q> f57682j;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u000e*\u00020\u0001*\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014*\u00020\u000f8FX\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lx4/v$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "id", "", "b", "(Landroid/content/Context;I)Ljava/lang/String;", "route", "a", "(Ljava/lang/String;)Ljava/lang/String;", "T", "Lx4/v;", "LuI/d;", "", "d", "(Lx4/v;LuI/d;)Z", "LGJ/h;", "c", "(Lx4/v;)LGJ/h;", "getHierarchy$annotations", "(Lx4/v;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/v;", "it", "a", "(Lx4/v;)Lx4/v;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x4.v$a$a  reason: collision with other inner class name */
        static final class C0928a extends C17544u implements C17642l<v, v> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0928a f57683c = new C0928a();

            C0928a() {
                super(1);
            }

            /* renamed from: a */
            public final v invoke(v vVar) {
                C17542s.j(vVar, "it");
                return vVar.B();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final String b(Context context, int i10) {
            String str;
            C17542s.j(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                str = context.getResources().getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                str = String.valueOf(i10);
            }
            C17542s.i(str, "try {\n                  …tring()\n                }");
            return str;
        }

        public final C15765h<v> c(v vVar) {
            C17542s.j(vVar, "<this>");
            return C15768k.q(vVar, C0928a.f57683c);
        }

        public final <T> boolean d(v vVar, C18055d<T> dVar) {
            C17542s.j(vVar, "<this>");
            C17542s.j(dVar, PlaceTypes.ROUTE);
            return j.g(z.e(dVar)) == vVar.x();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lx4/v$b;", "", "Lx4/v;", "destination", "Landroid/os/Bundle;", "matchingArgs", "", "isExactDeepLink", "", "matchingPathSegments", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Lx4/v;Landroid/os/Bundle;ZIZI)V", "other", "a", "(Lx4/v$b;)I", "arguments", "m", "(Landroid/os/Bundle;)Z", "Lx4/v;", "b", "()Lx4/v;", "Landroid/os/Bundle;", "j", "()Landroid/os/Bundle;", "c", "Z", "d", "I", "e", "f", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        private final v f57684a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f57685b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f57686c;

        /* renamed from: d  reason: collision with root package name */
        private final int f57687d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f57688e;

        /* renamed from: f  reason: collision with root package name */
        private final int f57689f;

        public b(v vVar, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            C17542s.j(vVar, "destination");
            this.f57684a = vVar;
            this.f57685b = bundle;
            this.f57686c = z10;
            this.f57687d = i10;
            this.f57688e = z11;
            this.f57689f = i11;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            C17542s.j(bVar, "other");
            boolean z10 = this.f57686c;
            if (z10 && !bVar.f57686c) {
                return 1;
            }
            if (!z10 && bVar.f57686c) {
                return -1;
            }
            int i10 = this.f57687d - bVar.f57687d;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.f57685b;
            if (bundle != null && bVar.f57685b == null) {
                return 1;
            }
            if (bundle == null && bVar.f57685b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = bVar.f57685b;
                C17542s.g(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f57688e;
            if (z11 && !bVar.f57688e) {
                return 1;
            }
            if (z11 || !bVar.f57688e) {
                return this.f57689f - bVar.f57689f;
            }
            return -1;
        }

        public final v b() {
            return this.f57684a;
        }

        public final Bundle j() {
            return this.f57685b;
        }

        public final boolean m(Bundle bundle) {
            Bundle bundle2;
            Object obj;
            if (bundle == null || (bundle2 = this.f57685b) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            C17542s.i(keySet, "matchingArgs.keySet()");
            for (String str : keySet) {
                if (!bundle.containsKey(str)) {
                    return false;
                }
                C8945i iVar = (C8945i) this.f57684a.f57679g.get(str);
                Object obj2 = null;
                F<Object> a10 = iVar != null ? iVar.a() : null;
                if (a10 != null) {
                    Bundle bundle3 = this.f57685b;
                    C17542s.i(str, "key");
                    obj = a10.a(bundle3, str);
                } else {
                    obj = null;
                }
                if (a10 != null) {
                    C17542s.i(str, "key");
                    obj2 = a10.a(bundle, str);
                }
                if (a10 != null && !a10.j(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<String, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57690c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q qVar) {
            super(1);
            this.f57690c = qVar;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C17542s.j(str, "key");
            return Boolean.valueOf(!this.f57690c.j().contains(str));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<String, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f57691c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Bundle bundle) {
            super(1);
            this.f57691c = bundle;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C17542s.j(str, "key");
            return Boolean.valueOf(!this.f57691c.containsKey(str));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx4/q;", "b", "()Lx4/q;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<q> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f57692c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.f57692c = str;
        }

        /* renamed from: b */
        public final q invoke() {
            return new q.a().d(this.f57692c).a();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<String, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f57693c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(q qVar) {
            super(1);
            this.f57693c = qVar;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C17542s.j(str, "key");
            return Boolean.valueOf(!this.f57693c.j().contains(str));
        }
    }

    public v(String str) {
        C17542s.j(str, "navigatorName");
        this.f57673a = str;
        this.f57677e = new ArrayList();
        this.f57678f = new c0<>(0, 1, (DefaultConstructorMarker) null);
        this.f57679g = new LinkedHashMap();
    }

    private final boolean F(q qVar, Uri uri, Map<String, C8945i> map) {
        return C8947k.a(map, new d(qVar.p(uri, map))).isEmpty();
    }

    public static /* synthetic */ int[] q(v vVar, v vVar2, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                vVar2 = null;
            }
            return vVar.p(vVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    public final String A() {
        return this.f57673a;
    }

    public final x B() {
        return this.f57674b;
    }

    public final String C() {
        return this.f57681i;
    }

    public boolean D(Uri uri) {
        C17542s.j(uri, "deepLink");
        return E(new u(uri, (String) null, (String) null));
    }

    public boolean E(u uVar) {
        C17542s.j(uVar, "deepLinkRequest");
        return H(uVar) != null;
    }

    public final boolean G(String str, Bundle bundle) {
        C17542s.j(str, PlaceTypes.ROUTE);
        if (C17542s.e(this.f57681i, str)) {
            return true;
        }
        b I10 = I(str);
        if (!C17542s.e(this, I10 != null ? I10.b() : null)) {
            return false;
        }
        return I10.m(bundle);
    }

    public b H(u uVar) {
        C17542s.j(uVar, "navDeepLinkRequest");
        if (this.f57677e.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (q next : this.f57677e) {
            Uri c10 = uVar.c();
            Bundle o10 = c10 != null ? next.o(c10, this.f57679g) : null;
            int h10 = next.h(c10);
            String a10 = uVar.a();
            boolean z10 = a10 != null && C17542s.e(a10, next.i());
            String b10 = uVar.b();
            int u10 = b10 != null ? next.u(b10) : -1;
            if (o10 != null || ((z10 || u10 > -1) && F(next, c10, this.f57679g))) {
                b bVar2 = new b(this, o10, next.z(), h10, z10, u10);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    public final b I(String str) {
        q value;
        C17542s.j(str, PlaceTypes.ROUTE);
        C16824o<q> oVar = this.f57682j;
        if (oVar == null || (value = oVar.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(f57671k.a(str));
        C17542s.f(parse, "Uri.parse(this)");
        Bundle o10 = value.o(parse, this.f57679g);
        if (o10 == null) {
            return null;
        }
        return new b(this, o10, value.z(), value.h(parse), false, -1);
    }

    public void J(Context context, AttributeSet attributeSet) {
        C17542s.j(context, "context");
        C17542s.j(attributeSet, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C8977a.f57827x);
        C17542s.i(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        P(obtainAttributes.getString(C8977a.f57803A));
        if (obtainAttributes.hasValue(C8977a.f57829z)) {
            L(obtainAttributes.getResourceId(C8977a.f57829z, 0));
            this.f57675c = f57671k.b(context, this.f57680h);
        }
        this.f57676d = obtainAttributes.getText(C8977a.f57828y);
        C16807N n10 = C16807N.f139792a;
        obtainAttributes.recycle();
    }

    public final void K(int i10, C8944h hVar) {
        C17542s.j(hVar, "action");
        if (!Q()) {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        } else if (i10 != 0) {
            this.f57678f.l(i10, hVar);
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
    }

    public final void L(int i10) {
        this.f57680h = i10;
        this.f57675c = null;
    }

    public final void M(CharSequence charSequence) {
        this.f57676d = charSequence;
    }

    public final void O(x xVar) {
        this.f57674b = xVar;
    }

    public final void P(String str) {
        if (str == null) {
            L(0);
        } else if (!C15854t.v0(str)) {
            String a10 = f57671k.a(str);
            List<String> a11 = C8947k.a(this.f57679g, new f(new q.a().d(a10).a()));
            if (a11.isEmpty()) {
                this.f57682j = C16825p.b(new e(a10));
                L(a10.hashCode());
            } else {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + a11).toString());
            }
        } else {
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        this.f57681i = str;
    }

    public boolean Q() {
        return true;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        boolean e10 = C17542s.e(this.f57677e, vVar.f57677e);
        if (this.f57678f.o() == vVar.f57678f.o()) {
            Iterator it = C15768k.h(e0.a(this.f57678f)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                int intValue = ((Number) it.next()).intValue();
                if (!C17542s.e(this.f57678f.e(intValue), vVar.f57678f.e(intValue))) {
                    break;
                }
            }
        } else {
            z10 = false;
        }
        if (this.f57679g.size() == vVar.f57679g.size()) {
            Iterator<Map.Entry<String, C8945i>> it2 = X.A(this.f57679g).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = true;
                    break;
                }
                Map.Entry next = it2.next();
                if (vVar.f57679g.containsKey(next.getKey())) {
                    if (!C17542s.e(vVar.f57679g.get(next.getKey()), next.getValue())) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z11 = false;
        return this.f57680h == vVar.f57680h && C17542s.e(this.f57681i, vVar.f57681i) && e10 && z10 && z11;
    }

    public int hashCode() {
        int i10;
        Set<String> keySet;
        int i11 = this.f57680h * 31;
        String str = this.f57681i;
        int hashCode = i11 + (str != null ? str.hashCode() : 0);
        for (q qVar : this.f57677e) {
            int i12 = i10 * 31;
            String y10 = qVar.y();
            int hashCode2 = (i12 + (y10 != null ? y10.hashCode() : 0)) * 31;
            String i13 = qVar.i();
            int hashCode3 = (hashCode2 + (i13 != null ? i13.hashCode() : 0)) * 31;
            String t10 = qVar.t();
            hashCode = hashCode3 + (t10 != null ? t10.hashCode() : 0);
        }
        Iterator<T> b10 = e0.b(this.f57678f);
        while (b10.hasNext()) {
            C8944h hVar = (C8944h) b10.next();
            int b11 = ((i10 * 31) + hVar.b()) * 31;
            C c10 = hVar.c();
            i10 = b11 + (c10 != null ? c10.hashCode() : 0);
            Bundle a10 = hVar.a();
            if (!(a10 == null || (keySet = a10.keySet()) == null)) {
                C17542s.i(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i14 = i10 * 31;
                    Bundle a11 = hVar.a();
                    C17542s.g(a11);
                    Object obj = a11.get(str2);
                    i10 = i14 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this.f57679g.keySet()) {
            int hashCode4 = ((i10 * 31) + str3.hashCode()) * 31;
            C8945i iVar = this.f57679g.get(str3);
            i10 = hashCode4 + (iVar != null ? iVar.hashCode() : 0);
        }
        return i10;
    }

    public final void i(String str, C8945i iVar) {
        C17542s.j(str, "argumentName");
        C17542s.j(iVar, "argument");
        this.f57679g.put(str, iVar);
    }

    public final void k(q qVar) {
        C17542s.j(qVar, "navDeepLink");
        List<String> a10 = C8947k.a(this.f57679g, new c(qVar));
        if (a10.isEmpty()) {
            this.f57677e.add(qVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + qVar.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + a10).toString());
    }

    public final Bundle m(Bundle bundle) {
        if (bundle == null && this.f57679g.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.f57679g.entrySet()) {
            ((C8945i) next.getValue()).e((String) next.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry next2 : this.f57679g.entrySet()) {
                String str = (String) next2.getKey();
                C8945i iVar = (C8945i) next2.getValue();
                if (!iVar.c() && !iVar.f(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + iVar.a().b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public final int[] p(v vVar) {
        C16869m mVar = new C16869m();
        x xVar = this;
        while (true) {
            C17542s.g(xVar);
            x xVar2 = xVar.f57674b;
            if ((vVar != null ? vVar.f57674b : null) != null) {
                x xVar3 = vVar.f57674b;
                C17542s.g(xVar3);
                if (xVar3.T(xVar.f57680h) == xVar) {
                    mVar.addFirst(xVar);
                    break;
                }
            }
            if (xVar2 == null || xVar2.a0() != xVar.f57680h) {
                mVar.addFirst(xVar);
            }
            if (C17542s.e(xVar2, vVar) || xVar2 == null) {
                break;
            }
            xVar = xVar2;
        }
        Iterable<v> t12 = C16877v.t1(mVar);
        ArrayList arrayList = new ArrayList(C16877v.y(t12, 10));
        for (v vVar2 : t12) {
            arrayList.add(Integer.valueOf(vVar2.f57680h));
        }
        return C16877v.s1(arrayList);
    }

    public final Map<String, C8945i> s() {
        return X.x(this.f57679g);
    }

    public String t() {
        String str = this.f57675c;
        return str == null ? String.valueOf(this.f57680h) : str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f57675c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f57680h));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f57681i;
        if (str2 != null && !C15854t.v0(str2)) {
            sb2.append(" route=");
            sb2.append(this.f57681i);
        }
        if (this.f57676d != null) {
            sb2.append(" label=");
            sb2.append(this.f57676d);
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "sb.toString()");
        return sb3;
    }

    public final int x() {
        return this.f57680h;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v(I<? extends v> i10) {
        this(J.f57461b.a(i10.getClass()));
        C17542s.j(i10, "navigator");
    }
}
