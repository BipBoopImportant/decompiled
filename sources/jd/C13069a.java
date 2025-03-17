package JD;

import dI.C17164e;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦B¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJD/a;", "", "", "redemptionCode", "LJD/a$a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JD.a  reason: case insensitive filesystem */
public interface C13069a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LJD/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "Success", "InvalidInput", "Failure", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JD.a$a  reason: collision with other inner class name */
    public enum C2695a {
        Success,
        InvalidInput,
        Failure;

        static {
            C2695a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    Object a(String str, C17164e<? super C2695a> eVar);
}
