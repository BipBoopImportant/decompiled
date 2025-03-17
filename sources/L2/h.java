package l2;

public class h extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final String f25477a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25478b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25479c;

    public h(String str, C5519c cVar) {
        super(str);
        this.f25477a = str;
        if (cVar != null) {
            this.f25479c = cVar.A();
            this.f25478b = cVar.y();
            return;
        }
        this.f25479c = "unknown";
        this.f25478b = 0;
    }

    public String a() {
        return this.f25477a + " (" + this.f25479c + " at line " + this.f25478b + ")";
    }

    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
