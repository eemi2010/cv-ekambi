package com.ekambi.cv.client.slider.shownotes;


import com.ekambi.cv.client.slider.slides.Presentable;
import com.ekambi.cv.client.slider.window.ChildWindow;
import com.google.gwt.dom.client.Element;

public class ShowNotesSender {

    public static final String LISTENER_NAME = "showNotes";

    private final ChildWindow childWindow;

    public ShowNotesSender(ChildWindow childWindow) {
        this.childWindow = childWindow;
    }

    public void sendShowNotes(Presentable slide) {
        if (slide != null && childWindow != null) {
            Element showNotesWidget = slide.getShowNotes();
            String showNotesHTML;
            if (showNotesWidget != null) {
                showNotesHTML = showNotesWidget.getInnerHTML();
            } else {
                showNotesHTML = "<div>Pas de notes</div>";
            }

            childWindow.sendMessage(LISTENER_NAME, showNotesHTML);
        }
    }

}
