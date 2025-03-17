package N1;

import android.text.Editable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\t2\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0016\u0010\rJ \u0010\u0018\u001a\u00020\t2\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00170\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001a\u001a\u00020\t2\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001a\u0010\u0015J0\u0010\u001b\u001a\u00020\t2\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u00170\u0017H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\t2\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u001d0\u001dH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\t2\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00170\u0017H\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\tH\u0001¢\u0006\u0004\b!\u0010\rJ0\u0010\"\u001a\u00020\t2\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u00170\u0017H\u0001¢\u0006\u0004\b\"\u0010\u001cJ7\u0010'\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010\u00172\b\u0010&\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010,¨\u0006-"}, d2 = {"LN1/f;", "Lorg/xml/sax/ContentHandler;", "contentHandler", "Landroid/text/Editable;", "output", "<init>", "(Lorg/xml/sax/ContentHandler;Landroid/text/Editable;)V", "Lorg/xml/sax/Attributes;", "attributes", "LXH/N;", "b", "(Lorg/xml/sax/Attributes;)V", "a", "()V", "", "kotlin.jvm.PlatformType", "p0", "", "p1", "p2", "characters", "([CII)V", "endDocument", "", "endPrefixMapping", "(Ljava/lang/String;)V", "ignorableWhitespace", "processingInstruction", "(Ljava/lang/String;Ljava/lang/String;)V", "Lorg/xml/sax/Locator;", "setDocumentLocator", "(Lorg/xml/sax/Locator;)V", "skippedEntity", "startDocument", "startPrefixMapping", "uri", "localName", "qName", "atts", "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/xml/sax/ContentHandler;", "Landroid/text/Editable;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.f  reason: case insensitive filesystem */
final class C4671f implements ContentHandler {

    /* renamed from: a  reason: collision with root package name */
    private final ContentHandler f9459a;

    /* renamed from: b  reason: collision with root package name */
    private final Editable f9460b;

    public C4671f(ContentHandler contentHandler, Editable editable) {
        this.f9459a = contentHandler;
        this.f9460b = editable;
    }

    private final void a() {
        Editable editable = this.f9460b;
        Object[] spans = editable.getSpans(0, editable.length(), C4672g.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.f9460b.getSpanFlags((C4672g) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4672g gVar = (C4672g) arrayList.get(i10);
            int spanStart = this.f9460b.getSpanStart(gVar);
            int length = this.f9460b.length();
            this.f9460b.removeSpan(gVar);
            if (spanStart != length) {
                this.f9460b.setSpan(gVar, spanStart, length, 33);
            }
        }
    }

    private final void b(Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String localName = attributes.getLocalName(i10);
            String str = "";
            if (localName == null) {
                localName = str;
            }
            String value = attributes.getValue(i10);
            if (value != null) {
                str = value;
            }
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.f9460b.length();
                this.f9460b.setSpan(new C4672g(localName, str), length2, length2, 17);
            }
        }
    }

    public void characters(char[] cArr, int i10, int i11) {
        this.f9459a.characters(cArr, i10, i11);
    }

    public void endDocument() {
        this.f9459a.endDocument();
    }

    public void endElement(String str, String str2, String str3) {
        if (C17542s.e(str2, "annotation")) {
            a();
        } else {
            this.f9459a.endElement(str, str2, str3);
        }
    }

    public void endPrefixMapping(String str) {
        this.f9459a.endPrefixMapping(str);
    }

    public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f9459a.ignorableWhitespace(cArr, i10, i11);
    }

    public void processingInstruction(String str, String str2) {
        this.f9459a.processingInstruction(str, str2);
    }

    public void setDocumentLocator(Locator locator) {
        this.f9459a.setDocumentLocator(locator);
    }

    public void skippedEntity(String str) {
        this.f9459a.skippedEntity(str);
    }

    public void startDocument() {
        this.f9459a.startDocument();
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (!C17542s.e(str2, "annotation")) {
            this.f9459a.startElement(str, str2, str3, attributes);
        } else if (attributes != null) {
            b(attributes);
        }
    }

    public void startPrefixMapping(String str, String str2) {
        this.f9459a.startPrefixMapping(str, str2);
    }
}
