package com.ekambi.cv.client.content.education;

import com.ekambi.cv.client.content.CV.Sections;
import com.ekambi.cv.client.content.HeaderChapter;
import com.ekambi.cv.client.slider.slides.ElementSlide;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

public class Education extends HeaderChapter {

    @UiTemplate("Title.ui.xml")
    interface Title extends UiBinder<Element, ElementSlide> {
        Title binder = GWT.create(Title.class);
    }

    @UiTemplate("WilhelmBuechner.ui.xml")
    interface WilhelmBuechner extends UiBinder<Element, ElementSlide> {
        WilhelmBuechner binder = GWT.create(WilhelmBuechner.class);
    }

    @UiTemplate("TUM.ui.xml")
    interface TUM extends UiBinder<Element, ElementSlide> {
        TUM binder = GWT.create(TUM.class);
    }

    @UiTemplate("CAS.ui.xml")
    interface CAS extends UiBinder<Element, ElementSlide> {
        CAS binder = GWT.create(CAS.class);
    }

    @Override
    protected void buildSlides() {
        addSlide(Title.binder);
        addSlide(WilhelmBuechner.binder);
        addSlide(TUM.binder);
        addSlide(CAS.binder);
        addSlide(Sections.binder);
    }
}
