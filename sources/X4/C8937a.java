package x4;

import GJ.C15768k;
import HJ.C15854t;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17978n;
import u2.C6012a;
import x4.I;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f \u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lx4/a;", "Lx4/I;", "Lx4/a$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "l", "()Lx4/a$b;", "", "k", "()Z", "destination", "Landroid/os/Bundle;", "args", "Lx4/C;", "navOptions", "Lx4/I$a;", "navigatorExtras", "Lx4/v;", "n", "(Lx4/a$b;Landroid/os/Bundle;Lx4/C;Lx4/I$a;)Lx4/v;", "c", "Landroid/content/Context;", "m", "()Landroid/content/Context;", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", "e", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@I.b("activity")
/* renamed from: x4.a  reason: case insensitive filesystem */
public class C8937a extends I<b> {

    /* renamed from: e  reason: collision with root package name */
    public static final C0925a f57483e = new C0925a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f57484c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f57485d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lx4/a$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "LXH/N;", "a", "(Landroid/app/Activity;)V", "", "EXTRA_NAV_CURRENT", "Ljava/lang/String;", "EXTRA_NAV_SOURCE", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.a$a  reason: collision with other inner class name */
    public static final class C0925a {
        public /* synthetic */ C0925a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity) {
            C17542s.j(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent != null) {
                int intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:popEnterAnim", -1);
                int intExtra2 = intent.getIntExtra("android-support-navigation:ActivityNavigator:popExitAnim", -1);
                if (intExtra != -1 || intExtra2 != -1) {
                    if (intExtra == -1) {
                        intExtra = 0;
                    }
                    if (intExtra2 == -1) {
                        intExtra2 = 0;
                    }
                    activity.overridePendingTransition(intExtra, intExtra2);
                }
            }
        }

        private C0925a() {
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R(\u00102\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@BX\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R(\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\b8\u0006@BX\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010$R(\u00106\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u00168F@BX\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R(\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\b8F@BX\u000e¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b:\u0010$¨\u0006;"}, d2 = {"Lx4/a$b;", "Lx4/v;", "Lx4/I;", "activityNavigator", "<init>", "(Lx4/I;)V", "Landroid/content/Context;", "context", "", "pattern", "V", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "dataPattern", "Z", "(Ljava/lang/String;)Lx4/a$b;", "Landroid/util/AttributeSet;", "attrs", "LXH/N;", "J", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "packageName", "a0", "Landroid/content/ComponentName;", "name", "X", "(Landroid/content/ComponentName;)Lx4/a$b;", "action", "W", "Landroid/net/Uri;", "data", "Y", "(Landroid/net/Uri;)Lx4/a$b;", "", "Q", "()Z", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Intent;", "<set-?>", "m", "Landroid/content/Intent;", "U", "()Landroid/content/Intent;", "intent", "n", "Ljava/lang/String;", "T", "component", "Landroid/content/ComponentName;", "S", "()Landroid/content/ComponentName;", "R", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.a$b */
    public static class b extends v {

        /* renamed from: m  reason: collision with root package name */
        private Intent f57486m;

        /* renamed from: n  reason: collision with root package name */
        private String f57487n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(I<? extends b> i10) {
            super((I<? extends v>) i10);
            C17542s.j(i10, "activityNavigator");
        }

        private final String V(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            C17542s.i(packageName, "context.packageName");
            return C15854t.Q(str, "${applicationId}", packageName, false, 4, (Object) null);
        }

        public void J(Context context, AttributeSet attributeSet) {
            C17542s.j(context, "context");
            C17542s.j(attributeSet, "attrs");
            super.J(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, N.f57473a);
            C17542s.i(obtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
            a0(V(context, obtainAttributes.getString(N.f57478f)));
            String string = obtainAttributes.getString(N.f57474b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                X(new ComponentName(context, string));
            }
            W(obtainAttributes.getString(N.f57475c));
            String V10 = V(context, obtainAttributes.getString(N.f57476d));
            if (V10 != null) {
                Y(Uri.parse(V10));
            }
            Z(V(context, obtainAttributes.getString(N.f57477e)));
            obtainAttributes.recycle();
        }

        public boolean Q() {
            return false;
        }

        public final String R() {
            Intent intent = this.f57486m;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName S() {
            Intent intent = this.f57486m;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String T() {
            return this.f57487n;
        }

        public final Intent U() {
            return this.f57486m;
        }

        public final b W(String str) {
            if (this.f57486m == null) {
                this.f57486m = new Intent();
            }
            Intent intent = this.f57486m;
            C17542s.g(intent);
            intent.setAction(str);
            return this;
        }

        public final b X(ComponentName componentName) {
            if (this.f57486m == null) {
                this.f57486m = new Intent();
            }
            Intent intent = this.f57486m;
            C17542s.g(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final b Y(Uri uri) {
            if (this.f57486m == null) {
                this.f57486m = new Intent();
            }
            Intent intent = this.f57486m;
            C17542s.g(intent);
            intent.setData(uri);
            return this;
        }

        public final b Z(String str) {
            this.f57487n = str;
            return this;
        }

        public final b a0(String str) {
            if (this.f57486m == null) {
                this.f57486m = new Intent();
            }
            Intent intent = this.f57486m;
            C17542s.g(intent);
            intent.setPackage(str);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.f57486m;
                if ((intent != null ? intent.filterEquals(((b) obj).f57486m) : ((b) obj).f57486m == null) && C17542s.e(this.f57487n, ((b) obj).f57487n)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f57486m;
            int i10 = 0;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f57487n;
            if (str != null) {
                i10 = str.hashCode();
            }
            return filterHashCode + i10;
        }

        public String toString() {
            ComponentName S10 = S();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (S10 != null) {
                sb2.append(" class=");
                sb2.append(S10.getClassName());
            } else {
                String R10 = R();
                if (R10 != null) {
                    sb2.append(" action=");
                    sb2.append(R10);
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "sb.toString()");
            return sb3;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lx4/a$c;", "Lx4/I$a;", "", "a", "I", "b", "()I", "flags", "Landroidx/core/app/d;", "Landroidx/core/app/d;", "()Landroidx/core/app/d;", "activityOptions", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.a$c */
    public static final class c implements I.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f57488a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.app.d f57489b;

        public final androidx.core.app.d a() {
            return this.f57489b;
        }

        public final int b() {
            return this.f57488a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.a$d */
    static final class d extends C17544u implements C17642l<Context, Context> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f57490c = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final Context invoke(Context context) {
            C17542s.j(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public C8937a(Context context) {
        Object obj;
        C17542s.j(context, "context");
        this.f57484c = context;
        Iterator it = C15768k.q(context, d.f57490c).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f57485d = (Activity) obj;
    }

    public boolean k() {
        Activity activity = this.f57485d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: l */
    public b a() {
        return new b(this);
    }

    public final Context m() {
        return this.f57484c;
    }

    /* renamed from: n */
    public v d(b bVar, Bundle bundle, C c10, I.a aVar) {
        Intent intent;
        int intExtra;
        String str;
        C17542s.j(bVar, "destination");
        if (bVar.U() != null) {
            Intent intent2 = new Intent(bVar.U());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String T10 = bVar.T();
                if (!(T10 == null || T10.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(T10);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            Map<String, C8945i> s10 = bVar.s();
                            C17542s.g(group);
                            C8945i iVar = s10.get(group);
                            F<Object> a10 = iVar != null ? iVar.a() : null;
                            if (a10 == null || (str = a10.i(a10.a(bundle, group))) == null) {
                                str = Uri.encode(String.valueOf(bundle.get(group)));
                            }
                            stringBuffer.append(str);
                        } else {
                            throw new IllegalArgumentException(("Could not find " + group + " in " + bundle + " to fill data pattern " + T10).toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z10 = aVar instanceof c;
            if (z10) {
                intent2.addFlags(((c) aVar).b());
            }
            if (this.f57485d == null) {
                intent2.addFlags(268435456);
            }
            if (c10 != null && c10.j()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f57485d;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", bVar.x());
            Resources resources = this.f57484c.getResources();
            if (c10 != null) {
                int c11 = c10.c();
                int d10 = c10.d();
                if ((c11 <= 0 || !C17542s.e(resources.getResourceTypeName(c11), "animator")) && (d10 <= 0 || !C17542s.e(resources.getResourceTypeName(d10), "animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c11);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d10);
                } else {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c11) + " and popExit resource " + resources.getResourceName(d10) + " when launching " + bVar);
                }
            }
            if (z10) {
                androidx.core.app.d a11 = ((c) aVar).a();
                if (a11 != null) {
                    C6012a.o(this.f57484c, intent2, a11.b());
                } else {
                    this.f57484c.startActivity(intent2);
                }
            } else {
                this.f57484c.startActivity(intent2);
            }
            if (!(c10 == null || this.f57485d == null)) {
                int a12 = c10.a();
                int b10 = c10.b();
                if ((a12 > 0 && C17542s.e(resources.getResourceTypeName(a12), "animator")) || (b10 > 0 && C17542s.e(resources.getResourceTypeName(b10), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a12) + " and exit resource " + resources.getResourceName(b10) + "when launching " + bVar);
                } else if (a12 >= 0 || b10 >= 0) {
                    this.f57485d.overridePendingTransition(C17978n.e(a12, 0), C17978n.e(b10, 0));
                }
            }
            return null;
        }
        throw new IllegalStateException(("Destination " + bVar.x() + " does not have an Intent set.").toString());
    }
}
