package I2;

import GJ.C15765h;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import oI.C17693a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "", "d", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "LGJ/h;", "b", "(Landroid/view/ViewGroup;)LGJ/h;", "children", "c", "descendants", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I2.g0  reason: case insensitive filesystem */
public final class C4610g0 {

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"I2/g0$a", "LGJ/h;", "Landroid/view/View;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I2.g0$a */
    public static final class a implements C15765h<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f8668a;

        a(ViewGroup viewGroup) {
            this.f8668a = viewGroup;
        }

        public Iterator<View> iterator() {
            return C4610g0.d(this.f8668a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "child", "", "a", "(Landroid/view/View;)Ljava/util/Iterator;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I2.g0$b */
    static final class b extends C17544u implements C17642l<View, Iterator<? extends View>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f8669c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Iterator<View> invoke(View view) {
            C15765h<View> b10;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (b10 = C4610g0.b(viewGroup)) == null) {
                return null;
            }
            return b10.iterator();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"I2/g0$c", "", "Landroid/view/View;", "", "hasNext", "()Z", "c", "()Landroid/view/View;", "LXH/N;", "remove", "()V", "", "a", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I2.g0$c */
    public static final class c implements Iterator<View>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f8670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f8671b;

        c(ViewGroup viewGroup) {
            this.f8671b = viewGroup;
        }

        /* renamed from: c */
        public View next() {
            ViewGroup viewGroup = this.f8671b;
            int i10 = this.f8670a;
            this.f8670a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f8670a < this.f8671b.getChildCount();
        }

        public void remove() {
            ViewGroup viewGroup = this.f8671b;
            int i10 = this.f8670a - 1;
            this.f8670a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"I2/g0$d", "LGJ/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I2.g0$d */
    public static final class d implements C15765h<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f8672a;

        public d(ViewGroup viewGroup) {
            this.f8672a = viewGroup;
        }

        public Iterator<View> iterator() {
            return new X(C4610g0.b(this.f8672a).iterator(), b.f8669c);
        }
    }

    public static final View a(ViewGroup viewGroup, int i10) {
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + viewGroup.getChildCount());
    }

    public static final C15765h<View> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final C15765h<View> c(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator<View> d(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
