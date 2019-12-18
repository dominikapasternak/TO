import java.sql.Connection;

public class SupportFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName){
        Connection con = null;
        switch (dbType){
            case ChatSupport:
                con = ChatSupport.getChatSupportConnection();
                ChatSupport chatSupport = new ChatSupport();
                switch(reportType){
                    case HTML:
                        chatSupport.generateChatSupportHTMLReport(tableName, con);
                        break;
                    case PDF:
                        chatSupport.generateChatSupportPDFReport(tableName, con);
                        break;
                }
                break;
            case AutomaticSupport:
                con = AutomaticSupport.getAutomaticSupportConnection();
                AutomaticSupport automaticSupport = new AutomaticSupport();
                switch(reportType){
                    case HTML:
                        automaticSupport.generateAutomaticSupportHTMLReport(tableName, con);
                        break;
                    case PDF:
                        AutomaticSupport.generateAutomaticSupportPDFReport(tableName, con);
                        break;
                }
                break;
        }

    }

    public static enum DBTypes{
        ChatSupport,AutomaticSupport;
    }

    public static enum ReportTypes{
        HTML,PDF;
    }
}



