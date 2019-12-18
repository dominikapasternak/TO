import java.sql.Connection;

public class FacadeTest {

    public static void main(String[] args) {
        String tableName="Someone";


        Connection con = ChatSupport.getChatSupportConnection();
        ChatSupport chatSupport = new ChatSupport();
        chatSupport.generateChatSupportHTMLReport(tableName, con);

        Connection con1 = AutomaticSupport.getAutomaticSupportConnection();
        AutomaticSupport automaticSupport = new AutomaticSupport();
        automaticSupport.generateAutomaticSupportPDFReport(tableName, con1);


        SupportFacade.generateReport(SupportFacade.DBTypes.ChatSupport, SupportFacade.ReportTypes.HTML, tableName);
        SupportFacade.generateReport(SupportFacade.DBTypes.AutomaticSupport, SupportFacade.ReportTypes.PDF, tableName);
    }

}






