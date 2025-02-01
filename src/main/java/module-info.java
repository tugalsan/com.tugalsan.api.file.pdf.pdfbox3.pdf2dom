module com.tugalsan.api.file.pdf.pdfbox3.pdf2dom {
    requires java.desktop;
    requires org.apache.commons.io;
    requires org.apache.fontbox;
    requires org.apache.pdfbox;
    requires org.apache.pdfbox.io;
    requires org.slf4j;
    requires com.tugalsan.api.file.pdf.pdfbox3.pdf2dom.fontverter;
    requires com.tugalsan.api.file.pdf.pdfbox3.pdf2dom.gfxassert;
    requires com.tugalsan.api.unsafe;
    requires com.tugalsan.api.function;
    exports org.fit.pdfdom;
//    exports org.fit.pdfdom.resource;
}
