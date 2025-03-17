package KF;

import com.sugarcube.app.base.network.ApiResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKF/f;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "Lcom/sugarcube/app/base/network/ApiResponse;", "apiResponse", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;Lcom/sugarcube/app/base/network/ApiResponse;)V", "a", "Lcom/sugarcube/app/base/network/ApiResponse;", "getApiResponse", "()Lcom/sugarcube/app/base/network/ApiResponse;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KF.f  reason: case insensitive filesystem */
public final class C13152f extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final ApiResponse<?> f111718a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13152f(String str, Exception exc, ApiResponse apiResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : exc, (i10 & 4) != 0 ? null : apiResponse);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13152f(String str, Exception exc, ApiResponse<?> apiResponse) {
        super(str, exc);
        C17542s.j(str, "message");
        this.f111718a = apiResponse;
    }
}
