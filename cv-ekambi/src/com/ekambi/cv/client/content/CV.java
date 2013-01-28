package com.ekambi.cv.client.content;


import java.util.List;

import com.alexgorbatchev.syntaxhighlighter.client.Brush;
import com.alexgorbatchev.syntaxhighlighter.client.Brush.Brushes;
import com.ekambi.cv.client.content.contact.Contact;
import com.ekambi.cv.client.content.education.Education;
import com.ekambi.cv.client.content.experience.Experience;
import com.ekambi.cv.client.content.fossprojects.FOSSProjects;
import com.ekambi.cv.client.content.skills.Skills;
import com.ekambi.cv.client.content.welcome.Welcome;
import com.ekambi.cv.client.slider.PresentationEntryPoint;
import com.ekambi.cv.client.slider.slides.ChapterHolder;
import com.ekambi.cv.client.slider.slides.ElementSlide;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

public class CV extends PresentationEntryPoint {

    @UiTemplate("Sections.ui.xml")
    public interface Sections extends UiBinder<Element, ElementSlide> {
        Sections binder = GWT.create(Sections.class);
    }

    @Override
    public void loadChapters(ChapterHolder holder) {
        holder.addChapter(new Welcome());
        holder.addChapter(new Experience());
        holder.addChapter(new FOSSProjects());
        holder.addChapter(new Skills());
        holder.addChapter(new Education());
        holder.addChapter(new Contact());
    }

    @Override
    public void definePreloadedBrushes(List<Brush> brushes) {
        brushes.add(Brushes.XML());
        brushes.add(Brushes.JAVA());
    }

}
