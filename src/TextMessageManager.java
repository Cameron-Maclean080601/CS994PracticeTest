import java.util.ArrayList;

public class TextMessageManager {
    private ArrayList<TextMessage> TextMessages;

    public TextMessageManager() {
        TextMessages = new ArrayList<>();
    }
    public void addTextMessage(TextMessage TextMessage) {
        if (TextMessages.contains(TextMessage)) {
            System.out.println("message already within array");
        }
        else {
            TextMessages.add(TextMessage);
        }
    }
    public void replaceTextMessageAtIndex(TextMessage TextMessage, int index) {
        if (TextMessages.contains(TextMessage)) {
            System.out.println("message already within array");
        }
        else if (index < 0 || index > TextMessages.size()) {
            System.out.println("index out of bounds");
        }
        else
        {
            TextMessages.set(index, TextMessage);
            System.out.println("message replaced");
        }
    }

    public boolean textMessagesEmpty(){
        return TextMessages.isEmpty();
    }

    public void printTextMessages() {
        int i = 0;
        while (i < TextMessages.size()) {
            TextMessage obj = TextMessages.get(i);
            obj.printDetails();
            i ++;
        }
    }

    public void printTextByName(String searchName){
        for (TextMessage obj : TextMessages) {
            if (searchName.equals(obj.getSenderName())||  obj.getMessageSize() < 100)
            {
                obj.printDetails();
            }
            else
                continue;
        }
    }
}
