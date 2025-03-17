package B4;

import android.content.Context;
import android.util.AttributeSet;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.compose.ComposableFragment;
import kotlin.Metadata;
import x4.C8945i;
import x4.F;
import x4.I;
import x4.J;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LB4/a;", "Lx4/I;", "Landroidx/navigation/fragment/FragmentNavigator$c;", "Landroidx/navigation/fragment/FragmentNavigator;", "fragmentNavigator", "<init>", "(Landroidx/navigation/fragment/FragmentNavigator;)V", "Lx4/J;", "provider", "(Lx4/J;)V", "l", "()Landroidx/navigation/fragment/FragmentNavigator$c;", "c", "Landroidx/navigation/fragment/FragmentNavigator;", "a", "navigation-fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@I.b("composable")
public final class a extends I<FragmentNavigator.c> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f33130d = 8;

    /* renamed from: c  reason: collision with root package name */
    private final FragmentNavigator f33131c;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LB4/a$a;", "Landroidx/navigation/fragment/FragmentNavigator$c;", "Lx4/I;", "fragmentNavigator", "<init>", "(Lx4/I;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "LXH/N;", "J", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigation-fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B4.a$a  reason: collision with other inner class name */
    public static final class C0506a extends FragmentNavigator.c {
        public C0506a(I<? extends FragmentNavigator.c> i10) {
            super(i10);
        }

        public void J(Context context, AttributeSet attributeSet) {
            super.J(context, attributeSet);
            i("androidx.navigation.fragment.compose.FULLY_QUALIFIED_NAME", new C8945i.a().d(F.f57442q).b(R()).a());
            S(ComposableFragment.class.getName());
        }
    }

    public a(FragmentNavigator fragmentNavigator) {
        this.f33131c = fragmentNavigator;
    }

    /* renamed from: l */
    public FragmentNavigator.c a() {
        return new C0506a(this.f33131c);
    }

    public a(J j10) {
        this((FragmentNavigator) j10.d(FragmentNavigator.class));
    }
}
