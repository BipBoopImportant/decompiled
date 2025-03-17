package FF;

import android.net.Uri;
import com.sugarcube.core.network.models.RoomType;
import java.time.Instant;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tF.C15091p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0014\n\u0015\u0011\u000e\u0013\u0012\u0016\u0017\u0018B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010\u0001\n\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"LFF/e;", "", "key", "Lc2/h;", "paddingAbove", "paddingBelow", "paddingStart", "paddingEnd", "<init>", "(Ljava/lang/Object;FFFF)V", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "F", "()F", "c", "d", "e", "h", "j", "g", "f", "i", "LFF/e$a;", "LFF/e$b;", "LFF/e$c;", "LFF/e$d;", "LFF/e$e;", "LFF/e$f;", "LFF/e$g;", "LFF/e$h;", "LFF/e$i;", "LFF/e$j;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FF.e  reason: case insensitive filesystem */
public abstract class C12888e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f109864a;

    /* renamed from: b  reason: collision with root package name */
    private final float f109865b;

    /* renamed from: c  reason: collision with root package name */
    private final float f109866c;

    /* renamed from: d  reason: collision with root package name */
    private final float f109867d;

    /* renamed from: e  reason: collision with root package name */
    private final float f109868e;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFF/e$a;", "LFF/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$a */
    public static final class a extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        public static final a f109869f = new a();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private a() {
            /*
                r9 = this;
                r0 = 24
                float r0 = (float) r0
                float r3 = c2.h.B(r0)
                float r4 = c2.h.B(r0)
                r7 = 24
                r8 = 0
                java.lang.String r2 = "bsh"
                r5 = 0
                r6 = 0
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: FF.C12888e.a.<init>():void");
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1713738228;
        }

        public String toString() {
            return "BlankSpacesHeader";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LFF/e$b;", "LFF/e;", "", "key", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$b */
    public static final class b extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        private final Object f109870f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(obj, 0.0f, 0.0f, 0.0f, 0.0f, 30, (DefaultConstructorMarker) null);
            C17542s.j(obj, "key");
            this.f109870f = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f109870f, ((b) obj).f109870f);
        }

        public int hashCode() {
            return this.f109870f.hashCode();
        }

        public String toString() {
            Object obj = this.f109870f;
            return "Divider(key=" + obj + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LFF/e$c;", "LFF/e;", "LFF/h;", "section", "<init>", "(LFF/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "LFF/h;", "e", "()LFF/h;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$c */
    public static final class c extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        private final C12891h f109871f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(FF.C12891h r12) {
            /*
                r11 = this;
                java.lang.String r0 = "section"
                kotlin.jvm.internal.C17542s.j(r12, r0)
                java.lang.String r0 = r12.name()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "ec-"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r4 = r1.toString()
                r0 = 0
                float r0 = (float) r0
                float r5 = c2.h.B(r0)
                r0 = 24
                float r0 = (float) r0
                float r6 = c2.h.B(r0)
                r9 = 24
                r10 = 0
                r7 = 0
                r8 = 0
                r3 = r11
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r11.f109871f = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: FF.C12888e.c.<init>(FF.h):void");
        }

        public final C12891h e() {
            return this.f109871f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f109871f == ((c) obj).f109871f;
        }

        public int hashCode() {
            return this.f109871f.hashCode();
        }

        public String toString() {
            C12891h hVar = this.f109871f;
            return "ExpandCollapse(section=" + hVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFF/e$d;", "LFF/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$d */
    public static final class d extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        public static final d f109872f = new d();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private d() {
            /*
                r8 = this;
                r0 = 0
                float r0 = (float) r0
                float r3 = c2.h.B(r0)
                r1 = 24
                float r1 = (float) r1
                float r4 = c2.h.B(r1)
                float r5 = c2.h.B(r0)
                float r6 = c2.h.B(r0)
                r7 = 0
                java.lang.String r2 = "fsfb"
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: FF.C12888e.d.<init>():void");
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -419828482;
        }

        public String toString() {
            return "FurnishedSpacesFilterBar";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFF/e$e;", "LFF/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$e  reason: collision with other inner class name */
    public static final class C2626e extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        public static final C2626e f109873f = new C2626e();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C2626e() {
            /*
                r9 = this;
                r0 = 24
                float r0 = (float) r0
                float r3 = c2.h.B(r0)
                float r4 = c2.h.B(r0)
                r7 = 24
                r8 = 0
                java.lang.String r2 = "fsh"
                r5 = 0
                r6 = 0
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: FF.C12888e.C2626e.<init>():void");
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2626e);
        }

        public int hashCode() {
            return 1400619498;
        }

        public String toString() {
            return "FurnishedSpacesHeader";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFF/e$f;", "LFF/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$f */
    public static final class f extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        public static final f f109874f = new f();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private f() {
            /*
                r9 = this;
                r0 = 16
                float r0 = (float) r0
                float r3 = c2.h.B(r0)
                float r4 = c2.h.B(r0)
                r7 = 24
                r8 = 0
                java.lang.String r2 = "help"
                r5 = 0
                r6 = 0
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: FF.C12888e.f.<init>():void");
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 12120755;
        }

        public String toString() {
            return "HelpCard";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFF/e$g;", "LFF/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$g */
    public static final class g extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        public static final g f109875f = new g();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private g() {
            /*
                r9 = this;
                r0 = 24
                float r0 = (float) r0
                float r3 = c2.h.B(r0)
                float r4 = c2.h.B(r0)
                r7 = 24
                r8 = 0
                java.lang.String r2 = "j2b"
                r5 = 0
                r6 = 0
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: FF.C12888e.g.<init>():void");
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1378971767;
        }

        public String toString() {
            return "JumpToBlank";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFF/e$h;", "LFF/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$h */
    public static final class h extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        public static final h f109876f = new h();

        private h() {
            super("j2f", c2.h.B((float) 0), c2.h.B((float) 20), 0.0f, 0.0f, 24, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 2027523303;
        }

        public String toString() {
            return "JumpToFurnished";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFF/e$i;", "LFF/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$i */
    public static final class i extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        public static final i f109877f = new i();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private i() {
            /*
                r9 = this;
                r0 = 16
                float r0 = (float) r0
                float r3 = c2.h.B(r0)
                float r4 = c2.h.B(r0)
                r7 = 24
                r8 = 0
                java.lang.String r2 = "login"
                r5 = 0
                r6 = 0
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: FF.C12888e.i.<init>():void");
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 1679941015;
        }

        public String toString() {
            return "LoginCard";
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b%\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b!\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b+\u00104R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b)\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b5\u00107R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b0\u0010/R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b2\u0010>¨\u0006?"}, d2 = {"LFF/e$j;", "LFF/e;", "", "id", "Ljava/util/UUID;", "sceneUUID", "compositionUUID", "", "roomName", "Landroid/net/Uri;", "image", "", "designCount", "Ljava/time/Instant;", "lastModified", "indexInSection", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "LFF/h;", "section", "roomShapeURL", "LtF/p;", "roomSize", "<init>", "(Ljava/lang/Object;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Landroid/net/Uri;ILjava/time/Instant;ILcom/sugarcube/core/network/models/RoomType;LFF/h;Landroid/net/Uri;LtF/p;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/Object;", "getId", "()Ljava/lang/Object;", "g", "Ljava/util/UUID;", "n", "()Ljava/util/UUID;", "h", "e", "i", "Ljava/lang/String;", "j", "Landroid/net/Uri;", "()Landroid/net/Uri;", "k", "I", "l", "Ljava/time/Instant;", "()Ljava/time/Instant;", "m", "Lcom/sugarcube/core/network/models/RoomType;", "()Lcom/sugarcube/core/network/models/RoomType;", "o", "LFF/h;", "()LFF/h;", "p", "q", "LtF/p;", "()LtF/p;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.e$j */
    public static final class j extends C12888e {

        /* renamed from: f  reason: collision with root package name */
        private final Object f109878f;

        /* renamed from: g  reason: collision with root package name */
        private final UUID f109879g;

        /* renamed from: h  reason: collision with root package name */
        private final UUID f109880h;

        /* renamed from: i  reason: collision with root package name */
        private final String f109881i;

        /* renamed from: j  reason: collision with root package name */
        private final Uri f109882j;

        /* renamed from: k  reason: collision with root package name */
        private final int f109883k;

        /* renamed from: l  reason: collision with root package name */
        private final Instant f109884l;

        /* renamed from: m  reason: collision with root package name */
        private final int f109885m;

        /* renamed from: n  reason: collision with root package name */
        private final RoomType f109886n;

        /* renamed from: o  reason: collision with root package name */
        private final C12891h f109887o;

        /* renamed from: p  reason: collision with root package name */
        private final Uri f109888p;

        /* renamed from: q  reason: collision with root package name */
        private final C15091p f109889q;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public j(java.lang.Object r16, java.util.UUID r17, java.util.UUID r18, java.lang.String r19, android.net.Uri r20, int r21, java.time.Instant r22, int r23, com.sugarcube.core.network.models.RoomType r24, FF.C12891h r25, android.net.Uri r26, tF.C15091p r27) {
            /*
                r15 = this;
                r8 = r15
                r9 = r16
                r10 = r17
                r11 = r18
                r12 = r19
                r13 = r24
                r14 = r25
                java.lang.String r0 = "id"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                java.lang.String r0 = "sceneUUID"
                kotlin.jvm.internal.C17542s.j(r10, r0)
                java.lang.String r0 = "compositionUUID"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                java.lang.String r0 = "roomName"
                kotlin.jvm.internal.C17542s.j(r12, r0)
                java.lang.String r0 = "roomType"
                kotlin.jvm.internal.C17542s.j(r13, r0)
                java.lang.String r0 = "section"
                kotlin.jvm.internal.C17542s.j(r14, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "room-"
                r0.append(r1)
                r0.append(r9)
                java.lang.String r1 = r0.toString()
                r0 = 0
                float r0 = (float) r0
                float r2 = c2.h.B(r0)
                r0 = 20
                float r0 = (float) r0
                float r3 = c2.h.B(r0)
                r6 = 24
                r7 = 0
                r4 = 0
                r5 = 0
                r0 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r8.f109878f = r9
                r8.f109879g = r10
                r8.f109880h = r11
                r8.f109881i = r12
                r0 = r20
                r8.f109882j = r0
                r0 = r21
                r8.f109883k = r0
                r0 = r22
                r8.f109884l = r0
                r0 = r23
                r8.f109885m = r0
                r8.f109886n = r13
                r8.f109887o = r14
                r0 = r26
                r8.f109888p = r0
                r0 = r27
                r8.f109889q = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: FF.C12888e.j.<init>(java.lang.Object, java.util.UUID, java.util.UUID, java.lang.String, android.net.Uri, int, java.time.Instant, int, com.sugarcube.core.network.models.RoomType, FF.h, android.net.Uri, tF.p):void");
        }

        public final UUID e() {
            return this.f109880h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return C17542s.e(this.f109878f, jVar.f109878f) && C17542s.e(this.f109879g, jVar.f109879g) && C17542s.e(this.f109880h, jVar.f109880h) && C17542s.e(this.f109881i, jVar.f109881i) && C17542s.e(this.f109882j, jVar.f109882j) && this.f109883k == jVar.f109883k && C17542s.e(this.f109884l, jVar.f109884l) && this.f109885m == jVar.f109885m && this.f109886n == jVar.f109886n && this.f109887o == jVar.f109887o && C17542s.e(this.f109888p, jVar.f109888p) && C17542s.e(this.f109889q, jVar.f109889q);
        }

        public final int f() {
            return this.f109883k;
        }

        public final Uri g() {
            return this.f109882j;
        }

        public final int h() {
            return this.f109885m;
        }

        public int hashCode() {
            int hashCode = ((((((this.f109878f.hashCode() * 31) + this.f109879g.hashCode()) * 31) + this.f109880h.hashCode()) * 31) + this.f109881i.hashCode()) * 31;
            Uri uri = this.f109882j;
            int i10 = 0;
            int hashCode2 = (((hashCode + (uri == null ? 0 : uri.hashCode())) * 31) + Integer.hashCode(this.f109883k)) * 31;
            Instant instant = this.f109884l;
            int hashCode3 = (((((((hashCode2 + (instant == null ? 0 : instant.hashCode())) * 31) + Integer.hashCode(this.f109885m)) * 31) + this.f109886n.hashCode()) * 31) + this.f109887o.hashCode()) * 31;
            Uri uri2 = this.f109888p;
            int hashCode4 = (hashCode3 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
            C15091p pVar = this.f109889q;
            if (pVar != null) {
                i10 = pVar.hashCode();
            }
            return hashCode4 + i10;
        }

        public final Instant i() {
            return this.f109884l;
        }

        public final String j() {
            return this.f109881i;
        }

        public final Uri k() {
            return this.f109888p;
        }

        public final C15091p l() {
            return this.f109889q;
        }

        public final RoomType m() {
            return this.f109886n;
        }

        public final UUID n() {
            return this.f109879g;
        }

        public final C12891h o() {
            return this.f109887o;
        }

        public String toString() {
            Object obj = this.f109878f;
            UUID uuid = this.f109879g;
            UUID uuid2 = this.f109880h;
            String str = this.f109881i;
            Uri uri = this.f109882j;
            int i10 = this.f109883k;
            Instant instant = this.f109884l;
            int i11 = this.f109885m;
            RoomType roomType = this.f109886n;
            C12891h hVar = this.f109887o;
            Uri uri2 = this.f109888p;
            C15091p pVar = this.f109889q;
            return "RoomCardUIModel(id=" + obj + ", sceneUUID=" + uuid + ", compositionUUID=" + uuid2 + ", roomName=" + str + ", image=" + uri + ", designCount=" + i10 + ", lastModified=" + instant + ", indexInSection=" + i11 + ", roomType=" + roomType + ", section=" + hVar + ", roomShapeURL=" + uri2 + ", roomSize=" + pVar + ")";
        }
    }

    public /* synthetic */ C12888e(Object obj, float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, f10, f11, f12, f13);
    }

    public final float a() {
        return this.f109865b;
    }

    public final float b() {
        return this.f109866c;
    }

    public final float c() {
        return this.f109868e;
    }

    public final float d() {
        return this.f109867d;
    }

    private C12888e(Object obj, float f10, float f11, float f12, float f13) {
        C17542s.j(obj, "key");
        this.f109864a = obj;
        this.f109865b = f10;
        this.f109866c = f11;
        this.f109867d = f12;
        this.f109868e = f13;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12888e(Object obj, float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? c2.h.B((float) 0) : f10, (i10 & 4) != 0 ? c2.h.B((float) 0) : f11, (i10 & 8) != 0 ? L.A() : f12, (i10 & 16) != 0 ? L.A() : f13, (DefaultConstructorMarker) null);
    }
}
