package hl;

import HJ.C15854t;
import android.text.SpannableStringBuilder;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\b\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lhl/a;", "", "<init>", "()V", "a", "c", "d", "e", "b", "Lhl/a$b;", "Lhl/a$c;", "Lhl/a$d;", "Lhl/a$e;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hl.a  reason: case insensitive filesystem */
public abstract class C11367a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2200a f98081a = new C2200a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhl/a$a;", "", "<init>", "()V", "", "text", "Lhl/a;", "b", "(Ljava/lang/String;)Lhl/a;", "", "resId", "a", "(I)Lhl/a;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.a$a  reason: collision with other inner class name */
    public static final class C2200a {
        public /* synthetic */ C2200a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C11367a a(int i10) {
            return i10 == 0 ? b.f98082b : new d(i10);
        }

        public final C11367a b(String str) {
            return str == null ? b.f98082b : new c(str);
        }

        private C2200a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl/a$b;", "Lhl/a;", "<init>", "()V", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.a$b */
    public static final class b extends C11367a {

        /* renamed from: b  reason: collision with root package name */
        public static final b f98082b = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lhl/a$c;", "Lhl/a;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.a$c */
    public static final class c extends C11367a {

        /* renamed from: b  reason: collision with root package name */
        private final String f98083b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            this.f98083b = str;
        }

        public final String a() {
            return this.f98083b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f98083b, ((c) obj).f98083b);
        }

        public int hashCode() {
            return this.f98083b.hashCode();
        }

        public String toString() {
            String str = this.f98083b;
            return "Raw(text=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lhl/a$d;", "Lhl/a;", "", "resId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.a$d */
    public static final class d extends C11367a {

        /* renamed from: b  reason: collision with root package name */
        private final int f98084b;

        public d(int i10) {
            super((DefaultConstructorMarker) null);
            this.f98084b = i10;
            if (i10 == 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Use Text(...) constructor instead");
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = d.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalArgumentException, str3);
                    str = str3;
                    str2 = str4;
                }
            }
        }

        public final int a() {
            return this.f98084b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f98084b == ((d) obj).f98084b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f98084b);
        }

        public String toString() {
            int i10 = this.f98084b;
            return "Resource(resId=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lhl/a$e;", "Lhl/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/text/SpannableStringBuilder;", "b", "Landroid/text/SpannableStringBuilder;", "a", "()Landroid/text/SpannableStringBuilder;", "spanned", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.a$e */
    public static final class e extends C11367a {

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f98085b;

        public final SpannableStringBuilder a() {
            return this.f98085b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C17542s.e(this.f98085b, ((e) obj).f98085b);
        }

        public int hashCode() {
            return this.f98085b.hashCode();
        }

        public String toString() {
            SpannableStringBuilder spannableStringBuilder = this.f98085b;
            return "Spanned(spanned=" + spannableStringBuilder + ")";
        }
    }

    public /* synthetic */ C11367a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C11367a() {
    }
}
