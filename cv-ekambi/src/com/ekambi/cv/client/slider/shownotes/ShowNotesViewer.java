package com.ekambi.cv.client.slider.shownotes;


import com.ekambi.cv.client.slider.Resources;
import com.ekambi.cv.client.slider.window.WindowHelper;
import com.ekambi.cv.client.slider.window.WindowMessageListener;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class ShowNotesViewer {

    public void load() {
        Window.setTitle("Show notes");
        Resources.instance.shownotes().ensureInjected();
        RootPanel rootPanel = RootPanel.get();
        final HTML html = new HTML();
        rootPanel.add(html);

        html.setHTML("<div>Waiting for show notes</div>");

        WindowHelper.registerListener(ShowNotesSender.LISTENER_NAME, new WindowMessageListener<String>() {
            @Override
            public void onMessage(String message) {
                html.setHTML(message);
            }
        });
        WindowHelper.sendMessage("childLoaded", null);
    }

}
