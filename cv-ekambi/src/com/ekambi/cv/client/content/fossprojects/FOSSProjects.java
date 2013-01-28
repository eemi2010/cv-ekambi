package com.ekambi.cv.client.content.fossprojects;

import com.ekambi.cv.client.content.CV.Sections;
import com.ekambi.cv.client.content.HeaderChapter;
import com.ekambi.cv.client.slider.slides.ElementSlide;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

public class FOSSProjects extends HeaderChapter {

    @UiTemplate("Title.ui.xml")
    interface Title extends UiBinder<Element, ElementSlide> {
        Title binder = GWT.create(Title.class);
    }

    @UiTemplate("Touch4j.ui.xml")
    interface Touch4j extends UiBinder<Element, ElementSlide> {
        Touch4j binder = GWT.create(Touch4j.class);
    }

    @UiTemplate("Flash4j.ui.xml")
    interface Flash4j extends UiBinder<Element, ElementSlide> {
        Flash4j binder = GWT.create(Flash4j.class);
    }

    @UiTemplate("Titanium4j.ui.xml")
    interface Titanium4j extends UiBinder<Element, ElementSlide> {
        Titanium4j binder = GWT.create(Titanium4j.class);
    }

    @UiTemplate("Ext4j.ui.xml")
    interface Ext4j extends UiBinder<Element, ElementSlide> {
        Ext4j binder = GWT.create(Ext4j.class);
    }

    @Override
    protected void buildSlides() {
        addSlide(Title.binder);
        addSlide(Touch4j.binder);
        addSlide(Flash4j.binder);
        addSlide(Titanium4j.binder);
        addPresentable(new ElementSlide(Ext4j.binder), "Ext4j");
        addSlide(Sections.binder);
    }
}
