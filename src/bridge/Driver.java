package bridge;

import bridge.media.ImageMedia;
import bridge.media.TextMedia;
import bridge.media.VideoMedia;
import bridge.message.ImageMessage;
import bridge.message.TextMessage;
import bridge.message.VideoMessage;
import bridge.messaging_app.FacebookMessagingApp;
import bridge.messaging_app.TelegramMessagingApp;
import bridge.messaging_app.WhatsAppMessagingApp;

public class Driver {
    public static void main(String[] args) {
        WhatsAppMessagingApp whatsapp = new WhatsAppMessagingApp();
        FacebookMessagingApp facebook = new FacebookMessagingApp();
        TelegramMessagingApp telegram = new TelegramMessagingApp();

        TextMessage whatsAppText = new TextMessage();
        whatsAppText.setMessagingApp(whatsapp);
        whatsAppText.setContent(new TextMedia("Hey John, how are you doing?"));
        whatsAppText.sendMessage();

        VideoMessage facebookVideo = new VideoMessage();
        facebookVideo.setMessagingApp(facebook);
        facebookVideo.setContent(new VideoMedia());
        facebookVideo.sendMessage();

        ImageMessage telegramImage = new ImageMessage();
        telegramImage.setMessagingApp(telegram);
        telegramImage.setContent(new ImageMedia());
        telegramImage.sendMessage();

        ImageMessage facebookImage = new ImageMessage();
        facebookImage.setMessagingApp(facebook);
        facebookImage.setContent(new ImageMedia());
        facebookImage.sendMessage();
    }
}
