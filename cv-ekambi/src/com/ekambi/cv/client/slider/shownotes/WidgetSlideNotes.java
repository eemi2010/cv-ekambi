package com.ekambi.cv.client.slider.shownotes;


import com.ekambi.cv.client.slider.slides.Presentable;
import com.ekambi.cv.client.slider.slides.WidgetSlide;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

public class WidgetSlideNotes extends WidgetSlide implements Presentable {

    @UiField
    public Element notes;

    public WidgetSlideNotes(UiBinder<?, ?> uiBinder) {
        super(uiBinder);
        notes.removeFromParent();
    }

    @Override
    public Element getShowNotes() {
        return notes;
    }
}
