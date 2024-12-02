public class TextMessage {

     private String textMessage;
     private String senderName;
     private int messageSize;

     public TextMessage(String textMessage, String senderName, int messageSize) {
          this.textMessage = textMessage;
          this.senderName = senderName;
          this.messageSize = messageSize;
     }
     public String getTextMessage()
     {
          return textMessage;
     }
     public String getSenderName()
     {
          return senderName;
     }
     public int getMessageSize()
     {
          return messageSize;
     }

     public void setTextMessage(String textMessage)
     {
          this.textMessage = getTextMessage();
     }
     public void setSenderName(String senderName)
     {
          this.senderName = senderName;
     }
     public void setMessageSize(int messageSize)
     {
          this.messageSize = messageSize;
     }
     public void printDetails()
     {
          System.out.println(getTextMessage());
          System.out.println("from " + getSenderName());
          System.out.println("size: " + getMessageSize() + " KB");
     }
     public void printDetailsByName(String senderName){
         if (senderName.equals(getSenderName()))
                  System.out.println(getTextMessage());
     }
}
