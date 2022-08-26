package User;

import Admin.Randomtokens;
import com.itextpdf.barcodes.BarcodeQRCode;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.xobject.PdfFormXObject;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.HorizontalAlignment;
import com.itextpdf.layout.properties.TextAlignment;

import java.io.IOException;


public class TicketGenerator {
    private String name;
    private String userID;
    private String email;
    private String contactInfo;
    private String token;
    private String path;

    private String matchInfo;

    public TicketGenerator() {

    }

    public TicketGenerator(String name, String userID, String email, String contactInfo, String token, String path) {
        this.name = name;
        this.userID = userID;
        this.email = email;
        this.contactInfo = contactInfo;
        this.token = token;
        this.path = path;
    }

    public String getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(String matchInfo) {
        this.matchInfo = matchInfo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void generatePDF() {


        Randomtokens randomtokens = new Randomtokens();
        String randToken = randomtokens.getAlphaNumericString();
        String nPath = path + "/" + randToken + ".pdf";
        try {
            PdfWriter pdfWriter = new PdfWriter(nPath);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            Document doc = new Document(pdfDocument);
            doc.setMargins(0, 0, 0, 0);
            pdfDocument.setDefaultPageSize(PageSize.A5);
            ImageData coverData = ImageDataFactory.create("Images/fifa22_banner_1500x500.jpg");
            Image bannerPic = new Image(coverData);
            PdfFont times = PdfFontFactory.createFont("Fonts/timesnewroman.ttf");
            PdfFont vog = PdfFontFactory.createFont("Fonts/Vogue.ttf");
            ImageData imageData = ImageDataFactory.create("Images/fifaLogo22.png");
            Image waterMark = new Image(imageData);
            waterMark.setFixedPosition(pdfDocument.getDefaultPageSize().getWidth() / 2 - 100, pdfDocument.getDefaultPageSize().getHeight() / 2 - 119);
            waterMark.setOpacity(.25f);
            doc.add(bannerPic);
            String qrValues = name + "\n" + userID + "\n" + email + "\n" + contactInfo + "\n" + getToken() + "\n";
            BarcodeQRCode qr = new BarcodeQRCode(qrValues);
            PdfFormXObject qrCode = qr.createFormXObject(ColorConstants.BLACK, pdfDocument);
            Image qrImg = new Image(qrCode).setWidth(80).setHorizontalAlignment(HorizontalAlignment.RIGHT).setMargins(10, 5, 0, 0);
            doc.add(qrImg);
            doc.add(waterMark);
            Paragraph p1 = new Paragraph().setFont(vog).setTextAlignment(TextAlignment.CENTER);
            p1.add(getMatchInfo()).setFontSize(20);
            Paragraph p2 = new Paragraph().setFontSize(12).setFont(times).setPaddingLeft(20).setHorizontalAlignment(HorizontalAlignment.LEFT);
            p2.add("\n\tName\t : \t" + name);
            p2.add("\n\tUser ID\t : \t" + userID);
            p2.add("\n\tEmail\t : \t" + email);
            p2.add("\n\tContact No\t : \t" + contactInfo);
            p2.add("\n\tToken No\t : \t" + getToken());

            doc.add(p1);
            doc.add(p2);
            doc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
