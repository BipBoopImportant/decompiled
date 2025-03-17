package xH;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LxH/j;", "LxH/e;", "", "maxLength", "minLength", "delegate", "<init>", "(IILxH/e;)V", "", "message", "LXH/N;", "a", "(Ljava/lang/String;)V", "log", "b", "I", "c", "d", "LxH/e;", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: xH.j  reason: case insensitive filesystem */
public final class C18596j implements C18591e {

    /* renamed from: b  reason: collision with root package name */
    private final int f152257b;

    /* renamed from: c  reason: collision with root package name */
    private final int f152258c;

    /* renamed from: d  reason: collision with root package name */
    private final C18591e f152259d;

    public C18596j(int i10, int i11, C18591e eVar) {
        C17542s.j(eVar, "delegate");
        this.f152257b = i10;
        this.f152258c = i11;
        this.f152259d = eVar;
    }

    private final void a(String str) {
        while (true) {
            int length = str.length();
            int i10 = this.f152257b;
            if (length > i10) {
                String substring = str.substring(0, i10);
                C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int i11 = this.f152257b;
                int y02 = C15854t.y0(substring, 10, 0, false, 6, (Object) null);
                if (y02 >= this.f152258c) {
                    substring = substring.substring(0, y02);
                    C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    i11 = y02 + 1;
                }
                this.f152259d.log(substring);
                str = str.substring(i11);
                C17542s.i(str, "this as java.lang.String).substring(startIndex)");
            } else {
                this.f152259d.log(str);
                return;
            }
        }
    }

    public void log(String str) {
        C17542s.j(str, "message");
        a(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18596j(int i10, int i11, C18591e eVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 4000 : i10, (i12 & 2) != 0 ? 3000 : i11, (i12 & 4) != 0 ? C18592f.c(C18591e.f152212a) : eVar);
    }
}
