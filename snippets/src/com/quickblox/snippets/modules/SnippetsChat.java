package com.quickblox.snippets.modules;

import android.content.Context;
import android.widget.Toast;
import com.quickblox.snippets.Snippet;
import com.quickblox.snippets.Snippets;
import com.quickblox.module.chat.QBChat;

/**
 * User: Oleg Soroka
 * Date: 11.10.12
 * Time: 17:01
 */
public class SnippetsChat extends Snippets {

    public SnippetsChat(Context context) {
        super(context);

        snippets.add(getChatLogin);
        snippets.add(comingSoon);
    }

    Snippet getChatLogin = new Snippet("get chat login") {
        @Override
        public void execute() {
            int userId = SnippetsAuth.currentUserId;
            String userChatLogin = QBChat.getChatLoginFull(userId);
            String message = String.format("Login for QuickBlox chat for user %s is '%s'",
                    userId, userChatLogin);
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            System.out.println(">>> " + message);
        }
    };

    Snippet comingSoon = new Snippet("coming soon...", "detailed Chat sample coming soon...") {
        @Override
        public void execute() {
            Toast.makeText(context, "detailed Chat sample coming soon...", Toast.LENGTH_SHORT).show();
        }
    };
}