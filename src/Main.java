public class Main {
    public static void main(String[] args) {
        TextMessage text1 = new TextMessage("hello jeff", "Cameron",112);
        TextMessage text2 = new TextMessage("goodbye", "Micheal",108);
        TextMessage text3 = new TextMessage("shalom", "Chris",96);
        TextMessageManager messageManager = new TextMessageManager();
        messageManager.addTextMessage(text1);
        messageManager.addTextMessage(text2);
        messageManager.addTextMessage(text3);
        messageManager.printTextByName("Micheal");
    }
}
