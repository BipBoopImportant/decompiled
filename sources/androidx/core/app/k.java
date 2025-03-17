package androidx.core.app;

import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/core/app/k;", "", "", "isInMultiWindowMode", "<init>", "(Z)V", "Landroid/content/res/Configuration;", "newConfig", "(ZLandroid/content/res/Configuration;)V", "a", "Z", "()Z", "b", "Landroid/content/res/Configuration;", "newConfiguration", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f20985a;

    /* renamed from: b  reason: collision with root package name */
    private Configuration f20986b;

    public k(boolean z10) {
        this.f20985a = z10;
    }

    public final boolean a() {
        return this.f20985a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(boolean z10, Configuration configuration) {
        this(z10);
        C17542s.j(configuration, "newConfig");
        this.f20986b = configuration;
    }
}
