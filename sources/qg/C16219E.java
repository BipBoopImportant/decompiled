package QG;

import android.net.Uri;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oF.C14899h;
import wK.C18381k3;
import wK.C18405m3;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0005\f\u0012\t\u000f\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0001\u0005\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"LQG/E;", "", "<init>", "()V", "LQG/E$e;", "c", "()LQG/E$e;", "id", "", "b", "()Z", "hidden", "d", "selectable", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "a", "()Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "event", "f", "e", "LQG/E$a;", "LQG/E$b;", "LQG/E$c;", "LQG/E$d;", "LQG/E$f;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QG.E  reason: case insensitive filesystem */
public abstract class C16219E {

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010!\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0013\u0010\u001eR\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001a\u0010/\u001a\u00020,8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b\u000e\u0010.R\u001c\u00105\u001a\u0004\u0018\u0001008\u0016X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"LQG/E$b;", "LQG/E;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LQG/E$e;", "a", "LQG/E$e;", "c", "()LQG/E$e;", "id", "b", "I", "g", "iconResId", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "contentDescriptionResId", "d", "Z", "f", "()Z", "enabled", "selectable", "hidden", "LwK/m3;", "LwK/m3;", "i", "()LwK/m3;", "variant", "LwK/k3;", "h", "LwK/k3;", "()LwK/k3;", "size", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "()Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "event", "LoF/h;", "j", "LoF/h;", "getTooltip", "()LoF/h;", "tooltip", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QG.E$b */
    public static final class b extends C16219E {

        /* renamed from: a  reason: collision with root package name */
        private final e f137229a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137230b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f137231c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f137232d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f137233e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f137234f;

        /* renamed from: g  reason: collision with root package name */
        private final C18405m3 f137235g;

        /* renamed from: h  reason: collision with root package name */
        private final C18381k3 f137236h;

        /* renamed from: i  reason: collision with root package name */
        private final com.sugarcube.decorate.v2.internal.ui.surface.a f137237i;

        /* renamed from: j  reason: collision with root package name */
        private final C14899h f137238j;

        public com.sugarcube.decorate.v2.internal.ui.surface.a a() {
            return this.f137237i;
        }

        public boolean b() {
            return this.f137234f;
        }

        public e c() {
            return this.f137229a;
        }

        public boolean d() {
            return this.f137233e;
        }

        public final Integer e() {
            return this.f137231c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f137229a == bVar.f137229a && this.f137230b == bVar.f137230b && C17542s.e(this.f137231c, bVar.f137231c) && this.f137232d == bVar.f137232d && this.f137233e == bVar.f137233e && this.f137234f == bVar.f137234f && C17542s.e(this.f137235g, bVar.f137235g) && this.f137236h == bVar.f137236h && C17542s.e(this.f137237i, bVar.f137237i) && C17542s.e(this.f137238j, bVar.f137238j);
        }

        public final boolean f() {
            return this.f137232d;
        }

        public final int g() {
            return this.f137230b;
        }

        public final C18381k3 h() {
            return this.f137236h;
        }

        public int hashCode() {
            int hashCode = ((this.f137229a.hashCode() * 31) + Integer.hashCode(this.f137230b)) * 31;
            Integer num = this.f137231c;
            int i10 = 0;
            int hashCode2 = (((((((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f137232d)) * 31) + Boolean.hashCode(this.f137233e)) * 31) + Boolean.hashCode(this.f137234f)) * 31) + this.f137235g.hashCode()) * 31) + this.f137236h.hashCode()) * 31) + this.f137237i.hashCode()) * 31;
            C14899h hVar = this.f137238j;
            if (hVar != null) {
                i10 = hVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public final C18405m3 i() {
            return this.f137235g;
        }

        public String toString() {
            e eVar = this.f137229a;
            int i10 = this.f137230b;
            Integer num = this.f137231c;
            boolean z10 = this.f137232d;
            boolean z11 = this.f137233e;
            boolean z12 = this.f137234f;
            C18405m3 m3Var = this.f137235g;
            C18381k3 k3Var = this.f137236h;
            com.sugarcube.decorate.v2.internal.ui.surface.a aVar = this.f137237i;
            C14899h hVar = this.f137238j;
            return "IconButton(id=" + eVar + ", iconResId=" + i10 + ", contentDescriptionResId=" + num + ", enabled=" + z10 + ", selectable=" + z11 + ", hidden=" + z12 + ", variant=" + m3Var + ", size=" + k3Var + ", event=" + aVar + ", tooltip=" + hVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b#\u0010)R\u001a\u0010\u000b\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b\u001f\u0010)R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001b\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b*\u0010/¨\u00060"}, d2 = {"LQG/E$c;", "LQG/E;", "LQG/E$e;", "id", "", "iconResId", "labelResId", "contentDescriptionResId", "", "enabled", "selectable", "hidden", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "event", "LoF/h;", "tooltip", "<init>", "(LQG/E$e;IILjava/lang/Integer;ZZZLcom/sugarcube/decorate/v2/internal/ui/surface/a;LoF/h;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LQG/E$e;", "c", "()LQG/E$e;", "b", "I", "f", "g", "d", "Ljava/lang/Integer;", "getContentDescriptionResId", "()Ljava/lang/Integer;", "e", "Z", "()Z", "h", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "()Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "i", "LoF/h;", "()LoF/h;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QG.E$c */
    public static final class c extends C16219E {

        /* renamed from: a  reason: collision with root package name */
        private final e f137239a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137240b;

        /* renamed from: c  reason: collision with root package name */
        private final int f137241c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f137242d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f137243e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f137244f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f137245g;

        /* renamed from: h  reason: collision with root package name */
        private final com.sugarcube.decorate.v2.internal.ui.surface.a f137246h;

        /* renamed from: i  reason: collision with root package name */
        private final C14899h f137247i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ c(QG.C16219E.e r14, int r15, int r16, java.lang.Integer r17, boolean r18, boolean r19, boolean r20, com.sugarcube.decorate.v2.internal.ui.surface.a r21, oF.C14899h r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r7 = r2
                goto L_0x000b
            L_0x0009:
                r7 = r17
            L_0x000b:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0012
                r1 = 1
                r8 = r1
                goto L_0x0014
            L_0x0012:
                r8 = r18
            L_0x0014:
                r1 = r0 & 32
                r3 = 0
                if (r1 == 0) goto L_0x001b
                r9 = r3
                goto L_0x001d
            L_0x001b:
                r9 = r19
            L_0x001d:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0023
                r10 = r3
                goto L_0x0025
            L_0x0023:
                r10 = r20
            L_0x0025:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x002b
                r12 = r2
                goto L_0x002d
            L_0x002b:
                r12 = r22
            L_0x002d:
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r11 = r21
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QG.C16219E.c.<init>(QG.E$e, int, int, java.lang.Integer, boolean, boolean, boolean, com.sugarcube.decorate.v2.internal.ui.surface.a, oF.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public com.sugarcube.decorate.v2.internal.ui.surface.a a() {
            return this.f137246h;
        }

        public boolean b() {
            return this.f137245g;
        }

        public e c() {
            return this.f137239a;
        }

        public boolean d() {
            return this.f137244f;
        }

        public final boolean e() {
            return this.f137243e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f137239a == cVar.f137239a && this.f137240b == cVar.f137240b && this.f137241c == cVar.f137241c && C17542s.e(this.f137242d, cVar.f137242d) && this.f137243e == cVar.f137243e && this.f137244f == cVar.f137244f && this.f137245g == cVar.f137245g && C17542s.e(this.f137246h, cVar.f137246h) && C17542s.e(this.f137247i, cVar.f137247i);
        }

        public final int f() {
            return this.f137240b;
        }

        public final int g() {
            return this.f137241c;
        }

        public C14899h h() {
            return this.f137247i;
        }

        public int hashCode() {
            int hashCode = ((((this.f137239a.hashCode() * 31) + Integer.hashCode(this.f137240b)) * 31) + Integer.hashCode(this.f137241c)) * 31;
            Integer num = this.f137242d;
            int i10 = 0;
            int hashCode2 = (((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f137243e)) * 31) + Boolean.hashCode(this.f137244f)) * 31) + Boolean.hashCode(this.f137245g)) * 31) + this.f137246h.hashCode()) * 31;
            C14899h hVar = this.f137247i;
            if (hVar != null) {
                i10 = hVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            e eVar = this.f137239a;
            int i10 = this.f137240b;
            int i11 = this.f137241c;
            Integer num = this.f137242d;
            boolean z10 = this.f137243e;
            boolean z11 = this.f137244f;
            boolean z12 = this.f137245g;
            com.sugarcube.decorate.v2.internal.ui.surface.a aVar = this.f137246h;
            C14899h hVar = this.f137247i;
            return "IconWithLabel(id=" + eVar + ", iconResId=" + i10 + ", labelResId=" + i11 + ", contentDescriptionResId=" + num + ", enabled=" + z10 + ", selectable=" + z11 + ", hidden=" + z12 + ", event=" + aVar + ", tooltip=" + hVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar, int i10, int i11, Integer num, boolean z10, boolean z11, boolean z12, com.sugarcube.decorate.v2.internal.ui.surface.a aVar, C14899h hVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "id");
            C17542s.j(aVar, "event");
            this.f137239a = eVar;
            this.f137240b = i10;
            this.f137241c = i11;
            this.f137242d = num;
            this.f137243e = z10;
            this.f137244f = z11;
            this.f137245g = z12;
            this.f137246h = aVar;
            this.f137247i = hVar;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b+\u0010*R\u001a\u0010\u000b\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b$\u0010*R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b \u0010*R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001c\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b,\u00101¨\u00062"}, d2 = {"LQG/E$d;", "LQG/E;", "LQG/E$e;", "id", "", "iconResId", "labelResId", "contentDescriptionResId", "", "enabled", "selected", "selectable", "hidden", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "event", "LoF/h;", "tooltip", "<init>", "(LQG/E$e;IILjava/lang/Integer;ZZZZLcom/sugarcube/decorate/v2/internal/ui/surface/a;LoF/h;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LQG/E$e;", "c", "()LQG/E$e;", "b", "I", "f", "g", "d", "Ljava/lang/Integer;", "getContentDescriptionResId", "()Ljava/lang/Integer;", "e", "Z", "()Z", "h", "i", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "()Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "j", "LoF/h;", "()LoF/h;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QG.E$d */
    public static final class d extends C16219E {

        /* renamed from: a  reason: collision with root package name */
        private final e f137248a;

        /* renamed from: b  reason: collision with root package name */
        private final int f137249b;

        /* renamed from: c  reason: collision with root package name */
        private final int f137250c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f137251d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f137252e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f137253f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f137254g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f137255h;

        /* renamed from: i  reason: collision with root package name */
        private final com.sugarcube.decorate.v2.internal.ui.surface.a f137256i;

        /* renamed from: j  reason: collision with root package name */
        private final C14899h f137257j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ d(QG.C16219E.e r15, int r16, int r17, java.lang.Integer r18, boolean r19, boolean r20, boolean r21, boolean r22, com.sugarcube.decorate.v2.internal.ui.surface.a r23, oF.C14899h r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
            /*
                r14 = this;
                r0 = r25
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r7 = r2
                goto L_0x000b
            L_0x0009:
                r7 = r18
            L_0x000b:
                r1 = r0 & 16
                r3 = 1
                if (r1 == 0) goto L_0x0012
                r8 = r3
                goto L_0x0014
            L_0x0012:
                r8 = r19
            L_0x0014:
                r1 = r0 & 32
                r4 = 0
                if (r1 == 0) goto L_0x001b
                r9 = r4
                goto L_0x001d
            L_0x001b:
                r9 = r20
            L_0x001d:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0023
                r10 = r3
                goto L_0x0025
            L_0x0023:
                r10 = r21
            L_0x0025:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x002b
                r11 = r4
                goto L_0x002d
            L_0x002b:
                r11 = r22
            L_0x002d:
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 == 0) goto L_0x0033
                r13 = r2
                goto L_0x0035
            L_0x0033:
                r13 = r24
            L_0x0035:
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r12 = r23
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QG.C16219E.d.<init>(QG.E$e, int, int, java.lang.Integer, boolean, boolean, boolean, boolean, com.sugarcube.decorate.v2.internal.ui.surface.a, oF.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public com.sugarcube.decorate.v2.internal.ui.surface.a a() {
            return this.f137256i;
        }

        public boolean b() {
            return this.f137255h;
        }

        public e c() {
            return this.f137248a;
        }

        public boolean d() {
            return this.f137254g;
        }

        public final boolean e() {
            return this.f137252e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f137248a == dVar.f137248a && this.f137249b == dVar.f137249b && this.f137250c == dVar.f137250c && C17542s.e(this.f137251d, dVar.f137251d) && this.f137252e == dVar.f137252e && this.f137253f == dVar.f137253f && this.f137254g == dVar.f137254g && this.f137255h == dVar.f137255h && C17542s.e(this.f137256i, dVar.f137256i) && C17542s.e(this.f137257j, dVar.f137257j);
        }

        public final int f() {
            return this.f137249b;
        }

        public final int g() {
            return this.f137250c;
        }

        public final boolean h() {
            return this.f137253f;
        }

        public int hashCode() {
            int hashCode = ((((this.f137248a.hashCode() * 31) + Integer.hashCode(this.f137249b)) * 31) + Integer.hashCode(this.f137250c)) * 31;
            Integer num = this.f137251d;
            int i10 = 0;
            int hashCode2 = (((((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f137252e)) * 31) + Boolean.hashCode(this.f137253f)) * 31) + Boolean.hashCode(this.f137254g)) * 31) + Boolean.hashCode(this.f137255h)) * 31) + this.f137256i.hashCode()) * 31;
            C14899h hVar = this.f137257j;
            if (hVar != null) {
                i10 = hVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public C14899h i() {
            return this.f137257j;
        }

        public String toString() {
            e eVar = this.f137248a;
            int i10 = this.f137249b;
            int i11 = this.f137250c;
            Integer num = this.f137251d;
            boolean z10 = this.f137252e;
            boolean z11 = this.f137253f;
            boolean z12 = this.f137254g;
            boolean z13 = this.f137255h;
            com.sugarcube.decorate.v2.internal.ui.surface.a aVar = this.f137256i;
            C14899h hVar = this.f137257j;
            return "IconWithLabelSelectable(id=" + eVar + ", iconResId=" + i10 + ", labelResId=" + i11 + ", contentDescriptionResId=" + num + ", enabled=" + z10 + ", selected=" + z11 + ", selectable=" + z12 + ", hidden=" + z13 + ", event=" + aVar + ", tooltip=" + hVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(e eVar, int i10, int i11, Integer num, boolean z10, boolean z11, boolean z12, boolean z13, com.sugarcube.decorate.v2.internal.ui.surface.a aVar, C14899h hVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "id");
            C17542s.j(aVar, "event");
            this.f137248a = eVar;
            this.f137249b = i10;
            this.f137250c = i11;
            this.f137251d = num;
            this.f137252e = z10;
            this.f137253f = z11;
            this.f137254g = z12;
            this.f137255h = z13;
            this.f137256i = aVar;
            this.f137257j = hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b \b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"LQG/E$e;", "", "", "id", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "ROTATE", "SWAP", "DELETE", "DUPLICATE", "GOES_WITH", "MOVE", "MIRROR", "FLIP", "SAVE", "SHARE", "ADD", "EXIT", "VIEWS", "CART", "PRODUCT_INFO", "VARIANTS", "ERASE", "MOVE_BACK", "STYLE", "ITEM_LIST", "DOLLHOUSE_VIEW", "TOP_VIEW", "SIDE_VIEWS", "SHOW_MORE", "DIVIDER", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QG.E$e */
    public enum e {
        ROTATE(1),
        SWAP(2),
        DELETE(3),
        DUPLICATE(4),
        GOES_WITH(5),
        MOVE(6),
        MIRROR(7),
        FLIP(8),
        SAVE(9),
        SHARE(10),
        ADD(11),
        EXIT(12),
        VIEWS(13),
        CART(14),
        PRODUCT_INFO(15),
        VARIANTS(16),
        ERASE(17),
        MOVE_BACK(18),
        STYLE(19),
        ITEM_LIST(20),
        DOLLHOUSE_VIEW(21),
        TOP_VIEW(22),
        SIDE_VIEWS(23),
        SHOW_MORE(Integer.MAX_VALUE),
        DIVIDER(Integer.MIN_VALUE);
        

        /* renamed from: id  reason: collision with root package name */
        private final int f137258id;

        static {
            e[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private e(int i10) {
            this.f137258id = i10;
        }

        public final int b() {
            return this.f137258id;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b&\u0010*R\u001a\u0010\f\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b \u0010*R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001c\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"LQG/E$f;", "LQG/E;", "LQG/E$e;", "id", "Landroid/net/Uri;", "imageUrl", "", "labelResId", "contentDescriptionResId", "", "enabled", "selectable", "hidden", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "event", "LoF/h;", "tooltip", "<init>", "(LQG/E$e;Landroid/net/Uri;IIZZZLcom/sugarcube/decorate/v2/internal/ui/surface/a;LoF/h;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LQG/E$e;", "c", "()LQG/E$e;", "b", "Landroid/net/Uri;", "f", "()Landroid/net/Uri;", "I", "g", "d", "e", "Z", "getEnabled", "()Z", "h", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "()Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "i", "LoF/h;", "getTooltip", "()LoF/h;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QG.E$f */
    public static final class f extends C16219E {

        /* renamed from: a  reason: collision with root package name */
        private final e f137259a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f137260b;

        /* renamed from: c  reason: collision with root package name */
        private final int f137261c;

        /* renamed from: d  reason: collision with root package name */
        private final int f137262d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f137263e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f137264f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f137265g;

        /* renamed from: h  reason: collision with root package name */
        private final com.sugarcube.decorate.v2.internal.ui.surface.a f137266h;

        /* renamed from: i  reason: collision with root package name */
        private final C14899h f137267i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ f(QG.C16219E.e r13, android.net.Uri r14, int r15, int r16, boolean r17, boolean r18, boolean r19, com.sugarcube.decorate.v2.internal.ui.surface.a r20, oF.C14899h r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
            /*
                r12 = this;
                r0 = r22
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0009
                r1 = 1
                r7 = r1
                goto L_0x000b
            L_0x0009:
                r7 = r17
            L_0x000b:
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L_0x0012
                r8 = r2
                goto L_0x0014
            L_0x0012:
                r8 = r18
            L_0x0014:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x001a
                r9 = r2
                goto L_0x001c
            L_0x001a:
                r9 = r19
            L_0x001c:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0023
                r0 = 0
                r11 = r0
                goto L_0x0025
            L_0x0023:
                r11 = r21
            L_0x0025:
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r10 = r20
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QG.C16219E.f.<init>(QG.E$e, android.net.Uri, int, int, boolean, boolean, boolean, com.sugarcube.decorate.v2.internal.ui.surface.a, oF.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public com.sugarcube.decorate.v2.internal.ui.surface.a a() {
            return this.f137266h;
        }

        public boolean b() {
            return this.f137265g;
        }

        public e c() {
            return this.f137259a;
        }

        public boolean d() {
            return this.f137264f;
        }

        public final int e() {
            return this.f137262d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f137259a == fVar.f137259a && C17542s.e(this.f137260b, fVar.f137260b) && this.f137261c == fVar.f137261c && this.f137262d == fVar.f137262d && this.f137263e == fVar.f137263e && this.f137264f == fVar.f137264f && this.f137265g == fVar.f137265g && C17542s.e(this.f137266h, fVar.f137266h) && C17542s.e(this.f137267i, fVar.f137267i);
        }

        public final Uri f() {
            return this.f137260b;
        }

        public final int g() {
            return this.f137261c;
        }

        public int hashCode() {
            int hashCode = this.f137259a.hashCode() * 31;
            Uri uri = this.f137260b;
            int i10 = 0;
            int hashCode2 = (((((((((((((hashCode + (uri == null ? 0 : uri.hashCode())) * 31) + Integer.hashCode(this.f137261c)) * 31) + Integer.hashCode(this.f137262d)) * 31) + Boolean.hashCode(this.f137263e)) * 31) + Boolean.hashCode(this.f137264f)) * 31) + Boolean.hashCode(this.f137265g)) * 31) + this.f137266h.hashCode()) * 31;
            C14899h hVar = this.f137267i;
            if (hVar != null) {
                i10 = hVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            e eVar = this.f137259a;
            Uri uri = this.f137260b;
            int i10 = this.f137261c;
            int i11 = this.f137262d;
            boolean z10 = this.f137263e;
            boolean z11 = this.f137264f;
            boolean z12 = this.f137265g;
            com.sugarcube.decorate.v2.internal.ui.surface.a aVar = this.f137266h;
            C14899h hVar = this.f137267i;
            return "ImageWithLabel(id=" + eVar + ", imageUrl=" + uri + ", labelResId=" + i10 + ", contentDescriptionResId=" + i11 + ", enabled=" + z10 + ", selectable=" + z11 + ", hidden=" + z12 + ", event=" + aVar + ", tooltip=" + hVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(e eVar, Uri uri, int i10, int i11, boolean z10, boolean z11, boolean z12, com.sugarcube.decorate.v2.internal.ui.surface.a aVar, C14899h hVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "id");
            C17542s.j(aVar, "event");
            this.f137259a = eVar;
            this.f137260b = uri;
            this.f137261c = i10;
            this.f137262d = i11;
            this.f137263e = z10;
            this.f137264f = z11;
            this.f137265g = z12;
            this.f137266h = aVar;
            this.f137267i = hVar;
        }
    }

    public /* synthetic */ C16219E(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract com.sugarcube.decorate.v2.internal.ui.surface.a a();

    public abstract boolean b();

    public abstract e c();

    public abstract boolean d();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"LQG/E$a;", "LQG/E;", "LQG/E$e;", "id", "", "hidden", "selectable", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "event", "LoF/h;", "tooltip", "<init>", "(LQG/E$e;ZZLcom/sugarcube/decorate/v2/internal/ui/surface/a;LoF/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LQG/E$e;", "c", "()LQG/E$e;", "b", "Z", "()Z", "d", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "()Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "e", "LoF/h;", "getTooltip", "()LoF/h;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QG.E$a */
    public static final class a extends C16219E {

        /* renamed from: a  reason: collision with root package name */
        private final e f137224a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f137225b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f137226c;

        /* renamed from: d  reason: collision with root package name */
        private final com.sugarcube.decorate.v2.internal.ui.surface.a f137227d;

        /* renamed from: e  reason: collision with root package name */
        private final C14899h f137228e;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(e eVar, boolean z10, boolean z11, com.sugarcube.decorate.v2.internal.ui.surface.a aVar, C14899h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? e.DIVIDER : eVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, aVar, (i10 & 16) != 0 ? null : hVar);
        }

        public com.sugarcube.decorate.v2.internal.ui.surface.a a() {
            return this.f137227d;
        }

        public boolean b() {
            return this.f137225b;
        }

        public e c() {
            return this.f137224a;
        }

        public boolean d() {
            return this.f137226c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f137224a == aVar.f137224a && this.f137225b == aVar.f137225b && this.f137226c == aVar.f137226c && C17542s.e(this.f137227d, aVar.f137227d) && C17542s.e(this.f137228e, aVar.f137228e);
        }

        public int hashCode() {
            int hashCode = ((((((this.f137224a.hashCode() * 31) + Boolean.hashCode(this.f137225b)) * 31) + Boolean.hashCode(this.f137226c)) * 31) + this.f137227d.hashCode()) * 31;
            C14899h hVar = this.f137228e;
            return hashCode + (hVar == null ? 0 : hVar.hashCode());
        }

        public String toString() {
            e eVar = this.f137224a;
            boolean z10 = this.f137225b;
            boolean z11 = this.f137226c;
            com.sugarcube.decorate.v2.internal.ui.surface.a aVar = this.f137227d;
            C14899h hVar = this.f137228e;
            return "Divider(id=" + eVar + ", hidden=" + z10 + ", selectable=" + z11 + ", event=" + aVar + ", tooltip=" + hVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, boolean z10, boolean z11, com.sugarcube.decorate.v2.internal.ui.surface.a aVar, C14899h hVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "id");
            C17542s.j(aVar, "event");
            this.f137224a = eVar;
            this.f137225b = z10;
            this.f137226c = z11;
            this.f137227d = aVar;
            this.f137228e = hVar;
        }
    }

    private C16219E() {
    }
}
