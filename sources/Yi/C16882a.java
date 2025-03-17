package YI;

import YH.C16877v;
import YH.U;
import ZI.C17004a;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17974j;

/* renamed from: YI.a  reason: case insensitive filesystem */
public final class C16882a extends C17004a {

    /* renamed from: g  reason: collision with root package name */
    public static final C3439a f140473g = new C3439a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final C16882a f140474h = new C16882a(1, 0, 7);

    /* renamed from: i  reason: collision with root package name */
    public static final C16882a f140475i = new C16882a(new int[0]);

    /* renamed from: YI.a$a  reason: collision with other inner class name */
    public static final class C3439a {
        public /* synthetic */ C3439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16882a a(InputStream inputStream) {
            C17542s.j(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C17974j jVar = new C17974j(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C16877v.y(jVar, 10));
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                ((U) it).c();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] s12 = C16877v.s1(arrayList);
            return new C16882a(Arrays.copyOf(s12, s12.length));
        }

        private C3439a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16882a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        C17542s.j(iArr, "numbers");
    }

    public boolean h() {
        return f(f140474h);
    }
}
