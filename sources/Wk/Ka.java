package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0001\u0001\u000e¨\u0006\u000f"}, d2 = {"LwK/Ka;", "", "", "enabled", "Lr0/m;", "interactionSource", "<init>", "(ZLr0/m;)V", "a", "Z", "()Z", "b", "Lr0/m;", "()Lr0/m;", "LwK/Ka$a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Ka {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f149748a;

    /* renamed from: b  reason: collision with root package name */
    private final m f149749b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LwK/Ka$a;", "LwK/Ka;", "", "iconId", "", "contentDescription", "", "enabled", "Lr0/m;", "interactionSource", "<init>", "(ILjava/lang/String;ZLr0/m;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "I", "d", "Ljava/lang/String;", "e", "Z", "a", "()Z", "f", "Lr0/m;", "b", "()Lr0/m;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Ka {

        /* renamed from: c  reason: collision with root package name */
        private final int f149750c;

        /* renamed from: d  reason: collision with root package name */
        private final String f149751d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f149752e;

        /* renamed from: f  reason: collision with root package name */
        private final m f149753f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i10, String str, boolean z10, m mVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, str, z10, (i11 & 8) != 0 ? null : mVar);
        }

        public boolean a() {
            return this.f149752e;
        }

        public m b() {
            return this.f149753f;
        }

        public final String c() {
            return this.f149751d;
        }

        public final int d() {
            return this.f149750c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f149750c == aVar.f149750c && C17542s.e(this.f149751d, aVar.f149751d) && this.f149752e == aVar.f149752e && C17542s.e(this.f149753f, aVar.f149753f);
        }

        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.f149750c) * 31) + this.f149751d.hashCode()) * 31) + Boolean.hashCode(this.f149752e)) * 31;
            m mVar = this.f149753f;
            return hashCode + (mVar == null ? 0 : mVar.hashCode());
        }

        public String toString() {
            int i10 = this.f149750c;
            String str = this.f149751d;
            boolean z10 = this.f149752e;
            m mVar = this.f149753f;
            return "Icon(iconId=" + i10 + ", contentDescription=" + str + ", enabled=" + z10 + ", interactionSource=" + mVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, String str, boolean z10, m mVar) {
            super(z10, mVar, (DefaultConstructorMarker) null);
            C17542s.j(str, "contentDescription");
            this.f149750c = i10;
            this.f149751d = str;
            this.f149752e = z10;
            this.f149753f = mVar;
        }
    }

    public /* synthetic */ Ka(boolean z10, m mVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, mVar);
    }

    public boolean a() {
        return this.f149748a;
    }

    public m b() {
        return this.f149749b;
    }

    private Ka(boolean z10, m mVar) {
        this.f149748a = z10;
        this.f149749b = mVar;
    }
}
