package wK;

import U0.C4889m;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import t1.C5942c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LwK/b5;", "", "b", "c", "d", "a", "LwK/b5$a;", "LwK/b5$b;", "LwK/b5$c;", "LwK/b5$d;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.b5  reason: case insensitive filesystem */
public abstract class C18275b5 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f150612a = 0;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"LwK/b5$a;", "LwK/b5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/d;", "b", "Landroidx/compose/ui/d;", "getModifier", "()Landroidx/compose/ui/d;", "modifier", "LwK/H9;", "c", "LwK/H9;", "a", "()LwK/H9;", "aspectRatio", "Lkotlin/Function0;", "LXH/N;", "d", "LnI/p;", "()LnI/p;", "content", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.b5$a */
    public static final class a extends C18275b5 {

        /* renamed from: b  reason: collision with root package name */
        private final androidx.compose.ui.d f150613b;

        /* renamed from: c  reason: collision with root package name */
        private final H9 f150614c;

        /* renamed from: d  reason: collision with root package name */
        private final p<C4889m, Integer, C16807N> f150615d;

        public final H9 a() {
            return this.f150614c;
        }

        public final p<C4889m, Integer, C16807N> b() {
            return this.f150615d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f150613b, aVar.f150613b) && this.f150614c == aVar.f150614c && C17542s.e(this.f150615d, aVar.f150615d);
        }

        public int hashCode() {
            return (((this.f150613b.hashCode() * 31) + this.f150614c.hashCode()) * 31) + this.f150615d.hashCode();
        }

        public String toString() {
            androidx.compose.ui.d dVar = this.f150613b;
            H9 h92 = this.f150614c;
            p<C4889m, Integer, C16807N> pVar = this.f150615d;
            return "Custom(modifier=" + dVar + ", aspectRatio=" + h92 + ", content=" + pVar + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LwK/b5$b;", "LwK/b5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lt1/c;", "b", "Lt1/c;", "c", "()Lt1/c;", "painter", "Ljava/lang/String;", "contentDescription", "LwK/H9;", "d", "LwK/H9;", "a", "()LwK/H9;", "aspectRatio", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.b5$b */
    public static final class b extends C18275b5 {

        /* renamed from: b  reason: collision with root package name */
        private final C5942c f150616b;

        /* renamed from: c  reason: collision with root package name */
        private final String f150617c;

        /* renamed from: d  reason: collision with root package name */
        private final H9 f150618d;

        public final H9 a() {
            return this.f150618d;
        }

        public final String b() {
            return this.f150617c;
        }

        public final C5942c c() {
            return this.f150616b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f150616b, bVar.f150616b) && C17542s.e(this.f150617c, bVar.f150617c) && this.f150618d == bVar.f150618d;
        }

        public int hashCode() {
            int hashCode = this.f150616b.hashCode() * 31;
            String str = this.f150617c;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f150618d.hashCode();
        }

        public String toString() {
            C5942c cVar = this.f150616b;
            String str = this.f150617c;
            H9 h92 = this.f150618d;
            return "Image(painter=" + cVar + ", contentDescription=" + str + ", aspectRatio=" + h92 + ")";
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010#\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u0017\u0010'\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R%\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u000f\u0010,R\u0019\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b \u00101¨\u00062"}, d2 = {"LwK/b5$c;", "T", "LwK/b5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LwK/g9;", "b", "LwK/g9;", "a", "()LwK/g9;", "imageParams", "", "LwK/h9;", "c", "Ljava/util/List;", "()Ljava/util/List;", "products", "Landroidx/compose/ui/d;", "d", "Landroidx/compose/ui/d;", "getModifier", "()Landroidx/compose/ui/d;", "modifier", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "selectedProduct", "f", "Z", "()Z", "showDots", "Lkotlin/Function1;", "LXH/N;", "g", "LnI/l;", "()LnI/l;", "onSelected", "LwK/f9;", "shopAllButtonParams", "LwK/f9;", "()LwK/f9;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.b5$c */
    public static final class c<T> extends C18275b5 {

        /* renamed from: b  reason: collision with root package name */
        private final C18339g9 f150619b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C18351h9<T>> f150620c;

        /* renamed from: d  reason: collision with root package name */
        private final androidx.compose.ui.d f150621d;

        /* renamed from: e  reason: collision with root package name */
        private final T f150622e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f150623f;

        /* renamed from: g  reason: collision with root package name */
        private final C17642l<T, C16807N> f150624g;

        public final C18339g9 a() {
            return this.f150619b;
        }

        public final C17642l<T, C16807N> b() {
            return this.f150624g;
        }

        public final List<C18351h9<T>> c() {
            return this.f150620c;
        }

        public final T d() {
            return this.f150622e;
        }

        public final C18327f9 e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f150619b, cVar.f150619b) && C17542s.e(this.f150620c, cVar.f150620c) && C17542s.e(this.f150621d, cVar.f150621d) && C17542s.e(this.f150622e, cVar.f150622e) && this.f150623f == cVar.f150623f && C17542s.e((Object) null, (Object) null) && C17542s.e(this.f150624g, cVar.f150624g);
        }

        public final boolean f() {
            return this.f150623f;
        }

        public int hashCode() {
            int hashCode = ((((this.f150619b.hashCode() * 31) + this.f150620c.hashCode()) * 31) + this.f150621d.hashCode()) * 31;
            T t10 = this.f150622e;
            return ((((hashCode + (t10 == null ? 0 : t10.hashCode())) * 31) + Boolean.hashCode(this.f150623f)) * 961) + this.f150624g.hashCode();
        }

        public String toString() {
            C18339g9 g9Var = this.f150619b;
            List<C18351h9<T>> list = this.f150620c;
            androidx.compose.ui.d dVar = this.f150621d;
            T t10 = this.f150622e;
            boolean z10 = this.f150623f;
            C17642l<T, C16807N> lVar = this.f150624g;
            return "ShoppableImage(imageParams=" + g9Var + ", products=" + list + ", modifier=" + dVar + ", selectedProduct=" + t10 + ", showDots=" + z10 + ", shopAllButtonParams=" + null + ", onSelected=" + lVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u000f\u0010\u0004R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006 "}, d2 = {"LwK/b5$d;", "LwK/b5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function0;", "LXH/N;", "b", "LnI/p;", "d", "()LnI/p;", "player", "LwK/H9;", "c", "LwK/H9;", "a", "()LwK/H9;", "aspectRatio", "Ljava/lang/String;", "contentDescription", "e", "LnI/a;", "()LnI/a;", "onClick", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.b5$d */
    public static final class d extends C18275b5 {

        /* renamed from: b  reason: collision with root package name */
        private final p<C4889m, Integer, C16807N> f150625b;

        /* renamed from: c  reason: collision with root package name */
        private final H9 f150626c;

        /* renamed from: d  reason: collision with root package name */
        private final String f150627d;

        /* renamed from: e  reason: collision with root package name */
        private final C17631a<C16807N> f150628e;

        public final H9 a() {
            return this.f150626c;
        }

        public final String b() {
            return this.f150627d;
        }

        public final C17631a<C16807N> c() {
            return this.f150628e;
        }

        public final p<C4889m, Integer, C16807N> d() {
            return this.f150625b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f150625b, dVar.f150625b) && this.f150626c == dVar.f150626c && C17542s.e(this.f150627d, dVar.f150627d) && C17542s.e(this.f150628e, dVar.f150628e);
        }

        public int hashCode() {
            int hashCode = ((this.f150625b.hashCode() * 31) + this.f150626c.hashCode()) * 31;
            String str = this.f150627d;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f150628e.hashCode();
        }

        public String toString() {
            p<C4889m, Integer, C16807N> pVar = this.f150625b;
            H9 h92 = this.f150626c;
            String str = this.f150627d;
            C17631a<C16807N> aVar = this.f150628e;
            return "Video(player=" + pVar + ", aspectRatio=" + h92 + ", contentDescription=" + str + ", onClick=" + aVar + ")";
        }
    }
}
