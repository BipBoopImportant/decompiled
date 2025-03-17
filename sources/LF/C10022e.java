package lf;

import android.text.Spannable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xB.C15201a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b \u0010\u001f\"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Llf/e;", "LxB/a;", "", "stableId", "Landroid/text/Spannable;", "title", "titleExpanded", "", "", "delegateModels", "", "expandedByDefault", "<init>", "(JLandroid/text/Spannable;Landroid/text/Spannable;Ljava/util/List;Z)V", "a", "J", "f", "()J", "b", "Landroid/text/Spannable;", "i", "()Landroid/text/Spannable;", "c", "j", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "e", "Z", "getExpandedByDefault", "()Z", "h", "n", "(Z)V", "expanded", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lf.e  reason: case insensitive filesystem */
public final class C10022e implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final long f75238a;

    /* renamed from: b  reason: collision with root package name */
    private final Spannable f75239b;

    /* renamed from: c  reason: collision with root package name */
    private final Spannable f75240c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Object> f75241d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f75242e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f75243f;

    public C10022e(long j10, Spannable spannable, Spannable spannable2, List<? extends Object> list, boolean z10) {
        C17542s.j(spannable, "title");
        C17542s.j(spannable2, "titleExpanded");
        C17542s.j(list, "delegateModels");
        this.f75238a = j10;
        this.f75239b = spannable;
        this.f75240c = spannable2;
        this.f75241d = list;
        this.f75242e = z10;
        this.f75243f = z10;
    }

    public long f() {
        return this.f75238a;
    }

    public final List<Object> g() {
        return this.f75241d;
    }

    public final boolean h() {
        return this.f75243f;
    }

    public final Spannable i() {
        return this.f75239b;
    }

    public final Spannable j() {
        return this.f75240c;
    }

    public final void n(boolean z10) {
        this.f75243f = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10022e(long j10, Spannable spannable, Spannable spannable2, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, spannable, (i10 & 4) != 0 ? spannable : spannable2, list, (i10 & 16) != 0 ? false : z10);
    }
}
