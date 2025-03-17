package RF;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0006\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\b\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000e¨\u0006%"}, d2 = {"LRF/b;", "", "", "sceneId", "compositionId", "", "isSceneGLTF", "isInitialCompositionGLTF", "isSavedCompositionGLTF", "", "engineVersion", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)LRF/b;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getSceneId", "()Ljava/lang/Integer;", "b", "getCompositionId", "c", "Z", "()Z", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "f", "Ljava/lang/String;", "getEngineVersion", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RF.b  reason: case insensitive filesystem */
public final class C13549b {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f115531a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f115532b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f115533c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f115534d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f115535e;

    /* renamed from: f  reason: collision with root package name */
    private final String f115536f;

    public C13549b(Integer num, Integer num2, boolean z10, Boolean bool, Boolean bool2, String str) {
        C17542s.j(str, "engineVersion");
        this.f115531a = num;
        this.f115532b = num2;
        this.f115533c = z10;
        this.f115534d = bool;
        this.f115535e = bool2;
        this.f115536f = str;
    }

    public static /* synthetic */ C13549b b(C13549b bVar, Integer num, Integer num2, boolean z10, Boolean bool, Boolean bool2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = bVar.f115531a;
        }
        if ((i10 & 2) != 0) {
            num2 = bVar.f115532b;
        }
        Integer num3 = num2;
        if ((i10 & 4) != 0) {
            z10 = bVar.f115533c;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            bool = bVar.f115534d;
        }
        Boolean bool3 = bool;
        if ((i10 & 16) != 0) {
            bool2 = bVar.f115535e;
        }
        Boolean bool4 = bool2;
        if ((i10 & 32) != 0) {
            str = bVar.f115536f;
        }
        return bVar.a(num, num3, z11, bool3, bool4, str);
    }

    private static final String c(Boolean bool) {
        return C17542s.e(bool, Boolean.TRUE) ? "GLTF" : C17542s.e(bool, Boolean.FALSE) ? "Legacy2D" : "None";
    }

    public final C13549b a(Integer num, Integer num2, boolean z10, Boolean bool, Boolean bool2, String str) {
        C17542s.j(str, "engineVersion");
        return new C13549b(num, num2, z10, bool, bool2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13549b)) {
            return false;
        }
        C13549b bVar = (C13549b) obj;
        return C17542s.e(this.f115531a, bVar.f115531a) && C17542s.e(this.f115532b, bVar.f115532b) && this.f115533c == bVar.f115533c && C17542s.e(this.f115534d, bVar.f115534d) && C17542s.e(this.f115535e, bVar.f115535e) && C17542s.e(this.f115536f, bVar.f115536f);
    }

    public int hashCode() {
        Integer num = this.f115531a;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f115532b;
        int hashCode2 = (((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.f115533c)) * 31;
        Boolean bool = this.f115534d;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f115535e;
        if (bool2 != null) {
            i10 = bool2.hashCode();
        }
        return ((hashCode3 + i10) * 31) + this.f115536f.hashCode();
    }

    public String toString() {
        Integer num = this.f115531a;
        Integer num2 = this.f115532b;
        String c10 = c(Boolean.valueOf(this.f115533c));
        String c11 = c(this.f115534d);
        String c12 = c(this.f115535e);
        String str = this.f115536f;
        return C15854t.m("\n            Scene ID: " + num + "\n            Comp ID: " + num2 + "\n            Scene: " + c10 + "\n            LoadedComposition: " + c11 + "\n            SavedComposition: " + c12 + "\n            Decorate Engine Version: " + str + "\n        ");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13549b(Integer num, Integer num2, boolean z10, Boolean bool, Boolean bool2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, z10, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : bool2, str);
    }
}
