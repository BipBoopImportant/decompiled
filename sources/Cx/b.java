package Cx;

import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LCx/b;", "", "<init>", "()V", "", "token", "LXH/N;", "e", "(Ljava/lang/String;)V", "a", "LTJ/B;", "LTJ/B;", "_accessToken", "LTJ/P;", "b", "LTJ/P;", "()LTJ/P;", "accessToken", "", "d", "()Z", "useStoryPublisherMode", "c", "()Ljava/lang/String;", "bearerPublisherAccessToken", "publishersession_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final C16505B<String> f108466a;

    /* renamed from: b  reason: collision with root package name */
    private final C16519P<String> f108467b;

    public b() {
        C16505B<String> a10 = C16521S.a(null);
        this.f108466a = a10;
        this.f108467b = a10;
    }

    public final void a() {
        this.f108466a.setValue(null);
    }

    public final C16519P<String> b() {
        return this.f108467b;
    }

    public final String c() {
        String value = this.f108466a.getValue();
        if (value != null) {
            String str = "Bearer " + value;
            return str == null ? "" : str;
        }
    }

    public final boolean d() {
        return this.f108466a.getValue() != null;
    }

    public final void e(String str) {
        this.f108466a.setValue(str);
    }
}
