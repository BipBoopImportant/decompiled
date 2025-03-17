package Y1;

import e2.C5294a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"LY1/k;", "", "", "mask", "<init>", "(I)V", "other", "", "d", "(LY1/k;)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "e", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14792b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final k f14793c = new k(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final k f14794d = new k(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final k f14795e = new k(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f14796a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"LY1/k$a;", "", "<init>", "()V", "", "LY1/k;", "decorations", "a", "(Ljava/util/List;)LY1/k;", "None", "LY1/k;", "c", "()LY1/k;", "getNone$annotations", "Underline", "d", "getUnderline$annotations", "LineThrough", "b", "getLineThrough$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(List<k> list) {
            Integer num = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                num = Integer.valueOf(num.intValue() | list.get(i10).e());
            }
            return new k(num.intValue());
        }

        public final k b() {
            return k.f14795e;
        }

        public final k c() {
            return k.f14793c;
        }

        public final k d() {
            return k.f14794d;
        }

        private a() {
        }
    }

    public k(int i10) {
        this.f14796a = i10;
    }

    public final boolean d(k kVar) {
        int i10 = this.f14796a;
        return (kVar.f14796a | i10) == i10;
    }

    public final int e() {
        return this.f14796a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f14796a == ((k) obj).f14796a;
    }

    public int hashCode() {
        return this.f14796a;
    }

    public String toString() {
        if (this.f14796a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f14796a & f14794d.f14796a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f14796a & f14795e.f14796a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + C5294a.e(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null) + ']';
    }
}
