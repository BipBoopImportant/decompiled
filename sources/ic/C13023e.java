package IC;

import J1.j;
import U0.C4889m;
import U0.C4895p;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import YH.C16877v;
import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\u000f\r\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LIC/e;", "", "<init>", "()V", "", "a", "(LU0/m;I)Ljava/lang/String;", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/content/res/Resources;", "resources", "c", "(Landroid/content/res/Resources;)Ljava/lang/String;", "d", "LIC/e$a;", "LIC/e$b;", "LIC/e$c;", "LIC/e$d;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: IC.e  reason: case insensitive filesystem */
public abstract class C13023e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f110931a = 0;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LIC/e$a;", "LIC/e;", "", "id", "", "args", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "e", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: IC.e$a */
    public static final class a extends C13023e {

        /* renamed from: b  reason: collision with root package name */
        private final int f110932b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C13023e> f110933c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, List<? extends C13023e> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "args");
            this.f110932b = i10;
            this.f110933c = list;
        }

        public final List<C13023e> d() {
            return this.f110933c;
        }

        public final int e() {
            return this.f110932b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f110932b == aVar.f110932b && C17542s.e(this.f110933c, aVar.f110933c);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f110932b) * 31) + this.f110933c.hashCode();
        }

        public String toString() {
            int i10 = this.f110932b;
            List<C13023e> list = this.f110933c;
            return "CompositeResource(id=" + i10 + ", args=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LIC/e$b;", "LIC/e;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: IC.e$b */
    public static final class b extends C13023e {

        /* renamed from: c  reason: collision with root package name */
        public static final int f110934c = 0;

        /* renamed from: b  reason: collision with root package name */
        private final String f110935b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "value");
            this.f110935b = str;
        }

        public final String d() {
            return this.f110935b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f110935b, ((b) obj).f110935b);
        }

        public int hashCode() {
            return this.f110935b.hashCode();
        }

        public String toString() {
            String str = this.f110935b;
            return "DynamicString(value=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8@X\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LIC/e$c;", "LIC/e;", "", "id", "LIC/b;", "count", "", "", "args", "<init>", "(IILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "h", "c", "g", "d", "Ljava/util/List;", "getArgs", "()Ljava/util/List;", "", "e", "LXH/o;", "f", "()[Ljava/lang/Object;", "argsArray", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: IC.e$c */
    public static final class c extends C13023e {

        /* renamed from: f  reason: collision with root package name */
        public static final int f110936f = 8;

        /* renamed from: b  reason: collision with root package name */
        private final int f110937b;

        /* renamed from: c  reason: collision with root package name */
        private final int f110938c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Object> f110939d;

        /* renamed from: e  reason: collision with root package name */
        private final C16824o f110940e;

        public /* synthetic */ c(int i10, int i11, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, list);
        }

        /* access modifiers changed from: private */
        public static final Object[] e(c cVar) {
            return cVar.f110939d.toArray(new Object[0]);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f110937b == cVar.f110937b && C13020b.b(this.f110938c, cVar.f110938c) && C17542s.e(this.f110939d, cVar.f110939d);
        }

        public final Object[] f() {
            return (Object[]) this.f110940e.getValue();
        }

        public final int g() {
            return this.f110938c;
        }

        public final int h() {
            return this.f110937b;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f110937b) * 31) + C13020b.c(this.f110938c)) * 31) + this.f110939d.hashCode();
        }

        public String toString() {
            int i10 = this.f110937b;
            String d10 = C13020b.d(this.f110938c);
            List<Object> list = this.f110939d;
            return "PluralResource(id=" + i10 + ", count=" + d10 + ", args=" + list + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private c(int i10, int i11, List<? extends Object> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "args");
            this.f110937b = i10;
            this.f110938c = i11;
            this.f110939d = list;
            this.f110940e = C16825p.b(new C13024f(this));
        }
    }

    public /* synthetic */ C13023e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a(C4889m mVar, int i10) {
        String str;
        mVar.W(-1004547506);
        if (C4895p.J()) {
            C4895p.S(-1004547506, i10, -1, "com.ingka.ikea.ui.common.UiText.asString (UiText.kt:64)");
        }
        if (this instanceof b) {
            mVar.W(1579835743);
            mVar.P();
            str = ((b) this).d();
        } else if (this instanceof d) {
            mVar.W(1579837080);
            d dVar = (d) this;
            int g10 = dVar.g();
            Object[] f10 = dVar.f();
            str = j.c(g10, Arrays.copyOf(f10, f10.length), mVar, 0);
            mVar.P();
        } else if (this instanceof c) {
            mVar.W(1579841251);
            c cVar = (c) this;
            int h10 = cVar.h();
            int g11 = cVar.g();
            Object[] f11 = cVar.f();
            str = j.a(h10, g11, Arrays.copyOf(f11, f11.length), mVar, 0);
            mVar.P();
        } else if (this instanceof a) {
            mVar.W(1579846840);
            a aVar = (a) this;
            int e10 = aVar.e();
            Iterable<C13023e> d10 = aVar.d();
            ArrayList arrayList = new ArrayList(C16877v.y(d10, 10));
            for (C13023e a10 : d10) {
                arrayList.add(a10.a(mVar, 0));
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            str = j.c(e10, Arrays.copyOf(strArr, strArr.length), mVar, 0);
            mVar.P();
        } else {
            mVar.W(1579834791);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return str;
    }

    public final String b(Context context) {
        C17542s.j(context, "context");
        Resources resources = context.getResources();
        C17542s.i(resources, "getResources(...)");
        return c(resources);
    }

    public final String c(Resources resources) {
        C17542s.j(resources, "resources");
        if (this instanceof b) {
            return ((b) this).d();
        }
        if (this instanceof d) {
            d dVar = (d) this;
            int g10 = dVar.g();
            Object[] f10 = dVar.f();
            String string = resources.getString(g10, Arrays.copyOf(f10, f10.length));
            C17542s.i(string, "getString(...)");
            return string;
        } else if (this instanceof c) {
            c cVar = (c) this;
            int h10 = cVar.h();
            int g11 = cVar.g();
            Object[] f11 = cVar.f();
            String quantityString = resources.getQuantityString(h10, g11, Arrays.copyOf(f11, f11.length));
            C17542s.i(quantityString, "getQuantityString(...)");
            return quantityString;
        } else if (this instanceof a) {
            a aVar = (a) this;
            int e10 = aVar.e();
            Iterable<C13023e> d10 = aVar.d();
            ArrayList arrayList = new ArrayList(C16877v.y(d10, 10));
            for (C13023e c10 : d10) {
                arrayList.add(c10.c(resources));
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String string2 = resources.getString(e10, Arrays.copyOf(strArr, strArr.length));
            C17542s.i(string2, "getString(...)");
            return string2;
        } else {
            throw new t();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198@X\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LIC/e$d;", "LIC/e;", "", "id", "", "", "args", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "g", "c", "Ljava/util/List;", "getArgs", "()Ljava/util/List;", "", "d", "LXH/o;", "f", "()[Ljava/lang/Object;", "argsArray", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: IC.e$d */
    public static final class d extends C13023e {

        /* renamed from: e  reason: collision with root package name */
        public static final int f110941e = 8;

        /* renamed from: b  reason: collision with root package name */
        private final int f110942b;

        /* renamed from: c  reason: collision with root package name */
        private final List<Object> f110943c;

        /* renamed from: d  reason: collision with root package name */
        private final C16824o f110944d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? C16877v.n() : list);
        }

        /* access modifiers changed from: private */
        public static final Object[] e(d dVar) {
            return dVar.f110943c.toArray(new Object[0]);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f110942b == dVar.f110942b && C17542s.e(this.f110943c, dVar.f110943c);
        }

        public final Object[] f() {
            return (Object[]) this.f110944d.getValue();
        }

        public final int g() {
            return this.f110942b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f110942b) * 31) + this.f110943c.hashCode();
        }

        public String toString() {
            int i10 = this.f110942b;
            List<Object> list = this.f110943c;
            return "StringResource(id=" + i10 + ", args=" + list + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i10, List<? extends Object> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "args");
            this.f110942b = i10;
            this.f110943c = list;
            this.f110944d = C16825p.b(new C13025g(this));
        }
    }

    private C13023e() {
    }
}
