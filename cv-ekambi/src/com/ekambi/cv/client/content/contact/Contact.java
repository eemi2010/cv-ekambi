package com.ekambi.cv.client.content.contact;


import com.ekambi.cv.client.content.HeaderChapter;
import com.ekambi.cv.client.content.CV.Sections;
import com.ekambi.cv.client.slider.slides.ElementSlide;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

public class Contact extends HeaderChapter {

    @UiTemplate("ContactMe.ui.xml")
    interface ContactMe extends UiBinder<Element, ElementSlide> {
        ContactMe binder = GWT.create(ContactMe.class);
    }

    @Override
    protected void buildSlides() {
        addSlide(ContactMe.binder);
        addSlide(Sections.binder);
    }
}
