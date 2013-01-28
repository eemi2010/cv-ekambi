package com.ekambi.cv.client.content.experience;

import com.ekambi.cv.client.content.CV.Sections;
import com.ekambi.cv.client.content.HeaderChapter;
import com.ekambi.cv.client.slider.slides.ElementSlide;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

public class Experience extends HeaderChapter {

    @UiTemplate("Title.ui.xml")
    interface Title extends UiBinder<Element, ElementSlide> {
        Title binder = GWT.create(Title.class);
    }

    @UiTemplate("NttData.ui.xml")
    interface NttData extends UiBinder<Element, ElementSlide> {
        NttData binder = GWT.create(NttData.class);
    }

    @Override
    protected void buildSlides() {
        addSlide(Title.binder);
        addSlide(NttData.binder);
        addSlide(Sections.binder);
    }
}
