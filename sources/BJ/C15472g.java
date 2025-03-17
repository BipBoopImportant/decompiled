package BJ;

import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: BJ.g  reason: case insensitive filesystem */
public abstract class C15472g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f133309a;

    /* renamed from: BJ.g$a */
    public static final class a extends C15472g {

        /* renamed from: b  reason: collision with root package name */
        public static final a f133310b = new a();

        private a() {
            super(false, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: BJ.g$b */
    public static final class b extends C15472g {

        /* renamed from: b  reason: collision with root package name */
        private final String f133311b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, (DefaultConstructorMarker) null);
            C17542s.j(str, UiComponentContainer.RESULT_ERROR);
            this.f133311b = str;
        }
    }

    /* renamed from: BJ.g$c */
    public static final class c extends C15472g {

        /* renamed from: b  reason: collision with root package name */
        public static final c f133312b = new c();

        private c() {
            super(true, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C15472g(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f133309a;
    }

    private C15472g(boolean z10) {
        this.f133309a = z10;
    }
}
