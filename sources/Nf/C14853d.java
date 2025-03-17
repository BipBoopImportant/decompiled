package nF;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import fK.C17261n;
import fK.p;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import uI.C18055d;

@p
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"LnF/d;", "", "<init>", "()V", "", "f", "()Ljava/lang/String;", "url", "d", "contentDescription", "", "e", "()I", "placeholderImageId", "Companion", "c", "b", "a", "LnF/d$b;", "LnF/d$c;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nF.d  reason: case insensitive filesystem */
public abstract class C14853d {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16824o<KSerializer<Object>> f129818a = C16825p.a(s.PUBLICATION, new C14852c());

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LnF/d$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LnF/d;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nF.d$a */
    public static final class a {
        private a() {
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) C14853d.f129818a.getValue();
        }

        public final KSerializer<C14853d> serializer() {
            return a();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"LnF/d$b;", "LnF/d;", "", "url", "contentDescription", "", "placeholderImageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "c", "d", "I", "e", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nF.d$b */
    public static final class b extends C14853d {

        /* renamed from: b  reason: collision with root package name */
        private final String f129819b;

        /* renamed from: c  reason: collision with root package name */
        private final String f129820c;

        /* renamed from: d  reason: collision with root package name */
        private final int f129821d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "url");
            C17542s.j(str2, "contentDescription");
            this.f129819b = str;
            this.f129820c = str2;
            this.f129821d = i10;
        }

        public String d() {
            return this.f129820c;
        }

        public int e() {
            return this.f129821d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f129819b, bVar.f129819b) && C17542s.e(this.f129820c, bVar.f129820c) && this.f129821d == bVar.f129821d;
        }

        public String f() {
            return this.f129819b;
        }

        public int hashCode() {
            return (((this.f129819b.hashCode() * 31) + this.f129820c.hashCode()) * 31) + Integer.hashCode(this.f129821d);
        }

        public String toString() {
            String str = this.f129819b;
            String str2 = this.f129820c;
            int i10 = this.f129821d;
            return "Image(url=" + str + ", contentDescription=" + str2 + ", placeholderImageId=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"LnF/d$c;", "LnF/d;", "", "url", "contentDescription", "", "placeholderImageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "c", "d", "I", "e", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nF.d$c */
    public static final class c extends C14853d {

        /* renamed from: b  reason: collision with root package name */
        private final String f129822b;

        /* renamed from: c  reason: collision with root package name */
        private final String f129823c;

        /* renamed from: d  reason: collision with root package name */
        private final int f129824d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, int i10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "url");
            C17542s.j(str2, "contentDescription");
            this.f129822b = str;
            this.f129823c = str2;
            this.f129824d = i10;
        }

        public String d() {
            return this.f129823c;
        }

        public int e() {
            return this.f129824d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f129822b, cVar.f129822b) && C17542s.e(this.f129823c, cVar.f129823c) && this.f129824d == cVar.f129824d;
        }

        public String f() {
            return this.f129822b;
        }

        public int hashCode() {
            return (((this.f129822b.hashCode() * 31) + this.f129823c.hashCode()) * 31) + Integer.hashCode(this.f129824d);
        }

        public String toString() {
            String str = this.f129822b;
            String str2 = this.f129823c;
            int i10 = this.f129824d;
            return "Video(url=" + str + ", contentDescription=" + str2 + ", placeholderImageId=" + i10 + ")";
        }
    }

    public /* synthetic */ C14853d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new C17261n("com.sugarcube.app.base.ui.compose.entrypoint.model.Media", P.b(C14853d.class), new C18055d[0], new KSerializer[0], new Annotation[0]);
    }

    public abstract String d();

    public abstract int e();

    public abstract String f();

    private C14853d() {
    }
}
